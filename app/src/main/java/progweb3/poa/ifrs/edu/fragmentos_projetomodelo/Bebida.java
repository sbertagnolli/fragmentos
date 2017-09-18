package progweb3.poa.ifrs.edu.fragmentos_projetomodelo;


public class Bebida {
    private String nome;
    private String descricao;
    private int idImagem;

    public static final Bebida[] bebidas = {
            new Bebida("Latte", "Café com leite", R.drawable.cafelatte),
            new Bebida("Capuccino", "Café capuccino", R.drawable.capuccino2),
            new Bebida("Chocolate", "Chocolate Quente", R.drawable.chocolate)
    };

    public Bebida(){}
    public Bebida(String nome, String descricao, int idImagem) {
        this.nome = nome;
        this.descricao = descricao;
        this.idImagem = idImagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdImagem() {
        return idImagem;
    }

    public void setIdImagem(int idImagem) {
        this.idImagem = idImagem;
    }

    @Override
    public String toString() {
        return nome ;
    }
}
