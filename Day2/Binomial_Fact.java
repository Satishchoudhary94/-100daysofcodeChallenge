public class Binomial_Fact {
    public static int Factorial(int n){
        int f =1;
        for(int i=1;i<=n;i++){
            f= f*i;
        }
        return f;
    }
    public static int Binomial_Facts(int n, int r){
        int fact_n= Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial(n-r);
        int Binomial_Fact = fact_n/(fact_r*fact_nmr);
        return Binomial_Fact;
    }
    public static void main(String[] args) {
        System.out.println(Binomial_Facts(9, 6));
        
    }
    
}
