/**
*Calculates stidents final grade.
*
*Activity 4
*Alexander Brannon - COMP 1210 - 004
*10/1/17
*/
public class Grade {

   private double exam1;
   private double exam2;
   private double finalExam;
   private double activityAvg;
   private double quizAvg;
   private double projectAvg;
   private String studentName;
/**
*Assigns exams constants.
*/
   public static final int EXAM_1 = 1, EXAM_2 = 2, FINAL = 3;
   private static final double EXAM_WEIGHT = 0.15,
      FINAL_WEIGHT = 0.30, ACT_WEIGHT = 0.05,
      QUIZ_WEIGHT = 0.10, PROJ_WEIGHT = 0.25;
/**
*@param studentNameIn - gives student's name
*/
   public Grade(String studentNameIn) {
      studentName = studentNameIn;
   }
/**
*@param activityAvgIn - gives activity average
*@param quizAvgIn - gives quiz average
*/  
   public void setLabAverages(double activityAvgIn, 
      double quizAvgIn) {
      activityAvg = activityAvgIn;
      quizAvg = quizAvgIn;
   }
/**
*@param projectAvgIn - sets project average
*/  
   public void setProjectAvg(double projectAvgIn) {
      projectAvg = projectAvgIn;
   }
/**
*@param examType - gives type for each exam
*@param examScoreIn - based on examtype gives the score
*/   
   public void setExamScore(int examType, double examScoreIn) {
      if (examType == EXAM_1) {
         exam1 = examScoreIn;
      }
      else if (examType == EXAM_2) {
         exam2 = examScoreIn;
      }
      else if (examType == FINAL) {
         finalExam = examScoreIn;
      }
   }
/**
*@return grade - gives the final grade of the class
*/   
   public double calculateGrade() {
      double grade = exam1 * EXAM_WEIGHT + exam2 * EXAM_WEIGHT
         + finalExam * FINAL_WEIGHT
         + activityAvg * ACT_WEIGHT
         + quizAvg * QUIZ_WEIGHT
         + projectAvg * PROJ_WEIGHT;
      return grade;
   }
/**
*@return String - gives the student's name and class average
*/  
   public String toString() {
      return "Name: " + studentName + "\n"
         + "Course Grade: " + calculateGrade();
      
   }
   
   


}