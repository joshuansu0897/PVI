package pvi;

/**
 *
 * @author joshuansu
 */
public class PVI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        People p = new People();
        System.out.println("");
        Student a = new Student();
    }

    public static class People {

        public People() {
            System.out.println("Hi i'am People");
        }
    }

    public static class Student extends People {

        public Student() {

        }
    }

}
