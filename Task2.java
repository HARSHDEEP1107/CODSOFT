import java.util.Scanner;
public class Task2 {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        int N;
        Scanner s=new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("In these System We have to calculate Grade of a Student");
        System.out.print("Enter the Number of Subjects:");
        N=s.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            System.out.print("\n Enter the Marks of Subject" +(i+1)+ "(Out of 100):");
            arr[i]=s.nextInt();
        }
        float totalMarks=0;
        for(int i=0;i<N;i++){
            totalMarks+=arr[i];
        }
    
        float percentage=totalMarks/N;
       System.out.println("Result:");
       System.out.println("Total marks of the Student:"+totalMarks);
       System.out.println("Average Percentage of the student:"+percentage+"%");
       if(percentage>90)System.out.println("Grade A++");
       else if(percentage<=90&&percentage>80)System.out.println("Grade A");
       else if(percentage<=80&&percentage>70)System.out.println("Grade B");
       else if(percentage<=70&&percentage>60)System.out.println("Grade C");
       else if(percentage<=60&&percentage>50)System.out.println("Grade D");
       else if(percentage<=50&&percentage>40)System.out.println("Grade E");
       else{
        System.out.println("Fail");
       }
}
}