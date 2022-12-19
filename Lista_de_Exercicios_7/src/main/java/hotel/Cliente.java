
package hotel;

public class Cliente {
    private PessoaFisica pessoaFisica;
    private PessoaJuridica pessoaJuridica;
    private int numeroQuarto;

    public Cliente() {
    }

    public Cliente(PessoaFisica pessoaFisica, int numeroQuarto) {
        this.pessoaFisica = pessoaFisica;
        this.numeroQuarto=numeroQuarto;
    }

    public Cliente(PessoaJuridica pessoaJuridica, int numeroQuarto) {
        this.pessoaJuridica = pessoaJuridica;
        this.numeroQuarto=numeroQuarto;
    }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public PessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }
    
}
