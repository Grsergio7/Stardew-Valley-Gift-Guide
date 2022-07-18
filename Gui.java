import javax.swing.*;
import java.awt.event.*;
import java.util.Locale;
public class Gui {
    JFrame f;

    public Gui Frame() {
        f = new JFrame("Stardew Valley Gift Guide");

        JLabel label = new JLabel("Enter the name of a Villager");
        label.setBounds(10,10,200, 40);
        JButton b = new JButton("Submit");
        b.setBounds(110, 50, 60, 40);
        JTextField tf = new JTextField();
        tf.setBounds(10,50, 100,40);
        JTextArea ta=new JTextArea();
        ta.setBounds(10,100, 680,200);
        ta.setEditable(false);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String text = tf.getText();
                String name = new Villager().villager(text.toLowerCase(Locale.ROOT));
                ta.setText(name);
                tf.setText("");

            }
        });
        f.add(tf);f.add(b);f.add(ta);f.add(label);
        f.setSize(700, 400);
        f.setLayout(null);
        f.setVisible(true);


        return null;
    }

}
