/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relembrando;

@Urgente
public class NotificadorSMS implements Notificador{

    @Override
    public void notificar(String notificacao) {
        System.err.println("Notificador de SMS");
    }
    
}
