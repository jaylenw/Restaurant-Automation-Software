package restaurantautomation;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;


//Everybody gets the window, only floor manager reads it


public class RestaurantLayout extends JFrame {

    RestrauntDatabase rD;
    /**
     * Creates new form RestaurantLayout
     */
    public RestaurantLayout(RestrauntDatabase r) {
        rD = r;
        Table table;
        for (int i = 0; i < 8; i++) {
            table = new Table();
            tables.add(table);
        }
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RestaurantLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurantLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurantLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurantLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
    }
    
    static ArrayList <Table> tables = new ArrayList <Table> ();
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablesPanel = new javax.swing.JPanel();
        table_1_panel = new javax.swing.JPanel();
        table_1_button = new javax.swing.JToggleButton();
        table_2_panel = new javax.swing.JPanel();
        table_2_button = new javax.swing.JToggleButton();
        table_3_panel = new javax.swing.JPanel();
        table_3_button = new javax.swing.JToggleButton();
        table_4_panel = new javax.swing.JPanel();
        table_4_button = new javax.swing.JToggleButton();
        table_5_panel = new javax.swing.JPanel();
        table_5_button = new javax.swing.JToggleButton();
        table_6_panel = new javax.swing.JPanel();
        table_6_button = new javax.swing.JToggleButton();
        table_7_panel = new javax.swing.JPanel();
        table_7_button = new javax.swing.JToggleButton();
        table_8_panel = new javax.swing.JPanel();
        table_8_button = new javax.swing.JToggleButton();
        ctrlPanel = new javax.swing.JPanel();
        ctrlGuestLabel = new javax.swing.JLabel();
        remGuestButton = new javax.swing.JButton();
        addGuestButton = new javax.swing.JButton();
        ctrlTableLabel = new javax.swing.JLabel();
        detailPanel = new javax.swing.JPanel();
        tableStatusTabPanel = new javax.swing.JTabbedPane();
        statusPanel = new javax.swing.JPanel();
        setFreeButton = new javax.swing.JButton();
        setDirtyButton = new javax.swing.JButton();
        setUsedButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        statusTableLabel = new javax.swing.JLabel();
        maxSeatingLabel = new javax.swing.JLabel();
        maxSeatingAmt = new javax.swing.JLabel();
        curSeatingLabel = new javax.swing.JLabel();
        curSeatingAmt = new javax.swing.JLabel();
        logOffButton = new javax.swing.JButton();
        orderPanel = new javax.swing.JPanel();
        ordersTableLabel = new javax.swing.JLabel();
        addOrderButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemListTextArea = new javax.swing.JTextArea();
        refreshOrdersButton = new javax.swing.JButton();
        waitWebPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Waiter");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1200, 1000));
        setMinimumSize(new java.awt.Dimension(1200, 1000));
        setResizable(false);

        tablesPanel.setBackground(new java.awt.Color(255, 255, 255));

        table_1_panel.setBackground(new java.awt.Color(153, 255, 153));

        table_1_button.setBackground(new java.awt.Color(153, 255, 153));
        table_1_button.setText("Table 1");
        table_1_button.setToolTipText("Select Table 1");
        table_1_button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table_1_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_1_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout table_1_panelLayout = new javax.swing.GroupLayout(table_1_panel);
        table_1_panel.setLayout(table_1_panelLayout);
        table_1_panelLayout.setHorizontalGroup(
            table_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_1_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_1_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        table_1_panelLayout.setVerticalGroup(
            table_1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_1_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_1_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_2_panel.setBackground(new java.awt.Color(153, 255, 153));

        table_2_button.setBackground(new java.awt.Color(153, 255, 153));
        table_2_button.setText("Table 2");
        table_2_button.setToolTipText("Select Table 2");
        table_2_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_2_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout table_2_panelLayout = new javax.swing.GroupLayout(table_2_panel);
        table_2_panel.setLayout(table_2_panelLayout);
        table_2_panelLayout.setHorizontalGroup(
            table_2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, table_2_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_2_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        table_2_panelLayout.setVerticalGroup(
            table_2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_2_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_2_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_3_panel.setBackground(new java.awt.Color(153, 255, 153));

        table_3_button.setBackground(new java.awt.Color(153, 255, 153));
        table_3_button.setText("Table 3");
        table_3_button.setToolTipText("Select Table 3");
        table_3_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_3_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout table_3_panelLayout = new javax.swing.GroupLayout(table_3_panel);
        table_3_panel.setLayout(table_3_panelLayout);
        table_3_panelLayout.setHorizontalGroup(
            table_3_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_3_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_3_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        table_3_panelLayout.setVerticalGroup(
            table_3_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, table_3_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(table_3_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        table_4_panel.setBackground(new java.awt.Color(153, 255, 153));

        table_4_button.setBackground(new java.awt.Color(153, 255, 153));
        table_4_button.setText("Table 4");
        table_4_button.setToolTipText("Select Table 4");
        table_4_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_4_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout table_4_panelLayout = new javax.swing.GroupLayout(table_4_panel);
        table_4_panel.setLayout(table_4_panelLayout);
        table_4_panelLayout.setHorizontalGroup(
            table_4_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, table_4_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_4_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        table_4_panelLayout.setVerticalGroup(
            table_4_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_4_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_4_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_5_panel.setBackground(new java.awt.Color(153, 255, 153));

        table_5_button.setBackground(new java.awt.Color(153, 255, 153));
        table_5_button.setText("Table 5");
        table_5_button.setToolTipText("Select Table 5");
        table_5_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_5_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout table_5_panelLayout = new javax.swing.GroupLayout(table_5_panel);
        table_5_panel.setLayout(table_5_panelLayout);
        table_5_panelLayout.setHorizontalGroup(
            table_5_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_5_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_5_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        table_5_panelLayout.setVerticalGroup(
            table_5_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_5_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_5_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        table_6_panel.setBackground(new java.awt.Color(153, 255, 153));

        table_6_button.setBackground(new java.awt.Color(153, 255, 153));
        table_6_button.setText("Table 6");
        table_6_button.setToolTipText("Select Table 6");
        table_6_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_6_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout table_6_panelLayout = new javax.swing.GroupLayout(table_6_panel);
        table_6_panel.setLayout(table_6_panelLayout);
        table_6_panelLayout.setHorizontalGroup(
            table_6_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_6_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_6_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        table_6_panelLayout.setVerticalGroup(
            table_6_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_6_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_6_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_7_panel.setBackground(new java.awt.Color(153, 255, 153));

        table_7_button.setBackground(new java.awt.Color(153, 255, 153));
        table_7_button.setText("Table 7");
        table_7_button.setToolTipText("Select Table 7");
        table_7_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_7_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout table_7_panelLayout = new javax.swing.GroupLayout(table_7_panel);
        table_7_panel.setLayout(table_7_panelLayout);
        table_7_panelLayout.setHorizontalGroup(
            table_7_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, table_7_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(table_7_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        table_7_panelLayout.setVerticalGroup(
            table_7_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_7_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_7_button, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );

        table_8_panel.setBackground(new java.awt.Color(153, 255, 153));

        table_8_button.setBackground(new java.awt.Color(153, 255, 153));
        table_8_button.setText("Table 8");
        table_8_button.setToolTipText("Select Table 8");
        table_8_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_8_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout table_8_panelLayout = new javax.swing.GroupLayout(table_8_panel);
        table_8_panel.setLayout(table_8_panelLayout);
        table_8_panelLayout.setHorizontalGroup(
            table_8_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_8_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_8_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        table_8_panelLayout.setVerticalGroup(
            table_8_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_8_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table_8_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ctrlGuestLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        ctrlGuestLabel.setText("Guests");

        remGuestButton.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        remGuestButton.setText("-");
        remGuestButton.setToolTipText("Decrement guest");
        remGuestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remGuestButtonActionPerformed(evt);
            }
        });

        addGuestButton.setFont(new java.awt.Font("Segoe WP Light", 0, 36)); // NOI18N
        addGuestButton.setText("+");
        addGuestButton.setToolTipText("Increment guest");
        addGuestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGuestButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ctrlPanelLayout = new javax.swing.GroupLayout(ctrlPanel);
        ctrlPanel.setLayout(ctrlPanelLayout);
        ctrlPanelLayout.setHorizontalGroup(
            ctrlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ctrlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ctrlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctrlGuestLabel)
                    .addGroup(ctrlPanelLayout.createSequentialGroup()
                        .addComponent(remGuestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addGuestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ctrlPanelLayout.setVerticalGroup(
            ctrlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ctrlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ctrlGuestLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ctrlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addGuestButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(remGuestButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addContainerGap())
        );

        ctrlTableLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        ctrlTableLabel.setText("No Table");

        javax.swing.GroupLayout tablesPanelLayout = new javax.swing.GroupLayout(tablesPanel);
        tablesPanel.setLayout(tablesPanelLayout);
        tablesPanelLayout.setHorizontalGroup(
            tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablesPanelLayout.createSequentialGroup()
                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tablesPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(table_1_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(table_5_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(table_2_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(table_6_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(table_3_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(table_7_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(table_4_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(table_8_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(tablesPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ctrlTableLabel))
                    .addGroup(tablesPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ctrlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        tablesPanelLayout.setVerticalGroup(
            tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablesPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(table_1_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table_2_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table_3_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table_4_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(table_8_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(table_6_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(table_5_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(table_7_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(ctrlTableLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctrlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        detailPanel.setBackground(new java.awt.Color(255, 255, 255));

        tableStatusTabPanel.setBackground(new java.awt.Color(255, 255, 255));
        tableStatusTabPanel.setToolTipText("");
        tableStatusTabPanel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N

        setFreeButton.setBackground(new java.awt.Color(153, 255, 153));
        setFreeButton.setFont(new java.awt.Font("Segoe WP Light", 0, 18)); // NOI18N
        setFreeButton.setText("Set Free");
        setFreeButton.setToolTipText("Set Table Condition");
        setFreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setFreeButtonActionPerformed(evt);
            }
        });

        setDirtyButton.setBackground(new java.awt.Color(255, 204, 102));
        setDirtyButton.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        setDirtyButton.setText("Set Dirty");
        setDirtyButton.setToolTipText("Set Table Condition");
        setDirtyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setDirtyButtonActionPerformed(evt);
            }
        });

        setUsedButton.setBackground(new java.awt.Color(255, 153, 153));
        setUsedButton.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        setUsedButton.setText("Set Used");
        setUsedButton.setToolTipText("Set Table Condition");
        setUsedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setUsedButtonActionPerformed(evt);
            }
        });

        statusTableLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        statusTableLabel.setText("No Table");

        maxSeatingLabel.setFont(new java.awt.Font("Segoe WP Light", 0, 18)); // NOI18N
        maxSeatingLabel.setText("Max Seating");

        maxSeatingAmt.setFont(new java.awt.Font("Segoe WP Light", 0, 24)); // NOI18N
        maxSeatingAmt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        maxSeatingAmt.setText("0");

        curSeatingLabel.setFont(new java.awt.Font("Segoe WP Light", 0, 18)); // NOI18N
        curSeatingLabel.setText("Currently Seating");

        curSeatingAmt.setFont(new java.awt.Font("Segoe WP Light", 0, 24)); // NOI18N
        curSeatingAmt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        curSeatingAmt.setText("0");

        logOffButton.setText("Log Off");
        logOffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOffButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logOffButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setFreeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setDirtyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setUsedButton, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(statusPanelLayout.createSequentialGroup()
                        .addComponent(maxSeatingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(maxSeatingAmt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(statusPanelLayout.createSequentialGroup()
                        .addComponent(curSeatingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(curSeatingAmt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(statusPanelLayout.createSequentialGroup()
                        .addComponent(statusTableLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setFreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setDirtyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setUsedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusTableLabel)
                .addGap(18, 18, 18)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(maxSeatingAmt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(maxSeatingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(curSeatingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(curSeatingAmt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(234, 234, 234)
                .addComponent(logOffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        tableStatusTabPanel.addTab("Status", statusPanel);

        ordersTableLabel.setFont(new java.awt.Font("Segoe WP Light", 0, 18)); // NOI18N
        ordersTableLabel.setText("No Table");

        addOrderButton.setFont(new java.awt.Font("Segoe WP Light", 0, 18)); // NOI18N
        addOrderButton.setText("Add Order");
        addOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderButtonActionPerformed(evt);
            }
        });

        itemListTextArea.setEditable(false);
        itemListTextArea.setColumns(20);
        itemListTextArea.setRows(5);
        jScrollPane2.setViewportView(itemListTextArea);

        refreshOrdersButton.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        refreshOrdersButton.setText("Refresh");
        refreshOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshOrdersButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout orderPanelLayout = new javax.swing.GroupLayout(orderPanel);
        orderPanel.setLayout(orderPanelLayout);
        orderPanelLayout.setHorizontalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, orderPanelLayout.createSequentialGroup()
                        .addComponent(ordersTableLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshOrdersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addOrderButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        orderPanelLayout.setVerticalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ordersTableLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(refreshOrdersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tableStatusTabPanel.addTab("Orders", orderPanel);

        javax.swing.GroupLayout detailPanelLayout = new javax.swing.GroupLayout(detailPanel);
        detailPanel.setLayout(detailPanelLayout);
        detailPanelLayout.setHorizontalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableStatusTabPanel)
                .addContainerGap())
        );
        detailPanelLayout.setVerticalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableStatusTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        waitWebPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout waitWebPanelLayout = new javax.swing.GroupLayout(waitWebPanel);
        waitWebPanel.setLayout(waitWebPanelLayout);
        waitWebPanelLayout.setHorizontalGroup(
            waitWebPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        waitWebPanelLayout.setVerticalGroup(
            waitWebPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tablesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(waitWebPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(detailPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tablesPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(waitWebPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void selectTable(int tableClicked) {
        table_1_button.setSelected(false);
        table_2_button.setSelected(false);
        table_3_button.setSelected(false);
        table_4_button.setSelected(false);
        table_5_button.setSelected(false);
        table_6_button.setSelected(false);
        table_7_button.setSelected(false);
        table_8_button.setSelected(false);

        switch (tableClicked) {
            case 1:
                table_1_button.setSelected(true);
                break;
            case 2:
                table_2_button.setSelected(true);
                break;
            case 3:
                table_3_button.setSelected(true);
                break;
            case 4:
                table_4_button.setSelected(true);
                break;
            case 5:
                table_5_button.setSelected(true);
                break;
            case 6:
                table_6_button.setSelected(true);
                break;
            case 7:
                table_7_button.setSelected(true);
                break;
            case 8:
                table_8_button.setSelected(true);
                break;
        }
    }

    private void table_1_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table_1_buttonActionPerformed
        // TODO add your handling code here:

        selectTable(1);
        ctrlTableLabel.setText("Table 1");
        statusTableLabel.setText("Table 1");
        ordersTableLabel.setText("Table 1");
        maxSeatingAmt.setText(Integer.toString(tables.get(0).getMaxGuests()));
        curSeatingAmt.setText(Integer.toString(tables.get(0).getCurGuests()));
        
    }//GEN-LAST:event_table_1_buttonActionPerformed

    private void table_2_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table_2_buttonActionPerformed
        // TODO add your handling code here:

        selectTable(2);
        ctrlTableLabel.setText("Table 2");
        statusTableLabel.setText("Table 2");
        ordersTableLabel.setText("Table 2");
        maxSeatingAmt.setText(Integer.toString(tables.get(1).getMaxGuests()));
        curSeatingAmt.setText(Integer.toString(tables.get(1).getCurGuests()));
    }//GEN-LAST:event_table_2_buttonActionPerformed

    private void table_3_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table_3_buttonActionPerformed
        // TODO add your handling code here:

        selectTable(3);
        ctrlTableLabel.setText("Table 3");
        statusTableLabel.setText("Table 3");
        ordersTableLabel.setText("Table 3");
        maxSeatingAmt.setText(Integer.toString(tables.get(2).getMaxGuests()));
        curSeatingAmt.setText(Integer.toString(tables.get(2).getCurGuests()));
    }//GEN-LAST:event_table_3_buttonActionPerformed

    private void table_4_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table_4_buttonActionPerformed
        // TODO add your handling code here:

        selectTable(4);
        ctrlTableLabel.setText("Table 4");
        statusTableLabel.setText("Table 4");
        ordersTableLabel.setText("Table 4");
        maxSeatingAmt.setText(Integer.toString(tables.get(3).getMaxGuests()));
        curSeatingAmt.setText(Integer.toString(tables.get(3).getCurGuests()));
    }//GEN-LAST:event_table_4_buttonActionPerformed

    private void table_5_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table_5_buttonActionPerformed
        // TODO add your handling code here:

        selectTable(5);
        ctrlTableLabel.setText("Table 5");
        statusTableLabel.setText("Table 5");
        ordersTableLabel.setText("Table 5");
        maxSeatingAmt.setText(Integer.toString(tables.get(4).getMaxGuests()));
        curSeatingAmt.setText(Integer.toString(tables.get(4).getCurGuests()));
    }//GEN-LAST:event_table_5_buttonActionPerformed

    private void table_6_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table_6_buttonActionPerformed
        // TODO add your handling code here:

        selectTable(6);
        ctrlTableLabel.setText("Table 6");
        statusTableLabel.setText("Table 6");
        ordersTableLabel.setText("Table 6");
        maxSeatingAmt.setText(Integer.toString(tables.get(5).getMaxGuests()));
        curSeatingAmt.setText(Integer.toString(tables.get(5).getCurGuests()));
    }//GEN-LAST:event_table_6_buttonActionPerformed

    private void table_7_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table_7_buttonActionPerformed
        // TODO add your handling code here:

        selectTable(7);
        ctrlTableLabel.setText("Table 7");
        statusTableLabel.setText("Table 7");
        ordersTableLabel.setText("Table 7");
        maxSeatingAmt.setText(Integer.toString(tables.get(6).getMaxGuests()));
        curSeatingAmt.setText(Integer.toString(tables.get(6).getCurGuests()));
    }//GEN-LAST:event_table_7_buttonActionPerformed

    private void table_8_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table_8_buttonActionPerformed
        // TODO add your handling code here:

        selectTable(8);
        ctrlTableLabel.setText("Table 8");
        statusTableLabel.setText("Table 8");
        ordersTableLabel.setText("Table 8");
        maxSeatingAmt.setText(Integer.toString(tables.get(7).getMaxGuests()));
        curSeatingAmt.setText(Integer.toString(tables.get(7).getCurGuests()));
    }//GEN-LAST:event_table_8_buttonActionPerformed

    private void setDirtyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDirtyButtonActionPerformed
        // TODO add your handling code here:

        if (table_1_button.isSelected()) {
            table_1_button.setBackground(new java.awt.Color(255, 204, 102));
            table_1_panel.setBackground(new java.awt.Color(255, 204, 102));
            tables.get(0).setAvailability(1);
            tables.get(0).setCurGuests(0);
            curSeatingAmt.setText(Integer.toString(tables.get(0).getCurGuests()));
            rD.setStaus(1, "Dirty");
        } else if (table_2_button.isSelected()) {
            table_2_button.setBackground(new java.awt.Color(255, 204, 102));
            table_2_panel.setBackground(new java.awt.Color(255, 204, 102));
            tables.get(0).setCurGuests(0);
            curSeatingAmt.setText(Integer.toString(tables.get(0).getCurGuests()));
            rD.setStaus(2, "Dirty");
        } else if (table_3_button.isSelected()) {
            table_3_button.setBackground(new java.awt.Color(255, 204, 102));
            table_3_panel.setBackground(new java.awt.Color(255, 204, 102));
            tables.get(0).setCurGuests(0);
            curSeatingAmt.setText(Integer.toString(tables.get(0).getCurGuests()));
            rD.setStaus(3, "Dirty");
        } else if (table_4_button.isSelected()) {
            table_4_button.setBackground(new java.awt.Color(255, 204, 102));
            table_4_panel.setBackground(new java.awt.Color(255, 204, 102));
            tables.get(0).setCurGuests(0);
            curSeatingAmt.setText(Integer.toString(tables.get(0).getCurGuests()));
            rD.setStaus(4, "Dirty");
        } else if (table_5_button.isSelected()) {
            table_5_button.setBackground(new java.awt.Color(255, 204, 102));
            table_5_panel.setBackground(new java.awt.Color(255, 204, 102));
            tables.get(0).setCurGuests(0);
            curSeatingAmt.setText(Integer.toString(tables.get(0).getCurGuests()));
            rD.setStaus(5, "Dirty");
        } else if (table_6_button.isSelected()) {
            table_6_button.setBackground(new java.awt.Color(255, 204, 102));
            table_6_panel.setBackground(new java.awt.Color(255, 204, 102));
            tables.get(0).setCurGuests(0);
            curSeatingAmt.setText(Integer.toString(tables.get(0).getCurGuests()));
            rD.setStaus(6, "Dirty");
        } else if (table_7_button.isSelected()) {
            table_7_button.setBackground(new java.awt.Color(255, 204, 102));
            table_7_panel.setBackground(new java.awt.Color(255, 204, 102));
            tables.get(0).setCurGuests(0);
            curSeatingAmt.setText(Integer.toString(tables.get(0).getCurGuests()));
            rD.setStaus(7, "Dirty");
        } else if (table_8_button.isSelected()) {
            table_8_button.setBackground(new java.awt.Color(255, 204, 102));
            table_8_panel.setBackground(new java.awt.Color(255, 204, 102));
            tables.get(0).setCurGuests(0);
            curSeatingAmt.setText(Integer.toString(tables.get(0).getCurGuests()));
            rD.setStaus(8, "Dirty");
        }
    }//GEN-LAST:event_setDirtyButtonActionPerformed

    private void setUsedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setUsedButtonActionPerformed
        // TODO add your handling code here:
        
        
        if (table_1_button.isSelected()) {
            table_1_button.setBackground(new java.awt.Color(255, 153, 153));
            table_1_panel.setBackground(new java.awt.Color(255, 153, 153));
            rD.setStaus(1, "Used");
        } else if (table_2_button.isSelected()) {
            table_2_button.setBackground(new java.awt.Color(255, 153, 153));
            table_2_panel.setBackground(new java.awt.Color(255, 153, 153));
            rD.setStaus(2, "Used");
        } else if (table_3_button.isSelected()) {
            table_3_button.setBackground(new java.awt.Color(255, 153, 153));
            table_3_panel.setBackground(new java.awt.Color(255, 153, 153));
            rD.setStaus(3, "Used");
        } else if (table_4_button.isSelected()) {
            table_4_button.setBackground(new java.awt.Color(255, 153, 153));
            table_4_panel.setBackground(new java.awt.Color(255, 153, 153));
            rD.setStaus(4, "Used");
        } else if (table_5_button.isSelected()) {
            table_5_button.setBackground(new java.awt.Color(255, 153, 153));
            table_5_panel.setBackground(new java.awt.Color(255, 153, 153));
            rD.setStaus(5, "Used");
        } else if (table_6_button.isSelected()) {
            table_6_button.setBackground(new java.awt.Color(255, 153, 153));
            table_6_panel.setBackground(new java.awt.Color(255, 153, 153));
            rD.setStaus(6, "Used");
        } else if (table_7_button.isSelected()) {
            table_7_button.setBackground(new java.awt.Color(255, 153, 153));
            table_7_panel.setBackground(new java.awt.Color(255, 153, 153));
            rD.setStaus(7, "Used");
        } else if (table_8_button.isSelected()) {
            table_8_button.setBackground(new java.awt.Color(255, 153, 153));
            table_8_panel.setBackground(new java.awt.Color(255, 153, 153));
            rD.setStaus(8, "Used");
        }
    }//GEN-LAST:event_setUsedButtonActionPerformed

    private void setFreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setFreeButtonActionPerformed
        // TODO add your handling code here:

        if (table_1_button.isSelected()) {
            table_1_button.setBackground(new java.awt.Color(153, 255, 153));
            table_1_panel.setBackground(new java.awt.Color(153, 255, 153));
            tables.get(0).setAvailability(0);
            tables.get(0).setCurGuests(0);
            curSeatingAmt.setText(Integer.toString(tables.get(0).getCurGuests()));
            rD.setStaus(1, "Free");
        } else if (table_2_button.isSelected()) {
            table_2_button.setBackground(new java.awt.Color(153, 255, 153));
            table_2_panel.setBackground(new java.awt.Color(153, 255, 153));
            tables.get(1).setCurGuests(0);
            curSeatingAmt.setText(Integer.toString(tables.get(1).getCurGuests()));
            rD.setStaus(2, "Free");
        } else if (table_3_button.isSelected()) {
            table_3_button.setBackground(new java.awt.Color(153, 255, 153));
            table_3_panel.setBackground(new java.awt.Color(153, 255, 153));
            tables.get(2).setCurGuests(0);
            rD.setStaus(3, "Free");
            curSeatingAmt.setText(Integer.toString(tables.get(2).getCurGuests()));
        } else if (table_4_button.isSelected()) {
            table_4_button.setBackground(new java.awt.Color(153, 255, 153));
            table_4_panel.setBackground(new java.awt.Color(153, 255, 153));
            tables.get(3).setCurGuests(0);
            curSeatingAmt.setText(Integer.toString(tables.get(3).getCurGuests()));
            rD.setStaus(4, "Free");
        } else if (table_5_button.isSelected()) {
            table_5_button.setBackground(new java.awt.Color(153, 255, 153));
            table_5_panel.setBackground(new java.awt.Color(153, 255, 153));
            tables.get(4).setCurGuests(0);
            curSeatingAmt.setText(Integer.toString(tables.get(4).getCurGuests()));
            rD.setStaus(5, "Free");
        } else if (table_6_button.isSelected()) {
            table_6_button.setBackground(new java.awt.Color(153, 255, 153));
            table_6_panel.setBackground(new java.awt.Color(153, 255, 153));
            tables.get(5).setCurGuests(0);
            curSeatingAmt.setText(Integer.toString(tables.get(5).getCurGuests()));
            rD.setStaus(6, "Free");
        } else if (table_7_button.isSelected()) {
            table_7_button.setBackground(new java.awt.Color(153, 255, 153));
            table_7_panel.setBackground(new java.awt.Color(153, 255, 153));
            tables.get(6).setCurGuests(0);
            curSeatingAmt.setText(Integer.toString(tables.get(6).getCurGuests()));
            rD.setStaus(7, "Free");
        } else if (table_8_button.isSelected()) {
            table_8_button.setBackground(new java.awt.Color(153, 255, 153));
            table_8_panel.setBackground(new java.awt.Color(153, 255, 153));
            tables.get(7).setCurGuests(0);
            curSeatingAmt.setText(Integer.toString(tables.get(7).getCurGuests()));
            rD.setStaus(8, "Free");
        }
    }//GEN-LAST:event_setFreeButtonActionPerformed

    private void remGuestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remGuestButtonActionPerformed
        // TODO add your handling code here:
        
        if (table_1_button.isSelected()) {
            //table_1_button.setBackground(new java.awt.Color(153, 255, 153));
            //table_1_panel.setBackground(new java.awt.Color(153, 255, 153));
            tables.get(0).setAvailability(0);
            if (tables.get(0).getCurGuests() > 0) {
                tables.get(0).removeGuest();
            }
            curSeatingAmt.setText(Integer.toString(tables.get(0).getCurGuests()));
            if (tables.get(0).getCurGuests() > 0) {
                table_1_button.setBackground(new java.awt.Color(255,153,153));
                table_1_panel.setBackground(new java.awt.Color(255,153,153));
            } else if (tables.get(0).getCurGuests() == 0) {
                table_1_button.setBackground(new java.awt.Color(255,204,102));
                table_1_panel.setBackground(new java.awt.Color(255,204,102));
            }
        } else if (table_2_button.isSelected()) {
            table_2_button.setBackground(new java.awt.Color(153, 255, 153));
            table_2_panel.setBackground(new java.awt.Color(153, 255, 153));
            if (tables.get(1).getCurGuests() > 0) {
                tables.get(1).removeGuest();
            }
            curSeatingAmt.setText(Integer.toString(tables.get(1).getCurGuests()));
            if (tables.get(1).getCurGuests() > 0) {
                table_2_button.setBackground(new java.awt.Color(255,153,153));
                table_2_panel.setBackground(new java.awt.Color(255,153,153));
            } else if (tables.get(1).getCurGuests() == 0) {
                table_2_button.setBackground(new java.awt.Color(255,204,102));
                table_2_panel.setBackground(new java.awt.Color(255,204,102));
            }
        } else if (table_3_button.isSelected()) {
            table_3_button.setBackground(new java.awt.Color(153, 255, 153));
            table_3_panel.setBackground(new java.awt.Color(153, 255, 153));
            if (tables.get(2).getCurGuests() > 0) {
                tables.get(2).removeGuest();
            }
            curSeatingAmt.setText(Integer.toString(tables.get(2).getCurGuests()));
            if (tables.get(3).getCurGuests() > 0) {
                table_3_button.setBackground(new java.awt.Color(255,153,153));
                table_3_panel.setBackground(new java.awt.Color(255,153,153));
            } else if (tables.get(3).getCurGuests() == 0) {
                table_3_button.setBackground(new java.awt.Color(255,204,102));
                table_3_panel.setBackground(new java.awt.Color(255,204,102));
            }
        } else if (table_4_button.isSelected()) {
            table_4_button.setBackground(new java.awt.Color(153, 255, 153));
            table_4_panel.setBackground(new java.awt.Color(153, 255, 153));
            if (tables.get(3).getCurGuests() > 0) {
                tables.get(3).removeGuest();
            }
            curSeatingAmt.setText(Integer.toString(tables.get(3).getCurGuests()));
            if (tables.get(3).getCurGuests() > 0) {
                table_4_button.setBackground(new java.awt.Color(255,153,153));
                table_4_panel.setBackground(new java.awt.Color(255,153,153));
            } else if (tables.get(3).getCurGuests() == 0) {
                table_4_button.setBackground(new java.awt.Color(255,204,102));
                table_4_panel.setBackground(new java.awt.Color(255,204,102));
            }
        } else if (table_5_button.isSelected()) {
            table_5_button.setBackground(new java.awt.Color(153, 255, 153));
            table_5_panel.setBackground(new java.awt.Color(153, 255, 153));
            if (tables.get(4).getCurGuests() > 0) {
                tables.get(4).removeGuest();
            }
            curSeatingAmt.setText(Integer.toString(tables.get(4).getCurGuests()));
            if (tables.get(4).getCurGuests() > 0) {
                table_5_button.setBackground(new java.awt.Color(255,153,153));
                table_5_panel.setBackground(new java.awt.Color(255,153,153));
            } else if (tables.get(4).getCurGuests() == 0) {
                table_5_button.setBackground(new java.awt.Color(255,204,102));
                table_5_panel.setBackground(new java.awt.Color(255,204,102));
            }
        } else if (table_6_button.isSelected()) {
            table_6_button.setBackground(new java.awt.Color(153, 255, 153));
            table_6_panel.setBackground(new java.awt.Color(153, 255, 153));
            if (tables.get(5).getCurGuests() > 0) {
                tables.get(5).removeGuest();
            }
            curSeatingAmt.setText(Integer.toString(tables.get(5).getCurGuests()));
            if (tables.get(5).getCurGuests() > 0) {
                table_6_button.setBackground(new java.awt.Color(255,153,153));
                table_6_panel.setBackground(new java.awt.Color(255,153,153));
            } else if (tables.get(5).getCurGuests() == 0) {
                table_6_button.setBackground(new java.awt.Color(255,204,102));
                table_6_panel.setBackground(new java.awt.Color(255,204,102));
            }
        } else if (table_7_button.isSelected()) {
            table_7_button.setBackground(new java.awt.Color(153, 255, 153));
            table_7_panel.setBackground(new java.awt.Color(153, 255, 153));
            if (tables.get(6).getCurGuests() > 0) {
                tables.get(6).removeGuest();
            }
            curSeatingAmt.setText(Integer.toString(tables.get(6).getCurGuests()));
            if (tables.get(6).getCurGuests() > 0) {
                table_7_button.setBackground(new java.awt.Color(255,153,153));
                table_7_panel.setBackground(new java.awt.Color(255,153,153));
            } else if (tables.get(6).getCurGuests() == 0) {
                table_7_button.setBackground(new java.awt.Color(255,204,102));
                table_7_panel.setBackground(new java.awt.Color(255,204,102));
            }
        } else if (table_8_button.isSelected()) {
            table_8_button.setBackground(new java.awt.Color(153, 255, 153));
            table_8_panel.setBackground(new java.awt.Color(153, 255, 153));
            if (tables.get(7).getCurGuests() > 0) {
                tables.get(7).removeGuest();
            }
            curSeatingAmt.setText(Integer.toString(tables.get(7).getCurGuests()));
            if (tables.get(7).getCurGuests() > 0) {
                table_8_button.setBackground(new java.awt.Color(255,153,153));
                table_8_panel.setBackground(new java.awt.Color(255,153,153));
            } else if (tables.get(7).getCurGuests() == 0) {
                table_8_button.setBackground(new java.awt.Color(255,204,102));
                table_8_panel.setBackground(new java.awt.Color(255,204,102));
            }
        }
    }//GEN-LAST:event_remGuestButtonActionPerformed

    private void addGuestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGuestButtonActionPerformed
        // TODO add your handling code here:
        
        if (table_1_button.isSelected()) {
            table_1_button.setBackground(new java.awt.Color(255,153,153));
            table_1_panel.setBackground(new java.awt.Color(255,153,153));
            tables.get(0).setAvailability(0);
            if (tables.get(0).getCurGuests() < tables.get(0).getMaxGuests()) {
                tables.get(0).addGuest();
            }
            curSeatingAmt.setText(Integer.toString(tables.get(0).getCurGuests()));
            
        } else if (table_2_button.isSelected()) {
            table_2_button.setBackground(new java.awt.Color(255,153,153));
            table_2_panel.setBackground(new java.awt.Color(255,153,153));
            if (tables.get(1).getCurGuests() < tables.get(1).getMaxGuests()) {
                tables.get(1).addGuest();
            }
            curSeatingAmt.setText(Integer.toString(tables.get(1).getCurGuests()));
        } else if (table_3_button.isSelected()) {
            table_3_button.setBackground(new java.awt.Color(255,153,153));
            table_3_panel.setBackground(new java.awt.Color(255,153,153));
            if (tables.get(2).getCurGuests() < tables.get(2).getMaxGuests()) {
                tables.get(2).addGuest();
            }
            curSeatingAmt.setText(Integer.toString(tables.get(2).getCurGuests()));
        } else if (table_4_button.isSelected()) {
            table_4_button.setBackground(new java.awt.Color(255,153,153));
            table_4_panel.setBackground(new java.awt.Color(255,153,153));
            if (tables.get(3).getCurGuests() < tables.get(3).getMaxGuests()) {
                tables.get(3).addGuest();
            }
            curSeatingAmt.setText(Integer.toString(tables.get(3).getCurGuests()));
        } else if (table_5_button.isSelected()) {
            table_5_button.setBackground(new java.awt.Color(255,153,153));
            table_5_panel.setBackground(new java.awt.Color(255,153,153));
            if (tables.get(4).getCurGuests() < tables.get(4).getMaxGuests()) {
                tables.get(4).addGuest();
            }
            curSeatingAmt.setText(Integer.toString(tables.get(4).getCurGuests()));
        } else if (table_6_button.isSelected()) {
            table_6_button.setBackground(new java.awt.Color(255,153,153));
            table_6_panel.setBackground(new java.awt.Color(255,153,153));
            if (tables.get(5).getCurGuests() < tables.get(5).getMaxGuests()) {
                tables.get(5).addGuest();
            }
            curSeatingAmt.setText(Integer.toString(tables.get(5).getCurGuests()));
        } else if (table_7_button.isSelected()) {
            table_7_button.setBackground(new java.awt.Color(255,153,153));
            table_7_panel.setBackground(new java.awt.Color(255,153,153));
            if (tables.get(6).getCurGuests() < tables.get(6).getMaxGuests()) {
                tables.get(6).addGuest();
            }
            curSeatingAmt.setText(Integer.toString(tables.get(6).getCurGuests()));
        } else if (table_8_button.isSelected()) {
            table_8_button.setBackground(new java.awt.Color(255,153,153));
            table_8_panel.setBackground(new java.awt.Color(255,153,153));
            if (tables.get(7).getCurGuests() < tables.get(7).getMaxGuests()) {
                tables.get(7).addGuest();
            }
            curSeatingAmt.setText(Integer.toString(tables.get(7).getCurGuests()));
        }
    }//GEN-LAST:event_addGuestButtonActionPerformed

    private void logOffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOffButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);        
    }//GEN-LAST:event_logOffButtonActionPerformed

    private void refreshOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshOrdersButtonActionPerformed
        // TODO add your handling code here:
        if (table_1_button.isSelected()) {
            refreshMenu(rD, 1);
        } else if (table_2_button.isSelected()) {
            refreshMenu(rD, 2);
        } else if (table_3_button.isSelected()) {
            refreshMenu(rD, 3);
        } else if (table_4_button.isSelected()) {
            refreshMenu(rD, 4);
        } else if (table_5_button.isSelected()) {
            refreshMenu(rD, 5);
        } else if (table_6_button.isSelected()) {
            refreshMenu(rD, 6);
        } else if (table_7_button.isSelected()) {
            refreshMenu(rD, 7);
        } else if (table_8_button.isSelected()) {
            refreshMenu(rD, 8);
        }
    }//GEN-LAST:event_refreshOrdersButtonActionPerformed

    /**
     * Add an order to the selected table.
     * @param evt 
     */
    private void addOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderButtonActionPerformed
        // TODO add your handling code here:
        if (table_1_button.isSelected()) {
            AddOrder aO = new AddOrder(rD, 1);
        } else if (table_2_button.isSelected()) {
            AddOrder aO = new AddOrder(rD, 2);
        } else if (table_3_button.isSelected()) {
            AddOrder aO = new AddOrder(rD, 3);
        } else if (table_4_button.isSelected()) {
            AddOrder aO = new AddOrder(rD, 4);
        } else if (table_5_button.isSelected()) {
            AddOrder aO = new AddOrder(rD, 5);
        } else if (table_6_button.isSelected()) {
            AddOrder aO = new AddOrder(rD, 6);
        } else if (table_7_button.isSelected()) {
            AddOrder aO = new AddOrder(rD, 7);
        } else if (table_8_button.isSelected()) {
            AddOrder aO = new AddOrder(rD, 8);
        }
    }//GEN-LAST:event_addOrderButtonActionPerformed

     public void refreshMenu(RestrauntDatabase rD, int table) {
        String setOrderList = "";
        for (int i = 0; i < rD.getTableOrder(table).size(); i++) {
            setOrderList += (rD.getTableOrder(table).get(0)) + 
                    " " + (rD.getTableOrder(table).get(1));
        }
        itemListTextArea.setText(setOrderList);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new RestaurantLayout().setVisible(true);
            }
        });
               

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGuestButton;
    private javax.swing.JButton addOrderButton;
    private javax.swing.JLabel ctrlGuestLabel;
    private javax.swing.JPanel ctrlPanel;
    private javax.swing.JLabel ctrlTableLabel;
    private javax.swing.JLabel curSeatingAmt;
    private javax.swing.JLabel curSeatingLabel;
    private javax.swing.JPanel detailPanel;
    private javax.swing.JTextArea itemListTextArea;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logOffButton;
    private javax.swing.JLabel maxSeatingAmt;
    private javax.swing.JLabel maxSeatingLabel;
    private javax.swing.JPanel orderPanel;
    private javax.swing.JLabel ordersTableLabel;
    private javax.swing.JButton refreshOrdersButton;
    private javax.swing.JButton remGuestButton;
    private javax.swing.JButton setDirtyButton;
    private javax.swing.JButton setFreeButton;
    private javax.swing.JButton setUsedButton;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JLabel statusTableLabel;
    private javax.swing.JTabbedPane tableStatusTabPanel;
    private javax.swing.JToggleButton table_1_button;
    private javax.swing.JPanel table_1_panel;
    private javax.swing.JToggleButton table_2_button;
    private javax.swing.JPanel table_2_panel;
    private javax.swing.JToggleButton table_3_button;
    private javax.swing.JPanel table_3_panel;
    private javax.swing.JToggleButton table_4_button;
    private javax.swing.JPanel table_4_panel;
    private javax.swing.JToggleButton table_5_button;
    private javax.swing.JPanel table_5_panel;
    private javax.swing.JToggleButton table_6_button;
    private javax.swing.JPanel table_6_panel;
    private javax.swing.JToggleButton table_7_button;
    private javax.swing.JPanel table_7_panel;
    private javax.swing.JToggleButton table_8_button;
    private javax.swing.JPanel table_8_panel;
    private javax.swing.JPanel tablesPanel;
    private javax.swing.JPanel waitWebPanel;
    // End of variables declaration//GEN-END:variables
}
