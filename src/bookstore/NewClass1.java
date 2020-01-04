/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 *
 * @author Shalini
 */
public class NewClass1 {

    public static void main(String[] args) {  
        JFrame f = new JFrame("Progress");
        JProgressBar jp = new JProgressBar(JProgressBar.HORIZONTAL);
        try {
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
//            jp.setStringPainted(true);
            jp.setIndeterminate(true);
            f.add(jp,BorderLayout.NORTH);
            f.setSize(300,200);
            f.setVisible(true);
            NewClass.sendEmail("tripathimayank36@gmail.com");
            jp.setVisible(false);
            f.setVisible(false);
        } catch (Exception ex) {
            jp.setVisible(false);
            f.setVisible(false);
            Logger.getLogger(NewClass1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
