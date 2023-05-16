package entities;

public class Libro {
//	titolo, autore, anno_pubblicazione, prezzo
	
	private int id;
	private String titolo;
	private String autore;
	private String genere;
	private int annoPubblicazione;
	private double prezzo;
	private int salvati;
	
	//ho inserito un commento
	
	public Libro(int id, String titolo, String autore, String genere, int annoPubblicazione, double prezzo, int salvati) {
		setId(id);
		setTitolo(titolo);
		setAutore(autore);
		setGenere(genere);
		setAnnoPubblicazione(annoPubblicazione);
		setPrezzo(prezzo);
		setSalvati(salvati);
	}
		
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}
	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public int getSalvati() {
		return salvati;
	}

	public void setSalvati(int salvati) {
		this.salvati = salvati;
	}

	@Override
	public String toString() {
		return "Libro.\n" +"Titolo: "+ titolo + "\nAutore: " + autore+"\nGenere: " + "\nAnno pubblicazione: " + annoPubblicazione
				+ "\nPrezzo: " + prezzo + "\nSalvati: "+salvati+"\n-----\n";
	}
	
	
	
	
}
