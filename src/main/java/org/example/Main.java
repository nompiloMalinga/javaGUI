package org.example;


import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double width,length,area,perimeter;
        String getLength,getWidth, Output;

        getLength = JOptionPane.showInputDialog("please enter the length: ");
        length = Double.parseDouble(getLength);
        getWidth = JOptionPane.showInputDialog("please enter width: ");
        width = Double.parseDouble(getWidth);

        area = length * width;
        perimeter = 2 *(length+width);
        Output = "Length: " + length + "\n" +
                "Width: " + width + "\n"+
                "Area: "  + area +"\n" +
                "Perimeter: " + perimeter;
        JOptionPane.showMessageDialog(null,Output,"Rectangle",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);



    }
}