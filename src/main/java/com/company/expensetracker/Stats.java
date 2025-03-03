package com.company.expensetracker;
import javax.swing.table.DefaultTableModel;

public class Stats extends javax.swing.JFrame implements Sortable{
    //implementing interface methods
    @Override
    public String[] bubbleSortByName(String[] input) {
            int length = input.length;
            String temp;
             for (int i = 0; i < length; i++) {
                 for (int j = i+1; j < length; j++) {
                     if(input[j].compareTo(input[i])<0){//.compareTo return 0 if two strings are equal, less than one if input[j] has a "smaller" letter than  input[i]
                         temp = input[i];
                         input[i] = input[j];
                         input[j] = temp;
                     }//end if
                 }//end second for
            }//end first for  
            return input;
    }
    @Override
    public String[] bubbleSortByAmount(String[] input)   {
            int length = input.length;
            String temp;
             for (int i = 0; i < length; i++) {
                 for (int j = 0; j < length-i-1; j++) {
                     int num1 = Integer.parseInt(input[j].split(",")[1]);
                     int num2 =  Integer.parseInt(input[j+1].split(",")[1]);
                     if(num1>num2){
                        temp = input[j];
                        input[j] = input[j + 1];
                        input[j + 1] = temp;
                     }//end if
                 }//end second for
            }//end first for
            
            return input;
    }

    DefaultTableModel sortByNameTableModel = new DefaultTableModel();
    DefaultTableModel sortByAmountTableModel = new DefaultTableModel();
    
    DataHandler dataHandler = new DataHandler();
    LastExpense lastExp = new LastExpense();
    CurrentUser cu = new CurrentUser();
    
    public Stats() {
        initComponents();
        
        sortByNameTableModel.addColumn("Name");
        sortByNameTableModel.addColumn("Amount");
        sortByNameTableModel.addColumn("Date");
        
        sortByAmountTableModel.addColumn("Name");
        sortByAmountTableModel.addColumn("Amount");
        sortByAmountTableModel.addColumn("Date");
        
        String lastAddedItem = lastExp.retrieveLastName();
        lastAddedLabel.setText(lastAddedItem);
        
        int lastItem = dataHandler.readExpenses().length - 1;
        StringBuilder mostExpensivePurchase = new StringBuilder(bubbleSortByAmount(dataHandler.readExpenses())[lastItem].split(",")[1] );  //orders expenses by amount, then takes the last item of it and splits it into three parts and then chooses the price which is the second attribute
        mostExpensivePurchase.append(" ");
        mostExpensivePurchase.append(cu.getValue(3));
        mostExpensiveLabel.setText(mostExpensivePurchase.toString());
        
        lastUpdatedLabel.setText(dataHandler.readExpenses()[lastItem].split(",")[2] );

        //filling sort by name table model
        String[] tableData= bubbleSortByName(dataHandler.readExpenses());

        for (int i = 0; i < tableData.length; i++) {
            String[] temp = tableData[i].split(",");
            sortByNameTableModel.addRow(temp);
        }
        
        //filling sort by a mount table model
        tableData= bubbleSortByAmount(dataHandler.readExpenses());
        //fill backwards
        for (int i = lastItem; i >0; i--) {
            String[] temp = tableData[i].split(",");
            sortByAmountTableModel.addRow(temp);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        mainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        logoutNavBtn = new javax.swing.JButton();
        statsNavBtn = new javax.swing.JButton();
        homeNavBtn5 = new javax.swing.JButton();
        tableNavBtn = new javax.swing.JButton();
        addNavBtn5 = new javax.swing.JButton();
        sortableTablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        filterOption = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        lastAddedExpensePanel = new javax.swing.JPanel();
        lastAddedSubheading = new javax.swing.JLabel();
        lastAddedLabel = new javax.swing.JLabel();
        mostExpensivePanel = new javax.swing.JPanel();
        mostExpensiveSubheading = new javax.swing.JLabel();
        mostExpensiveLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lastUpdatedLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Expense Tracker - Stats");
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 720));

        mainPanel.setBackground(new java.awt.Color(204, 204, 204));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 0, 102));
        titleLabel.setText("STATS");

        logoutNavBtn.setText("ACCOUNT");
        logoutNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutNavBtnActionPerformed(evt);
            }
        });

        statsNavBtn.setBackground(new java.awt.Color(0, 0, 102));
        statsNavBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        statsNavBtn.setForeground(new java.awt.Color(255, 255, 255));
        statsNavBtn.setText("STATS");
        statsNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statsNavBtnActionPerformed(evt);
            }
        });

        homeNavBtn5.setText("HOME");
        homeNavBtn5.setMargin(new java.awt.Insets(5, 5, 5, 5));
        homeNavBtn5.setMaximumSize(new java.awt.Dimension(51, 27));
        homeNavBtn5.setMinimumSize(new java.awt.Dimension(51, 27));
        homeNavBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeNavBtn5ActionPerformed(evt);
            }
        });

        tableNavBtn.setText("TABLE");
        tableNavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableNavBtnActionPerformed(evt);
            }
        });

        addNavBtn5.setText("ADD");
        addNavBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNavBtn5ActionPerformed(evt);
            }
        });

        sortableTablePanel.setBackground(new java.awt.Color(153, 153, 153));

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setModel(sortByNameTableModel);
        table.setGridColor(new java.awt.Color(0, 0, 102));
        table.setShowGrid(true);
        jScrollPane1.setViewportView(table);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SORTABLE TABLE");

        filterOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Amount" }));

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Filter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sortableTablePanelLayout = new javax.swing.GroupLayout(sortableTablePanel);
        sortableTablePanel.setLayout(sortableTablePanelLayout);
        sortableTablePanelLayout.setHorizontalGroup(
            sortableTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sortableTablePanelLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sortableTablePanelLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sortableTablePanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(filterOption, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        sortableTablePanelLayout.setVerticalGroup(
            sortableTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sortableTablePanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sortableTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(filterOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lastAddedExpensePanel.setBackground(new java.awt.Color(0, 0, 102));

        lastAddedSubheading.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lastAddedSubheading.setForeground(new java.awt.Color(255, 255, 255));
        lastAddedSubheading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastAddedSubheading.setText("LAST ADDED EXPENSE");

        lastAddedLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lastAddedLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastAddedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastAddedLabel.setText("...");

        javax.swing.GroupLayout lastAddedExpensePanelLayout = new javax.swing.GroupLayout(lastAddedExpensePanel);
        lastAddedExpensePanel.setLayout(lastAddedExpensePanelLayout);
        lastAddedExpensePanelLayout.setHorizontalGroup(
            lastAddedExpensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lastAddedExpensePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lastAddedSubheading)
                .addGap(54, 54, 54))
            .addGroup(lastAddedExpensePanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lastAddedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lastAddedExpensePanelLayout.setVerticalGroup(
            lastAddedExpensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lastAddedExpensePanelLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lastAddedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastAddedSubheading)
                .addContainerGap())
        );

        mostExpensivePanel.setBackground(new java.awt.Color(153, 153, 153));

        mostExpensiveSubheading.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        mostExpensiveSubheading.setForeground(new java.awt.Color(0, 0, 102));
        mostExpensiveSubheading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostExpensiveSubheading.setText("MOST EXPENSIVE PURCHASE");

        mostExpensiveLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        mostExpensiveLabel.setForeground(new java.awt.Color(0, 0, 102));
        mostExpensiveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostExpensiveLabel.setText("...");

        javax.swing.GroupLayout mostExpensivePanelLayout = new javax.swing.GroupLayout(mostExpensivePanel);
        mostExpensivePanel.setLayout(mostExpensivePanelLayout);
        mostExpensivePanelLayout.setHorizontalGroup(
            mostExpensivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mostExpensivePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mostExpensiveSubheading)
                .addGap(29, 29, 29))
            .addGroup(mostExpensivePanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(mostExpensiveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        mostExpensivePanelLayout.setVerticalGroup(
            mostExpensivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mostExpensivePanelLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(mostExpensiveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(mostExpensiveSubheading)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LAST UPDATE ADDED");

        lastUpdatedLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lastUpdatedLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastUpdatedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastUpdatedLabel.setText("...");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lastUpdatedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(61, 61, 61))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(lastUpdatedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tableNavBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addNavBtn5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homeNavBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statsNavBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutNavBtn)
                .addGap(321, 321, 321))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(483, 483, 483)
                        .addComponent(titleLabel))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(sortableTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mostExpensivePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lastAddedExpensePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(titleLabel)
                .addGap(20, 20, 20)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(lastAddedExpensePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mostExpensivePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sortableTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeNavBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statsNavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutNavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addNavBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tableNavBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutNavBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Account().setVisible(true);
    }//GEN-LAST:event_logoutNavBtnActionPerformed

    private void statsNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statsNavBtnActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_statsNavBtnActionPerformed

    private void homeNavBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeNavBtn5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new HomeFrame().setVisible(true);
    }//GEN-LAST:event_homeNavBtn5ActionPerformed

    private void tableNavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableNavBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Table().setVisible(true);
    }//GEN-LAST:event_tableNavBtnActionPerformed

    private void addNavBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNavBtn5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AddExpense().setVisible(true);
    }//GEN-LAST:event_addNavBtn5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(filterOption.getSelectedItem().equals("Name")){
            table.setModel(sortByNameTableModel);
        }
        else{
            table.setModel(sortByAmountTableModel);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNavBtn5;
    private javax.swing.JComboBox<String> filterOption;
    private javax.swing.JButton homeNavBtn5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel lastAddedExpensePanel;
    private javax.swing.JLabel lastAddedLabel;
    private javax.swing.JLabel lastAddedSubheading;
    private javax.swing.JLabel lastUpdatedLabel;
    private javax.swing.JButton logoutNavBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel mostExpensiveLabel;
    private javax.swing.JPanel mostExpensivePanel;
    private javax.swing.JLabel mostExpensiveSubheading;
    private javax.swing.JPanel sortableTablePanel;
    private javax.swing.JButton statsNavBtn;
    private javax.swing.JTable table;
    private javax.swing.JButton tableNavBtn;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

}
