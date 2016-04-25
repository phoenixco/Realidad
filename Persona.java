package realidad;

/**
 * Clase que encapsula un objeto persona .
 * 
 * @Javier & Gregorio & Alvaro & Samuel & Mihaela
 * @16.03.2015
 */
public class Persona
{
   private String nombre;
   private int edad;
   private Realidad realidad;
    
   /**
     * Constructor de un objeto persona a partir de los parametros recibidos.
     * 
     * @param name - nombre del objeto
     * @param edad - edad
     * @param em - estado emocional
     * @param siMismo - percepcion de si mismo
     * @param demas - percepcion de los demas
     */
   public Persona(String name, int edad,String em,  String siMismo, String demas){
       this.nombre=name;
       this.edad=edad;               
       this.setRealidad(em,  siMismo, demas);
   }
    
   /**
    * Constructor por defecto.Asigna unos valores por defecto al objeto de tipo persona .
    */
   public Persona(){
       this("URIS", 1,  "Feerico", "Buena", "Amigables");
   }
    
    
   /**
    * Metodo que instancia una nueva realidad para la persona almacenada a partir de los  valores recibidos por parametro.
    * 
    * @param emocion - estado emocional
    * @param siMismo - percepcion de si mismo
    * @param demas - percepcion de los demas
    */
   public void setRealidad(String emocion,  String siMismo, String demas){
       realidad=new Realidad(String.format("%sR",this.nombre), emocion,  siMismo, demas);
   }
    
   /**
    * Método para obtener si la realidad recibida por parametro es optimista o no.
    * 
    * @param real - realidad
    * @return boolean - true/false
    * 
    */
   public  boolean realidadOptimista(Realidad real){
      boolean sw=false;
      if(real.esOptimista()){
          sw=true;            
      }   
      return sw;
   }
    
   /**
    * Método para obtener el nombre de la persona.
    * 
    * @return String - nombre;
    */
   public String getNombre(){    
      return nombre;
   }
    
   /**
     * Metodo para obtener realidad de la persona.
     * 
     * @return Realidad -realidad;
     * 
     */
   public Realidad getPersona(){
      return this.realidad;
   }
    
   /**
    * Metodo para modificar la realidad de la persona implicita despues de interactuar con otro objeto de tipo realidad recibida por parametro.
    * 
    * @param Realidad - realidad.
    * @return Realidad - la nueva realidad;
    * 
    */
   public Realidad interactuar(Realidad real){
      realidad.modificarRealidad(real);
      return realidad;
   }
}
