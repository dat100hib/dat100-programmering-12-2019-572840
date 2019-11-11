package no.hvl.dat100.jplab12.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab12.oppgave3.*;
import no.hvl.dat100.jplab12.common.TODO;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	public static boolean skriv(Blogg samling, String filnavn) throws FileNotFoundException {
		String blogg = "blogg.txt";
		PrintWriter skriver = new PrintWriter(blogg);
		
		
		
		String[] String = { "" + "TEKST" + "\n" + "1" + "\n" + "Ole Olsen" + "\n" + "23-10-2019" + "\n" + 0 + "\n" + "en tekst" + "\n"};
		
		
       skriver.println(String);
       
       skriver.close();
		
		
		
		
		return true;
	}
}
