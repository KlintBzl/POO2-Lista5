
package DTO;

public class Produto {
    private String Nome;
    private double Preco;
    private int quantidade;

    public Produto(String Nome, double Preco, int quantidade) {
        this.Nome = Nome;
        this.Preco = Preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public double getPreco() {
        return Preco;
    }
    public void setPreco(double Preco) {
        this.Preco = Preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{ " + "Nome: " + Nome + " | Preco: " + Preco + " | quantidade: " + quantidade + '}';
    }
    
    
}
