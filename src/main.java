
import my_project.Queue_GUI;
import my_project.gui;

import my_project.insert;

import my_project.stack_GUI;


public class main extends javax.swing.JFrame {

   
    public main() {
        
        initComponents();

        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        jLabel1 = new javax.swing.JLabel();

        stack = new javax.swing.JButton();

        list = new javax.swing.JButton();

        queue = new javax.swing.JButton();

        linked_list = new javax.swing.JButton();

        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


        jPanel1.setBackground(java.awt.Color.pink);


        jLabel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jLabel1.setForeground(new java.awt.Color(51, 51, 255));

        jLabel1.setText("مشروع هياكل البيانات");

        stack.setBackground(new java.awt.Color(102, 255, 102));

        stack.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        stack.setText("المكدس");

        stack.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stackActionPerformed(evt);
            }
        });

        list.setBackground(new java.awt.Color(51, 255, 255));

        list.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        list.setText("المصفوفات");

        list.addChangeListener(new javax.swing.event.ChangeListener() {

            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                listStateChanged(evt);
            }
        });
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });

        queue.setBackground(new java.awt.Color(102, 255, 102));
        queue.setFont(new java.awt.Font("Segoe UI", 1, 24));
         // NOI18N
        queue.setText("الطابور");

        queue.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                queueActionPerformed(evt);
            }
        });

        linked_list.setBackground(new java.awt.Color(0, 255, 255));

        linked_list.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        // NOI18N
        linked_list.setText("القائمة الموصولة");

        linked_list.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                linked_listActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 51, 102));

        exit.setFont(new java.awt.Font("Segoe UI", 1, 24));
         // NOI18N
        exit.setText("خروج");

        exit.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);

        jPanel1.setLayout(jPanel1Layout);

        jPanel1Layout.setHorizontalGroup(

            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(jPanel1Layout.createSequentialGroup()

                .addGap(30, 30, 30)

                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                    .addComponent(stack, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(linked_list, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                
                    .addComponent(list, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(queue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(336, 336, 336)

                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()

                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(295, 295, 295))
        );
        jPanel1Layout.setVerticalGroup(

            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(jPanel1Layout.createSequentialGroup()

                .addGap(14, 14, 14)

                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(18, 18, 18)
                
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(stack, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(67, 67, 67)

                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(queue, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(linked_list, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)

                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(

            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()

                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addContainerGap())
        );
        layout.setVerticalGroup(

            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(layout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                

                .addContainerGap())
        );

        pack();

    }// </editor-fold>//GEN-END:initComponents

    private void listStateChanged(javax.swing.event.ChangeEvent evt) {//GE
    // N-FIRST:event_listStateChanged
        // TODO add your handling code here:
      
    }//GEN-LAST:event_listStateChanged

    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GE
    // N-FIRST:event_listActionPerformed
        // TODO add your handling code here:
         insert t= new insert();

         t.add_delete_ofarray();

    }//GEN-LAST:event_listActionPerformed

    private void stackActionPerformed(java.awt.event.ActionEvent evt) {//
    // GEN-FIRST:event_stackActionPerformed
        // TODO add your handling code here:
        stack_GUI s1 = new stack_GUI();

        s1.setVisible(true);

        s1.setLocationRelativeTo(s1);

    }//GEN-LAST:event_stackActionPerformed

    private void queueActionPerformed(java.awt.event.ActionEvent evt) {//GE
    // N-FIRST:event_queueActionPerformed
        // TODO add your handling code here:
        Queue_GUI gui=new Queue_GUI();

        
        gui.setVisible(true);


    }//GEN-LAST:event_queueActionPerformed

    private void linked_listActionPerformed(java.awt.event.ActionEvent evt) {//G
    // EN-FIRST:event_linked_listActionPerformed
        // TODO add your handling code here:
        gui q=new gui();

        q.setVisible(true);

        q.setLocationRelativeTo(q);

      
        
    }//GEN-LAST:event_linked_listActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt)
     {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_exitActionPerformed

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
        }
         catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

         catch (InstantiationException ex) {

            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (IllegalAccessException ex) {

            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JPanel jPanel1;

    private javax.swing.JButton linked_list;
    
    private javax.swing.JButton list;
    private javax.swing.JButton queue;
    private javax.swing.JButton stack;
    // End of variables declaration//GEN-END:variables
}
