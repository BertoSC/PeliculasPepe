package com.pepinho.ad.jpa.peliculas;

import java.io.Serializable;
import java.util.Objects;

public class PeliculaDTO implements Serializable {
    //Crea una clase PeliculaDTO con los campos idPelicula, castelan, orixinal, anoFin, tenPoster (booleano)
    Long idPelicula;
    String castelan;
    String orixinal;
    Short anoFin;
    Boolean tenPoster;


    public PeliculaDTO() {
    }

    public PeliculaDTO(Long idPelicula, String castelan, String orixinal, Short anoFin, Boolean tenPoster) {
        this.idPelicula = idPelicula;
        this.castelan = castelan;
        this.orixinal = orixinal;
        this.anoFin = anoFin;
        this.tenPoster = tenPoster;
    }

    public PeliculaDTO(String castelan, String orixinal, Short anoFin, Boolean tenPoster) {
        this.castelan = castelan;
        this.orixinal = orixinal;
        this.anoFin = anoFin;
        this.tenPoster = tenPoster;
    }

    public PeliculaDTO(String castelan, String orixinal, Short anoFin) {
        this.castelan = castelan;
        this.orixinal = orixinal;
        this.anoFin = anoFin;
    }

    public PeliculaDTO(Long idPelicula, String castelan, String orixinal, Short anoFin) {
        this.idPelicula = idPelicula;
        this.castelan = castelan;
        this.orixinal = orixinal;
        this.anoFin = anoFin;
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

    public Boolean getTenPoster() {
        return tenPoster;
    }

    public void setTenPoster(Boolean tenPoster) {
        this.tenPoster = tenPoster;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PeliculaDTO that)) return false;
        return Objects.equals(idPelicula, that.idPelicula) && Objects.equals(castelan, that.castelan) && Objects.equals(orixinal, that.orixinal) && Objects.equals(anoFin, that.anoFin) && Objects.equals(tenPoster, that.tenPoster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPelicula, castelan, orixinal, anoFin, tenPoster);
    }

    @Override
    public String toString() {
        return "PeliculaDTO{" +
                "idPelicula=" + idPelicula +
                ", castelan='" + castelan + '\'' +
                ", orixinal='" + orixinal + '\'' +
                ", anoFin=" + anoFin +
                ", tenPoster=" + tenPoster +
                '}';
    }
}


