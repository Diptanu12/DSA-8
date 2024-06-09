public class multiplyNnaturalNum {
    public static void main(String[] args) {
        System.out.println(mulNum(5));
    }
    public static int mulNum(int num){
        if( num==1){
            return num;
        }
        return mulNum(num-1)*num;
    }
}
