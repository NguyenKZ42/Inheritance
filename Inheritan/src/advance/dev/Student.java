package advance.dev;

class Student extends Person {
	  private double mathScore;
	  private double physicsScore;

	  public Student(String name, int age, String phone, double mathScore, double physicsScore) {
	    super(name, age, phone);
	    this.mathScore = mathScore;
	    this.physicsScore = physicsScore;
	  }

	  public double getMathScore() {
	    return this.mathScore;
	  }

	  public double getPhysicsScore() {
	    return this.physicsScore;
	  }

	  public double diemTrungBinh() {
	    return (this.mathScore + this.physicsScore) / 2;
	  }
	}
	