package Pertemuan4;

import javax.swing.*;
import java.awt.event.*;

public class KeyListenerExample {
    public static void main(String[] args){
        // Membuat Frame
        JFrame frame = new JFrame("KeyListener Example");

        // Membuat label untuk menampilkan pesan
        JLabel label = new JLabel("Tekan tombol pada keyboard");
        label.setBounds(50,50,300,30);

        //Membuat text field untuk fokus keyboard
        JTextField textField = new JTextField();
        textField.setBounds(50,100,200,30);

        // menambahkan keylistener ke text fiela
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
               label.setText("Key Typed: " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                label.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
            }

            @Override
            public void keyReleased(KeyEvent e) {
                 label.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
            }
        });

        //menambahkan komponen ke frame
        frame.add(label);
        frame.add(textField);

        //setting frame
        frame.setSize(400,200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
