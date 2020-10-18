import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Donations implements ActionListener {

  private static JLabel name;
  private static JLabel phoneNum;
  private static JLabel address;
  private static JLabel supplies;
  private static JTextField receiverText;
  private static JTextField phoneNumText;
  private static JTextField addressText;
  private static JTextField suppliesText;
  private static JLabel success;
  private static JButton button;


  public static void main(String[] args) {

    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    frame.setSize(100, 100);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.add(panel);

    panel.setLayout(null);

    name = new JLabel("Receiver Name:");
    name.setBounds(10, 20, 140, 25);
    panel.add(name);
    receiverText = new JTextField(20);
    receiverText.setBounds(150, 20, 165, 25);
    panel.add(receiverText);

    phoneNum = new JLabel("Phone Number:");
    phoneNum.setBounds(10, 50, 140, 25);
    panel.add(phoneNum);
    phoneNumText = new JTextField(20);
    phoneNumText.setBounds(150, 50, 165, 25);
    panel.add(phoneNumText);

    address = new JLabel("School:");
    address.setBounds(10, 80, 140, 25);
    panel.add(address);
    addressText = new JTextField(20);
    addressText.setBounds(150, 80, 165, 25);
    panel.add(addressText);

    supplies = new JLabel("Supplies Needed:");
    supplies.setBounds(10, 110, 140, 25);
    panel.add(supplies);
    suppliesText = new JTextField(20);
    suppliesText.setBounds(150, 110, 165, 25);
    panel.add(suppliesText);

    button = new JButton("Find Supplies");
    button.setBounds(10, 140, 140, 25);
    button.addActionListener(new Donations());
    panel.add(button);

    success = new JLabel("");
    success.setBounds(10, 170, 300, 25);
    panel.add(success);

    frame.setVisible(true);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String a = name.getText();
    String b = phoneNum.getText();
    String c = address.getText();
    String d = supplies.getText();

    if((a != null) && (b != null) && (c != null) && (d != null)) {
      success.setText("Searching for supplies...");
    }
  }
}
