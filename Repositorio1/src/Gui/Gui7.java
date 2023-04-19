package Gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui7 extends JFrame {

    //constantes y componentes 
    public Gui7() {
        super("Ventana/Herencia");//Establece el titulo de la ventana
        setLayout(new BorderLayout(4, 3));
        add(new JButton("1"), BorderLayout.EAST);
        add(new JButton("2"), BorderLayout.SOUTH);
        add(new JButton("3"), BorderLayout.WEST);
        add(new JButton("4"), BorderLayout.NORTH);
        add(new JButton("5"), BorderLayout.CENTER);
        
        setLocationRelativeTo(null);//La ventana se posiciona en el centro de la ventana       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Establece que el boton de cerrar ermita salir de la aplicacion
        setResizable(false);
//Establece que el tamano de la ventana no se pueda cambiar 
        pack();
//presenta una ventaqna con el tamaño neceaario para mostrar los componentes que hay en ella
        setVisible(true);
    }
}
