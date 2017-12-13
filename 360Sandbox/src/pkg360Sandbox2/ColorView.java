/**
 * @author reyob
 */
package pkg360Sandbox2;

import java.awt.event.ActionListener;
import javax.swing.*;

public class ColorView extends JFrame {
    private JLabel top = new JLabel("Can you guess my favorite color? . . . . . . . . . . . . \n");
    private JButton blueButton = new JButton("Blue");
    private JButton greenButton = new JButton ("Green");
    private JButton yellowButton = new JButton ("Yellow");
    private JButton redButton= new JButton ("Red");
    private JButton pinkButton= new JButton ("Pink");
    private JButton blackButton= new JButton ("Black");
    private JButton purpleButton= new JButton ("Purple");
    private JLabel bottom = new JLabel("This is how many times you have guessed wrong");
    private JTextField wrongMatches = new JTextField(10);
    private JLabel bottom2 = new JLabel("Will reset to 0 when you guess correctly");
    
    ColorView(){
        //Set up view and add components
        JPanel contPanel = new JPanel();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        
        contPanel.add(top);
        contPanel.add(blueButton);
        contPanel.add(greenButton);
        contPanel.add(yellowButton);
        contPanel.add(redButton);
        contPanel.add(pinkButton);
        contPanel.add(blackButton);
        contPanel.add(purpleButton);
        contPanel.add(bottom);
        contPanel.add(wrongMatches);
        contPanel.add(bottom2);
        
        this.add(contPanel);
        
    }
    
    void addBlueListener(ActionListener listenForBlueButton) {
        blueButton.addActionListener(listenForBlueButton);
    }
    void addGreenListener(ActionListener listenForGreenButton) {
        greenButton.addActionListener(listenForGreenButton);
    }
    void addYellowListener(ActionListener listenForYellowButton) {
        yellowButton.addActionListener(listenForYellowButton);
    }
    void addRedListener(ActionListener listenForRedButton) {
        redButton.addActionListener(listenForRedButton);
    }
    void addPinkListener(ActionListener listenForPinkButton) {
        pinkButton.addActionListener(listenForPinkButton);
    }
    void addBlackListener(ActionListener listenForBlackButton) {
        blackButton.addActionListener(listenForBlackButton);
    }
    void addPurpleListener(ActionListener listenForPurpleButton) {
        purpleButton.addActionListener(listenForPurpleButton);
    }
    public void setWrongMatches(int gu){
        wrongMatches.setText(Integer.toString(gu));
    }
    
}
