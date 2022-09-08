import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Actividad4 {
    static boolean esCurp(String curp){
        Pattern pat = Pattern.compile("[A-Z][AEIOU][A-Z]{2}[0-9]{6}[HM](?:AS|B[CS]|C[CLMSH]|D[FG]|G[TR]|HG|JC|M[CNS]|N[ETL]|OC|PL|Q[TR]|S[PLR]|T[CSL]|VZ|YN|ZS)[A-Z[^AEIOU]]{3}[0-9|A-Z][0-9]");
        Matcher mat = pat.matcher(curp);
        return mat.matches();
    }

    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("No se ingreso un argumento");
        }else{
            if(esCurp(args[0])) System.out.println(args[0] +" es un CURP");
            else System.out.println(args[0] + " no es un CURP");
        }
    }
}
