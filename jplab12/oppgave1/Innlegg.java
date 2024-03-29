package no.hvl.dat100.jplab12.oppgave1;

import no.hvl.dat100.jplab12.common.TODO;

public abstract class Innlegg {

	// TODO - deklarering av objektvariable

	protected int id;
	protected int likes;
	protected String bruker;
	protected String dato;

	public Innlegg() {

	}

	public Innlegg(int id, String bruker, String dato) {

		// TODO
		this.id = id;
		this.likes = 0;
		this.bruker = bruker;
		this.dato = dato;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO - START

		this.id = id;
		this.likes = likes;
		this.bruker = bruker;
		this.dato = dato;
	}

	public String getBruker() {

		return bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {

		return dato;

	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;

	}

	public int getLikes() {
		return likes;

	}

	public void doLike() {
		this.likes = likes + 1;
	}

	public boolean erLik(Innlegg innlegg) {
		
		id = getId();
		int innleggid = innlegg.getId();
		boolean erLik;
		
		if(id == innleggid){
			
		erLik = true;
		} 
			else {
			
			erLik = false;
			}
		
		return erLik;
	}

	@Override
	public String toString() {
		String str;

		str = "" + id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
		return str;

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {

		throw new UnsupportedOperationException(TODO.method());

	}
}
