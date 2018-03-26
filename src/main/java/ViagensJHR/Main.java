package ViagensJHR;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ViagensJHRBiblio" );
        EntityManager entitymanager = emfactory.createEntityManager( );
        entitymanager.getTransaction( ).begin( );
        Alunos a = new Alunos();
        entitymanager.persist(a);
        entitymanager.getTransaction( ).commit( );
        

//      Alunos a = new Alunos("Joyce", "201619600030", "joycemartins.jn386@gmail.com");
//      entitymanager.persist(a);        
        
//		Usuario usu2 = entitymanager.find( Usuario.class, 1);
//        System.out.println(usu2);
//        entitymanager.close();
//        emfactory.close();
        }
}