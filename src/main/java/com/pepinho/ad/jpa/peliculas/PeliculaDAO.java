package com.pepinho.ad.jpa.peliculas;

import jakarta.persistence.EntityManager;
import java.util.List;

public class PeliculaDAO {

    EntityManager em;

    public PeliculaDAO(EntityManager em) {
        this.em = em;
    }

    public Long findTotalPelis() {
        return em.createQuery("select count(p) from Pelicula p", Long.class).getSingleResult();
    }

   /* public List<String> pelisPagina(int pagina) {
        int inicio = (pagina - 1) * 10;
        return em.createQuery("select p.castelan from Pelicula p", String.class)
                .setFirstResult(inicio)
                .setMaxResults(10)
                .getResultList();
    }*/

    /*
   public List<PeliculaPaginaDTO> pelisPagina(int pagina) {
       int inicio = (pagina - 1) * 10;
       return em.createQuery("select new PeliculaPaginaDTO(pe.pelicula.idPelicula, pe.pelicula.castelan, pe.pelicula.orixinal, pe.pelicula.anoFin, pe.personaxe.nome) from PeliculaPersonaxe pe where pe.ocupacion.ocupacion = 'Director'", PeliculaPaginaDTO.class)
               .setFirstResult(inicio)
               .setMaxResults(10)
               .getResultList();
   }*/


    public List<PeliculaPaginaDTO> pelisPagina(int pagina) {
        int inicio = (pagina - 1) * 10;
        return em.createQuery("SELECT new PeliculaPaginaDTO(\n" +
                        "    p.idPelicula, \n" +
                        "    p.castelan, \n" +
                        "    p.orixinal, \n" +
                        "    p.anoFin, \n" +
                        "    COALESCE((SELECT pe.personaxe.nome FROM PeliculaPersonaxe pe WHERE pe.pelicula = p AND pe.ocupacion.ocupacion = 'Director'), 'Desconocido')"+
                        ")\n" +
                        "FROM Pelicula p", PeliculaPaginaDTO.class)
                .setFirstResult(inicio)
                .setMaxResults(10)
                .getResultList();
    }

}