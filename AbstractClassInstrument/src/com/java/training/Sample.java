package com.java.training;


	class Piano extends Instrument
	{
	public void Play()
	{
	System.out.println("Piano is playing tan tan tan tan.......");
	}
	}
	class Flute extends Instrument
	{
	public void Play()
	{
	System.out.println("Flute is playing toot toot toot toot.......");
	}
	}
	class Guitar extends Instrument
	{
	public void Play()
	{
	System.out.println("Guitar is playing tin tin tin....... ");
	}
	}
	public class Sample
	{
	public static void main(String[] args)
	{
	Instrument inst[] = new Instrument[10];
	inst[0] = new Piano();
	inst[1] = new Flute();
	inst[2] = new Guitar();
	inst[3] = new Piano();
	inst[4] = new Flute();
	inst[5] = new Guitar();
	inst[6] = new Piano();
	inst[7] = new Flute();
	inst[8] = new Guitar();
	inst[9] = new Piano();
	for ( int i = 0 ; i < inst.length ; i++ )
	{
	if ( inst[i] instanceof Piano )
	{
	System.out.println("It is Piano");
	inst[i].Play();
	}
	if ( inst[i] instanceof Flute )
	{
	System.out.println("It is Flute");
	inst[i].Play();
	}
	if ( inst[i] instanceof Guitar )
	{
	System.out.println("It is Guitar");
	inst[i].Play();
	}
	}
	}
	}
	    

