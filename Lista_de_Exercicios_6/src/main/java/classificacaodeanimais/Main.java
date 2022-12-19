/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classificacaodeanimais;

import javax.swing.JOptionPane;

/**
 *
 * @author José Teixeira
 */
public class Main {
    
    public static void caracteristicasJacare(Animal jacare){
        jacare.setReptilMamifero("Reptil");
        jacare.setPorte("Grande");
        jacare.setIdade(2);
    }
    
    public static void caracteristicasVaca(Animal vaca){
        vaca.setReptilMamifero("Mamifero");
        vaca.setPorte("Grande");
        vaca.setIdade(5);
    }
    
    public static void caracteristicasSapo(Animal sapo){
        sapo.setReptilMamifero("Reptil");
        sapo.setPorte("Pequeno");
        sapo.setIdade(1);
    }
    
    public static void caracteristicasGato(Animal gato){
        gato.setReptilMamifero("Mamifero");
        gato.setPorte("Pequeno");
        gato.setIdade(2);
    }
    
    public static void caracteristicasCachorro(Animal cachorro){
        cachorro.setReptilMamifero("Mamifero");
        cachorro.setPorte("Medio e Pequeno");
        cachorro.setIdade(6);
    }
    
    public static void caracteristicasPorco(Animal porco){
        porco.setReptilMamifero("Mamifero");
        porco.setPorte("Pequeno");
        porco.setIdade(2);
    }
    
    public static void main(String[] args) {
        Animal jac=new Jacare();
        caracteristicasJacare(jac);
        Jacare jacare=new Jacare();
        jacare.atribuirValores();
        JOptionPane.showMessageDialog(null,"Jacaré:"
                + "\nÉ "+jac.getReptilMamifero()
                + ".\nTem porte "+jac.getPorte()
                + ".\nPossui "+jac.getIdade()+" anos"
                + "\nSe alimenta de "+jacare.getAlimentacao()
                + "\nFaz "+jacare.getSom()
                + "\nSe locomove "+jacare.getLocomocao()+".");
        
        Animal vac=new Vaca();
        caracteristicasVaca(vac);
        Vaca vaca=new Vaca();
        vaca.atribuirValores();
        JOptionPane.showMessageDialog(null,"Vaca:"
                + "\nÉ "+vac.getReptilMamifero()
                + ".\nTem porte "+vac.getPorte()
                + ".\nPossui "+vac.getIdade()+" anos"
                + "\nSe alimenta de "+vaca.getAlimentacao()
                + "\nFaz "+vaca.getSom()
                + "\nSe locomove "+vaca.getLocomocao()+".");
        
        Animal sap=new Sapo();
        caracteristicasSapo(sap);
        Sapo sapo=new Sapo();
        sapo.atribuirValores();
        JOptionPane.showMessageDialog(null,"Sapo:"
                + "\nÉ "+sap.getReptilMamifero()
                + ".\nTem porte "+sap.getPorte()
                + ".\nPossui "+sap.getIdade()+" anos"
                + "\nSe alimenta de "+sapo.getAlimentacao()
                + "\nFaz "+sapo.getSom()
                + "\nSe locomove "+sapo.getLocomocao()+".");
        
        Animal gat=new Gato();
        caracteristicasGato(gat);
        Gato gato=new Gato();
        gato.atribuirValores();
        JOptionPane.showMessageDialog(null,"Gato:"
                + "\nÉ "+gat.getReptilMamifero()
                + ".\nTem porte "+gat.getPorte()
                + ".\nPossui "+gat.getIdade()+" anos"
                + "\nSe alimenta de "+gato.getAlimentacao()
                + "\nFaz "+gato.getSom()
                + "\nSe locomove "+gato.getLocomocao()+".");
        
        Animal cach=new Cachorro();
        caracteristicasCachorro(cach);
        Cachorro cachorro=new Cachorro();
        cachorro.atribuirValores();
        JOptionPane.showMessageDialog(null,"Cachorro:"
                + "\nÉ "+cach.getReptilMamifero()
                + ".\nTem porte "+cach.getPorte()
                + ".\nPossui "+cach.getIdade()+" anos"
                + "\nSe alimenta de "+cachorro.getAlimentacao()
                + "\nFaz "+cachorro.getSom()
                + "\nSe locomove "+cachorro.getLocomocao()+".");
        
        Animal porc=new Porco();
        caracteristicasPorco(porc);
        Porco porco=new Porco();
        porco.atribuirValores();
        JOptionPane.showMessageDialog(null,"Porco:"
                + "\nÉ "+porc.getReptilMamifero()
                + ".\nTem porte "+porc.getPorte()
                + ".\nPossui "+porc.getIdade()+" anos"
                + "\nSe alimenta de "+porco.getAlimentacao()
                + "\nFaz "+porco.getSom()
                + "\nSe locomove "+porco.getLocomocao()+".");
    }
}
