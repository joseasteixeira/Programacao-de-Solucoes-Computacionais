/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classificacaodeanimais;

/**
 *
 * @author Jose Teixeira
 */
public class Gato extends Animal {
    private String alimentacao;
    private String som;
    private String locomocao;

    @Override
    public void alimentacao() {
        alimentacao="ração para gato";
    }

    @Override
    public void som() {
        som="mial";
    }

    @Override
    public void locomocao() {
        locomocao="andando";
    }
    
    public void atribuirValores(){
        this.alimentacao();
        this.som();
        this.locomocao();
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public String getSom() {
        return som;
    }

    public String getLocomocao() {
        return locomocao;
    }
    
}
