package scp.rohit.threding;

public class MyThread implements Runnable{
	

	public void run() {
		
		for(int i=0;i<=10;i++){
			
			System.out.println(i);
		}

	
		}

	
	public static void main(String[] args) throws InterruptedException {
		MyThread t=new MyThread();
		
		Thread t1= new Thread(t);
		Thread t2=new Thread(t);
		
		t1.start();
		t2.start();
		
		t1.sleep(1000);
		t2.sleep(100);
	
		
	}	
		
		
	}
	
	

 

	
	
	


