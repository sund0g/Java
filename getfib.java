public class GetFib {

    static int fibonacci = 0;

    public static void main (String [] args) {

        int n = 0;
        double start = System.currentTimeMillis();

        switch (args[1]) {

            case "r": 
                n = recurseFindFibonacci (Integer.parseInt(args[0]));
                break;
            case "m":
                n = memoFindFibonacci (Integer.parseInt(args[0]));
                break;
            case "i":
                n = iterateFindFibonacci (Integer.parseInt(args[0]));
                break;
            default:
                break;

        }        

        double stop = (System.currentTimeMillis() - start)/1000.0; // Convert to ms to s

        System.out.println("The " + args[0].toString() + " Fibonacci number = " + n);
        System.out.println("Time = " + stop + " seconds");
    }

    private static int recurseFindFibonacci (int nthFib) {

        if (nthFib <= 1) {
            fibonacci = nthFib;
        } else {
            
            fibonacci = (recurseFindFibonacci (nthFib-1) + recurseFindFibonacci (nthFib-2));
        }

        return fibonacci;
    }

    private static int memoFindFibonacci (int nthFib) {

        int[] memo = new int[nthFib];

        if (nthFib <= 1) {
            return nthFib;
        } else {
            memo[0] = 0;
            memo[1] = 1;
            
            for (int i = 2; i < nthFib; i++) {
                memo[i] = memo[i-1] + memo[i-2];
            } 
        }

        return memo[nthFib-1] + memo[nthFib-2];
    }

    private static int iterateFindFibonacci (int nthFib) {

        int a = 0, b = 1;

        if (nthFib == 0) {
            return nthFib;
        } else {
            for (int i = 2; i < nthFib; i++) {
                int c = a + b;
                a = b;
                b = c;
            }

        }

        return a + b;
    }
}