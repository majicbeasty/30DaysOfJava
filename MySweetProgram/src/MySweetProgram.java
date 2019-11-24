import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) { //the identifier for this method is main (String[] args is a parameter and return type is void)
		System.out.println("Hello World");
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		if(s.equals("Jake")){
			System.out.println("Hey Jake");
		} else if(s.equals("Sally")){
			System.out.println("Hey Sally");		
		} else {
			System.out.println("You're not welcome here");
		}
		
		/*int i = 0;//initialization (ICU)
		while (i < 10){//condition
			System.out.println("i is: " + i);
			i++; // update
		}*/
		for(int i = 0; i < 10; i++){
			
		}
		in.close();
	}
}
