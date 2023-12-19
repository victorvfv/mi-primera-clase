public class PersonajeVideoJuego {
    private String nombre;
    private int nivel;
    private boolean vivo;
    
    public PersonajeVideoJuego(String nombrePc , int nivelPc){
        nombre = nombrePc;
        nivel = nivelPc;
        vivo = true;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getNivel(){
        return nivel;
    }
    
    public boolean getVivo(){
        return vivo;
    }
    
    public void setUsuario(String Usuario){
        nombre=Usuario;
    }
    
    public void setSubida(int aumento){
        nivel=nivel + aumento;
    }
    
    public void setVivo(){
        if (vivo==true){
            vivo=false;
        }
        else{
             vivo=true ;  
        }
    }
    
    
    public void imprimirDetalles(){
        String Estado;
        if (vivo==true){
            Estado = "Verdadero";
        }
        else{
             Estado = "falso" ;  
        }
        System.out.println("El juagador " + nombre + " de Nivel " + nivel + " esta vivo? " + Estado);
    }
    
    public String getDetalles(){
        String Estado;
        if (vivo==true){
            Estado = "Verdadero";
        }
        else{
             Estado = "falso" ;  
        }
        String mostrar="jugador " + nombre + " nivel " + nivel + " esta vivo? " + Estado;
        return mostrar;
    }
}