package com.ada.WebFilmes.dao;

import com.ada.WebFilmes.model.Filme;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class FilmeDAO {
    private static List<Filme> filmes = new ArrayList<>();
   private int proximoId = 1;
    public void adicionar(Filme filme) {
        filme.setId(proximoId++);
        filmes.add(filme);
    }

    public void atualizar(Filme Filme) {
        for (int i = 0; i < filmes.size(); i++) {
            Filme f = filmes.get(i);
            if (f.getId() == Filme.getId()) {
                filmes.set(i, Filme);
                break;
            }
        }
    }

    public void remover(int id) {
        filmes.removeIf(f -> f.getId() == id);
    }

    public Filme buscarPorId(int id) {
        return filmes.stream()
                .filter(f -> f.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Filme> buscarTodos() {
        return filmes;
    }
    }

