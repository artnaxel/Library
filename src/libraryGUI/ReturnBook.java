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

public class ReturnBook extends JFrame {

    private String[][] dataBook;
    public ReturnBook() {
        initComponents();
        MyTable.loadTable(dataBook, returnTable, lib, Status.UNAVAILABLE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        returnBookPanel = new javax.swing.JPanel();
        returnBookBluePanel = new javax.swing.JPanel();
        returnBookLabel = new javax.swing.JLabel();
        returnBookIcon = new javax.swing.JLabel();
        returnBookButton = new javax.swing.JButton();
        returnBookMsg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        returnTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        returnBookPanel.setBackground(new java.awt.Color(255, 255, 255));
        returnBookPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        returnBookBluePanel.setBackground(new java.awt.Color(45, 118, 232));

        returnBookLabel.setBackground(new java.awt.Color(255, 255, 255));
        returnBookLabel.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        returnBookLabel.setForeground(new java.awt.Color(255, 255, 255));
        returnBookLabel.setText("Return Book");

        returnBookIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryGUI/images/icons8-return-book-50 (1).png"))); // NOI18N

        javax.swing.GroupLayout returnBookBluePanelLayout = new javax.swing.GroupLayout(returnBookBluePanel);
        returnBookBluePanel.setLayout(returnBookBluePanelLayout);
        returnBookBluePanelLayout.setHorizontalGroup(
            returnBookBluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnBookBluePanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(returnBookIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(569, Short.MAX_VALUE))
        );
        returnBookBluePanelLayout.setVerticalGroup(
            returnBookBluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnBookBluePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(returnBookBluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnBookIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, returnBookBluePanelLayout.createSequentialGroup()
                        .addComponent(returnBookLabel)
                        .addGap(9, 9, 9)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        returnBookPanel.add(returnBookBluePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 100));

        returnBookButton.setBackground(new java.awt.Color(45, 118, 232));
        returnBookButton.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        returnBookButton.setForeground(new java.awt.Color(255, 255, 255));
        returnBookButton.setText("Return Book");
        returnBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBookButtonActionPerformed(evt);
            }
        });
        returnBookPanel.add(returnBookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 120, 30));

        returnBookMsg.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        returnBookMsg.setForeground(new java.awt.Color(45, 118, 232));
        returnBookMsg.setText("Select and return a book from the list:");
        returnBookPanel.add(returnBookMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        returnTable.setModel(new MyTableModel(
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
        jScrollPane1.setViewportView(returnTable);

        returnBookPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 690, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(returnBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 866, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(returnBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnBookButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_returnBookButtonActionPerformed
         Book book = MyTable.getSelectedBook(returnTable, lib);
        try {
            book.returnBook();
            showMessageDialog(this, "The book was successfully returned! The fine is: " + book.getBookFine());
            MyTable.clearTable(returnTable);
            MyTable.loadTable(dataBook, returnTable, lib, Status.UNAVAILABLE);
        } catch (BookException ex) {
            showMessageDialog(this, "Can't return the book!");
        }
        
    }//GEN-LAST:event_returnBookButtonActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        EventQueue.invokeLater(() -> {
            new ReturnBook().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel returnBookBluePanel;
    private javax.swing.JButton returnBookButton;
    private javax.swing.JLabel returnBookIcon;
    private javax.swing.JLabel returnBookLabel;
    private javax.swing.JLabel returnBookMsg;
    private javax.swing.JPanel returnBookPanel;
    private javax.swing.JTable returnTable;
    // End of variables declaration//GEN-END:variables
}
