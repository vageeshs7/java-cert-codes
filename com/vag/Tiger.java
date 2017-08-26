package com.vag;

class Test{
	private int x;
	public String status()
	{
		return "success";
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
