/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classificacaodeanimais;

/**
 *
 * @author Jose Teixeira
 */
public class Vaca extends Animal {
    private String alimentacao;
    private String som;
    private String locomocao;

    @Override
    public void alimentacao() {
        alimentacao="Capim";
    }

    @Override
    public void som() {
        som="mull";
    }

    @Override
    public void locomocao() {
        locomocao="Andado";
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
