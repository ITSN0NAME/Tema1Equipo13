package Gui;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gui5 extends JFrame {

    public Gui5() {
        super("Ventana/Herencia");//Establece el titulo de la ventana
        
        getContentPane().setLayout(new FlowLayout());
        //Se instancian los compónentes
        JButton boton = new JButton("Boton");
        JLabel etiqueta = new JLabel("Dato");
        JTextField textField = new JTextField(10);
        JCheckBox checkBox = new JCheckBox("check box");

        //Se añaden los componentes a la ventana
        getContentPane().add(boton);
        getContentPane().add(etiqueta);
        getContentPane().add(textField);
        getContentPane().add(checkBox);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();//presenta una ventana con el tamaño necesario para mostar los componentes que hay en ella.
        setVisible(true);
    }
}
