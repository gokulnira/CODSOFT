import java.util.Scanner;
public class StudentGradeCalx
 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of subjects: ");
int numSubjects = scanner.nextInt();
double[] marks = new double[numSubjects];
for (int i = 0; i < numSubjects; i++) 
{
System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
marks[i] = scanner.nextDouble();
}
double totalMarks = calculateTotalMarks(marks);
double averagePercentage = calculateAveragePercentage(totalMarks, numSubjects);
char grade = calculateGrade(averagePercentage);
System.out.println("Total Marks: " + totalMarks);
System.out.println("Average Percentage: " + averagePercentage + "%");
System.out.println("Grade: " + grade);
scanner.close();
}
public static double calculateTotalMarks(double[] marks) {
double total = 0;
 for (double mark : marks)
{
 total += mark;
 }
 return total;
 }
public static double calculateAveragePercentage(double totalMarks, int numSubjects)
 {
 return totalMarks / numSubjects;
}
public static char calculateGrade(double averagePercentage)
 {
 if (averagePercentage >= 90) {
 return 'A';
} else if 
(averagePercentage >= 80) 
{
return 'B';
} 
else if 
(averagePercentage >= 70)
 {
 return 'C';
 } 
else if (averagePercentage >= 60) 
{
 return 'D';
} 
else
{
 return 'F';
}
}
}