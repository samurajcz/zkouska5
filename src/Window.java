import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    // menubar
    static JMenuBar menuBar = new JMenuBar();

    static ShopTable shopTable = new ShopTable();

    // JMenu
    static JMenu menu = new JMenu("Menu");

    // Menu items
    static JMenuItem menuItem1, menuItem2, menuItem3;

    static Integer value = 0;

    //1.konstruktor
    public Window(int width, int height) throws HeadlessException {
        init(width, height);

    }

    // 2. Funkce
    private void init(int width, int height) {
        setTitle("Clicker");
        setVisible(true);
        setBackground(Color.white);
        setSize(width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setJMenuBar(menuBar);


        menuItem1 = new JMenuItem("MenuItem1");
        menuItem2 = new JMenuItem("MenuItem2");
        menuItem3 = new JMenuItem("MenuItem3");
        // add menu to menu bar
        menuBar.add(menu);
        // add menuitem into menu
        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);
        // add menubar to frame
        setJMenuBar(menuBar);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JTextField textField = new JTextField();
        panel.add(textField);
        textField.setMaximumSize(
                new Dimension(150, 40));
        JLabel counter = new JLabel(value.toString());
        panel.add(counter);
        JButton button = new JButton("Počítej");
        panel.add(button);
        JButton odstran = new JButton("Znič");
        panel.add(odstran);
        panel.add(new JScrollPane(shopTable));
        button.addActionListener(e -> {
            System.out.println(textField.getText());
            shopTable.addToList(textField.getText());
            value++;
            counter.setText(value.toString());
            System.out.println(value);
        });

        odstran.addActionListener(e -> {
            if (shopTable.listSize() > 0) {
                shopTable.removeFromList(0);
            } else {
                System.out.println("nelze odstranit elemnt protože seznam je prázdný");
            }
        });

        add(panel);

    }


}
