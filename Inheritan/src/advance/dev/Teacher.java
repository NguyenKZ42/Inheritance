package advance.dev;

class Teacher extends Person {
  private String teacherId;
  private double salaryCoefficient;

  public Teacher(String name, int age, String phone, String teacherId, double salaryCoefficient) {
	  super(name, age, phone);
      this.teacherId = teacherId;
      this.salaryCoefficient = salaryCoefficient;
  }

  public String getTeacherId() {
    return this.teacherId;
  }

  public double getSalaryCoefficient() {
    return this.salaryCoefficient;
  }

  public double tinhLuong() {
    return this.salaryCoefficient * 1500000;
  }
}

