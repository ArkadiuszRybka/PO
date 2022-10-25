import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab1 extends JFrame{
    private JPanel Panel1;
    private JButton OKButton;
    private JButton roznicaButton;
    private JLabel LabelA;
    private JLabel LabelB;
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JButton sumaButton;
    private JLabel WynikLabel;
    private JLabel DataLabel;
    String imie="Arek";

    double LiczbaA, LiczbaB, wynik;
    //I SPOSOB
    public static void main(String[] args){
        Lab1 Example1 = new Lab1();
        Example1.setVisible(true);

    }
    public Lab1(){
        super("Moja pierwsza aplikacja");
        this.setContentPane(this.Panel1); //wyswietlamoe ma ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);


        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LiczbaA = Double.parseDouble(textFieldA.getText());
                LiczbaB = Double.parseDouble(textFieldB.getText());
                wynik = LiczbaA + LiczbaB;
                WynikLabel.setText("Suma " + String.valueOf(LiczbaA) + " + " + String.valueOf(LiczbaB) + " = " + String.valueOf(wynik));
            }
        });
        roznicaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LiczbaA = Double.parseDouble(textFieldA.getText());
                LiczbaB = Double.parseDouble(textFieldB.getText());
                wynik = LiczbaA - LiczbaB;
                //if(wynik<0) {dispose(); JOptionPane.showMessageDialog(null, "liczba ujemna");}
                WynikLabel.setText("Roznica " + String.valueOf(LiczbaA) + " - " + String.valueOf(LiczbaB) + " = " + String.valueOf(wynik));
            }
        });
    }

    //II SPOSOB
    /*public static void main(String[] args){
        Lab1 Example1=new Lab1();
    }

    public Lab1(){
        JFrame frame = new JFrame("Moja pierwsza aplikacja");
        frame.setContentPane(this.Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400,300);
    } */


}
