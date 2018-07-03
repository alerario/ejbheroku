/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author alexandrelerario
 */
@Stateless
public class EkbCalc implements EkbCalcLocal {

    @Override
    public int dobra(int v1) {
        return v1+v1;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
