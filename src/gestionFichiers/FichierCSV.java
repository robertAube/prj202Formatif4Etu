package gestionFichiers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Robert Aubé
 */
public abstract class FichierCSV {
    private static char fSep = File.separatorChar;

    private static String dossier = System.getProperty("user.dir") + fSep + "_fichiers" + fSep;

    /**
     * Lit un fichier CSV et le traite
     *
     * @param nomFichier le nom du fichier à lire
     * @param separateur le caractère qui sépare chaque champ
     * @param avecTitre  si ce paramètre est à <b>true</b>, la première ligne du fichier est ignoré.
     */
    protected void lireFichier(String nomFichier, char separateur, boolean avecTitre) {
        String ligne;
        String tabChamps[];

        try {
            BufferedReader entree = new BufferedReader(new FileReader(dossier + nomFichier));
            ligne = entree.readLine();
            while (ligne != null) {
                if (avecTitre) {
                    avecTitre = false;
                } else {
                    if (ligne != "") {
                        tabChamps = ligne.split(String.valueOf(separateur));
                        traiterLigne(tabChamps);
                    }
                }
                ligne = entree.readLine();
            }
            entree.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /**
     * Cette méthode reçoit une ligne du fichier CSV sous forme d'un tableau.
     * Le 1er champ de la ligne sera à l'indice 0, le second à l'indice 1, etc
     *
     * @param tabChamps tableau des champs d'une ligne
     */
    protected abstract void traiterLigne(String tabChamps[]);
}
