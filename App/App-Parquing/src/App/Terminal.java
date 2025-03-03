/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App;

import App.Deposito.Deposito;
import App.RecursoBarraCarga.BarraCarga;
import App.Tiket_Plazas.Plano;
import App.Tiket_Plazas.Ticket;
import App.Tiket_Plazas.Ubicacion;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author jovcubni
 */
public class Terminal extends javax.swing.JFrame {

    public Plano plano = new Plano();
    public Maquina maquina = new Maquina(0.50);
    public Ticket tiket;

    /**
     * Creates new form Terminal
     */
    public Terminal() {
        initComponents();
        setFrame();
    }
    public void setFrame(){
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Terminal");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PagoYmas = new javax.swing.JPanel();
        BotonPagar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DineroPone = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Muestraprecio = new javax.swing.JLabel();
        Cambio = new javax.swing.JLabel();
        OcupacionParking = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Matricula = new javax.swing.JTextField();
        Tiket1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PagoYmas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BotonPagar.setText("Pagar");
        BotonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPagarActionPerformed(evt);
            }
        });

        jLabel2.setText("A pagar --->");

        jLabel3.setText("Inserta -->");

        jButton1.setText("✔ ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Muestraprecio.setText("€");

        Cambio.setText("Cambio: ");

        javax.swing.GroupLayout PagoYmasLayout = new javax.swing.GroupLayout(PagoYmas);
        PagoYmas.setLayout(PagoYmasLayout);
        PagoYmasLayout.setHorizontalGroup(
            PagoYmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PagoYmasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonPagar)
                .addGap(92, 92, 92))
            .addGroup(PagoYmasLayout.createSequentialGroup()
                .addGroup(PagoYmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PagoYmasLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(PagoYmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(PagoYmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DineroPone)
                            .addComponent(Muestraprecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                    .addGroup(PagoYmasLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jButton1)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(PagoYmasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PagoYmasLayout.setVerticalGroup(
            PagoYmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PagoYmasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonPagar)
                .addGap(18, 18, 18)
                .addGroup(PagoYmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(Muestraprecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PagoYmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(DineroPone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(Cambio)
                .addGap(40, 40, 40))
        );

        OcupacionParking.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout OcupacionParkingLayout = new javax.swing.GroupLayout(OcupacionParking);
        OcupacionParking.setLayout(OcupacionParkingLayout);
        OcupacionParkingLayout.setHorizontalGroup(
            OcupacionParkingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OcupacionParkingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );
        OcupacionParkingLayout.setVerticalGroup(
            OcupacionParkingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OcupacionParkingLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel1.setText("INSERTE LA MATRICULA");

        Tiket1.setText("✔ Ok");
        Tiket1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tiket1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PagoYmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(Tiket1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(OcupacionParking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Tiket1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(OcupacionParking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PagoYmas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tiket1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tiket1ActionPerformed
         String matricula = Matricula.getText();
        if (matricula.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No puede ser nula", "Nota", JOptionPane.WARNING_MESSAGE);
        } else {
            Ticket ticket = maquina.generarTicket(matricula);
            if (ticket != null) {
                JOptionPane.showMessageDialog(this, " Ticket generado: " + ticket, "Ticket", JOptionPane.INFORMATION_MESSAGE);
                Ubicacion ubicacion = plano.estacionar(ticket.getId());
                if (ubicacion != null) { // Estacionar el coche en el plano exitosamente
                    System.out.println("Ocupación del parking después de estacionar:");
                    plano.mostrarParking(); // Mostrar la ocupación del parking en la terminal
                } else {
                    JOptionPane.showMessageDialog(this, " No hay espacio disponible en el parking.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, " No hay espacio disponible en el parking.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_Tiket1ActionPerformed

    private double total;
    private int tiketNum;
    
    private void BotonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPagarActionPerformed
        LocalDateTime salida = LocalDateTime.now();
        double precioPorMinuto = 0.50;
        String tiketId = JOptionPane.showInputDialog(this, "Introduce el ID del ticket: ");
        
        if (tiketId == null || tiketId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No puede ser nula", "Nota", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        try {
            tiketNum = Integer.parseInt(tiketId);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID del ticket inválido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (tiketNum < 0 || tiketNum > Ticket.getContador()) { 
            JOptionPane.showMessageDialog(this, "Fuera de rango", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Ticket ticket = maquina.buscarTicket(tiketNum);
        if (ticket == null) {
            JOptionPane.showMessageDialog(this, "Ticket no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Duration tiempoPasado = Duration.between(ticket.getFecha_hora(), salida);
        long minutos = tiempoPasado.toMinutes();
        total = minutos * precioPorMinuto;
        if (minutos == 0) total = precioPorMinuto; // Mínimo 1 minuto de cobro
        Muestraprecio.setText(total + "€");

  
    }//GEN-LAST:event_BotonPagarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // TODO add your handling code here:
        String dinero;

        try {
            dinero = DineroPone.getText();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Cantidad de dinero inválida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double dineros = Double.parseDouble(dinero);
        double total = Double.parseDouble(Muestraprecio.getText().replace("€", ""));
        if (dineros < total) {
            JOptionPane.showMessageDialog(this, "Cantidad de dinero inválida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Mostrar la barra de carga
        BarraCarga carga = new BarraCarga();
        carga.setVisible(true);

        // Simulación de proceso de pago (codigo carga barra por ChatGpt)
        new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                try {
                    Thread.sleep(50); // Simula un proceso de pago
                    carga.actualizarProgreso(i); // Actualiza la barra de progreso
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            carga.dispose(); // Cierra la barra de progreso una vez completado el pago

            // Procesar el pago y liberar el ticket
            maquina.pagarTicket((int) total, (int) dineros);
            double cambio = dineros - total;
            Cambio.setText("Cambio: " + cambio + "€. Hasta pronto");
            if (plano.liberar((int) total)) { // Liberar la plaza en el plano
                System.out.println("Ocupación del parking después de liberar:");
                plano.liberar(tiketNum);
                plano.mostrarParking(); // Mostrar la ocupación del parking en la terminal
            }
        }).start();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Terminal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonPagar;
    private javax.swing.JLabel Cambio;
    private javax.swing.JTextField DineroPone;
    private javax.swing.JTextField Matricula;
    private javax.swing.JLabel Muestraprecio;
    private javax.swing.JPanel OcupacionParking;
    private javax.swing.JPanel PagoYmas;
    private javax.swing.JButton Tiket1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
