
package multispecility_hospital_solapur.DATA_TABLES;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import multispecility_hospital_solapur.use.GetConnection;

public class ADMIT_PATIENTS extends javax.swing.JFrame {
   Statement statement = new GetConnection().Connect_mysql();

    public ADMIT_PATIENTS() {
                initComponents();

    }
    public ADMIT_PATIENTS(int did){
        initComponents(); 
        setExtendedState(MAXIMIZED_BOTH);
        String query = "SELECT * FROM DOC_" + did +".ADMIT";
            try {
    ResultSet result = statement.executeQuery(query);
    DefaultTableModel model = null;
    model = new DefaultTableModel(
        new Object []{"SR", "PID", "FNAME", "MNAME", "LNAME", "AGE", "GENDER", "DRNAME", "WARDNAME", "BEDNO", "DATEOFADMIT", "CFULLNAME", "CAGE", "CGENDER", "CCONTACT", "CRELATIONTOPATIENT", "CAADHAARNO", "CADDRESS", "DATE", "TIME"},
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
                result.getString("DRNAME"),
                result.getString("WARDNAME"),
                result.getString("BEDNO"),
                result.getString("DATEOFADMIT"),
                result.getString("CFULLNAME"),
                result.getString("CAGE"),
                result.getString("CGENDER"),
                result.getString("CCONTACT"),
                result.getString("CRELATIONTOPATIENT"),
                result.getString("CAADHAARNO"),
                result.getString("CADDRESS"),
                result.getString("DATE"),
                result.getString("TIME"),
    }
    );
    System.out.println(model);
  }
  ADMITPATIENT.setModel(model);
  
} catch (Exception e) {
  System.out.println(e);
}

    }
 
    public void search(String str){
        DefaultTableModel model = (DefaultTableModel) ADMITPATIENT.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        ADMITPATIENT.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ADMITPATIENT = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setEnabled(false);

        ADMITPATIENT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SR", "PID", "FNAME", "MNAME", "LNAME", "AGE", "GENDER", "DRNAME", "WARDNAME", "BEDNO", "DATEOFADMIT", "CFULLNAME", "CAGE", "CGENDER", "CCONTACT", "CRELATIONTOPATIENT", "CAADHAARNO", "CADDRESS", "DATE", "TIME"
            }
        ));
        jScrollPane1.setViewportView(ADMITPATIENT);

        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("ADMIT PATIANTS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jButton1)
                .addGap(395, 395, 395)
                .addComponent(jLabel1)
                .addContainerGap(973, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String af = txt_search.getText();
     search(af);        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADMIT_PATIENTS().setVisible(true);
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ADMITPATIENT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
