/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pArbol;
import negocio.nodoAB;

/**
 *
 * @author ASUS
 */
public class clsArbol {
    private nodoAB raiz;
    public clsArbol(){
        this.raiz = null;
    }
    
    public nodoAB getRaiz(){
        return this.raiz;
    }
    
    public void insertar(int cod){
        nodoAB nn = new nodoAB(cod);
        if(this.raiz == null){
            this.raiz = nn;
        }else{
            insertar(this.raiz, nn);
        }
    }
    
    private void insertar(nodoAB Raux, nodoAB nn){
        if(nn.getCod() > Raux.getCod()){
            if(Raux.getHijoDer() == null){
                Raux.setHijoDer(nn);
            }else{
                insertar(Raux.getHijoDer(), nn);
            }
        }else{
            if(Raux.getHijoIzq() == null){
                Raux.setHijoIzq(nn);
            }else{
                insertar(Raux.getHijoIzq(), nn);
            }
        }
    }
    
    public void inorden(){
        inorden(this.raiz);
    }
    
    private void inorden(nodoAB nn){
        if(nn.getHijoIzq() != null){
            inorden(nn.getHijoIzq());
        }
        System.err.println(nn.getCod());
        if(nn.getHijoDer() != null){
            inorden(nn.getHijoDer());
        }
    }
}
