package Gui;

import javax.swing.JFrame;

public class Gui1 extends JFrame{
    //constantes y componentes
    public Gui1(){
        super("Ventana usando Herencia");//Establece el titulo de la ventana
        setSize(370,370);//Establece el tamaño de mi ventana
        setLocationRelativeTo(null);/*La ventana se posiciona en el centro de la pantalla*/
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Establece que el boton de cerrar permitirá salir de la aplicación
        setResizable(false);//Establece que el tamaño de la ventana no se pueda cambiar
        setVisible(true);
    }
}
