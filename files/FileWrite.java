package files;
import java.io.*;
public class FileWrite {

	public static void main(String[] args)throws Exception {
		//open the file in write mode
		FileWriter fw=new FileWriter("Sample.txt",true);
		//connect file writer w with buffered writer
BufferedWriter bw=new BufferedWriter(fw);
//write the contents into the file
char c[]= {'w','e','l','c','o','m','e'};
bw.write(c,3,2);
String s="-This is files class in java";
bw.write(s,0,s.length());
bw.close();
fw.close();
	}

}
