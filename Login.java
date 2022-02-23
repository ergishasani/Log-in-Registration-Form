import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login implements ActionListener, java.awt.event.ActionListener {
    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(600, 455);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        panel.setLayout(null);

        JLabel label = new JLabel("UserName");
        label.setBounds(10, 20, 80, 25);
        panel.add(label);
        JTextField userText = new JTextField(20);
        userText.setBounds(10, 50, 210, 25);
        panel.add(userText);
        JLabel passwordJLabel = new JLabel("Password");
        passwordJLabel.setBounds(10, 70, 160, 50);
        panel.add(passwordJLabel);
        JPasswordField userpasField = new JPasswordField(20);
        userpasField.setBounds(10, 110, 210, 25);
        panel.add(userpasField);

        JButton button = new JButton("Log in");
        button.setBounds(10, 150, 80, 25);
        panel.add(button);

        JLabel success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        JButton button1 = new JButton("Registration");
        button1.setBounds(110, 150, 110, 25);
        panel.add(button1);

        JLabel emri = new JLabel("Emri");
        emri.setBounds(300, 20, 80, 25);
        panel.add(emri);

        JTextField emri1 = new JTextField(20);
        emri1.setBounds(300, 50, 210, 25);
        panel.add(emri1);

        JLabel mbiemri = new JLabel("Mbiemri");
        mbiemri.setBounds(300, 65, 160, 50);
        panel.add(mbiemri);

        JTextField mbiemri1 = new JTextField(20);
        mbiemri1.setBounds(300, 110, 210, 25);
        panel.add(mbiemri1);

        JLabel email = new JLabel("Email");
        email.setBounds(300, 140, 240, 25);
        panel.add(email);

        JTextField email1 = new JTextField(20);
        email1.setBounds(300, 170, 210, 25);
        panel.add(email1);

        JLabel Dtl = new JLabel("Datlindja");
        Dtl.setBounds(300, 200, 240, 25);
        panel.add(Dtl);

        JTextField Dtl1 = new JTextField(20);
        Dtl1.setBounds(300, 230, 210, 25);
        panel.add(Dtl1);

        JLabel pass = new JLabel("Password");
        pass.setBounds(300, 260, 210, 25);
        panel.add(pass);

        JPasswordField pass1 = new JPasswordField(20);
        pass1.setBounds(300, 290, 210, 25);
        panel.add(pass1);

        JLabel pass2 = new JLabel("Password Confirmation");
        pass2.setBounds(300, 320, 210, 25);
        panel.add(pass2);

        JPasswordField pass3 = new JPasswordField(20);
        pass3.setBounds(300, 350, 210, 25);
        panel.add(pass3);

        JButton confirmatioButton = new JButton("Confirm");
        confirmatioButton.setBounds(310, 390, 190, 25);
        confirmatioButton.addActionListener(new Login());
        panel.add(confirmatioButton);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // if (input.pass1 == input.pass3){

        // }
        JOptionPane.showMessageDialog(null, "Bravo");
    }
}