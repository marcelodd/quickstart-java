/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relembrando;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.enterprise.inject.Produces;

public class FormatadorData {

    @Produces @Brasil
    public DateFormat getDateFormatBrasil() {
        return new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("pt", "BR"));
    }

    @Produces
    public DateFormat getDateFormatEUA() {
        return new SimpleDateFormat("MMMM dd, yyyy", Locale.US);
    }
}
