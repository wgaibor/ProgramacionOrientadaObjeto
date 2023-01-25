public class Doctor extends User{
       
    private String speciality;

    public Doctor(String name, String _speciality) {
        super(name);
        this.speciality = _speciality;
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

    public void ofrecerVestimenta(){

    }

    @Override
    public String toString() {
        return "El doctor es "+super.getName()+" la especialidad es "+getSpeciality();
    }

    @Override
    public void saludar() {
        System.out.println("Hola soy el doctor "+super.getName());
    }
}
