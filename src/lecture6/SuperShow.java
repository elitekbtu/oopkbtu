package  lecture6;

public class SuperShow {
    public String str = "SuperStr";
    public void show( ) {
        System.out.println("Super.show:" + str);
    }
}
class ExtendShow extends SuperShow {
    public String str = "ExtendedStr";
    public void show( ) {
        System.out.println("Extend.show:" + str);}
    public static void main (String[] args) {
        ExtendShow ext = new ExtendShow( );
        SuperShow sup = ext;
        sup.show( );
        System.out.println("ext.str = " + ext.str);
    }
}