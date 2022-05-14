package multispecility_hospital_solapur.DATA_TABLES;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import multispecility_hospital_solapur.use.GetConnection;

public class WARDS_PATIENT_DATA extends javax.swing.JFrame {

  public WARDS_PATIENT_DATA(
    String PID,
    String FNAME,
    String AGE,
    String GENDER,
    int DrId
  ) {
    initComponents();
    Statement statement = new GetConnection().Connect_mysql();
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    this.dispose();
    PNAME.setText(FNAME);
    PAGE.setText(AGE);
    PGENDER.setText(GENDER);

    String query = "SELECT * FROM DOC_" + DrId + ".P_" + PID;
    try {
      ResultSet result = statement.executeQuery(query);
      DefaultTableModel model = null;
      model =
        new DefaultTableModel(
          new Object[] {
            "SR",
            "ID",
            "SYMPTOMS",
            "MEDICINES",
            "TREATMENT",
            "TEST",
            "TESTREPORTS",
            "TIME",
            "DATE",
          },
          0
        );
      while (result.next()) {
        model.addRow(
          new Object[] {
            result.getString("SR"),
            result.getString("ID"),
            result.getString("SYMPTOMS"),
            result.getString("MEDICINES"),
            result.getString("TREATMENT"),
            result.getString("TEST"),
            result.getString("TESTREPORTS"),
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

  public void search(String str) {
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
    PNAME = new javax.swing.JLabel();
    PAGE = new javax.swing.JLabel();
    PGENDER = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    txt_search.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
    txt_search.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          txt_searchActionPerformed(evt);
        }
      }
    );

    jButton1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
    jButton1.setText("Search Patients");
    jButton1.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jButton1ActionPerformed(evt);
        }
      }
    );

    jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 3, 18)); // NOI18N
    jLabel1.setText("PATIENTS    DETAILS");

    PATIENTS_DATA.setModel(
      new javax.swing.table.DefaultTableModel(
        new Object[][] {},
        new String[] {
          "SR",
          "PID",
          "SYMPTOMS",
          "MEDICINES",
          "TRETMENT",
          "TEST",
          "REPORTS",
          "DATE",
          "TIME",
        }
      ) {
        boolean[] canEdit = new boolean[] {
          false,
          false,
          false,
          false,
          false,
          false,
          false,
          false,
          false,
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
          return canEdit[columnIndex];
        }
      }
    );
    PATIENTS_DATA.setEnabled(false);
    PATIENTS_DATA.setGridColor(new java.awt.Color(145, 178, 224));
    jScrollPane9.setViewportView(PATIENTS_DATA);
    if (PATIENTS_DATA.getColumnModel().getColumnCount() > 0) {
      PATIENTS_DATA.getColumnModel().getColumn(0).setPreferredWidth(20);
      PATIENTS_DATA.getColumnModel().getColumn(1).setPreferredWidth(50);
    }

    PNAME.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N

    PAGE.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N

    PGENDER.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
    PGENDER.setText("GENDER");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
      jPanel1
    );
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel1Layout
            .createSequentialGroup()
            .addGroup(
              jPanel1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  jPanel1Layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(
                      txt_search,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      182,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED
                    )
                    .addComponent(jButton1)
                    .addGap(404, 404, 404)
                    .addComponent(
                      jLabel1,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      250,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addGap(39, 39, 39)
                    .addComponent(
                      PNAME,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      513,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addGap(18, 18, 18)
                    .addComponent(
                      PAGE,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      85,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addGap(32, 32, 32)
                    .addComponent(
                      PGENDER,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      199,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
                .addComponent(
                  jScrollPane9,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  1919,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(24, 24, 24)
        )
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel1Layout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              jPanel1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  jPanel1Layout
                    .createSequentialGroup()
                    .addGroup(
                      jPanel1Layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.BASELINE
                        )
                        .addComponent(
                          txt_search,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          29,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addComponent(jButton1)
                        .addComponent(jLabel1)
                    )
                    .addGap(23, 23, 23)
                )
                .addGroup(
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  jPanel1Layout
                    .createSequentialGroup()
                    .addGroup(
                      jPanel1Layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.TRAILING
                        )
                        .addComponent(
                          PNAME,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          29,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addGroup(
                          jPanel1Layout
                            .createParallelGroup(
                              javax.swing.GroupLayout.Alignment.LEADING
                            )
                            .addComponent(PGENDER)
                            .addComponent(
                              PAGE,
                              javax.swing.GroupLayout.PREFERRED_SIZE,
                              20,
                              javax.swing.GroupLayout.PREFERRED_SIZE
                            )
                        )
                    )
                    .addGap(18, 18, 18)
                )
            )
            .addComponent(
              jScrollPane9,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              863,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
        )
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
      getContentPane()
    );
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addComponent(
              jPanel1,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(0, 0, Short.MAX_VALUE)
        )
    );
    layout.setVerticalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addComponent(
              jPanel1,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(0, 0, Short.MAX_VALUE)
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_txt_searchActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_txt_searchActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton1ActionPerformed
    String af = txt_search.getText();
    search(af);
  } //GEN-LAST:event_jButton1ActionPerformed

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
      java.util.logging.Logger
        .getLogger(WARDS_PATIENT_DATA.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger
        .getLogger(WARDS_PATIENT_DATA.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger
        .getLogger(WARDS_PATIENT_DATA.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger
        .getLogger(WARDS_PATIENT_DATA.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {
        public void run() {}
      }
    );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel PAGE;
  private javax.swing.JTable PATIENTS_DATA;
  private javax.swing.JLabel PGENDER;
  private javax.swing.JLabel PNAME;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane9;
  private javax.swing.JTextField txt_search;
  // End of variables declaration//GEN-END:variables
}
