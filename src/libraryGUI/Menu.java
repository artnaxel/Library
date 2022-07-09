package libraryGUI;

import IO.*;
import static libraryGUI.ManageBooks.lib;

//IMPORTS FOR GUI
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * @author artnaxel
 * 
 */
public class Menu extends JFrame {
    
    public Menu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lsPanel = new javax.swing.JPanel();
        lsBluePanel = new javax.swing.JPanel();
        lsLabel = new javax.swing.JLabel();
        lsIcon = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        borrowBook = new javax.swing.JPanel();
        borrowBookLabel = new javax.swing.JLabel();
        borrowBookIcon = new javax.swing.JLabel();
        manageBooks = new javax.swing.JPanel();
        manageBooksIcon = new javax.swing.JLabel();
        manageBooksLabel = new javax.swing.JLabel();
        loadLibrary = new javax.swing.JPanel();
        loadLibraryLabel = new javax.swing.JLabel();
        loadLibraryIcon = new javax.swing.JLabel();
        returnBook = new javax.swing.JPanel();
        returnBookIcon = new javax.swing.JLabel();
        returnBookLabel = new javax.swing.JLabel();
        saveLibrary = new javax.swing.JPanel();
        saveLibraryLabel = new javax.swing.JLabel();
        saveLibraryIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        lsPanel.setBackground(new java.awt.Color(255, 255, 255));
        lsPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lsPanelMouseDragged(evt);
            }
        });
        lsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lsPanelMousePressed(evt);
            }
        });
        lsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lsBluePanel.setBackground(new java.awt.Color(45, 118, 232));

        lsLabel.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        lsLabel.setForeground(new java.awt.Color(255, 255, 255));
        lsLabel.setText("Library System");

        lsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryGUI/images/icons8-library-building-50.png"))); // NOI18N

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryGUI/images/icons8-close-30.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout lsBluePanelLayout = new javax.swing.GroupLayout(lsBluePanel);
        lsBluePanel.setLayout(lsBluePanelLayout);
        lsBluePanelLayout.setHorizontalGroup(
            lsBluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lsBluePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lsIcon)
                .addGroup(lsBluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lsBluePanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 491, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lsBluePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit)
                        .addGap(14, 14, 14))))
        );
        lsBluePanelLayout.setVerticalGroup(
            lsBluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lsBluePanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lsIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lsBluePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lsLabel)
                .addGap(93, 93, 93))
        );

        lsPanel.add(lsBluePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 100));

        borrowBook.setBackground(new java.awt.Color(240, 240, 240));
        borrowBook.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        borrowBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                borrowBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                borrowBookMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                borrowBookMousePressed(evt);
            }
        });

        borrowBookLabel.setBackground(new java.awt.Color(45, 118, 232));
        borrowBookLabel.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        borrowBookLabel.setForeground(new java.awt.Color(45, 118, 232));
        borrowBookLabel.setText("Borrow Book");

        borrowBookIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryGUI/images/icons8-borrow-book-50 (2).png"))); // NOI18N

        javax.swing.GroupLayout borrowBookLayout = new javax.swing.GroupLayout(borrowBook);
        borrowBook.setLayout(borrowBookLayout);
        borrowBookLayout.setHorizontalGroup(
            borrowBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrowBookLayout.createSequentialGroup()
                .addGroup(borrowBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(borrowBookLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(borrowBookLabel))
                    .addGroup(borrowBookLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(borrowBookIcon)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        borrowBookLayout.setVerticalGroup(
            borrowBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borrowBookLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(borrowBookIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borrowBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        lsPanel.add(borrowBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 120, 120));
        borrowBook.getAccessibleContext().setAccessibleName("");

        manageBooks.setBackground(new java.awt.Color(240, 240, 240));
        manageBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageBooksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageBooksMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageBooksMousePressed(evt);
            }
        });

        manageBooksIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryGUI/images/icons8-book-50.png"))); // NOI18N
        manageBooksIcon.setText("jLabel1");
        manageBooksIcon.setMaximumSize(new java.awt.Dimension(50, 50));
        manageBooksIcon.setMinimumSize(new java.awt.Dimension(50, 50));
        manageBooksIcon.setPreferredSize(new java.awt.Dimension(50, 50));

        manageBooksLabel.setBackground(new java.awt.Color(45, 118, 232));
        manageBooksLabel.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        manageBooksLabel.setForeground(new java.awt.Color(45, 118, 232));
        manageBooksLabel.setText("Manage Books");

        javax.swing.GroupLayout manageBooksLayout = new javax.swing.GroupLayout(manageBooks);
        manageBooks.setLayout(manageBooksLayout);
        manageBooksLayout.setHorizontalGroup(
            manageBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageBooksLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(manageBooksIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageBooksLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(manageBooksLabel)
                .addGap(17, 17, 17))
        );
        manageBooksLayout.setVerticalGroup(
            manageBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageBooksLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(manageBooksIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageBooksLabel)
                .addGap(8, 8, 8))
        );

        lsPanel.add(manageBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 120, 120));

        loadLibrary.setBackground(new java.awt.Color(240, 240, 240));
        loadLibrary.setToolTipText("");
        loadLibrary.setPreferredSize(new java.awt.Dimension(120, 120));
        loadLibrary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loadLibraryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loadLibraryMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loadLibraryMousePressed(evt);
            }
        });

        loadLibraryLabel.setBackground(new java.awt.Color(45, 118, 232));
        loadLibraryLabel.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        loadLibraryLabel.setForeground(new java.awt.Color(45, 118, 232));
        loadLibraryLabel.setText("Load Library");
        loadLibraryLabel.setToolTipText("");

        loadLibraryIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryGUI/images/icons8-load-64.png"))); // NOI18N

        javax.swing.GroupLayout loadLibraryLayout = new javax.swing.GroupLayout(loadLibrary);
        loadLibrary.setLayout(loadLibraryLayout);
        loadLibraryLayout.setHorizontalGroup(
            loadLibraryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loadLibraryLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(loadLibraryLabel)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loadLibraryLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loadLibraryIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        loadLibraryLayout.setVerticalGroup(
            loadLibraryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadLibraryLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(loadLibraryIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadLibraryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        lsPanel.add(loadLibrary, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 120, 120));

        returnBook.setBackground(new java.awt.Color(240, 240, 240));
        returnBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                returnBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                returnBookMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                returnBookMousePressed(evt);
            }
        });

        returnBookIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryGUI/images/icons8-return-book-50.png"))); // NOI18N

        returnBookLabel.setBackground(new java.awt.Color(45, 118, 232));
        returnBookLabel.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        returnBookLabel.setForeground(new java.awt.Color(45, 118, 232));
        returnBookLabel.setText("Return Book");

        javax.swing.GroupLayout returnBookLayout = new javax.swing.GroupLayout(returnBook);
        returnBook.setLayout(returnBookLayout);
        returnBookLayout.setHorizontalGroup(
            returnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnBookLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(returnBookLabel)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, returnBookLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(returnBookIcon)
                .addGap(34, 34, 34))
        );
        returnBookLayout.setVerticalGroup(
            returnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnBookLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(returnBookIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        lsPanel.add(returnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 120, 120));

        saveLibrary.setBackground(new java.awt.Color(240, 240, 240));
        saveLibrary.setPreferredSize(new java.awt.Dimension(120, 120));
        saveLibrary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveLibraryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveLibraryMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                saveLibraryMousePressed(evt);
            }
        });

        saveLibraryLabel.setBackground(new java.awt.Color(45, 118, 232));
        saveLibraryLabel.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        saveLibraryLabel.setForeground(new java.awt.Color(45, 118, 232));
        saveLibraryLabel.setText("Save Library");

        saveLibraryIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryGUI/images/icons8-save-50.png"))); // NOI18N

        javax.swing.GroupLayout saveLibraryLayout = new javax.swing.GroupLayout(saveLibrary);
        saveLibrary.setLayout(saveLibraryLayout);
        saveLibraryLayout.setHorizontalGroup(
            saveLibraryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saveLibraryLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(saveLibraryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saveLibraryLayout.createSequentialGroup()
                        .addComponent(saveLibraryIcon)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saveLibraryLayout.createSequentialGroup()
                        .addComponent(saveLibraryLabel)
                        .addGap(16, 16, 16))))
        );
        saveLibraryLayout.setVerticalGroup(
            saveLibraryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saveLibraryLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(saveLibraryIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveLibraryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        lsPanel.add(saveLibrary, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 120, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 834, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMousePressed(MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void manageBooksMouseEntered(MouseEvent evt) {//GEN-FIRST:event_manageBooksMouseEntered
       setColor(manageBooks);
       
    }//GEN-LAST:event_manageBooksMouseEntered

    private void manageBooksMouseExited(MouseEvent evt) {//GEN-FIRST:event_manageBooksMouseExited
        resetColor(manageBooks);
    }//GEN-LAST:event_manageBooksMouseExited

    private void borrowBookMouseEntered(MouseEvent evt) {//GEN-FIRST:event_borrowBookMouseEntered
        setColor(borrowBook);
    }//GEN-LAST:event_borrowBookMouseEntered

    private void borrowBookMouseExited(MouseEvent evt) {//GEN-FIRST:event_borrowBookMouseExited
        resetColor(borrowBook);
    }//GEN-LAST:event_borrowBookMouseExited

    private void saveLibraryMouseEntered(MouseEvent evt) {//GEN-FIRST:event_saveLibraryMouseEntered
       setColor(saveLibrary);
    }//GEN-LAST:event_saveLibraryMouseEntered

    private void saveLibraryMouseExited(MouseEvent evt) {//GEN-FIRST:event_saveLibraryMouseExited
        resetColor(saveLibrary);
    }//GEN-LAST:event_saveLibraryMouseExited

    private void loadLibraryMouseEntered(MouseEvent evt) {//GEN-FIRST:event_loadLibraryMouseEntered
        setColor(loadLibrary);
    }//GEN-LAST:event_loadLibraryMouseEntered

    private void loadLibraryMouseExited(MouseEvent evt) {//GEN-FIRST:event_loadLibraryMouseExited
        resetColor(loadLibrary);
    }//GEN-LAST:event_loadLibraryMouseExited

    int xx, xy;
    private void lsPanelMousePressed(MouseEvent evt) {//GEN-FIRST:event_lsPanelMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_lsPanelMousePressed

    private void lsPanelMouseDragged(MouseEvent evt) {//GEN-FIRST:event_lsPanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy); 
    }//GEN-LAST:event_lsPanelMouseDragged

    private void manageBooksMousePressed(MouseEvent evt) {//GEN-FIRST:event_manageBooksMousePressed
        new ManageBooks().show();
    }//GEN-LAST:event_manageBooksMousePressed

    private void borrowBookMousePressed(MouseEvent evt) {//GEN-FIRST:event_borrowBookMousePressed
        new BorrowBook().show();
    }//GEN-LAST:event_borrowBookMousePressed

    private void saveLibraryMousePressed(MouseEvent evt) {//GEN-FIRST:event_saveLibraryMousePressed
        SaveThread saveThread =  new SaveThread(lib, "library.ser");
        saveThread.start();
        showMessageDialog(this, "The library has been succesfully saved!");
    }//GEN-LAST:event_saveLibraryMousePressed

    private void loadLibraryMousePressed(MouseEvent evt) {//GEN-FIRST:event_loadLibraryMousePressed
        LoadThread loadThread = new LoadThread(lib, "library.ser");
        loadThread.start();
        showMessageDialog(this, "The library has been succesfully loaded!");
    }//GEN-LAST:event_loadLibraryMousePressed

    private void returnBookMouseEntered(MouseEvent evt) {//GEN-FIRST:event_returnBookMouseEntered
        setColor(returnBook);
    }//GEN-LAST:event_returnBookMouseEntered

    private void returnBookMouseExited(MouseEvent evt) {//GEN-FIRST:event_returnBookMouseExited
        resetColor(returnBook);
    }//GEN-LAST:event_returnBookMouseExited

    private void returnBookMousePressed(MouseEvent evt) {//GEN-FIRST:event_returnBookMousePressed
        new ReturnBook().show();
    }//GEN-LAST:event_returnBookMousePressed

    private void setColor(JPanel panel){
        panel.setBackground(new Color(197,197,197));
    }
    private void resetColor(JPanel panel){
        panel.setBackground(new Color(240, 240, 240));
    }
    
    public static void main(String args[]) {
        /* Create and display the form */
        EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel borrowBook;
    private javax.swing.JLabel borrowBookIcon;
    private javax.swing.JLabel borrowBookLabel;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel loadLibrary;
    private javax.swing.JLabel loadLibraryIcon;
    private javax.swing.JLabel loadLibraryLabel;
    private javax.swing.JPanel lsBluePanel;
    private javax.swing.JLabel lsIcon;
    private javax.swing.JLabel lsLabel;
    private javax.swing.JPanel lsPanel;
    private javax.swing.JPanel manageBooks;
    private javax.swing.JLabel manageBooksIcon;
    private javax.swing.JLabel manageBooksLabel;
    private javax.swing.JPanel returnBook;
    private javax.swing.JLabel returnBookIcon;
    private javax.swing.JLabel returnBookLabel;
    private javax.swing.JPanel saveLibrary;
    private javax.swing.JLabel saveLibraryIcon;
    private javax.swing.JLabel saveLibraryLabel;
    // End of variables declaration//GEN-END:variables
}
