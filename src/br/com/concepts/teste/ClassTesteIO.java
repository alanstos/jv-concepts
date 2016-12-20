package br.com.concepts.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ClassTesteIO {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		//InputStream is = new FileInputStream("entrada.txt"); // lendo byte
		InputStream is = System.in;
		
//		int b = is.read();
//		System.out.println(b);
		
		InputStreamReader isr = new InputStreamReader(is, "UTF-8"); // char
		
//		int c = isr.read();
//		System.out.println(c);		
		
		BufferedReader br = new BufferedReader(isr); // string
		
		while ( br.ready() ) {
			String d = br.readLine();
			
			System.out.println(d);	
		}
		
		isr.close();
	}
}
