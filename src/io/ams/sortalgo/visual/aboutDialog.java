/*
 * Sorting algorithms demo (Java)
 *
 * Copyright (c) Project AMS
 *
 * (MIT License)
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 * - The above copyright notice and this permission notice shall be included in
 *   all copies or substantial portions of the Software.
 * - The Software is provided "as is", without warranty of any kind, express or
 *   implied, including but not limited to the warranties of merchantability,
 *   fitness for a particular purpose and noninfringement. In no event shall the
 *   authors or copyright holders be liable for any claim, damages or other
 *   liability, whether in an action of contract, tort or otherwise, arising from,
 *   out of or in connection with the Software or the use or other dealings in the
 *   Software.
 */

package io.ams.sortalgo.visual;

import javax.swing.*;
import java.awt.*;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
final class aboutDialog extends Frame {

    /*---- Fields ----*/

    public static Button aboutButton;

    /*---- Constructor ----*/

    public static void aboutFRM() {

        // Create layout manager and set default values
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        aboutStarter();
    }

    /*---- Methods ----*/

    public static void openWebPage(String url){
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        }
        catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void aboutStarter() {
        aboutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String text1 = "<html><b>About Me & App</b></html>";
                String text2 =
                        "<html>This App written in JAVA by" +
                                "<br/>" + "<b>Amir Mohammad Safari Livari</b>" +
                                "<br/>" + "In 2018 and its useful for Data Structure and" +
                                "<br/>" + "Many other basic classes in Universities" +
                                "<br/>" + "I hope you can enjoy this as well," +
                                "<br/>" + "If you have seen any issues and bug just report it in my GitHub" +
                                "<br/>"+ "Thanks</html>";
                String text3 = "<html><b>© All right Reserved By AMSL 2017 - 2018</b></html>";

                JFrame frame = new JFrame();
//                Object[] options = {"Open GitHub", "OK Fine"};
//                Icon icon2 = new ImageIcon("../../../img/info.png");
//                ImageIcon icon = new ImageIcon(getClass().getResource("../../../img/info.png"));
//                JOptionPane AMSoptionPane = new JOptionPane("Continue Hello", JOptionPane.YES_NO_OPTION);
//                JOptionPane.showMessageDialog(frame,"HELLO WORLD", "INFORMATION",JOptionPane.YES_NO_OPTION, icon2);
//                JDialog dialog = AMSoptionPane.createDialog(frame, "Information");
                JDialog dialog = new JDialog(frame,"Information", true);
                JLabel label0 = new JLabel(text1,SwingConstants.CENTER);
                JLabel label1 = new JLabel(text2,SwingConstants.CENTER);
                JLabel label2 = new JLabel(text3,SwingConstants.CENTER);
                JButton btn = new JButton("OK Fine");
                JButton btn2 = new JButton("Open My GitHub");

                dialog.setResizable(false);
                dialog.setLocationRelativeTo(null);
                dialog.setLayout(new FlowLayout(FlowLayout.CENTER));
                label0.setLayout(new FlowLayout(FlowLayout.CENTER));
                label1.setLayout(new FlowLayout(FlowLayout.CENTER));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dialog.add(label0);
                dialog.add(label1);
                dialog.add(label2);
                dialog.add(btn);
                dialog.add(btn2);
                dialog.setSize(500, 270);
                dialog.setVisible(true);

                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
//                        JFrame.dispose();
                    }
                });
//                btn.addActionListener(e1 -> dispose());

                btn2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        openWebPage("https://github.com/jarvis-ai");
                    }
                });
            }
        });
    }
}


//    public aboutMSG() {
//       String MSG = "Hello World";
//       JFrame frame = new JFrame("JOption");
//       JOptionPane.showMessageDialog(frame,"Whatsup :" + MSG + "BUY");
//        ImageIcon imageInfo = new ImageIcon(info.png);
//        JLabel imageLabel = new JLabel(imageInfo);
//        JTextField text1 = new JTextField("HELLO WORLD",100);
//    }

//    JLabel label = new JLabel("GOODBUY");
//                label.setVisible(true);
//                        label.setLayout(new FlowLayout());
//
//                        JTextField text1 = new JTextField("HELLO WORLD",100);
//                        text1.setHorizontalAlignment(JTextField.CENTER);
//                        text1.setVisible(true);
//                        text1.setLayout(null);
//
//                        frame.getContentPane().setLayout(new FlowLayout());
//                        frame.getContentPane().add(text1);
//                        d.add(label);
//                        d.add(text1);
//                        d.pack();