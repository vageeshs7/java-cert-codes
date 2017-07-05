package com.vag;

public class Zoo{
	public static void main(String... args){
		System.out.println("Hello world - " + args);
		for(int i=0; i< args.length; i++)
			System.out.println(args[i]);	
	}
}
