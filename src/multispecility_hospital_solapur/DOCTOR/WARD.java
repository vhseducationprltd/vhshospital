package multispecility_hospital_solapur.DOCTOR;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.Timer;
import multispecility_hospital_solapur.DATA_TABLES.WARDS_PATIENT_DATA;
import multispecility_hospital_solapur.LOGIN_FORM;
import multispecility_hospital_solapur.use.GetConnection;

public class WARD extends javax.swing.JFrame {

  public WARD() {
    initComponents();
    statement = new GetConnection().Connect_mysql();
    showDate();
    showTime();
    this.setExtendedState(MAXIMIZED_BOTH);
  }

  public WARD(ResultSet res) {
    initComponents();
    showDate();
    showTime();

    this.setExtendedState(MAXIMIZED_BOTH);
    String nurseName = "";
    try {
      while (res.next()) {
        nurseName = res.getString("FNAME") + " " + res.getString("LNAME");
      }
      NURSENAME.setText(nurseName);
    } catch (Exception e) {}
    statement = new GetConnection().Connect_mysql();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    jPanel1 = new javax.swing.JPanel();
    jLabel4 = new javax.swing.JLabel();
    jPanel3 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel5 = new javax.swing.JLabel();
    PID = new javax.swing.JTextField();
    SUBMIT = new javax.swing.JButton();
    UPDATE = new javax.swing.JButton();
    LOGOUT = new javax.swing.JButton();
    FNAME = new javax.swing.JLabel();
    GENDER = new javax.swing.JLabel();
    AGE = new javax.swing.JLabel();
    jPanel5 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    SYMPTOMS = new javax.swing.JTextArea();
    jLabel7 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jScrollPane4 = new javax.swing.JScrollPane();
    TEST = new javax.swing.JTextArea();
    jLabel10 = new javax.swing.JLabel();
    jScrollPane3 = new javax.swing.JScrollPane();
    TREATMENT = new javax.swing.JTextArea();
    jLabel11 = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    MEDICINES = new javax.swing.JTextArea();
    jLabel12 = new javax.swing.JLabel();
    jScrollPane5 = new javax.swing.JScrollPane();
    REPORTS = new javax.swing.JTextArea();
    DRNAME = new javax.swing.JLabel();
    VIEW1 = new javax.swing.JButton();
    WARDERR = new javax.swing.JLabel();
    VIEW = new javax.swing.JButton();
    jLabel6 = new javax.swing.JLabel();
    TIME = new javax.swing.JLabel();
    DATE = new javax.swing.JLabel();
    NURSENAME = new javax.swing.JLabel();
    jLabel13 = new javax.swing.JLabel();
    jLabel14 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(0, 153, 153));

    jLabel4.setIcon(
      new javax.swing.ImageIcon(getClass().getResource("/Assets/logo_1.png"))
    ); // NOI18N

    jPanel3.setBackground(new java.awt.Color(0, 153, 153));

    jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 3, 48)); // NOI18N
    jLabel1.setText("VHS MULTI-SPECIALITY HOSPITAL ,");
    jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    jLabel2.setFont(new java.awt.Font("Imprint MT Shadow", 3, 48)); // NOI18N
    jLabel2.setText("SOLAPUR .  413006");
    jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
      jPanel3
    );
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel3Layout
            .createSequentialGroup()
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
            .addComponent(jLabel1)
            .addContainerGap()
        )
        .addGroup(
          jPanel3Layout
            .createSequentialGroup()
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
            .addComponent(
              jLabel2,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              507,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
        )
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel3Layout
            .createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel2)
            .addContainerGap()
        )
    );

    jLabel3.setIcon(
      new javax.swing.ImageIcon(getClass().getResource("/Assets/logo_2.png"))
    ); // NOI18N

    jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    jLabel5.setText("PID");

    PID.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    PID.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          PIDActionPerformed(evt);
        }
      }
    );
    PID.addKeyListener(
      new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
          PIDKeyPressed(evt);
        }
      }
    );

    SUBMIT.setBackground(new java.awt.Color(51, 153, 255));
    SUBMIT.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
    SUBMIT.setText("SUBMIT");
    SUBMIT.setMargin(new java.awt.Insets(7, 24, 7, 24));
    SUBMIT.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          SUBMITActionPerformed(evt);
        }
      }
    );

    UPDATE.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
    UPDATE.setText("UPDATE");
    UPDATE.setMargin(new java.awt.Insets(4, 27, 4, 27));
    UPDATE.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          UPDATEActionPerformed(evt);
        }
      }
    );

    LOGOUT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    LOGOUT.setText("LOG OUT");
    LOGOUT.addMouseListener(
      new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
          LOGOUTMouseClicked(evt);
        }
      }
    );
    LOGOUT.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          LOGOUTActionPerformed(evt);
        }
      }
    );

    FNAME.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    FNAME.setText("NAME :");

    GENDER.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    GENDER.setText("GENDER :");

    AGE.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    AGE.setText("AGE :");

    SYMPTOMS.setColumns(20);
    SYMPTOMS.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    SYMPTOMS.setRows(5);
    SYMPTOMS.addKeyListener(
      new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
          SYMPTOMSKeyPressed(evt);
        }
      }
    );
    jScrollPane1.setViewportView(SYMPTOMS);

    jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    jLabel7.setText("SYMPTOMS");

    jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    jLabel9.setText("MEDICINES");

    TEST.setColumns(20);
    TEST.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    TEST.setRows(5);
    jScrollPane4.setViewportView(TEST);

    jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    jLabel10.setText("TREATMENT");

    TREATMENT.setColumns(20);
    TREATMENT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    TREATMENT.setRows(5);
    jScrollPane3.setViewportView(TREATMENT);

    jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    jLabel11.setText("TEST");

    MEDICINES.setColumns(20);
    MEDICINES.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    MEDICINES.setRows(5);
    jScrollPane2.setViewportView(MEDICINES);

    jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    jLabel12.setText("TEST REPORTS");

    REPORTS.setColumns(20);
    REPORTS.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    REPORTS.setRows(5);
    REPORTS.addMouseListener(
      new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
          REPORTSMouseClicked(evt);
        }

        public void mouseEntered(java.awt.event.MouseEvent evt) {
          REPORTSMouseEntered(evt);
        }
      }
    );
    jScrollPane5.setViewportView(REPORTS);

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
      jPanel5
    );
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
      jPanel5Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel5Layout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              jPanel5Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  jPanel5Layout
                    .createSequentialGroup()
                    .addGroup(
                      jPanel5Layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.TRAILING,
                          false
                        )
                        .addComponent(
                          jScrollPane5,
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addComponent(
                          jLabel7,
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addComponent(
                          jScrollPane1,
                          javax.swing.GroupLayout.Alignment.LEADING,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          461,
                          Short.MAX_VALUE
                        )
                    )
                    .addGap(13, 13, 13)
                    .addGroup(
                      jPanel5Layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addComponent(jLabel9)
                        .addComponent(
                          jScrollPane2,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          470,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED
                    )
                    .addGroup(
                      jPanel5Layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addComponent(jLabel10)
                        .addComponent(
                          jScrollPane3,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          505,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED
                    )
                    .addGroup(
                      jPanel5Layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addComponent(jLabel11)
                        .addComponent(
                          jScrollPane4,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          442,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                )
                .addComponent(jLabel12)
            )
            .addContainerGap(31, Short.MAX_VALUE)
        )
    );
    jPanel5Layout.setVerticalGroup(
      jPanel5Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel5Layout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              jPanel5Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  jPanel5Layout
                    .createSequentialGroup()
                    .addComponent(jLabel7)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED
                    )
                    .addComponent(
                      jScrollPane1,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      163,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
                .addGroup(
                  jPanel5Layout
                    .createParallelGroup(
                      javax.swing.GroupLayout.Alignment.TRAILING
                    )
                    .addGroup(
                      jPanel5Layout
                        .createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(
                          javax.swing.LayoutStyle.ComponentPlacement.RELATED
                        )
                        .addComponent(
                          jScrollPane4,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          162,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                    .addGroup(
                      javax.swing.GroupLayout.Alignment.LEADING,
                      jPanel5Layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.TRAILING,
                          false
                        )
                        .addGroup(
                          jPanel5Layout
                            .createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(
                              javax.swing.LayoutStyle.ComponentPlacement.RELATED
                            )
                            .addComponent(jScrollPane3)
                        )
                        .addGroup(
                          javax.swing.GroupLayout.Alignment.LEADING,
                          jPanel5Layout
                            .createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(5, 5, 5)
                            .addComponent(
                              jScrollPane2,
                              javax.swing.GroupLayout.PREFERRED_SIZE,
                              163,
                              javax.swing.GroupLayout.PREFERRED_SIZE
                            )
                        )
                    )
                )
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.RELATED,
              23,
              Short.MAX_VALUE
            )
            .addComponent(jLabel12)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(
              jScrollPane5,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              162,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addContainerGap()
        )
    );

    DRNAME.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    DRNAME.setText("DR NAME :");

    VIEW1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
    VIEW1.setText("DISCHARGE");
    VIEW1.setMargin(new java.awt.Insets(4, 27, 4, 27));
    VIEW1.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          VIEW1ActionPerformed(evt);
        }
      }
    );

    WARDERR.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    WARDERR.setForeground(new java.awt.Color(204, 0, 0));
    WARDERR.setText("   ");

    VIEW.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
    VIEW.setText("VIEW");
    VIEW.setMargin(new java.awt.Insets(7, 24, 7, 24));
    VIEW.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          VIEWActionPerformed(evt);
        }
      }
    );

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
      jPanel2
    );
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel2Layout
            .createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel5)
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
            )
            .addComponent(
              PID,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              170,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(45, 45, 45)
            .addComponent(
              WARDERR,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              359,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.RELATED,
              36,
              Short.MAX_VALUE
            )
            .addComponent(
              FNAME,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              392,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(72, 72, 72)
            .addComponent(
              DRNAME,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              439,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(55, 55, 55)
            .addComponent(
              AGE,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              118,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(18, 18, 18)
            .addComponent(
              GENDER,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              169,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(50, 50, 50)
        )
        .addGroup(
          jPanel2Layout
            .createSequentialGroup()
            .addGap(24, 24, 24)
            .addComponent(LOGOUT)
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.RELATED,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
            .addComponent(SUBMIT)
            .addGap(41, 41, 41)
            .addComponent(VIEW)
            .addGap(38, 38, 38)
            .addComponent(UPDATE)
            .addGap(134, 134, 134)
            .addComponent(VIEW1)
            .addGap(51, 51, 51)
        )
        .addGroup(
          javax.swing.GroupLayout.Alignment.TRAILING,
          jPanel2Layout
            .createSequentialGroup()
            .addContainerGap()
            .addComponent(
              jPanel5,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
            .addContainerGap()
        )
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel2Layout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              jPanel2Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(
                  jPanel2Layout
                    .createParallelGroup(
                      javax.swing.GroupLayout.Alignment.BASELINE
                    )
                    .addComponent(
                      AGE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      Short.MAX_VALUE
                    )
                    .addComponent(
                      GENDER,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      Short.MAX_VALUE
                    )
                    .addComponent(
                      DRNAME,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      Short.MAX_VALUE
                    )
                    .addComponent(
                      FNAME,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      Short.MAX_VALUE
                    )
                )
                .addGroup(
                  javax.swing.GroupLayout.Alignment.LEADING,
                  jPanel2Layout
                    .createParallelGroup(
                      javax.swing.GroupLayout.Alignment.BASELINE
                    )
                    .addComponent(
                      jLabel5,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      Short.MAX_VALUE
                    )
                    .addComponent(
                      PID,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addComponent(WARDERR)
                )
            )
            .addGap(17, 17, 17)
            .addComponent(
              jPanel5,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
            .addGroup(
              jPanel2Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  jPanel2Layout
                    .createSequentialGroup()
                    .addGap(157, 157, 157)
                    .addComponent(LOGOUT)
                    .addGap(24, 24, 24)
                )
                .addGroup(
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  jPanel2Layout
                    .createSequentialGroup()
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED
                    )
                    .addGroup(
                      jPanel2Layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addGroup(
                          jPanel2Layout
                            .createParallelGroup(
                              javax.swing.GroupLayout.Alignment.BASELINE
                            )
                            .addComponent(SUBMIT)
                            .addComponent(VIEW)
                            .addComponent(UPDATE)
                        )
                        .addComponent(VIEW1)
                    )
                    .addGap(23, 23, 23)
                )
            )
        )
    );

    jLabel6.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
    jLabel6.setText("WARD PATIENTES DETAILS");

    TIME.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
    TIME.setText("TIME");

    DATE.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
    DATE.setText("DATE");

    NURSENAME.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    NURSENAME.setText("DR NAME");

    jLabel13.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
    jLabel13.setText("DATE :");

    jLabel14.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
    jLabel14.setText("TIME :");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
      jPanel1
    );
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(
          jPanel2,
          javax.swing.GroupLayout.Alignment.TRAILING,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          Short.MAX_VALUE
        )
        .addGroup(
          jPanel1Layout
            .createSequentialGroup()
            .addGroup(
              jPanel1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(
                  jLabel4,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  128,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addGroup(
                  jPanel1Layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(
                      NURSENAME,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      337,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
            )
            .addGroup(
              jPanel1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  jPanel1Layout
                    .createSequentialGroup()
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.UNRELATED,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      Short.MAX_VALUE
                    )
                    .addComponent(
                      jPanel3,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      Short.MAX_VALUE
                    )
                )
                .addGroup(
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  jPanel1Layout
                    .createSequentialGroup()
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      Short.MAX_VALUE
                    )
                    .addComponent(jLabel6)
                    .addGap(635, 635, 635)
                )
            )
            .addGroup(
              jPanel1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(
                  jLabel3,
                  javax.swing.GroupLayout.Alignment.TRAILING
                )
                .addGroup(
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  jPanel1Layout
                    .createSequentialGroup()
                    .addGroup(
                      jPanel1Layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addGroup(
                          jPanel1Layout
                            .createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(18, 18, 18)
                            .addComponent(TIME)
                        )
                        .addGroup(
                          jPanel1Layout
                            .createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(18, 18, 18)
                            .addComponent(DATE)
                        )
                    )
                    .addGap(9, 9, 9)
                )
            )
            .addGap(25, 25, 25)
        )
    );
    jPanel1Layout.setVerticalGroup(
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
                    .addComponent(
                      jPanel3,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED
                    )
                    .addComponent(jLabel6)
                )
                .addGroup(
                  jPanel1Layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addGroup(
                      jPanel1Layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addGroup(
                          jPanel1Layout
                            .createSequentialGroup()
                            .addComponent(
                              jLabel4,
                              javax.swing.GroupLayout.PREFERRED_SIZE,
                              140,
                              javax.swing.GroupLayout.PREFERRED_SIZE
                            )
                            .addPreferredGap(
                              javax.swing.LayoutStyle.ComponentPlacement.RELATED
                            )
                            .addComponent(NURSENAME)
                        )
                        .addGroup(
                          jPanel1Layout
                            .createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(12, 12, 12)
                            .addGroup(
                              jPanel1Layout
                                .createParallelGroup(
                                  javax.swing.GroupLayout.Alignment.BASELINE
                                )
                                .addComponent(DATE)
                                .addComponent(jLabel13)
                            )
                        )
                    )
                )
            )
            .addGap(5, 5, 5)
            .addGroup(
              jPanel1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(TIME)
                .addComponent(jLabel14)
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(
              jPanel2,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addContainerGap(49, Short.MAX_VALUE)
        )
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
      getContentPane()
    );
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(
          jPanel1,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          Short.MAX_VALUE
        )
    );
    layout.setVerticalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(
          jPanel1,
          javax.swing.GroupLayout.PREFERRED_SIZE,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          javax.swing.GroupLayout.PREFERRED_SIZE
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void LOGOUTActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_LOGOUTActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_LOGOUTActionPerformed

  private void LOGOUTMouseClicked(java.awt.event.MouseEvent evt) { //GEN-FIRST:event_LOGOUTMouseClicked
    this.dispose();
    LOGIN_FORM log = new LOGIN_FORM();
    log.setVisible(true);
    this.setVisible(false);
  } //GEN-LAST:event_LOGOUTMouseClicked

  private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_UPDATEActionPerformed
    try {
      getData();
      statement.execute(
        "UPDATE DOC_" +
        DrId +
        ".P_" +
        Pid +
        " SET SYMPTOMS='" +
        Symptoms +
        "',MEDICINES='" +
        Medicines +
        "',TREATMENT='" +
        Treatments +
        "',TEST='" +
        Tests +
        "',TESTREPORTS='" +
        Reports +
        "' WHERE SR=" +
        patientUpdateSr
      );
      clearFields();
    } catch (Exception e) {
      System.out.println(e);
    }
  } //GEN-LAST:event_UPDATEActionPerformed

  private void SUBMITActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_SUBMITActionPerformed
    getData();
    String DBNAME = "";

    try {
      DBNAME = "doc_" + DrId;
      String query =
        "INSERT INTO " +
        DBNAME +
        ".P_" +
        Pid +
        "(ID,SYMPTOMS,MEDICINES,TREATMENT,TEST,TESTREPORTS,DATE,TIME)VALUES(" +
        Pid +
        ",'" +
        Symptoms +
        "','" +
        Medicines +
        "','" +
        Treatments +
        "','" +
        Tests +
        "','" +
        Reports +
        "','" +
        Date +
        "','" +
        Time +
        "')";
      System.out.println(query);
      statement.execute(query);
      clearFields();
    } catch (Exception e) {
      System.out.println(e);
    }
  } //GEN-LAST:event_SUBMITActionPerformed

  void getData() {
    Pid = PID.getText();
    Symptoms = SYMPTOMS.getText();
    Medicines = MEDICINES.getText();
    Treatments = TREATMENT.getText();
    Tests = TEST.getText();
    Reports = REPORTS.getText();

    Date = DATE.getText();
    Time = TIME.getText();
  }

  private void PIDActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_PIDActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_PIDActionPerformed

  private void REPORTSMouseEntered(java.awt.event.MouseEvent evt) {} //GEN-FIRST:event_REPORTSMouseEntered //GEN-LAST:event_REPORTSMouseEntered

  private void REPORTSMouseClicked(java.awt.event.MouseEvent evt) { //GEN-FIRST:event_REPORTSMouseClicked
    try {
      JFileChooser chooser = new JFileChooser();
      chooser.showOpenDialog(null);
      File f = chooser.getSelectedFile();
      String filename = f.getAbsolutePath();
      String dynamicTime = TIME.getText().replace(":", "-");
      String DbName = "Patient" + "_" + PID.getText() + "_";

      String newPath =
        "C://VHS_MULTISPECILITY_HOSPITAL/" +
        DRNAME.getText().split("DR NAME :")[1] +
        "/ADMIT/" +
        PID.getText() +
        "/";
      File directionary = new File(newPath);
      if (!directionary.exists()) {
        directionary.mkdirs();
      }
      File sourcsfile = null;
      File destinationFile = null;
      String extension = filename.substring(filename.lastIndexOf('.') + 1);
      sourcsfile = new File(filename);

      destinationFile =
        new File(newPath + DbName + dynamicTime + "." + extension);
      Files.copy(sourcsfile.toPath(), destinationFile.toPath());
      REPORTS.setText(newPath + DbName + dynamicTime + "." + extension);
    } catch (Exception e) {
      System.out.println(e);
    }
  } //GEN-LAST:event_REPORTSMouseClicked

  private void PIDKeyPressed(java.awt.event.KeyEvent evt) { //GEN-FIRST:event_PIDKeyPressed
    if (evt.getKeyCode() == 10) {
      String PFname = "";
      String PMname = "";
      String PLname = "";
      String PAge = "";
      String PGender = "";

      String DoctorName = "";
      DrId = 0;
      try {
        String pid = PID.getText();
        ResultSet result = statement.executeQuery(
          "SELECT * FROM VHSHOSPITAL.APPOINTMENTS WHERE PID=" + pid
        );
        if (result.next()) {
          result.beforeFirst();
          while (result.next()) {
            PFname = result.getString("FNAME");
            PMname = result.getString("MNAME");
            PLname = result.getString("LNAME");
            PAge = result.getString("AGE");
            PGender = result.getString("GENDER");
            DoctorName = result.getString("DRNAME");
            //    get doctor id
            String drName[] = DoctorName.split("DR.")[1].split(" ");
            ResultSet drIdResult = statement.executeQuery(
              "SELECT ID FROM VHSHOSPITAL.DOCTORS WHERE FNAME='" +
              drName[0] +
              "' AND MNAME='" +
              drName[1] +
              "' AND LNAME='" +
              drName[2] +
              "'"
            );
            drIdResult.beforeFirst();
            while (drIdResult.next()) {
              DrId = drIdResult.getInt("ID");
              ResultSet statusCheck = statement.executeQuery(
                "SELECT * FROM DOC_" + DrId + ".ADMIT WHERE PID=" + pid
              );
              if (statusCheck.next()) {
                String FN = PFname + " " + PMname + " " + PLname;
                FNAME.setText("NAME : " + FN);
                AGE.setText("AGE : " + PAge);
                GENDER.setText("GENDER :" + PGender);
                DRNAME.setText("DR NAME :" + DoctorName);
                WARDERR.setText("  ");

                ResultSet getlastdata = statement.executeQuery(
                  "SELECT * FROM DOC_" +
                  DrId +
                  ".P_" +
                  pid +
                  " ORDER BY SR DESC LIMIT 1"
                );
                if (getlastdata.next()) {
                  getlastdata.beforeFirst();
                  while (getlastdata.next()) {
                    SYMPTOMS.setText(getlastdata.getString("SYMPTOMS"));
                    MEDICINES.setText(getlastdata.getString("MEDICINES"));
                    TREATMENT.setText(getlastdata.getString("TREATMENT"));
                    TEST.setText(getlastdata.getString("TEST"));
                    REPORTS.setText(getlastdata.getString("TESTREPORTS"));
                    patientUpdateSr = getlastdata.getInt("SR");
                  }
                } else {
                  WARDERR.setText("PATIENT RECENTLY Admitted....!");
                }
              } else {
                WARDERR.setText("No Patient Admitted....!");
                clearFields();
              }
            }
          }
        } else {
          WARDERR.setText("No Data..!");
          clearFields();
        }
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  } //GEN-LAST:event_PIDKeyPressed

  private void SYMPTOMSKeyPressed(java.awt.event.KeyEvent evt) {} //GEN-FIRST:event_SYMPTOMSKeyPressed //GEN-LAST:event_SYMPTOMSKeyPressed

  private void VIEW1ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_VIEW1ActionPerformed
    new DISCHARGE().setVisible(true);
  } //GEN-LAST:event_VIEW1ActionPerformed

  private void VIEWActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_VIEWActionPerformed
    if (PID.getText().equals("")) {
      WARDERR.setText("PLEASE ENTER THE PATIENT ID");
    } else {
      new WARDS_PATIENT_DATA(
        PID.getText(),
        FNAME.getText(),
        AGE.getText(),
        GENDER.getText(),
        DrId
      )
      .setVisible(true);
    }
  } //GEN-LAST:event_VIEWActionPerformed

  void showDate() {
    Date d = new Date();
    SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
    DATE.setText(s.format(d));
  }

  void showTime() {
    new Timer(
      0,
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          Date d = new Date();
          SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
          TIME.setText(s.format(d));
        }
      }
    )
      .start();
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
      java.util.logging.Logger
        .getLogger(WARD.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger
        .getLogger(WARD.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger
        .getLogger(WARD.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger
        .getLogger(WARD.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    new WARD().setVisible(true);
    /* Create and display the form */
  }

  Statement statement;
  String PtableName;
  String Symptoms;
  String Tests;
  String Treatments;
  String Medicines;
  String Date;
  String Time;
  String Pid;
  String Reports;
  int DrId;
  int patientUpdateSr;
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel AGE;
  private javax.swing.JLabel DATE;
  private javax.swing.JLabel DRNAME;
  private javax.swing.JLabel FNAME;
  private javax.swing.JLabel GENDER;
  private javax.swing.JButton LOGOUT;
  private javax.swing.JTextArea MEDICINES;
  private javax.swing.JLabel NURSENAME;
  private javax.swing.JTextField PID;
  private javax.swing.JTextArea REPORTS;
  private javax.swing.JButton SUBMIT;
  private javax.swing.JTextArea SYMPTOMS;
  private javax.swing.JTextArea TEST;
  private javax.swing.JLabel TIME;
  private javax.swing.JTextArea TREATMENT;
  private javax.swing.JButton UPDATE;
  private javax.swing.JButton VIEW;
  private javax.swing.JButton VIEW1;
  private javax.swing.JLabel WARDERR;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JScrollPane jScrollPane4;
  private javax.swing.JScrollPane jScrollPane5;

  // End of variables declaration//GEN-END:variables

  private void clearFields() {
    PID.setText("");
    TREATMENT.setText("");
    SYMPTOMS.setText("");
    MEDICINES.setText("");
    REPORTS.setText("");
    TEST.setText("");
    FNAME.setText("NAME :");
    AGE.setText("AGE :");
    GENDER.setText("GENDER :");
    DRNAME.setText("DR NAME :");
  }
}
