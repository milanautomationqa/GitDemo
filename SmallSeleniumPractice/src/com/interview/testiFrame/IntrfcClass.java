package com.interview.testiFrame;

public interface IntrfcClass {
	
	final int a =10;
	static int b=15;
	
	public static void methodC()
	{
		System.out.println("This is in MethodC: "+"This is new in Java 1.8");
	}
	
	public default void methodD()
	{
		System.out.println("This is in MethodD: "+"This is also new in Java 1.8");
	}
	
	public void methodE();
	

}
