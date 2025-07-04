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




        // </editor-fold>
    }

    // </editor-fold>

}