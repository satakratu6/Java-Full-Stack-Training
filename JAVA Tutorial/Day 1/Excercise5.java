class Exercise5{
    public static void main(String[] args) {
        
        int a=5, b=10;
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println(a+" "+b);
        int d=5, e=12;
        d=d^e;
        e=e^d;
        d=d^e;
        System.out.println(d+" "+e);

    }
}