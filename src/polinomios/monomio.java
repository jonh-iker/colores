/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polinomios;

/**
 *
 * @author jonhy
 */
public class monomio {
    private Integer coeficiente;
    private Integer exponente;

    public void setCoeficiente(Integer coeficiente) {
        this.coeficiente = coeficiente;
    }

    public void setExponente(Integer exponente) {
        this.exponente = exponente;
    }

    public Integer getCoeficiente() {
        return coeficiente;
    }

    public Integer getExponente() {
        return exponente;
    }
    
    public monomio(Integer c1,Integer e1){
    this.coeficiente=c1;
    this.exponente=e1;
    }
    @Override
    public String toString(){
        return String.format("%c%dx^%d",(coeficiente > 0 ? '+':'-'),coeficiente,exponente);
    }
    
}
