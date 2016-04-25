package realidad;

/**Clase que encapsula un objeto realidad .
 * 
 * @Javier &Gregorio &Alvaro &Samuel& Mihaela
 * @ 16.03.2015
 */
public class Realidad
{
    private String nombre,mundo;
    private int percepcionDeSiMismo,percepcionDelosDemas,estadoEmocional;
    
    public static final int ENEMIGOS=0;
    public static final int NORMALES=1;
    public static final int AMIGABLES=2;
    
    public static final int MALA=3;
    public static final int NORMAL=4;
    public static final int BUENA=5;
    
    public static final int DEPRIMIDO=6;
    public static final int FELIZ=7;
    public static final int FEERICO=8;
   
   
   
    /**
     * Constructor por defecto.Asigna unos valores por defecto al objeto de tipo realidad .
     */
    public Realidad() {
        this("Pepe","feliz","normal","amigables");
    }
    /**
     * Constructor de un objeto realidad a partir de los parametros recibidos.
     * 
     * @param nombre - nombre del objeto
     * @param emocional - estado emocional
     * @param per - percepcion de si mismo
     * @param demas - percepcion de los demas
     */
    public Realidad(String nombre, String emocional,  String per, String perDemas){
        this.nombre=nombre;
        this.setPercepcionDemas(perDemas);
        this.setpercepcionDeSiMismo(per);
        setestadoEmocional(emocional);
        setMundo();
    }
    
    /**
     * Método asigna al objeto de tipo realidad el valor que recibe por parametro.[ENEMIGOS||NORMALES||AMIGABLES]
     * 
     * @param per - percepcion de los demas
     */
    public void setPercepcionDemas(String per){
        per=per.toLowerCase();
        switch(per){
            case "enemigos": percepcionDelosDemas=ENEMIGOS; break;
            case "normales": percepcionDelosDemas=NORMALES; break;
            case "amigables": percepcionDelosDemas=AMIGABLES; break;
            default: break;
        }
    }
    
    /**
     * Método asigna al objeto de tipo realidad el valor que recibe por parametro.[MALA||NORMAL||BUENA]
     * 
     * @param perD - percepcion de si mismo
     */
    public void setpercepcionDeSiMismo(String perD){
        perD=perD.toLowerCase();
        switch(perD){
            case "mala": percepcionDeSiMismo=MALA; break;
            case "normal": percepcionDeSiMismo=NORMAL; break;
            case "buena": percepcionDeSiMismo=BUENA; break;
            default: break;
        }
    }
    
    /**
     * Método asigna al objeto de tipo realidad el valor que recibe por parametro.[DEPRIMIDO||FELIZ||FEERICO]
     * 
     * @param emocion - estado emocional.
     */
    public void setestadoEmocional(String emocion){
        emocion=emocion.toLowerCase();
        switch(emocion){
            case "deprimido": estadoEmocional=DEPRIMIDO; break;
            case "feliz": estadoEmocional=FELIZ; break;
            case "feerico": estadoEmocional=FEERICO; break;
            default: break;
        }
    }
    /**
     * Método asigna un valor al objeto de tipo realidad . * 
     */
    public void setMundo(){
        if(this.estadoEmocional==FEERICO){
            this.mundo="Utopia";
        }else if(this.estadoEmocional==FELIZ){
            this.mundo="Feliz";
        }else{
            this.mundo="Gris";
        }
    }
    
    /**
     * Método asigna al objeto de tipo realidad los valores que recibe por parametro.
     * 
     * @param per - percepcion de los demas
     * @param per - percepcion de los demas
     * @param per - percepcion de si mismo
     * @param perDemas - percepcion de los demas
     */
    public void setRealidad(String nombre, String emocional, String per, String perDemas){
        this.nombre=nombre;
        setestadoEmocional(emocional);
        setPercepcionDemas(perDemas);
        setpercepcionDeSiMismo(per);
        setMundo();
    }
    
    /**
     * Método para obtener el nombre de la realidad.
     * 
     * @return String - nombre;
     */
    public String getNombre(){
        return nombre;    
    }
    
    /**
     * Método para obtener el mundo de la realidad.
     * 
     * @return String - mundo;
     */
    public String getMundo(){
        return mundo;    
    }
    /**
     * Método para obtener el estado emocional.
     * 
     * @return String - estado emocional;
     */
    public int getestadoEmocional(){
        return this.estadoEmocional;    
    }
    /**
     * Método para obtener la percepcion de los demas.
     * 
     * @return String - percepcion de los demas.
     */
    public int getpercepcionDelosDemas(){
        return percepcionDelosDemas;    
    }
    
    /**
     * Método para obtener la percepcion de si mismo.
     * 
     * @return String - percepcion de si mismo.
     */
    public int getpercepcionDeSiMismo(){    
       return percepcionDeSiMismo;    
    }
    
    /**
     * Método para obtener modificar el objeto de tipo realidad con una realidad recibida por parametro.
     * 
     * @param Realidad - realidad.
     */
    public void modificarRealidad(Realidad reality){ 
        if(this.percepcionDeSiMismo>reality.percepcionDeSiMismo){            
            this.percepcionDeSiMismo--;        
        }else if(this.percepcionDeSiMismo<reality.percepcionDeSiMismo){            
            this.percepcionDeSiMismo++;        
        }
        
        if(this.percepcionDelosDemas>reality.percepcionDelosDemas){            
            this.percepcionDelosDemas--;        
        }else if(this.percepcionDelosDemas<reality.percepcionDelosDemas){            
            this.percepcionDelosDemas++;        
        }
        
        if(this.estadoEmocional>reality.estadoEmocional){            
            this.estadoEmocional--;        
        }else if(this.estadoEmocional<reality.estadoEmocional){            
            this.estadoEmocional++;        
        }       
    }
    
    /**
     * Método para obtener la realidad recibida por parametro es optimista o no .
     * 
     * @return boolean  - true/false;
     */
    public boolean esOptimista(Realidad reality){
       boolean sw=false;
       if(reality.percepcionDeSiMismo==BUENA||reality.percepcionDelosDemas==AMIGABLES||reality.estadoEmocional==FEERICO){
          sw=true;
       } 
       return sw;
    }
    /**
     * Método para obtener la realidad recibida por parametro es optimista o no .
     * 
     * @return boolean  - true/false;
     * 
     */
    public boolean esOptimista(){
       boolean sw=false;
       if(this.percepcionDeSiMismo==BUENA||this.percepcionDelosDemas==AMIGABLES||this.estadoEmocional==FEERICO){
          sw=true;
       }
       return sw;
    }
}
