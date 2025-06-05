import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static Sistem<String,Student> Stud = new Sistem<>();
    public static Sistem<String,Professor> Prof = new Sistem<>();
    public static Scanner Sc = new Scanner(System.in);
    public static void main(String[] args) {
        SistemMenu:
        while (true){
            System.out.print("1. Add Student" +
                    "2. Student Menu" +
                    "3. Professor Menu" +
                    "4. Exit" +
                    ">> ");
            int pil = Sc.nextInt();
            switch (pil){
                case 1:
                    AddStudent();
                    break;
                case 2:
                    StudMenu:
                    while (true){
                        System.out.print("1. View data" +
                                "2. View Grades" +
                                "3. Enroll In Subject" +
                                "4. Return" +
                                ">> ");
                        pil = Sc.nextInt();
                        switch (pil){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break StudMenu;
                        }
                    }
                    break;
                case 3:
                    ProfMenu:
                    while (true){
                        System.out.print("1. Give assignment" +
                                "2. Grade" +
                                "3. Return" +
                                ">> ");
                        pil = Sc.nextInt();
                        switch (pil){
                            case 1:
                                System.out.print("Enter assignment title: ");
                                String assignment = Sc.nextLine();
                                assignments.add(assignment);
                                grades.add(0); // nilai default 0
                                System.out.println("Assignment added.");
                                break;
                            case 2:  
                                if (assignments.isEmpty()) {
                                System.out.println("No assignments available to grade.");
                                } else {
                                    for (int i = 0; i < assignments.size(); i++) {
                                        System.out.println((i + 1) + ". " + assignments.get(i) + " (Grade: " + grades.get(i) + ")");
                                    }
                                    System.out.print("Select assignment number to grade: ");
                                    int idx = Sc.nextInt() - 1;
                                    if (idx >= 0 && idx < grades.size()) {
                                        System.out.print("Enter grade (0-100): ");
                                        int grade = Sc.nextInt();
                                        grades.set(idx, grade);
                                        System.out.println("Grade updated.");
                                    } else {
                                        System.out.println("Invalid assignment number.");
                                    }
                                }
                                break;
                            case 3:
                                break ProfMenu;
                            default:
                                System.out.println("Invalid choice, try again.");
                }
        }
        System.out.println();
    }

    public static void AddStudent(){
        System.out.print("Enter Name >> ");
        String name = Sc.nextLine();
        System.out.println("Select A Major >> ");
        Enum<MajorSelection> major = MajorSelect();
        Stud.Add(String.valueOf(Sistem.Id),new Student(GenerateId(),name,major,new Date(1,8,2007)));
        Sistem.Id ++;
    }
    public static String GenerateId(){
        return UUID.randomUUID().toString().substring(0,8);
    }

    enum SubjectSelection{

    }

    public enum MajorSelection{
        COMMUNICATION,
        INDUSTRY,
        BUSINESS,
        HOTEL,
    }

    public static MajorSelection MajorSelect(){
        MajorSelection[] mj = MajorSelection.values();
        int i = 1;
        for (MajorSelection mjs : MajorSelection.values()){
            System.out.println(i + ". " + mjs);
            i++;
        }
        System.out.print(">>"); int pil = Sc.nextInt();
        return mj[pil-1];
    }
}
