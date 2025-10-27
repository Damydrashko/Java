public class VaisseauDeGuerre extends Vaisseau
{
    boolean armesDesactivees = true;

    void attaque(Vaisseau autreVaisseau,String arme, int dureeAttaque)
    {
        System.out.println("Un vaisseau de type " + m_TypeVaisseau+ " attaque un vaisseau de type "+autreVaisseau.m_TypeVaisseau+" en utilisant "+ arme + " pendant "+dureeAttaque+" minute(s) "  );
        autreVaisseau.m_resistanceDuBouclier = 0 ;
        autreVaisseau.m_Blindage = autreVaisseau.m_Blindage/2;

    }

    VaisseauDeGuerre( String nom, int nombrePassager)
    {
        super(nom,nombrePassager);

    }

    public boolean ActiverOuDesactiverArmes(boolean TrueOrFalse)
    {

        if(TrueOrFalse)
        {
            armesDesactivees = true;
            System.out.println("Armes activées");
        }
        else
        {
            armesDesactivees = false;
            System.out.println("Armes désactivées");
        }

        return armesDesactivees;

    }

    @Override
    public void ActivationDuBouclier(boolean activer) {


        if (activer) {
            ActiverOuDesactiverArmes(true);
        }
        else {
            ActiverOuDesactiverArmes(false);
        }
    }
}
