public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
    
        try{
            String S = scan.nextLine();
            System.out.println(Integer.parseInt(S));
        }catch(NumberFormatException e){
            System.out.println("Bad String");
        }   
        scan.close();
    }
}
