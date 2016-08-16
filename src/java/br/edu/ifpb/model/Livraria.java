/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.model;

import java.util.List;

/**
 *
 * @author IFPB
 */
public class Livraria {
    
    
    private String nome;
    private List<Livro> livros;
    
    
    public Livraria(String nome){
        this.nome = nome;
        this.livros = null;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the livros
     */
    public List<Livro> getLivros() {
        return livros;
    }

    /**
     * @param livros the livros to set
     */
    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
   
    public void addLivro(Livro novo){
        this.livros.add(novo);
    }
    
    public void removerLivro(Livro livro){
        
        for(Livro l : this.livros){
            
            if(livro.getISBN() == l.getISBN()){
                this.livros.remove(livro);
                return;
            }
        }
        //livro nao encontrado
        return;
        
    }
}
