package ejercicio;

public class main {
    
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        
        p1.setNombre("ALDO");
        p1.setEdad(22);
        p1.setTelefono(987253551);
        System.out.println(String.format("Persona ( 1 ) => {Nombre: %s, Edad: %s, Telefono: %s} ", p1.getNombre(),p1.getEdad(), p1.getTelefono()));
        
        p2.setNombre("MARIA");
        p2.setEdad(23);
        p2.setTelefono(980250531);
        System.out.println(String.format("Persona ( 2 ) => {Nombre: %s, Edad: %s, Telefono: %s} ", p2.getNombre(),p2.getEdad(), p2.getTelefono()));
        
    }
    
}
