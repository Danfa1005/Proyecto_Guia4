
package Programa_Ahorro;

//Importaciones
import com.j256.ormlite.dao.*;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException; 
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Menu extends javax.swing.JFrame {
    
    static Dao<Ahorro, Integer> bdAhorro; //Para el manejo de la base de datos
    
    public Menu() {
        
        initComponents();
        
        //Actualizar JTable al inicializar programa
        DefaultTableModel dtm = (DefaultTableModel) tablaAhorro.getModel();
        dtm.setRowCount(0);       
        try {
            for (Ahorro a: bdAhorro.queryForAll()) {
                Object[] fila = {a.getNumero_Ahorro(), a.getMoneda_Cambio(), a.getDia_1(), a.getDia_2(), a.getDia_3(),
                    a.getDia_4(), a.getDia_5(), a.getDia_6(), a.getDia_7(), a.getTasa_Efeanu(), a.getTiempo_Ahorro(),
                    a.getMeta_Ahorro()};
                dtm.addRow(fila);
            } //Fin de for
        } catch (SQLException ex) {
            dtm.setRowCount(0); //Excepción cuando no se tiene información
        }
        
    }
    
    //Creacion y llamada al frame Semana
    Semana semana = new Semana();
    
    //Creacion y llamada al frame Mes
    Mes mes = new Mes();
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        numero_Ahorro = new javax.swing.JTextField();
        dia_1 = new javax.swing.JTextField();
        dia_2 = new javax.swing.JTextField();
        dia_3 = new javax.swing.JTextField();
        dia_4 = new javax.swing.JTextField();
        dia_5 = new javax.swing.JTextField();
        dia_6 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        dia_7 = new javax.swing.JTextField();
        tasa_Efeanu = new javax.swing.JTextField();
        tiempo_Ahorro = new javax.swing.JTextField();
        meta_Ahorro = new javax.swing.JTextField();
        moneda_Cambio = new javax.swing.JComboBox<>();
        guardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAhorro = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        pro_mes = new javax.swing.JButton();
        pro_sem = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        cerrar = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        semanal = new javax.swing.JMenuItem();
        mensual = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(300, 100));
        setResizable(false);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setText("Calculadora de Ahorro");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("¡Bienvenido!");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Número de Ahorro:");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setText("Moneda de cambio:");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setText("Lunes:");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setText("Martes:");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel10.setText("Miercoles:");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel11.setText("Jueves:");

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel12.setText("Viernes:");

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel13.setText("Sabado:");

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel14.setText("Tasa Efectiva Anual (%):");

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel15.setText("Tiempo Ahorro (Meses):");

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel17.setText("Meta de ahorro (Valor):");

        numero_Ahorro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        dia_1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        dia_2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        dia_3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        dia_4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        dia_5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        dia_6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel18.setText("Domingo:");

        dia_7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        tasa_Efeanu.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tasa_Efeanu.setToolTipText("Ingresar un 0 si no se guarda el dinero en una Cuenta de Ahorro.");

        tiempo_Ahorro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        meta_Ahorro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        moneda_Cambio.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        moneda_Cambio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COP", "USD", "EUR" }));

        guardar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        tablaAhorro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tablaAhorro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Número", "Moneda", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo", "TEA (%)", "Meses", "Meta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAhorro.setToolTipText("Doble click para mostrar detalle de ahorro ");
        tablaAhorro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAhorroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAhorro);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Ahorros Guardados");

        buscar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        modificar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        borrar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        pro_mes.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pro_mes.setText("Proyección Mensual");
        pro_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_mesActionPerformed(evt);
            }
        });

        pro_sem.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pro_sem.setText("Proyección Semanal");
        pro_sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_semActionPerformed(evt);
            }
        });

        archivo.setText("Archivo");

        cerrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        cerrar.setText("Cerrar");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        archivo.add(cerrar);

        jMenuBar1.add(archivo);

        jMenu1.setText("Proyecciones");

        semanal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        semanal.setText("Semanal");
        semanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semanalActionPerformed(evt);
            }
        });
        jMenu1.add(semanal);

        mensual.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mensual.setText("Mensual");
        mensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensualActionPerformed(evt);
            }
        });
        jMenu1.add(mensual);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(dia_7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dia_1)
                            .addComponent(dia_2)
                            .addComponent(dia_3)
                            .addComponent(dia_4)
                            .addComponent(dia_5)
                            .addComponent(dia_6)
                            .addComponent(meta_Ahorro, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moneda_Cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tiempo_Ahorro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(tasa_Efeanu, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(guardar)
                        .addGap(18, 18, 18)
                        .addComponent(modificar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numero_Ahorro, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(borrar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(337, 337, 337))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(pro_sem)
                                .addGap(29, 29, 29)
                                .addComponent(pro_mes)
                                .addGap(238, 238, 238))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(459, 459, 459)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel3)
                        .addGap(127, 127, 127)))
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borrar)
                    .addComponent(buscar)
                    .addComponent(numero_Ahorro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(moneda_Cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dia_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(dia_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(dia_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(dia_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(dia_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(dia_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(dia_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(tasa_Efeanu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(tiempo_Ahorro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(meta_Ahorro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guardar)
                            .addComponent(modificar))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pro_mes)
                            .addComponent(pro_sem))
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
        try {
                       
            int numero = Integer.parseInt(numero_Ahorro.getText()); //Ingreso para numero de ahorro                
            String moneda = moneda_Cambio.getSelectedItem().toString(); //Ingreso para moneda de cambio
            
            //Declaracion de variables para dias, tasa y tiempo e ingreso
            double d1, d2, d3, d4, d5, d6, d7;
            
            //En caso de que la moneda sea COP
            if (moneda.equals("COP")) {
                d1 = Math.round(Double.parseDouble(dia_1.getText()));
                d2 = Math.round(Double.parseDouble(dia_2.getText()));
                d3 = Math.round(Double.parseDouble(dia_3.getText()));
                d4 = Math.round(Double.parseDouble(dia_4.getText()));
                d5 = Math.round(Double.parseDouble(dia_5.getText()));
                d6 = Math.round(Double.parseDouble(dia_6.getText()));
                d7 = Math.round(Double.parseDouble(dia_7.getText()));
            } //Fin de if
            else {
                d1 = Math.round(Double.parseDouble(dia_1.getText())*100)/100.0;
                d2 = Math.round(Double.parseDouble(dia_2.getText())*100)/100.0;
                d3 = Math.round(Double.parseDouble(dia_3.getText())*100)/100.0;
                d4 = Math.round(Double.parseDouble(dia_4.getText())*100)/100.0;
                d5 = Math.round(Double.parseDouble(dia_5.getText())*100)/100.0;
                d6 = Math.round(Double.parseDouble(dia_6.getText())*100)/100.0;
                d7 = Math.round(Double.parseDouble(dia_7.getText())*100)/100.0;                
            } //Fin de else 
            
            double tasa = Math.round(Double.parseDouble(tasa_Efeanu.getText())*100)/100.0; //Ingreso para TEA
            double tiempo = Math.round(Double.parseDouble(tiempo_Ahorro.getText())*100)/100.0; //Ingreso para tiempo 
                        
            //Declaracion de variables para meta e ingreso
            double meta;
            
            //En caso de que la moneda sea COP
            if (moneda.equals("COP")) {
                meta = Double.parseDouble(meta_Ahorro.getText());
            } //Fin de if
            else {
                meta = Math.round(Double.parseDouble(meta_Ahorro.getText())*100)/100.0;
            } //Fin de else
            
            //Creación de objeto junto con los datos, guardado en bd y confirmacion a usuario
            Ahorro ahorro = new Ahorro(numero, moneda, d1, d2, d3, d4, d5, d6, d7, tasa, tiempo, meta);
                
            bdAhorro.create(ahorro);
            
            //Mostrar información en el JTable
            DefaultTableModel dtm = (DefaultTableModel) tablaAhorro.getModel();
            dtm.setRowCount(0); //Para no repetir la información
            for (Ahorro a: bdAhorro.queryForAll()) {
                Object[] fila = {a.getNumero_Ahorro(), a.getMoneda_Cambio(), a.getDia_1(), a.getDia_2(), a.getDia_3(),
                                a.getDia_4(), a.getDia_5(), a.getDia_6(), a.getDia_7(), a.getTasa_Efeanu(), a.getTiempo_Ahorro(),
                                a.getMeta_Ahorro()};
                dtm.addRow(fila);
            } //Fin de for    
            JOptionPane.showMessageDialog(null, "Se guardo correctamente. \nHay " + bdAhorro.countOf()+ " ahorros guardados.", "¡Información Guardada!", JOptionPane.INFORMATION_MESSAGE);                        
        }  
        catch (SQLException ex) {            
            JOptionPane.showMessageDialog(null, "Ocurrio un error y no se pudo guardar la información. \nRevisa si ya tienes guardado el mismo numero de ahorro.", "¡Error!", JOptionPane.ERROR_MESSAGE);
        } //Fin de excepción para inclusión a base de datos                
        
    }//GEN-LAST:event_guardarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        
        int busqueda = Integer.parseInt(numero_Ahorro.getText());
        
        try {
            Ahorro ahorro = bdAhorro.queryForId(busqueda); //Buscar en la base de datos por el identificador especificado por el usuario
            
            if (ahorro != null) {
                moneda_Cambio.setSelectedItem(ahorro.getMoneda_Cambio()); //Para JComboBox
                dia_1.setText(String.valueOf(ahorro.getDia_1()));
                dia_2.setText(String.valueOf(ahorro.getDia_2()));
                dia_3.setText(String.valueOf(ahorro.getDia_3()));
                dia_4.setText(String.valueOf(ahorro.getDia_4()));
                dia_5.setText(String.valueOf(ahorro.getDia_5()));
                dia_6.setText(String.valueOf(ahorro.getDia_6()));
                dia_7.setText(String.valueOf(ahorro.getDia_7()));
                tasa_Efeanu.setText(String.valueOf(ahorro.getTasa_Efeanu()));
                tiempo_Ahorro.setText(String.valueOf(ahorro.getTiempo_Ahorro()));
                meta_Ahorro.setText(String.valueOf(ahorro.getMeta_Ahorro()));
            } //Fin de if
            else {
                JOptionPane.showMessageDialog(null, "El numero de ahorro " + busqueda + " no existe.");
                moneda_Cambio.setSelectedIndex(0); //Para JComboBox
                dia_1.setText("");
                dia_2.setText(""); 
                dia_3.setText("");
                dia_4.setText("");
                dia_5.setText("");
                dia_6.setText("");
                dia_7.setText("");
                tasa_Efeanu.setText("");
                tiempo_Ahorro.setText("");
                meta_Ahorro.setText("");
            } //Fin de else
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la busqueda.", "¡Error!", JOptionPane.ERROR_MESSAGE);
        } //Fin de excepcion
        
    }//GEN-LAST:event_buscarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        
        try {
            int numero = Integer.parseInt(numero_Ahorro.getText()); //Ingreso para numero de ahorro
            String moneda = moneda_Cambio.getSelectedItem().toString(); //Ingreso para moneda de cambio
            
            //Declaracion de variables para dias, tasa y tiempo e ingreso
                double d1, d2, d3, d4, d5, d6, d7;
                
                //En caso de ser cop
                if (moneda.equals("COP")) {
                    d1 = Math.round(Double.parseDouble(dia_1.getText()));
                    d2 = Math.round(Double.parseDouble(dia_2.getText()));
                    d3 = Math.round(Double.parseDouble(dia_3.getText()));
                    d4 = Math.round(Double.parseDouble(dia_4.getText()));
                    d5 = Math.round(Double.parseDouble(dia_5.getText()));
                    d6 = Math.round(Double.parseDouble(dia_6.getText()));
                    d7 = Math.round(Double.parseDouble(dia_7.getText()));
                } //Fin de if
                else {
                    d1 = Math.round(Double.parseDouble(dia_1.getText())*100)/100.0;
                    d2 = Math.round(Double.parseDouble(dia_2.getText())*100)/100.0;
                    d3 = Math.round(Double.parseDouble(dia_3.getText())*100)/100.0;
                    d4 = Math.round(Double.parseDouble(dia_4.getText())*100)/100.0;
                    d5 = Math.round(Double.parseDouble(dia_5.getText())*100)/100.0;
                    d6 = Math.round(Double.parseDouble(dia_6.getText())*100)/100.0;
                    d7 = Math.round(Double.parseDouble(dia_7.getText())*100)/100.0;                
                } //Fin de else
                
                double tasa = Math.round(Double.parseDouble(tasa_Efeanu.getText())*100)/100.0; //Ingreso para TEA
                double tiempo = Math.round(Double.parseDouble(tiempo_Ahorro.getText())*100)/100.0; //Ingreso para tiempo
                
                //Declaracion de variables para meta e ingreso
                double meta;
                
                //En caso de ser cop
                if (moneda.equals("COP")) {
                    meta = Math.round(Double.parseDouble(meta_Ahorro.getText()));
                } //Fin de if
                else {
                    meta = Math.round(Double.parseDouble(meta_Ahorro.getText())*100)/100.0;
                } //Fin de else
            
            //Modificación de objeto y mensaje de confirmación al usuario
            Ahorro ahorro = new Ahorro(numero, moneda, d1, d2, d3, d4, d5, d6, d7, tasa, tiempo, meta);
            
            bdAhorro.update(ahorro);
            
            //Mostrar información en el JTable
            DefaultTableModel dtm = (DefaultTableModel) tablaAhorro.getModel();
            dtm.setRowCount(0); //Para no repetir la información
            for (Ahorro a: bdAhorro.queryForAll()) {
                Object[] fila = {a.getNumero_Ahorro(), a.getMoneda_Cambio(), a.getDia_1(), a.getDia_2(), a.getDia_3(),
                                a.getDia_4(), a.getDia_5(), a.getDia_6(), a.getDia_7(), a.getTasa_Efeanu(), a.getTiempo_Ahorro(),
                                a.getMeta_Ahorro()};
                dtm.addRow(fila);            
            }
            
            JOptionPane.showMessageDialog(null, "Se modifico la información del ahorro.", "¡Información Cambiada!", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error y no se pudo modificar la información.", "¡Error!", JOptionPane.ERROR_MESSAGE);
        } //Fin de Excepcion
        
    }//GEN-LAST:event_modificarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        
        int del = Integer.parseInt(numero_Ahorro.getText());
        
        try { //Borrar en la base de datos a partir del numero de ahorro y confirmación del usuario
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro desea borrar la información?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                bdAhorro.deleteById(del);
                numero_Ahorro.setText("");
                moneda_Cambio.setSelectedIndex(0); //Para JComboBox
                dia_1.setText("");
                dia_2.setText(""); 
                dia_3.setText("");
                dia_4.setText("");
                dia_5.setText("");
                dia_6.setText("");
                dia_7.setText("");
                tasa_Efeanu.setText("");
                tiempo_Ahorro.setText("");
                meta_Ahorro.setText("");
                DefaultTableModel dtm = (DefaultTableModel) tablaAhorro.getModel();
                dtm.setRowCount(0); //Para no repetir la información
                for (Ahorro a: bdAhorro.queryForAll()) {
                    Object[] fila = {a.getNumero_Ahorro(), a.getMoneda_Cambio(), a.getDia_1(), a.getDia_2(), a.getDia_3(),
                                     a.getDia_4(), a.getDia_5(), a.getDia_6(), a.getDia_7(), a.getTasa_Efeanu(), a.getTiempo_Ahorro(),
                                     a.getMeta_Ahorro()};
                    dtm.addRow(fila);
                } //Fin de for
            } //Fin de if
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error y no se pudo eliminar la información.", "¡Error!", JOptionPane.ERROR_MESSAGE);
        } //Fin de excepción
        
    }//GEN-LAST:event_borrarActionPerformed
    
    private void tablaAhorroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAhorroMouseClicked
        
        //Para buscar en la fila a partir de un doble click
        if (evt.getClickCount() == 2) {
            //variables de seleccion de indice 
            int indice = tablaAhorro.getSelectedRow();
            TableModel modelo = tablaAhorro.getModel();
            int busqueda = (int) modelo.getValueAt(indice,0);
            //Busqueda en la base de datos y puesta en los JTextFields
            try {
                Ahorro ahorro = bdAhorro.queryForId(busqueda); //Buscar en la base de datos por el identificador especificado por el usuario
                numero_Ahorro.setText(String.valueOf(ahorro.getNumero_Ahorro()));
                moneda_Cambio.setSelectedItem(ahorro.getMoneda_Cambio()); //Para JComboBox
                dia_1.setText(String.valueOf(ahorro.getDia_1()));
                dia_2.setText(String.valueOf(ahorro.getDia_2()));
                dia_3.setText(String.valueOf(ahorro.getDia_3()));
                dia_4.setText(String.valueOf(ahorro.getDia_4()));
                dia_5.setText(String.valueOf(ahorro.getDia_5()));
                dia_6.setText(String.valueOf(ahorro.getDia_6()));
                dia_7.setText(String.valueOf(ahorro.getDia_7()));
                tasa_Efeanu.setText(String.valueOf(ahorro.getTasa_Efeanu()));
                tiempo_Ahorro.setText(String.valueOf(ahorro.getTiempo_Ahorro()));
                meta_Ahorro.setText(String.valueOf(ahorro.getMeta_Ahorro()));
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la busqueda.", "¡Error!", JOptionPane.ERROR_MESSAGE);
            } //Fin de excepcion
            
        } //Fin de if       
        
    }//GEN-LAST:event_tablaAhorroMouseClicked
    
    private void pro_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_mesActionPerformed
        
       try {
            //Declaracion de variables para obtener valores de la seleccion en el JTable
            int indice = tablaAhorro.getSelectedRow();       
            TableModel modelo = tablaAhorro.getModel();
        
            String numero = modelo.getValueAt(indice,0).toString();
            String moneda = modelo.getValueAt(indice,1).toString();            
            double d1 = (double) modelo.getValueAt(indice,2);
            double d2 = (double) modelo.getValueAt(indice,3);
            double d3 = (double) modelo.getValueAt(indice,4);
            double d4 = (double) modelo.getValueAt(indice,5);
            double d5 = (double) modelo.getValueAt(indice,6);
            double d6 = (double) modelo.getValueAt(indice,7);
            double d7 = (double) modelo.getValueAt(indice,8);
            double tea = (double) modelo.getValueAt(indice, 9);
            double tiempo = (double) modelo.getValueAt(indice,10);
            double meta = (double) modelo.getValueAt(indice,11);

            //Declaracion de variables y calculos
            double total_Semana = d1 + d2 + d3 + d4 + d5 + d6 + d7; //Para total de valor en una semana
            double tem= (Math.pow((1+(tea/100)),0.083333333333333))-1; //para conversion de TEA a TEM
            double total_Mes = total_Semana * 4.34524; //Para total de valor en un mes
            double valor_Futuro = 0;
            double logro_Meta;
            double meses_Requeridos;
            
            //En caso de que la moneda sea COP  
            if (moneda.equals("COP")) {
                    
                //En caso de que TEM sea 0
                if (tem==0){
                    valor_Futuro = Math.round(total_Mes*tiempo);
                } // Fin de if
                else {
                    for (int i = 0; i < tiempo; i++) {
                        valor_Futuro = Math.round(valor_Futuro + (total_Mes*(Math.pow((1+tem),i))) ); //Calculo para valor futuro
                    } //Fin de for    
                } //Fin de else
                                        
            } //Fin de if
            else {
                    
                //En caso de que TEM sea 0
                if (tem==0){
                    valor_Futuro = Math.round((total_Mes*tiempo)*100)/100.0;
                } // Fin de if
                else {
                    for (int i = 0; i < tiempo; i++) {
                        valor_Futuro = Math.round((valor_Futuro + (total_Mes*(Math.pow((1+tem),i)))) *100 ) /100.0;
                    } //Fin de for    
                } //Fin de else
                                       
            } //Fin de else
            
            //En caso de que logro_Meta sea mayor a 100 y no se requieran meses adicionales           
            if (valor_Futuro > meta) {
                logro_Meta = 100;
                meses_Requeridos = 0;
            } //Fin de if
            else {
                logro_Meta = Math.round(((valor_Futuro/meta)*100)*10)/10.0; //Calculo para porcentaje de cumplimiento de meta
                meses_Requeridos = Math.round(((meta-valor_Futuro) / (valor_Futuro/tiempo))*10)/10.0; //Calculo para meses requeridos
            } //Fin de else
                
            int prog_Meta = (int) logro_Meta; //Para mostrar en el JProgressBar
                                  
            //Inicialización de Frame Semana        
            mes.setVisible(true);
            mes.pack();
            mes.setLocationRelativeTo(null);

            //Establecimiento de texto en el frame Semana 
            mes.numero.setText(numero);
            mes.moneda.setText(moneda);
            mes.meses.setText(String.valueOf(tiempo));
            
            //En caso de ser USD o COP
            if (moneda.equals("USD") || moneda.equals("COP")) {
                mes.meta.setText("$ " + String.valueOf(meta));
                mes.valorFuturo.setText("$ " + String.valueOf(valor_Futuro));                
            } //Fin de if
            else {
                mes.meta.setText("€ " + String.valueOf(meta));
                mes.valorFuturo.setText("€ " + String.valueOf(valor_Futuro));
            } //Fin de else    
            
            mes.progreso.setValue(prog_Meta); //Para el progress bar             
            mes.porcentaje.setText(String.valueOf(logro_Meta)+ " %"); //Para mostrar el porcentaje de cumplimiento
            mes.mesesAd.setText(String.valueOf(meses_Requeridos));         
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fila de la lista.", "¡Error!", JOptionPane.ERROR_MESSAGE);
        } //Fin de excepcion
        
    }//GEN-LAST:event_pro_mesActionPerformed

    private void pro_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_semActionPerformed
        
        try {
            //Declaracion de variables para obtener valores de la seleccion en el JTable
            int indice = tablaAhorro.getSelectedRow();       
            TableModel modelo = tablaAhorro.getModel();
        
            String numero = modelo.getValueAt(indice,0).toString();
            String moneda = modelo.getValueAt(indice,1).toString();
            double d1 = (double) modelo.getValueAt(indice,2);
            double d2 = (double) modelo.getValueAt(indice,3);
            double d3 = (double) modelo.getValueAt(indice,4);
            double d4 = (double) modelo.getValueAt(indice,5);
            double d5 = (double) modelo.getValueAt(indice,6);
            double d6 = (double) modelo.getValueAt(indice,7);
            double d7 = (double) modelo.getValueAt(indice,8);

            //Declaracion de variables y calculos
            double total_Semana = d1 + d2 + d3 + d4 + d5 + d6 + d7; //Para total de la semana
            double mayor, menor;
            String dia_mayor = null, dia_menor = null;
            double listaDias[] = new double[]{d1, d2, d3, d4, d5, d6, d7};
            String dias [] = new String[] {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
            mayor = menor = listaDias[0];

            //Iteración para descubrir el numero mayor, menor y dia respectivo para el Frame Semana        
            for (int i = 0; i < listaDias.length ; i++) {
                
                if (listaDias[i] >= mayor) {
                    mayor = listaDias[i];
                    dia_mayor = dias[i];
                } //Fin de for
                else if (listaDias[i] <= menor) {
                    menor = listaDias[i];
                    dia_menor = dias[i];
                } //Fin de else if
                
            } //Fin de for 

            //Inicialización de Frame Semana        
            semana.setVisible(true);
            semana.pack();
            semana.setLocationRelativeTo(null);
            
            //Establecimiento de texto en el frame Semana 
            semana.numero.setText(numero);
            semana.moneda.setText(moneda);
            
            //En caso de ser USD o COP
            if (moneda.equals("USD") || moneda.equals("COP")) {
                semana.total.setText("$ " + String.valueOf(total_Semana));
                semana.mayor.setText("$ " + String.valueOf(mayor));
                semana.menor.setText("$ " + String.valueOf(menor));
            } //Fin de if
            else {
                semana.total.setText("€ " + String.valueOf(total_Semana));
                semana.mayor.setText("€ " + String.valueOf(mayor));
                semana.menor.setText("€ " + String.valueOf(menor));
            } //Fin de else
                                    
            //En caso de dia_menor ser null
            if (dia_menor == null) {
                String dia_menor1 = "Lunes";
                semana.menor1.setText(dia_menor1);
            } //Fin de if            
            else {
                semana.menor1.setText(dia_menor);
            } //Fin de else
            
            //En caso de que todos los dias sean iguales
            if (d1 == d2 && d2 == d3 && d3 == d4 && d4 == d5 && d5 == d6 && d6 == d7) {
                String igualdad = "Dias iguales";
                semana.mayor1.setText(igualdad);
                semana.menor1.setText(igualdad);
            } //Fin de if            
            else {
                semana.mayor1.setText(dia_mayor);
            } //Fin de else
            
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fila de la lista.", "¡Error!", JOptionPane.ERROR_MESSAGE);
        } //Fin de excepcion
        
    }//GEN-LAST:event_pro_semActionPerformed

    private void semanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semanalActionPerformed
        
        //Declaracion de busqueda
        int busqueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de ahorro: "));
        
        try {
            Ahorro ahorro = bdAhorro.queryForId(busqueda);
                        
            if (ahorro != null) {
                int numero = ahorro.getNumero_Ahorro();
                String moneda = ahorro.getMoneda_Cambio(); 
                double d1 = ahorro.getDia_1();
                double d2 = ahorro.getDia_2();
                double d3 = ahorro.getDia_3();
                double d4 = ahorro.getDia_4();
                double d5 = ahorro.getDia_5();
                double d6 = ahorro.getDia_6();
                double d7 = ahorro.getDia_7();
                
                //Declaracion de variables y calculos
                double total_Semana = d1 + d2 + d3 + d4 + d5 + d6 + d7; //Para total de la semana
                double mayor, menor;
                String dia_mayor = null, dia_menor = null;
                double listaDias[] = new double[]{d1, d2, d3, d4, d5, d6, d7};
                String dias [] = new String[] {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
                mayor = menor = listaDias[0];

                //Iteración para descubrir el numero mayor, menor y dia respectivo para el Frame Semana        
                for (int i = 0; i < listaDias.length ; i++) {

                    if (listaDias[i] >= mayor) {
                        mayor = listaDias[i];
                        dia_mayor = dias[i];
                    } //Fin de for
                    else if (listaDias[i] <= menor) {
                        menor = listaDias[i];
                        dia_menor = dias[i];
                    } //Fin de else if

                } //Fin de for 

                //Inicialización de Frame Semana        
                semana.setVisible(true);
                semana.pack();
                semana.setLocationRelativeTo(null);

                //Establecimiento de texto en el frame Semana 
                semana.numero.setText(String.valueOf(numero));
                semana.moneda.setText(moneda);

                //En caso de ser USD o COP
                if (moneda.equals("USD") || moneda.equals("COP")) {
                    semana.total.setText("$ " + String.valueOf(total_Semana));
                    semana.mayor.setText("$ " + String.valueOf(mayor));
                    semana.menor.setText("$ " + String.valueOf(menor));
                } //Fin de if
                else {
                    semana.total.setText("€ " + String.valueOf(total_Semana));
                    semana.mayor.setText("€ " + String.valueOf(mayor));
                    semana.menor.setText("€ " + String.valueOf(menor));
                } //Fin de else

                //En caso de dia_menor ser null
                if (dia_menor == null) {
                    String dia_menor1 = "Lunes";
                    semana.menor1.setText(dia_menor1);
                } //Fin de if            
                else {
                    semana.menor1.setText(dia_menor);
                } //Fin de else

                //En caso de que todos los dias sean iguales
                if (d1 == d2 && d2 == d3 && d3 == d4 && d4 == d5 && d5 == d6 && d6 == d7) {
                    String igualdad = "Dias iguales";
                    semana.mayor1.setText(igualdad);
                    semana.menor1.setText(igualdad);
                } //Fin de if            
                else {
                    semana.mayor1.setText(dia_mayor);
                } //Fin de else
            } //Fin de if
            else {
                JOptionPane.showMessageDialog(null, "El numero de ahorro " + busqueda + " no existe.");
            } //Fin de else
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la operación.", "¡Error!", JOptionPane.ERROR_MESSAGE);
        } //Fin de Excepcion
                           
    }//GEN-LAST:event_semanalActionPerformed

    private void mensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensualActionPerformed
        //Declaracion de busqueda
        int busqueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de ahorro: "));
        
        try {
            Ahorro ahorro = bdAhorro.queryForId(busqueda);
                        
            if (ahorro != null) {
                int numero = ahorro.getNumero_Ahorro();
                String moneda = ahorro.getMoneda_Cambio(); 
                double d1 = ahorro.getDia_1();
                double d2 = ahorro.getDia_2();
                double d3 = ahorro.getDia_3();
                double d4 = ahorro.getDia_4();
                double d5 = ahorro.getDia_5();
                double d6 = ahorro.getDia_6();
                double d7 = ahorro.getDia_7();
                double tea = ahorro.getTasa_Efeanu();
                double tiempo = ahorro.getTiempo_Ahorro();
                double meta = ahorro.getMeta_Ahorro();
                
                //Declaracion de variables y calculos
                double total_Semana = d1 + d2 + d3 + d4 + d5 + d6 + d7; //Para total de valor en una semana
                double tem= (Math.pow((1+(tea/100)),0.083333333333333))-1; //para conversion de TEA a TEM
                double total_Mes = total_Semana * 4.34524; //Para total de valor en un mes
                double valor_Futuro = 0;
                double logro_Meta;
                double meses_Requeridos;

                //En caso de que la moneda sea COP  
                if (moneda.equals("COP")) {
                    
                    //En caso de que TEM sea 0
                    if (tem==0){
                        valor_Futuro = Math.round(total_Mes*tiempo);
                    } // Fin de if
                    else {
                        for (int i = 0; i < tiempo; i++) {
                            valor_Futuro = Math.round(valor_Futuro + (total_Mes*(Math.pow((1+tem),i))) ); //Calculo para valor futuro
                        } //Fin de for    
                    } //Fin de else
                                        
                } //Fin de if
                else {
                    
                    //En caso de que TEM sea 0
                    if (tem==0){
                        valor_Futuro = Math.round((total_Mes*tiempo)*100)/100.0;
                    } // Fin de if
                    else {
                        for (int i = 0; i < tiempo; i++) {
                           valor_Futuro = Math.round((valor_Futuro + (total_Mes*(Math.pow((1+tem),i)))) *100 ) /100.0;
                        } //Fin de for    
                    } //Fin de else
                                       
                } //Fin de else
                               
                //En caso de que logro_Meta sea mayor a 100 y no se requieran meses adicionales           
                if (valor_Futuro > meta) {
                    logro_Meta = 100;
                    meses_Requeridos = 0;
                } //Fin de if
                else {
                    logro_Meta = Math.round(((valor_Futuro/meta)*100)*10)/10.0; //Calculo para porcentaje de cumplimiento de meta
                    meses_Requeridos = Math.round(((meta-valor_Futuro) / (valor_Futuro/tiempo))*10)/10.0; //Calculo para meses requeridos
                } //Fin de else
                               
                int prog_Meta = (int) logro_Meta; //Para mostrar en el JProgressBar

                //Inicialización de Frame Semana        
                mes.setVisible(true);
                mes.pack();
                mes.setLocationRelativeTo(null);

                //Establecimiento de texto en el frame Semana 
                mes.numero.setText(String.valueOf(numero));
                mes.moneda.setText(moneda);
                mes.meses.setText(String.valueOf(tiempo));

                //En caso de ser USD o COP
                if (moneda.equals("USD") || moneda.equals("COP")) {
                    mes.meta.setText("$ " + String.valueOf(meta));
                    mes.valorFuturo.setText("$ " + String.valueOf(valor_Futuro));                
                } //Fin de if
                else {
                    mes.meta.setText("€ " + String.valueOf(meta));
                    mes.valorFuturo.setText("€ " + String.valueOf(valor_Futuro));
                } //Fin de else    

                mes.progreso.setValue(prog_Meta); //Para el progress bar             
                mes.porcentaje.setText(String.valueOf(logro_Meta)+ " %"); //Para mostrar el porcentaje de cumplimiento
                mes.mesesAd.setText(String.valueOf(meses_Requeridos));

                } //Fin de if
                else {
                    JOptionPane.showMessageDialog(null, "El numero de ahorro " + busqueda + " no existe.");
                } //Fin de else
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la operación.", "¡Error!", JOptionPane.ERROR_MESSAGE);
        } //Fin de Excepcion
    }//GEN-LAST:event_mensualActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_cerrarActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String args[]) throws SQLException {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //Creacion de archivo y conexion a este
        String archivo = "jdbc:h2:./ahorro";
        
        ConnectionSource conn = new JdbcConnectionSource(archivo);
        
        bdAhorro = DaoManager.createDao(conn, Ahorro.class);
        
        TableUtils.createTableIfNotExists(conn, Ahorro.class);
                        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().setVisible(true);               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu archivo;
    private javax.swing.JButton borrar;
    private javax.swing.JButton buscar;
    private javax.swing.JMenuItem cerrar;
    private javax.swing.JTextField dia_1;
    private javax.swing.JTextField dia_2;
    private javax.swing.JTextField dia_3;
    private javax.swing.JTextField dia_4;
    private javax.swing.JTextField dia_5;
    private javax.swing.JTextField dia_6;
    private javax.swing.JTextField dia_7;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem mensual;
    private javax.swing.JTextField meta_Ahorro;
    private javax.swing.JButton modificar;
    private javax.swing.JComboBox<String> moneda_Cambio;
    private javax.swing.JTextField numero_Ahorro;
    private javax.swing.JButton pro_mes;
    private javax.swing.JButton pro_sem;
    private javax.swing.JMenuItem semanal;
    private javax.swing.JTable tablaAhorro;
    private javax.swing.JTextField tasa_Efeanu;
    private javax.swing.JTextField tiempo_Ahorro;
    // End of variables declaration//GEN-END:variables
} //Fin de Menu
