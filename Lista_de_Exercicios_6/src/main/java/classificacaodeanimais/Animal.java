/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classificacaodeanimais;

/**
 *
 * @author José Teixeira
 */
public abstract class Animal {
    private String ReptilMamifero;
    private String porte;
    private int idade;
    
    public abstract void alimentacao();
    
    public abstract void som();
    
    public abstract void locomocao();

    public String getReptilMamifero() {
        return ReptilMamifero;
    }

    public void setReptilMamifero(String ReptilMamifero) {
        this.ReptilMamifero = ReptilMamifero;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
