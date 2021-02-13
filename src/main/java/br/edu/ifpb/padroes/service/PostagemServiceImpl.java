package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Postagem;

/* SRP, ISP ->
    conforme os princípios SRP e ISP, PostagemServiceImpl implementa apenas os métodos correspondentes a Postagem
*/

public class PostagemServiceImpl implements PostagemService{

    private PostagemDAO postagemDAO = new PostagemDAO("banco.db");

    // OCP -> método alterado, de acordo com a modificação do enum para String condicionais não mais necessários
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
