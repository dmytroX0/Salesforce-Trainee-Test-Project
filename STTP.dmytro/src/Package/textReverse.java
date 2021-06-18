package Package;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class textReverse {

	public static void main(String[] args) throws IOException {
		List<String>list = new ArrayList<>();
		List<String>reversList = new ArrayList<String>();
		File inputFile = new File("C:\\Users\\dM0oH\\git\\Salesforce-Trainee-Test-Project\\STTP.dmytro\\input.txt");
		FileReader fr = new FileReader(inputFile);
		File outputFile = new File("C:\\Users\\dM0oH\\git\\Salesforce-Trainee-Test-Project\\STTP.dmytro\\ouutput.txt");
		FileWriter fw = new FileWriter(outputFile);
		BufferedReader br = new BufferedReader(fr);
		
		String row = null;
		int rowNum = 1;
		
		while((row = br.readLine())!=null) {
			list.add(row);
		}
		br.close();
		for (int i = 0; i < list.size(); ++i) {
			if (i+1==fiboNumbers(rowNum)) {
				reversList.add(reverseRow(list.get(i)));
				rowNum++;
			}
		}

		for (int i = 0; i < reversList.size(); ++i) {
			fw.write(reversList.get(i)+"\n");
		}
		fw.close();
		
	}
	public static String reverseRow(String row) { 
		int rowLength = row.length();
		String reversedRow = "";
		for(int i = 0; i <rowLength; ++i) {
			reversedRow = row.charAt(i) + reversedRow;
		}
		return reversedRow;
	}

	public static int fiboNumbers(int n) {
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		return fiboNumbers(n-1)+fiboNumbers(n-2);
	}

}