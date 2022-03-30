
public class Main {

    public static void main(String[] args) {


        Student studentJane = new Student("Jane", 'A', 2);

        studentJane.getName();
        studentJane.getGrade();
        studentJane.downGrade();


        Student studentJohn = new Student("John", 'F', 1);
        studentJohn.getName();
        studentJohn.getGrade();
        studentJohn.downGrade();

        Student studentJerry = new Student("Jerry", 'D', 3);
        studentJerry.getName();
        studentJerry.getGrade();
        studentJerry.upGrade();

         Student studentGrace = new Student("Grace", 'A', 5);
         studentGrace.getName();
         studentGrace.getGrade();
         studentGrace.upGrade();

        Student studentGregory = new Student("Gregory", 'a', 4);
        studentGregory.getName();
        studentGregory.getGrade();
        studentGregory.downGrade();


    }





}
