public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        // Write your code here
        int numberOfSwaps = 0;
        for(int i=0; i<n-1; i++) {
            boolean isSwapped = false;
            for(int j=0; j+i<n-1; j++) {
                if(a.get(j) > a.get(j+1)) {
                    int temp = a.get(j);
                    a.set(j,a.get(j+1));
                    a.set(j+1,temp);
                    numberOfSwaps++;
                    isSwapped = true;
                }
            }
            if(isSwapped == false)
                break;
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size()-1));

        bufferedReader.close();
    }
}
