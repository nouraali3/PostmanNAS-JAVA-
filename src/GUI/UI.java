
package GUI;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import postman.PostmanSimulator;
public class UI extends javax.swing.JFrame 
{

    PostmanSimulator ps=new PostmanSimulator();
    
    public UI() 
    {
        initComponents();
        parampnl.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        urltxt = new javax.swing.JTextField();
        sndbtn = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        statustxt = new javax.swing.JLabel();
        reqCh = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        clearbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resptxt = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        parampnl = new javax.swing.JPanel();
        controlBittxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SimHei", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(138, 62, 11));
        jLabel1.setText("url");

        sndbtn.setText("send");
        sndbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sndbtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SimHei", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(138, 62, 11));
        jLabel3.setText("response");

        jLabel4.setFont(new java.awt.Font("SimHei", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(138, 62, 11));
        jLabel4.setText("status");

        statustxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reqCh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GET", "POST", " " }));
        reqCh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqChActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SimHei", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(138, 62, 11));
        jLabel2.setText("request");

        clearbtn.setText("clear all");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        resptxt.setColumns(20);
        resptxt.setRows(5);
        jScrollPane1.setViewportView(resptxt);

        jLabel6.setFont(new java.awt.Font("SimHei", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(235, 104, 8));
        jLabel6.setText("Postman Demo");

        controlBittxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlBittxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SimHei", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(138, 62, 11));
        jLabel5.setText("control bit");

        javax.swing.GroupLayout parampnlLayout = new javax.swing.GroupLayout(parampnl);
        parampnl.setLayout(parampnlLayout);
        parampnlLayout.setHorizontalGroup(
            parampnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parampnlLayout.createSequentialGroup()
                .addGroup(parampnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(controlBittxt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        parampnlLayout.setVerticalGroup(
            parampnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parampnlLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlBittxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(parampnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(148, 148, 148)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(reqCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(urltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sndbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(statustxt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                .addGap(20, 20, 20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reqCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(urltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sndbtn)
                            .addComponent(clearbtn))))
                .addGap(15, 15, 15)
                .addComponent(parampnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statustxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reqChActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqChActionPerformed
        int req=reqCh.getSelectedIndex();
        if(req==1)
            parampnl.setVisible(true);
    }//GEN-LAST:event_reqChActionPerformed

    private void sndbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sndbtnActionPerformed
      
      int req=reqCh.getSelectedIndex();
      
      if(req==0)
      {
        try 
            {executeGET();}
        catch (JSONException ex) 
            {Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);}
      }
      else if(req==1)
          executePOST();
      
      
    }//GEN-LAST:event_sndbtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        setFieldsToDefault();
    }//GEN-LAST:event_clearbtnActionPerformed

    private void controlBittxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlBittxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_controlBittxtActionPerformed
    private void executeGET() throws JSONException
    {  
        // http://lab1.wirelessglue.com:8889/res/fulcrum/device/dcc77f91-288f-427d-9d5d-49ff1693e3c8
        String userUrl =urltxt.getText();
        
        ps.GETRequest(userUrl);
        
        printToUIGetResponse(ps.getResponseCode(),ps.getResponseArray());
    }
    
    private void printToUIGetResponse(String responseCode,String[] response)
    {
        statustxt.setText(responseCode);
        for (String string : response)
            resptxt.append(string);
        sndbtn.setSelected(false);
    }
    
    private void executePOST()
    {
        //http://lab1.wirelessglue.com:8889/res/fulcrum/device/dcc77f91-288f-427d-9d5d-49ff1693e3c8/cmd
        String controlBit=controlBittxt.getText();
        String userUrl =urltxt.getText();
        
        ps.POSTRequest(userUrl,controlBit);
        
        printToUIPostResponse(ps.getResponseCode());
    }
    
    private void printToUIPostResponse(String responseCode)
    {
        statustxt.setText(responseCode);
        sndbtn.setSelected(false);
    }
    private void setFieldsToDefault()
    {
        urltxt.setText("");
        controlBittxt.setText("");
        statustxt.setText("");
        resptxt.setText("");
        sndbtn.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearbtn;
    private javax.swing.JTextField controlBittxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel parampnl;
    private javax.swing.JComboBox<String> reqCh;
    private javax.swing.JTextArea resptxt;
    private javax.swing.JToggleButton sndbtn;
    private javax.swing.JLabel statustxt;
    private javax.swing.JTextField urltxt;
    // End of variables declaration//GEN-END:variables
}
