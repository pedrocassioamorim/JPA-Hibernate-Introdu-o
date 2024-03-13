package application;

import dominio.Pessoa;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Teste");

        EntityManager em = emf.createEntityManager();

        Pessoa p = em.find(Pessoa.class, 2);

        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();


        em.close();
        emf.close();

        System.out.println("Pronto!");



    }
}
