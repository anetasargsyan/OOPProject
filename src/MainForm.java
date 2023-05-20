import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private JButton remove;
    private JPanel mainPanel;
    private JButton add;
    private JList list;
    private JLabel mainLabel;

    private DefaultListModel insectsModel;
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public MainForm(){
        setEnabled(true);
    }
    public MainForm(Encyclopedia enc){
        insectsModel = new DefaultListModel();
        setSize(new Dimension(500, 500));
        setContentPane(mainPanel);
        setVisible(true);

        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                list.remove(list.getSelectedIndex());
            }
        });

        list.setModel(insectsModel);
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                if(list.getSelectedIndex() == -1){
                    remove.setEnabled(false);
                }
                else {
                    remove.setEnabled(true);
                }
            }
        });
        insectsModel.addElement(new Bee("fly", "someone", 4, 4, true, "No facts"));
        insectsModel.addElement(new Ant("walk", "someone", 4, 4, true, "No facts"));
        insectsModel.addElement(new Bee("fly", "someone", 4, 4, true, "No facts"));
    }


}
