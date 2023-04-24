import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class FirstNameComparator implements Comparator<Users> {
    
    @Override
    public int compare(Users user1, Users user2) {
        return user1.getFirstName().compareToIgnoreCase(user2.getFirstName());
    }
        
}

class Users {
    
    String firstName;
    String emailID;
    
    Users(String firstName, String emailID) {
        this.firstName = firstName;
        this.emailID = emailID;
    }
      
    public String getFirstName() {
        return firstName;
    }
    
    public String getEmailID() {
        return emailID;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        List<Users> usersTable = new ArrayList<Users>();
        Pattern pattern = Pattern.compile("\\b[\\w.%+-]+@gmail\\.com\\b");
        
        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];
                
                Matcher matcher = pattern.matcher(emailID);
                if (matcher.find()) 
                    usersTable.add(new Users(firstName, emailID));
                
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        
        Collections.sort(usersTable, new FirstNameComparator());
        usersTable.stream().map(Users::getFirstName).forEach(System.out::println);
    }
    
    
}
