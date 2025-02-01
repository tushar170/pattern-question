class Main {
    public static void main(String[] args) {
        String s = "NAMAN";
        int l = s.length();
        for (int i = 0; i < l; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
/*
N
NA
NAM
NAMA
NAMAN
*/
