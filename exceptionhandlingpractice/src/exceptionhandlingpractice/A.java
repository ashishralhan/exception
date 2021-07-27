package exceptionhandlingpractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.NoSuchElementException;

public class A {
	private void syso() {
		// TODO Auto-generated method stub
           System.out.println("ashish");
	}
	
	/*public void getdata() {
		
		try { 
		
       File f = new File("E:\\texting23.txt");
       FileReader fr = new FileReader(f);
		
		}
		catch(FileNotFoundException e )
		{
			
			System.out.println("printlogs");
			
		}
		
		catch(NoSuchElementException e )
		{
			
			System.out.println("printlogs");
			System.out.println("snapshot");
		}
		
		catch(Exception e )
		{
			
			System.out.println("printlogs");
			System.out.println("snapshot");
			System.out.println("email");
			
		}
		
		finally
		{
			System.out.println("endtask");
		}
	}*/
	
	public void getdata(int a ) {
		
		if(a<20){
			
			throw (new NoSuchElementException());
			
		}
	}
}
