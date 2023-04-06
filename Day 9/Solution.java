public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
         int result = 0;
 
    // We'll keep iterating till our original number becomes 0
    while (n!=0)
    {
        // x variable stores the original number left-shifted by 1
        int x = n<<1;
        
        // Taking AND operation and storing the result in n
        n = n & x;
 
        result++;
    }
    System.out.print(result);
        bufferedReader.close();
    }
}
