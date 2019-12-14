public class Main {
    public static void main(String[] args ){
        Variables persona = new Variables();
        //Asignar un valor a la variable sexo
        persona.sexo = 'H';
        //ASignar la edad de la persona
        persona.edad = 3;
        //Asignar el peso de la persona
        persona.peso = 50;
        persona.cedula = "123-121212-1212A";

        persona.setNombre("Juan");
        System.out.println(persona.getNombre());

        persona.setNombre("Maria");
        System.out.println(persona.getNombre());
    }
}
