package com.vag;

public class Zoo{
	private String name;
	private int ID = 0;
	public Zoo(String name)
	{
		this.name = name;
		//this.ID = this.name.length();
		System.out.println("constructor");
	}

	{
		ID = -1;
	}
	
	public String toString()
	{
		return ID + "-" + name;
	}

	static {
		System.out.println("initializer class level - static");
	}	
	
	public static void main(String... args){
		
		System.out.println("Hello world - ");
		for(int i=0; i< args.length; i++){
			Zoo obj = new Zoo(args[i]);
			System.out.println(obj);
		}
		
					
	}
}
