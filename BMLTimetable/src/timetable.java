
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Student
 */
public class timetable extends javax.swing.JFrame {

    /**
     * Creates new form timetable
     */
    public timetable() {
        initComponents();
    }
    String xyz;
    String xyz1;

    public timetable(String a, String b) {
        initComponents();
        xyz = a;
        xyz1 = b;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        d1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        dlp = new javax.swing.JLayeredPane();
        sdl = new javax.swing.JLabel();
        sdt = new javax.swing.JLabel();
        dt = new javax.swing.JComboBox<>();
        tt = new javax.swing.JComboBox<>();
        but = new javax.swing.JButton();
        dlp1 = new javax.swing.JLayeredPane();
        a = new javax.swing.JLabel();
        subj = new javax.swing.JComboBox<>();
        b = new javax.swing.JLabel();
        f = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        c = new javax.swing.JLabel();
        gt = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        d = new javax.swing.JLabel();
        tt1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Time Table");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        d1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Day", "9:00-9:50", "10:00-10:50", "11:00-11:50", "12:00-12:50", "1:00-1:50", "2:00-2:50", "3:00-3:50", "4:00-4:50", "5:00-5:50"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(d1);

        jButton1.setText("Reschedule a class");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dlp.setBorder(javax.swing.BorderFactory.createTitledBorder("For Deletion of Class"));
        dlp.setEnabled(false);

        sdl.setText("Select the day:");
        sdl.setEnabled(false);

        sdt.setText("Select the time:");
        sdt.setEnabled(false);

        dt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }));
        dt.setEnabled(false);

        tt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9_9_50", "10_10_50", "11_11_50", "12_12_50", "1_1_50", "2_2_50", "3_3_50", "4_4_50", "5_5_50" }));
        tt.setEnabled(false);

        but.setText("Delete");
        but.setEnabled(false);
        but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butActionPerformed(evt);
            }
        });

        dlp.setLayer(sdl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dlp.setLayer(sdt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dlp.setLayer(dt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dlp.setLayer(tt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dlp.setLayer(but, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dlpLayout = new javax.swing.GroupLayout(dlp);
        dlp.setLayout(dlpLayout);
        dlpLayout.setHorizontalGroup(
            dlpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlpLayout.createSequentialGroup()
                .addGroup(dlpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlpLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(dlpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sdl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dlpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dlpLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(but)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        dlpLayout.setVerticalGroup(
            dlpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sdl)
                    .addComponent(sdt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dlpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(but)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dlp1.setBorder(javax.swing.BorderFactory.createTitledBorder("For addition of Class"));
        dlp1.setEnabled(false);

        a.setText("Select Subject:");
        a.setEnabled(false);

        subj.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Subject" }));
        subj.setEnabled(false);

        b.setText("Select Day:");
        b.setEnabled(false);

        f.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }));
        f.setEnabled(false);
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });

        jButton2.setText("LOAD");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        c.setText("Select Time:");
        c.setEnabled(false);

        gt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Time" }));
        gt.setEnabled(false);

        jButton3.setText("LOAD");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        d.setText("Select Class:");
        d.setEnabled(false);

        tt1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Class" }));
        tt1.setEnabled(false);

        jButton4.setText("ADD");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Refresh");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        dlp1.setLayer(a, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dlp1.setLayer(subj, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dlp1.setLayer(b, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dlp1.setLayer(f, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dlp1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dlp1.setLayer(c, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dlp1.setLayer(gt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dlp1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dlp1.setLayer(d, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dlp1.setLayer(tt1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dlp1.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dlp1.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dlp1Layout = new javax.swing.GroupLayout(dlp1);
        dlp1.setLayout(dlp1Layout);
        dlp1Layout.setHorizontalGroup(
            dlp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlp1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(dlp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dlp1Layout.createSequentialGroup()
                        .addGroup(dlp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dlp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(f, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tt1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subj, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(dlp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dlp1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        dlp1Layout.setVerticalGroup(
            dlp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlp1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dlp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(dlp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(dlp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dlp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(52, 52, 52))
        );

        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(dlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                .addComponent(dlp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153)
                .addComponent(jButton1)
                .addGap(489, 489, 489))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dlp)
                    .addComponent(dlp1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//
//        try {
//            Class.forName("java.sql.DriverManager");
//            Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable", "root", "root");
//            Statement S = (Statement) c.createStatement();
//            String abc = "SELECT CURDATE();";
//            ResultSet rs12 = S.executeQuery(abc);
//            rs12.next(); 
//            String date=rs12.getString("CURDATE()");
//            String abcd = "SELECT WEEK('"+date+"');";
//            ResultSet rs123 = S.executeQuery(abcd);
//            rs123.next(); 
//                String week=rs123.getString("WEEK('2017-05-09')");
//                String abcde = "SELECT * from week;";
//            ResultSet rs1234 = S.executeQuery(abcde);
//            rs1234.next(); 
//                String weekf=rs1234.getString("week");
//             if(week.equals(weekf)){
//                 
//             }}

        DefaultTableModel model = (DefaultTableModel) d1.getModel();
        try {
            Class.forName("java.sql.DriverManager");
            Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable", "root", "root");
            Statement S = (Statement) c.createStatement();
            String query = "select * from  " + xyz + "_" + xyz1 + ";";
            ResultSet rs = S.executeQuery(query);
            while (rs.next()) {
                String day = rs.getString("Day");
                String abc = rs.getString("9_9_50");
                String un = rs.getString("10_10_50");
                String cn = rs.getString("11_11_50");
                String pass = rs.getString("12_12_50");
                String pn = rs.getString("1_1_50");
                String jn = rs.getString("2_2_50");
                String cs = rs.getString("3_3_50");
                String rn = rs.getString("4_4_50");
                String cno = rs.getString("5_5_50");

                model.addRow(new Object[]{day, abc, un, cn, pass, pn, jn, cs, rn, cno});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butActionPerformed
        {
            String day = (String) dt.getSelectedItem();
            String time = (String) tt.getSelectedItem();
            try {
                Class.forName("java.sql.DriverManager");
                Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable", "root", "root");
                Statement S = (Statement) c.createStatement();
                String query1 = "Select " + time + " from " + xyz + "_" + xyz1 + " WHERE day='" + day + "';";
                ResultSet rs = S.executeQuery(query1);
                rs.next();
                String value = rs.getString(time);
                String a = value.substring(11);
                String query = "UPDATE " + xyz + "_" + xyz1 + " SET " + time + "='' WHERE day='" + day + "';";
                S.executeUpdate(query);
                String query2 = "UPDATE " + a + " SET " + time + "=1 WHERE day='" + day + "';";
                S.executeUpdate(query2);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        DefaultTableModel model = (DefaultTableModel) d1.getModel();
        int rowCount = model.getRowCount();
//Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        try {
            Class.forName("java.sql.DriverManager");
            Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable", "root", "root");
            Statement S = (Statement) c.createStatement();
            String query = "select * from  " + xyz + "_" + xyz1 + ";";
            ResultSet rs = S.executeQuery(query);
            while (rs.next()) {
                String day = rs.getString("Day");
                String abc = rs.getString("9_9_50");
                String un = rs.getString("10_10_50");
                String cn = rs.getString("11_11_50");
                String pass = rs.getString("12_12_50");
                String pn = rs.getString("1_1_50");
                String jn = rs.getString("2_2_50");
                String cs = rs.getString("3_3_50");
                String rn = rs.getString("4_4_50");
                String cno = rs.getString("5_5_50");

                model.addRow(new Object[]{day, abc, un, cn, pass, pn, jn, cs, rn, cno});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

// TODO add your handling code here:
    }//GEN-LAST:event_butActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        a.setEnabled(true);
        b.setEnabled(true);
        c.setEnabled(true);
        d.setEnabled(true);
        subj.setEnabled(true);
        jButton2.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
//jButton4.setEnabled(true);

        f.setEnabled(true);
        gt.setEnabled(true);
        jButton3.setEnabled(true);
        tt1.setEnabled(true);
        dlp.setEnabled(true);
        sdl.setEnabled(true);
        sdt.setEnabled(true);
        dt.setEnabled(true);
        tt.setEnabled(true);
        but.setEnabled(true);

        dlp1.setEnabled(true);

        {
            try {
                Class.forName("java.sql.DriverManager");
                Connection C = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable", "root", "root");
                Statement S = (Statement) C.createStatement();
                String query1 = "Select * from subjects where course= '" + xyz1 + "';";
                ResultSet rs1 = S.executeQuery(query1);
                while (rs1.next()) {
                    String subjects = rs1.getString("subjects");
                    subj.addItem(subjects);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }        // TODO add your handling code here:

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String abcd = (String) f.getSelectedItem();
        String ab, c, d, k, f, g, h, i, j;
        try {
            Class.forName("java.sql.DriverManager");
            Connection C = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable", "root", "root");
            Statement S = (Statement) C.createStatement();
            String query1 = "Select * from " + xyz + "_" + xyz1 + " where day='" + abcd + "';";
            ResultSet rs1 = S.executeQuery(query1);
            while (rs1.next()) {
                ab = rs1.getString("9_9_50");
                c = rs1.getString("10_10_50");
                d = rs1.getString("11_11_50");
                k = rs1.getString("12_12_50");
                f = rs1.getString("1_1_50");
                g = rs1.getString("2_2_50");
                h = rs1.getString("3_3_50");
                i = rs1.getString("4_4_50");
                j = rs1.getString("5_5_50");

                if (ab.equals("")) {
                    gt.addItem("9_9_50");
                }
                if (c.equals("")) {
                    gt.addItem("10_10_50");
                }
                if (d.equals("")) {
                    gt.addItem("11_11_50");
                }
                if (k.equals("")) {
                    gt.addItem("12_12_50");
                }
                if (f.equals("")) {
                    gt.addItem("1_1_50");
                }
                if (g.equals("")) {
                    gt.addItem("2_2_50");
                }
                if (h.equals("")) {
                    gt.addItem("3_3_50");
                }
                if (i.equals("")) {
                    gt.addItem("4_4_50");
                }
                if (j.equals("")) {
                    gt.addItem("5_5_50");
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String a = (String) gt.getSelectedItem();
        String x = (String) f.getSelectedItem();
        String b, c, d, k, f, g, h, i, j;
        try {
            Class.forName("java.sql.DriverManager");
            Connection C = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable", "root", "root");
            Statement S = (Statement) C.createStatement();
            String query1 = "Select " + a + " from ga104 where day = '" + x + "';";
            ResultSet rs1 = S.executeQuery(query1);
            while (rs1.next()) {
                b = rs1.getString(a);
                if (b.equals("1")) {
                    tt1.addItem("GA104");
                }
            }

            String query2 = "Select " + a + " from ga105 where day = '" + x + "';";
            ResultSet rs2 = S.executeQuery(query2);
            while (rs2.next()) {
                b = rs2.getString(a);
                if (b.equals("1")) {
                    tt1.addItem("GA105");
                }
            }

            String query3 = "Select " + a + " from ga106 where day = '" + x + "';";
            ResultSet rs3 = S.executeQuery(query3);
            while (rs3.next()) {
                b = rs3.getString(a);
                if (b.equals("1")) {
                    tt1.addItem("GA106");
                }
            }

            String query4 = "Select " + a + " from ga204 where day = '" + x + "';";
            ResultSet rs4 = S.executeQuery(query4);
            while (rs4.next()) {
                b = rs4.getString(a);
                if (b.equals("1")) {
                    tt1.addItem("GA204");
                }
            }

            String query5 = "Select " + a + " from ga205 where day = '" + x + "';";
            ResultSet rs5 = S.executeQuery(query5);
            while (rs5.next()) {
                b = rs5.getString(a);
                if (b.equals("1")) {
                    tt1.addItem("GA205");
                }
            }

            String query6 = "Select " + a + " from ga206 where day = '" + x + "';";
            ResultSet rs6 = S.executeQuery(query6);
            while (rs6.next()) {
                b = rs6.getString(a);
                if (b.equals("1")) {
                    tt1.addItem("GA206");
                }
            }

            String query7 = "Select " + a + " from ga207 where day = '" + x + "';";
            ResultSet rs7 = S.executeQuery(query7);
            while (rs7.next()) {
                b = rs7.getString(a);
                if (b.equals("1")) {
                    tt1.addItem("GA207");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String subject = (String) subj.getSelectedItem();
        String Day = (String) f.getSelectedItem();
        String Time = (String) gt.getSelectedItem();
        String venue = (String) tt1.getSelectedItem();
        String teacher_id;
        {
            try {
                Class.forName("java.sql.DriverManager");
                Connection C = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable", "root", "root");
                Statement S = (Statement) C.createStatement();
                String query = "Select teacher_id from teacher where subject='" + subject + "' and branch='" + xyz1 + "';";

                ResultSet rs = S.executeQuery(query);
                rs.next();
                teacher_id = rs.getString("teacher_id");
                String query1 = "UPDATE " + xyz + "_" + xyz1 + " SET " + Time + "= '" + teacher_id + " " + subject + " " + venue + "' WHERE DAY ='" + Day + "';";
                S.executeUpdate(query1);
                String query2 = "UPDATE " + venue + " SET " + Time + "='0' WHERE DAY ='" + Day + "';";
                S.executeUpdate(query2);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        DefaultTableModel model = (DefaultTableModel) d1.getModel();
        int rowCount = model.getRowCount();
//Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        try {
            Class.forName("java.sql.DriverManager");
            Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable", "root", "root");
            Statement S = (Statement) c.createStatement();
            String query = "select * from  " + xyz + "_" + xyz1 + ";";
            ResultSet rs = S.executeQuery(query);
            while (rs.next()) {
                String day = rs.getString("Day");
                String abc = rs.getString("9_9_50");
                String un = rs.getString("10_10_50");
                String cn = rs.getString("11_11_50");
                String pass = rs.getString("12_12_50");
                String pn = rs.getString("1_1_50");
                String jn = rs.getString("2_2_50");
                String cs = rs.getString("3_3_50");
                String rn = rs.getString("4_4_50");
                String cno = rs.getString("5_5_50");

                model.addRow(new Object[]{day, abc, un, cn, pass, pn, jn, cs, rn, cno});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        gt.removeAllItems();
        gt.addItem("Choose Time");
        gt.setSelectedItem("Choose Time");
        tt1.removeAllItems();
        tt1.addItem("Choose Class");
        tt1.setSelectedItem("Choose Time");// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        new Admin().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int a=JOptionPane.showConfirmDialog(this,"Do you want to exit","EXIT",0);
if(a==0){
System.exit(0);
}        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(timetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new timetable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JButton but;
    private javax.swing.JLabel c;
    private javax.swing.JLabel d;
    private javax.swing.JTable d1;
    private javax.swing.JLayeredPane dlp;
    private javax.swing.JLayeredPane dlp1;
    private javax.swing.JComboBox<String> dt;
    private javax.swing.JComboBox<String> f;
    private javax.swing.JComboBox<String> gt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel sdl;
    private javax.swing.JLabel sdt;
    private javax.swing.JComboBox<String> subj;
    private javax.swing.JComboBox<String> tt;
    private javax.swing.JComboBox<String> tt1;
    // End of variables declaration//GEN-END:variables
}