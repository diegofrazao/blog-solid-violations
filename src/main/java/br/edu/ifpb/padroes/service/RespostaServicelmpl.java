package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Postagem;
import br.edu.ifpb.padroes.modelo.PostagemResposta;

import java.util.Date;

/* SRP, ISP ->
    conforme os princípios SRP e ISP, esta Interface foi criada, a qual contém apenas os métodos correspondentes a RespostaService.
*/
public class RespostaServicelmpl implements RespostaService{

    private PostagemDAO postagemDAO = new PostagemDAO("banco.db");

    @Override
    public void adicionarResposta(Postagem postagem, Postagem resposta) {
        PostagemResposta postagemResposta = new PostagemResposta();
        postagemResposta.setPostagem(postagem);
        postagemResposta.setUsuario(resposta.getUsuario());
        postagemResposta.setData(new Date());
        this.postagemDAO.addPostagemResposta(postagemResposta);
    }
}
