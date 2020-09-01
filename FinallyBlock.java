package com.practice.test;

public class FinallBlock {

	public static void main(String[] args) {
		FinallBlock obj = new FinallBlock();
		
		int test = obj.tryFinallyTest();
		
		System.out.println("Returned value  : "+test);

	}
	
	public int tryFinallyTest(){
		int test = 10;
		
		try {
			test  = 10;
			test = test/0;
		}catch(Exception e) {
			System.out.println("Inside catch");
			test = 10+10;
			return test;
		}finally {
			test = 10+10+10;
			System.out.println("Fianlly Block : " + test);
		}
		
		return test;
	}

}

/*
Output::

Inside catch
Fianlly Block : 30
Returned value  : 20

*/

