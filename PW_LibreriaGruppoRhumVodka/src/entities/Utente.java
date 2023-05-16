package entities;

public class Utente {
//	insert into utenti (nome, cognome, eta, città, genere_preferito)
	private int id;
	private String nome;
	private String cognome;
	private int eta;
	private String citta;
	private String generePreferito;
		
	public Utente(int id, String nome, String cognome, int eta, String citta, String generePreferito) {
		setId(id);
		setNome(nome);
		setCognome(cognome);
		setEta(eta);
		setCitta(citta);
		setGenerePreferito(generePreferito);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getGenerePreferito() {
		return generePreferito;
	}
	public void setGenerePreferito(String generePreferito) {
		this.generePreferito = generePreferito;
	}
	@Override
	public String toString() {
		return "Utente. \nNome: " + nome + "\nCognome: " + cognome + "\nEta: " + eta + "\nCitta: " + citta
				+ "\nGenere preferito: " + generePreferito + "\n-------\n";
	}
	
	
	
}
