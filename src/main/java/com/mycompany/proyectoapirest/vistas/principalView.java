package com.mycompany.proyectoapirest.vistas;

import com.google.gson.reflect.TypeToken;
import com.mycompany.proyectoapirest.dto.Root;
import java.util.List;
import java.lang.reflect.Type;
import com.mycompany.proyectoapirest.dto.Root;
import com.google.gson.Gson;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import com.mycompany.proyectoapirest.RestClient;
import java.lang.reflect.Type;
import javax.swing.JOptionPane;

/**
 *
 * @author 2damb
 */
public class principalView extends javax.swing.JFrame {

    java.lang.reflect.Type listType;
    Gson gson;
    RestClient client;

    public principalView() {
        listType = new TypeToken<List<Root>>() {
        }.getType();
        gson = new Gson();
        client = new RestClient();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rest-api-icon.png"))); // NOI18N

        jMenu1.setText("GET");

        jMenu3.setText("GETS MASIVOS");

        jMenuItem1.setText("Todos los paises");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Todos los paises de europa");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Todos los paises que usan el Euro");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenu1.add(jMenu3);

        jMenu5.setText("GET QueryParams");

        jMenuItem5.setText("Paises de asia ordenados por nombre en orden ascendente");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuItem6.setText("Paises que usan la libra esterlina ordenados por region en orden descendente");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenu1.add(jMenu5);

        jMenuItem4.setText("GET pais por codigo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("POST");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //TODOS LOS PAISES
        List<Root> resultadosObjetos = gson.fromJson(client.getAllCountries(), listType);

        String resultadosString = "";

        for (Root pais : resultadosObjetos) {
            resultadosString += pais.toString();
        }
        ResultadosGetView resultadosView = new ResultadosGetView(resultadosString);
        resultadosView.setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //TODOS LOS PAISES DE EUROPA
        List<Root> resultadosObjetos = gson.fromJson(client.getCountriesByRegion("Europe"), listType);

        String resultadosString = "";

        for (Root paisEuropeo : resultadosObjetos) {
            resultadosString += paisEuropeo.toString();
        }

        ResultadosGetView resultadosView = new ResultadosGetView(resultadosString);
        resultadosView.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //PAISES QUE USAN EL DOLLAR
        List<Root> resultadosObjetos = gson.fromJson(client.getCountriesByCurrency("USD"), listType);

        String resultadosString = "";

        for (Root paisDolarizado : resultadosObjetos) {
            resultadosString += paisDolarizado.toString();
        }

        ResultadosGetView resultadosView = new ResultadosGetView(resultadosString);
        resultadosView.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        //PAIS POR ID
        Boolean estaVacio = true;
        String codigoPaisUsuario = "";
        while (estaVacio) {
            codigoPaisUsuario = showInputDialog("INTRODUCE EL CODIGO DEL PAIS\n(Por ejemplo US es el de Estados unidos tambien puedes usar USA)\n NO SE ABRIRA LA VENTANA SI INTRODUCES UNO INCORRECTO");

            if (codigoPaisUsuario.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "EL CODIGO NO PUEDE ESTAR VACIO Y SI NO INTRODUCES UNO CORRECTO NO APARECERA NINGUN RESULTADO");
            } else {
                estaVacio = false;
            }
        }

        List<Root> resultadosObjetos = gson.fromJson(client.getCountryByCode(codigoPaisUsuario), listType);

        String resultadosString = "";

        for (Root paisBuscado : resultadosObjetos) {
            resultadosString += paisBuscado.toString();
        }

        ResultadosGetView resultadosView = new ResultadosGetView(resultadosString);
        resultadosView.setVisible(true);

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        //PAISES ASIATICOS ORDENADOS POR NOMBRE EN ORDEN ASCENDENTE
        String region = "Asia";
        String sortBy = "name";
        String sortOrder = "asc";
        List<Root> resultadosObjetos = gson.fromJson(client.getCountriesByRegionWithQueryParams(region, sortBy, sortOrder), listType);

        String resultadosString = "";

        for (Root paisQueryRegion : resultadosObjetos) {
            resultadosString += paisQueryRegion.toString();
        }

        ResultadosGetView resultadosView = new ResultadosGetView(resultadosString);
        resultadosView.setVisible(true);

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        //PAISES QUE USAN LIBRA ESTERLINA ORDENADOS POR REGION EN ORDEN DESCENTE
        String currency = "GBP";
        String sortBy = "region";
        String sortOrder = "desc";
        List<Root> resultadosObjetos = gson.fromJson(client.getCountriesByCurrencyWithQueryParams(currency, sortBy, sortOrder), listType);

        String resultadosString = "";

        for (Root paisQueryCurrency : resultadosObjetos) {
            resultadosString += paisQueryCurrency.toString();
        }

        ResultadosGetView resultadosView = new ResultadosGetView(resultadosString);
        resultadosView.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        PostView postView = new PostView();
        postView.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private String showInputDialog(String message) {
        return JOptionPane.showInputDialog(message);
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
            java.util.logging.Logger.getLogger(principalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    // End of variables declaration//GEN-END:variables
}
