package OOPs;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class PS {
	
		@Test
		public void doThis () {
			
			System.out.println("I am from Parent");
		}
		
		@BeforeTest
		public void beforeRun() {
			
			System.out.println("Run me First BeforeTest ");
		}
		@AfterTest
		public void afterRun(){
			System.out.println("Run me First AfterTest ");
		}
}
