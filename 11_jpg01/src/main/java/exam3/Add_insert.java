package exam3;

import java.time.LocalDate;

import exam3.Member3;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Add_insert {

	public static void main(String[] args) {
		 EntityManagerFactory emf =
	                Persistence.createEntityManagerFactory("JpaEx01");
	        EntityManager entityManager = emf.createEntityManager();
	        EntityTransaction transaction = entityManager.getTransaction();
	        
	        try {
	            transaction.begin();
	            
	            Member3 user = new Member3("test@test.com","홍길동",LocalDate.now());
	            entityManager.persist(user);
	            
	            transaction.commit();
	        } catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
	        } finally {
	        	entityManager.close();
	        }

	        emf.close();


	}

}
