package Pertemuan3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class HelloBorderLayout extends JFrame {

    public HelloBorderLayout(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelPertanyaan = new JLabel("Apakah ibukota Indonesia?");
        JLabel labelHasil = new JLabel("Jawab Pertanyaan Di atas");

        JButton buttonA = new JButton("Jakarta");
        JButton buttonB = new JButton("Bandung");
        JButton buttonC = new JButton("Surabaya");

        buttonA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelHasil.setText("Jawaban Anda Benar");
            }
        });

        buttonB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelHasil.setText("Jawaban Anda Salah");
            }
        });

        buttonC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelHasil.setText("Jawban Anda Salah");
            }
        });

        this.add(labelPertanyaan, BorderLayout.NORTH);
        this.add(labelHasil, BorderLayout.SOUTH);
        this.add(buttonA, BorderLayout.WEST);
        this.add(buttonB, BorderLayout.CENTER);
        this.add(buttonC,BorderLayout.EAST);

        this.setSize(400,200);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                HelloBorderLayout h = new HelloBorderLayout();
                h.setVisible(true);
            }
        });
    }
}
