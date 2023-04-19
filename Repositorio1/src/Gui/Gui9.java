package Gui;

import java.awt.Color;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Gui9 extends JFrame implements ChangeListener {

    /* Definimos los componentes a usar usando variables */
    private final JRadioButton radio1, radio2, radio3, radio4;
    private final ButtonGroup grupoBotones;

    public Gui9() {
        /* Configuración del JFrame */
        setLayout(null); //Layout absoluto
        setTitle("Ejemplo 11"); //Título del JFrame
        setSize(350, 230); //Dimensiones del JFrame
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); //Mostrar JFrame

        //Crear nuevo grupo de botones
        grupoBotones = new ButtonGroup();
//Agregar los 3 radioButton con su ChangeListener
        radio1 = new JRadioButton("Soltero");
        radio1.setBounds(10, 20, 200, 30);
        radio1.addChangeListener(this);
        add(radio1);
        grupoBotones.add(radio1);
        //Repetir las mismas instrucciones para:
        //radio2, radio3
        radio2 = new JRadioButton("Casado");
        radio2.setBounds(10, 60, 200, 30);
        radio2.addChangeListener(this);
        add(radio2);
        grupoBotones.add(radio2);

        radio3 = new JRadioButton("Divorciado");
        radio3.setBounds(10, 100, 200, 30);
        radio3.addChangeListener(this);
        add(radio3);
        grupoBotones.add(radio3);
        
        radio4 = new JRadioButton("Viudo");
        radio4.setBounds(10, 140, 200, 30);
        radio4.addChangeListener(this);
        add(radio4);
        grupoBotones.add(radio4);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (radio1.isSelected()) {
            setSize(640, 480);
            setTitle("Ejemplo 11/640-480");
            this.getContentPane().setBackground(Color.orange);
        }
        if (radio2.isSelected()) {
            setSize(800, 600);
            setTitle("Ejemplo 11/800-600");
            this.getContentPane().setBackground(Color.PINK);
        }
        if (radio3.isSelected()) {
            setSize(1024, 768);
            setTitle("Ejemplo 11/1024-768");
            this.getContentPane().setBackground(Color.darkGray);
        }
    }
}
