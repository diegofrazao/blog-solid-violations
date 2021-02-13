package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Usuario;

import java.util.List;

/* SRP, ISP ->
    conforme o princípio SRP e ISP, esta Interface foi criada,
    a qual contém apenas os métodos correspondentes as operações de usúario.
*/

public interface UsuarioService {
    void criarUsuario(Usuario usuario);
    void atualizarUsuario(Usuario usuario);
    void removerUsuario(Usuario usuario);
    List<Usuario> listarUsuarios(Usuario usuario);
    Usuario recuperarUsuario(Long id);
}
