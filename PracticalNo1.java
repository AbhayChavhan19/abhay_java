class PracticalNo1 {
    public static void main(String[] argv) {
        CompanyData SBJIT = new CompanyData("Abhay Chavhan", 21, "Male", 65);
        SBJIT.display();
    }
}

class CompanyData {
    String name;
    int age;
    String gender;
    int empid;

    // Default Constructor
    public CompanyData() {
        System.out.println("Inside Default Constructor");
    }

    // Parameterized Constructor
    public CompanyData(String nm, int ag, String gen, int em) {
        System.out.println("Inside Para. Constructor");
        this.name = nm;
        this.age = ag;
        this.gender = gen;
        this.empid = em;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Emp ID: " + this.empid);
    }
}
