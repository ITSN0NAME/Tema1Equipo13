package Gui;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui3 extends JFrame{
    //constantes y componentes
    private Container panel;
    private JButton miBoton;
    public Gui3(){
        super ("Ventana/Herencia");//Establece el titulo de la ventana
        //Configurar componentes
        
        miBoton = new JButton("Aceptar");
        miBoton.setBounds(0,0,100,100);
        panel = getContentPane();//Se crea un almacen de elementos
        panel.add(miBoton);//creamos un boton(elemento)
        setSize(200,200);//Establece el tamaño de la ventana
        setLocationRelativeTo(null);//lña ventana se posiciona en el centro de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//establece que el boton de cerrar permitira salir de la aplicacion
        setResizable(false);//establece que el tamaño de la ventana no se puede cambiar
        setVisible(true);
    }   
}
