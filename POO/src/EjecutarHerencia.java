public class EjecutarHerencia {
    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador(04,"93884916","Emanuel","Benitez Baez","Chimondegui 1024","1198766554",897,"Estudiante",1887009);
        colaborador.mostrarDetalles();

        Consultor consultor = new Consultor(04,"93884916","Emanuel","Benitez Baez","Chimondegui 1024","1198766554");
        //consultor.getNombre();
        System.out.println("Nombre del consultor:" +consultor.getNombre());
    }
}