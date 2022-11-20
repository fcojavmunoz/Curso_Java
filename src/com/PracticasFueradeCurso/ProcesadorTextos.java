package com.PracticasFueradeCurso;

import javax.swing.*;
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


        /* A MANO:

        JMenuItem courier = new JMenuItem("Courier");
        JMenuItem serif = new JMenuItem("Serif");
        JMenuItem arial = new JMenuItem("Arial");

        JMenuItem normal = new JMenuItem("Normal");
        JMenuItem cursiva = new JMenuItem("Cursiva");
        JMenuItem negrita = new JMenuItem("Negrita");

        JMenuItem doce = new JMenuItem("12 px");
        JMenuItem quince = new JMenuItem("15 px");
        JMenuItem veinte = new JMenuItem("20 px");

        fuente.add(courier);
        fuente.add(serif);
        fuente.add(arial);
        estilo.add(normal);
        estilo.add(cursiva);
        estilo.add(negrita);
        tamano.add(doce);
        tamano.add(quince);
        tamano.add(veinte);

         */

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
        } else if (menu == "estilo"){
            estilo.add(elem_menu);
        }else if (menu == "tamaño"){
            tamano.add(elem_menu);
        }

        elem_menu.addActionListener(new GestionaEventos(rotulo,tipo_letra,estilos,tam));

    }

    private class GestionaEventos implements ActionListener {

        String tipoTexto, menu;
        int estiloLetra, tamanoLetra;

        GestionaEventos(String elemento, String texto2, int estilo2, int tamLetra){
            tipoTexto = texto2;
            estiloLetra = estilo2;
            tamanoLetra = tamLetra;
            menu = elemento;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            letras = miarea.getFont();
            if (menu=="Arial" || menu=="Courier"|| menu=="Serif"){
                estiloLetra = letras.getStyle();
                tamanoLetra = letras.getSize();
            } else if (menu=="Regular" || menu=="Cursiva"|| menu=="Negrita"){
                if (letras.getStyle()==1 || letras.getStyle()==2){
                    estiloLetra = 3;
                }
                tipoTexto = letras.getFontName();
                tamanoLetra = letras.getSize();
            }if (menu=="12 px" || menu=="16 px"|| menu=="20 px" || menu=="24 px"){
                estiloLetra = letras.getStyle();
                tipoTexto = letras.getFontName();
            }
            miarea.setFont(new Font(tipoTexto, estiloLetra, tamanoLetra));
            System.out.println("Tipo: " + tipoTexto + ". Estilo: " + estiloLetra + ". Tamaño: "+tamanoLetra);

        }
    }

    private JTextPane miarea;
    private JMenu fuente, estilo, tamano;
    private Font letras;

}

