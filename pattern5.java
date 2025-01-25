class Main {
    public static void main(String[] args) {
        int s =0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                s++;
                System.out.print((char)(s+64)+" ");
            }
        System.out.println();
        }
    }
}
/*
A 
B C 
D E F 
G H I J 
K L M N O 
*/
