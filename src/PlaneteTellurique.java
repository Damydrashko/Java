public class PlaneteTellurique extends Planete implements Habitable{

    PlaneteTellurique(String Nom) {
        super(Nom);
    }


    @Override
    public void acceuillirVaisseau(Vaisseau nouveauVaisseau) {

        if (nouveauVaisseau instanceof  VaisseauDeGuerre ){((VaisseauDeGuerre) nouveauVaisseau).ActiverOuDesactiverArmes(false);}

        totalVisiteurs = totalVisiteurs + nouveauVaisseau.m_NombrePassager;
        String phrase;

        if ((totalVisiteurs == 0))
        {
            phrase = "\n Actuellement, aucun passager n'a accosté sur cette planète";
        }
        else
        {
            phrase = "\nLa planète compte actuellement " + totalVisiteurs + " visiteur";
        }

        System.out.println(phrase);

    }


}


