/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import java.awt.event.ActionListener;

public class PanelStatus extends javax.swing.JPanel {

    
    public PanelStatus() {
        initComponents();
    }

    public void showStatus (int values){
        pro.setValue(values);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pro = new javax.swing.JProgressBar();
        cmd = new javax.swing.JButton();

        pro.setBackground(new java.awt.Color(0, 204, 204));
        pro.setFont(new java.awt.Font("Uni Sans Heavy CAPS", 0, 10)); // NOI18N
        pro.setForeground(new java.awt.Color(0, 0, 0));
        pro.setStringPainted(true);

        cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/png2.png"))); // NOI18N
        cmd.setContentAreaFilled(false);
        cmd.setMaximumSize(new java.awt.Dimension(20, 20));
        cmd.setMinimumSize(new java.awt.Dimension(15, 15));
        cmd.setName("R"); // NOI18N
        cmd.setPreferredSize(new java.awt.Dimension(20, 20));
        cmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pro, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pro, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
            .addComponent(cmd, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActionPerformed
      if (cmd.getName().equals("R")){
       cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/png2.png"))); // NOI18N
      cmd.setName("P");
      }else if (cmd.getName().equals("P")){
          cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/png3.png"))); // NOI18N
         cmd.setName("R");
      }
      event.actionPerformed(evt);
    }//GEN-LAST:event_cmdActionPerformed
public void done(){
      cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/png1.png"))); // NOI18N
      cmd.setName("D");
    }
   
public boolean isPause(){
   return cmd.getName().equals("P");
}
private ActionListener event;
 public void addEvent (ActionListener event){
    this.event=event;
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd;
    private javax.swing.JProgressBar pro;
    // End of variables declaration//GEN-END:variables
}
