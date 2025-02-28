package App;

import javax.swing.JProgressBar;
import javax.swing.GroupLayout;

public class BarraCarga extends javax.swing.JFrame {

    private JProgressBar progressBar; // Declaración de la barra de progreso

    public BarraCarga() {
        initComponents();
    }

    private void initComponents() {
        progressBar = new JProgressBar(0, 100); // Inicializa con rango 0-100
        progressBar.setValue(0); // Valor inicial
        progressBar.setStringPainted(true); // Muestra el porcentaje

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Configuración del layout y agregar la barra de progreso
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }

    // Método para actualizar la barra de progreso
    private void actualizarProgreso(int valor) {
        progressBar.setValue(valor);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            BarraCarga frame = new BarraCarga();
            frame.setVisible(true);

            // Simulación de carga (bucle para actualizar la barra)
            new Thread(() -> {
                for (int i = 0; i <= 100; i++) {
                    try {
                        Thread.sleep(50); // Simula un proceso
                        frame.actualizarProgreso(i); // Actualiza la barra
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        });
    }
}
