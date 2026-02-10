package lambdEexpressions;

public class Lambda5_Thread {

	public static void main(String[] args) {
		//old way 
		Runnable r=new Runnable() {public void run() {System.out.println("Old");}};
		Runnable task=()->{
			for(int i=1;i<=3;i++) {
				System.out.println("Song "+i+" playing...");
			}
		};
		Thread t=new Thread(task);
		r.run();
		t.start();
	}

}
