package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Postagem;

// FRAZÃO -> Interface Segregation Principle
public interface PostagemService {

    void adicionarPostagem(Postagem postagem);
    void removerPostagem(Postagem postagem);
    void atualizarPostagem(Postagem postagem);
}
