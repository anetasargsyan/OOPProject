import javax.swing.*;
import java.awt.*;

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
        list.setModel(insectsModel);
        insectsModel.addElement(new Bee("fly", "someone", 4, 4, true, "No facts"));
        insectsModel.addElement(new Ant("walk", "someone", 4, 4, true, "No facts"));
        insectsModel.addElement(new Bee("fly", "someone", 4, 4, true, "No facts"));
    }

    private void add(){

    }

    private void remove(Insect i){

    }
}
