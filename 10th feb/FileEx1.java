import java.io.*;
public class FileEx1{
 
    public static void main(String[] args){
        BufferedReader br = null;
        String strLine = "";
        try {
            br = new BufferedReader( new FileReader("pranay.txt"));
            int count=1;
            while( (strLine = br.readLine()) != null){
            	System.out.print(count + ". ");
                System.out.println(strLine);
                count++;
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }
     }
}