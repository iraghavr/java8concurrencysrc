package deutsch;

public class Test {
    public static void main(String[] args) {
        Integer x = 3;
        Integer y = null;
        java.lang.String s = "";
        try {
            System.out.println(Integer.compareUnsigned(x,3)==0 || Integer.compareUnsigned(y,0)==0);
        }
        catch (Exception e){
            System.out.println(e.getClass().toString());
        }
        try {
            System.out.println(y.compareTo(null)==0 || true);
        }
        catch (Exception e){
            System.out.println(e.getClass().toString());
        }
    }
}
