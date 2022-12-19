package hotel;


public class PessoaFisica extends Pessoa {
    
    

    public PessoaFisica(String nome, String[] telefone, String cpf, String emailPessoal) {

            super(nome, telefone);
            this.cpf = cpf;
            this.emailPessoal = emailPessoal;

    }
    public PessoaFisica() {
    }


    private String cpf, emailPessoal;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmailPessoal() {
        return emailPessoal;
    }

    public void setEmailPessoal(String emailPessoal) {
        this.emailPessoal = emailPessoal;
    }
    
}
