public Student(String firstName, String lastName, int id, int testScore[]){
        super(firstName,lastName,id);
        testScores = new int[testScore.length];
        for(int i=0; i<testScore.length; i++){
            testScores[i] = testScore[i];
        }
    }   
    public char calculate(){
        int sum = Arrays.stream(testScores).sum();
        int avg = sum/testScores.length;
        return (avg<=100 && avg>=90) ? 'O' : 
               (avg<90 && avg>=80) ? 'E' :
               (avg<80 && avg>=70) ? 'A' :
               (avg<70 && avg>=55) ? 'P' :
               (avg<55 && avg>=40) ? 'D' : 'T';   
    }
