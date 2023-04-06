class Result {

    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n) {
    if (n==1)
        return 1;
    else{
        return n * factorial(n-1);
    }

    }

}
