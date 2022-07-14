package ana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

import javax.swing.*;

import java.util.ConcurrentModificationException;

public class hoa {

    static JLabel jlabel= new JLabel();


    public static void main(String[] args) {
        int randomNum = ThreadLocalRandom.current().nextInt(79, 88 + 1);


openUI();


    }
 public static void openUI(){
        JFrame jframe = new JFrame("Ratmaschine");
jframe.setSize(800, 400);
jframe.setLocation(100,150 );
jframe.setDefaultCloseOperation(jframe.getDefaultCloseOperation());


jlabel.setText("Geben Sie ein Zahl");

jlabel.setBounds(50, 50, 200, 30);

JTextField jtextfiled= new JTextField();
jtextfiled.setBounds(50, 100, 200, 30);

JButton jbutton = new JButton("Rat mal");
jbutton.setBounds(50, 150, 200, 30);
jbutton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String textfromtextfiled= jtextfiled.getText();
        int zahl_vontextumwandeln= Integer.parseInt(textfromtextfiled); //um ein Zahl in ein Textfiel
         Randum(zahl_vontextumwandeln);
    }
});

// nicht jtextfiled.setVisible();
jframe.add(jbutton);
jframe.add(jtextfiled);
jframe.add(jlabel);
jframe.setLayout(null); // um jede Zeile zu beenden

jframe.setVisible(true);   // bitte zeigen sie im Bildschirm
 }

 //111111111111111111111111111111111111111111111111111111111111111111
    public static void Randum(int ratenzahl){
        int max= 3, min=0;
        Random random = new Random();

        int zahl= random.nextInt(max+min)+min;

        System.out.print("   ");
        if (zahl==ratenzahl) {
            jlabel.setText("Du hast richtig geraten");
           // System.out.print("Du hast richtig geraten" );

        }
        else
            jlabel.setText("Du hast False geraten");
            //System.out.print("Du hast False geraten" );
    }}