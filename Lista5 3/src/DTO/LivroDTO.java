
package DTO;

public class LivroDTO {
    
    private String Titulo, Autor;
    private int AnoDePublicacao;

    public LivroDTO(String Titulo, String Autor, int AnoDePublicacao) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.AnoDePublicacao = AnoDePublicacao;
    }

    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    public int getAnoDePublicacao() {
        return AnoDePublicacao;
    }
    public void setAnoDePublicacao(int AnoDePublicacao) {
        this.AnoDePublicacao = AnoDePublicacao;
    }

    @Override
    public String toString() {
        return "LivroDTO { " + "Título: " + Titulo + " | Autor: " + Autor + " | Ano de Publicação: " + AnoDePublicacao + " " + '}';
    }
    
    
    
}
