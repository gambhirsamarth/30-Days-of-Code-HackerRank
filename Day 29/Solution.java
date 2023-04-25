class Result {

    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */

    public static int bitwiseAnd(int N, int K) {
        int cont=0;
        for(int i=1; i<=N; i++){            //outer loop      
							for(int j=i+1; j<=N; j++){     //inner loop
                if((i&j) < K){  //condition to check the BITAND less then the //the given number
                    if((i&j)>cont){     //to compare max and store it
                        cont = (i&j);
                    }
                }
            }
        }
        return cont;
    }

}
