/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peliculas.ui;

import javax.swing.JOptionPane;
import peliculas.modelo.ICatalogoPeliculas;
import peliculas.modelo.ImplementacionCatalogoPeliculas;
import peliculas.modelo.Pelicula;

/**
 *
 * @author asus
 */
public class UIPeliculas {
    public static void interfazUsuario(){
        ICatalogoPeliculas peliculas = new ImplementacionCatalogoPeliculas();
        Pelicula pelicula;
        
        cerrar: 
        while(true){
            String opcion = JOptionPane.showInputDialog(
                null,
                "1 - Insertar pelicula\n"
                + "2 - Listar pelicula\n"
                + "3 - Buscar pelicula\n"
                + "4 - Salir",
                "Ingrese una opcion",
                JOptionPane.QUESTION_MESSAGE
            );
            
            int opcionInt = 0;
            try{
                opcionInt = Integer.parseInt(opcion);
            }catch(Exception e){
                JOptionPane.showMessageDialog(
                        null,
                        "Las opciones tienen que ser numeros enteros",
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE
                );
            }
            
            switch(opcionInt){
                case 1:
                    String nombrePelicula = JOptionPane.showInputDialog(
                            null,
                            "INGRESE EL NOMBRE DE LA PELICULA",
                            "entrada",
                            3);
                    
                    pelicula = new Pelicula(nombrePelicula);
                    peliculas.insertarPeliculas(pelicula);
                    break;
                case 2:
                    peliculas.listarPeliculas();
                    break;
                case 3:
                    nombrePelicula = JOptionPane.showInputDialog(
                            null,
                            "INGRESE EL NOMBRE DE LA PELICULA",
                            "Ingrese",
                            3);
                    peliculas.buscarPelicula(nombrePelicula);
                    break;
                case 4:
                    break cerrar;
                default:
                    JOptionPane.showMessageDialog(null, 
                            "OPCION INCORRECTA \n"
                            + "VUELVE A INGRESAR UNA \n"
                            + "OPCION CORRECTA \n"
                            + "LAS OPCIONES SON DEL 1 AL 4",
                            "ERROR",
                            JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
