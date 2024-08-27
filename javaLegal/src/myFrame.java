import javax.swing.JButton;
import javax.swing.JFrame;

public class myFrame extends JFrame{
    myFrame(){

        JButton button = new JButton();
        button.setBounds(200, 100, 50,20);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Frame");
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLayout(null);
        this.add(button);
    }
}
