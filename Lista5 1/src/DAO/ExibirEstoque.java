
package DAO;

import DTO.Produto;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExibirEstoque {
    
    private List<Produto> produtos = new ArrayList<>();
    
    public void salvarProduto(Produto produto) {
        produtos.add(produto);
        JOptionPane.showMessageDialog(null,
            "Produto cadastrado com sucesso!\n\n" + produto.toString(), "Produto Cadastrado", JOptionPane.INFORMATION_MESSAGE);
    }
    
     public void listarProdutos() {

    StringBuilder sb = new StringBuilder("Produtos cadastrados:\n\n");

    for (Produto p : produtos) {
        sb.append("Nome: ").append(p.getNome())
          .append("\nPreço: R$ ").append(p.getPreco())
          .append("\nQuantidade: ").append(p.getQuantidade())
          .append("\n-----------------------\n");
    }

    JOptionPane.showMessageDialog(null, sb.toString(), "Estoque", JOptionPane.INFORMATION_MESSAGE);
}
}
