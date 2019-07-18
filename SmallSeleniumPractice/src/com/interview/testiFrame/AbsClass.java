package com.interview.testiFrame;

public abstract class AbsClass implements IntrfcClass{
	
	int a;
	final int b=10;
	static String arg;

	
	public void methodA()
	{
		
	}
	
	public abstract void methodB();
	
	public static void methodF()
	{
		System.out.println("This is in MethodF: "+"This is new in Java 1.8");
	}

}
