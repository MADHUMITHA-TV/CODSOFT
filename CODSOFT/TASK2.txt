import java.util.Scanner;
class Grade
{
    public String grade(int average)
    {
       
        if (average >= 90) {
           return "A";
        }          
        else if(average >= 80)
        {
           return "B";
        }
        else if (average >= 70)
        {
           return "C";
        }
        else if(average > 60)
        {
           return "D";
        }
        else if(average >= 50)
        {
            return "E";
        }
        else
        {
            return "Poor";
        }
    }
}
class Main
{
    public static void main(String[] args)
    {
       
        Scanner sc = new Scanner(System.in);
        Grade obj = new Grade();
        System.out.println("Enter the number of subjects : ");
        int no_of_subjects= sc.nextInt();
       
        int total = 0;

        for (int i = 0; i < no_of_subjects; i++)
        {
            System.out.println("Enter the marks obtained in subject " + (i + 1));
            int marks = sc.nextInt();
            total += marks;
        }
        int average = total / no_of_subjects;

        String Grade = obj.grade(average);
        System.out.println("Total marks obtained :- " + total);
        System.out.println("Percentage obtained :- " + average+"%");
        System.out.println("Grade obtained :- " + Grade);
        sc.close();
    }
} 