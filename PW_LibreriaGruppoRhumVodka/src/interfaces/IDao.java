package interfaces;

import java.util.List;

import entities.Libro;
import entities.Utente;

public interface IDao {
	//CRUD
		//Read
		public List<Libro> readLibro(); //Questa è SOLO la firma del metodo
		public List<Utente> readUtente();
		//Create
		public void createLibro(Libro a);
		public void createLibro(Utente u);
		//Update
		public void updateLibro(Libro a);
		public void updateUtente(Utente u);
		//Delete
		public void deleteLibro(int id);
		public void deleteUtente(int id);
		
		//Metodi di default che stampa l'elenco dei Libri e degli Utenti
		default String stampaElencoLibri()
		{
			String ris = "";
			for(Libro libro : readLibro())
			{
				ris += libro.toString();
			}
			return ris;
		}
		
		default String stampaElencoUtenti() 
		{
			String ris="";
			for(Utente utente : readUtente())
			{
				ris+=utente.toString();
			}
			return ris;
		}
}
