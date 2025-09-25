package com.tns.thread;

public class Runnableinf implements Runnable {

	
	public void run() {
		for(int i=1;i<=10;i++) {
		try {
		System.out.println("this is thread");
		System.out.println("Thread.CurrentThread");
		Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}

}
