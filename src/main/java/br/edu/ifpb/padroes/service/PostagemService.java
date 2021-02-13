package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Postagem;

/* SRP, ISP ->
    conforme os princípios SRP e ISP, esta Interface foi criada, a qual contém apenas os métodos correspondentes a postagem.
*/

public interface PostagemService {

    void adicionarPostagem(Postagem postagem);
    void removerPostagem(Postagem postagem);
    void atualizarPostagem(Postagem postagem);
}
