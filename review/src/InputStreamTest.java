

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 
 *   _Stream : byte
 *   _Reader : char
 * 
 */
public class InputStreamTest {
	public static void main(String[] args)  throws IOException{
		//bufferTest();
		/*DataType filter(보조스트림)*/
		//dataOutput(); //stream -> byte 단위로 들어가서 내용을 볼 수 가없다.
		//dataTypeInput();
		//writerTest();
		//readerTest();
		//textFileCopy();
		streamfileCopy(); //fileinputStream, fileoutputStream
	}
	
	public static void bufferTest() throws IOException {
		
	//	InputStream is = System.in; //byte단위로만 읽어줄수있다.
	//	int a = is.read(); //1byte만 읽어줌
	//	System.out.println((char)a + " : " + a);
		
									//2byte를 읽어줌	//1byte
	//	InputStreamReader isr = new InputStreamReader(System.in); 
	//	int i = isr.read(); 
	//	System.out.println((char)i + " : " + i);
		
		
								//String		<-	//2byte를 읽어줌 <- //1byte
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String b = br.readLine(); 
		System.out.println(b);
	}
	
	public static void dataOutput() throws IOException{
				//123  ->			//1	 2	3(byte값으로분리)
		DataOutputStream fos = new DataOutputStream(new FileOutputStream(new File("b.txt")));
		fos.writeInt(100);
		fos.writeDouble(95.5);
		fos.close();
	}
	
	public static void dataTypeInput() throws IOException{
		DataInputStream dis = new DataInputStream(new FileInputStream(new File("b.txt")));
		int score = dis.readInt();
		double avg = dis.readDouble();
		System.out.println(score + "," + avg);
	}
	
	public static void writerTest() throws IOException {
		FileWriter fw = new FileWriter(new File("memo.txt")); //char단위로 출력한다.
		BufferedWriter bw = new BufferedWriter(fw); //속도
		bw.write("hello" + "\n");
		bw.write("everday");
		bw.close();
		
	}
	
	public static void readerTest() throws IOException {
		FileReader fr = new FileReader(new File("memo.txt")); //char단위로 출력한다. 한글자출력
		BufferedReader br = new BufferedReader(fr); //속도. 문장출력
		String s1;
		while((s1 = br.readLine()) != null) {
			s1 += br.readLine();
			System.out.println(s1);
		}
		br.close();
		
	}
	
	public static void textFileCopy() throws IOException{
		FileReader fr = new FileReader(new File("memo.txt")); //char단위로 출력한다. 한글자출력
		BufferedReader br = new BufferedReader(fr); //속도. 문장출력
		String s1;
		
		FileWriter fw = new FileWriter(new File("memo_copy.txt")); //char단위로 출력한다.
		BufferedWriter bw = new BufferedWriter(fw); //속도
		
		while((s1 = br.readLine()) != null) {	
			bw.write(s1 + "\n");
		}
		br.close();
		bw.close();
	}
	
	public static void streamfileCopy() throws IOException{
		FileInputStream fis = new FileInputStream(new File("Chrysanthemum.jpg"));
		FileOutputStream fos = new FileOutputStream(new File("국화.jpg"));
		
		int b1;
		while((b1 = fis.read()) != 0) {
			fos.write(b1);
		}
		fos.close();
		fis.close();
	}
	
}
