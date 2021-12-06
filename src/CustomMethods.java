
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class CustomMethods {

    public static void makeDark(JTable t, JScrollPane p) {
        DefaultTableCellRenderer MyHeaderRender = new DefaultTableCellRenderer();
        MyHeaderRender.setBackground(Color.decode("#191919"));
        MyHeaderRender.setForeground(Color.decode("#ffffff"));

        for (int i = 0; i < t.getColumnCount(); i++) {
            t.getTableHeader().getColumnModel().getColumn(i).setHeaderRenderer(MyHeaderRender);
        }

        p.setBackground(new Color(0, 0, 0, 0));
        p.setOpaque(false);
        p.getViewport().setOpaque(false);
    }

}
