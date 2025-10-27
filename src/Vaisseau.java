public abstract class Vaisseau {


    /**
     * Représente le nombre de passager du vaisseau
     */
    int m_NombrePassager;

    /**
     * Représente le type de vaisseau
     */
    String m_TypeVaisseau;

    /**
     * Représente le blindage du vaisseau
     */
    int m_Blindage;

    /**
     * Reorésente la résistance du bouclier du vaisseau
     */
    int m_resistanceDuBouclier;




    Vaisseau()
    {

    }
    public Vaisseau(String typeDuVaisseau,int nbPassager)
    {
        m_TypeVaisseau = typeDuVaisseau;
        m_NombrePassager = nbPassager;
    }


     public void ActivationDuBouclier (boolean activer)
    {
        if (activer)
        {

            System.out.println("Activation du bouclier d'un vaisseau de type " +this.m_TypeVaisseau + ".");
        }
        else
        {
            System.out.println("Désactivation du bouclier d'un vaisseau de type " + this.m_TypeVaisseau + ".");
        }

    }



}
