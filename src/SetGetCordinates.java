import java.util.ArrayList;
import java.util.Scanner;

public class SetGetCordinates {
	
	static String entry;
	private int xCor;
	private int yCor;
	static ArrayList<String> arraylist= new ArrayList<String>();
	
	
	public SetGetCordinates() {
		
	}

	public SetGetCordinates(int xCor, int yCor) {
		setXCor(xCor);
		setYCor(yCor);
		setArrayRetracePosition(xCor, yCor);
	}

	public void setXCor(int xCor) {
		this.xCor = xCor;
	}

	public void setYCor(int yCor) {
		this.yCor = yCor;
	}

	public int getXCor() {
		return xCor;
	}

	public int getYCor() {
		return yCor;
	}

	void setArrayRetracePosition(int a, int b) {
	

		String positions = Integer.toString(a) + "," + Integer.toString(b);
	
		arraylist.add(positions);
	
	
		
		
		 
	}

	public void getArrayRetracePosition() {
		
		
		 for(String a: arraylist) {
			System.out.println(a);
		 }
		 
	 }

	public int[] array() {
		int[] a = new int[] { xCor, yCor };
		return a;
		/*
		 * String.format("%s,%s", getXCor(),getYCor());
		 */
	}

}
