package com.PracticasFueradeCurso;

/*
En esta rama vamos a perfeccionar el procesador de texto usando la
clase StyledEditorKit
 */

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProcesadorTextos {
    public static void main(String[] args) {
    MarcoProcesador mimarco = new MarcoProcesador();
    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}

class MarcoProcesador extends JFrame {
    public MarcoProcesador(){
        setBounds(300,100,550,450);
        setTitle("Procesador de texto");
        LaminaProcesador milamina = new LaminaProcesador();
        add(milamina);
        setVisible(true);
    }
}

class LaminaProcesador extends JPanel{
    public LaminaProcesador() {
        setLayout(new BorderLayout());
        JPanel laminamenu = new JPanel();

        JMenuBar barra = new JMenuBar();

        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamano = new JMenu("Tamaño");

        ConfiguraMenu("Arial", "fuente","Arial",9,12 );
        ConfiguraMenu("Courier", "fuente","Courier",9,12 );
        ConfiguraMenu("Serif", "fuente","Serif",9,12 );

        ConfiguraMenu("Regular", "estilo","",Font.PLAIN,12 );
        ConfiguraMenu("Negrita", "estilo","",Font.BOLD,12 );
        ConfiguraMenu("Cursiva", "estilo","",Font.ITALIC,12 );

        ConfiguraMenu("12 px", "tamaño","",9,12 );
        ConfiguraMenu("16 px", "tamaño","",9,16 );
        ConfiguraMenu("20 px", "tamaño","",9,20 );
        ConfiguraMenu("24 px", "tamaño","",9,24 );


        barra.add(fuente);
        barra.add(estilo);
        barra.add(tamano);

        laminamenu.add(barra);
        add(laminamenu, BorderLayout.NORTH);


        miarea = new JTextPane();
        add(miarea,BorderLayout.CENTER);

    }

    public void ConfiguraMenu(String rotulo, String menu, String tipo_letra, int estilos, int tam){
        JMenuItem elem_menu = new JMenuItem(rotulo);
        if (menu == "fuente"){
            fuente.add(elem_menu);

            if (tipo_letra=="Arial"){
                elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Arial"));
            } else if (tipo_letra == "Courier") {
                elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Courier"));
            } else if(tipo_letra == "Serif") {
                elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Serif"));
            }

        } else if (menu == "estilo"){
            estilo.add(elem_menu);

            if (estilos== Font.BOLD){
                elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
            } else if (estilos==Font.ITALIC){
                elem_menu.addActionListener(new StyledEditorKit.BoldAction());
            }

        }else if (menu == "tamaño"){
            tamano.add(elem_menu);
            elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", tam));
        }

    }




    private JTextPane miarea;
    private JMenu fuente, estilo, tamano;
    private Font letras;

}

