package OOPs;

import org.testng.annotations.BeforeTest;

public class PS1 extends PS {
	
//	ps1 child class
//	ps parent class
	@BeforeTest
	
	public void testRun() {
		PS2 ps2 =new PS2(5); //Parameterized Constructor for ps2 class
		doThis();
		int a = 5;
		System.out.println(ps2.increment());	
		System.out.println(ps2.decrement());
		System.out.println(ps2.multipletwo());
		System.out.println(ps2.multiplethree());
		
		
		
	}
}
