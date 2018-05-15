package myjpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import myjpa.dokument;

public class Main {

	private static final String PERSISTENCY_UNIT_NAME = "myjpa";
	private static EntityManagerFactory factory;
	private static EntityManager em;
	
	public static void main( String[] args ) {
		
		factory = Persistence.createEntityManagerFactory(PERSISTENCY_UNIT_NAME);
		em = factory.createEntityManager();
		
		Query q = em.createQuery("select t from musiker t");
		List<musiker> rockers = q.getResultList();
		
		for ( musiker slash : rockers) {
			
			System.out.println( slash );
		}
	}
}
