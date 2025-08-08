import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TableExample {
    public static void main(String[] args) {
        String[] columnNames = {"ID", "Name"};
        Object[][] data = {{1, "John"}, {2, "Doe"}};
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        JFrame frame = new JFrame();
        frame.add(new JScrollPane(table));
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
