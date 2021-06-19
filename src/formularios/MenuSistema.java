
package formularios;
import java.applet.AudioClip;

public class MenuSistema extends javax.swing.JFrame {
     AudioClip musica=java.applet.Applet.newAudioClip(getClass().getResource("/imagenes/audio.wav"));
    
    public MenuSistema() {
        initComponents();
        musica.play();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuCheckIn = new javax.swing.JMenu();
        jMenuCheckOut = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU SISTEMAS");

        jPanelFondo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flamingo2.PNG"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("¡¡¡PENSANDO EN EL PARAISO DE TUS SUEÑOS!!!!");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("BIENVENIDO A HOTEL FLAMINGO CANCUN RESORT ");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("HOTEL EN CANCÚN, MÉXICO");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(102, 0, 102));
        jTextArea1.setRows(5);
        jTextArea1.setText(" Descubra qué se siente al alojarse en el paraíso con el Flamingo Cancun Resort. Un auténtico \n oasis de relax ideal para disfrutar de unos días llenos de desconexión en familia, en pareja y con\n amigos frente a la playa.\n\n Este hotel en Cancún, Quintana Roo, está confeccionado para garantizarle una estadía repleta de\n exclusividad: 3 modalidades de habitaciones, albercas con bar flotante, spa, jacuzzi, masajes, \n entretenimiento para todas las edades, gimnasio, deportes, wifi sin costo adicional … Por no hablar \n de la deliciosa comida que le preparamos. En el restaurante buffet La Fuente servimos una amplia \n carta de platillos internacionales .\n\n Haga su reserva en  Flamingo Cancun Resort y disfrute de una experiencia única a orillas del mar \n Caribe al mejor precio online garantizado.\n");
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/razon.PNG"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flamingo.PNG"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ubicacion.PNG"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arroba.PNG"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tel icon.PNG"))); // NOI18N

        jLabel11.setForeground(new java.awt.Color(0, 102, 51));
        jLabel11.setText("Boulevard Kukulkán Km 11, Cancún, Quintana Roo.");

        jLabel12.setForeground(new java.awt.Color(0, 102, 0));
        jLabel12.setText("flamingo@flamingocancunresort.com.mx");

        jLabel13.setForeground(new java.awt.Color(0, 102, 0));
        jLabel13.setText("+52(998)848.88.70");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/razon icon.PNG"))); // NOI18N

        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("@flamingocancunresort");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tecla.PNG"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/play.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/stop.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel16)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel17))
                                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                        .addComponent(jLabel11)))
                                .addContainerGap())
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(285, 285, 285))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 204, 204));
        jMenuBar1.setForeground(new java.awt.Color(153, 0, 153));

        jMenu1.setBackground(new java.awt.Color(0, 0, 255));
        jMenu1.setForeground(new java.awt.Color(153, 0, 153));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono flamingo.PNG"))); // NOI18N
        jMenu1.setText("FLAMINGOS CANCUN RESORT");
        jMenu1.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenuCheckIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jMenuCheckIn.setForeground(new java.awt.Color(153, 0, 153));
        jMenuCheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/checkIn.PNG"))); // NOI18N
        jMenuCheckIn.setText("Check in");
        jMenuCheckIn.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jMenuCheckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCheckInMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuCheckIn);

        jMenuCheckOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jMenuCheckOut.setForeground(new java.awt.Color(153, 0, 153));
        jMenuCheckOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/checkout.PNG"))); // NOI18N
        jMenuCheckOut.setText("Check Out");
        jMenuCheckOut.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jMenuCheckOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCheckOutMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuCheckOut);

        jMenu3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jMenu3.setForeground(new java.awt.Color(153, 0, 153));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consulta.PNG"))); // NOI18N
        jMenu3.setText("Consultas");
        jMenu3.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Yu Gothic", 2, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(0, 102, 51));
        jMenuItem1.setText("Galeria Fotos");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseReleased(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(0, 102, 51));
        jMenuItem2.setText("Precios Habitaciones");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseReleased(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(0, 102, 51));
        jMenuItem3.setText("Piso y habitacion que esta Huesped");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseReleased(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(0, 102, 51));
        jMenuItem4.setText("Persona en Habitacion");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseReleased(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(0, 102, 51));
        jMenuItem5.setText("Habitaciones disponibles por piso");
        jMenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem5MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem5MouseReleased(evt);
            }
        });
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(0, 102, 51));
        jMenuItem6.setText("Lista de nombres por orden ");
        jMenuItem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem6MouseReleased(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setForeground(new java.awt.Color(0, 102, 51));
        jMenuItem7.setText("Ingresos del hotel");
        jMenuItem7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem7MouseReleased(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setForeground(new java.awt.Color(51, 102, 0));
        jMenuItem8.setText("Grafica Ocupacion por habitacion");
        jMenuItem8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem8MouseReleased(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setForeground(new java.awt.Color(0, 102, 51));
        jMenuItem9.setText("Grafica habitaciones tipo");
        jMenuItem9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem9MouseReleased(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Ocupacion Hotel");
        jMenuItem10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem10MouseReleased(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Modificaciones");
        jMenuItem11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem11MouseReleased(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuBar1.add(jMenu3);

        jMenuSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jMenuSalir.setForeground(new java.awt.Color(153, 0, 153));
        jMenuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Close all jframe.png"))); // NOI18N
        jMenuSalir.setText("Salir");
        jMenuSalir.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        musica.play();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        musica.stop();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked
        // TODO add your handling code here:
        ventana();
    }//GEN-LAST:event_jMenuSalirMouseClicked

    private void jMenuCheckInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCheckInMouseClicked
        // TODO add your handling code here:
        musica.stop();
        this.setVisible(false);
        Registro c1= new Registro();
        c1.setVisible(true);
    }//GEN-LAST:event_jMenuCheckInMouseClicked

    private void jMenuCheckOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCheckOutMouseClicked
        // TODO add your handling code here:
        musica.stop();
        this.setVisible(false);
        Salida sa= new Salida();
        sa.setVisible(true);
    }//GEN-LAST:event_jMenuCheckOutMouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenuItem1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseReleased
        // TODO add your handling code here:
        musica.stop();
        this.setVisible(false);
        Consulta1 co1= new Consulta1();
        co1.setVisible(true);
    }//GEN-LAST:event_jMenuItem1MouseReleased

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseReleased
        // TODO add your handling code here:
        musica.stop();
        this.setVisible(false);
        Consulta6 co6= new Consulta6();
        co6.setVisible(true);
    }//GEN-LAST:event_jMenuItem2MouseReleased

    private void jMenuItem3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseReleased
        // TODO add your handling code here:
          musica.stop();
        this.setVisible(false);
        Consulta7 co7= new Consulta7();
        co7.setVisible(true);
    }//GEN-LAST:event_jMenuItem3MouseReleased

    private void jMenuItem4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseReleased
        // TODO add your handling code here:
        musica.stop();
        this.setVisible(false);
        Consulta8 co8= new Consulta8();
        co8.setVisible(true);
    }//GEN-LAST:event_jMenuItem4MouseReleased

    private void jMenuItem5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5MouseClicked

    private void jMenuItem5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseReleased
        // TODO add your handling code here:
        musica.stop();
        this.setVisible(false);
        Consulta9 co9= new Consulta9();
        co9.setVisible(true);
    }//GEN-LAST:event_jMenuItem5MouseReleased

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem6MouseReleased
        // TODO add your handling code here:
        musica.stop();
        this.setVisible(false);
        Consulta10 co10= new Consulta10();
        co10.setVisible(true);
    }//GEN-LAST:event_jMenuItem6MouseReleased

    private void jMenuItem7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem7MouseReleased
        // TODO add your handling code here:
        musica.stop();
        this.setVisible(false);
        Consulta2 co2= new Consulta2();
        co2.setVisible(true);
    }//GEN-LAST:event_jMenuItem7MouseReleased

    private void jMenuItem8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem8MouseReleased
        // TODO add your handling code here:
        musica.stop();
        this.setVisible(false);
        Consulta3 co3= new Consulta3();
        co3.setVisible(true);
    }//GEN-LAST:event_jMenuItem8MouseReleased

    private void jMenuItem9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem9MouseReleased
        // TODO add your handling code here:
        musica.stop();
        this.setVisible(false);
        Graficahab co4= new Graficahab();
        co4.setVisible(true);
    }//GEN-LAST:event_jMenuItem9MouseReleased

    private void jMenuItem10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem10MouseReleased
        // TODO add your handling code here:
        musica.stop();
        this.setVisible(false);
        OcupacionHotel co5= new OcupacionHotel();
        co5.setVisible(true);
    }//GEN-LAST:event_jMenuItem10MouseReleased

    private void jMenuItem11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem11MouseReleased
        // TODO add your handling code here:
        musica.stop();
        this.setVisible(false);
         extra coex= new extra();
        coex.setVisible(true);
    }//GEN-LAST:event_jMenuItem11MouseReleased

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
            java.util.logging.Logger.getLogger(MenuSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuSistema().setVisible(true);
            }
        });
        
    }
    public void ventana() {
        musica.stop();
        this.setVisible(false);
        PortdaHotel c= new PortdaHotel();
        c.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCheckIn;
    private javax.swing.JMenu jMenuCheckOut;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
