package Libros.Controller;

import Libros.Model.Entity.Libro;
import Libros.Model.Repository.LRepository;
import Libros.View.LView;

import java.util.ArrayList;

public class LController {
    private final LView lView;
    private final LRepository lRepo;

    public LController(LView lView, LRepository lRepo) {
        this.lView = lView;
        this.lRepo = lRepo;
    }

    // C (aniadir a lista)
    public void addLibro(){
        Libro libro = lView.createLibro();
        lRepo.addLibro(libro);
    }

    // R (mostrar lista) || en otros proyectos, mostrar uno solo x busqueda
    public void viewLista(){
        ArrayList<Libro> lista = lRepo.getLista();
        lView.viewLibroList(lista);
    }

    // U (actualizar c/ campo y objeto entero)
    public void updateLibro(){
        Libro libro = lRepo.searchLibro(lView.searchLibroUpdate());
        if(libro != null){
            String titulo = lView.updateTitulo();
            String autor = lView.updateAutor();
            lRepo.updateLibro(libro, titulo, autor);
        }else{
            lView.printMsg("Error, libro buscado no existe con ese titulo.");
        }
    }

    // D (delete xd)
    public void deleteLibro(){
        Libro eliminar = lRepo.searchLibro(lView.deleteLibro());
        if(eliminar != null){
            lRepo.deleteLibro(eliminar);
        }else{
            lView.printMsg("Error, libro buscado no existe con ese titulo.");
        }
    }

}

