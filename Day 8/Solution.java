class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> phonebook = new HashMap<>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            
            phonebook.put(name, phone);
            // Write code here
        }
        while(in.hasNext()){
            String name = in.next();
            if(phonebook.containsKey(name)){
                int phone = phonebook.get(name);
                System.out.println(name + "=" + phone);
            }else{
                System.out.println("Not found");
            }
            
            
            // Write code here
        }
        in.close();
    }
}
