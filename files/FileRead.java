package files;
import java.io.*;
public class FileRead {

	public static void main(String[] args)throws Exception {
		//Open file in read mode
FileReader fr= new FileReader("sai.txt");
//	
//	int ch;
//	//read the contents and print on the console
//	while((ch=fr.read())!=-1) {
//		System.out.print((char)ch);
//	}
	BufferedReader br=new BufferedReader(fr);
	String s;
	while((s=br.readLine())!=null)
	System.out.println(s);
	
	} 

}
