/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum9;
import javax.swing.*;
import javax.swing.table.*;
/**
 *
 * @author ASUS
 */
public class Praktikum9 {
    
    public static void main(String[] args){
    
        String[] buah = {"Apel", "Jeruk", "Mangga", "Pisang", "Anggur"};
        
        JComboBox<String> comboBox = new JComboBox<>(buah);
    
        JLabel label = new JLabel("Pilih buah favorit Anda");
        
        comboBox.addActionListener(e -> {
            String selected = (String) comboBox.getSelectedItem();
            label.setText("Anda Memilih: " + selected);
        });
        
        JCheckBox checkbox1 = new JCheckBox("CheckBox 1");
        
        JRadioButton rbPria = new JRadioButton("Pria");
        JRadioButton rbWanita = new JRadioButton("Wanita");
        
        ButtonGroup group = new ButtonGroup();
        group.add(rbPria);
        group.add(rbWanita);
        
        JPanel headerPanel = new JPanel();
        
        String[] columnNames = {"NIM", "Nama", "Jurusan", "IPK"};
        
        Object[][] data = {
            {"101", "Andi Wijaya", "Informatika", 3.75},
            {"102", "Budi Santoso", "Sistem Informasi", 3.50},
            {"103", "Citra Dewi", "Teknik Komputer", 3.85},
            {"104", "Dedi Kurniawan", "Informatika", 3.60},
            {"105", "Eka Putri", "Sistem Informasi", 3.75}
        };
        
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        
        JTable table = new JTable(model);
    }
    
    
}
