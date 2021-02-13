package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Usuario;

import java.sql.Connection;
import java.util.List;

/* DIP ->
    Interface generalizada para UsuarioDAO
 */

public interface UsuarioDAO {

    public Connection connect();

    public void addUsuario(Usuario usuario);

    public void updateUsuario(Usuario usuario);

    public void deleteUsuario(Usuario usuario);

    public void readUsuarios();

    public List<Usuario> listUsuarios();

    public Usuario getUsuario(Long id);

    public void trataExcecao(Exception ex);

}
