public class App {
    public static void main(String[] args) throws Exception {
        Doctor doctorJuan = new Doctor("Juan", "pediatra");
        doctorJuan.grettingDoctor(doctorJuan.getName());
        System.out.println(doctorJuan.toString());
        Doctor objeto2 = new Doctor("Michelle", "Odontologo");
        String saludoDoctor =  objeto2.sayNameDoctor(objeto2.getName());
        System.out.println(saludoDoctor);
        System.out.println(objeto2.toString());
        objeto2.saludar();
        
        Patient patientKaren = new Patient("Karen");
        patientKaren.saludar();
        patientKaren.tomarSignosVitales();
        patientKaren.darAlimentacion();

        User usuarioKevin = new User("Kevin") {
            @Override
            public void saludar() {
                System.out.println("Hola caballero   "+super.getName());
            }
        };
        usuarioKevin.saludar();
    }
}
