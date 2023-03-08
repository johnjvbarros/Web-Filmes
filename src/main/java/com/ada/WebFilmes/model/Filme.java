package com.ada.WebFilmes.model;

import java.util.List;

public class Filme {
    private String titulo;
    private int duracao; //minutos
    private String diretor;
    private String genero;
    private String sinopse;
    private String capa;

    private List<Noticia> noticias;

    private int likes;

    private int id;

    private String imdb;
    public Filme(){

    }
    public Filme(int id, String titulo, int duracao, String genero){
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.diretor = "";
        this.sinopse = "";
        this.capa="";
        this.imdb ="";
        this.likes = 0;
        this.noticias = null;
    }

    public String getImdb() {
        return imdb;
    }
    public void setImdb(String imdb) {
        this.imdb = imdb;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Noticia> getNoticias() {
        return noticias;
    }

    public void setNoticias(List<Noticia> noticias) {
        this.noticias = noticias;
    }
}
