package heranca.exercicios.models;

public abstract class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;

    protected Pessoa() {
    }

    protected Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    protected Pessoa(String nome) {
        this.nome = nome;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return STR."Pessoa{nome='\{nome}\{'\''}, endereco='\{endereco}\{'\''}, telefone='\{telefone}\{'\''}\{'}'}";
    }
}
