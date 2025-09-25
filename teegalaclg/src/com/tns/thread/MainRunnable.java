package com.tns.thread;

public class MainRunnable {

	public static void main(String[] args) {
		Runnableinf r1=new Runnableinf();
	   Runnableinf r2=new Runnableinf();
	   Thread t1=new Thread(r1);
	   Thread t2=new Thread(r2);
        t1.setPriority(1);
        t1.start();
       t1.setPriority(10);
        t2.start();
	}
	}

