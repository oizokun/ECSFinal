
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class ECS implements ActionListener {
  JTextPane textPane;
  JTextField textAreaThree;
  JTextField textAreaTwo;
  JTextField textAreaOne;
  JPanel panel;
  JLabel school;
    public ECS() {
      JFrame frame = new JFrame("Every Child Supplied ~ Donation Application");

      panel = new JPanel();
      frame.setSize(500, 500);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.add(panel);

      panel.setLayout(null);

      JLabel donorLabel = new JLabel("Donor Name: ");
      donorLabel.setBounds(20, 20, 130, 25);
      panel.add(donorLabel);

      textAreaOne = new JTextField(20);
      textAreaOne.setBounds(130, 20, 200, 25);
      panel.add(textAreaOne);

      JLabel donorNumLabel = new JLabel("Phone Number: ");
      donorNumLabel.setBounds(20, 50, 130, 25);
      panel.add(donorNumLabel);

      textAreaTwo = new JTextField(20);
      textAreaTwo.setBounds(130, 50, 200, 25);
      panel.add(textAreaTwo);

      JLabel donorAddyLabel = new JLabel("Address: ");
      donorAddyLabel.setBounds(20, 80, 130, 25);
      panel.add(donorAddyLabel);

      textAreaThree = new JTextField(20);
      textAreaThree.setBounds(130, 80, 200, 25);
      panel.add(textAreaThree);

      JLabel donorSupLabel = new JLabel("Supplies: ");
      donorSupLabel.setBounds(20, 110, 130, 25);
      panel.add(donorSupLabel);

      textPane = new JTextPane();
      textPane.setBounds(135, 110, 190, 100);
      panel.add(textPane);

      JButton submitButton = new JButton("Submit");
      submitButton.setBounds(20, 10, 100, 25);
      frame.getContentPane().add(BorderLayout.SOUTH, submitButton);
      panel.setBackground(Color.PINK);

      school = new JLabel("");
      school.setBounds(20, 300, 600, 25);
      panel.add(school);

      submitButton.addActionListener(this);
    }

    public static void main(String[] args) {
      new ECS();

      }


  @Override
  public void actionPerformed(ActionEvent e) {
      textPane.setText("");
      textAreaOne.setText("");
      textAreaTwo.setText("");
      textAreaThree.setText("");
      school.setText("Your request has been confirmed, please go to Chapel Hill High School");

  }
}




