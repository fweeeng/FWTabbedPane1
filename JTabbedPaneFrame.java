import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class JTabbedPaneFrame extends JFrame
{
  public JTabbedPaneFrame()
  {
    super("Fiona's JTabbedPane Demo");

    //create the tabbed pane, holds tab formatting
    JTabbedPane tabPane = new JTabbedPane();

    //add first tab
    JLabel label1 = new JLabel("This is the big area called panel one", SwingConstants.CENTER);
    JPanel panel1 = new JPanel();
    panel1.add(label1);
    tabPane.addTab("Tab One", null, panel1, "FirstPanel");

    //add second tab
    JLabel label2 = new JLabel("Other stuff...", SwingConstants.CENTER);
    JPanel panel2 = new JPanel();
    panel2.add(label2);
    tabPane.addTab("Tab Two", null, panel2, "SecondPanel");

    

    //keep this at the bottom
    add(tabPane);

  }//end default and only constructor
}//end class