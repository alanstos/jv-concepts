package br.com.concepts.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class ClassTesteIO {
	
	//entrada = byte -> char -> string
	//saida = string -> char -> byte

	public static void main(String[] args) throws FileNotFoundException,IOException {
		
//		entrada();
//		saida();
		entradaComScanner();
	}

	private static void entrada() throws FileNotFoundException, IOException {
		InputStream is = new FileInputStream("entrada.txt"); // lendo byte
//		InputStream is = System.in;
		
		
		InputStreamReader isr = new InputStreamReader(is); // char		
		
		BufferedReader br = new BufferedReader(isr); // string
		String s = br.readLine();
		
		while ( s != null ) { // ou do { ... } while();
			System.out.println(s);
			
			s = br.readLine();
		}
		
		isr.close();
	}
	
	private static void saida() throws IOException  {
		OutputStream os;
		BufferedWriter bw = null;
		try {
			os = new FileOutputStream("saida.txt", true);

		
			OutputStreamWriter osw = new OutputStreamWriter(os);
			
			bw = new BufferedWriter(osw);
			
			bw.write("um valor qualquer");
			bw.newLine();
			bw.write("linha dois");
			bw.newLine();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw != null){
				bw.close();				
			}
		}
	}
	
	private static void entradaComScanner() throws FileNotFoundException{
        Scanner s = new Scanner(System.in);
        PrintStream ps = new PrintStream("entrada.txt");
        while (s.hasNextLine()) {
            ps.println(s.nextLine());
        }
        
        s.close();
        ps.close();
	}
}
