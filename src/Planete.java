public class Planete {

   public String Nom;

    String Matiere;

    long Diametre;

    int Angle;

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



}

