package Pertemuan4;

import javax.swing.*;
import java.awt.event.*;

public class WindowListenerExample {
    public static void main(String[] args) {
        //membuat frame
        JFrame frame = new JFrame("WindowListener Example");

        //membuat labeluntuk menampilkan pesan
        JLabel label = new JLabel("Lakukan operasi pada jendela");

        //menambahan window listener ke frame
        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                label.setText("Window Opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                label.setText("Window Closing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window Closed.");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                label.setText("Window Minimized");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                label.setText("Window Rstored");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                label.setText("Window Activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                label.setText("Window Deactivated");
            }
        });

        //menambahkan komponen ke frame
        frame.add(label);

        //setting frame
        frame.setSize(400,200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
