
package multispecility_hospital_solapur.RECEPTS;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import multispecility_hospital_solapur.use.Printer;

public class DISCHARGE_PATIENT extends javax.swing.JFrame {
    public DISCHARGE_PATIENT(){
        initComponents();
    }
    public DISCHARGE_PATIENT(int pid, String FullName,int Age,String Gender, String dateofadmit, String dateofdischarge, int noofDays, String docName, int wardCharges, int opAmt, int extAmt, String prescription, String medicines, String nextVisit, int totalBill, int bedCharges) {
       initComponents();
       showDate();
       showTime();
       
       PID.setText(""+pid);
       FULLNAME.setText(FullName);
       AGE.setText(""+Age);
       GENDER.setText(Gender);
       DRNAME.setText(docName);
       MEDICINES.setText(medicines);
       PRECEPTION.setText(prescription);
       NEXT_VISIT_DATE.setText(nextVisit);
       ADMITDATE.setText(dateofadmit);
       DISCHARGEDATE.setText(dateofdischarge);
       NO_OF_DAYS.setText(""+noofDays);
       WARDNAME.setText(wardName);
       WARD_CHARGES.setText(""+wardCharges);
       OT_AMOUNT.setText(""+opAmt);
       EXTRA_AMOUNT.setText(""+extAmt);
       TOTAL_AMOUNT.setText(""+totalBill);      
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
          SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
          TIME.setText(s.format(d));
        }
      }
    )
      .start();
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DischargeRec = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DATE = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TIME = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        FULLNAME = new javax.swing.JLabel();
        GENDER = new javax.swing.JLabel();
        AGE = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        DRNAME = new javax.swing.JLabel();
        NO_OF_DAYS = new javax.swing.JLabel();
        PID = new javax.swing.JLabel();
        DISCHARGEDATE = new javax.swing.JLabel();
        ADMITDATE = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        WARDNAME = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        WARD_CHARGES = new javax.swing.JLabel();
        EXTRA_AMOUNT = new javax.swing.JLabel();
        OT_AMOUNT = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        TOTAL_AMOUNT = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        NEXT_VISIT_DATE = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PRECEPTION = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        MEDICINES = new javax.swing.JTextArea();
        printbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DischargeRec.setBackground(new java.awt.Color(255, 255, 255));
        DischargeRec.setForeground(new java.awt.Color(255, 255, 255));
        DischargeRec.setPreferredSize(new java.awt.Dimension(869, 933));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\NetBeans\\VHS\\src\\Assets\\logo_1.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Imprint MT Shadow", 0, 30)); // NOI18N
        jLabel2.setText("VHS MULTI- SPECILITY HOSPITAL,");

        jLabel3.setFont(new java.awt.Font("Imprint MT Shadow", 0, 30)); // NOI18N
        jLabel3.setText("SOLAPUR..   413006");

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\NetBeans\\VHS\\src\\Assets\\logo_2.png")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("PID  :");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("DATE   :");

        DATE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        DATE.setText("                             ");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("TIME   :");

        TIME.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TIME.setText("                            ");

        jLabel10.setFont(new java.awt.Font("Imprint MT Shadow", 2, 18)); // NOI18N
        jLabel10.setText("DISCHARGE  RECEIPT");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel11.setText("CHARGES DETAILS");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("TOTAL CHARGES");

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setText("PATIENT DETAILS");

        FULLNAME.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        FULLNAME.setText("HEMANT SHIVAPUTRA WAKADE");

        GENDER.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        GENDER.setText("GENDER");

        AGE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        AGE.setText("AGE");

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel16.setText("ADMIT DATE");

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel17.setText("DISCHARGE DATE");

        DRNAME.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        DRNAME.setText("HEMNANT SHUVANS JANSDAJN");

        NO_OF_DAYS.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        NO_OF_DAYS.setText("10");

        PID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PID.setText("PID");

        DISCHARGEDATE.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        DISCHARGEDATE.setText("2000-03-05");

        ADMITDATE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ADMITDATE.setText("2000-02-03");

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel24.setText("DR NAME : ");

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel23.setText("NO OF DAYS TO STAY");

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel25.setText("TREATMENT");

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel26.setText("MEDICINES");

        WARDNAME.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        WARDNAME.setText("ICU");

        jLabel28.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel28.setText("WARD CHARGES");

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel29.setText("OPERTATION AMOUNT");

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel30.setText("EXTRA CHARGES");

        jLabel31.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel31.setText("WARD NAME");

        WARD_CHARGES.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        WARD_CHARGES.setText("50000");

        EXTRA_AMOUNT.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        EXTRA_AMOUNT.setText("50000");

        OT_AMOUNT.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        OT_AMOUNT.setText("50000");

        TOTAL_AMOUNT.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TOTAL_AMOUNT.setText("50000");

        jLabel35.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel35.setText("TOTAL AMOUNT    :-");

        jLabel37.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel37.setText("PATIENT NAME");

        jLabel38.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel38.setText("NEXT VISIT DATE");

        NEXT_VISIT_DATE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        NEXT_VISIT_DATE.setText("2000-03-05");

        PRECEPTION.setColumns(20);
        PRECEPTION.setRows(5);
        jScrollPane1.setViewportView(PRECEPTION);

        MEDICINES.setColumns(20);
        MEDICINES.setRows(5);
        jScrollPane2.setViewportView(MEDICINES);

        javax.swing.GroupLayout DischargeRecLayout = new javax.swing.GroupLayout(DischargeRec);
        DischargeRec.setLayout(DischargeRecLayout);
        DischargeRecLayout.setHorizontalGroup(
            DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DischargeRecLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DischargeRecLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(DischargeRecLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DischargeRecLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap())
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addGroup(DischargeRecLayout.createSequentialGroup()
                .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DischargeRecLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(DRNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addGroup(DischargeRecLayout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(27, 27, 27)
                        .addComponent(NEXT_VISIT_DATE))
                    .addGroup(DischargeRecLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DischargeRecLayout.createSequentialGroup()
                        .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel23)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(WARDNAME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NO_OF_DAYS, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DISCHARGEDATE)
                            .addComponent(ADMITDATE, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                    .addGroup(DischargeRecLayout.createSequentialGroup()
                        .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addGap(0, 0, 0)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OT_AMOUNT)
                    .addComponent(WARD_CHARGES)
                    .addComponent(EXTRA_AMOUNT))
                .addGap(80, 80, 80))
            .addGroup(DischargeRecLayout.createSequentialGroup()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(FULLNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(AGE, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(GENDER, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
            .addComponent(jSeparator6)
            .addGroup(DischargeRecLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(78, 78, 78)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(DischargeRecLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addGap(29, 29, 29)
                .addComponent(TOTAL_AMOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DischargeRecLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DischargeRecLayout.createSequentialGroup()
                        .addComponent(PID, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(DischargeRecLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TIME, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        DischargeRecLayout.setVerticalGroup(
            DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DischargeRecLayout.createSequentialGroup()
                .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addGroup(DischargeRecLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)))
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DischargeRecLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(DATE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TIME)))
                    .addGroup(DischargeRecLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(PID))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GENDER)
                    .addComponent(AGE)
                    .addComponent(FULLNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(14, 14, 14)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DischargeRecLayout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DischargeRecLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(ADMITDATE))
                                .addGap(22, 22, 22)
                                .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(DISCHARGEDATE))
                                .addGap(24, 24, 24)
                                .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NO_OF_DAYS)
                                    .addComponent(jLabel23))
                                .addGap(24, 24, 24)
                                .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31)
                                    .addComponent(WARDNAME))
                                .addGap(28, 28, 28)
                                .addComponent(jLabel28)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel29)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel30))
                            .addGroup(DischargeRecLayout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(WARD_CHARGES)
                                .addGap(18, 18, 18)
                                .addComponent(OT_AMOUNT)
                                .addGap(26, 26, 26)
                                .addComponent(EXTRA_AMOUNT))
                            .addGroup(DischargeRecLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(DRNAME))
                                .addGap(30, 30, 30)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(NEXT_VISIT_DATE)))
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DischargeRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(TOTAL_AMOUNT))
                .addGap(35, 35, 35))
        );

        printbutton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        printbutton.setText("PRINT");
        printbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DischargeRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(printbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DischargeRec, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(printbutton)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbuttonActionPerformed
         new Printer().printRecieptDischarge(this.DischargeRec);
    }//GEN-LAST:event_printbuttonActionPerformed
   public static void main(String args[]) {
       new DISCHARGE_PATIENT().setVisible(true);
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppointmentReciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentReciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentReciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentReciept.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }
         Statement statement ; 
     String DbName="";
     int did = 0;
     
     int pid=0;
     String FullName;
     String dateofadmit="";
     String dateofdischarge="";
     int noofDays;
     String docName="";
     String wardName;
     int wardCharges;
     int opAmt;
     int extAmt;
     String patientStatus;
     String prescription;
     String medicines;
     String nextVisit;
     int totalBill;
     int bedCharges=0;
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ADMITDATE;
    private javax.swing.JLabel AGE;
    private javax.swing.JLabel DATE;
    private javax.swing.JLabel DISCHARGEDATE;
    private javax.swing.JLabel DRNAME;
    private javax.swing.JPanel DischargeRec;
    private javax.swing.JLabel EXTRA_AMOUNT;
    private javax.swing.JLabel FULLNAME;
    private javax.swing.JLabel GENDER;
    private javax.swing.JTextArea MEDICINES;
    private javax.swing.JLabel NEXT_VISIT_DATE;
    private javax.swing.JLabel NO_OF_DAYS;
    private javax.swing.JLabel OT_AMOUNT;
    private javax.swing.JLabel PID;
    private javax.swing.JTextArea PRECEPTION;
    private javax.swing.JLabel TIME;
    private javax.swing.JLabel TOTAL_AMOUNT;
    private javax.swing.JLabel WARDNAME;
    private javax.swing.JLabel WARD_CHARGES;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton printbutton;
    // End of variables declaration//GEN-END:variables
}
