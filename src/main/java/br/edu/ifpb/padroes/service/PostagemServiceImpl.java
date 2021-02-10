package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Postagem;

// FRAZÃO -> Interface Segregation Principle
public class PostagemServiceImpl implements PostagemService{

    private PostagemDAO postagemDAO = new PostagemDAO("banco.db");

    @Override
    public void adicionarPostagem(Postagem postagem) {
        if (postagem.getPostagemTipo().equals(Postagem.PostagemTipo.PUBLICA)) {
            this.postagemDAO.addPostagemPublica(postagem);
        } else if (postagem.getPostagemTipo().equals(Postagem.PostagemTipo.PRIVADA)) {
            this.postagemDAO.addPostagemPrivada(postagem);
        }
    }

    @Override
    public void removerPostagem(Postagem postagem) {
        this.postagemDAO.deletePostagem(postagem);
    }

    @Override
    public void atualizarPostagem(Postagem postagem) {
        this.postagemDAO.updatePostagem(postagem);
    }
}
