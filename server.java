package tirgul;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {

	public static void main(String[] args) throws IOException {
		ServerSocket s=new ServerSocket(1234);
		Socket ss=s.accept();
		Scanner sc=new Scanner(ss.getInputStream());
		int number=sc.nextInt();
		int  temp=number*4;
		PrintStream p=new PrintStream(ss.getOutputStream());
		p.println(temp);
		

	}

}
