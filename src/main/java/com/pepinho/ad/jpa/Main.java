package com.pepinho.ad.jpa;

import com.pepinho.ad.jpa.peliculas.Ocupacion;
import com.pepinho.ad.jpa.peliculas.Pais;
import com.pepinho.ad.jpa.peliculas.Pelicula;
import com.pepinho.ad.jpa.peliculas.PeliculaPersonaxe;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = JPAUtil.getEmFactory();
        EntityManager em = JPAUtil.getEntityManager();
/*
    // EJERCICIO 09.02. Creación de consultas JPA Películas

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

    //Obtener todas las ocupaciones que tienen más de 5 películas asociadas.

        var consulta = em.createQuery("select o from Ocupacion o WHERE SIZE(o.peliculaPersonaxes) > 5 order by orde", Ocupacion.class);
        List<Ocupacion> resultado = consulta.getResultList();
        for (Ocupacion oc:resultado){
            System.out.println(oc);
        }

*
    d) Obtener todas las películas que tienen un país específico (por ejemplo, “España”).
       var consulta = em.createQuery("select p from Pelicula p WHERE p.pais.pais='España'", Pelicula.class);
        List<Pelicula> resultado = consulta.getResultList();
        for (Pelicula pel:resultado){
            System.out.println(pel);
        }

    e) Obtener todas las películas que tienen al menos un personaje interpretado por un actor de un país específico (por ejemplo, “Francia”).
    var consulta = em.createQuery("select distinct p.pelicula from PeliculaPersonaxe p join p.personaxe pe where pe.paisNacemento ='Francia'", Pelicula.class);
        List<Pelicula> resultado = consulta.getResultList();
        for (Pelicula pel:resultado){
            System.out.println(pel);
        }

    f) Obtener todas las películas que tienen música compuesta por un compositor específico (por ejemplo, “John Williams”).
      var consulta = em.createQuery("select distinct p.pelicula from PeliculaPersonaxe p join p.personaxe pe where pe.nomeOrdenado ='John Williams' and p.ocupacion.ocupacion = 'Compositor de la banda original'", Pelicula.class);
        List<Pelicula> resultado = consulta.getResultList();
        for (Pelicula pel:resultado){
            System.out.println(pel);
        }

    g) Obtener todas las películas que tienen un personaje interpretado por un actor con un nombre específico (por ejemplo, “Tom Hanks”).

    var consulta = em.createQuery("select distinct p.pelicula from PeliculaPersonaxe p join p.personaxe pe where pe.nomeOrdenado ='Tom Hanks' and p.ocupacion.ocupacion = 'Actor'", Pelicula.class);
        List<Pelicula> resultado = consulta.getResultList();
        for (Pelicula pel:resultado){
            System.out.println(pel);
        }

    h) Obtener todas las películas que tienen un género específico y que fueron producidas en un año específico (por ejemplo, “Acción” y 2005).
    var consulta = em.createQuery("select p from Pelicula p where p.xenero ='Musical' and p.anoFin = 1986", Pelicula.class);
        List<Pelicula> resultado = consulta.getResultList();
        for (Pelicula pel:resultado){
            System.out.println(pel);
        }




    i) Obtener todas las películas que tienen un personaje interpretado por un actor de un género específico (por ejemplo, “Mujer”).
var consulta = em.createQuery("select distinct p.pelicula from PeliculaPersonaxe p join p.personaxe pe where p.ocupacion.ocupacion ='Actor' and sexo = 'Mujer'", Pelicula.class);
        List<Pelicula> resultado = consulta.getResultList();
        for (Pelicula pel:resultado){
            System.out.println(pel);
        }

     f) Obtener todas las películas que tienen un personaje interpretado por un actor que nació en un país específico y que tienen una duración mayor a 100 minutos.
     var consulta = em.createQuery("select distinct p.pelicula from PeliculaPersonaxe p join p.personaxe pe where p.personaxe.paisNacemento ='España' and p.pelicula.duracion >100", Pelicula.class);
        List<Pelicula> resultado = consulta.getResultList();
        for (Pelicula pel:resultado){
            System.out.println(pel);
        }


        g) Devolver todos los países que no tienen películas asociadas, puedes usar una consulta JPQL que utilice una subconsulta o un LEFT JOIN con una condición IS NULL.

         var consulta = em.createQuery("select p.pais from Pais p left join Pelicula pe on (pe.pais.pais=p.pais) where pe.pais IS NULL", Pais.class);
        List<Pais> resultado = consulta.getResultList();
        for (Pais pel:resultado){
            System.out.println(pel);
        }
 */

        // EJERCICIO 09.03 > Consultas SQL a JPQL (películas)


        // Muestra la película solicitando el id
        //SELECT castelan, orixinal, anoFin, poster IS NOT NULL as tenPoster
        //FROM pelicula WHERE idPelicula = :identificador

        Scanner sc = new Scanner(System.in);

        int idEntrada = sc.nextInt();

       // var consulta = em.createQuery("select p.castelan, p.orixinal, p.anofin")







    }
}