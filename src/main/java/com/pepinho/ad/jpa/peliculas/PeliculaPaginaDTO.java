package com.pepinho.ad.jpa.peliculas;

import java.util.Objects;

public class PeliculaPaginaDTO {
    // idPelicula, castelan, orixinal, anoFin y director.
    Long idPelicula;
    String castelan;
    String orixinal;
    Short anoFin;
    String director;

    public PeliculaPaginaDTO() {
    }

    public PeliculaPaginaDTO(String castelan, String orixinal, Short anoFin) {
        this.castelan = castelan;
        this.orixinal = orixinal;
        this.anoFin = anoFin;
    }

    public PeliculaPaginaDTO(String castelan, String orixinal, Short anoFin, String director) {
        this.castelan = castelan;
        this.orixinal = orixinal;
        this.anoFin = anoFin;
        this.director = director;
    }

    public PeliculaPaginaDTO(Long idPelicula, String castelan, String orixinal, Short anoFin) {
        this.idPelicula = idPelicula;
        this.castelan = castelan;
        this.orixinal = orixinal;
        this.anoFin = anoFin;
    }

    public PeliculaPaginaDTO(Long idPelicula, String castelan, String orixinal, Short anoFin, String director) {
        this.idPelicula = idPelicula;
        this.castelan = castelan;
        this.orixinal = orixinal;
        this.anoFin = anoFin;
        this.director = director;
    }

    public Long getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Long idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getCastelan() {
        return castelan;
    }

    public void setCastelan(String castelan) {
        this.castelan = castelan;
    }

    public String getOrixinal() {
        return orixinal;
    }

    public void setOrixinal(String orixinal) {
        this.orixinal = orixinal;
    }

    public Short getAnoFin() {
        return anoFin;
    }

    public void setAnoFin(Short anoFin) {
        this.anoFin = anoFin;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeliculaPaginaDTO that = (PeliculaPaginaDTO) o;
        return Objects.equals(idPelicula, that.idPelicula) && Objects.equals(castelan, that.castelan) && Objects.equals(orixinal, that.orixinal) && Objects.equals(anoFin, that.anoFin) && Objects.equals(director, that.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPelicula, castelan, orixinal, anoFin, director);
    }

    @Override
    public String toString() {
        return "ID: "+ idPelicula + " || NOMBRE: " + castelan + " || ORIGINAL: "+ orixinal + " || ESTRENO: "+ anoFin +" || DIRECTOR: " + director;
    }
}



