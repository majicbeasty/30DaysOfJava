import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String fileName = "palindrome.txt";
		Scanner in = new Scanner(System.in);
		int check = 0;
		
		try {
			PrintWriter outputStream = new PrintWriter(fileName);
			for(int row = 0; row < 64; row++){
				System.out.println("Enter any word you'd like or enter 'exit' to exit.");
				String word = in.nextLine();
				
				if(word.equals("exit")){
					break;
				}
				else{
					outputStream.println(word);
				}
			}
			outputStream.close();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
		try{
			in = new Scanner(new File("palindrome.txt"));
		}
		catch(Exception e){
			System.out.println("could not find file.");
		}
		
		while(in.hasNext()){				
				String a = in.next();
				System.out.printf("%s\n", a);
				int x = a.length();
				for(int i = 0; i < (x/2); i++){
					if(a.charAt(i) != a.charAt(x - i - 1)){
						check = 0;						
					}
					else{
						check = 1;						
					}
				}
				if(check == 1){
					System.out.printf("%s is a palindrome! \n", a);
				}
				else{
					System.out.printf("%s is not a palindrome. \n", a);
				}
		}		
		in.close();
	}	

}
