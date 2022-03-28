package com.java.training;

class Storage

{

	private int x;

	public Storage(int X) {
		x = X;
	}

	public int GetX() {
		return (x);
	}

	public Storage(Storage s) {
		this.x = s.GetX();
	}

}

class Printer implements Runnable

{

	private Storage storage;

	Printer(Storage s) {
		storage = new Storage(s);
	}

	public void run()

	{

		System.out.println(storage.GetX());

	}

}

class Counter implements Runnable

{

	private int N;

	public Counter(int n) {
		N = n;
	}

	public int GetN() {
		return (N);
	}

	public void run()

	{

		for (int iLoop = 1; iLoop <= N; iLoop++)

		{

			Storage storage = new Storage(iLoop);

			Printer printer = new Printer(storage);

			Thread.yield();

			printer.run();

		}

	}

}

class ThreadCounter

{

	public static void main(String args[])

	{

		Counter counter = new Counter(25);

		counter.run();

	}

}

