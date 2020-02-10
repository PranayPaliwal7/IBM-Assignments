import java.io.*;
import java.util.Scanner;

class FileEx4{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter word to be replaced: ");
		String replaceWord = sc.nextLine();


		System.out.println("Enter new word: ");
		String newWord = sc.nextLine();


		File file = new File("QuestionFourFile.txt");

		if(file.exists()==false){
			System.out.println("File does not exist.");
		}

		StringBuffer sb = new StringBuffer("");
		try{
			String str = "";
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((str = br.readLine()) != null){
				str = str.replaceAll(replaceWord, newWord);
				sb.append(str);
				sb.append("\n");
			}
			System.out.println(sb);
			br.close();
		} catch(IOException e){
			System.out.println("Can't read from the file...");
		}
	}
}