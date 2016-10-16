package trabalho.orm.model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Funcionario {
    @Id
    private String matricula;
    private String nome;
    private String  funcao;
    private String endereco;
    @ManyToOne
    @JoinColumn(name = "empresa_cnpj")
    private Empresa empresa;


    public Funcionario() {
    }

    public Funcionario(String matricula, String nome, String funcao, String endereco) {
        this.matricula = matricula;
        this.nome = nome;
        this.funcao = funcao;
        this.endereco = endereco;
    }

    public Funcionario(String nome, String funcao, String endereco) {
        this.nome = nome;
        this.funcao = funcao;
        this.endereco = endereco;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Funcionário: " + "Matrícula = " + matricula + ", Nome = " + nome + ", Função = " + funcao + ", endereço = " + endereco;
    }
    
    
    
}
