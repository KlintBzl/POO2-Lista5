
package DAO;

import DTO.LivroDTO;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LivroDAO {
    private List<LivroDTO> livros = new ArrayList<>();
    
    public void CadastrarLivro(LivroDTO livrodto){
        livros.add(livrodto);
        JOptionPane.showMessageDialog(null,
            "Livro cadastrado com sucesso!\n\n" + livros.toString(), "Livro Cadastrado"
            , JOptionPane.INFORMATION_MESSAGE);
    }
    
    private boolean Apagar(String titulo){
        
        return livros.removeIf(l -> l.getTitulo().equalsIgnoreCase(titulo));
        
        
    }
    
    public boolean ApagarLivro(String titulo){
        if(Apagar(titulo)){
            
            JOptionPane.showMessageDialog(null,
                    "Removido com sucesso!", "CERTO!",
                    JOptionPane.INFORMATION_MESSAGE);
            return livros.removeIf(l -> l.getTitulo().equalsIgnoreCase(titulo));
            
        }else{
            JOptionPane.showMessageDialog(null,
                    "Ainda não temos o livro solicitado, ou já foi apagado do cadastro", "ERRO!",
                    JOptionPane.ERROR_MESSAGE);
            
            return false;
        }
        
    }
    
    public void Listar(){
        if(livros.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não há uma livros cadastrados.");
        }else{
            StringBuilder lista = new StringBuilder("Livros cadastrados:\n\n");

        for (LivroDTO livro : livros) {
            lista.append("> ")
                 .append(livro.getTitulo())
                 .append("  ")
                 .append(livro.getAutor())
                 .append(" ")
                 .append(livro.getAnoDePublicacao())
                 .append("\n");
        }

        JOptionPane.showMessageDialog(null, lista.toString(), "Listagem", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}
