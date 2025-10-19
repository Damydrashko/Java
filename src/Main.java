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

        VaisseauDeGuerre chasseur = new VaisseauDeGuerre();
        chasseur.m_Blindage = 156;
        chasseur.m_resistanceDuBouclier=2;
        chasseur.m_TypeVaisseau ="Chasseur";
        Vaisseau vaisseau = new Vaisseau();
        vaisseau.m_Blindage=4784;
        vaisseau.m_resistanceDuBouclier=30;
        vaisseau.m_TypeVaisseau ="Vaisseau monde";
        vaisseau.activerBouclier(vaisseau);
        chasseur.activerBouclier(chasseur);
        chasseur.attaque(vaisseau,"laser photonique",3);
        vaisseau.desactiverBouclier(vaisseau);
        System.out.println("La résistance du bouclier du vaisseau monde est de "+vaisseau.m_resistanceDuBouclier+".");


        // </editor-fold>
    }

    // </editor-fold>

}