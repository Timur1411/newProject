public class test3 {
    public static void main(String[] args){
        System.out.println(test(1,2,3,4,5));
        System.out.println(test(1.2,1.3,1.4,1.5));
        System.out.println(test(1>2,2<3,3==3));
        System.out.println(test('H','E','L','L','O'));
    }
    static int test(int a,int b,int c,int d,int e){
        return a+b+c+d+e;
    }
    static double test(double a,double b, double c, double d){
        return a+b+c+d;
    }
    static boolean test(boolean a,boolean b, boolean c){
        return a&b&c;
    }
    static String test(char a,char b, char c, char d, char e){
        String s=a+""+b+""+c+""+d+""+e;
        return s;
    }
}
