
public class Student {
    //properties
    private String name;
    private char grade;
    private int group;
    private char[] grades = {'F','E','D','C','B','A'};
    private Integer[] groups = {1, 2, 3, 4, 5};
    private final String MYSECRETNICKNAME = "mySecretNickName";
    private String secretNickName = MYSECRETNICKNAME ;





    //constructor
    public Student(String name, char grade, int group){
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    //getters
    public void getName(){System.out.println(name);}

    public void getGrade() {
        int index = -1;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == grade) {
                index = i;
                break;
            }
        }
        if (index < 0){
            System.out.println("Invalid Grade");
        } else {
            System.out.println("Grade: " + grades[index]);
        }

    }


    //methods to upgrade and downgrade

    public void upGrade() {
       int index = -1;
       for (int i = 0; i < grades.length; i++){
           if (grades[i] == grade){
               index = i;
               break;
           }
       }
        if (index == -1){
            System.out.println("Cannot Upgrade - Invalid grade.");
        } else if (index == 5){
            System.out.println("Can't upgrade Student any further");
        } else {
            grade = grades[index+1];
            System.out.println("Student has been upgraded to a " + grade);
        }
    }
    public void downGrade(){
       int index = -1;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == grade){
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("Cannot Downgrade - Invalid grade.");
        } else if (index == 0) {
            System.out.println("Can't downgrade Student any further");
        } else {
              grade = grades[index-1];
            System.out.println("Student has been downgraded to a " + grade);
        }
    }



}
