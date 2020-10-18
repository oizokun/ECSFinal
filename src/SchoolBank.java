import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SchoolBank implements ActionListener
{
  JFrame frame = new JFrame("Every Child Supplied");
  JButton computer = new JButton("Computers");
  JButton tablet = new JButton("Tablets");
  JButton pencil = new JButton("Pencils");
  JButton binder = new JButton("Binders");
  Drawing draw = new Drawing();
  int shape = 0;

  public SchoolBank()
  {
    frame.setPreferredSize(new Dimension(400, 300));
    JPanel pane = (JPanel)frame.getContentPane();
    frame.setPreferredSize(new Dimension(400, 300));
    pane.add(draw, "Center");
    JPanel top = new JPanel();
    top.setBackground(Color.pink);
    top.add(computer);
    top.add(pencil);
    top.add(binder);
    top.add(tablet);
    pane.add(top, "North");
    computer.addActionListener(this);
    pencil.addActionListener(this);
    JPanel bottom = new JPanel();
    bottom.setBackground(Color.CYAN);
    bottom.add((new JTextArea("Hi, welcome to Every Child Supplied. Use this app\n"
        + "to find free school supplies that are available near you.\n Click on a school supply to see"
        + "where it is available\n for pickup.")));
    pane.add(bottom, "South");
    frame.setVisible(true);
  }

  public static void main(String[] args)
  {
    new SchoolBank();

  }

  class Drawing extends JComponent
  {
    public void paint(Graphics g)
    {
      if (shape == 1)
      {
        JFrame newFrame = new JFrame("Computers");
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setPreferredSize(new Dimension(400, 300));
        JPanel pane = (JPanel)newFrame.getContentPane();
        newFrame.setPreferredSize(new Dimension(400, 300));
        pane.add(draw, "Center");
        JPanel top = new JPanel();
        top.add(new JTextArea("Within 5 miles ----------\nThere are 15 Lenovo 10s available at Nova High School\n "
            + "There are 20 Lenovo 10s available at Weston High School\n"
            + "There are 15 Lenovo 10s available at North East High School\n\n"
            + "Within 10 miles ----------\nThere are 7 Lenovo 10s available at Freedom High School\n"
            + "There are 17 Lenovo 10s available at Nova High School\n"));
        pane.add(top, "North");
        newFrame.setVisible(true);
      }
      else if (shape == 2)
      {
        g.setColor(Color.green);
        g.drawOval(50, 50, 100, 100);
      }
      else if (shape == 3)
      {
        g.setColor(Color.red);
        g.fillRect(50, 50, 100, 100);
      }
    }
  }

  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == computer)
      shape = 1;
    else if (e.getSource() == pencil)
      shape = 2;
    else
      shape = 3;
    draw.repaint();
  }
}