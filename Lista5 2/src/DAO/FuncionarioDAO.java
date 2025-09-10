
package DAO;

import DTO.FuncionarioDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionarioDAO {
    private List<FuncionarioDTO> Funcionarios = new ArrayList<>();
    
    public void Cadastrar(FuncionarioDTO funcionario) {
        Funcionarios.add(funcionario);
        JOptionPane.showMessageDialog(null,
            "Funcionario cadastrado com sucesso!\n\n" + funcionario.toString(), "Funcionário Cadastrado"
            , JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void Listar(){
        if (Funcionarios.isEmpty()) {
            JOptionPane.showMessageDialog(
                null,
                "Bom, ainda não tem ninguém cadastrado né.\n Aí fica difícil",
                "Erro!",
                JOptionPane.ERROR_MESSAGE
            );
        } else {
            StringBuilder lista = new StringBuilder("Lista de Funcionários:\n\n");
            for (FuncionarioDTO f : Funcionarios) {
                lista.append(f).append("\n");
            }
            
            JOptionPane.showMessageDialog(
                null,
                lista.toString(),
                "Funcionários Cadastrados",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
    
}
