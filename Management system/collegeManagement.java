class Identity implements College {
    String name;
    String department;
    String occupation;

    public void occupation() {
        System.out.println("I am" + occupation);
    }

    public void department() {
        System.out.println("From " + department + " Department");
    }

}

class HOD extends Identity {
    void show() {
        System.out.println("I handle staff");
    }
}

class TeachingStaff extends Identity {
    void show() {
        System.out.println("I Teach");
    }
}

class Management extends Identity {
    void show() {
        System.out.println("I Manage");
    }
}

public class collegeManagement {
    public static void main(String args[]) {
        System.out.println("Enter a choice: \n1.HOD\n2.Teacher\n3.Management Staff");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                HOD a = new HOD();
                System.out.println("Name:");
                a.name = sc.nextLine();
                System.out.println("Department:");
                a.department = sc.nextLine();
                System.out.println("Occupation:");
                a.occupation = sc.nextLine();
                a.show();
                break;

            case 2:
                TeachingStaff b = new TeachingStaff();
                System.out.println("Name:");
                b.name = sc.nextLine();
                System.out.println("Department:");
                b.department = sc.nextLine();
                System.out.println("Occupation:");
                b.occupation = sc.nextLine();
                b.show();
                break;

            case 3:
                Management C = new Management();
                System.out.println("Name:");
                C.name = sc.nextLine();
                System.out.println("Department:");
                C.department = sc.nextLine();
                System.out.println("Occupation:");
                C.occupation = sc.nextLine();
                C.show();
                break;
            default:
                break;
        }
    }
}
