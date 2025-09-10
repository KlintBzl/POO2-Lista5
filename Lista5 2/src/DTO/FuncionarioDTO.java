
package DTO;

public class FuncionarioDTO {
    
    private String Nome, Cargo;
    private float Salario;

    public FuncionarioDTO(String Nome, String Cargo, float Salario) {
        this.Nome = Nome;
        this.Cargo = Cargo;
        this.Salario = Salario;
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public String getCargo() {
        return Cargo;
    }
    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    public float getSalario() {
        return Salario;
    }
    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    @Override
    public String toString() {
        return "FuncionarioDTO{ " + "Nome: " + Nome + " | Cargo: " + Cargo + " | Salario: " + Salario + '}';
    }
    
}
