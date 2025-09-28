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

        Planete venus = new Planete();
        venus.Nom  = "Venus";
        venus.Angle = -3542;
        venus.rotation(venus);


        venus.afficherTotalVisiteurs();

        Atmosphere a = new Atmosphere();
        a.tauxSodium = 8.896f;
        a.tauxArgon = 8;
        a.tauxAzote =99;
        a.tauxDioxyde = 88;
        a.tauxHelium =72.45f;
        a.tauxHydrogene =12;


        venus.atmosphere = a;

        System.out.printf("Le taux d'atopshère de la planète %s est composé de : \n",venus.Nom);
        System.out.printf("le taux de sodium est de %.2f %% \n",venus.atmosphere.tauxSodium);
        System.out.printf("Le taux de d'argon est de %.2f %% \n",venus.atmosphere.tauxArgon);
        System.out.printf("le taux d'azote est de %.2f %% \n",venus.atmosphere.tauxAzote);
        System.out.printf("le taux de dioxyde est de %.2f %% \n",venus.atmosphere.tauxDioxyde);
        System.out.printf("le taux de d'helium est de %.2f %% \n",venus.atmosphere.tauxHelium);
        System.out.printf("le taux de d'hydrogene est de %.2f %% \n",venus.atmosphere.tauxHydrogene);


        // </editor-fold>
    }

    // </editor-fold>

}