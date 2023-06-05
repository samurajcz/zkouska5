import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class ShopTable extends JTable {
    private ArrayList<String> arrayList = new ArrayList<>();

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public void addToList(String value) {
        System.out.println("přidáno do listu: " + value);
        this.arrayList.add(value);
        updateModel();
    }

    public void removeFromList(int index) {
        this.arrayList.remove(index);
        updateModel();
    }
    public int listSize() {
        return this.arrayList.size();
    }

    public ShopTable() {
        init();
    }

    private void init() {
        setBackground(Color.red);

        // Define the column names
        String[] columnNames = {"Column 1", "Column 2", "Column 3"};

        // Create an empty data array with the same length as column names
        Object[][] data = new Object[0][columnNames.length];

        // Create a DefaultTableModel with the data and column names
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Set the model for the table
        setModel(model);
    }

    private void updateModel() {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.setRowCount(0); // Clear the existing data

        // Iterate over the ArrayList and add each item as a row to the model
        for (String item : arrayList) {
            model.addRow(new Object[]{item, "", ""}); // You can modify the column values as needed
        }
    }
}
