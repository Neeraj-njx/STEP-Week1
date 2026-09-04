class SrmStudent {
    private String name;

    // Static fields shared by all objects
    private static String collegeName;
    private static int academicYear;

    // Static block runs exactly once when the class is loaded
    static {
        collegeName = "SRM";
        academicYear = 2026;
        System.out.println("College info loaded");
    }

    public SrmStudent(String name) {
        this.name = name;
    }

    public void printConfirmation() {
        System.out.println("Student record created: " + name);
    }
}

public class week4m4 {
    public static void main(String[] args) {
        String[] names = {
                "Ravi",
                "Meera",
                "Karthik",
                "Divya",
                "Anitha"
        };

        // Create all student objects in a single loop
        for (String name : names) {
            SrmStudent student = new SrmStudent(name);
            student.printConfirmation();
        }
    }
}