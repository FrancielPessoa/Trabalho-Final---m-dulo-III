package trabalho.orm.model;

import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedQueries({
    @NamedQuery(name="Empresa.buscaTodas", query="select e from Empresa e"),
    @NamedQuery(name="Empresa.buscaPorCnpj", 
            query="select e from Empresa e where cnpj = :cnpj")
})

@Table(name="empresa")
public class Empresa {
    @Id
    private String cnpj;
    private String nome;
    private String endereco;
    private String tamanho; 
            
    @OneToMany (mappedBy = "empresa")
    private List<Funcionario> funcionario;

    public Empresa() {
    }

    public Empresa(String cnpj, String nome, String endereco, String tamanho) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.tamanho = tamanho;
    }

    public Empresa(String nome, String endereco, String tamanho) {
        this.nome = nome;
        this.endereco = endereco;
        this.tamanho = tamanho;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public List<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }
   
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.cnpj);
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
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Empresa: " + "CNPJ = " + cnpj + ", Nome = " + nome + ", Endereço = " + endereco + ", Tamanho = " + tamanho;
    }
    
}
