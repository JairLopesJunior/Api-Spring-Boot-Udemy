package api.spring.boot.udemy.rest.controller;

import api.spring.boot.udemy.domain.entity.Produto;
import api.spring.boot.udemy.domain.repository.Produtos;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private Produtos produtos;

    public ProdutoController(Produtos produtos) {
        this.produtos = produtos;
    }

    @GetMapping("{id}")
    public Produto getById(@PathVariable Integer id){
        return produtos
                .findById(id)
                .orElseThrow( () -> new ResponseStatusException(NOT_FOUND, "Cliente não encontrado" ));
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Produto save( @RequestBody Produto produto){
        return produtos.save(produto);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        produtos
                .findById(id)
                .map( produto -> {
                    produtos.delete(produto);
                    return new ResponseStatusException(NO_CONTENT, "Cliente deletado com sucesso");
                }).orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Cliente não encontrado"));
    }

    @PutMapping("{id}")
    public void atualizar(@PathVariable Integer id, @RequestBody Produto produto){
        produtos
                .findById(id)
                .map( produtoExistente -> {
                    produto.setId(produtoExistente.getId());
                    produtos.save(produto);
                    return new ResponseStatusException(NO_CONTENT, "Cliente atualizado");
                }).orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "CLiente nao encontrado"));
    }

    @GetMapping
    public List<Produto> find(Produto filtro){
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(
                        ExampleMatcher.StringMatcher.CONTAINING);
        Example example = Example.of(filtro, matcher);
        return produtos.findAll(example);
    }

}
