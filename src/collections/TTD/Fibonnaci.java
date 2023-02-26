package collections.TTD;

public class Fibonnaci {
    public int calculer(int borne){
        if(borne < 0){
            return "Le nombre doit être positif";
        }
        if(borne == 0){
         return "0";   
        }else if(borne == 1){
            return "0 1";
        }else{
            return "0 1 1";
        }
    }
}
