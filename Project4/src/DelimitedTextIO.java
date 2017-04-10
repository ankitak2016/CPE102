/**
 * DelimitedTextIO.java
 * DelimitedTextIO interface
 * @author Ankita Koratkar CPE 102-01
 * @version 03/6/2017
 */
import java.util.Scanner;
public interface DelimitedTextIO {
	String toText(char delimiter);
	void toObject(Scanner input);
}
