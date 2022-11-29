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
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import static java.awt.Color.*;

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

        //ConfiguraMenu("Regular", "estilo","",Font.PLAIN,12 );
        ConfiguraMenu("Negrita", "estilo","",Font.BOLD,12 );
        ConfiguraMenu("Cursiva", "estilo","",Font.ITALIC,12 );

       // JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("out/production/Curso_Java/com/graficos/Bold.png"));
       // JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva", new ImageIcon("out/production/Curso_Java/com/graficos/Italic.jpeg"));
       // negrita.addActionListener(new StyledEditorKit.BoldAction());
       // cursiva.addActionListener(new StyledEditorKit.ItalicAction());
       // estilo.add(negrita);
       // estilo.add(cursiva);

       // ConfiguraMenu("12 px", "tamaño","",9,12 );
       // ConfiguraMenu("16 px", "tamaño","",9,16 );
       // ConfiguraMenu("20 px", "tamaño","",9,20 );
       // ConfiguraMenu("24 px", "tamaño","",9,24 );

        ButtonGroup tamano_letra= new ButtonGroup();
        JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");
        JRadioButtonMenuItem quince = new JRadioButtonMenuItem("15");
        JRadioButtonMenuItem veinte = new JRadioButtonMenuItem("20");
        JRadioButtonMenuItem veinticuatro = new JRadioButtonMenuItem("24");

        // Incluir atajos de teclado (que convierta el tamaño de letra a 24 al pulsar ALT + D.
        // veinticuatro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.ALT_DOWN_MASK));


        tamano_letra.add(doce);
        tamano_letra.add(quince);
        tamano_letra.add(veinte);
        tamano_letra.add(veinticuatro);
        doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 12));
        quince.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 15));
        veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 20));
        veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 24));
        tamano.add(doce);
        tamano.add(quince);
        tamano.add(veinte);
        tamano.add(veinticuatro);



        barra.add(fuente);
        barra.add(estilo);
        barra.add(tamano);

        laminamenu.add(barra);
        add(laminamenu, BorderLayout.NORTH);


        miarea = new JTextPane();
        add(miarea,BorderLayout.CENTER);

        // Construimos el menú emergente
        JPopupMenu emergente = new JPopupMenu();
        // Añadimos los elementos al menú
        JMenuItem negrita_e = new JMenuItem("Negrita");
        JMenuItem cursiva_e = new JMenuItem("Cursiva");

        negrita_e.addActionListener(new StyledEditorKit.BoldAction());
        cursiva_e.addActionListener(new StyledEditorKit.ItalicAction());

        emergente.add(negrita_e);
        emergente.add(cursiva_e);

        // Para que aparezca al hacer click en la lámina con el botón izquierdo.
        //setComponentPopupMenu(emergente); (sale el menú al hacer click en la lámina)
        miarea.setComponentPopupMenu(emergente);

        //-------------------------------------------------------------------

        /* JToolBar BarraHerramientas = new JToolBar();
        JButton negrita_barra = new JButton(new ImageIcon("out/production/Curso_Java/com/graficos/negrita.png"));
        JButton cursiva_barra = new JButton(new ImageIcon("out/production/Curso_Java/com/graficos/cursiva.png"));
        JButton subrayar_barra = new JButton(new ImageIcon("out/production/Curso_Java/com/graficos/subrayar.png"));
        JButton azul_barra = new JButton(new ImageIcon("out/production/Curso_Java/com/graficos/azul.png"));
        JButton rojo_barra = new JButton(new ImageIcon("out/production/Curso_Java/com/graficos/rojo.png"));
        JButton verde_barra = new JButton(new ImageIcon("out/production/Curso_Java/com/graficos/verde.png"));
        JButton a_derecha = new JButton(new ImageIcon("out/production/Curso_Java/com/graficos/derecha.png"));
        JButton a_izquierda = new JButton(new ImageIcon("out/production/Curso_Java/com/graficos/izquierda.png"));
        JButton a_centrado = new JButton(new ImageIcon("out/production/Curso_Java/com/graficos/Centrado.png"));
        JButton a_justificado = new JButton(new ImageIcon("out/production/Curso_Java/com/graficos/justificado.png"));

        negrita_barra.addActionListener(new StyledEditorKit.BoldAction());
        cursiva_barra.addActionListener(new StyledEditorKit.ItalicAction());
        subrayar_barra.addActionListener(new StyledEditorKit.UnderlineAction());
        azul_barra.addActionListener(new StyledEditorKit.ForegroundAction("Azul", Color.BLUE));
        rojo_barra.addActionListener(new StyledEditorKit.ForegroundAction("Rojo", Color.RED));
        verde_barra.addActionListener(new StyledEditorKit.ForegroundAction("Verde", Color.GREEN));
        a_izquierda.addActionListener(new StyledEditorKit.AlignmentAction("Izquierda", 0));
        a_centrado.addActionListener(new StyledEditorKit.AlignmentAction("Centrado", 1));
        a_derecha.addActionListener(new StyledEditorKit.AlignmentAction("Derecha", 2));
        a_justificado.addActionListener(new StyledEditorKit.AlignmentAction("Justificado", 3));


        BarraHerramientas.add(negrita_barra);
        BarraHerramientas.add(cursiva_barra);
        BarraHerramientas.add(subrayar_barra);
        BarraHerramientas.add(azul_barra);
        BarraHerramientas.add(rojo_barra);
        BarraHerramientas.add(verde_barra);
        BarraHerramientas.add(a_derecha);
        BarraHerramientas.add(a_centrado);
        BarraHerramientas.add(a_izquierda);
        BarraHerramientas.add(a_justificado);

         */
        BarraHerramientas = new JToolBar();
        configura_barra("out/production/Curso_Java/com/graficos/negrita.png").addActionListener(new StyledEditorKit.BoldAction());
        configura_barra("out/production/Curso_Java/com/graficos/cursiva.png").addActionListener(new StyledEditorKit.ItalicAction());
        configura_barra("out/production/Curso_Java/com/graficos/subrayar.png").addActionListener(new StyledEditorKit.UnderlineAction());
        BarraHerramientas.addSeparator();
        configura_barra("out/production/Curso_Java/com/graficos/azul.png").addActionListener(new StyledEditorKit.ForegroundAction("Azul", Color.BLUE));
        configura_barra("out/production/Curso_Java/com/graficos/rojo.png").addActionListener(new StyledEditorKit.ForegroundAction("Rojo", Color.RED));
        configura_barra("out/production/Curso_Java/com/graficos/verde.png").addActionListener(new StyledEditorKit.ForegroundAction("Verde", Color.GREEN));
        BarraHerramientas.addSeparator();
        configura_barra("out/production/Curso_Java/com/graficos/izquierda.png").addActionListener(new StyledEditorKit.AlignmentAction("Izquierda", 0));
        configura_barra("out/production/Curso_Java/com/graficos/Centrado.png").addActionListener(new StyledEditorKit.AlignmentAction("Centrado", 1));
        configura_barra("out/production/Curso_Java/com/graficos/derecha.png").addActionListener(new StyledEditorKit.AlignmentAction("Derecha", 2));
        configura_barra("out/production/Curso_Java/com/graficos/justificado.png").addActionListener(new StyledEditorKit.AlignmentAction("Justificado", 3));
        BarraHerramientas.addSeparator();


        BarraHerramientas.setOrientation(1);
        add(BarraHerramientas, BorderLayout.WEST);


    }

    public JButton configura_barra(String ruta){
        JButton boton = new JButton(new ImageIcon(ruta));
        BarraHerramientas.add(boton);
        return boton;

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
                elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,InputEvent.CTRL_DOWN_MASK));
                elem_menu.addActionListener(new StyledEditorKit.BoldAction());
            } else if (estilos==Font.ITALIC){
                elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I,InputEvent.CTRL_DOWN_MASK));
                elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
            }

        }else if (menu == "tamaño"){
            tamano.add(elem_menu);
            elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", tam));
        }

    }




    private JTextPane miarea;
    private JMenu fuente, estilo, tamano;
    private Font letras;
    JButton negrita_barra, cursiva_barra, subrayar_barra, azul_barra, rojo_barra, verde_barra, a_izquierda, a_centrado,a_derecha, a_justificado;
    JToolBar BarraHerramientas;

}

