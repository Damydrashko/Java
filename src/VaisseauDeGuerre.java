public class VaisseauDeGuerre extends Vaisseau
{
    void attaque(Vaisseau autreVaisseau,String arme, int dureeAttaque)
    {
        System.out.println("Un vaisseau de type " + m_TypeVaisseau+ " attaque un vaisseau de type "+autreVaisseau.m_TypeVaisseau+" en utilisant "+ arme + " pendant "+dureeAttaque+" minute(s) "  );
        autreVaisseau.m_resistanceDuBouclier = 0 ;
        autreVaisseau.m_Blindage = autreVaisseau.m_Blindage/2;

    }

}
