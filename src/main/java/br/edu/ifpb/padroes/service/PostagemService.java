package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Postagem;

// ISP ->
public interface PostagemService {

    void adicionarPostagem(Postagem postagem);
    void removerPostagem(Postagem postagem);
    void atualizarPostagem(Postagem postagem);
}
