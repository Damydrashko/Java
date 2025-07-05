public class Planete {

   public String Nom;

    String Matiere;

    long Diametre;

    int Angle;

    int totalVisiteurs;

    Atmosphere atmosphere;

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

    void acceuillirVaisseau(int nombreHumains)
    {
        totalVisiteurs = totalVisiteurs+ nombreHumains;
    }

    void acceuillirVaisseau(String vaisseau)
    {
        vaisseau = vaisseau.toUpperCase();
        switch (vaisseau)
        {
            case "CHASSEUR" :
                totalVisiteurs = totalVisiteurs + 3;
                break;
            case "FREGATE" :
                totalVisiteurs = totalVisiteurs + 12;
                    break;
            case "CROISEUR" :
                totalVisiteurs = totalVisiteurs + 50;
                break;
            default:
                break;
        }
    }

    void afficherTotalVisiteurs()
    {

        if(this.totalVisiteurs > 0)
        {
            System.out.printf("Le nombre de visiteurs de la planete %s est de %d ",this.Nom,this.totalVisiteurs);
        }

    }



}

