package multispecility_hospital_solapur.RECEPTS;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import multispecility_hospital_solapur.use.Printer;

public class AppointmentReciept extends javax.swing.JFrame {

  //    <editor-fold desc="Constructor">
  public AppointmentReciept(
    String Name,
    int Pid,
    int Age,
    int Fee,
    String Gender,
    long Phone,
    String Symptomps,
    String Doctor,
    int Opd
  ) {
    initComponents();
    showDate();
    showTime();
    NAME.setText(Name + "  ");
    AGE.setText(Integer.toString(Age) + "  ");
    GENDER.setText(Gender + "  ");
    DR_NAME.setText(Doctor + "  ");
    OPD_NO.setText(Opd + "  ");
    P_ID.setText(Integer.toString(Pid) + "  ");
    PHONE.setText(Long.toString(Phone) + "  ");
    SYMPTOMPS.setText(Symptomps + "  ");
    FEE.setText(Integer.toString(Fee) + "  ");
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
  }

  public AppointmentReciept() {
    initComponents();
  }

  //    </editor-fold>

  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    Reciept = new javax.swing.JPanel();
    jLabel19 = new javax.swing.JLabel();
    TIME = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jSeparator1 = new javax.swing.JSeparator();
    DATE = new javax.swing.JLabel();
    jLabel20 = new javax.swing.JLabel();
    patientLable = new javax.swing.JLabel();
    patientLable1 = new javax.swing.JLabel();
    P_ID = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    FEE = new javax.swing.JLabel();
    NAME = new javax.swing.JLabel();
    AGE = new javax.swing.JLabel();
    GENDER = new javax.swing.JLabel();
    SYMPTOMPS = new javax.swing.JLabel();
    OPD_NO = new javax.swing.JLabel();
    DR_NAME = new javax.swing.JLabel();
    LABLE = new javax.swing.JLabel();
    PHONE = new javax.swing.JLabel();
    DEATHS = new javax.swing.JLabel();
    DEATHS1 = new javax.swing.JLabel();
    Cancel_Button = new javax.swing.JButton();
    PrintButton1 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Appointment Reciept");

    Reciept.setBackground(java.awt.Color.white);

    jLabel19.setBackground(java.awt.Color.white);
    jLabel19.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
    jLabel19.setForeground(java.awt.Color.black);
    jLabel19.setText("Date :");

    TIME.setBackground(java.awt.Color.white);
    TIME.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
    TIME.setForeground(java.awt.Color.black);
    TIME.setText("10AM");

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));

    jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jLabel2.setForeground(java.awt.Color.black);
    jLabel2.setText("SOLAPUR");
    jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jLabel1.setForeground(java.awt.Color.black);
    jLabel1.setText("VHS MULTI-SPECIALITY HOSPITAL ,");
    jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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
            .addGroup(
              jPanel2Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  jPanel2Layout
                    .createSequentialGroup()
                    .addComponent(jLabel1)
                    .addContainerGap()
                )
                .addGroup(
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  jPanel2Layout
                    .createSequentialGroup()
                    .addComponent(
                      jLabel2,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      91,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addGap(82, 82, 82)
                )
            )
        )
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          javax.swing.GroupLayout.Alignment.TRAILING,
          jPanel2Layout
            .createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(jLabel1)
            .addGap(1, 1, 1)
            .addComponent(jLabel2)
            .addContainerGap()
        )
    );

    DATE.setBackground(java.awt.Color.white);
    DATE.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
    DATE.setForeground(java.awt.Color.black);
    DATE.setText("10 / 08 / 2020");

    jLabel20.setBackground(java.awt.Color.white);
    jLabel20.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
    jLabel20.setForeground(java.awt.Color.black);
    jLabel20.setText("Time  :");

    patientLable.setBackground(java.awt.Color.white);
    patientLable.setFont(new java.awt.Font("Dialog", 3, 10)); // NOI18N
    patientLable.setForeground(java.awt.Color.black);
    patientLable.setText("PATIENT ID : ");

    patientLable1.setBackground(java.awt.Color.white);
    patientLable1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    patientLable1.setForeground(java.awt.Color.black);
    patientLable1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    patientLable1.setText("APPOINTMENT RECIEPT");
    patientLable1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    P_ID.setBackground(java.awt.Color.white);
    P_ID.setFont(new java.awt.Font("Dialog", 3, 10)); // NOI18N
    P_ID.setForeground(java.awt.Color.black);
    P_ID.setText("7");

    jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    jLabel3.setForeground(java.awt.Color.black);
    jLabel3.setText("NAME                       :");
    jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    jLabel6.setForeground(java.awt.Color.black);
    jLabel6.setText("AGE                          :");
    jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    jLabel7.setForeground(java.awt.Color.black);
    jLabel7.setText("GENDER                   :");
    jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    jLabel8.setForeground(java.awt.Color.black);
    jLabel8.setText("SYMPTOMPS         :");
    jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    jLabel9.setForeground(java.awt.Color.black);
    jLabel9.setText("OPD NO                   :");
    jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    jLabel10.setForeground(java.awt.Color.black);
    jLabel10.setText("DR. NAME                :");
    jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    jLabel11.setForeground(java.awt.Color.black);
    jLabel11.setText("TOTAL FEE         :");
    jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    FEE.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    FEE.setForeground(java.awt.Color.black);
    FEE.setText("10000000000");
    FEE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    NAME.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    NAME.setForeground(java.awt.Color.black);
    NAME.setText("MR. VIVEK JAGTAP ");
    NAME.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    AGE.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    AGE.setForeground(java.awt.Color.black);
    AGE.setText("20");
    AGE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    GENDER.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    GENDER.setForeground(java.awt.Color.black);
    GENDER.setText("MALE");
    GENDER.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    SYMPTOMPS.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    SYMPTOMPS.setForeground(java.awt.Color.black);
    SYMPTOMPS.setText("COLD");
    SYMPTOMPS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    OPD_NO.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    OPD_NO.setForeground(java.awt.Color.black);
    OPD_NO.setText("07");
    OPD_NO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    DR_NAME.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    DR_NAME.setForeground(java.awt.Color.black);
    DR_NAME.setText("DR. UNKNOWN FAKE MISSING");
    DR_NAME.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    LABLE.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    LABLE.setForeground(java.awt.Color.black);
    LABLE.setText("PHONE                     :");
    LABLE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    PHONE.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    PHONE.setForeground(java.awt.Color.black);
    PHONE.setText("9999999999");
    PHONE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    DEATHS.setIcon(
      new javax.swing.ImageIcon(
        getClass().getResource("/Assets/logo_1_Rec.png")
      )
    ); // NOI18N

    DEATHS1.setIcon(
      new javax.swing.ImageIcon(
        getClass().getResource("/Assets/logo_2_Rec.png")
      )
    ); // NOI18N

    javax.swing.GroupLayout RecieptLayout = new javax.swing.GroupLayout(
      Reciept
    );
    Reciept.setLayout(RecieptLayout);
    RecieptLayout.setHorizontalGroup(
      RecieptLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jSeparator1)
        .addGroup(
          RecieptLayout
            .createSequentialGroup()
            .addContainerGap()
            .addComponent(DEATHS)
            .addGap(3, 3, 3)
            .addComponent(
              jPanel2,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(3, 3, 3)
            .addComponent(DEATHS1)
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
        )
        .addGroup(
          javax.swing.GroupLayout.Alignment.TRAILING,
          RecieptLayout
            .createSequentialGroup()
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
            .addGroup(
              RecieptLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  RecieptLayout
                    .createSequentialGroup()
                    .addComponent(jLabel19)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                    )
                    .addComponent(DATE)
                )
                .addGroup(
                  RecieptLayout
                    .createSequentialGroup()
                    .addComponent(jLabel20)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED
                    )
                    .addComponent(
                      TIME,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      55,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
            )
            .addContainerGap()
        )
        .addGroup(
          RecieptLayout
            .createSequentialGroup()
            .addGroup(
              RecieptLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  RecieptLayout
                    .createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(patientLable)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED
                    )
                    .addComponent(
                      P_ID,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      243,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
                .addGroup(
                  RecieptLayout
                    .createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addGroup(
                      RecieptLayout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addGroup(
                          RecieptLayout
                            .createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(
                              RecieptLayout
                                .createParallelGroup(
                                  javax.swing.GroupLayout.Alignment.LEADING,
                                  false
                                )
                                .addGroup(
                                  RecieptLayout
                                    .createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(
                                      javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                                    )
                                    .addComponent(
                                      NAME,
                                      javax.swing.GroupLayout.DEFAULT_SIZE,
                                      262,
                                      Short.MAX_VALUE
                                    )
                                )
                                .addGroup(
                                  RecieptLayout
                                    .createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(
                                      javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                                    )
                                    .addComponent(
                                      AGE,
                                      javax.swing.GroupLayout.PREFERRED_SIZE,
                                      167,
                                      javax.swing.GroupLayout.PREFERRED_SIZE
                                    )
                                )
                            )
                        )
                        .addGroup(
                          RecieptLayout
                            .createParallelGroup(
                              javax.swing.GroupLayout.Alignment.LEADING,
                              false
                            )
                            .addGroup(
                              RecieptLayout
                                .createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(
                                  javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                                )
                                .addComponent(
                                  SYMPTOMPS,
                                  javax.swing.GroupLayout.DEFAULT_SIZE,
                                  javax.swing.GroupLayout.DEFAULT_SIZE,
                                  Short.MAX_VALUE
                                )
                            )
                            .addGroup(
                              RecieptLayout
                                .createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(
                                  javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                                )
                                .addComponent(
                                  GENDER,
                                  javax.swing.GroupLayout.PREFERRED_SIZE,
                                  166,
                                  javax.swing.GroupLayout.PREFERRED_SIZE
                                )
                            )
                            .addGroup(
                              RecieptLayout
                                .createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(
                                  javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                                )
                                .addComponent(
                                  OPD_NO,
                                  javax.swing.GroupLayout.DEFAULT_SIZE,
                                  javax.swing.GroupLayout.DEFAULT_SIZE,
                                  Short.MAX_VALUE
                                )
                            )
                            .addGroup(
                              RecieptLayout
                                .createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(
                                  javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                                )
                                .addComponent(DR_NAME)
                            )
                            .addGroup(
                              RecieptLayout
                                .createSequentialGroup()
                                .addComponent(LABLE)
                                .addPreferredGap(
                                  javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                                )
                                .addComponent(
                                  PHONE,
                                  javax.swing.GroupLayout.DEFAULT_SIZE,
                                  262,
                                  Short.MAX_VALUE
                                )
                            )
                        )
                    )
                )
                .addGroup(
                  RecieptLayout
                    .createSequentialGroup()
                    .addGap(123, 123, 123)
                    .addComponent(
                      patientLable1,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      186,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
                .addGroup(
                  RecieptLayout
                    .createSequentialGroup()
                    .addGap(222, 222, 222)
                    .addComponent(jLabel11)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED
                    )
                    .addComponent(
                      FEE,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      81,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
            )
            .addGap(0, 0, Short.MAX_VALUE)
        )
    );
    RecieptLayout.setVerticalGroup(
      RecieptLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          RecieptLayout
            .createSequentialGroup()
            .addGroup(
              RecieptLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(
                  DEATHS1,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  73,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  DEATHS,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  73,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addGroup(
                  RecieptLayout
                    .createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(
                      jPanel2,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      51,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
            )
            .addGap(6, 6, 6)
            .addGroup(
              RecieptLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(DATE)
                .addComponent(
                  jLabel19,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  Short.MAX_VALUE
                )
            )
            .addGap(2, 2, 2)
            .addGroup(
              RecieptLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(TIME)
                .addComponent(
                  jLabel20,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  Short.MAX_VALUE
                )
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(
              jSeparator1,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              10,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(0, 0, 0)
            .addComponent(
              patientLable1,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              19,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(8, 8, 8)
            .addGroup(
              RecieptLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  P_ID,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  19,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  patientLable,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  19,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(18, 18, 18)
            .addGroup(
              RecieptLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(NAME)
            )
            .addGap(18, 18, 18)
            .addGroup(
              RecieptLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(AGE)
            )
            .addGap(18, 18, 18)
            .addGroup(
              RecieptLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7)
                .addComponent(GENDER)
            )
            .addGap(18, 18, 18)
            .addGroup(
              RecieptLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(LABLE)
                .addComponent(PHONE)
            )
            .addGap(18, 18, 18)
            .addGroup(
              RecieptLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8)
                .addComponent(SYMPTOMPS)
            )
            .addGap(22, 22, 22)
            .addGroup(
              RecieptLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9)
                .addComponent(OPD_NO)
            )
            .addGap(18, 18, 18)
            .addGroup(
              RecieptLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel10)
                .addComponent(DR_NAME)
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.RELATED,
              87,
              Short.MAX_VALUE
            )
            .addGroup(
              RecieptLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel11)
                .addComponent(FEE)
            )
            .addGap(44, 44, 44)
        )
    );

    Cancel_Button.setText("CANCEL");
    Cancel_Button.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          Cancel_ButtonActionPerformed(evt);
        }
      }
    );

    PrintButton1.setText("PRINT");
    PrintButton1.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          PrintButton1ActionPerformed(evt);
        }
      }
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
            .addContainerGap(20, Short.MAX_VALUE)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addComponent(
                      PrintButton1,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      207,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED
                    )
                    .addComponent(
                      Cancel_Button,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      207,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
                .addComponent(
                  Reciept,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addContainerGap(22, Short.MAX_VALUE)
        )
    );
    layout.setVerticalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addComponent(
              Reciept,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(84, 84, 84)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  Cancel_Button,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  42,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  PrintButton1,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  42,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addContainerGap(87, Short.MAX_VALUE)
        )
    );

    pack();
    setLocationRelativeTo(null);
  } // </editor-fold>//GEN-END:initComponents

  //    <editor-fold desc="EventHandeling">
  private void Cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_Cancel_ButtonActionPerformed
    this.dispose();
  } //GEN-LAST:event_Cancel_ButtonActionPerformed

  private void PrintButton1ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_PrintButton1ActionPerformed
    new Printer().printReciept(this.Reciept);
  } //GEN-LAST:event_PrintButton1ActionPerformed

  //    </editor-fold>

  //    <editor-fold desc="MainFunction">
  public static void main(String args[]) {
    new AppointmentReciept().setVisible(true);
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger
        .getLogger(AppointmentReciept.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger
        .getLogger(AppointmentReciept.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger
        .getLogger(AppointmentReciept.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger
        .getLogger(AppointmentReciept.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {
        public void run() {}
      }
    );
  }

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
          SimpleDateFormat s = new SimpleDateFormat("hh:mm a");
          TIME.setText(s.format(d));
        }
      }
    )
      .start();
  }

  //</editor-fold>

  //    <editor-fold desc="VariableDeclarationBySystem">
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel AGE;
  private javax.swing.JButton Cancel_Button;
  private javax.swing.JLabel DATE;
  private javax.swing.JLabel DEATHS;
  private javax.swing.JLabel DEATHS1;
  private javax.swing.JLabel DR_NAME;
  private javax.swing.JLabel FEE;
  private javax.swing.JLabel GENDER;
  private javax.swing.JLabel LABLE;
  private javax.swing.JLabel NAME;
  private javax.swing.JLabel OPD_NO;
  private javax.swing.JLabel PHONE;
  private javax.swing.JLabel P_ID;
  private javax.swing.JButton PrintButton1;
  private javax.swing.JPanel Reciept;
  private javax.swing.JLabel SYMPTOMPS;
  private javax.swing.JLabel TIME;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel19;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel20;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JLabel patientLable;
  private javax.swing.JLabel patientLable1;
  // End of variables declaration//GEN-END:variables
  // </editor-fold>
}
