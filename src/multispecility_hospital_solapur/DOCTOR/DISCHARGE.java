
package multispecility_hospital_solapur.DOCTOR;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;
import javax.swing.Timer;
import multispecility_hospital_solapur.RECEPTS.DEATH;
import multispecility_hospital_solapur.RECEPTS.DISCHARGE_PATIENT;
import multispecility_hospital_solapur.use.GetConnection;


public class DISCHARGE extends javax.swing.JFrame {
    public DISCHARGE() {
        initComponents();
        showDate();
        showTime();
        setExtendedState(MAXIMIZED_BOTH);
        statement = new GetConnection().Connect_mysql();
        DEATH.setVisible(false);
    }
     void showDate(){
        java.util.Date d = new java.util.Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        DDATE.setText(s.format (d));
    }
     void showTime(){
     new Timer(0, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.Date d = new java.util.Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                DTIME.setText(s.format(d));
            }

        }).start();}
       void getdata(){
 
  }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel36 = new javax.swing.JPanel();
        jLabel125 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel129 = new javax.swing.JLabel();
        PID = new javax.swing.JTextField();
        RSUBMIT2 = new javax.swing.JButton();
        TOTALAMOUNT = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        ERRORLABLE = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel143 = new javax.swing.JLabel();
        NEXTVISIT = new com.toedter.calendar.JDateChooser();
        jLabel144 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PRESCRIPTION = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        MEDICINES = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        ADMITDATE = new com.toedter.calendar.JDateChooser();
        FULLNAME = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        OTAMOUNT = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        PATIENT_STATUS = new javax.swing.JComboBox<>();
        WARDCHARGES = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        NOOFDAYS = new javax.swing.JLabel();
        DRNAME = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        EXTRA_AMOUNT = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        DISCHARGEDATE = new com.toedter.calendar.JDateChooser();
        jLabel139 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        WARDNAME = new javax.swing.JLabel();
        DEATH = new javax.swing.JPanel();
        DEATHTIME = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DEATHREASON = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DEATHDATE = new com.toedter.calendar.JDateChooser();
        DDATE = new javax.swing.JLabel();
        DTIME = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        DTIME1 = new javax.swing.JLabel();
        DDATE1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel36.setBackground(new java.awt.Color(0, 153, 153));
        jPanel36.setPreferredSize(new java.awt.Dimension(1939, 800));

        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logo_1.png"))); // NOI18N

        jPanel37.setBackground(new java.awt.Color(0, 153, 153));

        jLabel126.setFont(new java.awt.Font("Imprint MT Shadow", 3, 48)); // NOI18N
        jLabel126.setText("VHS MULTI-SPECIALITY HOSPITAL ,");
        jLabel126.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel127.setFont(new java.awt.Font("Imprint MT Shadow", 3, 48)); // NOI18N
        jLabel127.setText("SOLAPUR .  413006");
        jLabel127.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel126)
                .addContainerGap())
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel126)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel127)
                .addContainerGap())
        );

        jLabel128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logo_2.png"))); // NOI18N

        jPanel38.setPreferredSize(new java.awt.Dimension(1939, 500));

        jLabel129.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel129.setText("PID");

        PID.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PIDActionPerformed(evt);
            }
        });
        PID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PIDKeyPressed(evt);
            }
        });

        RSUBMIT2.setBackground(new java.awt.Color(51, 153, 255));
        RSUBMIT2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        RSUBMIT2.setText("DISCHARGE");
        RSUBMIT2.setMargin(new java.awt.Insets(7, 24, 7, 24));
        RSUBMIT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSUBMIT2ActionPerformed(evt);
            }
        });

        TOTALAMOUNT.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        TOTALAMOUNT.setText("0");

        jLabel145.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel145.setText("TOTAL BILL : ");

        ERRORLABLE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ERRORLABLE.setForeground(new java.awt.Color(204, 0, 0));
        ERRORLABLE.setText("   ");

        jLabel143.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel143.setText("MEDICINES");

        NEXTVISIT.setDateFormatString("yyyy-MM-dd");

        jLabel144.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel144.setText("NEXT VISIT");

        jLabel130.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel130.setText("PRESCRIPTION");

        PRESCRIPTION.setColumns(20);
        PRESCRIPTION.setRows(5);
        jScrollPane2.setViewportView(PRESCRIPTION);

        MEDICINES.setColumns(20);
        MEDICINES.setRows(5);
        jScrollPane3.setViewportView(MEDICINES);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel130)
                    .addComponent(jLabel143)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NEXTVISIT, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel130)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel143)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NEXTVISIT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel144))))
                .addContainerGap())
        );

        ADMITDATE.setDateFormatString("yyyy-MM-dd");

        FULLNAME.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        FULLNAME.setText("     ");

        jLabel134.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel134.setText("OPERATION AMOUNT");

        OTAMOUNT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        OTAMOUNT.setText("0");
        OTAMOUNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OTAMOUNTActionPerformed(evt);
            }
        });
        OTAMOUNT.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                OTAMOUNTPropertyChange(evt);
            }
        });
        OTAMOUNT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                OTAMOUNTKeyPressed(evt);
            }
        });

        jLabel131.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel131.setText("NO OF DAYS TO STAY");

        PATIENT_STATUS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PATIENT_STATUS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LIVE", "DEATH" }));
        PATIENT_STATUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PATIENT_STATUSActionPerformed(evt);
            }
        });

        WARDCHARGES.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        WARDCHARGES.setText("   ");

        jLabel133.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel133.setText("WARD NAME");

        jLabel140.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel140.setText("FULL NAME");

        NOOFDAYS.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        NOOFDAYS.setText("     ");

        DRNAME.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        DRNAME.setText("    ");

        jLabel137.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel137.setText("WARD CHARGES");

        EXTRA_AMOUNT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        EXTRA_AMOUNT.setText("0");
        EXTRA_AMOUNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXTRA_AMOUNTActionPerformed(evt);
            }
        });
        EXTRA_AMOUNT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EXTRA_AMOUNTKeyPressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel17.setText("ADMIT DATE");

        DISCHARGEDATE.setDateFormatString("yyyy-MM-dd");

        jLabel139.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel139.setText("DR NAME");

        jLabel19.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel19.setText("DISCHARGE DATE");

        jLabel136.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel136.setText("PATIENT  STATUS");

        jLabel138.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel138.setText("EXTRA AMOUNT");

        WARDNAME.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        WARDNAME.setText("          ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel140)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19)
                            .addComponent(jLabel131)
                            .addComponent(jLabel139)
                            .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel136)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel137, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel133, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NOOFDAYS, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FULLNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(DISCHARGEDATE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ADMITDATE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(WARDNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PATIENT_STATUS, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OTAMOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WARDCHARGES, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EXTRA_AMOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(DRNAME, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FULLNAME)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel140)))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ADMITDATE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(DISCHARGEDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NOOFDAYS)
                    .addComponent(jLabel131))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DRNAME)
                    .addComponent(jLabel139))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel133)
                    .addComponent(WARDNAME))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WARDCHARGES)
                    .addComponent(jLabel137))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel134)
                    .addComponent(OTAMOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel138)
                    .addComponent(EXTRA_AMOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel136)
                    .addComponent(PATIENT_STATUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        DEATHTIME.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        DEATHTIME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEATHTIMEActionPerformed(evt);
            }
        });

        DEATHREASON.setColumns(20);
        DEATHREASON.setRows(5);
        jScrollPane1.setViewportView(DEATHREASON);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("DEATH REASON");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("DEATH TIME");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("DEATH DATE");

        DEATHDATE.setDateFormatString("yyyy-MM-dd");
        DEATHDATE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout DEATHLayout = new javax.swing.GroupLayout(DEATH);
        DEATH.setLayout(DEATHLayout);
        DEATHLayout.setHorizontalGroup(
            DEATHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DEATHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DEATHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(DEATHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(DEATHTIME, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(DEATHDATE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                .addContainerGap())
        );
        DEATHLayout.setVerticalGroup(
            DEATHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DEATHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DEATHDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DEATHTIME, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addContainerGap(90, Short.MAX_VALUE)
                        .addComponent(DEATH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGap(849, 849, 849)
                        .addComponent(jLabel129)
                        .addGap(18, 18, 18)
                        .addComponent(PID, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(ERRORLABLE, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGap(1130, 1130, 1130)
                        .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(TOTALAMOUNT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(251, 251, 251))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(RSUBMIT2)
                .addGap(880, 880, 880))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ERRORLABLE))
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(DEATH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TOTALAMOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel145))
                .addGap(18, 18, 18)
                .addComponent(RSUBMIT2)
                .addGap(34, 34, 34))
        );

        DDATE.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        DDATE.setText("DATE");

        DTIME.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        DTIME.setText("TIME");

        jLabel141.setFont(new java.awt.Font("Imprint MT Shadow", 3, 18)); // NOI18N
        jLabel141.setText("DISCHARGE PATIENTS");

        DTIME1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        DTIME1.setText("TIME");

        DDATE1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        DDATE1.setText("DATE");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel128)
                .addGap(50, 50, 50))
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addGap(853, 853, 853)
                .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DTIME1)
                    .addComponent(DDATE1))
                .addGap(27, 27, 27)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DTIME)
                    .addComponent(DDATE))
                .addGap(90, 90, 90))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel128, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DTIME)
                            .addComponent(DTIME1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DDATE)
                            .addComponent(DDATE1)))
                    .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PIDActionPerformed

    private void PIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PIDKeyPressed
        if (evt.getKeyCode() == 10) { 
            pid=Integer.parseInt(PID.getText());  
            try{
                ResultSet res  =statement.executeQuery("SELECT * FROM VHSHOSPITAL.APPOINTMENTS WHERE PID="+pid);
                while(res.next()){
                    docName=res.getString("DRNAME");
                    age=Integer.parseInt(res.getString("AGE"));
                    gender=res.getString("GENDER");
                }
                String name[]=docName.split("DR.")[1].split(" ");
                res = statement.executeQuery("SELECT ID AS ID FROM VHSHOSPITAL.DOCTORS WHERE FNAME='"+name[0]+"' AND MNAME='"+name[1]+"' AND LNAME='"+name[2]+"'");
                while(res.next()){
                    did =  Integer.parseInt(res.getString("ID"));
                }
                String dbname="doc_"+did;

                String query="SELECT * FROM "+dbname+".ADMIT WHERE PID="+pid;

                res = statement.executeQuery(query);
                if(res.next()){
                    res.beforeFirst();
                    ERRORLABLE.setText("   ");
                    String wardName="";
                while(res.next()) {
                    dateofadmit=res.getString("DATEOFADMIT");
                    wardName =res.getString("WARDNAME");
 
                }
                WARDNAME.setText(wardName);
                ADMITDATE.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(dateofadmit));
                String getQuery = "SELECT * FROM VHSHOSPITAL.APPOINTMENTS WHERE PID =" +pid ;
                ResultSet result = statement.executeQuery(getQuery);
                while (result.next()) {
                    String a = result.getString("FNAME");
                    String b =result.getString("MNAME");
                    String c =result.getString("LNAME");
                    String fullname = a+" "+b+" "+c;
                    FULLNAME.setText(fullname);
                    DRNAME.setText(result.getString("DRNAME"));  
                }
                DISCHARGEDATE.setDate(
                        new SimpleDateFormat("yyyy-MM-dd").parse(DDATE.getText())
                    );
                result = statement.executeQuery("SELECT CHARGES  FROM VHSHOSPITAL.WARDS WHERE WARDNAME='"+wardName+"'");
                while(result.next()){
                    bedCharges = Integer.parseInt(result.getString("CHARGES"));
                }
                
            dd();
            WARDCHARGES.setText(Integer.toString(bedCharges * Integer.parseInt(NOOFDAYS.getText())));
                }else{
                    ERRORLABLE.setText("This Patient is not Admitted..!");
                    clearFields();
                }
            }catch(Exception e){
                System.out.println(e);
            } 

        }
    }//GEN-LAST:event_PIDKeyPressed
void dd(){
           try{
                String start = ((JTextField)ADMITDATE.getDateEditor().getUiComponent()).getText(); 
                String end = ((JTextField)DISCHARGEDATE.getDateEditor().getUiComponent()).getText();
        
                LocalDate fday = LocalDate.parse(start);
                LocalDate tday = LocalDate.parse(end); 
                noofDays = (int)ChronoUnit.DAYS.between(fday,tday);
                NOOFDAYS.setText(String.valueOf(noofDays));
        
            }catch(Exception e){}

    }
    private void RSUBMIT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSUBMIT2ActionPerformed
 
       
          if(pid!=0 ){
               CalculateBill();
              getDischargeData();
              String queryDischarge = "INSERT INTO doc_"+did+".DISCHARGE(PID ,PATIENTNAME ,ADMITDATE ,DISCHARGEDATE ,NODAYS ,DRNAME ,WARDNAME ,WARDCHARGES ,OPERATIOINAMT ,EXTRAAMT ,TOTALAMOUNT ,PRESCRIPTION ,MEDICINES ,NEXTVISIT ,DATE ,TIME)VALUES(" + pid + "," + "'" + FullName + "'," + "'" + dateofadmit + "'," + "'" + dateofdischarge + "'," + "" + noofDays + "," + "'" + docName + "'," + "'" + wardName + "'," + "" + wardCharges + "," + "" + opAmt + "," + "" + extAmt + "," + "" + totalBill + "," + "'" + prescription + "'," + "'" + medicines + "'," + "'" + nextVisit + "'," + "'" + Date + "'," + "'" + Time + "'" + ")";
              String queryDeath = "INSERT INTO VHSHOSPITAL.DEATHS(PID ,PATIENTNAME ,ADMITDATE ,DISCHARGEDATE ,NODAYS ,DRNAME ,WARDNAME ,WARDCHARGES ,OPERATIOINAMT ,EXTRAAMT ,TOTALAMOUNT ,DEATHREASON,DEATHDATE,DEATHTIME ,DATE ,TIME)VALUES(" + pid + "," + "'" + FullName + "'," + "'" + dateofadmit + "'," + "'" + dateofdischarge + "'," + "" + noofDays + "," + "'" + docName + "'," + "'" + wardName + "'," + "" + wardCharges + "," + "" + opAmt + "," + "" + extAmt + "," + "" + totalBill + "," + "'" + deathReason + "'," + "'" + deathDate + "'," + "'" + deathTime + "'," + "'" + Date + "'," + "'" + Time + "'" + ")";
              String queryDeleteAdmit = "DELETE FROM DOC_"+did+".ADMIT WHERE PID="+pid;
             String mainQuery="";
             try{ 
                if(PATIENT_STATUS.getSelectedIndex() == 0){ 
                    statement.execute(queryDischarge); 
                     new DISCHARGE_PATIENT( pid, FullName, age, gender ,dateofadmit,  dateofdischarge,  noofDays,  docName,  wardCharges,  opAmt,  extAmt,  prescription,  medicines,  nextVisit,  totalBill,  bedCharges).setVisible(true);  
                     
                }else{ 
                  statement.execute(queryDeath);
                  new DEATH( pid,  FullName, age, gender,  dateofadmit,  dateofdischarge, wardName, deathDate,  deathTime,  deathReason,   noofDays,  docName,  wardCharges,  opAmt, extAmt,  totalBill,  bedCharges).setVisible(true);
                }
               
                  statement.execute(queryDeleteAdmit);
                  
                   showMessageDialog(this,"Data Added Successfully..!");
              }catch(Exception e){
                  System.out.println(e);
              }
              System.out.println(noofDays);
                 clearFields();


            

             }else{
              ERRORLABLE.setText("ENTER PID..!");
          }
    }//GEN-LAST:event_RSUBMIT2ActionPerformed

    private void PATIENT_STATUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PATIENT_STATUSActionPerformed
        if (PATIENT_STATUS.getSelectedItem().toString().equals("LIVE")) {
            jPanel1.setVisible(true);
                        DEATH.setVisible(false);       
            } else {
             DEATH.setVisible(true);       
             jPanel1.setVisible(false);
            }
    }//GEN-LAST:event_PATIENT_STATUSActionPerformed

    private void EXTRA_AMOUNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXTRA_AMOUNTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EXTRA_AMOUNTActionPerformed

    private void OTAMOUNTPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_OTAMOUNTPropertyChange
          
    }//GEN-LAST:event_OTAMOUNTPropertyChange

    private void OTAMOUNTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OTAMOUNTKeyPressed
           if(evt.getKeyChar()==10){
               CalculateBill();
           }
    }//GEN-LAST:event_OTAMOUNTKeyPressed

    private void EXTRA_AMOUNTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EXTRA_AMOUNTKeyPressed
         if(evt.getKeyChar()==10){
               CalculateBill();
           }
    }//GEN-LAST:event_EXTRA_AMOUNTKeyPressed

    private void DEATHTIMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEATHTIMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DEATHTIMEActionPerformed

    private void OTAMOUNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OTAMOUNTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OTAMOUNTActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DISCHARGE().setVisible(true);
            }
        });
    }
     Statement statement ; 
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
     int age;
     String gender;
     String prescription;
     String medicines;
     String nextVisit;
     int totalBill;
     int bedCharges=0;
     String Date; 
     String Time;
     String deathReason;
     String deathTime;
     String deathDate;
    
     
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser ADMITDATE;
    private javax.swing.JLabel DDATE;
    private javax.swing.JLabel DDATE1;
    private javax.swing.JPanel DEATH;
    private com.toedter.calendar.JDateChooser DEATHDATE;
    private javax.swing.JTextArea DEATHREASON;
    private javax.swing.JTextField DEATHTIME;
    private com.toedter.calendar.JDateChooser DISCHARGEDATE;
    private javax.swing.JLabel DRNAME;
    private javax.swing.JLabel DTIME;
    private javax.swing.JLabel DTIME1;
    private javax.swing.JLabel ERRORLABLE;
    private javax.swing.JTextField EXTRA_AMOUNT;
    private javax.swing.JLabel FULLNAME;
    private javax.swing.JTextArea MEDICINES;
    private com.toedter.calendar.JDateChooser NEXTVISIT;
    private javax.swing.JLabel NOOFDAYS;
    private javax.swing.JTextField OTAMOUNT;
    private javax.swing.JComboBox<String> PATIENT_STATUS;
    private javax.swing.JTextField PID;
    private javax.swing.JTextArea PRESCRIPTION;
    private javax.swing.JButton RSUBMIT2;
    private javax.swing.JLabel TOTALAMOUNT;
    private javax.swing.JLabel WARDCHARGES;
    private javax.swing.JLabel WARDNAME;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    private void CalculateBill() {
        int wardcharges=Integer.parseInt(WARDCHARGES.getText());     
        int operation=Integer.parseInt(OTAMOUNT.getText());
        int extraamount=Integer.parseInt(EXTRA_AMOUNT.getText());
        int total =wardcharges + operation + extraamount;
        System.out.println(total);
        TOTALAMOUNT.setText(String.valueOf(total));
    }
 
    private void getDischargeData() {
           pid=Integer.parseInt(PID.getText());
           FullName=FULLNAME.getText();
           docName=DRNAME.getText();
           wardName = WARDNAME.getText();
           String admitdate = ((JTextField) ADMITDATE.getDateEditor().getUiComponent()).getText();
           dateofadmit = LocalDate.parse(admitdate).toString();
           String dischargedate = ((JTextField) DISCHARGEDATE.getDateEditor().getUiComponent()).getText();
           dateofdischarge = LocalDate.parse(dischargedate).toString();
           noofDays=Integer.parseInt(NOOFDAYS.getText());
           wardCharges =Integer.parseInt(WARDCHARGES.getText());
           opAmt=Integer.parseInt(OTAMOUNT.getText());
           extAmt =Integer.parseInt(EXTRA_AMOUNT.getText());
           totalBill=Integer.parseInt(TOTALAMOUNT.getText());
           prescription = PRESCRIPTION.getText();
           medicines = MEDICINES.getText();
           String nextvisit = ((JTextField) NEXTVISIT.getDateEditor().getUiComponent()).getText();
           try{
               nextVisit = LocalDate.parse(nextvisit).toString();
           }catch(Exception e){}
           Date = DDATE.getText();
           Time = DTIME.getText();  
           deathReason = DEATHREASON.getText();  
           String deathdate = ((JTextField) DEATHDATE.getDateEditor().getUiComponent()).getText();
           try{
           deathDate = LocalDate.parse(deathdate).toString();
                }catch(Exception e){}
           deathTime = DEATHTIME.getText();  
           
    }

     void clearFields(){
         PID.setText("");
         FULLNAME.setText("");
         NOOFDAYS.setText("");
         DRNAME.setText("");
         WARDNAME.setText("");
         WARDCHARGES.setText("");
         OTAMOUNT.setText("");
         PATIENT_STATUS.setSelectedIndex(0);
         NEXTVISIT.setDate(null);  
         ADMITDATE.setDate(null);
         DISCHARGEDATE.setDate(null);   
         DEATHDATE.setDate(null);
         DEATHTIME.setText("");
         DEATHREASON.setText("");
         TOTALAMOUNT.setText("");
         OTAMOUNT.setText("");
         WARDCHARGES.setText("");          
     }
}
