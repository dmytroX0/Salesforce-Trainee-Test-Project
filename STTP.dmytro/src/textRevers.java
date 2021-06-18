import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class textRevers {

	public static void main(String[] args) throws IOException {
		List<String>list = new ArrayList<>();
		List<String>reversList = new ArrayList<String>();
		File inputFile = new File("input.txt");
		FileReader fr = new FileReader(inputFile);
		File outputFile = new File("output.txt");
		FileWriter fw = new FileWriter(outputFile);
		BufferedReader br = new BufferedReader(fr);

	}
}