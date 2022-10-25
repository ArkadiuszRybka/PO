import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelToF extends JFrame{
    private JTextField textFieldCel;
    private JButton konwertujButton;
    private JLabel Fahrenheit;
    private JPanel Panel1;
    private JLabel CelLabel;
    double temp, wynik;
    public static void main(String[] args){
        CelToF Example = new CelToF();
        Example.setVisible(true);


    }

    public CelToF(){
        super("Celcjusz To Fahrenheit");
        this.setContentPane(this.Panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);


        konwertujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temp= Double.parseDouble(textFieldCel.getText());
                wynik=temp*9/5+32;
                Fahrenheit.setText("Temperatura w Fahrenheit: " + String.valueOf(wynik));
            }
        });
    }




}
