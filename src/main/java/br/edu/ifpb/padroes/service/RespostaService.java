package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Postagem;

// FRAZÃO -> Interface Segregation Principle
public interface RespostaService {
    void adicionarResposta(Postagem postagem, Postagem resposta);
}
