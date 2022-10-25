import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

public class Zgadula extends JFrame{

    private JPanel Panel1;
    private JTextField textField;
    private JButton sprawdzbutton;
    private JLabel wpiszLabel;
    private JLabel zgadnijLabel;

    int liczba;

    public static void main(String[] args){
        Zgadula Example = new Zgadula();
        Example.setVisible(true);
    }

    public Zgadula() {
        super("Zgadywanka");
        this.setContentPane(this.Panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);

        Random generator = new Random();
        int szukana = generator.nextInt(1000)+1;

        sprawdzbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    liczba=Integer.parseInt(textField.getText());
                    if(liczba>szukana) JOptionPane.showMessageDialog(null,"Za duza");
                    else if(liczba<szukana) JOptionPane.showMessageDialog(null,"Za mala");
                else if (szukana==liczba) {JOptionPane.showMessageDialog(null,"Brawo! Zgadles!"); dispose();}

            }
        });
    }
}
