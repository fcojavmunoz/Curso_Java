package com.company.practica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;

public class Marco_Dialogos extends JFrame {
    public Marco_Dialogos(){
        setTitle("Prueba de diálogos");
        setBounds(200,200,600,450);
        setLayout(new BorderLayout());
        JPanel lamina_cuadricula = new JPanel();
        lamina_cuadricula.setLayout(new GridLayout(2,3));
        String primero [] = {"Mensaje", "Confirmar", "Opción", "Entrada"};
        String segundo [] = {"Error Message", "Information Message", "Warning Message", "Question Message","Plain Message"};
        String tercero [] = {"Cadena", "Icono", "Componente", "Otros", "Object [ ]"};
        String cuarto [] = {"Default option", "Yes-No option", "Yes-No-Cancel option", "OK-Cancel option"};
        // String quinto [] = {"String[]", "Icon[]", "Object[]"};
        // String sexto [] = {"Campo de texto", "Combo"};
        lamina_tipo = new Lamina_Botones("Tipo", primero);
        lamina_tipo_mensaje = new Lamina_Botones("Tipo de Mensaje", segundo);
        lamina_mensaje = new Lamina_Botones("Mensaje", tercero);
        lamina_confirmar = new Lamina_Botones("Confirmar", cuarto);
        lamina_opcion = new Lamina_Botones("Opción", new String[]{
                "String [ ]",
                "Icon [ ]",
                "Object [ ]"
        });
        lamina_entrada = new Lamina_Botones("Entrada", new String[]{
                "Campo de texto",
                "Combo"
        });
        lamina_cuadricula.add(lamina_tipo);
        lamina_cuadricula.add(lamina_tipo_mensaje);
        lamina_cuadricula.add(lamina_mensaje);
        lamina_cuadricula.add(lamina_confirmar);
        lamina_cuadricula.add(lamina_opcion);
        lamina_cuadricula.add(lamina_entrada);
        add(lamina_cuadricula, BorderLayout.CENTER);

        // Lámina inferior (botón)

        JPanel lamina_boton = new JPanel();
        JButton mostrar = new JButton("Mostrar");
        lamina_boton.add(mostrar);
        add(lamina_boton, BorderLayout.SOUTH);
        mostrar.addActionListener(new AccionMostrar());


    }

    //-------------------------- DEVUELVE TIPO DE MENSAJE -------------

    public Object dameMensaje() {
        String s = lamina_mensaje.dameSeleccion();
        if (s.equals("Cadena")) {
            return cadenaMensaje;
        } else if (s.equals("Icono")) {
            return iconoMensaje;
        } else if (s.equals("Componente")) {
            return componenteMensaje;
        } else if (s.equals("Otros")) {
            return objetoMensaje;
        } else if (s.equals("Object [ ]")) {
            return new Object[]{
                    cadenaMensaje,
                    iconoMensaje,
                    componenteMensaje,
                    objetoMensaje

            };
        }else{
            return null;
        }
    }

    //------------------------- DEVUELVE TIPO DE ICONO && TIPO DE CONFIRMACIÓN---------------------------



    public int dameTipo(Lamina_Botones lamina){
        String s = lamina.dameSeleccion();
        if (s.equals("Error Message")|| s.equals("Yes-No option")){
            return 0;
        } else if(s.equals("Information Message")|| s.equals("Yes-No-Cancel option")){
            return 1;
        }else if(s.equals("Warning Message")|| s.equals("OK-Cancel option")){
            return 2;
        }else if(s.equals("Question Message")){
            return 3;
        }else if(s.equals("Plain Message")|| s.equals("Default option")){
            return -1;
        }else{
            return 0;
        }
    };

    //------------------------- DA OPCIONES A LA LÁMINA OPCIÓN -------------------

    public Object[] dameOpciones(Lamina_Botones lamina){
        String s = lamina.dameSeleccion();
        if(s.equals("String [ ]")){
            return new String[]{"Amarillo","Verde","Rojo"};
        }else if (s.equals("Icon [ ]")){
            return new Object[]{new ImageIcon("out/production/Curso_Java/com/graficos/telefono.png"),
                    new ImageIcon("out/production/Curso_Java/com/graficos/telefonorojo.png"),
                    new ImageIcon("out/production/Curso_Java/com/graficos/telefonoverde.png")
            };
        }else if (s.equals("Object [ ]")){
            return new Object[]{
                    cadenaMensaje,
                    iconoMensaje,
                    componenteMensaje,
                    objetoMensaje
            };
        }else{
            return null;
        }
    }

    //------------------------ CLASE INTERNA QUE GESTIONA LOS EVENTOS ------------

    private class AccionMostrar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // System.out.println(lamina_tipo.dameSeleccion());
            if(lamina_tipo.dameSeleccion().equals("Mensaje")){
                JOptionPane.showMessageDialog(Marco_Dialogos.this,dameMensaje(),"Título", dameTipo(lamina_tipo_mensaje));
            } else if(lamina_tipo.dameSeleccion().equals("Confirmar")){
                JOptionPane.showConfirmDialog(Marco_Dialogos.this, dameMensaje(), "Título",dameTipo(lamina_confirmar), dameTipo(lamina_tipo_mensaje));
            }else if(lamina_tipo.dameSeleccion().equals("Entrada")) {
                if (lamina_entrada.dameSeleccion().equals("Campo de texto")) {
                    JOptionPane.showInputDialog(Marco_Dialogos.this, dameMensaje(), "Título", dameTipo(lamina_tipo_mensaje));
                } else {
                    JOptionPane.showInputDialog(Marco_Dialogos.this, dameMensaje(), "Título", dameTipo(lamina_tipo_mensaje), null, new String[]{"Amarillo", "Azul", "Rojo"}, "Azul");
                }
            
            }else if(lamina_tipo.dameSeleccion().equals("Opción")){
                JOptionPane.showOptionDialog(Marco_Dialogos.this, dameMensaje(), "Título",1, dameTipo(lamina_tipo_mensaje),null,dameOpciones(lamina_opcion),null);
            }

        }
    }

    private Lamina_Botones lamina_tipo, lamina_tipo_mensaje, lamina_mensaje, lamina_confirmar, lamina_opcion, lamina_entrada;

    private String cadenaMensaje = "Mensaje";
    private Icon iconoMensaje = new ImageIcon("out/production/Curso_Java/com/graficos/telefono.png");
    private Object objetoMensaje = new Date();
    private Component componenteMensaje = new LaminaEjemplo();

}

class LaminaEjemplo extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(0,0,getWidth(),getHeight());
        g2.setPaint(Color.YELLOW);
        g2.fill(rectangulo);

    }
}
