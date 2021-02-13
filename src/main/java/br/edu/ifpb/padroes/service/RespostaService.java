package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Postagem;

// ISP ->
public interface RespostaService {
    void adicionarResposta(Postagem postagem, Postagem resposta);
}
