/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package peliculas.modelo;

/**
 *
 * @author asus
 */
public interface ICatalogoPeliculas {
    void insertarPeliculas(Pelicula pelicula);
    void listarPeliculas();
    void buscarPelicula(String nombrePeliculaBuscar);
}
