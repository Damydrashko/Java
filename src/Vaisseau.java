public class Vaisseau {


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


    Vaisseau(String typeDuVaisseau)
    {
        m_TypeVaisseau = typeDuVaisseau;
    }

    Vaisseau()
    {

    }

    void activerBouclier(Vaisseau vaisseau)
    {
        System.out.println("Activation du bouclier d'un vaisseau de type " +vaisseau.m_TypeVaisseau + ".");

    }

    void desactiverBouclier(Vaisseau vaisseau) {
        System.out.println("Désactivation du bouclier d'un vaisseau de type " + vaisseau.m_TypeVaisseau + ".");
    }










}
