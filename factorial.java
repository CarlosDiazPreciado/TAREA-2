public class factorial {
    public int fac (int a){
        if (a <=0)
            return 1;
        else 
            return (a* fac(a-1));
    }
}