public class Variables {
    private String nombre = "Carlos";
    public char sexo;//Hombre H, Mujer M
    public int edad; /*Guardar la edad
    de la persona*/
    public double peso; /*Guardarlo en Kg; por ejemplo 45.3*/
    public String cedula;
    //getters
    //setters
    public void setNombre(String n){
        this.nombre = n;
    }
    public void setSexo(){
        this.sexo = 'H';
    }
    public String getNombre(){
        return this.nombre;
    }
}