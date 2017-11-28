package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import static main.PracticaPokemonHashmap.todosPokemonMap;
import obj.Pokemon;
import obj.PokemonAgua;
import obj.PokemonFuego;
import obj.PokemonPlanta;

public class VerPokemon extends javax.swing.JFrame {

    ArrayList<Pokemon> searchPokemon = new ArrayList<>();
    int actual = 0;

    public VerPokemon(java.awt.Frame parent, boolean modal) {
        limpiarLista();
        initComponents();
        disableAllEnters();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ver Pokemon");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos Pokemon", "Agua", "Fuego", "Planta" }));

        jLabel2.setText("Buscar por tipo:");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Anterior");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Siguiente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jLabel4.setText("Tipo:");

        jLabel5.setText("Ataque:");

        jLabel6.setText("Defensa:");

        jLabel7.setText("Puntos de Salud:");

        jLabel8.setText("Habitat:");

        jLabel9.setText("Tipo de Agua:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton4.setText("Return");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(68, 68, 68))
                            .addComponent(jLabel5))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3)
                            .addComponent(jTextField1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //al apretar el botton de buscar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //recoge el valor en el comboBox seleccionado
        String tipoLista = jComboBox1.getSelectedItem().toString();
        //dependiendo de valor recogido con el switch recogera datos del tipo de pokemon buscado
        switch (tipoLista) {
            case "Todos Pokemon"://este caso, reocge todos los Pokemon en el array
                clearText();
                getAllPokemon();//llama al metodo especifico a el
                break;
            case "Agua"://este caso, reocge todos los PokemonAgua en el array
                clearText();
                getAllWater();//llama al metodo especifico a el
                break;
            case "Fuego"://este caso, reocge todos los PokemonFuego en el array
                clearText();
                getAllFire();//llama al metodo especifico a el
                break;
            case "Planta"://este caso, reocge todos los PokemonPlanta en el array
                clearText();
                getAllPlant();//llama al metodo especifico a el
                break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        actual += 1;
        insertarBusqueda(actual);
        checkPosicion(actual);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        actual -= 1;
        insertarBusqueda(actual);
        checkPosicion(actual);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    //metodo que coge todos los Pokemon de la lista
    public void getAllPokemon() { 
        limpiarLista();//limpia la arrayList de este documento antes para que no hayan problemas
        if (todosPokemonMap.isEmpty()) {//si el Hashmap de todosPokemon esta vacia
            emptyList();//saldra un mensaje de error para indicar que no hay pokemon en el hashmap
        } else {//si contiene algo
            for (Map.Entry<String, Pokemon> entry : todosPokemonMap.entrySet()) {//recorrera todo el hasmap
                searchPokemon.add(entry.getValue()); //añadira al ArrayList la informacion encontrada
                insertarBusqueda(actual);//Como actual comienza en numero 0, al hacer la primera busqueda añadira el primer pokemon
            }
            checkPosicion(actual);//con checkPosicion se comprueba si tiene anterior o siguiente
        }
    }
    
    //metodo que coge todos los PokemonAgua de la lista
    //similar a getAllPokemon pero un poco mas complicado ya que añade otros valores
    public void getAllWater() {
        limpiarLista();
        int contador=0;
        if (todosPokemonMap.isEmpty()) {
            emptyList();
        } else {
            for (Map.Entry<String, Pokemon> entry : todosPokemonMap.entrySet()) {
                if (entry.getValue() instanceof PokemonAgua) {
                    searchPokemon.add(entry.getValue());
                    insertarBusqueda(actual);
                    contador++;
                }
            }
            if(contador==0){
                emptyAgua();
            }
            else{
                checkPosicion(actual);
            }
        }
    }

    public void getAllFire() {
        limpiarLista();
        int contador=0;
        if (todosPokemonMap.isEmpty()) {
            emptyList();
        } else {
            for (Map.Entry<String, Pokemon> entry : todosPokemonMap.entrySet()) {
                if (entry.getValue() instanceof PokemonFuego) {
                    searchPokemon.add(entry.getValue());
                    insertarBusqueda(actual);
                    contador++;
                }
            }
            if(contador==0){
                emptyFuego();
            }
            else{
                checkPosicion(actual);
            }
        }
    }

    public void getAllPlant() {
        limpiarLista();
        int contador=0;
        if (todosPokemonMap.isEmpty()) {
            emptyList();
        } else {
            for (Map.Entry<String, Pokemon> entry : todosPokemonMap.entrySet()) {
                if (entry.getValue() instanceof PokemonPlanta) {
                    searchPokemon.add(entry.getValue());
                    insertarBusqueda(actual);
                    contador++;
                }
            }
            if(contador==0){
                emptyPlanta();
            }
            else{
                checkPosicion(actual);
            }
        }
    }

    //limpia la arraylist y el contador de posicion actual para que errores no salgan
    public void limpiarLista() {
        searchPokemon.clear();
        actual = 0;
        

    }

    //deshabilita todos los botones y los text inputs no pueden ser rescritos ni se pueden escribir nada en ellos
    public void disableAllEnters() {
        jTextField1.setEditable(false);//deshabilita un jtextfield para que no se pueda editar
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);

        jButton2.setEnabled(false);//deshabilita un boton para que no pueda ser clicado
        jButton3.setEnabled(false);
    }

    //comprubea la posicion actual
    public void checkPosicion(int actual) {
        if (actual == 0) { //0 seria el comenzamiento, si el contador actual es igual a 0 este dehabilitara el boton de anterior
            jButton2.setEnabled(false);
        } else {
            jButton2.setEnabled(true); //si no es asi lo habilita
        }
        if (actual == (searchPokemon.size() - 1)) { //mira el tamaño del arraylist y el si el contador actual es igual que el tamaño deshabilita el boton siguiente
            jButton3.setEnabled(false);
        } else {
            jButton3.setEnabled(true);//si no es asi lo habilita
        }
    }

    //añade a los todos los campos los parametros que tenga el pokemon
    public void insertarBusqueda(int actual) {

        jTextField1.setText(searchPokemon.get(actual).getNombre());
        if (searchPokemon.get(actual) instanceof PokemonAgua) {
            jTextField2.setText("Agua");
        }
        if (searchPokemon.get(actual) instanceof PokemonPlanta) {
            jTextField2.setText("Planta");
        }
        if (searchPokemon.get(actual) instanceof PokemonFuego) {
            jTextField2.setText("Fuego");
        }

        jTextField3.setText(Integer.toString(searchPokemon.get(actual).getAtk()));
        jTextField4.setText(Integer.toString(searchPokemon.get(actual).getDef()));
        jTextField5.setText(Integer.toString(searchPokemon.get(actual).getHp()));
        if (searchPokemon.get(actual) instanceof PokemonPlanta) {
            PokemonPlanta n = (PokemonPlanta) searchPokemon.get(actual);
            jTextField6.setText(n.getHabitat());
            jTextField7.setText("");
        }
        if (searchPokemon.get(actual) instanceof PokemonAgua) {
            PokemonAgua n = (PokemonAgua) searchPokemon.get(actual);
            jTextField7.setText(n.getTipo());
            jTextField6.setText("");
        }
        if (searchPokemon.get(actual) instanceof PokemonFuego) {
            PokemonFuego n = (PokemonFuego) searchPokemon.get(actual);
            jTextField6.setText("");
            jTextField7.setText("");
        }
    }

    public void emptyList() {
        JOptionPane.showMessageDialog(null, "No hay Pokemon en la lista", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void emptyAgua() {
        JOptionPane.showMessageDialog(null, "No hay PokemonAgua en la lista", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void emptyPlanta() {
        JOptionPane.showMessageDialog(null, "No hay PokemonPlanta en la lista", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void emptyFuego() {
        JOptionPane.showMessageDialog(null, "No hay PokemonFuego en la lista", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void clearText(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");}

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
            java.util.logging.Logger.getLogger(VerPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VerPokemon dialog = new VerPokemon(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
