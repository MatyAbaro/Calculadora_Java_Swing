
package IGU;

import LOGICA.Controladora;
import javax.swing.JDialog;
import javax.swing.JOptionPane;



public class Principal extends javax.swing.JFrame {

    Controladora control = new Controladora(); //creo una instancia del obj Controladora llamada control.
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Calculadora");

        jLabel2.setText("Ingrese el primer numero:");

        jLabel3.setText("Ingrese el segundo numero:");

        txtNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum1KeyTyped(evt);
            }
        });

        txtNum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum2KeyTyped(evt);
            }
        });

        btnSuma.setText("SUMA");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnResta.setText("RESTA");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnMultiplicacion.setText("MULTIPLICACION");
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });

        btnDivision.setText("DIVISION");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        jLabel4.setText("RESULTADO");

        btnBorrar.setText("BORRAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnSuma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnResta)
                                .addGap(18, 18, 18)
                                .addComponent(btnMultiplicacion))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDivision)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btnBorrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuma)
                    .addComponent(btnResta)
                    .addComponent(btnMultiplicacion)
                    .addComponent(btnDivision))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBorrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
       //if para chequear que los campos no esten vacios:
        if(txtNum1.getText().equals("") || txtNum2.getText().equals("")){
            
            //advertir que los campos estan vacios
            JOptionPane cartel = new JOptionPane("Por favor rellene todos los campos");
            cartel.setMessageType(JOptionPane.ERROR_MESSAGE);
            
            JDialog dialogo = cartel.createDialog("Error");
            dialogo.setVisible(true);
            dialogo.setAlwaysOnTop(true);
        }
        else {
        double num1 = Double.parseDouble(txtNum1.getText()); //parseo el string a double.
        double num2 = Double.parseDouble(txtNum2.getText()); //parseo el string a double.
    
        double resultado = control.sumar(num1, num2); //guardo en resultado lo que devuelva el metodo.
        
        txtResultado.setText(Double.toString(resultado)); //muestro el resultado en la interfaz.
        
        }
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
      
         if(txtNum1.getText().equals("") || txtNum2.getText().equals("")){
            
            //advertir que los campos estan vacios
            JOptionPane cartel = new JOptionPane("Por favor rellene todos los campos");
            cartel.setMessageType(JOptionPane.ERROR_MESSAGE);
            
            JDialog dialogo = cartel.createDialog("Error");
            dialogo.setVisible(true);
            dialogo.setAlwaysOnTop(true);}
         else {
   
        double num1 = Double.parseDouble(txtNum1.getText());
       double num2 = Double.parseDouble(txtNum2.getText());
       
       double resultado = control.restar(num1,num2);
       
       txtResultado.setText(Double.toString(resultado));
    }//GEN-LAST:event_btnRestaActionPerformed
    }
    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        if(txtNum1.getText().equals("") || txtNum2.getText().equals("")){
            
            //advertir que los campos estan vacios
            JOptionPane cartel = new JOptionPane("Por favor rellene todos los campos");
            cartel.setMessageType(JOptionPane.ERROR_MESSAGE);
            
            JDialog dialogo = cartel.createDialog("Error");
            dialogo.setVisible(true);
            dialogo.setAlwaysOnTop(true);}
         else {
     
        
        double num1 = Double.parseDouble(txtNum1.getText());
       double num2 = Double.parseDouble(txtNum2.getText());
       double resultado = control.multiplicar(num1,num2);
       
        txtResultado.setText(Double.toString(resultado));
        
        }  
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
         
        if(txtNum1.getText().equals("") || txtNum2.getText().equals("")){
            
            //advertir que los campos estan vacios
            JOptionPane cartel = new JOptionPane("Por favor rellene todos los campos");
            cartel.setMessageType(JOptionPane.ERROR_MESSAGE);
            
            JDialog dialogo = cartel.createDialog("Error");
            dialogo.setVisible(true);
            dialogo.setAlwaysOnTop(true);}
         else { 
    
        double num1 = Double.parseDouble(txtNum1.getText());
       double num2 = Double.parseDouble(txtNum2.getText());
       double resultado = control.dividir(num1,num2);
       
        txtResultado.setText(Double.toString(resultado));
        
        }  
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
       txtNum1.setText("");
       txtNum2.setText("");
       txtResultado.setText("");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtNum1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum1KeyTyped
        //metodo que me permite no poder ingresar letras en los campos de texto:
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')){
            evt.consume();
        }
    }//GEN-LAST:event_txtNum1KeyTyped

    private void txtNum2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum2KeyTyped
       char car = evt.getKeyChar();
        if ((car < '0' || car > '9')){
            evt.consume();
        }
    }//GEN-LAST:event_txtNum2KeyTyped

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
