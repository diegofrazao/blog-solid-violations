package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Postagem;

// ISP ->
public class PostagemServiceImpl implements PostagemService{

    private PostagemDAO postagemDAO = new PostagemDAO("banco.db");

    // OCP ->
    @Override
    public void adicionarPostagem(Postagem postagem) {
        this.postagemDAO.adicionarPostagem(postagem);
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
