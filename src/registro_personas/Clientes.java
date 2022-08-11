
package registro_personas;

/**
 *
 * @author Usuario
 */
public class Clientes {
  String Nombre ;
    int Documento ;
    long Celular ;
    String Direccion;
    boolean Cliente_frecuente ; 
    int Id;
   
   
   //constructor de persona
    public Clientes(String Nombre,int Documento , long Celular , String Direccion , boolean Cliente_frecuente,int Id) {
        this.Nombre=Nombre;
        this.Documento=Documento;
        this.Celular=Celular;
        this.Direccion=Direccion;
        this.Cliente_frecuente=Cliente_frecuente;
        this.Id=Id;
   }
    
    public String getnombre(){
     return Nombre;
    }
    
    public void setnombre(String Nombre){
     this.Nombre=Nombre;
    }
    
    public int getdocumento(){
     return Documento;
    }
    
    public void setdocumento(int Documento){
     this.Documento=Documento;
    }
    
    public long getcelular(){
     return Celular;
    }
    
    public void setcelular(long Celular){
     this.Celular=Celular;
    }
    public String getdireccion(){
     return Direccion;
    }
    
    public void setdireccion(String Direccion){
     this.Direccion=Direccion;
    }
    
     public boolean getCliente_frecuente(){
     return Cliente_frecuente;
    }
    
    public void setCliente_frecuente(boolean Cliente_frecuente){
     this.Cliente_frecuente=Cliente_frecuente;
    }
    
    public int getid(){
     return Id;
    }
    
    public void setid(int Id){
     this.Id=Id;
    }  
}
