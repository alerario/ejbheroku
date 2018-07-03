/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.web;

import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author alexandrelerario
 */
@Named(value = "jsfCalc")
@RequestScoped
public class JsfCalc {

    @EJB
    private br.ejb.EkbCalcLocal ekbCalc;

    /**
     * Creates a new instance of JsfCalc
     */
    public JsfCalc() {
    }
    
    private int v1;

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }
    
    public void dobrar(){
        v1 = ekbCalc.dobra(v1);
    }
}
