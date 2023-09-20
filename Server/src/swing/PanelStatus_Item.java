/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

public class PanelStatus_Item extends javax.swing.JLayeredPane {

    
    public PanelStatus_Item() {
        initComponents();
    }

    public void showStatus (int values){
        pro.setValue(values);
    }
    public void setFile(String fileName,String fileSize){
       IbFileName.setText(fileName);
       IbSize.setText(fileSize);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pro = new javax.swing.JProgressBar();
        IbFileName = new javax.swing.JLabel();
        IbSize = new javax.swing.JLabel();

        setOpaque(false);

        pro.setBackground(new java.awt.Color(0, 204, 204));
        pro.setFont(new java.awt.Font("Uni Sans Heavy CAPS", 0, 10)); // NOI18N
        pro.setForeground(new java.awt.Color(0, 0, 0));
        pro.setStringPainted(true);

        IbFileName.setFont(new java.awt.Font("Segoe UI Semilight", 0, 8)); // NOI18N
        IbFileName.setText("File Name");

        IbSize.setFont(new java.awt.Font("Segoe UI Historic", 0, 8)); // NOI18N
        IbSize.setText("Size");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IbFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IbSize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pro, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IbFileName)
                    .addComponent(IbSize)
                    .addComponent(pro, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IbFileName;
    private javax.swing.JLabel IbSize;
    private javax.swing.JProgressBar pro;
    // End of variables declaration//GEN-END:variables
}
