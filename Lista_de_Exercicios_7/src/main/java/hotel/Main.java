package hotel;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int quantidadeQuartos=50;
        Cliente[] cliente=new Cliente[quantidadeQuartos];
        int numeroQuarto=0, contador=0;
        
        //PessoaFisica[] pessoaFis = new PessoaFisica[50];
        //PessoaJuridica[] pessoaJur = new PessoaJuridica[50];
        //int contador=0;
        int tipoPessoa=-1, menu=-1;
        String[] telefone = new String [3];
        while (menu!=0) {
            menu = Integer.parseInt(JOptionPane.showInputDialog("1) Fazer checkin"
                            + "\n2) Fazer checkout"
                            + "\n3) Listas pessoas cadastradas no hotel"
                            + "\n4) Listar quantas vagas existem no hotel"
                            + "\n5) Fazer transferência entre quartos ocupados e vazios"
                            + "\n0) Sair do sistema"));
            switch(menu) {
                case 0:
                    
                break;
                case 1:
                    tipoPessoa=-1;
                    while (tipoPessoa!=0) {
                        if(contador==quantidadeQuartos){
                            JOptionPane.showMessageDialog(null,"Não há vagas!");
                        }else{
                            tipoPessoa = Integer.parseInt(JOptionPane.showInputDialog("1)PESSOA FISICA"
                                            + "\n2) PESSOA JURIDICA"
                                            + "\n0) SAIR")); 
                            numeroQuarto=0;
                            while(numeroQuarto==0){
                                numeroQuarto = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do quarto:"));
                                if(numeroQuarto>quantidadeQuartos||numeroQuarto<=0){
                                    JOptionPane.showMessageDialog(null,"Número invalido!");
                                    numeroQuarto=0;
                                }else;
                                boolean consultaQuarto=false;
                                if(contador>=1){
                                    for(int i=0;i<contador;i++){
                                        if(cliente[i].getNumeroQuarto()==numeroQuarto){
                                        consultaQuarto=true;
                                        }
                                    }
                                }
                                if(consultaQuarto){
                                    JOptionPane.showMessageDialog(null,"Quarto ocupado!");
                                    numeroQuarto=0;
                                }
                            }

                            switch(tipoPessoa) {
                            case 0:

                            break;
                            case 1:
                                String nome = JOptionPane.showInputDialog("Insira o nome:");
                                for (int i=0; i < telefone.length;  i++) {
                                        telefone[i] = JOptionPane.showInputDialog("Insira o telefone");
                                }
                                String cpf = JOptionPane.showInputDialog("Insira o CPF:");
                                String emailPessoal = JOptionPane.showInputDialog("Insira o email:");
                                PessoaFisica pessoaFisica=new PessoaFisica(nome, telefone, cpf, emailPessoal);
                                Cliente clientAux=new Cliente(pessoaFisica, numeroQuarto);
                                cliente[contador]=clientAux;
                                contador++;
                            break;
                            case 2:
                                String nome2 = JOptionPane.showInputDialog("Insira o nome:");
                                for (int i=0; i < telefone.length;  i++) {
                                        telefone[i] = JOptionPane.showInputDialog("Insira"+(i+1)+"° o telefone");
                                }
                                String cnpj = JOptionPane.showInputDialog("Insira o CNPJ:");
                                String emailCorporativo = JOptionPane.showInputDialog("Insira o email:");
                                PessoaJuridica pessoaJuridica=new PessoaJuridica(nome2, telefone, cnpj, emailCorporativo);
                                //cliente[numeroQuarto-1].setPessoaJuridica(pessoaJuridica);
                                Cliente clientAux2=new Cliente(pessoaJuridica, numeroQuarto);
                                cliente[contador]=clientAux2;
                                contador++;
                            break;
                            default:
                                JOptionPane.showConfirmDialog(null, "Opção invalida!");
                            }
                        }
                        tipoPessoa=0; 
                        JOptionPane.showMessageDialog(null,"Checkin realizado com sucesso!");
                    }
                break;
                case 2:
                    //Caso o hotel esteja vazil
                    if(contador==0){
                        JOptionPane.showMessageDialog(null,"Ainda não há pessoas hospedadas no hotel!");
                    }else{
                        int nQExcluir=Integer.parseInt(JOptionPane.showInputDialog("Informe o número do quarto:"));
                        Cliente clienteAux=new Cliente();
                        if(contador==1){
                            cliente=null;
                            contador--;
                        }else{
                            boolean condicao=false;
                            for(int i=0;i<contador;i++){
                                if(cliente[i].getNumeroQuarto()==nQExcluir){
                                    condicao=true;
                                }
                                if(condicao){
                                    clienteAux=cliente[i+1];
                                    cliente[i]=clienteAux;
                                }
                            }
                            cliente[contador-1]=null;
                            contador--;
                        }
                    } 
                    JOptionPane.showMessageDialog(null,"Checkout realizado com sucesso!");
                break;
                case 3:
                    if(contador==0){
                        JOptionPane.showMessageDialog(null,"Não há pessoas hospedadas no hotel!");
                    }else{
                        for(int i=0;i<contador;i++){
                            try{
                                JOptionPane.showMessageDialog(null,"Nome: "+cliente[i].getPessoaFisica().getNome()
                                + "\nTelefone 1: "+cliente[i].getPessoaFisica().getTelefone()[0]
                                + "\nTelefone 2: "+cliente[i].getPessoaFisica().getTelefone()[1]
                                + "\nTelefone 3: "+cliente[i].getPessoaFisica().getTelefone()[2]
                                + "\nCPF: "+cliente[i].getPessoaFisica().getCpf()
                                + "\nmail Pessoal: "+cliente[i].getPessoaFisica().getEmailPessoal()
                                + "\nNúmero do quarto: "+cliente[i].getNumeroQuarto());
                            }catch(Exception e){
                                JOptionPane.showMessageDialog(null,"Nome: "+cliente[i].getPessoaJuridica().getNome()
                                + "\nTelefone 1: "+cliente[i].getPessoaJuridica().getTelefone()[0]
                                + "\nTelefone 2: "+cliente[i].getPessoaJuridica().getTelefone()[1]
                                + "\nTelefone 3: "+cliente[i].getPessoaJuridica().getTelefone()[2]
                                + "\nCNPJ: "+cliente[i].getPessoaJuridica().getCnpj()
                                + "\nmail Corporativo: "+cliente[i].getPessoaJuridica().emailCorporativo()
                                + "\nNúmero do quarto: "+cliente[i].getNumeroQuarto());
                            }
                        }
                    }
                break;
                case 4:
                    //int[] quartosVazios=new int[quantidadeQuartos-contador];
                    boolean aux=true;
                    for(int i=1;i<=quantidadeQuartos;i++){
                        for(int j=0;j<contador;j++){
                            aux=true;
                            if(cliente[j].getNumeroQuarto()==i){
                                aux=false;
                            }
                        }
                        if(aux){
                            JOptionPane.showMessageDialog(null,"Quarto "+i+" esta vazil!");
                        }
                    }
                break;
                case 5:
                    int quartoAtual=Integer.parseInt(JOptionPane.showInputDialog("Informe o número do quarto atual:"));
                    int quartoDesejado=Integer.parseInt(JOptionPane.showInputDialog("Informe o número do quarto pretendido:"));
                    boolean teste=false;
                    for(int i=0;i<contador;i++){
                        if(quartoDesejado==cliente[i].getNumeroQuarto()){
                            teste=true;
                        }
                    }
                    if(teste){
                        JOptionPane.showMessageDialog(null,"Quarto ocupado!");
                    }else{
                        if(quartoDesejado<=50&&quartoDesejado>0){
                            for(int i=0;i<contador;i++){
                            if(quartoAtual==cliente[i].getNumeroQuarto()){
                                cliente[i].setNumeroQuarto(quartoDesejado);
                            }else{
                                if(quartoDesejado>50&&quartoDesejado<=0){
                                    JOptionPane.showMessageDialog(null,"Quarto atual inexistente!");
                                }else{
                                    JOptionPane.showMessageDialog(null,"Quarto atual não esta ocupado!");
                                }
                            }
                    }
                        }else{
                            JOptionPane.showMessageDialog(null,"Quarto desejado inexistente!");
                        }
                    }
                break;
                default:
                    JOptionPane.showConfirmDialog(null, "Opção invalida!");
            }

        }
    }
}
