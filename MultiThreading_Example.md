# Java-Programs

package threadclasses;

public class Hello extends Thread {
	
	public Hello()
	{
		//start();  //runnable
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("hello");
			
			try
			{
				sleep(1000); //stop/pause
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hello h=new Hello();
	      h.start();
	}

}
