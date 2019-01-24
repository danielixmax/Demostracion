/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import modelo.Numeros;

/**
 *
 * @author axel_
 */
@ManagedBean
public class NumerosBean {
    
    private Numeros numeros= new Numeros();

    
    public Numeros getNumeros() {
        return numeros;
    }

    public void setNumeros(Numeros numeros) {
        this.numeros = numeros;
    }
    
}
