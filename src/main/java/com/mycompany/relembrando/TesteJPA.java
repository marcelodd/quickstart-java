/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relembrando;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import model.Cliente;

/**
 *
 * @author marcelo
 */
public class TesteJPA {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PedidoPU");
        
        EntityManager em = factory.createEntityManager();
        EntityTransaction et = em.getTransaction();
        
        et.begin();
        
        Cliente cliente = new Cliente();
        cliente.setNome("Marcelo de Castro");
        cliente.setFone("16 99348-4410");
        cliente.setEndereco("Rua teste");
        cliente.setCidade("Catanduva-SP");
        cliente.setCep("15808-456");
        
        em.persist(cliente);
        
        et.commit();
    }
}
