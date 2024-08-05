class ModularExpo {

    private static void expo(int x, int y, int p) {
        int result = 1;
        while (y > 0) {
            if ((y & 1) != 0) {
                result = (result * x) % p;
            }
            y = y >> 1;
            x = (x * x) % p;
        }
        System.out.println("Answer = " + result);
    }

    public static void main(String[] args) {
        int x = 2, y = 33, p = 15;

        expo(x, y, p);
    }

}