import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;


public class Test {

	public static void main(String[] args) throws IOException {
		FileEncoder61722 a = new FileEncoder61722();

		OutputStream inOut = new FileOutputStream("C:/Users/Nick/Desktop/SDA_Test/in.txt");
		for (int i = 0; i < 256; i++) {
			inOut.write(i);
		}
		LinkedList<Character> key = new LinkedList<Character>();
		LinkedList<Character> keyOne = new LinkedList<Character>();
		for (int i = 0; i < 256 ; i++) {
			key.add((char)i);
		}
		for (int i = 0; i < 256 ; i++) {
			keyOne.add((char)97);
		}
		inOut.close();
		a.encode("C:/Users/Nick/Desktop/SDA_Test/in.txt", "C:/Users/Nick/Desktop/SDA_Test/out.txt", key);
		a.encode("C:/Users/Nick/Desktop/SDA_Test/in.txt","C:/Users/Nick/Desktop/SDA_Test/out1.txt", keyOne);
		System.out.println("Done");
		
		System.out.println(a.isPrime(17));
		
	}
}
