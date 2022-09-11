public class Aspirant extends Student {
    String nauchrab;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String nauchrab) {
        super(firstName, lastName, group, averageMark);
        this.nauchrab = nauchrab;
    }

    @Override
    public double getScholarship() {
        return averageMark == 5 ? 20000 : 18000;
    }

    public void setNauchrab(String nauchrab) {
        this.nauchrab = nauchrab;
    }

    public static void main(String[] args) {
        Student student = new Student("Володя","Путинков","ПГА-143",4.5);
        Aspirant aspirant1 = new Aspirant("Иван","Виршин","ОВМ-352",5,"О детях.");
        Student aspirant2 = new Aspirant("Юлия","Умникова","УРВ-512",4.8,"О солнце.");

        Student [] students = {student,aspirant1,aspirant2};
        for(Student s:students){
            System.out.println(s.getScholarship());
        }
    }
}
