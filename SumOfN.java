public class SumOfN {
    public static void main(String[] args) {

        System.out.println(sumN( 5));

    }
    public static int sumN(int n){
      if(n==1){
          return 1;
      }
      int recAns=sumN(n-1);
        return recAns+n;
    }
}
