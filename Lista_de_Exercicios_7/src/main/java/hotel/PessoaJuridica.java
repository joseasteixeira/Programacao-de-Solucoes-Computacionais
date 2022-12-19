package hotel;


public class PessoaJuridica extends Pessoa{
	
public PessoaJuridica(String nome, String[] telefone, String cnpj, String emailCorporativo) {
		
		super(nome, telefone);
		this.cnpj = cnpj;
		this.emailCorporativo = emailCorporativo;
		
	}

	private String cnpj, emailCorporativo;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cpf) {
        this.cnpj = cnpj;
    }

    public String emailCorporativo() {
        return emailCorporativo;
    }

    public void setEmailPessoal(String emailCorporativo) {
        this.emailCorporativo = emailCorporativo;
    }

    public String getEmailCorporativo() {
        return emailCorporativo;
    }

    public void setEmailCorporativo(String emailCorporativo) {
        this.emailCorporativo = emailCorporativo;
    }
    
}
