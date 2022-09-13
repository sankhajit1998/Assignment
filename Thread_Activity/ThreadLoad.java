package com.lab1;
/*
@Author Sankhajit Roy
*/

import java.util.ArrayList;

public class ThreadLoad implements Runnable {  // main class
	public void run() {   // run() method
		// created a ArrayList object
		ArrayList<Integer> numbers = new ArrayList<Integer>(1000000);
		// using loop to add thread numbers
		for (int i = 0; i <= 1000000; i++)
		{
		   numbers.add(i);
		   System.out.println(numbers.get(i));
		}
		System.out.println("Time taken in ms:"+System.currentTimeMillis());
	}

	public static void main(String[] args) {    // main method
		// created an object
		Runnable r= new ThreadLoad();
		Thread t=new Thread(r,"First Thread");
		// invoked the run method
		t.start(); 
		String s = t.getName();   // getting the thread name
		System.out.println(s);	
		}
	
	}

