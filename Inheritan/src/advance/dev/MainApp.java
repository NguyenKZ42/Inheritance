package advance.dev;

import java.util.Scanner;


public class MainApp {
  public static void main(String[] args) {
    Person[] persons = new Person[4];
    input(persons);
    print(persons);
    findStudentWithMaxAvg(persons);
    findTeacherWithMaxSala(persons);
    
    Teacher teacherWithMaxSala = findTeacherWithMaxSala(persons);
    System.out.println("Giao vien co muc luong cao nhat la:" + teacherWithMaxSala.getName() + " - Co so luong: " + teacherWithMaxSala.tinhLuong());

    Student studentWithMaxAvg = findStudentWithMaxAvg(persons);
    System.out.println("Sinh vien co điem trung binh cao nhat la: " + studentWithMaxAvg.getName() 
                        + " - Diem trung binh: " + studentWithMaxAvg.diemTrungBinh());

  }

  public static void input(Person[] persons) {
    Scanner scanner = new Scanner(System.in);
    int teacherCount = 0;
    int studentCount = 0;
    for (int i = 0; i < 2; i++) {
	
      System.out.format("Nhap ten giao vien[%d] :",i+1);
      System.out.println("");
      String name = scanner.nextLine();
      System.out.println("Nhap tuoi");
      int age = scanner.nextInt();
      System.out.println("Nhap sdt");
      String phone = scanner.nextLine();
      System.out.println("Nhap ID giao vien:");
      String teacherId = scanner.nextLine();
      System.out.println("Nhap luong:");
      double salaryCoefficient = scanner.nextDouble();
      scanner.nextLine();
      Teacher teacher = new Teacher(name, age, phone, teacherId, salaryCoefficient);
      persons[teacherCount] = teacher;
      teacherCount++;
    }
    for (int i = 0; i < 2; i++) {
      System.out.println("Nhap ten sinh vien:");
      String name = scanner.nextLine();
      System.out.println("Nhap tuoi:");
      int old = scanner.nextInt();
      System.out.println("Nhap so");
      String phone = scanner.nextLine();      System.out.println("Nhap diem toan:");
      double mathScore = scanner.nextDouble();
      System.out.println("Nhap diem ly:");
      double physicsScore = scanner.nextDouble();
      scanner.nextLine();
      Student student = new Student(name, old, phone, mathScore, physicsScore);
      persons[teacherCount + studentCount] = student;
      studentCount++;
    }
  }

  public static void print(Person[] persons) {
    for (int i = 0; i < persons.length; i++) {
      
      if (persons[i] instanceof Teacher) {
    	  System.out.println("Teacher name: " + persons[i].getName());
        Teacher teacher = (Teacher) persons[i];
        System.out.println("Teacher ID: " + teacher.getTeacherId());
        System.out.println("Salary coefficient: " + teacher.getSalaryCoefficient());
        System.out.println("Salary: " + teacher.tinhLuong());
      } else if (persons[i] instanceof Student) { 
    	  System.out.println("Student name: " + persons[i].getName());
        Student student = (Student) persons[i];
        System.out.println("Math score: " + student.getMathScore());
        System.out.println("Physics score: " + student.getPhysicsScore());
        System.out.println("Average score: " + student.diemTrungBinh());
      }
    }
    }
  public static Student findStudentWithMaxAvg(Person[] persons) {
      Student studentWithMaxAvg = null;
      double maxAvg = Double.MIN_VALUE;

      for (Person person : persons) {
          if (person instanceof Student) {
              Student student = (Student) person;
              double avg = student.diemTrungBinh();

              if (avg > maxAvg) {
                  maxAvg = avg;
                  studentWithMaxAvg = student;
              }
          
      }

  }
	return studentWithMaxAvg;

}
  public static Teacher findTeacherWithMaxSala(Person[] persons) {
	  Teacher teacherWithMaxSala = null;
	  double maxSala = Double.MIN_VALUE;
	  
	  for(Person person: persons) {
		  if(person instanceof Teacher) {
			  Teacher teacher = (Teacher) person;
			  double sala = teacher.tinhLuong();
			  
			  if (sala > maxSala) {
				  maxSala = sala;
				  teacherWithMaxSala = teacher;
			  }
		  }
	  }
	  return teacherWithMaxSala;
  }
  }