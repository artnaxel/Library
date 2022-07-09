package libraryGUI;

import table.*;
import exception.*;
import main.*;

//IMPORTS FOR GUI
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.TableModel;

public class ManageBooks extends JFrame {

    String[][] dataBook;
    static Library lib = Library.getInstance();
    
    public ManageBooks() {
        initComponents();
        MyTable.loadTable(dataBook, manageTable, lib, Status.AVAILABLE);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBookPanel = new javax.swing.JPanel();
        addBookBluePanel = new javax.swing.JPanel();
        publicationYearTextField = new javax.swing.JTextField();
        authorTextField = new javax.swing.JTextField();
        titleTextField = new javax.swing.JTextField();
        enterTitleLabel = new javax.swing.JLabel();
        enterAuthorLabel = new javax.swing.JLabel();
        enterPublicationYearLabel = new javax.swing.JLabel();
        enterIsbnLabel = new javax.swing.JLabel();
        isbnTextField = new javax.swing.JTextField();
        addBookButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        addBookLabel = new javax.swing.JLabel();
        addBookIcon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        manageTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBookPanel.setBackground(new java.awt.Color(255, 255, 255));
        addBookPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBookBluePanel.setBackground(new java.awt.Color(45, 118, 232));

        publicationYearTextField.setBackground(new java.awt.Color(45, 118, 232));
        publicationYearTextField.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        publicationYearTextField.setForeground(new java.awt.Color(255, 255, 255));
        publicationYearTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        publicationYearTextField.setCaretColor(new java.awt.Color(255, 255, 255));

        authorTextField.setBackground(new java.awt.Color(45, 118, 232));
        authorTextField.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        authorTextField.setForeground(new java.awt.Color(255, 255, 255));
        authorTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        authorTextField.setCaretColor(new java.awt.Color(255, 255, 255));

        titleTextField.setBackground(new java.awt.Color(45, 118, 232));
        titleTextField.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        titleTextField.setForeground(new java.awt.Color(255, 255, 255));
        titleTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        titleTextField.setCaretColor(new java.awt.Color(255, 255, 255));

        enterTitleLabel.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        enterTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterTitleLabel.setText("Enter Title:");

        enterAuthorLabel.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        enterAuthorLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterAuthorLabel.setText("Enter Author:");

        enterPublicationYearLabel.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        enterPublicationYearLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterPublicationYearLabel.setText("Enter Publication Year:");

        enterIsbnLabel.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        enterIsbnLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterIsbnLabel.setText("Enter ISBN:");

        isbnTextField.setBackground(new java.awt.Color(45, 118, 232));
        isbnTextField.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        isbnTextField.setForeground(new java.awt.Color(255, 255, 255));
        isbnTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        isbnTextField.setCaretColor(new java.awt.Color(255, 255, 255));

        addBookButton.setBackground(new java.awt.Color(45, 118, 232));
        addBookButton.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        addBookButton.setForeground(new java.awt.Color(255, 255, 255));
        addBookButton.setText("Add Book");
        addBookButton.setToolTipText("");
        addBookButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        addBookButton.setOpaque(true);
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addBookBluePanelLayout = new javax.swing.GroupLayout(addBookBluePanel);
        addBookBluePanel.setLayout(addBookBluePanelLayout);
        addBookBluePanelLayout.setHorizontalGroup(
            addBookBluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookBluePanelLayout.createSequentialGroup()
                .addGroup(addBookBluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBookBluePanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(addBookBluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(authorTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(enterAuthorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(enterPublicationYearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(publicationYearTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(enterIsbnLabel)
                            .addComponent(isbnTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
                    .addGroup(addBookBluePanelLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(addBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        addBookBluePanelLayout.setVerticalGroup(
            addBookBluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookBluePanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(enterIsbnLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isbnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(enterAuthorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(authorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(enterTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(enterPublicationYearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(publicationYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(addBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        addBookPanel.add(addBookBluePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 490));

        updateButton.setBackground(new java.awt.Color(45, 118, 232));
        updateButton.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
        });
        addBookPanel.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, -1, -1));

        deleteButton.setBackground(new java.awt.Color(45, 118, 232));
        deleteButton.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });
        addBookPanel.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, -1));

        addBookLabel.setBackground(new java.awt.Color(255, 255, 255));
        addBookLabel.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        addBookLabel.setForeground(new java.awt.Color(45, 118, 232));
        addBookLabel.setText("Manage Books");
        addBookPanel.add(addBookLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 180, -1));

        addBookIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryGUI/images/icons8-book-50-blue.png"))); // NOI18N
        addBookPanel.add(addBookIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 61, 61));

        manageTable.setModel(new MyTableModel(
            dataBook,
            new String [] {
                "ISBN", "Author", "Title", "Year"
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
        manageTable.setOpaque(false);
        manageTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        manageTable.setShowGrid(true);
        manageTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(manageTable);

        addBookPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 460, 220));

        getContentPane().add(addBookPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBookButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        if (Validation.areFieldsEmpty(isbnTextField.getText(), titleTextField.getText(), authorTextField.getText(), publicationYearTextField.getText())){
            showMessageDialog(this, "Fields cannot be empty!");
        }
        else{
            try{              
                if (Validation.validatePublicationYear(publicationYearTextField.getText())){
                    if(Validation.validateIsbn(isbnTextField.getText(), lib)){
                        if(Validation.validateAuthor( authorTextField.getText()) && Validation.validateTitle(titleTextField.getText())){
                            Book b = new Book(titleTextField.getText(), authorTextField.getText(), publicationYearTextField.getText(), isbnTextField.getText());
                            lib.addBook(b);
                            MyTable.clearTable(manageTable);
                            MyTable.loadTable(dataBook, manageTable, lib, Status.AVAILABLE);
                            showMessageDialog(this, "The book has been succesfully added!");
                        }
                        else{
                            showMessageDialog(this, "Author name or title is too long!");
                        }
                    }
                    else{
                        showMessageDialog(this, "The book with that ISBN already exists or it isn't numeric!");
                    }
                }
                else{
                    showMessageDialog(this, "You've entered a future date!");
                    
                }
            }
            catch(NumberFormatException e){
                showMessageDialog(this, "Wrong format of publication year");
            }
            
        }
    }//GEN-LAST:event_addBookButtonActionPerformed

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        try {
            int row = manageTable.getSelectedRow();
            if(row == -1 ){
                showMessageDialog(this, "Please select the row!");
            } else {
                if (Validation.areFieldsEmpty(isbnTextField.getText(), titleTextField.getText(), authorTextField.getText(), publicationYearTextField.getText())){
                    showMessageDialog(this, "Fields cannot be empty!");
                }
                else{
                    if(Validation.validateIsbn(isbnTextField.getText(), lib)){
                        Book book = lib.getCollection().get(row);
                        book.setIsbn(isbnTextField.getText());
                        book.setTitle(titleTextField.getText());
                        book.setAuthor(authorTextField.getText());
                        book.setPublicationYear(publicationYearTextField.getText());
                        MyTable.clearTable(manageTable);
                        MyTable.loadTable(dataBook, manageTable, lib, Status.AVAILABLE);
                    }
                    else{
                        showMessageDialog(this, "The book with that ISBN already exists!");
                    }
                }
            }
        }
        catch(BookExceptionPublicationYear ex){
            showMessageDialog(this, ex.getMessage());
        }
        catch (BookException ex) {
            showMessageDialog(this, ex.getMessage());
        }
        
    }//GEN-LAST:event_updateButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        int row = manageTable.getSelectedRow();
        if(row == -1 ){
            showMessageDialog(this, "Please select the row!");
        }
        else{
            Book b = lib.getCollection().get(row);
            lib.removeBook(b);
            MyTable.clearTable(manageTable);
            MyTable.loadTable(dataBook, manageTable, lib, Status.AVAILABLE);
        }
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void manageTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageTableMouseClicked
       
        int rowNo = manageTable.getSelectedRow();
        TableModel model = manageTable.getModel();
        
        isbnTextField.setText(model.getValueAt(rowNo, 0).toString());
        authorTextField.setText(model.getValueAt(rowNo, 1).toString());
        titleTextField.setText(model.getValueAt(rowNo, 2).toString());
        publicationYearTextField.setText(model.getValueAt(rowNo, 3).toString());
    }//GEN-LAST:event_manageTableMouseClicked
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        EventQueue.invokeLater(() -> {
            new ManageBooks().setVisible(true);
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addBookBluePanel;
    private javax.swing.JButton addBookButton;
    private javax.swing.JLabel addBookIcon;
    private javax.swing.JLabel addBookLabel;
    private javax.swing.JPanel addBookPanel;
    private javax.swing.JTextField authorTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel enterAuthorLabel;
    private javax.swing.JLabel enterIsbnLabel;
    private javax.swing.JLabel enterPublicationYearLabel;
    private javax.swing.JLabel enterTitleLabel;
    private javax.swing.JTextField isbnTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable manageTable;
    private javax.swing.JTextField publicationYearTextField;
    private javax.swing.JTextField titleTextField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

   
}
