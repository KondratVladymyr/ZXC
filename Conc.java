public class Conc {
    public static void main(String[] args){
        System.out.println(concatStr("ABCD","FGH"));
        System.out.println(strSize("ABCD"));
    }
    static String concatStr(String a, String b){
        return a+b;
    }
    static int strSize(String c){
        return c.length();
    }
}
