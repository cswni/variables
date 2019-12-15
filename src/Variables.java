public class Variables {
    private String nombre = "Carlos";
    public char sexo;//Hombre H, Mujer M
    public int edad; /*Guardar la edad
    de la persona*/
    public double peso; /*Guardarlo en Kg; por ejemplo 45.3*/
    public String cedula;
    //getters
    //setters
    /*Guardar el nombre de la persona*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    /*Mostrar el nombre de la persona*/
    public String getNombre(){
        return this.nombre;
    }    
}
