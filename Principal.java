package realidad;

import java.util.Scanner;
/**
 * Clase principal.Trabaja con las clases Persona (introduciendo los datos de dos personas) y Realidad.
 * 
 * @Javier & Gregorio & Alvaro & Samuel & Mihaela
 * @16.03.2015
 */
public class Principal
{
    public static void main(){
        Scanner sc= new Scanner(System.in);
        String nombre,nombre1,percepciondemas,mundo,emocion,percepcion,entrada="";
        String percepciondemas1,mundo1,emocion1,percepcion1;
        int edad,edad1,opcion=1;
             
        System.out.printf("Introduce los datos de una persona.\n");
        System.out.printf("_______________________________________________________________________________________________________________________\n");
        System.out.printf("Introduce el nombre: ");
        nombre=sc.nextLine();
        System.out.printf("Introduce la edad: ");
        edad=sc.nextInt();
             
        sc.nextLine();
        System.out.printf("Introduce el estado emocional [DEPRIMIDO || FELIZ || FEERICO]: ");
        emocion=sc.nextLine();
              
        System.out.printf("Introduce la percepción de si mismo [MALA|| NORMAL || BUENA]: ");
        percepcion=sc.nextLine();
        System.out.printf("Introduce la percepción de los demas [ENEMIGOS|| NORMALES|| AMIGABLES]:");
        percepciondemas=sc.nextLine();
        Persona persona1=new Persona(nombre, edad, emocion, percepcion, percepciondemas);
        System.out.printf("_______________________________________________________________________________________________________________________\n");
        System.out.printf("Introduce los datos de otra persona\n ");
        System.out.printf("Introduce el nombre: ");
        nombre1=sc.nextLine();
        System.out.printf("Introduce la edad: ");
        edad1=sc.nextInt();
              
        sc.nextLine();
        System.out.printf("Introduce el estado emocional [DEPRIMIDO|| FELIZ|| FEERICO]:");
        emocion1=sc.nextLine();
             
        System.out.printf("Introduce la percepción de si mismo [MALA || NORMAL || BUENA]:");
        percepcion1=sc.nextLine();
        System.out.printf("Introduce la percepción de los demas [ENEMIGOS || NORMALES || AMIGABLES]:");
        percepciondemas1=sc.nextLine();
        Persona persona2=new Persona(nombre1, edad1, emocion1,  percepcion1, percepciondemas1);
              
        System.out.printf("***********************************************************************************************\n");
    
        do{
            System.out.printf("Introduce una opcion.\n ");
            System.out.printf("1. Si quieres los datos de  [ %s ] y de [%s].\n ",nombre, nombre1);
            System.out.printf("2. Si quieres saber si [ %s ] es optimista o pesimista.\n ",nombre);
            System.out.printf("3. Si quieres saber si[  %s ] es optimista o pesimista.\n ",nombre1);
            System.out.printf("4. Si %s con [ %s ] han interactuado.\n ",nombre,nombre1);
            opcion=sc.nextInt();sc.nextLine();
            switch(opcion){
                case 1:System.out.printf("La realidad personal de: %s\n", persona1.getPersona().getNombre());
                       System.out.printf("Mundo:  %s \n", persona1.getPersona().getMundo());
                              
                       System.out.printf("Esta [%s ] \n", Principal.estEmo( persona1.getPersona().getestadoEmocional()));
                       System.out.printf("%s : Ve a los demas [ %s] \n ",nombre, Principal.perDemas( persona1.getPersona().getestadoEmocional()));
                       System.out.printf("%s :Tiene una percepción [ %s ] de si mismo\n",nombre, Principal.perMismo( persona1.getPersona().getestadoEmocional()));
                              
                       System.out.printf("***********************************************************************************************\n");
                              
                       System.out.printf("La realidad personal de: %s\n", persona2.getPersona().getNombre());
                       System.out.printf("Mundo: %s\n", persona2.getPersona().getMundo());
                              
                       System.out.printf("%s : Esta %s \n", nombre1,Principal.estEmo( persona2.getPersona().getestadoEmocional()));
                       System.out.printf("%s : Ve a los demas  %s\n ",nombre1, Principal.perDemas( persona2.getPersona().getestadoEmocional()));
                       System.out.printf("%s :Tiene una percepción %s de si mismo \n",nombre1, Principal.perMismo( persona2.getPersona().getestadoEmocional()));

                System.out.printf("_______________________________________________________________________________________________________________________\n");
                       break;
               
                case 2:if(persona1.realidadOptimista(persona1.getPersona())){
                          System.out.printf(" %s  Es una persona optimista\n",nombre);      
                          }else{
                          System.out.printf("%s Es una persona pesimista y necesita un [ golpe ] de energia positiva\n",nombre); 
                       }
                       break;
                       
                case 3:if(persona2.realidadOptimista(persona2.getPersona())){
                          System.out.printf(" %s  Es una persona optimista\n",nombre1);      
                       }else{
                          System.out.printf("%s Es una persona pesimista y necesita un [ golpe ] de energia positiva\n",nombre1); 
                       }
                       break;
                case 4:persona1.interactuar(persona2.getPersona());
        
                System.out.printf("\n************************************************\n");
                System.out.printf("Las realidades personales despues de interactuar\n");                       
                System.out.printf("***********************************************************************************************\n");
                    
                System.out.printf("La realidad personal de  %s\n :", nombre);
                System.out.printf("Mundo: %s\n", persona1.getPersona().getMundo());
                System.out.printf(" %s : Esta %s \n", nombre,Principal.estEmo( persona1.getPersona().getestadoEmocional()));
                System.out.printf("%s : Ve a los demas  %s\n ", nombre,Principal.perDemas( persona1.getPersona().getestadoEmocional()));
                System.out.printf("%s : Tiene una percepcion %sde si mismo \n", nombre,Principal.perMismo( persona1.getPersona().getestadoEmocional()));
                      
                System.out.printf("\n");
                                     
                System.out.printf("La realidad personal de %s\n :", nombre1);
                System.out.printf("Mundo: %s\n", persona2.getPersona().getMundo());
                System.out.printf(" %s : Esta %s\n", nombre1,Principal.estEmo( persona2.getPersona().getestadoEmocional()));
                System.out.printf(" %s :Ve a los demas  %s\n ", nombre1,Principal.perDemas( persona2.getPersona().getestadoEmocional()));
                System.out.printf(" %s :Tiene una percepcion %s de si mismo \n", nombre1,Principal.perMismo( persona2.getPersona().getestadoEmocional()));

                default:System.out.printf("No es una opción corecta"); break; 
            }
            System.out.printf("Quieres salir del programa? si/no\n ");
            entrada=sc.nextLine();
            System.out.printf("Pulsa enter para continuar\n");sc.nextLine();
        }while(!entrada.equals("si"));
        System.out.printf("Fin del programa\n ");
    }
            
    /**
     * Método para asignar un valor  el estado emocional recibido por parámetro.
     * 
     * @param int- estado emocional
     * @return String - estado emocional
     */
    public static String estEmo(int em){
        String emocion="";
        if(em==Realidad.DEPRIMIDO){
            System.out.printf(emocion="DEPRIMIDO " );
        }else{ 
            if(em==Realidad.FELIZ){               
              System.out.printf(emocion=" FELIZ " );
            }else{
               System.out.printf(emocion=" FEERICO " );
            }                    
        }
        return emocion;
    }
    
    /**
     * Método para asignar un valor  a la percepción de los demas recibida por parametro.
     * 
     * @param int- percepción de los demas
     * @return String - percepción de los demas
     */
    public static String perDemas(int per){
        String percep="";
        if(per==Realidad.ENEMIGOS){
            System.out.printf(percep="ENEMIGOS" );
        }else{ 
           if(per==Realidad.NORMALES){
              System.out.printf(percep="NORMALES " );
           }else{
              System.out.printf(percep="AMIGABLES" );
           }
        }
        return percep;
    }
    
    /**
     * Método para asignar un valor a la percepción personal.
     * 
     * @param int- percepcion personal
     * @return String - percepcion personal
     */
    public static String perMismo(int per){
        String percemismo="";
        if(per==Realidad.MALA){
           System.out.printf(percemismo="MALA" );
        }else{ 
           if(per==Realidad.NORMAL){
              System.out.printf(percemismo="NORMAL" );
           }else{
              System.out.printf(percemismo="BUENA" );
           }
        }                
        return percemismo;
    }
}
