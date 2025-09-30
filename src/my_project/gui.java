/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package my_project;

import com.sun.source.tree.ContinueTree;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class gui extends javax.swing.JFrame {
    node head,p,q,x;
    JFileChooser f;
    int ch=-1;
    //---------------------
    public gui() {
        initComponents();
        creatnode();
        head=p;
        q=p;
        tt.setText(head.data+"\n|\n");
        x=head;
        
    }

     //-------------------------
    public void creatnode()
    {
        try{
        p= new node();
        f=new JFileChooser();
        f.showOpenDialog(f);
        p.data=f.getSelectedFile().getPath();
        p.next=null;
        }
        catch(Exception e)
        {
            
        }
    }
    //---------------------
    public void addfirst()
    {
        creatnode();
        if(head==null)
        {
            head=p;
            q=p;
        }
        else
        {
            p.next=head;
            head=p;
        }
        print();
    }
    //---------------------------
    public void addlast()
    {
        creatnode();
        if(head==null)
        {
            head=p;
            q=p;
        }
        else
        {
            q.next=p;
            q=p;
        }
        print();
    }
    //---------------------------------------
    public void addafter()
    {
        print();
        String impty=(JOptionPane.showInputDialog("ادخل القيمة المراد الاضافة بعدها:"));
        node t=head;
        while(t!=null)
        {
            
            if(t.data.equalsIgnoreCase(impty))
                {
                    if(t==q)
                        addlast();
                    else
                    {
                    creatnode();
                    p.next=t.next;
                    t.next=p;
                    break; 
                    }
                }
            t=t.next;
        }
    }
    //-----------------------------
    public void addbefor()
    {
        print();
        String impty=(JOptionPane.showInputDialog("ادخل القيمة المراد الاضافة قبلها:"));
        node t=head,prev=head;
        while(t!=null)
        {
            if(t.data.equalsIgnoreCase(impty))
                {
                    if(t==head)
                        addfirst();
                    else
                    {
                        creatnode();
                         p.next=prev.next;
                         prev.next=p;
                         break;  
                    }
                }
            prev=t;
            t=t.next;
        }
    }
    
    //-------------------------------------
    public void print()
    {
        node t=head;
        String out="";
        while(t!=null)
        {
          out+=t.data+"\n|\n";
          t=t.next;
        }
        tt.setText(out);
                
    }
    //------------------------------------
    public void delete_frist()
    {
        if(head==null)
            JOptionPane.showMessageDialog(null, "empty");
        else if(head==q)
        {
            JOptionPane.showMessageDialog(null, "القيمة المحذوفة هي:"+head.data);
            head=null;
            q=null;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "القيمة المحذوفة هي:"+head.data);
            node t=head;
            head=head.next;
            t.next=null;
            
        }
    }
    //----------------------------
    public void delete_last()
    {
        if(head==null)
            JOptionPane.showMessageDialog(null, "empty");
        else if(head==q)
        {
            JOptionPane.showMessageDialog(null, "القيمة المحذوفة هي:"+head.data);
            head=null;
            q=null;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "القيمة المحذوفة هي:"+head.data);
            node t=head,pr=head;
            while(t.next!=null)
            {
                pr=t;
                t=t.next;
            }
            q=pr;
            q.next=null;
        }
    }
    public void delete_enyvalue()
    {
        if(head==null)
            JOptionPane.showMessageDialog(null, "empty");
        else
        {
            print();
            String impty=(JOptionPane.showInputDialog("ادخل القيمة المراد حذفها:"));
            node t=head,pr=head;
            while(t!=null)
            {
                if(t.data.equalsIgnoreCase(impty))
                {
                    if(head==t)
                        delete_frist();
                    else if(t==q)
                        delete_last();
                    else
                    {
                        JOptionPane.showMessageDialog(null, "القيمة المحذوفة هي:"+t.data);
                        pr.next=t.next;
                        t.next=null;
                    }
 
                }
              pr=t;
              t=t.next;
            }
        }
    print();
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        addfrist = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        t3 = new javax.swing.JTextArea();
        addlast = new javax.swing.JButton();
        show = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tt = new javax.swing.JTextArea();
        openfirst = new javax.swing.JButton();
        openlast = new javax.swing.JButton();
        openenyfile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 255)));

        t1.setBackground(new java.awt.Color(204, 204, 204));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("××Exit××");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        addfrist.setBackground(java.awt.Color.red);
        addfrist.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addfrist.setText("addfirst");
        addfrist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addfristActionPerformed(evt);
            }
        });

        t3.setColumns(20);
        t3.setRows(5);
        jScrollPane2.setViewportView(t3);

        addlast.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        addlast.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addlast.setText("addlast");
        addlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addlastActionPerformed(evt);
            }
        });

        show.setBackground(new java.awt.Color(204, 204, 255));
        show.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        show.setText("show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        tt.setColumns(20);
        tt.setRows(5);
        jScrollPane1.setViewportView(tt);

        openfirst.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        openfirst.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        openfirst.setText("open first");
        openfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openfirstActionPerformed(evt);
            }
        });

        openlast.setBackground(javax.swing.UIManager.getDefaults().getColor("Component.custom.borderColor"));
        openlast.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        openlast.setText("open last");
        openlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openlastActionPerformed(evt);
            }
        });

        openenyfile.setBackground(new java.awt.Color(0, 153, 0));
        openenyfile.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        openenyfile.setText("openenyfile");
        openenyfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openenyfileActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("ادخل المراد فتحه");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addlast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addfrist, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(openenyfile, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(show, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(openfirst, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(openlast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(addfrist, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(addlast, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(openenyfile, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(openfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(openlast, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addfristActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addfristActionPerformed
      addfirst();
    }//GEN-LAST:event_addfristActionPerformed

    private void addlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addlastActionPerformed
    addlast();
    }//GEN-LAST:event_addlastActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
      try
        {
            if(ch==-1)
            {
                x=head;
                ch=1;
            }
            else
            {
                if(x.next!=null)
                    x=x.next;
                else
                {
                    ch=-1;
                    x=head;
                }
            }
            
            Desktop.getDesktop().open(new File(x.data));
            
        }
        catch(Exception e)
        {
            
        }
                                      

    }//GEN-LAST:event_showActionPerformed

    private void openfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openfirstActionPerformed
       if(head!=null)
            try {
                Desktop.getDesktop().open(new File(head.data));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "الملف فارغ!!");
        }
    }//GEN-LAST:event_openfirstActionPerformed

    private void openlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openlastActionPerformed
        if(head!=null)
            try {
                Desktop.getDesktop().open(new File(q.data));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "الملف فارغ!!");
        }
    }//GEN-LAST:event_openlastActionPerformed

    private void openenyfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openenyfileActionPerformed
    int k = 0;
        node t=head;
        while(t!=null)
        {
            if(t1.getText().equalsIgnoreCase(t.data))
                 try {
                     t3.setBackground(Color.green);
                t3.setText("FOUND");
                Desktop.getDesktop().open(new File(t.data));
                t1.setText("");
                k++;
                t1.setBackground(Color.gray);
                break;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "الملف غير مجود بالقائمة تأكد من كتابة المسار بالشكل الصحيح!!");
            t1.setText("");
            t1.setBackground(Color.red);
            
        }
            
            t=t.next;
        }
        if(k==0){
            t3.setBackground(Color.red);
            t3.setText("NOT FOUND");
            JOptionPane.showMessageDialog(rootPane, "العنوان والمسار الذي أدخلته غير متوفر في القائمة \n\t\t\tلرجاء  أدخل شيء يوجد في القائمة");
        }
          
    }//GEN-LAST:event_openenyfileActionPerformed

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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addfrist;
    private javax.swing.JButton addlast;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton openenyfile;
    private javax.swing.JButton openfirst;
    private javax.swing.JButton openlast;
    private javax.swing.JButton show;
    private javax.swing.JTextField t1;
    private javax.swing.JTextArea t3;
    private javax.swing.JTextArea tt;
    // End of variables declaration//GEN-END:variables
}
