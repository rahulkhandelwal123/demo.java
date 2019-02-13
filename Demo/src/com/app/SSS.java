package com.app;

public class SSS 
{
  void add()
  {
	int a=10;
	int b=20;
	System.out.println(a+b);
	min();
  }
  void min()
  {
	  int a=20;
	   int b=10;
	System.out.println(a-b);	
  }
  
  public static void main(String[] args)
  {
	SSS s=new SSS();
	s.add();
}
}