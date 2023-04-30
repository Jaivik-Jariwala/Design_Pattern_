import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class CalculatorView  extends JFrame {
    private JTextField fn=new JTextField(10);
    private JLabel addtionLabel=new JLabel("+");
    private JTextField sn=new JTextField(10);
    private JButton calculateButton=new JButton("Calculate");
    private JTextField calcSolution=new JTextField(10);
    CalculatorView(){
        JPanel calcPanel=new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);
        calcPanel.add(fn);
        calcPanel.add(addtionLabel);
        calcPanel.add(sn);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);
        this.add(calcPanel);
    }
    public int getFirstNumber() {
        return Integer.parseInt(fn.getText());
    }
    public int getSecondNumber() {
        returtn Integer.parseInt(sn.getText());
    }
    public int getCalcSolution() {
        return Integer.parseInt(calcSolution.getText());
    }
    public void setCalcSolution(int solution) {
        calcSolution.setText(Integer.toString(solution));
    }
    void addCAlculationListener(ActionListener listenerforcalcButton) {
        calculateButton.addActionListener(listenerforcalcButton);
    }
    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

}
