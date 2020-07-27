/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;
import negocio.nodoLD;
/**
 *
 * @author pc
 */
public class clsListaDoble {
    private nodoLD pListaD;
    private int cantidad;
    public clsListaDoble(){
        this.pListaD = null;
        this.cantidad = 0;
    }
    
    public void setpListaD(nodoLD pListaD){
        this.pListaD = pListaD;
    }
    
    public nodoLD getpListaD(){
        return this.pListaD;
    }
    
    public void insertarIzq(int dato){
        nodoLD nn = new nodoLD(dato);
        if(this.pListaD == null){
            this.pListaD = nn;
            this.cantidad++;
        }else{
            if(this.pListaD.getRefIzq() == null){
                nn.setRefDer(this.pListaD);
                this.pListaD.setRefIzq(nn);
                this.cantidad++;
            }else{
                (this.pListaD.getRefIzq()).setRefDer(nn);
                nn.setRefIzq(this.pListaD.getRefIzq());
                nn.setRefDer(this.pListaD);
                this.pListaD.setRefIzq(nn);
                this.cantidad++;
            }
        }
    }
    
    public boolean moverDer(){
        if(this.pListaD.getRefDer() != null){
            this.pListaD = this.pListaD.getRefDer();
            return true;
        }else{
            return false;
        }
    }
    
    public int cantidadLD() {
        return this.cantidad;
    }
    
    public boolean moverIzq(){
        if(this.pListaD.getRefIzq() != null){
            this.pListaD = this.pListaD.getRefIzq();
            return true;
        }else{
            return false;
        }
    }
    
    public void irPrimero(){
        while(moverIzq()){
            ;
        }
    }
    
    public void irUltimo(){
        while(moverDer()){
            ;
        }
    }
    
    public void eliminarLD(){
        if(this.pListaD.getRefIzq() == null){
            this.pListaD.getRefDer().setRefIzq(this.pListaD.getRefIzq());
            this.pListaD = this.pListaD.getRefDer();
            this.cantidad = 0;
        }
        else if(this.pListaD.getRefDer() == null){
            this.pListaD.getRefIzq().setRefDer(this.pListaD.getRefDer());
            this.pListaD = this.pListaD.getRefIzq();
            this.cantidad--;
        }
        else{
             this.pListaD.getRefIzq().setRefDer(this.pListaD.getRefDer());
             this.pListaD.getRefIzq().setRefIzq(this.pListaD.getRefIzq());
             this.pListaD = this.pListaD.getRefIzq();
             this.cantidad--;
        }
    }
}
