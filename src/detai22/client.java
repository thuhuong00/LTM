/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detai22;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;

import java.security.InvalidKeyException;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author thuhu
 */
public class client extends javax.swing.JFrame {

    /**
     * Creates new form client
     */
    public client() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_khoa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_vanBan = new javax.swing.JTextArea();
        jButton_maHoaVaGui = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_daMaHoa = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_giaiMa = new javax.swing.JTextArea();
        jLabel_khoa = new javax.swing.JLabel();
        jLabel_vanBan = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nh???p kh??a:");

        jLabel2.setText("Nh???p v??n b???n:");

        jTextArea_vanBan.setColumns(20);
        jTextArea_vanBan.setRows(5);
        jScrollPane1.setViewportView(jTextArea_vanBan);

        jButton_maHoaVaGui.setText("M?? h??a v?? g???i server");
        jButton_maHoaVaGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_maHoaVaGuiActionPerformed(evt);
            }
        });

        jTextArea_daMaHoa.setColumns(20);
        jTextArea_daMaHoa.setRows(5);
        jScrollPane2.setViewportView(jTextArea_daMaHoa);

        jLabel3.setText("???? m?? h??a:");

        jLabel4.setText("Server gi???i m??:");

        jTextArea_giaiMa.setColumns(20);
        jTextArea_giaiMa.setRows(5);
        jScrollPane3.setViewportView(jTextArea_giaiMa);

        jLabel_vanBan.setText(" ");

        jLabel5.setText("X??y ch????ng tr??nh giao di???n socket client ??? server b???ng java v???i giao th???c UDP m?? h??a v?? gi??i m?? v??n b???n v???i thu???t to??n m?? h??a DES???");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_khoa, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(33, 33, 33)
                                    .addComponent(jTextField_khoa, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_vanBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2)
                                        .addComponent(jScrollPane1)
                                        .addComponent(jScrollPane3))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jButton_maHoaVaGui))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_khoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_khoa, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_vanBan)
                .addGap(12, 12, 12)
                .addComponent(jButton_maHoaVaGui)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean checkKhoa(String khoa) {
        if (khoa.equals("") == true) {
            jLabel_khoa.setText("Kh??a kh??ng ???????c ????? tr???ng!");
            return false;
        } else {
            if (khoa.length() != 8) {
                jLabel_khoa.setText("Kh??a ch???a 8 k?? t???");
                return false;
            }
        }
        jLabel_khoa.setText(" ");
        return true;
    }

    private boolean checkVanBan(String vanBan) {
        if (vanBan.equals("") == true) {
            jLabel_vanBan.setText("V??n b???n kh??ng ???????c ????? tr???ng!");
            return false;
        }
        jLabel_vanBan.setText(" ");
        return true;
    }

    private void jButton_maHoaVaGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_maHoaVaGuiActionPerformed
        Boolean kt = true;
        if (checkKhoa(jTextField_khoa.getText()) == true) {
            kt = true;
        }
        if (checkVanBan(jTextArea_vanBan.getText()) == true) {
            kt = true;
        }
        if (kt == true) {

            try {
                byte[] khoa = new byte[64];
                byte[] maHoa = new byte[256];
                khoa = jTextField_khoa.getText().getBytes();
                SecretKeySpec skeySpec = new SecretKeySpec(khoa, "DES");
                // m?? h??a
                Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5PADDING");
                cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
                byte[] byteEncrypted = cipher.doFinal(jTextArea_vanBan.getText().getBytes());
                System.out.println("byteEncrypted kieu byte " + byteEncrypted);
                String encrypted = Base64.getEncoder().encodeToString(byteEncrypted);
                System.out.println("encrypted " + encrypted);
                jTextArea_daMaHoa.setText(encrypted);
                // g???i server
                DatagramSocket client = new DatagramSocket();
                // t???o packet g???i tin
                InetAddress IP = InetAddress.getByName("127.0.0.1");
                int port = 8888;
                // g???i kh??a
                DatagramPacket GuiKhoa = new DatagramPacket(khoa, khoa.length, IP, port);
                client.send(GuiKhoa);
                // g???i v??n b???n ???? m?? h??a 
                maHoa = jTextArea_daMaHoa.getText().getBytes();
                DatagramPacket GuiVanBanDaMaHoa = new DatagramPacket(maHoa, maHoa.length, IP, port);
                client.send(GuiVanBanDaMaHoa);
                // nh???n l???i v??n b???n ???? gi???i m?? t??? server
                byte[] giaiMa = new byte[256];
                DatagramPacket NhanGiaiMa = new DatagramPacket(giaiMa, giaiMa.length);
                client.receive(NhanGiaiMa);
                String ketQua = new String(NhanGiaiMa.getData(), 0, NhanGiaiMa.getLength()).trim();
                jTextArea_giaiMa.setText(ketQua);

            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchPaddingException ex) {
                Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidKeyException ex) {
                Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalBlockSizeException ex) {
                Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BadPaddingException ex) {
                Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SocketException ex) {
                Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnknownHostException ex) {
                Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton_maHoaVaGuiActionPerformed

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
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_maHoaVaGui;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_khoa;
    private javax.swing.JLabel jLabel_vanBan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea_daMaHoa;
    private javax.swing.JTextArea jTextArea_giaiMa;
    private javax.swing.JTextArea jTextArea_vanBan;
    private javax.swing.JTextField jTextField_khoa;
    // End of variables declaration//GEN-END:variables
}
