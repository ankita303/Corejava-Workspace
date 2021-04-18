package com.capg.ank.application4;

public class SubjectDetails {

	static 
	{
		System.out.println("...See your Marks...");
	}
	SubjectDetails()
	{
		System.out.println("Mathematics, English");
	}
	SubjectDetails(int a,int b)
	{
		int c=a+b;
		System.out.println("Total marks: "+c);
		System.out.println("Mathematics: "+a);
		System.out.println("English: "+b);
	}
	public final static void getRemarks()
	{
		System.out.println("Well Done Keep it up.");
	}
}
