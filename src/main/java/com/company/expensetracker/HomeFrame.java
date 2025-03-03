/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.company.expensetracker;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class HomeFrame extends javax.swing.JFrame {
    DataHandler handleData = new DataHandler();
    DefaultTableModel tableModel = new DefaultTableModel();
    CurrentUser cu = new CurrentUser();

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame() {
        initComponents();
        StringBuilder greeting = new StringBuilder("Greetings, ");
        greeting.append(cu.getValue(0));
        greetingLbl.setText(greeting.toString());
        
        tableModel.addColumn("Name");
        tableModel.addColumn("Amount");
        tableModel.addColumn("Date");
        
        String[] allDataArray = handleData.readExpenses();
        
        int lastItem = allDataArray.length - 1; //index of last item
        int length = lastItem > 7  ? lastItem - 5 :  0;  
        System.out.println(length);
        for (int i = lastItem; i >= length; i--){
            String[] temp = allDataArray[i].split(",");
            tableModel.addRow(temp);
        }
        
        numberOfExpenses.setText(Integer.toString(allDataArray.length));
        budgetNumber.setText(cu.getValue(2));
        budgetTitleLabel.setText(cu.getValue(3));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainHomePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        homeNavBtn = new javax.swing.JButton();
        statsNavBtn = new javax.swing.JButton();
        logoutNavBtn = new javax.swing.JButton();
        addNavBtn = new javax.swing.JButton();
        tableNavBtn = new javax.swing.JButton();
        topLeftPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        numberOfExpensesTitle = new javax.swing.JLabel();
        budgetNumber = new javax.swing.JLabel();
        budgetTitleLabel = new javax.swing.JLabel();
        numberOfExpenses = new javax.swing.JLabel();
        topRightPanel = new javax.swing.JPanel();
        userIcon = new javax.swing.JLabel();
        greetingLbl = new javax.swing.JLabel();
        bottomLeftContainer = new javax.swing.JPanel();
        addExpenseBigBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bottomRightPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Expense Tracker - Home");
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 720));

        mainHomePanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("HOME");

        homeNavBtn.setBackground(new java.awt.Color(0, 0, 102));
        homeNavBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        homeNavBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeNavBtn.setText("HOME");
        homeNavBtn.setMargin(new java.awt.Insets(5, 5, 5, 5));

        statsNavBtn.setText("STATS");
        statsNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statsNavBtnActionPerformed(evt);
            }
        });

        logoutNavBtn.setText("ACCOUNT");
        logoutNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutNavBtnActionPerformed(evt);
            }
        });

        addNavBtn.setText("ADD");
        addNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNavBtnActionPerformed(evt);
            }
        });

        tableNavBtn.setText("TABLE");
        tableNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableNavBtnActionPerformed(evt);
            }
        });

        topLeftPanel.setBackground(new java.awt.Color(153, 153, 153));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        numberOfExpensesTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        numberOfExpensesTitle.setForeground(new java.awt.Color(0, 0, 102));
        numberOfExpensesTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberOfExpensesTitle.setText("EXPENSES");

        budgetNumber.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        budgetNumber.setForeground(new java.awt.Color(0, 0, 102));
        budgetNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        budgetNumber.setText("50");

        budgetTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        budgetTitleLabel.setForeground(new java.awt.Color(0, 0, 102));
        budgetTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        budgetTitleLabel.setText("BUDGET");

        numberOfExpenses.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        numberOfExpenses.setForeground(new java.awt.Color(0, 0, 102));
        numberOfExpenses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberOfExpenses.setText("50");

        javax.swing.GroupLayout topLeftPanelLayout = new javax.swing.GroupLayout(topLeftPanel);
        topLeftPanel.setLayout(topLeftPanelLayout);
        topLeftPanelLayout.setHorizontalGroup(
            topLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLeftPanelLayout.createSequentialGroup()
                .addGroup(topLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topLeftPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(budgetNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(topLeftPanelLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(budgetTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(topLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(numberOfExpensesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberOfExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        topLeftPanelLayout.setVerticalGroup(
            topLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLeftPanelLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(topLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(topLeftPanelLayout.createSequentialGroup()
                        .addComponent(budgetNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(budgetTitleLabel))
                    .addGroup(topLeftPanelLayout.createSequentialGroup()
                        .addComponent(numberOfExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberOfExpensesTitle))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        topRightPanel.setBackground(new java.awt.Color(0, 0, 102));

        greetingLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        greetingLbl.setForeground(new java.awt.Color(255, 255, 255));
        greetingLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        greetingLbl.setToolTipText("");

        javax.swing.GroupLayout topRightPanelLayout = new javax.swing.GroupLayout(topRightPanel);
        topRightPanel.setLayout(topRightPanelLayout);
        topRightPanelLayout.setHorizontalGroup(
            topRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topRightPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(topRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topRightPanelLayout.createSequentialGroup()
                        .addComponent(userIcon)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topRightPanelLayout.createSequentialGroup()
                        .addComponent(greetingLbl)
                        .addGap(106, 106, 106))))
        );
        topRightPanelLayout.setVerticalGroup(
            topRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topRightPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(userIcon)
                .addGap(18, 18, 18)
                .addComponent(greetingLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bottomLeftContainer.setBackground(new java.awt.Color(0, 0, 102));

        addExpenseBigBtn.setBackground(new java.awt.Color(0, 0, 102));
        addExpenseBigBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExpenseBigBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADD EXPENSE");

        javax.swing.GroupLayout bottomLeftContainerLayout = new javax.swing.GroupLayout(bottomLeftContainer);
        bottomLeftContainer.setLayout(bottomLeftContainerLayout);
        bottomLeftContainerLayout.setHorizontalGroup(
            bottomLeftContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomLeftContainerLayout.createSequentialGroup()
                .addGroup(bottomLeftContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bottomLeftContainerLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(addExpenseBigBtn))
                    .addGroup(bottomLeftContainerLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel2)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        bottomLeftContainerLayout.setVerticalGroup(
            bottomLeftContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomLeftContainerLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(addExpenseBigBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bottomRightPanel.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("RECENT EXPENSES");

        jTable1.setModel(tableModel);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout bottomRightPanelLayout = new javax.swing.GroupLayout(bottomRightPanel);
        bottomRightPanel.setLayout(bottomRightPanelLayout);
        bottomRightPanelLayout.setHorizontalGroup(
            bottomRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomRightPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomRightPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(187, 187, 187))
        );
        bottomRightPanelLayout.setVerticalGroup(
            bottomRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomRightPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainHomePanelLayout = new javax.swing.GroupLayout(mainHomePanel);
        mainHomePanel.setLayout(mainHomePanelLayout);
        mainHomePanelLayout.setHorizontalGroup(
            mainHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainHomePanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(mainHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainHomePanelLayout.createSequentialGroup()
                        .addComponent(topLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(topRightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainHomePanelLayout.createSequentialGroup()
                        .addComponent(bottomLeftContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(bottomRightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainHomePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainHomePanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(483, 483, 483))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainHomePanelLayout.createSequentialGroup()
                        .addComponent(tableNavBtn)
                        .addGap(18, 18, 18)
                        .addComponent(addNavBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(homeNavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(statsNavBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logoutNavBtn)
                        .addGap(315, 315, 315))))
        );
        mainHomePanelLayout.setVerticalGroup(
            mainHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainHomePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(mainHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(topRightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(topLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(mainHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bottomLeftContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bottomRightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(mainHomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeNavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statsNavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutNavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addNavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tableNavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainHomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainHomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableNavBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Table().setVisible(true);
    }//GEN-LAST:event_tableNavBtnActionPerformed

    private void addNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNavBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AddExpense().setVisible(true);
    }//GEN-LAST:event_addNavBtnActionPerformed

    private void statsNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statsNavBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Stats().setVisible(true);
    }//GEN-LAST:event_statsNavBtnActionPerformed

    private void logoutNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutNavBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Account().setVisible(true);
    }//GEN-LAST:event_logoutNavBtnActionPerformed

    private void addExpenseBigBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExpenseBigBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AddExpense().setVisible(true);
    }//GEN-LAST:event_addExpenseBigBtnActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addExpenseBigBtn;
    private javax.swing.JButton addNavBtn;
    private javax.swing.JPanel bottomLeftContainer;
    private javax.swing.JPanel bottomRightPanel;
    private javax.swing.JLabel budgetNumber;
    private javax.swing.JLabel budgetTitleLabel;
    private javax.swing.JLabel greetingLbl;
    private javax.swing.JButton homeNavBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logoutNavBtn;
    private javax.swing.JPanel mainHomePanel;
    private javax.swing.JLabel numberOfExpenses;
    private javax.swing.JLabel numberOfExpensesTitle;
    private javax.swing.JButton statsNavBtn;
    private javax.swing.JButton tableNavBtn;
    private javax.swing.JPanel topLeftPanel;
    private javax.swing.JPanel topRightPanel;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}
