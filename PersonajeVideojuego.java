public class PersonajeVideojuego {
    private String Nombre;
    private int Nivel;
    private boolean Vivo;
    
    public PersonajeVideojuego(String nombrePc , int nivelPc){
        Nombre = nombrePc;
        Nivel = nivelPc;
        Vivo = true;
    }
    
    public String getnombre(){
        return Nombre;
    }
    
    public int getNivel(){
        return Nivel;
    }
    
    public boolean getVivo(){
        return Vivo;
    }
    
    public void setUsuario(String Usuario){
        Nombre=Usuario;
    }
    
    public void setSubida(int aumento){
        Nivel=Nivel + aumento;
    }
    
    public void setVivo(){
        Vivo=false;
    }
    
    public void imprimirEstado(){
        System.out.println("El juagador " + Nombre + " de Nivel " + Nivel + " esta vivo " + Vivo);
    }
    
    public String mostrar(){
        String mostrar="jugador " + Nombre + " nivel " + Nivel + " esta vivo? " + Vivo;
        return mostrar;
    }
}