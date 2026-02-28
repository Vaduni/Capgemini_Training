package capgemini;

import com.dk.String1;

class ChildThread extends Thread{
			public void run() {
				for(int i=1;i<=100;i++) {
					System.out.println("child :" + i);
				}
			}
		}

		//runnable interface
		class ChildThread2 implements Runnable{
			@Override
			public void run() {
				for(int i=1;i<=100;i++) {
					System.out.println("child2 :" + i);
				}
			}
		}
		public class ThreadingBasic {

			public static void main(String1[] args) {
				// TODO Auto-generated method stub
				ChildThread t = new ChildThread();
				t.start(); //will execute run in new thread and return at the same time
				ChildThread2 obj = new ChildThread2();
				Thread t2 = new Thread(obj);
				t2.start();
				for(int i=1;i<=100;i++) {
					System.out.println("main :" + i);
				}
			
	}

}
