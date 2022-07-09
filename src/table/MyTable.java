package table;

import javax.swing.JTable;
import main.*;

public class MyTable extends JTable{
     public static void loadTable(String[][] dataBook, JTable table, Library lib, Status status){
        dataBook = lib.toStringVector();
        for (int i = 0; i < dataBook.length; i++){
            if(lib.getCollection().get(i).getStatus() == status )
                ((MyTableModel)table.getModel()).addRow(dataBook[i]);
        }
    }
     public static void clearTable(JTable table){
        MyTableModel model =  (MyTableModel) table.getModel();
        model.setRowCount(0);
    }
    public static Book getSelectedBook(JTable table, Library lib) {
       String isbn = (String) table.getValueAt(table.getSelectedRow(), 0);
       for (int i = 0; i < lib.getCollection().size(); i++){
           if (lib.getBook(i).getIsbn() == null ? isbn == null : lib.getBook(i).getIsbn().equals(isbn)){
               return lib.getBook(i);
           }
       }
         return null;
    }
    
}
