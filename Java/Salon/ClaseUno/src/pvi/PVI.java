package pvi;

/**
 *
 * @author joshuansu
 */
public class PVI {

    /**
     * @param args the command line arguments
     */
    /*
    NEL, se me fue el pedo, con eso de que se hereda el constructor
    (ya sabias que no era asi, pero eso que viste te tomo de bajada), lo que pasa
    es que primero manda a llamar al constructor vacio del padre aunque no este "super()"
    y si creas un constructor diferente en el hijo, y no pongas "super()" se manda a llamar, 
    siempre se manda a llamar un contructor del padre. si no especificas cual manda a llamar el
    "super()" por si solo
     */
    public static void main(String[] args) {
        System.out.println("");
        Persona p = new Persona("saludando");
        System.out.println("");
        Alumno a = new Alumno("saludando");
        System.out.println("");
    }

}
