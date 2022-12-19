/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classificacaodeanimais;

/**
 *
 * @author José Teixeira
 */
public class Jacare extends Animal {

    private String alimentacao;
    private String som;
    private String locomocao;

    @Override
    public void alimentacao() {
        alimentacao="Carne";
    }

    @Override
    public void som() {
        som="roar";
    }

    @Override
    public void locomocao() {
        locomocao="Andado ou Nadando";
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
