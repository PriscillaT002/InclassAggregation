public class Student {

    OneCard myOneCard;
    int classYear;
    String name;

     public Student(int classYear, String name) {
        this.classYear = classYear;
        this.name = name;
        myOneCard = new OneCard(this.name. balance: 0.0);
    }

    public static void main(String[] args) {

        Student jordan = new Student(classYear: 2008, name: "Jordan");
        System.out.println(jordan.myOneCard);
        jordan.myOneCard.setOwner(jordan);
        System.out.println(jordan.myOneCard.owner.classYear);
    }
}