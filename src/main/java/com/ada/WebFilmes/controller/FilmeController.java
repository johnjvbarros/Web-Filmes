package com.ada.WebFilmes.controller;

import com.ada.WebFilmes.dao.FilmeDAO;
import com.ada.WebFilmes.model.Filme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/filme")
public class FilmeController {
   @Autowired
   private FilmeDAO filmeDAO;
   @GetMapping("/listar")
   public String listar(Model model) {
      List<Filme> lista = filmeDAO.buscarTodos();
      model.addAttribute("filmes", lista);
      return "filme_listar";
   }
   @GetMapping("/editar/{id}")
   public String editar(@PathVariable int id, Model model){
      Filme filme = filmeDAO.buscarPorId(id);
      model.addAttribute("filme",filme);
      return "filme_editar";
   }

   @GetMapping("/{id}")
   public String visualizar(@PathVariable int id, Model model){
      Filme filme = filmeDAO.buscarPorId(id);
      model.addAttribute("filme",filme);
      return "filme";
   }
   @PostMapping("/editar")
   public String atualizar(Filme filme) {
      filmeDAO.atualizar(filme);
      return "redirect:/filme/listar";
   }

   @GetMapping("/remover/{id}")
   public String remover(@PathVariable int id) {
      filmeDAO.remover(id);
      return "redirect:/filme/listar";
   }

   @GetMapping("/novo")
   public String novo(Model model) {
      model.addAttribute("filme", new Filme());
      return "filme_novo";
   }
   @PostMapping("/novo")
   public String adicionar(Filme filme) {
      filmeDAO.adicionar(filme);
      return "redirect:/filme/listar";
   }
}
