package collections.TTD;

public class Fibonnaci {
    public String calculer(int borne){
        String result;
        if(borne < 0){
            result = "Le nombre doit être positif";
        }
        if(borne == 0){
         result = "0";   
        }else if(borne == 1){
            result =  "0 1";
        }else{
            result =  "0 1 1";
        }
        return result;
    }
}
