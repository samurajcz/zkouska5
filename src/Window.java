import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    // menubar
    static JMenuBar menuBar = new JMenuBar();

    static ShopTable shopTable = new ShopTable(400, 500);

    // JMenu
    static JMenu menu;

    // Menu items
    static JMenuItem menuItem1, menuItem2, menuItem3;

    static Integer value = 0;

    //1.konstruktor
    public Window(int width, int height) throws HeadlessException {
        init(width, height);

    }

    private void init(int width, int height) {
        setTitle("Clicker");
        setVisible(true);
        setBackground(Color.white);
        setSize(width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setJMenuBar(menuBar);

        menu = new JMenu("Menu");
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

        JLabel counter = new JLabel(value.toString());
        panel.add(counter);
        JButton button = new JButton("Počítej");
        panel.add(button);
        panel.add(shopTable);


        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                value++;
                counter.setText(value.toString());
                System.out.println(value);
            }
        });
        add(panel);

    }


}
