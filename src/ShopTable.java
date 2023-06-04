import javax.swing.*;
import java.awt.*;

public class ShopTable extends JTable {

    // Todo: Potřebuju zobrazit tabulku pod tlačítkem + aby zobrazovala columnNames a data

    String[] columnNames = {"Name", "Roll Number", "Department"};
    String[][] data = {
            {"Kundan Kumar Jha", "4031", "CSE"},
            {"Anand Jha", "6014", "IT"}
    };

    public ShopTable(int width, int height) {
        init(width, height);

    }

    private void init(int width, int height) {

        setBackground(Color.red);
        this.setSize(width, height);
        System.out.println("Funguje!");
        JFrame frame = new JFrame("Nvm něco");
        JScrollPane scrollPane = new JScrollPane(Window.shopTable);
        frame.getContentPane().add(scrollPane);

    }

}
