package no.hvl.dat100.jplab12.oppgave3;

import java.util.Arrays;



import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;


public class Blogg {

	// TODO: objektvariable 

	private Innlegg [] innleggstabell;
	private int nesteledig;
	
	
	public Blogg() {
		this.innleggstabell = new Innlegg [20];
		this.nesteledig = getAntall();
	}

	public Blogg(int lengde) {
		this.innleggstabell = new Innlegg [lengde];
		this.nesteledig = getAntall();
	}

	public int getAntall() {
		int antall = 0;
		for(int i=0; i<innleggstabell.length; i++) {
			if(innleggstabell[i] != null) {
				antall++;
				
			}
		}
	return antall;
	}
	
	public Innlegg[] getSamling() {
		return innleggstabell;
		
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int pos = 0;
		boolean funnet = false;

		while (pos < nesteledig && !funnet) {

			if (innlegg.erLik(innleggstabell[pos]) == true) {
				funnet = true;
			} else {
				pos++;
			}

		}
		if (funnet == true) {
			return pos;
		} else {
			return -1;

		}
	}

	public boolean finnes(Innlegg innlegg) {
		int søk = finnInnlegg(innlegg);
		if (søk >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean ledigPlass() {
	boolean ledig = true;
		
		for (int i = 0; i < innleggstabell.length; i++) {
			
			if (innleggstabell[i] == null) {
				ledig= true;
			} else {
				ledig = false;
			}
		}
		return ledig;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean samme;
		int [] IdTab = new int[innleggstabell.length];
		
		for(int i=0; i<innleggstabell.length; i++) {
			IdTab[i]= innleggstabell[i].getId();
		}
		Arrays.sort(IdTab);
		
		if(Arrays.binarySearch(IdTab, innlegg.getId())>0) {
			samme = false;
		}else {
			innlegg = innleggstabell[nesteledig];
			samme = true;
		}
		return samme;
	}
	
	public String toString() {
		String str;

		str = "" + "TEKST" + "\n" + "1" + "\n" + "Ole Olsen" + "\n" + "23-10-2019" + "\n" + 0 + "\n" + "en tekst" + "\n";
		
		return str;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}