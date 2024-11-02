
//import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    //studentID stu = new studentID(7644);
        studentID stu = new studentID('W','N',true,3);
        System.out.println("\nFirst = "+(char)(stu.getFirstN())+", Last = "+(char)(stu.getLastN())+", Male = "+stu.getIsMale()+", Grade = "+stu.getGrade()+", ID = "+stu.getID());
        studentID[] array = new studentID[20];
        for (int i = 0; i<array.length; i++){
            array[i]=new studentID((int)(Math.random()*8192)); //generate random IDs
        }
        
        Arrays.sort(array); 

        for(int i = 0; i<array.length;i++)
        {
            array[i].print();
        }
        studentID stu1 = new studentID ('A', 'A', true, 3);
        studentID stu2 = new studentID ('B', 'B', true, 0);
        int comp = stu1.compareTo(stu2);
        if (comp==1)
             System.out.println ("dude1's older");
        
        else if (comp==0)
             System.out.println ("dudes are the same");
        
        else
             System.out.println ("nah");
}
}
