/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relembrando;

import javax.inject.Inject;
import model.Cliente;

public class CalculadoraPreco {
   
    public double calcularPreco(int quantidade, double precoUnitario){
        return quantidade * precoUnitario;
    }
}
