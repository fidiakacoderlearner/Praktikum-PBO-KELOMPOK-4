/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum8;

import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class Praktikum8 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //memanggil JFrame
        JFrame frame = new JFrame("Contoh JFrame");
        
        //
        frame.setSize(400, 300);
        
        //
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //frame terlihat
        frame.setVisible(true);
        
        //agar muncul ditengah
        frame.setLocationRelativeTo(null);
        
        JLabel label = new JLabel("Contoh Label", SwingConstants.CENTER);
        frame.add(label);
        
        JTextField textField = new JTextField(20);
        frame.add(textField);
        
        JButton button = new JButton("Click Me");
        frame.add(button);
    }
}
