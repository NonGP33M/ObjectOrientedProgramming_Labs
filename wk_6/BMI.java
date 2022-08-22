public class BMI {
    private String name;
    private int age;
    private double weight;
    private double feet;
    private double inches;
    private String[] Interpretation = { "Underweight", "Normal", "Overweigth", "Obese" };

    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight * 0.45359237;
        this.feet = feet;
        this.inches = inches * 0.0254;

    }

    public double getBMI() {
        double bmi = weight / ((inches + feet * 12.0 * 0.0254) * (inches + feet * 12.0 * 0.0254));
        return bmi;

    }

    public String getInterpretation() {
        double BMI_val = getBMI();
        if (BMI_val < 18.5)
            return Interpretation[0];
        else if (BMI_val < 25.0)
            return Interpretation[1];
        else if (BMI_val < 30.0)
            return Interpretation[2];
        else
            return Interpretation[3];

    }

    public String getName() {
        return name;

    }

    public double getHeight() {
        return inches + feet * 12.0 * 0.0254;

    }

    public double getWeight() {
        return weight;

    }

    public int getAge() {
        return age;

    }

    public void display() {
        System.out.println("Name : " + getName());
        System.out.println("BMI : " + getBMI());
        System.out.println("Interpretation : " + getInterpretation());

    }
}
