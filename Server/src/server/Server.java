/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package server;

import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.listener.ConnectListener;
import com.corundumstudio.socketio.listener.DataListener;
import com.corundumstudio.socketio.listener.DisconnectListener;
import data.DataClient;
import data.DataFileSending;
import data.DataFileServer;
import data.DataInitFile;
import data.DataRequestFile;
import data.DataWriter;
import java.awt.Component;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author seruj
 */
public class Server extends javax.swing.JFrame {

   
    public Server() {
        initComponents();
          table.getColumnModel().getColumn(3).setCellRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                Object data = jtable.getValueAt(i,0);
                if (data instanceof DataClient){
                  return ((DataClient)data).getStatus();
                }else{
                return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1); 
       
                }
                     }
              
          });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPopupMenu();
        disconnect = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        cmdStart = new javax.swing.JButton();

        disconnect.setText("Disconnect\n");
        disconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnectActionPerformed(evt);
            }
        });
        menu.add(disconnect);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Fieldstones", 0, 12)); // NOI18N
        jLabel2.setText("SERVER");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Uni Sans Heavy CAPS", 0, 48)); // NOI18N
        jLabel3.setText("FILE ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 110, 60));

        jLabel4.setBackground(new java.awt.Color(0, 204, 204));
        jLabel4.setFont(new java.awt.Font("Uni Sans Heavy CAPS", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("X");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 60, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\seruj\\Desktop\\New Folder (2)\\2996467.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "No", "Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(0);
            table.getColumnModel().getColumn(0).setPreferredWidth(0);
            table.getColumnModel().getColumn(0).setMaxWidth(0);
            table.getColumnModel().getColumn(1).setPreferredWidth(1);
            table.getColumnModel().getColumn(2).setPreferredWidth(10);
            table.getColumnModel().getColumn(3).setPreferredWidth(180);
            table.getColumnModel().getColumn(3).setMaxWidth(180);
        }

        cmdStart.setText("Start Server");
        cmdStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addComponent(cmdStart)
                .addGap(27, 27, 27))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(cmdStart)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 380, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     private final int DEFAULT_PORT = 9999;
     private final List<DataFileServer> listFiles=new ArrayList<>();
    private void cmdStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdStartActionPerformed
        Configuration configuration = new Configuration();
        configuration.setPort(DEFAULT_PORT);
        SocketIOServer server = new SocketIOServer(configuration);
        
        server.addConnectListener(new ConnectListener(){
            @Override
            public void onConnect(SocketIOClient sioc) {
               DataClient client = new DataClient (sioc, "",table);
               
               addTableRow(client); 
            }
    });
     server.addDisconnectListener(new DisconnectListener(){
            @Override
            public void onDisconnect(SocketIOClient sioc) {
                removeClient(sioc);
            }
     
     });
         server.addEventListener("set_user", String.class, new DataListener<String>(){
            @Override
            public void onData(SocketIOClient sioc, String t, AckRequest ar) throws Exception {
                setUserName(sioc,t);
            }
            
        });
        server.addEventListener("send_file", DataInitFile.class, new DataListener<DataInitFile>(){
            @Override
            public void onData(SocketIOClient sioc, DataInitFile t, AckRequest ar) throws Exception {
                System.out.println("get data init file");
                int fileID= initFileTransfer(sioc,t);
                  if (fileID>0){
                    ar.sendAckData(true,fileID);
                  }
            }
             
        });  
        server.addEventListener("sending", DataFileSending.class, new DataListener<DataFileSending>(){
            @Override
            public void onData(SocketIOClient sioc, DataFileSending t, AckRequest ar) throws Exception {
                if (!t.isFinish()){
                   writeFile(sioc,t);
                   ar.sendAckData(true);
                }else {
                  ar.sendAckData(false);
                  DataFileServer data= closeFile(sioc,t);
                    if (data !=null){
                      server.getBroadcastOperations().sendEvent("new_file", data);
                    }
                }
            
            }
            
        });
        server.addEventListener("r_f_l", Integer.class, new DataListener<Integer>(){
            @Override
            public void onData(SocketIOClient sioc, Integer t, AckRequest ar) throws Exception {
                try {
                    long length = getFileLength(sioc, t);
                    if (length > 0){
                      ar.sendAckData(length + "");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
  
            }
        });
        server.addEventListener("request", String.class, new DataListener<String>(){
            @Override
            public void onData(SocketIOClient sioc, String t, AckRequest ar) throws Exception {
                if (t.equals("list_file")) {
                    ar.sendAckData(listFiles.toArray());
                }
            }
        }
        );
        server.addEventListener("request_file",DataRequestFile.class,new DataListener<DataRequestFile>(){
            @Override
            public void onData(SocketIOClient sioc, DataRequestFile t, AckRequest ar) throws Exception {
                   try {
                    byte b []=getFile(t);
                    if (b !=null){
                      ar.sendAckData(b);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
         server.start();
    }//GEN-LAST:event_cmdStartActionPerformed
     
    private void disconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectActionPerformed
        if (table.getSelectedRow()>=0){
           int row = table.getSelectedRow();
           DataClient data=(DataClient)table.getValueAt(row,0);
           data.getClient().sendEvent("exit_app", "");
        }
    }//GEN-LAST:event_disconnectActionPerformed

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased
        if (table.getSelectedRow()>=0&&SwingUtilities.isRightMouseButton(evt)){
           menu.show(table,evt.getX(),evt.getY());
        }
    }//GEN-LAST:event_tableMouseReleased
   
    private void addTableRow (DataClient data){
       DefaultTableModel model = (DefaultTableModel)table.getModel();
       model.addRow(data.toRowTable(table.getRowCount()+1));
    }
    private void removeClient(SocketIOClient client){
          DefaultTableModel model = (DefaultTableModel)table.getModel();
        for (int i=0; i<table.getRowCount();i++){
            DataClient data =(DataClient)table.getValueAt(i, 0);
            if(data.getClient()==client){
             model.removeRow(i);
             break;
            }
          }
    }
    private void setUserName (SocketIOClient client,String name) {
         DefaultTableModel model = (DefaultTableModel)table.getModel();
        for (int i=0; i<table.getRowCount();i++){
            DataClient data =(DataClient)table.getValueAt(i, 0);
            if(data.getClient()==client){
             data.setName(name);
             model.setValueAt(name, i, 2);
             break;
            }
          }
    }
    
    private int initFileTransfer(SocketIOClient client,DataInitFile dataInit){
         
        int id=0;
         for (int i=0; i<table.getRowCount();i++){
            DataClient data =(DataClient)table.getValueAt(i, 0);
            if(data.getClient()==client){
                try{
                     id=generateFileID();
                File file = new File("C:/socket_data/"+ id + "-" +dataInit.getFileName());
                DataWriter writer = new DataWriter(file,dataInit.getFileSize());
                data.addWrite(writer, id);
                    
                }catch(Exception e){
                    e.printStackTrace();
                }
             break;
            }
          }
         return id;
    }
    
    private boolean writeFile(SocketIOClient client,DataFileSending file){
        boolean error = false;
       for (int i=0; i<table.getRowCount();i++){
            DataClient data =(DataClient)table.getValueAt(i, 0);
            if(data.getClient()==client){
                try{
                      data.writeFile(file.getData(), file.getFileID());
                
                }catch(Exception e){
                    error = true;
                    e.printStackTrace();
                }
             break;
            }
          }
       return !error;
    }
    
    private DataFileServer closeFile (SocketIOClient client,DataFileSending file){
        DataFileServer fileServer= null;
           for (int i=0; i<table.getRowCount();i++){
            DataClient data =(DataClient)table.getValueAt(i, 0);
            if(data.getClient()==client){
              try{
                  
                  fileServer = data.getDataFileServer(fileID);
                  listFiles.add(fileServer);
                  data.closeWriter(file.getFileID());
              }catch(Exception e){
                e.printStackTrace();
              }
             break;
            }
            } 
           return fileServer;
    }
    
    private long getFileLength(SocketIOClient client,int fileID)throws IOException{
         for (int i=0; i<table.getRowCount();i++){
            DataClient data =(DataClient)table.getValueAt(i, 0);
            if(data.getClient()==client){
              return data.getFileLength(fileID);
            
            }
            } 
         return 0;
     }
    private int fileID;
    
    private synchronized int generateFileID(){
        fileID++;
        return fileID;
    }
    private byte[]getFile (DataRequestFile data)throws IOException{
      for (DataFileServer d : listFiles){
         if (d.getFileID()== data.getFileID()){
            RandomAccessFile accFile = new RandomAccessFile(d.getOutPutPath(),"r");
            accFile.seek(data.getLength());
            long filePointer=data.getLength();
            long fileSize = d.getFileSizeLength();
              if (filePointer != fileSize) {
            int max = 2000;
            long length = filePointer + max >= fileSize ? fileSize - filePointer : max;
            byte[] b = new byte[(int) length];
            accFile.read(b);
            return b;
        } else {
            return null;
        }
         }
      }
      return null;
    }
    
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
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdStart;
    private javax.swing.JMenuItem disconnect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu menu;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
