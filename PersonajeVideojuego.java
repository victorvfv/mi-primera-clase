public class PersonajeVideoJuego {
    private String Nombre;
    private int Nivel;
    private boolean Vivo;
    
    public PersonajeVideoJuego(String nombrePc , int nivelPc){
        Nombre = nombrePc;
        Nivel = nivelPc;
        Vivo = true;
    }
    
    public String getNombre(){
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
        if (Vivo==true){
            Vivo=false;
        }
        else{
             Vivo=true ;  
        }
    }
    
    
    public void imprimirDetalles(){
        String Estado;
        if (Vivo==true){
            Estado = "Verdadero";
        }
        else{
             Estado = "falso" ;  
        }
        System.out.println("El juagador " + Nombre + " de Nivel " + Nivel + " esta vivo? " + Estado);
    }
    
    public String getDetalles(){
        String Estado;
        if (Vivo==true){
            Estado = "Verdadero";
        }
        else{
             Estado = "falso" ;  
        }
        String mostrar="jugador " + Nombre + " nivel " + Nivel + " esta vivo? " + Estado;
        return mostrar;
    }
}