package Gui;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui6 extends JFrame{
    //constantes y componentes(objeto)
    public Gui6(){
        super("Ventana/Herencia");//Establece el titulo de la ventana
        getContentPane().setLayout(new GridLayout(4,3,5,5));
        for (int i=1;i<=10;i++){
            add(new JButton(Integer.toString(i)));
            setLocationRelativeTo(null);//La ventana se posiciona en el centro de la ventana
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//Establece que el boton de cerrar permitira salir de la aplicacion
            pack();
//presenta una ventana con el tamaño necesario para mostar los componentes que hay en ella
            setVisible (true);
        }
    }
}
