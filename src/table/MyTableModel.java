package table;

import javax.swing.table.DefaultTableModel;

public class MyTableModel extends DefaultTableModel{
 
    public MyTableModel(String data[][], String[] columns){
        super(data, columns);
    }

    @Override
    public boolean isCellEditable(int row, int column){
        return false;
    }  
}
