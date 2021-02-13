package br.edu.ifpb.padroes.modelo;

public class Postagem {

    private Long id;
    private String titulo;
    protected Usuario usuario;
    private String mensagem;
    // OCP ->
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

    // LSP ->
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

    // OCP ->
    public String getPostagemTipo() {
        return postagemTipo;
    }

    // OCP ->
    public void setPostagemTipo(String postagemTipo) {
        this.postagemTipo = postagemTipo;
    }
}
