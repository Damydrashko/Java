public class Planete {

   public String Nom;

    long Diametre;

    int Angle;

    int totalVisiteurs;

    Atmosphere atmosphere;

    Vaisseau vaisseauActuellementAccoste;

    String Forme = "Sphérique";

    int NbPlanetesDecouvertes = 0;

    Planete()
    {
        NbPlanetesDecouvertes++;

    }

    Planete(String Nom)
    {
        this.Nom = Nom;
    }


    int CalculerTour (int angle)
    {
        int nbtour;

        nbtour = angle/360;
        return nbtour;

    }

    void revolution (Planete p)
    {
        int nbtour = CalculerTour(p.Angle);

        System.out.printf("%s a effectué %d tours complet autour de son étoile.",p.Nom,nbtour);
    }

    void rotation (Planete p)
    {
        int nbtour = CalculerTour(p.Angle);

        System.out.printf("%s a effectué %d tours complet sur elle-même.",p.Nom,nbtour);
    }




     void afficherTotalVisiteurs()
    {

        if(this.totalVisiteurs > 0)
        {
            System.out.printf("\n Le nombre de visiteurs de la planete %s est de %d ",this.Nom,this.totalVisiteurs);
        }
        else
        {
            System.out.printf("\n La planète %s n'acceuille pas de passager",this.Nom);
        }

    }


    static String expansion(double distance)
    {
        String phrase = null;
        if (distance < 14)
        {
            phrase = "Oh lala mais c'est super rapide !";
        }
        else
        {
            phrase = "Je rêve ou c'est plus rapide que la lulmière ?";
        }
        return phrase;
    }

}

