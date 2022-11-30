/*
 * Crea un programa que se encargue de calcular el aspect ratio de una
 * imagen a partir de una url.
 * - Url de ejemplo:
 * https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una
 *   imagen de 1920*1080px.
 */

package com.PracticasFueradeCurso.RetosMoureDev;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import javax.imageio.ImageIO;

public class Reto5 {
    public static void main(String[] args) {
        BufferedImage image = null;
        try {
            URL url = new URL(introduceDatos("Introduce la URL de la imagen: "));
            image = ImageIO.read(url);

            int width = image.getWidth();
            int height = image.getHeight();
            int MCD = maximoComunDivisor(width, height);

            String ratio = width / MCD + ":" + height / MCD;
            System.out.println(width + "x" + height + "px");
            System.out.println(ratio);
        } catch (MalformedURLException e) {
            System.out.println("La url está mal escrita o tiene un formato no válido");
        } catch (IOException e) {
            System.out.println("Error de lectura, inténtalo de nuevo");
        } catch (NullPointerException e) {
            System.out.println("La URL no contiene una imagen o está mal formada");
        } catch (Exception e) {
            System.out.println("Error desconocido, contacte con el desarrollador: " + e.getMessage());
        }

    }

    private static int maximoComunDivisor(int width, int height) {
        if (height == 0) {
            return width;
        }
        return maximoComunDivisor(height, width % height);
    }

    private static String introduceDatos(String texto) {
        System.out.println(texto);
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }
}
