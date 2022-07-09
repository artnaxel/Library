package libraryGUI;

import table.*;
import exception.BookException;

import static libraryGUI.ManageBooks.lib;
import main.*;

//IMPORTS FOR GUI
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class BorrowBook extends JFrame {
    
    private String[][] dataBook;

    public BorrowBook() {
        initComponents();
        MyTable.loadTable(dataBook, borrowTable, lib, Status.AVAILABLE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        borrowBookPanel = new javax.swing.JPanel();
        borrowBookBluePanel = new javax.swing.JPanel();
        borrowBookLabel = new javax.swing.JLabel();
        borrowBookIcon = new javax.swing.JLabel();
        borrowBookButton = new javax.swing.JButton();
        borrowBookMsg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        borrowTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        borrowBookPanel.setBackground(new java.awt.Color(255, 255, 255));
        borrowBookPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        borrowBookBluePanel.setBackground(new java.awt.Color(45, 118, 232));

        borrowBookLabel.setBackground(new java.awt.Color(255, 255, 255));
        borrowBookLabel.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        borrowBookLabel.setForeground(new java.awt.Color(255, 255, 255));
        borrowBookLabel.setText("Borrow Book");

        borrowBookIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryGUI/images/icons8-borrow-book-50 (3).png"))); // NOI18N

        javax.swing.GroupLayout borrowBookBluePanelLayout = new javax.swing.GroupLayout(borrowBookBluePanel);
        borrowBookBluePanel.setLayout(borrowBookBluePanelLayout);
        borrowBookBluePanelLayout.setHorizontalGroup(
            borrowBookBluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrowBookBluePanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(borrowBookIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borrowBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(569, Short.MAX_VALUE))
        );
        borrowBookBluePanelLayout.setVerticalGroup(
            borrowBookBluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrowBookBluePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(borrowBookBluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borrowBookIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borrowBookBluePanelLayout.createSequentialGroup()
                        .addComponent(borrowBookLabel)
                        .addGap(9, 9, 9)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        borrowBookPanel.add(borrowBookBluePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 100));

        borrowBookButton.setBackground(new java.awt.Color(45, 118, 232));
        borrowBookButton.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        borrowBookButton.setForeground(new java.awt.Color(255, 255, 255));
        borrowBookButton.setText("Borrow Book");
        borrowBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowBookButtonActionPerformed(evt);
            }
        });
        borrowBookPanel.add(borrowBookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 120, 30));

        borrowBookMsg.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        borrowBookMsg.setForeground(new java.awt.Color(45, 118, 232));
        borrowBookMsg.setText("Select and borrow a book from the list:");
        borrowBookPanel.add(borrowBookMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        borrowTable.setModel(new MyTableModel(
            dataBook,
            new String [] {
                "ISBN", "Author", "Title", "Publication Year"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(borrowTable);

        borrowBookPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 690, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borrowBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 866, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(borrowBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrowBookButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_borrowBookButtonActionPerformed
        Book book = MyTable.getSelectedBook(borrowTable, lib);
        try {
            book.borrowBook();
            showMessageDialog(this, "The book was successfully borrowed!");
            MyTable.clearTable(borrowTable);
            MyTable.loadTable(dataBook, borrowTable, lib, Status.AVAILABLE);
        } catch (BookException ex) {
            showMessageDialog(this, "Can't borrow the book!");
        }
    }//GEN-LAST:event_borrowBookButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        EventQueue.invokeLater(() -> {
            new BorrowBook().setVisible(true);
        });
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel borrowBookBluePanel;
    private javax.swing.JButton borrowBookButton;
    private javax.swing.JLabel borrowBookIcon;
    private javax.swing.JLabel borrowBookLabel;
    private javax.swing.JLabel borrowBookMsg;
    private javax.swing.JPanel borrowBookPanel;
    private javax.swing.JTable borrowTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
