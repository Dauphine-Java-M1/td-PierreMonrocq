package fr.dauphine.ja.monrocqpierre.threads;

public class ThreadTest {
	
	static int i=0;
	static final Object monitor = new Object();
	
	public static Runnable test(final int _id) {
		
		int iteration = 0;
		
		return new Runnable() {
			
			 int id = _id;
			
			
			public void run() {
				boolean flag;
				while(i<10000) {
					synchronized (monitor) {
						if(i<10000) {
							i++;
							flag = true;
						}else return;
					}
						if(flag) {
							System.out.println(i);
						}
						flag = false;
					}
				
				
			
				
			}
			
		};
		
	}
	

	
	public static void main(String[] args) {
		Thread t1 =  new Thread(test(1));
		Thread t2 =  new Thread(test(2));
		
		t1.start();
		t2.start();
	}

}
