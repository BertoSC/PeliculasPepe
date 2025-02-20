package com.pepinho.ad.jpa;

import com.pepinho.ad.jpa.peliculas.*;
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


        // select p.pais from pelicula p right join p.pais where p is null" ¿¿¿
         var consulta = em.createQuery("select p.pais from Pais p left join Pelicula pe on (pe.pais.pais=p.pais) where pe.pais IS NULL", Pais.class);
        List<Pais> resultado = consulta.getResultList();
        for (Pais pel:resultado){
            System.out.println(pel);
        }
 */

        // EJERCICIO 09.03 > Consultas SQL a JPQL (películas)

/*
        // Muestra la película solicitando el id
        //SELECT castelan, orixinal, anoFin, poster IS NOT NULL as tenPoster
        //FROM pelicula WHERE idPelicula = :identificador

        Scanner sc = new Scanner(System.in);

        int idEntrada = sc.nextInt();

        var consulta = em.createQuery("select p.castelan, p.orixinal, p.anoFin from Pelicula p where p.idPelicula = :id and poster IS NOT NULL");
        consulta.setParameter("id", idEntrada);
        List <Object[]> resultado = consulta.getResultList();
        for (Object[] ob: resultado) {
            System.out.println(ob[0].toString());
        }
*/
        // Muestra las películas que tienen algún personaje (IS EMPTY) o no tienen personajes (IS NOT EMPTY).

       /* //var consulta = em.createQuery("select pe.pelicula from PeliculaPersonaxe pe where pe.personaxe IS NOT NULL", Pelicula.class);
        var consulta = em.createQuery("select p from Pelicula p where p.personaxes is empty");
        var consulta = em.createQuery("select p from Pelicula p where p.personaxes is not empty");


        List<Pelicula> resultado = consulta.getResultList();
        for (Pelicula pe: resultado){
            System.out.println(pe);
        }*/

        //Muestra las películas que tienen personajes con una ocupación concreta:
        //
        //SELECT P.nome FROM peliculapersonaxe PP, personaxe P
        //WHERE P.idPersonaxe=PP.idPersonaxe AND
        //PP.ocupacion='OCUPACIÓNCONCRETA' AND PP.idPelicula=IDENTIFICADOR_PELICULA

/*
        var consulta = em.createQuery("select p.pelicula from PeliculaPersonaxe p where p.ocupacion.ocupacion = 'Actor'");
        TypedQuery q = em.createQuery("Select p "+
// "FROM Pelicula p join p.personaxes pp " +
// "where (pp.ocupacion.ocupacion = 'Actor')", Pelicula.class);
//
// for(Pelicula p :q.getResultList() ){
// System.out.println(p);


        List<Pelicula> resultado = consulta.getResultList();
        for (Pelicula pe: resultado){
            System.out.println(pe);
        }


        // Muestra los títulos de las películas en las que ha trabajado un actor concreto.


        var consulta = em.createQuery("select p.pelicula from PeliculaPersonaxe p where p.ocupacion.ocupacion = 'Actor' and p.personaxe.nomeOrdenado = 'Tom Hanks'", Pelicula.class);
        List <Pelicula> resultado = consulta.getResultList();
        for (Pelicula pe: resultado){
            System.out.println(pe);
        }


 */

        //Listar el número de películas de acuerdo con el nombre propocionado:
        // (Crea una clase PeliculaDTO con los campos idPelicula, castelan, orixinal, anoFin, tenPoster (booleano) y realiza la consulta)

        // SELECT idPelicula, castelan, orixinal, anoFin, poster IS NOT NULL as tenPoster
        // FROM pelicula WHERE castelan LIKE ‘%:nombre%’ ORDER BY 5 DESC, castelan ASC

        var consulta = em.createQuery("select new PeliculaDTO(p.idPelicula, p.castelan, p.orixinal, p.anoFin) from Pelicula p where p.castelan LIKE '%Toy Story%'", PeliculaDTO.class);
        List <PeliculaDTO> resultado = consulta.getResultList();
        for (PeliculaDTO pe: resultado){
            System.out.println(pe);
        }






        /*

        Consulta los datos de las ocupaciones de los personajes de una película:
SELECT O.ocupacion FROM ocupacion O WHERE EXISTS (
SELECT idPelicula FROM peliculapersonaxe PP WHERE
O.ocupacion=PP.ocupacion
AND PP.idPelicula=IDENTIFICADOR_DE_PELICULA)
AND  O.orde<>0 ORDER BY O.orde
y los nombres sde los personajes que tienen esa ocupación:

SELECT P.nome FROM peliculapersonaxe PP, personaxe P
WHERE P.idPersonaxe=PP.idPersonaxe AND
PP.ocupacion='OCUPACIÓNCONCRETA' AND PP.idPelicula=IDENTIFICADOR_PELICULA


         */






    }
}