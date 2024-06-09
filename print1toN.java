public class print1toN {
    public static void main(String[] args) {
        printNum(1);
    }

    private static void printNum(int n) {
        if(n == 6){
            System.out.print(n + " ");
            return;
        }
        printNum(n + 1);
        System.out.print(n + " ");
    }
}
