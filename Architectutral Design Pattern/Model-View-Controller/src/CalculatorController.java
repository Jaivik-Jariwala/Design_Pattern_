import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theModel;
    public CalculatorController(CalculatorView theView,CalculatorModel
            theModel)
    {
        this.theView=theView;
        this.theModel=theModel;
        this.theView.addCAlculationListener(new Calculatelistener());
    }
    class Calculatelistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int fnum, snum = 0;
            try {
                fnum = theView.getFirstNumber();
                snum = theView.getSecondNumber();
                theModel.addTwoNumbers(fnum, snum);
                theView.setCalcSolution(theModel.getCalculationValue());
            } catch (NumberFormatException e1) {
                theView.displayErrorMessage("you need to enter 2 integers");
            }
        }
    }
}
