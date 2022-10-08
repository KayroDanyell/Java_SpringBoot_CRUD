package com.example.exerciciossb.controllers;

import com.example.exerciciossb.model.entities.Produto;
import com.example.exerciciossb.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoReposit;

    @PostMapping
    public @ResponseBody Produto newProd(@Valid Produto prod){
        produtoReposit.save(prod);
        return prod;
    }

    @GetMapping
    public Iterable<Produto> allProds(){
        return produtoReposit.findAll();

    }
    @GetMapping(path = "/{id}")
    public Optional<Produto> getProd(@PathVariable int id){
        Optional<Produto> a = produtoReposit.findById(id);
        return a;
    }
    @DeleteMapping
    public int deleteProd(@RequestParam int id){
        produtoReposit.deleteById(id);
        return id;
    }
}
