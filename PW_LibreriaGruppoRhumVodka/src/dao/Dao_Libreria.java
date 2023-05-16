package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import database.Database;
import entities.Libro;
import entities.Utente;
import interfaces.IDao;

public class Dao_Libreria implements IDao{

	private Database db;
	
	public Dao_Libreria(String percorso, String username, String password)
	{
		db = new Database(percorso, username, password);
	}
	
	@Override
	public List<Libro> readLibro() {
		List<Libro> elenco = new ArrayList<Libro>();
		Libro a = null;
		
		try
		{
			db.getConnection();
			String query = "select * from libri";
			PreparedStatement ps = db.getC().prepareStatement(query);
			ResultSet tabella = ps.executeQuery();
			
			while(tabella.next())
			{
//				int id, String titolo, String autore, String genere, int annoPubblicazione, double prezzo, int salvati
				a = new Libro(
						tabella.getInt(1),
						tabella.getString(2),
						tabella.getString(3),
						tabella.getString(4),
						tabella.getInt(5),
						tabella.getDouble(6),
						tabella.getInt(7)
						);
				
				if(a != null)
				{
					elenco.add(a);
				}
			}
			
			ps.close();
		}
		catch(Exception e)
		{
			System.out.println("errore");
			e.printStackTrace();
		}
		finally
		{
			db.closeConnection();
		}
		
		return elenco;
	}

	@Override
	public List<Utente> readUtente() {
		List<Utente> elenco = new ArrayList<Utente>();
		Utente u = null;
		
		try
		{
			db.getConnection();
			String query = "select * from libri";
			PreparedStatement ps = db.getC().prepareStatement(query);
			ResultSet tabella = ps.executeQuery();
			
			while(tabella.next())
			{
				u = new Utente(
						tabella.getInt(1),
						tabella.getString(2),
						tabella.getString(3),
						tabella.getString(4),
						tabella.getInt(5),
						tabella.getDouble(6),
						tabella.getInt(7)
						);
				
				if(a != null)
				{
					elenco.add(a);
				}
			}
			
			ps.close();
		}
		catch(Exception e)
		{
			System.out.println("errore");
			e.printStackTrace();
		}
		finally
		{
			db.closeConnection();
		}
		
		return elenco;
	}

	@Override
	public void create(Libro a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Utente u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateLibro(Libro a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void uodateUtente(Utente u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLibro(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUtente(int id) {
		// TODO Auto-generated method stub
		
	}

	
	
//	private List<Libro> animali = new ArrayList<Libro>();  //Proprietà
//	private Database db;
//	
//	public Dao_Libreria(String percorso, String username, String password)
//	{
//		db = new Database(percorso, username, password);
//	}
//
//	//cRud -> Read
//	@Override
//	public List<Libro> read()
//	{
//		List<Animale> elenco = new ArrayList<Animale>();
//		Animale a = null;
//		
//		try
//		{
//			db.getConnection();
//			String query = "select * from animali";
//			PreparedStatement ps = db.getC().prepareStatement(query);
//			ResultSet tabella = ps.executeQuery();
//			
//			while(tabella.next())
//			{
//				a = new Animale(
//						tabella.getInt(1),
//						tabella.getString(2),
//						tabella.getString(3),
//						tabella.getInt(4),
//						tabella.getDouble(5)
//						);
//				
//				if(a != null)
//				{
//					elenco.add(a);
//				}
//			}
//			
//			ps.close();
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		finally
//		{
//			db.closeConnection();
//		}
//		
//		return elenco;
//	}
//
//	@Override
//	public void create(Animale a)
//	{
//		//Preparo una variabile String con la query da lanciare su MySql
//		String query = "insert into animali(nome, tipo, eta, peso) values\r\n"
//				+ "(?,?,?,?)";
//		
//		try
//		{
//			db.getConnection();
//			PreparedStatement ps = db.getC().prepareStatement(query);
//			
//			ps.setString(1, a.getNome());
//			ps.setString(2, a.getTipo());
//			ps.setInt(3, a.getEta());
//			ps.setDouble(4, a.getPeso());
//			
//			ps.executeUpdate();
//			
//			System.out.println("Animale inserito correttamente");
//		}
//		catch(Exception e)
//		{
//			System.out.println("Impossibile inserire Animale");
//			e.printStackTrace();
//		}
//		finally
//		{
//			db.closeConnection();
//		}
//	}
//
//	//crUd -> UPDATE
//	@Override
//	public void update(Animale a) 
//	{
//		db.getConnection();
//		
//		String query = "update animali set nome = ?, tipo= ?, eta=?, peso=?" + "where id=?";
//		
//		try {
//			
//			PreparedStatement ps = db.getC().prepareStatement(query);
//			
//			ps.setString(1, a.getNome());
//			ps.setString(2, a.getTipo());
//			ps.setInt(3, a.getEta());
//			ps.setDouble(4, a.getPeso());
//			ps.setInt(5, a.getId());
//			
//			ps.executeUpdate();
//			
//			System.out.println("animale modificato correttamente");
//		}catch(Exception e) {
//			System.out.println("Errore durante la query");
//		}finally
//		{
//			db.closeConnection();
//		}
//		
//	}
//
//	//cruD -> DELETE
//	@Override
//	public void delete(int id) 
//	{
//		String query = "delete from animali where id=" + id;
//		db.getConnection();
//		
//		String ris ="";
//		try 
//		{
//			PreparedStatement ps = db.getC().prepareStatement(query);
//			
//			ps.executeUpdate();
//			ris = "animale eliminato correttamente";
//			
//		}catch(Exception e) 
//		{
//			ris = "errore";
//			
//		}finally
//		{
//			System.out.println(ris);
//			db.closeConnection();
//		}
		
		
		
		
	
}
