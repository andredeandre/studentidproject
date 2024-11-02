
public class studentID implements Comparable<studentID> {
    private char firstN;
    private char lastN;
    private boolean isMale;
    private int grade;
    private int ID;
        
    public studentID(int id){
       ID = id;
       lastN = (char)(twoTenConvert(tenTwoConvert(id).substring(7,12)) + 64);
       firstN = (char)(twoTenConvert(tenTwoConvert(id).substring(2,7))+ 64);
       isMale = genderTwoTen(tenTwoConvert(id).substring(12));
       grade = gradeTwoTen(tenTwoConvert(id).substring(0,2));
        
    }
    public studentID(char a, char b, boolean c, int d){
        firstN = a;
        lastN = b;
        isMale = c;
        grade = d;
        ID = twoTenConvert(gradeTenTwo(grade) + nameTenTwo(firstN) + nameTenTwo(lastN) + genderTenTwo(isMale));

    } 
        
    public int getFirstN(){
        return firstN;
    }
    public int getLastN(){
        return lastN;
    }
    public boolean getIsMale(){
        return isMale;
    }
    public int getGrade(){
        return grade;
    }
    public int getID(){
        return ID;
    }
       
    public int gradeTenTwo(int grade){ // grade
        int gradeBin = 0;
        switch(grade){
            case(0):
                gradeBin = 00; break;
            case(1):
                gradeBin = 01; break;
            case(2):
                gradeBin = 10; break;
            case(3):
                gradeBin = 11; break;
        }
        return gradeBin;
    }
        //--------------------------    //--------------------------
    public String nameTenTwo(char syed){ // names
        int ned = (int)syed - ((int)'A' - 1);
        int temp = ned;
        String binName = "";
        String revBinName = "";
        while(binName.length() < 5){
           temp = ned % 2;
           ned = ned / 2;
           binName += temp;
       }
       for(int i = binName.length() - 1; i >= 0; i--){
           char x = binName.charAt(i);
           revBinName += "" + x;
       }
        return revBinName;
    }
    
    public int genderTenTwo(boolean isMale){ //gender
        if(isMale)
            return 0;
        else
            return 1;
    }
    public String tenTwoConvert(int sigma){
        int temp = 0;
        String bin = "";
        String revBin = "";
        int ned;
        if(sigma > 32)
            ned = 13;
        else
            ned = 5;
        while(bin.length() < ned){
           temp = sigma % 2;
           sigma = sigma / 2;
           bin += temp;
        }
        for(int i = bin.length() - 1; i >= 0; i--){
               char x = bin.charAt(i);
               revBin += "" + x;
        }
        return revBin ;
    }

    public void print(){
        System.out.print("\nstudent ID = " + ID + "| 1st initial: " + firstN + " | 2nd initial: "+lastN+" | male: "+isMale+" | grade: "+grade);
}   
    //003982380473289476318u678146738160431
    public int twoTenConvert(String fart){
        int temp = 0;
        int Ten = 0;
        for(int i = fart.length() - 1; i >= 0; i--){
            if((fart.charAt(temp)) == '1'){
                Ten += Math.pow(2, i);
            }
            temp++;
        }
        return Ten;
    }
    public int gradeTwoTen(String n){
        switch(n){
            case("00"):
                grade = 0; break;
            case("01"):
                grade = 1; break;
            case("10"):
                grade = 2; break;
            case("11"):
                grade = 3; break;
        }
        return grade;
    }
    public boolean genderTwoTen(String n){
        if(n.equals("0"))
            isMale = true;
        else
            isMale = false;
        return isMale;
    }     
    public char nameTwoTen(String n){
        char N = (char)(twoTenConvert(n) + 64);
        return N;
    }
    
    public int compareTo(studentID other) {
        return Integer.compare(this.ID, other.ID);
    }
}
