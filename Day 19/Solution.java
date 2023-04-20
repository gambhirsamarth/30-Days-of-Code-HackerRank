 public int divisorSum(int n) {
        int i = 0;
        int sum = 0;
        while(i++ <= n){
            if(n % i == 0)
                sum += i;
        }
        return sum;
    }
