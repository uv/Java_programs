package com.thread;

public class ThreadExample extends Thread {
	public synchronized void  table(int i)
	{
		for(int j=1;j<11;j++)
		{
			System.out.println(i*j);
			try {
				currentThread();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ThreadExample te=new ThreadExample();
		Thread1 t=new Thread1(te);
		Thread2 t1=new Thread2(te);
		t.start();
		t1.start();
	}
}
 class Thread1 extends Thread{
	 ThreadExample te;
		public Thread1(ThreadExample te)
		{
			this.te=te;
		}
		public void run()
		{
			te.table(10);
		}
	}

 class Thread2 extends Thread{
	 ThreadExample te;
		public Thread2(ThreadExample te)
		{
			this.te=te;
		}
		public void run()
		{
			te.table(20);
		}
	}