package com.MovidasSWIFT;

import javax.swing.*;
import java.awt.*;

public class MarcoEmergente {
    public static void main(String[] args) {
        MarcoEmergenteM mimarco = new MarcoEmergenteM();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoEmergenteM extends JFrame {
    public MarcoEmergenteM(){
        setBounds(300,100,550,450);
        setTitle("Menú emergente");
        LaminaEmergente milamina = new LaminaEmergente();
        add(milamina);
        setVisible(true);
    }
}

class LaminaEmergente extends JPanel{
    public LaminaEmergente() {
        setLayout(new BorderLayout());
        JPanel laminamenu = new JPanel();
        JMenuBar mibarra = new JMenuBar();
        JMenu fuente = new JMenu("Fuente");
        JMenu estilo = new JMenu("Estilo");
        JMenu tamagno = new JMenu("Tamaño");
        mibarra.add(fuente);
        mibarra.add(estilo);
        mibarra.add(tamagno);
        laminamenu.add(mibarra);
        add(laminamenu,BorderLayout.NORTH);
        JTextPane miarea = new JTextPane();
        add(miarea, BorderLayout.CENTER);

        // Construimos el menú emergente
        JPopupMenu emergente = new JPopupMenu();
        // Añadimos los elementos al menú
        JMenuItem opcion1 = new JMenuItem("Opción 1");
        JMenuItem opcion2 = new JMenuItem("Opción 2");
        JMenuItem opcion3 = new JMenuItem("Opción 3");
        emergente.add(opcion1);
        emergente.add(opcion2);
        emergente.add(opcion3);
        // Para que aparezca al hacer click en la lámina con el botón izquierdo.
        //setComponentPopupMenu(emergente); (sale el menú al hacer click en la lámina)
        miarea.setComponentPopupMenu(emergente); //Sale el menú al hacer click en la zona del texto.

    }
}

