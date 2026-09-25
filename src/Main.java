import java.util.ArrayList;
import java.util.Scanner;
void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = 0;
    ArrayList<Std> Students = new ArrayList<>();
    while (true) {
        System.out.println("-----Student Management System Menu-----");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Students");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("6. Exit");
        System.out.println("Enter your choice: :");
        int choice = sc.nextInt();
        switch (choice) {
            // Add Student
            case 1:
                boolean test = true;
                while (test) {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter Student Roll no:");
                    int Rollno = input.nextInt();
                    input.nextLine();
                    System.out.println("Enter Student Name:");
                    String Name = input.nextLine();
                    System.out.println("Enter Student Age:");
                    int Age = input.nextInt();
                    System.out.println("Enter Student Gender:");
                    input.nextLine();
                    String Gender = input.nextLine();
                    System.out.println("Enter Student Email:");
                    String Email = input.next();
                    input.nextLine();
                    System.out.println("Enter Student Department:");
                    String Department = input.nextLine();
                    size++;
                    Std S = new Std(Rollno, Name, Age, Gender, Email, Department);
                    Students.add(S);
                    System.out.println("-----Student Added Successfully-----");
                    boolean Repeat = true;
                    while (Repeat) {
                        System.out.println("Do you want to add another Student?(yes/no)");
                        String AddAnotherStudent = sc.next();
                        if (AddAnotherStudent.equalsIgnoreCase("yes")) {
                            test = true;
                            Repeat = false;
                        } else if (AddAnotherStudent.equalsIgnoreCase("no")) {
                            test = false;
                            Repeat = false;
                        } else {
                            System.out.println("Invalid Input!Enter valid Input!");
                            Repeat = true;
                        }
                    }
                }
                break;

            //View Students
            case 2:
                if (size == 0) {
                    System.out.println("Oops! There is not any Student exists in the System");
                } else {
                    System.out.println("Total Students:" + size);
                    for (Std s : Students) {
                        s.printdetails();
                        System.out.println("------------");
                    }
                }
                break;

            //Search Student
            case 3:
                Scanner a = new Scanner(System.in);
                if (size == 0) {
                    System.out.println("Oops! There is no Student exists in the System");
                } else {
                    System.out.println("Enter Student Roll no:");
                    int rlno1 = a.nextInt();
                    for (Std s : Students) {
                        if (s.Rollno == rlno1) {
                            s.printdetails();
                        } else {
                            System.out.println("------Student not Found.-----");
                        }
                    }
                }
                break;

            case 4:
                Scanner b = new Scanner(System.in);
                boolean check2=true;
                while (check2) {
                if (size == 0) {
                    System.out.println("Oops! There is not any Student exists in the System");
                } else {
                    System.out.println("Enter Student Roll no:");
                    int rlno2 = b.nextInt();
                    for (Std s : Students) {
                        if (s.Rollno == rlno2) {
                            System.out.println("-----Student Found.-----");
                            boolean check = true;
                            while (check) {
                                System.out.println("Which thing you Want To Update:");
                                String update = b.next();
                                if (update.equalsIgnoreCase("Name")) {
                                    System.out.println("Enter The Name to be Updated by:");
                                    String updateName = b.next();
                                    s.setName(updateName);
                                    System.out.println("-----Name Updated Successfully.-----");
                                    check = false;
                                } else if (update.equalsIgnoreCase("Age")) {
                                    System.out.println("Enter the age to be Updated by:");
                                    int updateAge = b.nextInt();
                                    s.setAge(updateAge);
                                    System.out.println("-----Age Update Successfully.-----");
                                    check = false;
                                } else if (update.equalsIgnoreCase("Gender")) {
                                    System.out.println("Enter the Gender to be Updated by:");
                                    String updateGender = b.next();
                                    s.setGender(updateGender);
                                    System.out.println("-----Gender Updated Successfully-----");
                                    check = false;
                                } else if (update.equalsIgnoreCase("Email")) {
                                    System.out.println("Enter the Email to be Updated by:");
                                    String updateEmail = b.next();
                                    s.setEmail(updateEmail);
                                    System.out.println("-----Email Updated Successfully.-----");
                                    check = false;
                                } else if (update.equalsIgnoreCase("Department")) {
                                    System.out.println("Enter the Department to be Updated by:");
                                    String updateDepartment = b.next();
                                    s.setDepartment(updateDepartment);
                                    System.out.println("-----Department Updated Successfully.-----");
                                    check = false;
                                } else {
                                    System.out.println("-----Invalid Input! Enter Valid Input!-----");
                                }
                            }
                            check2 = false;
                        } else {
                            System.out.println("-----Student not Found.-----");
                        }
                    }
                        System.out.println("do you want to Update another Student?(yes/no)");
                        String UpdateAnotherStudent = b.next();
                        if (UpdateAnotherStudent.equalsIgnoreCase("yes")) {
                            check2 = false;
                        } else if (UpdateAnotherStudent.equalsIgnoreCase("no")) {
                            check2 = false;
                        } else {
                            System.out.println("Invalid Input!Enter Valid Input!");
                           check2 = true;
                        }
                }
        }
                    break;
                    case 5:
                        Scanner c= new Scanner(System.in);
                        if (size == 0) {
                            System.out.println("Oops! There is not any Student exists in the System");
                        } else {
                            boolean test1 = true;
                            while (test1){
                                System.out.println("Enter Student Roll no:");
                            int rlno3 = c.nextInt();
                            for (Std s : Students) {
                                if (s.getRollno() == rlno3) {
                                    Students.remove(s);
                                    size--;
                                    test1 = false;
                                    System.out.println("-----Student Removed Successfully-----");
                                    break;
                                }
                                else{
                                    System.out.println("-----Student Not Found.-----");
                                }
                            }
                            boolean test2=true;
                            while(test2){
                            if(size!=0) {
                                System.out.println("do you want to remove another Student?(yes/no)");
                                String removeAnotherStudent = c.next();
                                if (removeAnotherStudent.equalsIgnoreCase("yes")) {
                                    test1 = true;
                                    test2 = false;
                                } else if (removeAnotherStudent.equalsIgnoreCase("no")) {
                                    test1 = false;
                                    test2 = false;
                                } else {
                                    System.out.println("Invalid Input!Enter Valid Input!");
                                    test2 = true;
                                }
                            }
                            }
                        }
                        }
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("-----Invalid choice-----");
                }
        }
    }

