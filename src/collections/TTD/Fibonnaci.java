package collections.TTD;

public class Fibonnaci {
    public String calculer(int borne){
        String result;
        if (borne < 0) {
            return "Le nombre doit être positif";
        } else if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "0 1";
        } else {
            String avant = "0";
            String apres = "0 1";
            for (int i = 3; i <= n; i++) {
                String apres = courant + avant + " ";
                avant = courant;
                courant = apres;
                result += apres;
            }
        }
        return result;
    }
}
