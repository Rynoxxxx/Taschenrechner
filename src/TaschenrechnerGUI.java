import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class TaschenrechnerGUI {
    private JPanel MainPanel;
    private JTextField textDisplay;
    private JButton malButton;
    private JButton geteiltButton;
    private JButton minusButton;
    private JButton plusButton;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton punktButton;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton ACButton;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton ergebnisButton;
    private JButton min2Button;

    double a, ergebnis, b;
    String zeichen;
    public TaschenrechnerGUI(){

        //----------------------AC-----------------------
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText("");
            }

        });
        //-----------------------Zahlen------------------------

        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textDisplay.setText(textDisplay.getText()+a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textDisplay.setText(textDisplay.getText()+a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textDisplay.setText(textDisplay.getText()+a9Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textDisplay.setText(textDisplay.getText()+a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textDisplay.setText(textDisplay.getText()+a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textDisplay.setText(textDisplay.getText()+a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textDisplay.setText(textDisplay.getText()+a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textDisplay.setText(textDisplay.getText()+a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textDisplay.setText(textDisplay.getText()+a3Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textDisplay.setText(textDisplay.getText()+a0Button.getText());
            }
        });
        //-----------------FunktionsTasten----------------------------
        punktButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              if(!textDisplay.getText().contains("."))
              {
                  textDisplay.setText(textDisplay.getText()+ punktButton.getText());
              }

            }
        });
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //wollte erst so machen: a=textDisplay.getText(); ging aber nicht
                a= Double.parseDouble(textDisplay.getText());
                zeichen="+";
                textDisplay.setText("");
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a= Double.parseDouble(textDisplay.getText());
                zeichen="-";
                textDisplay.setText("");
            }
        });
        malButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a= Double.parseDouble(textDisplay.getText());
                zeichen="*";
                textDisplay.setText("");
            }
        });
        geteiltButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a= Double.parseDouble(textDisplay.getText());
                zeichen="/";
                textDisplay.setText("");
            }
        });
        ergebnisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(textDisplay.getText());
                if (zeichen =="+"){
                    ergebnis = a+b;
                    textDisplay.setText(String.valueOf(ergebnis));
                    a= Double.parseDouble("");
                    b= Double.parseDouble("");
                    zeichen= "";
                }else if (zeichen =="-"){
                    ergebnis = a-b;
                    textDisplay.setText(String.valueOf(ergebnis));
                    a= Double.parseDouble("");
                    b= Double.parseDouble("");
                    zeichen="";
                }else if (zeichen =="*"){
                    ergebnis = a*b;
                    textDisplay.setText(String.valueOf(ergebnis));
                    a= Double.parseDouble("");
                    b= Double.parseDouble("");
                    zeichen= "";
                }else if (zeichen =="/"){
                    if (a == Double.parseDouble("0")){
                        textDisplay.setText("ERROR404 (DIV 0 NOT POSSIBLE");
                    }
                    if (b == Double.parseDouble("0")){
                        textDisplay.setText("ERROR404 (DIV 0 NOT POSSIBLE");
                    }
                    ergebnis = a/b;
                    textDisplay.setText(String.valueOf(ergebnis));
                    a= Double.parseDouble("");
                    b= Double.parseDouble("");
                    zeichen= "";
                }
            }
        });
        //------------minus zahlen button---------------------
        min2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textDisplay.getText().contains("-"))
                {
                    textDisplay.setText("-");
                }
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("TaschenrechnerGUI");
        frame.setContentPane(new TaschenrechnerGUI().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
//gerade noch probleme mit  gleich zeichen, ergebnisse/rechnungen werden übernommen

}
