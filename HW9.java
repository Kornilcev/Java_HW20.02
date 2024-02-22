package lesson9;

public class HW9 {
    public static void main(String[] args) {


        System.out.println(firstLetters("Однажды в студеную зимнюю пору"));
        System.out.println(countSymbol("London is a capital", 'o'));
        System.out.println(formatSql(
                new String[] {"id", "city", "year", "active", "climate"},
                new String[] {"1", "Helsinki", null, null, "cool"}
        ));
    }



    public static String firstLetters(String a){
        StringBuilder b = new StringBuilder();
        String [] w = a.split(" ");
        for (int i = 0; i < a.length(); i++) {
b.append(w[i].charAt(0));
        } return b.toString();
    }
public static int countSymbol(String s, char c) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == c) {
            count++;
        }
    } return count;
}
public static String formatSql(String [ ] params, String [] vals){
StringBuilder b = new StringBuilder("SELECT * FROM user WHERE ");
    for (int i = 0; i < params.length; i++) {
        if(vals[i] != null){
            if(i != 0){
                b.append(" AND ");
            }
            b.append(params[i]);
            b.append(" = ");
            b.append(quote(vals[i]));
        }
    }
    b.append(";");
        return b.toString();
}
    public static String quote(String s) {
        return "'" + s + "'";
    }
}
