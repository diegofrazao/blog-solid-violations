package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Postagem;

/* SRP, ISP ->
    conforme os princípios SRP e ISP, esta Interface foi criada, a qual contém apenas os métodos correspondentes a RespostaService.
*/
public interface RespostaService {
    void adicionarResposta(Postagem postagem, Postagem resposta);
}
