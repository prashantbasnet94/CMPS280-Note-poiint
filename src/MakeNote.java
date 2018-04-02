import java.util.ArrayList;
import java.util.Scanner;

public class MakeNote {
	String note;
	SetGetCordinates objectSetGetCordinates = new SetGetCordinates();
	InputCordinates objectInputCordinates = new InputCordinates();
	ArrayList<String> arrayList = new ArrayList<String>();

	public void takeNote() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a note for this position : \t");
		note =  "NOTE:"+ sc.nextLine();

		objectSetGetCordinates.arraylist.set(objectSetGetCordinates.arraylist.indexOf(objectInputCordinates.entry),objectSetGetCordinates.arraylist.get(objectSetGetCordinates.arraylist.indexOf(objectInputCordinates.entry))+"         "+note);

		InputCordinates.main(null);

	}

}
