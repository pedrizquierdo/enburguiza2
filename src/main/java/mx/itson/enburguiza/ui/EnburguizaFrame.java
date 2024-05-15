/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.enburguiza.ui;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import mx.itson.enburguiza.entities.App;
import mx.itson.enburguiza.entities.Item;
import mx.itson.enburguiza.business.Operation;
/**
 *
 * @author luismorellb
 */
public class EnburguizaFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public EnburguizaFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelEnburguiza = new javax.swing.JLabel();
        buttonJson = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelAddress = new javax.swing.JLabel();
        labelRestaurant = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableItem = new javax.swing.JTable();
        labelOrder = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelDate = new javax.swing.JLabel();
        labelClient = new javax.swing.JLabel();
        labelCoordinate = new javax.swing.JLabel();
        labelAddressc = new javax.swing.JLabel();
        labelPhonenumber = new javax.swing.JLabel();
        labelGmail = new javax.swing.JLabel();
        labelDistance = new javax.swing.JLabel();
        labelSubtotal = new javax.swing.JLabel();
        labelEstimate = new javax.swing.JLabel();
        labelRating = new javax.swing.JLabel();
        labelMessageRating = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 207, 81));

        labelEnburguiza.setBackground(new java.awt.Color(255, 255, 255));
        labelEnburguiza.setFont(new java.awt.Font("SignPainter", 1, 64)); // NOI18N
        labelEnburguiza.setForeground(new java.awt.Color(255, 255, 255));
        labelEnburguiza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEnburguiza.setText("Enburguiza ");
        labelEnburguiza.setToolTipText("");

        buttonJson.setText("Files...");
        buttonJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJsonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(buttonJson, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEnburguiza, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(buttonJson, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(labelEnburguiza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 80));

        jPanel3.setBackground(new java.awt.Color(249, 249, 249));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelAddress.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        labelAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelAddress.setText("Address");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 850, 80));

        labelRestaurant.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        labelRestaurant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRestaurant.setText("Restaurant");
        jPanel1.add(labelRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 850, 50));

        tableItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item", "Quantity", "Unit price"
            }
        ));
        jScrollPane1.setViewportView(tableItem);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 290, 280));

        labelOrder.setFont(new java.awt.Font("SF Pro", 2, 18)); // NOI18N
        labelOrder.setText("Order #");
        jPanel1.add(labelOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        labelDate.setFont(new java.awt.Font("SF Pro", 3, 18)); // NOI18N
        labelDate.setForeground(new java.awt.Color(51, 51, 51));
        labelDate.setText("Date");

        labelClient.setFont(new java.awt.Font("SF Pro", 3, 18)); // NOI18N
        labelClient.setText("Client");

        labelCoordinate.setFont(new java.awt.Font("SF Pro", 3, 18)); // NOI18N
        labelCoordinate.setText("Coordinates");

        labelAddressc.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        labelAddressc.setText("Address");
        labelAddressc.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        labelPhonenumber.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        labelPhonenumber.setText("Phone number");

        labelGmail.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        labelGmail.setText("Gmail");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCoordinate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(labelAddressc, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addComponent(labelPhonenumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labelGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDate)
                .addGap(18, 18, 18)
                .addComponent(labelClient)
                .addGap(18, 18, 18)
                .addComponent(labelCoordinate)
                .addGap(18, 18, 18)
                .addComponent(labelAddressc)
                .addGap(18, 18, 18)
                .addComponent(labelPhonenumber)
                .addGap(18, 18, 18)
                .addComponent(labelGmail)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 550, 470));

        labelDistance.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelDistance.setText("Distance:");
        jPanel1.add(labelDistance, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 200, -1));

        labelSubtotal.setFont(new java.awt.Font("SF Pro", 3, 18)); // NOI18N
        labelSubtotal.setText("Subtotal:");
        jPanel1.add(labelSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 280, -1));

        labelEstimate.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        labelEstimate.setText("Estimate Time:");
        jPanel1.add(labelEstimate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 230, 20));

        labelRating.setText("Rating");
        jPanel1.add(labelRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 120, 40));
        jPanel1.add(labelMessageRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 140, 30));

        labelTotal.setFont(new java.awt.Font("SF Pro", 3, 18)); // NOI18N
        labelTotal.setText("Total: ");
        jPanel1.add(labelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 280, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJsonActionPerformed

        try{
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            
            if(fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
                File file = fileChooser.getSelectedFile();
                
                byte  fileBytes[] = Files.readAllBytes(file.toPath());
                String content = new String(fileBytes, StandardCharsets.UTF_8);
                
            App app = new App().deserialize(content);  
            
            labelEstimate.setText("Estimate Time: " + app.getOrder().getEstimateTime() + " seconds ");
            labelDistance.setText("Distance: " + app.getOrder().getDistance() + " miles");
            labelRestaurant.setText(app.getOrder().getRestaurant());
            labelAddress.setText(app.getOrder().getAddress());
            labelOrder.setText("Order #" + app.getOrder().getNumber());
            labelClient.setText(app.getClient().getName());
            labelCoordinate.setText(app.getClient().getCoordinates());
            labelAddressc.setText(app.getClient().getAddress());
            labelPhonenumber.setText(app.getClient().getPhoneNumber());
            labelGmail.setText(app.getClient().getEmail());
            labelRating.setText("Current Rating: " + app.getRating());
            
            labelMessageRating.setText((app.getRating() >= 2)?  "Good Rating" : "Bad Rating");
            
            double subtotal = Operation.calculateTotal(app.getItems());
            
            labelSubtotal.setText("Subtotal: " + subtotal);
           
            Operation op = new Operation();
            Double total = op.taxes(subtotal);
            labelTotal.setText("Total: " + total);
            
            
            
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy", new Locale("EN","us"));
            labelDate.setText("Requested at " + dateFormat.format(app.getDate()));
            
            DefaultTableModel model = (DefaultTableModel) tableItem.getModel();
                model.setRowCount(0);
                for(Item c : app.getItems()){
                    model.addRow(new Object[]{
                        c.getName(),
                        c.getQuantity(),
                        c.getPrice()
                        
                
                    
                        }
                    );
                }
            
         
            
            }
            
        }catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        
        


        
        
        
        
    }//GEN-LAST:event_buttonJsonActionPerformed

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
            java.util.logging.Logger.getLogger(EnburguizaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnburguizaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnburguizaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnburguizaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnburguizaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonJson;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelAddressc;
    private javax.swing.JLabel labelClient;
    private javax.swing.JLabel labelCoordinate;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelDistance;
    private javax.swing.JLabel labelEnburguiza;
    private javax.swing.JLabel labelEstimate;
    private javax.swing.JLabel labelGmail;
    private javax.swing.JLabel labelMessageRating;
    private javax.swing.JLabel labelOrder;
    private javax.swing.JLabel labelPhonenumber;
    private javax.swing.JLabel labelRating;
    private javax.swing.JLabel labelRestaurant;
    private javax.swing.JLabel labelSubtotal;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTable tableItem;
    // End of variables declaration//GEN-END:variables
}
