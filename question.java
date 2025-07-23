import java.util.*;

class Program {
    public static void main(String args[]) {
        Student s = new Student();
        ArrayList<Integer> use = new ArrayList<>();

        s.setid(101);
        s.setname("Alyosha");
        s.setfee(55000.0);

        use.add(101);
        use.add(65);
        use.add(66);

        Marks m = new Marks(use, s.getid());
        m.displayMarks();
    }
}

class Student {
    private int id;
    private String name;
    private Double fee;
    private Hashtable<String, Integer> ho = new Hashtable<>();

    public void setid(int no) {
        id = no;
    }

    public void setname(String ok) {
        name = ok;
    }

    public void setfee(Double sal) {
        fee = sal;
    }

    public int getid() {
        return id;
    }

    public void addMarks(Hashtable<String, Integer> hi) {
        ho = hi;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Fee: " + fee);
        System.out.println("Marks: " + ho);
    }
}

class Marks extends Student {
    private ArrayList<Integer> alist;
    private int id;
    private Hashtable<String, Integer> ht = new Hashtable<>();

    public Marks(ArrayList<Integer> al, int idcard) {
        this.id = idcard;
        alist = al;

        ht.put("marks1", alist.get(0));
        ht.put("marks2", alist.get(1));
        ht.put("marks3", alist.get(2));

        addMarks(ht);
    }

    public void displayMarks() {
        System.out.println("Marks Details:");
        for (Map.Entry<String, Integer> entry : ht.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
