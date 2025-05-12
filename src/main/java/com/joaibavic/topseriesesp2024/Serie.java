
package com.joaibavic.topseriesesp2024;

public class Serie {
    private String titulo;
    private String plataforma;
    private String imagenUrl;
    private int ranking;
    private String trailerUrl;
    private String genero;
    private String categoria;

    public Serie() {}

    public Serie(String titulo, String plataforma, String imagenUrl, int ranking, String trailerUrl, String genero, String categoria) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.imagenUrl = imagenUrl;
        this.ranking = ranking;
        this.trailerUrl = trailerUrl;
        this.genero = genero;
        this.categoria = categoria;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getPlataforma() { return plataforma; }
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }

    public String getImagenUrl() { return imagenUrl; }
    public void setImagenUrl(String imagenUrl) { this.imagenUrl = imagenUrl; }

    public int getRanking() { return ranking; }
    public void setRanking(int ranking) { this.ranking = ranking; }

    public String getTrailerUrl() { return trailerUrl; }
    public void setTrailerUrl(String trailerUrl) { this.trailerUrl = trailerUrl; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
}
