/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.webservice;

import br.edu.ifpb.dao.LivrariaDAO;
import br.edu.ifpb.dao.LivrariaFacadeREST;
import br.edu.ifpb.model.Livraria;
import br.edu.ifpb.model.Livro;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author IFPB
 */
@WebService(serviceName = "LivrariaService")
public class LivrariaService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "addLivro")
    public void addLivro(@WebParam(name = "titulo") String titulo, @WebParam(name = "editora") String editora, @WebParam(name = "isbn") int isbn, @WebParam(name = "edicao" )String edicao, @WebParam(name = "autor") String autor) {
        Livraria nova = new Livraria("nova");
        Livro liv = new Livro(titulo, editora, isbn, edicao, autor);
        nova.addLivro(liv);
        LivrariaFacadeREST dao = new LivrariaFacadeREST();
        dao.create(nova);
        System.out.println("Livro"+liv.getTitulo()+" Adicionado");
    }
}
