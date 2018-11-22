package BF.Observer.SwingObserver;

import javax.swing.*;

public class SwingObserverExample {
    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    public void go(){
        jFrame = new JFrame();

        JButton jButton = new JButton("Should I do It?");
        jButton.addActionListener(new AngelListener());
        jButton.addActionListener(new DevilListener());

        jFrame.add(jButton);
        jFrame.setVisible(true);
    }
}
