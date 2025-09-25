package com.tns.thread;

public class MainThreaddemo {

	public static void main(String[] args) {
		Threaddemo d1=new Threaddemo();
		d1.setPriority(1);
        d1.start();
        Threaddemo d2=new Threaddemo();
        d2.setPriority(10);
        d2.start();
	}

}
