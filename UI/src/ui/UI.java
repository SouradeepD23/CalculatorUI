/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class UI {
    UI(){
        JFrame jfrm = new JFrame("Dynamic");
        jfrm.setSize(500, 200);
        jfrm.setVisible(true);
        jfrm.setLayout(new FlowLayout());
        
        JButton btn = new JButton("Click");
        
        btn.addActionListener(
            new ActionListener() {
                @Override
                   public void actionPerformed(ActionEvent e) {
                       JOptionPane.showMessageDialog(null, "Hello");
                   }
            }
        );
        
        
        
        btn.setSize(50, 30);
        jfrm.add(btn);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new UI();
            }
        }); 
    }
    
}
