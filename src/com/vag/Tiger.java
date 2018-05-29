package com.vag;
import java.util.Random;

class Test{
	private int x;
	
	public String status()
	{
		Random r = new Random();
		return "success " + r.nextInt(10);
	}
}

public class Tiger
{
	public static void main(String[] args)
	{
		Test o = new Test();
		System.out.println(o.status());
	}
}
