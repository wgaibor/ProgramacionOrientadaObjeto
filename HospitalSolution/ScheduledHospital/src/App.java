public class App {
    public static void main(String[] args) throws Exception {
        Doctor doctorJuan = new Doctor("Juan");
        doctorJuan.grettingDoctor(doctorJuan.getName());
        Doctor objeto2 = new Doctor("Michelle");
        String saludoDoctor =  objeto2.sayNameDoctor(objeto2.getName());
        System.out.println(saludoDoctor);
    }
}
