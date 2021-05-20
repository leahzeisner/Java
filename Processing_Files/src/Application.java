import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Application {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter some text: ");
		String enteredText = input.nextLine();
		System.out.println(enteredText);
		
		
		File file = new File("myfile.txt");
		Scanner fileInput;
		try {
			fileInput = new Scanner(file);
			
			while (fileInput.hasNextLine()) {
				String line = fileInput.nextLine();
				System.out.println(line);
			}
			fileInput.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Error: File Not Found.");
		}
		
		
		MyFileUtils myUtil = new MyFileUtils();
		try {
			System.out.println(myUtil.subtractTenFromLargerNum(15));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
