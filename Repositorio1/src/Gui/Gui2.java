package Gui;

import javax.swing.JFrame;

public class Gui2 {
    public Gui2(){
        JFrame frame = new JFrame("Ventana sin Herencia");
        //Configurar componentes y añadirlos al panel del frame
        frame.setSize(370,370);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
