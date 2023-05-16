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
		public void create(Libro a);
		public void create(Utente u);
		//Update
		public void updateLibro(Libro a);
		public void uodateUtente(Utente u);
		//Delete
		public void deleteLibro(int id);
		public void deleteUtente(int id);
		
		//Metodi di default che stampa l'elenco dei Libri e degli Utenti
		default String stampaElencoLibri()
		{
			String ris = "";
			for(Libro a : readLibro())
			{
				ris += a.toString();
			}
			return ris;
		}
		
		default String stampaElencoUtenti() 
		{
			String ris="";
			for(Utente u: readUtente())
			{
				ris+=u.toString();
			}
			return ris;
		}
}
