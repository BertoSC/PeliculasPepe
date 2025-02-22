package com.pepinho.ad.jpa;

import com.pepinho.ad.jpa.peliculas.PeliculaDAO;
import com.pepinho.ad.jpa.peliculas.PeliculaPaginaDTO;
import jakarta.persistence.EntityManager;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class PaginadorPeliculas implements Serializable {
    int paginaActual;
    Long totalPaginas;
    PeliculaDAO peliculaDAO;

    public PaginadorPeliculas(EntityManager em) {
        this.paginaActual = 1;
        peliculaDAO = new PeliculaDAO(em);
        setTotalPaginas();
        menu(em);
    }

    public Long getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas() {
        this.totalPaginas = peliculaDAO.findTotalPelis()/10;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    public void setPaginaActual(int paginaActual) {
        this.paginaActual = paginaActual;
    }

    public void menu(EntityManager em) {
        System.out.println("GESTOR DE PELÍCULAS");
        while (true) {
            System.out.println("Inserte el número de página (0 para salir): ");
            Scanner sc = new Scanner(System.in);
            int pagina = sc.nextInt();
            if (pagina == 0) {
                break;
            }
            imprimirResultados(pagina, em);
        }
    }

    private void imprimirResultados(int pagina, EntityManager em) {
        PeliculaDAO peliculaDAO = new PeliculaDAO(em);
        List<PeliculaPaginaDTO> listaP = peliculaDAO.pelisPagina(pagina);
        for (PeliculaPaginaDTO peli : listaP) {
            System.out.println(peli);
        }
        System.out.println();
        System.out.println("Página actual: " + pagina);
        System.out.println("Página final: " + totalPaginas);
    }
}