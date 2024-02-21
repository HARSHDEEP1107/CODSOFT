import java.util.*;
public class Task4 {
    @SuppressWarnings("resource")
    public static void main(String[] args){
      System.out.println("Welcome to the Quiz Application");
      System.out.println("You have to Answer the Questions in 10 Seconds");
      System.out.println("Your Score will be Calculated based on your performance");
      System.out.println("To start the Game press Enter:");
      Scanner s=new Scanner(System.in);
      s.nextLine();
      System.out.println("");
       Task4 K=new Task4();
       K.Quiz();   
      }
 static class Question{
  String questionText;
  List<String> options;
  int correctAnswer;
  Question(String questionText,List<String> options,int correctAnswer){
    this.questionText=questionText;
    this.options=options;
    this.correctAnswer=correctAnswer;
  }
 }
  public void Quiz(){
    List<Question> questions=new ArrayList<>();
    questions.add(new Question("What is the Capital of Maharashtra",Arrays.asList("A.Nagpur","B.Nasik","C.Mumbai","D.Pune"),2));
    questions.add(new Question("Where is India's Silicon Valley",Arrays.asList("A.New Delhi","B.Kolkata","C.Chennai","D.Bangalore"),3));
    questions.add(new Question("What is the national sport of india",Arrays.asList("A.Hockey","B.Cricket","C.Football","D.Kabaddi"),0));
    questions.add(new Question("What Developed Java Programming Language",Arrays.asList("A.Guido Von Rossum","B.Dennis Ritchie","C.James Gosling","D.Brendan Eich"),2));
    questions.add(new Question("Which is the youngest Country in the World",Arrays.asList("A.South Sudan","B.North Korea","C.Japan","D.China"),0));
    questions.add(new Question("In which year Railways was introduced in India",Arrays.asList("A.1879","B.1853","C.1857","D.1875"),1));
    questions.add(new Question("Who is the first deputy prime minister of india",Arrays.asList("A.Sardar Vallabhai Patel","B.Indira Gandhi","C.Rajiv Gandhi","D.Lala lajpat rai"),0));
    questions.add(new Question("Who is the current president of India",Arrays.asList("A.Narendra Modi","B.Rajnath Singh","C.Draupadi Murmur","D.Devendra Fadanvis"),2));
    questions.add(new Question("Who is the Most Richest Actor",Arrays.asList("A.Shah Rukh Khan","B.Salman Khan","C.Akshay Kumar","D.Hritik Roshan"),0));
    questions.add(new Question("which player has scored more centuries than sachin tendulkar in ODIs",Arrays.asList("A.Steve Smith","B.Joe Root","C.Kane Williamson","D.Virat Kohli"),3));
    int score=0;
    Scanner s=new Scanner(System.in);
    for(int i=0;i<questions.size();i++){
      Question Q=questions.get(i);
       System.out.println("Question "+(i+1)+": "+Q.questionText);
       for(String Option:Q.options){
        System.out.println(Option);
       } 
       Timer timer=new Timer();
       TimerTask task=new TimerTask(){
        public void run(){
          System.out.println("Time's up!");
          timer.cancel();
        }
       };
       timer.schedule(task,10000);
    
    
    System.out.print("Your Answer:");
    String userAnswer=s.nextLine().toUpperCase();
    timer.cancel();
    int userChoice=userAnswer.charAt(0) - 'A';
    if(userChoice==Q.correctAnswer){
           System.out.print("Correct!");
           score++;
    }
    else{
      System.out.print("Incorrect! Correct Answer is "+Q.options.get(Q.correctAnswer));
    }
    System.out.println("");
  }
    System.out.println("Quiz Completed");
    System.out.println("Your Score: "+score+ "/"+questions.size()+"\n");
    s.close();
}
}
 


