package main;

import java.util.Map;
import javax.swing.JOptionPane;
import obj.PokemonAgua;
import static main.PracticaPokemonHashmap.todosPokemonMap;
import obj.Pokemon;
import obj.PokemonFuego;
import obj.PokemonPlanta;

public class AltaPokemon extends javax.swing.JFrame {

    static String tipoPokemon = "";

    public AltaPokemon(java.awt.Frame parent, boolean modal) {
        initComponents();
        disableAll();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Alta Pokemon");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Ataque:");

        jLabel4.setText("Defensa");

        jLabel5.setText("Puntos de Vida:");

        jLabel6.setText("Tipo de Pokemon:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "agua", "planta", "fuego" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo de Agua:");

        jLabel8.setText("Habitat:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agua Salada", "Agua Dulce" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(20, 20, 100, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField5))
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    //Boton donde inserta todos los datos al HashMap de pokemon
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // 
        if (tipoPokemon.equals("")) {
            JOptionPane.showMessageDialog(null, "No puedes dejar el tipo de Pokemon en blanco.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (tipoPokemon.equals("agua")) {
                insertarPokeAgua();
            }
            if (tipoPokemon.equals("fuego")) {
                insertarFuego();
            }
            if (tipoPokemon.equals("planta")) {
                insertarPlanta();
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    //Boton para salir del frame actual y volver al menu principal
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        tipoPokemon = jComboBox2.getSelectedItem().toString();
        cambiarTipo(tipoPokemon);

    }//GEN-LAST:event_jComboBox2ActionPerformed

    //metodo que recoge todos los datos necesarios de los parametros dados, comprobacion de que el nombre no este duplicado e insercion al hashmap con hashAgua()
    public void insertarPokeAgua() {
        int atk = (int) jSpinner1.getValue();//coge el numero de ataque del campo en el progama
        int def = (int) jSpinner2.getValue();//coge el numero de defensa del campo en el progama
        int hp = (int) jSpinner3.getValue();//coge el numero de puntos de vida del campo en el progama
        String nombre = jTextField1.getText();//coge el nombre del campo en el progama
        String tAgua = jComboBox3.getSelectedItem().toString();//coge el tipo de agua del comboBox en el progama

        if (!nombre.isEmpty()) {//si el nombre no esta vacio    
            if (todosPokemonMap.isEmpty()) {//si el hashmap esta vacio
                hashAgua(atk, def, hp, nombre, tAgua);//metodo que introduce el pokemon con mensaje de success
            } else {//si el hashmap no esta vacio
                if(todosPokemonMap.containsKey(nombre)){//mirara el hashmap si hay algun nombre duplicado
                    foundDuplicate();//si hay un nombre duplicado saldra un mensaje de error de nombre duplicado
                }
                else{//si no hay nombre duplicado
                    hashAgua(atk, def, hp, nombre, tAgua);//llamara el metodo para introducir un pokemon de agua con sus atributos
                }
            }
        } else {//si el nombre esta vacio
            notInsertedNombre();//si no hay un nombre saldra un mensaje de error de nombre no introducido
        }
    }
    //metodo de introduccion de pokemon agua al hashmap
    public void hashAgua(int atk, int def, int hp, String nombre, String tAgua) {
        PokemonAgua n = new PokemonAgua(tAgua, nombre, atk, def, hp);//coge todos los valores introducidos y crea un objeto PokemonAgua
        todosPokemonMap.put(n.getNombre(), n);//introduce el pokemon creado anteriormente y lo introduce en el hashmap con una llave(nombre del pokemon) y un valor(pokemon)
        System.out.println(n);//print para comprobar que el pokemon introducido
        System.out.println(todosPokemonMap);//print para comprobar el hashmap despues de la introducion del pokemon
        JOptionPane.showMessageDialog(null, "Se ha insertado correctamente el Pokemon tipo Agua.", "Success", JOptionPane.INFORMATION_MESSAGE);//salida del menssage que dice que se ha introducido correctamente
    }

    //metodo que recoge todos los datos necesarios de los parametros dados, comprobacion de que el nombre no este duplicado e insercion al hashmap con hashFuego()
    //este insertar es similar al anterior menos el campo de tipo de agua
    //este insertar es el mas simple y basico de los tres
    public void insertarFuego() {
        int atk = (int) jSpinner1.getValue();
        int def = (int) jSpinner2.getValue();
        int hp = (int) jSpinner3.getValue();
        String nombre = jTextField1.getText();

        if (!nombre.isEmpty()) {
            if (todosPokemonMap.isEmpty()) {
                hashFuego(atk, def, hp, nombre);
            } else {
                if(todosPokemonMap.containsKey(nombre)){
                foundDuplicate();
                }
                else{
                    hashFuego(atk, def, hp, nombre);
                }
            }
        } else {
            notInsertedNombre();
        }
    }
    //metodo de introduccion de pokemon fuego al hashmap
    //metodo similar a los otros dos(hashAgua, hashPlanta) y tambien el mas simple de los tres
    public void hashFuego(int atk, int def, int hp, String nombre) {
        PokemonFuego n = new PokemonFuego(nombre, atk, def, hp);
        todosPokemonMap.put(n.getNombre(), n);
        System.out.println(n);
        System.out.println(todosPokemonMap);
        JOptionPane.showMessageDialog(null, "Se ha insertado correctamente el Pokemon tipo Fuego.", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    //metodo que recoge todos los datos necesarios de los parametros dados, comprobacion de que el nombre no este duplicado, que el campo de habitat no este vacio
    //e insercion al hashmap con hashPlanta()
    public void insertarPlanta() {
        int atk = (int) jSpinner1.getValue();//coge el numero de ataque del campo en el progama
        int def = (int) jSpinner2.getValue();//coge el numero de defensa del campo en el progama
        int hp = (int) jSpinner3.getValue();//coge el numero de puntos de vida del campo en el progama
        String nombre = jTextField1.getText();//coge el nombre del campo en el progama
        String habitat = jTextField5.getText();//coge el habitat del campo en el progama
        if (!nombre.isEmpty()) {//si el campo nombre no esta vacio
            if (!habitat.isEmpty()) {//si el campo habitat no esta vacio
                if (todosPokemonMap.isEmpty()) {//si el hashmap esta vacio
                    hashPlanta(atk, def, hp, nombre, habitat);//cogera
                } else {//si el hasmap no esta vacio
                    if(todosPokemonMap.containsKey(nombre)){
                        foundDuplicate();
                    }else{
                        hashPlanta(atk, def, hp, nombre, habitat);
                    }
                }
            } else {
                notInsertedHabitat();
            }
        } else {
            notInsertedNombre();
        }
    }
    //metodo de introduccion de pokemon planta al hashmap
    public void hashPlanta(int atk, int def, int hp, String nombre, String habitat) {
        PokemonPlanta n = new PokemonPlanta(habitat, nombre, atk, def, hp);
        todosPokemonMap.put(n.getNombre(), n);
        System.out.println(n);
        System.out.println(todosPokemonMap);
        JOptionPane.showMessageDialog(null, "Se ha insertado correctamente el Pokemon tipo Planta.", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    //metodo de mensaje de error de nombre no introducido
    public void notInsertedNombre(){
        JOptionPane.showMessageDialog(null, "No se ha introducido un nombre.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    //metodo de mensaje de error de habitat no introducido
    public void notInsertedHabitat(){
        JOptionPane.showMessageDialog(null, "No se ha introducido un habitat.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    //metodo de mensaje de error de nombre duplicado encontrado
    public void foundDuplicate(){
        JOptionPane.showMessageDialog(null, "Ya hay un Pokemon con el mismo nombre.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    //Metodo para quitar poder usar los botones
    public void disableAll() {
        jComboBox3.setEnabled(false);
        jTextField5.setEditable(false);
    }

    //Metodo para cambiar campos habilitados
    public void cambiarTipo(String tipo) {
        disableAll();
        if (!(tipo.equals(""))) {
            if (tipo.equals("agua")) {
                jComboBox3.setEnabled(true);
            }
            if (tipo.equals("planta")) {
                jTextField5.setEditable(true);
            }
            if (tipo.equals("fuego")) {
                disableAll();
            }
        } else {
            disableAll();
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AltaPokemon dialog = new AltaPokemon(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
