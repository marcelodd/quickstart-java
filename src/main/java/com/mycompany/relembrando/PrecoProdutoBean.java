/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relembrando;

import java.text.DateFormat;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Cliente;

@Named(value = "precoProdutoBean")
@RequestScoped
public class PrecoProdutoBean {
    
    @Inject
    private CalculadoraPreco calculadora;
    
    @Inject
    @Urgente
    private Notificador notificador;
    
    @Inject
    @Brasil
    private DateFormat dateFormat;
    
    @PostConstruct
    public void init() {
        notificador.notificar("Enviar mensagem");
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PedidoPU");
        
        EntityManager em = factory.createEntityManager();
        
        Cliente cliente = new Cliente();
        cliente.setNome("Marcelo de Castro");
        cliente.setFone("16 99348-4410");
        cliente.setEndereco("Rua teste");
        cliente.setCidade("Catanduva-SP");
        cliente.setCep("15808-456");
        
        em.persist(cliente);
        
        System.err.println("Preço: " + calculadora.calcularPreco(1, 20));
    }
    
    public double getPreco() {
        return calculadora.calcularPreco(12, 5);
    }
}
