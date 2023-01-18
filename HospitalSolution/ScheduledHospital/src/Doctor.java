public class Doctor extends User{
       
    private String speciality;

    public Doctor(String name) {
        super(name);
    }

    public String sayNameDoctor(String nameDoctor){
        return "The name of doctor is "+nameDoctor;
    }

    public void grettingDoctor(String nameDoctor){
        System.out.println("Hi my name is "+nameDoctor+ " how are you?");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    
}
