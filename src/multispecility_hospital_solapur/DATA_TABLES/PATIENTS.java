
package multispecility_hospital_solapur.DATA_TABLES;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import multispecility_hospital_solapur.use.GetConnection;

public class PATIENTS extends javax.swing.JFrame {
  public PATIENTS() {
        initComponents();
        Statement statement = new GetConnection().Connect_mysql();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        String query = "SELECT * FROM VHSHOSPITAL.APPOINTMENTS";
try {
        ResultSet result = statement.executeQuery(query);
        DefaultTableModel model = null;
        model = new DefaultTableModel(
            new Object []{"SR", "PID", "FNAME", "MNAME", "LNAME", "AGE", "GENDER", "DOB", "MSTATUS", "CONTACT1", "CONTACT2", "AADHAARNO", "PANNO", "DRNAME", "FEE", "OPDNO", "SYMPTOMS", "ADDRESS", "CITY", "DISTRICT", "STATE", "COUNTRY", "PINCODE", "TIME", "DATE"},
            0
            );
            while (result.next()) {
                model.addRow(
                  new Object[] {
                   result.getString("SR"),
                   result.getString("PID"),
                   result.getString("FNAME"), 
                   result.getString("MNAME"),
                   result.getString("LNAME"),
                   result.getString("AGE"),
                   result.getString("GENDER"),
                   result.getString("DOB"),
                   result.getString("MSTATUS"),
                   result.getString("CONTACT1"),
                   result.getString("CONTACT2"),
                   result.getString("AADHAARNO"), 
                   result.getString("PANNO"),
                   result.getString("DRNAME"),
                   result.getString("FEE"),
                   result.getString("OPDNO"),
                   result.getString("SYMPTOMS"),
                   result.getString("ADDRESS"),
                   result.getString("CITY"),
                   result.getString("DISTRICT"),
                   result.getString("STATE"),
                   result.getString("COUNTRY"),
                   result.getString("PINCODE"),
                   result.getString("TIME"),
                   result.getString("DATE"),
                 }
        );
        System.out.println(model);
      }
      PATIENTS_DATA.setModel(model);
    } catch (Exception e) {
      System.out.println(e);
    }
    }
  
  
  
public void search(String str){
        DefaultTableModel model = (DefaultTableModel) PATIENTS_DATA.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        PATIENTS_DATA.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        PATIENTS_DATA = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_search.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton1.setText("Search Patients");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 3, 18)); // NOI18N
        jLabel1.setText("PATIENTS    DETAILS");

        PATIENTS_DATA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SR", "PID", "FIRST NAME", "MIDDLE NAME", "LAST NAME", "AGE", "GENDER", "DATE OF BIRTH", "MSTATUS", "CONTACT1", "CONTACT2", "AADHAAR NO", "PAN NO", "DR NAME", "OPD NO", "FEE", "SYSMPTOMS", "ADDRESS", "CITY", "DISTRICT", "STATE", "COUNTRY", "PINCODE", "DATE", "TIME"
            }
        ));
        PATIENTS_DATA.setEnabled(false);
        PATIENTS_DATA.setGridColor(new java.awt.Color(145, 178, 224));
        jScrollPane9.setViewportView(PATIENTS_DATA);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(404, 404, 404)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 1919, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String af = txt_search.getText();
        search(af);
        
    }//GEN-LAST:event_jButton1ActionPerformed
      public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PATIENTS().setVisible(true);
                
            }
            
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PATIENTS_DATA;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
