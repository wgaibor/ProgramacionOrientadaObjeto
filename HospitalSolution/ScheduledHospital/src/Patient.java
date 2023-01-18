public class Patient extends User{

    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient(String name) {
        super(name);
    }

    public void sayWhatHappens(String symptoms) {
        System.out.println("My symptons is "+ symptoms);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
    

    
}
