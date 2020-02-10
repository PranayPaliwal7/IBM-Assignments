import java.io.*;
class FileEx2
{
public static void main(String args[]) throws Exception
{
	try{
		File file = new File("anotherFile.txt"); 
 		FileWriter fw = new FileWriter(file); 
		fw.write("Hello\nguys\nhow\nare\nyou\ndoing\nwe\nare\nalmost\ndone\nwith\ncore"); 
		fw.flush(); 
		fw.close();
} catch(IOException e) {
	System.out.println("Some issues writing to the file" + e.getMessage()); 
}

int ccnt=0,lcnt=1,wcnt=1,c;
final String myFileName="anotherFile.txt";
 
File myFile=new File(myFileName);
            if(myFile.exists()==false)
            {
                System.out.println("File doesn't exist!!!");
                System.exit(0);
            }

FileInputStream fin=new FileInputStream(myFile);
while((c=fin.read())!=-1)
{
	ccnt++;
	if(c==32 || c==13)
		wcnt++;
	if(c==13)
		lcnt++;
}
	System.out.println("Number of Characters are " + ccnt);
	System.out.println("Number of Words are " + wcnt);
	System.out.println("Number of Lines are "  + lcnt);
}
}

