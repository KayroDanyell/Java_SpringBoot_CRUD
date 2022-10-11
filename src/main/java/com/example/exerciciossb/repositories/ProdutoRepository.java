package com.example.exerciciossb.repositories;

import com.example.exerciciossb.model.entities.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto,Integer> {


}
