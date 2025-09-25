package com.tns.thread;

public class PriorityDemo extends Thread{
public void run() {
	System.out.println("The thread is: "+Thread.currentThread().getName());
	System.out.println("The thread priority is: "+Thread.currentThread().getPriority());
	
}

}

