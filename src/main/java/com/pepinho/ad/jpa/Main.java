package com.pepinho.ad.jpa;

import com.pepinho.ad.jpa.peliculas.Pelicula;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = JPAUtil.getEmFactory();
        EntityManager em = JPAUtil.getEntityManager();
/*

    // TODAS LAS PELICULAS DE DURACION DE MAS DE 120 MINUTOS

        TypedQuery<Pelicula> consulta = em.createQuery("select p from Pelicula p where duracion > 120", Pelicula.class);
        List<Pelicula> resultado = consulta.getResultList();
        for (Pelicula pel:resultado){
            System.out.println(pel);
        }



   // Obtener todas las películas que pertenecen a un género específico (por ejemplo, “Drama”).

        TypedQuery<Pelicula> consulta = em.createQuery("select p from Pelicula p where xenero is not null", Pelicula.class);
        List<Pelicula> resultado = consulta.getResultList();
        for (Pelicula pel:resultado){
            System.out.println(pel);
        }

*/
    //Obtener todas las ocupaciones que tienen más de 5 películas asociadas.

        TypedQuery<Pelicula> consulta = em.createQuery("", Pelicula.class);
        List<Pelicula> resultado = consulta.getResultList();
        for (Pelicula pel:resultado){
            System.out.println(pel);
        }


    }
}