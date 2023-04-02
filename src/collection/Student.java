package collection;

public class Student implements Comparable<Student> {

    private int physics;
    private int chemistry;
    private int math;

    public Student(int physics, int chemistry, int math) {
        this.physics = physics;
        this.chemistry = chemistry;
        this.math = math;
    }

    @Override
    public String toString() {
        return "Student{" +
                "physics=" + physics +
                ", chemistry=" + chemistry +
                ", math=" + math +
                '}';
    }

    public int getPhysics() {
        return physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public int getMath() {
        return math;
    }

    @Override
    public int compareTo(Student o) {

        // current object < other object return -1 any negative no
        // current object == other object return 0
        // current object > other object return 1

        System.out.println("Comparable CompareTo() called");
        return o.physics - this.physics;
    }
}
