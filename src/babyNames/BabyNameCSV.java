package babyNames;

import java.util.*;

/**
 * 420-202-RE Traitement de données orienté objet
 * @author //todo indiquez nom, prénom et groupe
 */
public class BabyNameCSV {
    private Map<String, Integer> mapCompteurPrenom;
    private Set<String> setEthnie;

    public BabyNameCSV() {
        //todo initialiser les données
        //todo lire fichier csv (une ligne)
        System.out.println(this);
    }

    @Override
    public String toString() {
        return toStringMapPrenom() + toStringSetEthnie();
    } // pas à modifier

    private String toStringMapPrenom() {
        //todo Retourne une String avec le nombre de noms différents & chaque nom trié en ordre alphabétique, capitalisé et associé au nombre de fois qu’on le retrouve tout ethnie confondue
        return "";
    }

    private String toStringSetEthnie() {
        //todo Retourne une String avec Le nombre d’ethnies différents et La liste des ethnies avec leur nom capitalisé
        return "";
    }

    public static String capitalizeString(String str) {
        String[] mots = str.split("\\s"); // sépare la chaîne en mots
        StringBuilder sb = new StringBuilder();

        for (String mot : mots) {
            mot = mot.toLowerCase(); // Pour un mot tout en majuscule, on veut aussi capitaliser
            if (mot.length() > 0) { // vérifie si le mot est vide
                char firstChar = Character.toUpperCase(mot.charAt(0)); // met en majuscule la première lettre
                String rest = mot.substring(1); // récupère le reste de la chaîne
                sb.append(firstChar).append(rest).append(" "); // ajoute le mot capitalisé à la nouvelle chaîne
            }
        }

        return sb.toString().trim(); // renvoie la nouvelle chaîne sans espaces superflus
    }


    public static void main(String[] args) {
        new BabyNameCSV();
    } // pas à modifier
}