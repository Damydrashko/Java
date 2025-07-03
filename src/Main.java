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

        /**
         * Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de :
                   <La valeur d'une variable de type int >
                   Il y a quelques années cependant, elles étaient au nombre de :
                  <La valeur de la MÊME VARIABLE>
         */

        Planete pe = new Planete();

        pe.Nom= "Venus";
        pe.Diametre= 500;
        pe.Matiere="Gazeuse";

        System.out.printf("Le diametre de la planete %s qui est une planète %s est de %d",pe.Nom,pe.Matiere,pe.Diametre);

        // </editor-fold>
    }

    // </editor-fold>

}