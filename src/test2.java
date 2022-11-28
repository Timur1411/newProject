public class test2 {
    public static void main(String[] args) {
        System.out.print(result("a","a","a","a","a","a"));
        qwe(1);
    }
    static String result(String...strings){
        if(strings.length==0){
            return "";
        }
        var a="";
        for(String s:strings){
            a+=" "+s;
        }
        return a;
    }
    static void qwe(int a){
        int b=2;
        int c=b;
        System.out.println(b);
        System.out.println(c);
    }
}