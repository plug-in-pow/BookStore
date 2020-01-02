/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shalini
 */
public class NewClass1 {

    public static void main(String[] args) {
        try {
            NewClass.sendEmail("skyingblog.com@gmail.com");
        } catch (Exception ex) {
            Logger.getLogger(NewClass1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
