import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{

    // <editor-fold defaultstate="Collapsed" desc="Points d'entrée de l'applicaiton">
    /**
     * Points d'entrée de l'applicaiton
     * @param args
     */
    public static void main(String[] args)
    {
        // <editor-fold defaultstate="Collapsed" desc="Exo 1">

        Planete pe = new Planete();
        pe.Nom  = "Venus";
        pe.Angle = -3542;
        pe.rotation(pe);


        pe.afficherTotalVisiteurs();

        Atmosphere a = new Atmosphere();
        a.tauxSodium = 8.896f;
        a.tauxArgon = 8;
        a.tauxAzote =99;
        a.tauxDioxyde = 88;
        a.tauxHelium =72.45f;
        a.tauxHydrogene =12;


        pe.atmosphere = a;


        System.out.printf("le taux d'atmosphère de sodium de la plante %s est de %.4f %%",pe.Nom,pe.atmosphere.tauxSodium);

        // </editor-fold>
    }

    // </editor-fold>

}