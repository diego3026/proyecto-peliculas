/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peliculas.modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class ImplementacionCatalogoPeliculas implements ICatalogoPeliculas{
    private final ArrayList<String> listaPeliculas;

    public ImplementacionCatalogoPeliculas() {
        listaPeliculas = new ArrayList<>();
    }
    
    @Override
    public void insertarPeliculas(Pelicula pelicula) {
        this.listaPeliculas.add(pelicula.toString());
    }

    @Override
    public void listarPeliculas() {
        JOptionPane.showMessageDialog(
                null,
                listaPeliculas,
                "Lista de peliculas",
                JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void buscarPelicula(String nombrePeliculaBuscar) {
        String resultado = null;
        
        for (int i = 0; i < listaPeliculas.size(); i++) {
            String get = listaPeliculas.get(i);
            if(get.equals(nombrePeliculaBuscar)){
                resultado = get;
                break;
            }
        }
        
        if(nombrePeliculaBuscar.equals(resultado)){
            JOptionPane.showMessageDialog(
                    null,
                    "El resultado -> "+resultado,
                    "Buscar pelicula",
                    JOptionPane.QUESTION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(
                    null,
                    "No se a encontrado la pelicula -> "+nombrePeliculaBuscar,
                    "Buscar pelicula",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
