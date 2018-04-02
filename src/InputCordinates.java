import java.util.Scanner;

public class InputCordinates {

	static Scanner sc = new Scanner(System.in);
	static MakeNote objectNote = new MakeNote();
	static int stepNumber;
	static SetGetCordinates objectSetGetCordinates;
	static boolean programRunFirstTime = true;
	static String entry;
	static int x;
	static int y;

	public static void enterCordinates() {

		if (programRunFirstTime) {
			System.out.println("<<<<<----WELCOME,---What cordinate are you at now??---->>>>>");
			System.out.println("Enter the X-Cordinates :\t ");
			int x = sc.nextInt();

			System.out.println("Enter the Y-Cordinates :\t ");
			int y = sc.nextInt();
			entry = Integer.toString(x) + "," + Integer.toString(y);
			objectSetGetCordinates = new SetGetCordinates(x, y);

		} else {
			System.out.println("------------NEXT------------------");
			System.out.println("Enter the X-Cordinates you would like to move to :\t ");
			x = sc.nextInt();

			System.out.println("Enter the Y-Cordinates you would like to move to  :\t ");
			y = sc.nextInt();

			entry = Integer.toString(x) + "," + Integer.toString(y);
			objectSetGetCordinates = new SetGetCordinates(x, y);

		}

	}

	public static void direction() {
		System.out.println("------------NEXT------------------");
		System.out.println("Enter the x coordinate of the position you’d like to find the direction to: \t ");
		x = sc.nextInt();

		System.out.println("Enter the y coordinate of the position you’d like to find the direction to: \t ");
		y = sc.nextInt();

		int a=x-objectSetGetCordinates.getXCor();
		int b=y-objectSetGetCordinates.getYCor();
		
		//System.out.println(a+" "+b);
		String direction="";
		if(a<0) {
			direction="West ";
		}
		if(a>0) {
			direction+="East ";
		}if(b<0) {
			direction+="South ";
		}if(b>0){
			direction += "North ";
		}
		
		System.out.println("To travel from ("+objectSetGetCordinates.getXCor()+","+objectSetGetCordinates.getYCor()+") to ("+x+","+y+") you need to move: "+direction);
		
		entry = Integer.toString(x) + "," + Integer.toString(y);
		objectSetGetCordinates = new SetGetCordinates(x, y);
		
		
		
	
}

	public static void main(String[] args) {
		/*
		 * int[][] array=new int[][] {}; System.out.println(array.length);
		 */
		if (programRunFirstTime) {
			enterCordinates();
			System.out.printf("Okay, you are at position (%s,%s), what would you like to do now??",
					objectSetGetCordinates.getXCor(), objectSetGetCordinates.getYCor());
			programRunFirstTime = false;
		} else {
			System.out.printf("Okay, you have moved to the position (%s,%s), what would you like to do now??",
					objectSetGetCordinates.getXCor(), objectSetGetCordinates.getYCor());

		}

		System.out.println("\n\t 1: Move to a new Position");
		System.out.println("\t 2: Calculate the direction of a new position");
		System.out.println("\t 3: Make a note about the current position");
		System.out.println("\t 4: Retrace your steps");
		System.out.println("\t 5: Exit");

		stepNumber = sc.nextInt();
		
		if( stepNumber>5 || stepNumber<1 ) {
		
			System.out.println("!!!!!***-----Enter in between 1-5 inclusively***---!!!!!");
			InputCordinates.main(null);
		}

		if (stepNumber == 1) {
			/*
			 * if (objectSetGetCordinates.arraylist.contains(entry) && alreadyEntered) {
			 * System.out.println("Already visited"); }else {
			 */
			enterCordinates();
			InputCordinates.main(null);
			// }

		} else if (stepNumber == 2) {
			// direction of new position
			direction();
			// System.out.println("To travel to from () to (), you need to move: ");
			InputCordinates.main(null);

		} else if (stepNumber == 3) {
			objectNote.takeNote();

		} else if (stepNumber == 4) {

			objectSetGetCordinates.getArrayRetracePosition();
			InputCordinates.main(null);
			/*
			 * for(String a:objectSetGetCordinates.getArrayRetracePosition()) {
			 * 
			 * }
			 */

		} else if (stepNumber == 5) {
			System.exit(0);
		}

	}

}
