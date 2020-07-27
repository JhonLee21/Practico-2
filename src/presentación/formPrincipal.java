/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentación;
import Pilas.Pila;
import Cola.Cola;
import pArbol.clsArbol;
import Lista.clsListaSimple;
import Lista.clsListaDoble;
import negocio.nodo;
import negocio.nodoLD;
import negocio.nodoAB;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;
/**
 *
 * @author pc
 */
public class formPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form formPrincipal
     */
    private Pila objePila;
    private Cola objCola;
    private clsListaSimple objListaS;
    private clsListaDoble objListaD;
    private clsArbol objArbol;
    private int px,py;
    public formPrincipal() {
        initComponents();
        this.objePila = new Pila();
        this.objCola = new Cola();
        this.objListaS = new clsListaSimple();
        this.objListaD = new clsListaDoble();
        this.objArbol = new clsArbol();
        px = 600;
        py = 80;
    }
    
    public void graficarPila(){
        Graphics dibujar = this.getGraphics();
        dibujar.clearRect(px, py, 300, 400);
        nodo nn = this.objePila.getCima();
        int i = 0;
        dibujar.drawString("Cima->", px-45, py+25);
        while(nn != null){
            String dd = nn.getDato();
            dibujar.setColor(Color.RED);
            dibujar.drawRect(px, py+i*35, 80, 30);
            dibujar.setColor(Color.BLACK);
            dibujar.drawString(dd, px, py+i*35+25);
            i++;
            nn = nn.getRefNodo();
        }
    }
    
    public void graficarCola(){
        Graphics gg = this.getGraphics();
        gg.clearRect(px, py, 600, 300);
        nodo objC = this.objCola.getRefPri();
        gg.setColor(Color.red);
        int i = 0, w=80, h=30, r=10;
        while(objC != null){
            String ss= objC.getDato();
            gg.drawRect(px+i*w, py, w-r, h);
            gg.fillRect(px+(i+1) *w-2*r, py, r, h);
            gg.drawLine(px+(i+1) *w-r, py+h/2, px+(i+1)*w, py+h/2);
            gg.drawString(ss, px+i*w+5, py+h-5);
            objC = objC.getRefNodo();
            if(objC == this.objCola.getRefUlt()){
                gg.setColor(Color.BLUE);
                gg.drawLine(px+(i+2)*w, py+h, px+(i+2)*w, py+h/2);
                gg.drawLine(px+(i+2) *w-(5), py+h, px+(i+2)*w+5, py+h);
                gg.drawLine(px+(i+2) *w-(5), py+h+3, px+(i+2)*w+5, py+h+3);
            }else{
                gg.setColor(Color.BLACK);
            }
            i++;
        }
    }
    
    public void graficarListaS(){
        Graphics ff = this.getGraphics();
        ff.clearRect(px, py, 1200, 300);
        nodo objL = this.objListaS.getRefPri();
        ff.setColor(Color.red);
        int i = 0, w=80, h=30, r=10;
        while(objL !=null){
            String bb = objL.getDato();
            ff.drawRect(px+i*w, py, w-r, h);
            ff.fillRect(px+(i+1) *w-2*r, py, r, h);
            ff.drawLine(px+(i+1) *w-r, py+h/2, px+(i+1)*w, py+h/2);
            ff.drawString(bb, px+i*w+5, py+h-5);
            i++;
            objL = objL.getRefNodo();
                ff.setColor(Color.BLACK);
            }
    }
    
    public void graficarListaDoble(){
        Graphics gg = this.getGraphics();
        gg.clearRect(px, py, 1200, 300);
        /// es para clonar un objeto
        clsListaDoble objAuxLD = new clsListaDoble();
        objAuxLD.setpListaD(this.objListaD.getpListaD());
        objAuxLD.irPrimero();
        
        nodoLD nodoLDPri = objAuxLD.getpListaD();
        
        int i = 0,w=80,h=30,r=10;
        while(nodoLDPri != null){
            if(nodoLDPri == this.objListaD.getpListaD()){
                gg.setColor(Color.red);
            }else{
                gg.setColor(Color.BLACK);
            }
            String ss = ""+nodoLDPri.getDato();
            gg.drawRect(px+i*w, py, w-r, h); // rectángulo
            gg.fillRect(px+(i+1)*w-2*r, py, r, h); // relleno
            gg.setColor(Color.red);
            gg.drawLine(px+(i+1)*w-r, py+h/3, px+(i+1)*w, py+h/3);
            gg.setColor(Color.BLACK);
            gg.drawLine(px+(i+1)*w-r, py+2*h/3, px+(i+1)*w, py+2*h/3);
            gg.drawString(ss, px+i*w+5, py+h-5);
            i++;
            nodoLDPri = nodoLDPri.getRefDer();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_Codigo = new javax.swing.JTextField();
        txt_detalle = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_Codigo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txt_detalle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Detalle:");

        jMenu1.setText("Menú");

        jMenuItem4.setText("Graficar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pilas");

        jMenuItem1.setText("Insetar Pila");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Sacar dato pila");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Eliminar nodo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Colas");

        jMenuItem5.setText("Insertar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Eliminar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Lista Simple");

        jMenuItem7.setText("Insertar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem9.setText("Eliminar Nodo");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem8.setText("Eliminar por Código");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Lista Doble");

        jMenuItem10.setText("Insertar");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuItem14.setText("Eliminar");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuItem15.setText("Cantidad");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Arbol");

        jMenuItem12.setText("Insertar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem12);

        jMenuItem13.setText("Eliminar");
        jMenu6.add(jMenuItem13);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 571, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txt_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(465, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        graficarPila();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int cod = Integer.parseInt(txt_Codigo.getText());
        String ss = txt_detalle.getText();
        this.objePila.insertar(cod, ss);
        graficarPila();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String ss = this.objePila.sacarDatos();
        JOptionPane.showMessageDialog(this, ss);
        graficarPila();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        String dd = this.objePila.Eliminar();
        JOptionPane.showMessageDialog(this, dd);
        graficarPila();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        int dato = Integer.parseInt(txt_Codigo.getText());
        String ss = txt_detalle.getText();
        objCola.insertar(dato, ss);
        graficarCola();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       objCola.eliminar();
       graficarCola();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        int cod = Integer.parseInt(txt_Codigo.getText());
        objListaS.eliminarPorCod(cod);
        graficarListaS();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        int dato = Integer.parseInt(txt_Codigo.getText());
        String de = txt_detalle.getText();
        this.objListaS.insertarOrdenado(dato, de);
        graficarListaS();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        this.objListaS.eliminarNodo();
       graficarListaS();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        int dd = Integer.parseInt(txt_Codigo.getText());
        this.objListaD.insertarIzq(dd);
        graficarListaDoble();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        int cod = Integer.parseInt(txt_Codigo.getText());
        this.objArbol.insertar(cod);
        graficarArbol();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        this.objListaD.eliminarLD();
        JOptionPane.showMessageDialog(this, "Ok Eliminar");
        graficarListaDoble();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        int cant = 0;
        cant = this.objListaD.cantidadLD();
        JOptionPane.showMessageDialog(this, "La cantidad de nodos de la Lista Doble son: "+cant);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    
    public void graficarArbol(){
        Graphics gg = this.getGraphics();
        gg.clearRect(0, 80, 800, 600);
        graficarArbol(this.objArbol.getRaiz(),px,py,300,50);
    }
    
    private void graficarArbol(nodoAB nn, int x, int y, int dx, int dy){
        if(nn.getHijoIzq() != null){
            graficarArbol(nn.getHijoIzq(),x-dx,y+dy,(int)(dx*0.5),(int)(dy*0.8));
        }
        graficarNodoAB(nn,x,y,dx,dy);
        if(nn.getHijoDer() != null){
            graficarArbol(nn.getHijoDer(),x+dx+30,y+dy,(int)(dx*0.8),(int)(dy*0.8));
        }
    }
    
    public void graficarNodoAB(nodoAB nn, int x, int y, int dx, int dy){
        Graphics gg = this.getGraphics();
        gg.setColor(Color.BLACK);
        gg.fillOval(x, y, 30, 30);
        gg.setColor(Color.WHITE);
        gg.drawString(""+nn.getCod(), x+5, y+25);
        gg.setColor(Color.red);
        gg.drawLine(x, y+15, x-dx, y+dy+15);
        gg.drawLine(x+30, y+15, x+30+dx, y+dy+15);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JTextField txt_Codigo;
    private javax.swing.JTextField txt_detalle;
    // End of variables declaration//GEN-END:variables
}
