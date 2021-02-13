package br.edu.ifpb.padroes.modelo;

public class Postagem {

    private Long id;
    private String titulo;
    protected Usuario usuario;
    private String mensagem;

    /* OCP ->
        PostagemTipo alterado para String, assim não haverá necessidade de crição dos métodos addPostagemPublica
        e addPostagemPrivada */

    private String postagemTipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // LSP -> verificar classe PostagemResposta
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    // OCP -> retorno do método alterado, conforme modifação do enum para String
    public String getPostagemTipo() {
        return postagemTipo;
    }

    // OCP -> parâmetro do metodo alterado, conforme modificação do enum para String
    public void setPostagemTipo(String postagemTipo) {
        this.postagemTipo = postagemTipo;
    }
}
