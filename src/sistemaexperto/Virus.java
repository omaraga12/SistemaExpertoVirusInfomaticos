/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaexperto;

/**
 *
 * @author Omar AGA
 */
public class Virus {
    String [] preguntas1={
        "¿Su equipo esta muy lento y se congela?",
        "¿Se inician descargar automaticas de internet sin su permiso?",
        "¿Su equipo realiza operaciones (reproducir musica, envia correos, etc) sin su permiso?",
        "¿Las aplicaciones de su computador, se han vuelto excesivamente lentas?",
        "<html><body>¿En los ultimos días ha recibido algunos mensajes (Ayuda a este niño enfermo de cancer)<br>que le incitan a hacer copias y enviar a más contactos?<html><body>", 
        "¿Ha notado que que su cursor a empezado a tambalear o cambiar de icono cada pocos segundos?",
        "¿Ha tenido problemas en la ejecucion de algunos programas o al acceder a algun directorio o fichero?",
        "¿Ha tenido perdida de informacion o perdida de contenido en algunos ficheros?",
        "¿Ha tenido problemas al momento de encender su maquina?",
        "¿Ha tenido problemas en el funcionamiento en general de su maquina?",
        "¿Ha detectado perdida de datos, y su antivirus no identifica nada malo?",
        "¿Al ingresar un USB o memoria externa a su maquina, estos se infectan?",
        "¿Se desaparecen archivos de su computadora, sin explicación alguna?",
        "No puede ingresar a algunas carpetas de su computadora?",
        "¿A intentato ingresar a alguna pagina en internet, pero sin explicacion llego a una pagina diferente?",
       "¿Su computadora ingresa a paginas web sin su permiso?",
       "¿Ha sido victima de hackeo de cuentas, en las que normalmente ingresaba desde su computadora?"      
    };
    String [] imagenes={
        "/imagenes/1.jpg",
        "/imagenes/2.jpg",
        "/imagenes/3.jpg",
        "/imagenes/4.png", 
        "/imagenes/5.jpg",
        "/imagenes/6.jpg",
        "/imagenes/7.jpg",
        "/imagenes/8.jpg",
        "/imagenes/9.jpg",
        "/imagenes/10.jpg",
        "/imagenes/11.png",
        "/imagenes/12.jpg",
        "/imagenes/13.jpg",
        "/imagenes/14.jpg",
        "/imagenes/15.jpg",
        "/imagenes/16.jpeg",
        "/imagenes/17.jpg",
    };
    String [] preguntas2={
        "¿Recibe constantemente alertas de seguridad falsas?",
        "¿Se bloquea el acceso de algunos usuarios a su computadora?",
        "¿Se apaga automaticamente el monitor de su computadora frecuentemente?",
        "¿Ha habido momentos en que las aplicaciones mas ordinarias de su maquina no han podido ejecutarse?",
        "¿Al ingresar a internet a notado que es más lento de lo acostumbrado?", 
        "<html><body>¿Ha notado que sorpresivamente se ha abierto la bandeja de CD o DVD, <br>a la vez que se muestran mensajes humoristicos en el monitor?<html><body>",
        "¿Hay momentos en los que pierde el control de su maquina?",
        "¿Ha intentado limpiar sus archivos,pero al final a perdido toda la información?",
        "¿Le aparece frecuentemente una pantalla azul?",
        "¿Sus archivos aparecen en otras ubicaciones, sin que usted los haya movido?",
        "¿Toma más tiempo de lo normal abrir un programa?",
        "¿Algunos de sus archivos se infectan sorpresivamente?",
        "¿Hay momento inesperados, donde su maquina se pone lenta sin explicacion alguna?",
        "¿Al querer ingresar a los archivos del Sistema Operativo, se bloquea el acceso?",
        "¿Recientemente a descubierto que algunos de sus datos guardados en su maquina ha aparecido en internet?",
       "¿Su maquina actua como si lo estuvieran controlando remotamente?",
       "<html><body>¿Ha sido victima de robo de sus cuentas bancarias, y los datos de sus <br>cuentas normalmente los utilizaba en su maquina?<html><body>"
    };
      String [] imagenes2={
        "/imagenes/18.png",
        "/imagenes/19.jpg",
        "/imagenes/20.jpg",
        "/imagenes/21.png", 
        "/imagenes/22.jpg",
        "/imagenes/23.jpg",
        "/imagenes/24.jpg",
        "/imagenes/25.jpg",
        "/imagenes/26.png",
        "/imagenes/27.jpg",
        "/imagenes/28.jpg",
        "/imagenes/29.png",
        "/imagenes/30.jpg",
        "/imagenes/31.jpeg",
        "/imagenes/32.jpeg",
        "/imagenes/33.jpg",
        "/imagenes/34.jpg",
    };
      
     String [] ejemplos={
        "RECYCLER",
        "CONEXION DIRECTA: NETBUS, SUB7 CONEXION INVERSA: POISON IVY, CEMENTERY",
        "BOMBAS LOGICAS",
        "ILOVEYOU, BLASTER, SOBIG WORM, CODE RED",
        "HOAX", 
        "JOKE",
        "RANDEX,MEVE,MRKLUNKY,CMJ",
        "WAY,TRJ,REBOOT,TRIVIAL",
        "POLYBOOT.B,ANTIEXE",
        "DE ENLACE",
        "ELKERN,MARBURG,SATAN,BUG,TUAREG",
        "YWINZ",
        "BARROTES,JUNKIE",
        "DE FAT",
        "IP HIJAKERS,PAGE HIJACKING,REVERSE,DOMAIN,HIJACKING,SESSION,HIJACKING",
        "STORM,CONFICKER,ZEUS,FLASHBACK,WENDIGO",
        "KEYLOGGER,FREE,REFOG,REVEALER,REAL FREE"
    };
    
     String [] funcion={
        "<html><body>CREAR UN ACCESO DIRECTO DE UN PROGRAMA Y ELIMINAR SU APLICACION ORIGINAL, ADEMAS<br> AL INFECTAR UN PENDRIVE CONVIERTE A TODA LA INFORMACION EN ACCESO DIRECTO<html><body>",
        "<html><body>CONSISTEN EN ROBAR INFORMACION O ALTERAR EL SISTEMA DEL HARDWARE O EN UN CASO<br> EXTREMO PERMITE QUE UN USUARIO EXTERNO PUEDA CONTROLAR EL EQUIPO<html><body>",
        "<html><body>SE ACTIVAN AL PRODUCIRSE UN ACONTECIMIENTO DETERMINADO. LA CONDICION SUELE<br> SER UNA FECHA, UNA COMBINACION DE TECLAS, O CIERTAS CONDICIONES TECNICAS<html><body>",
        "TIENE LA PROPIEDAD DE DUPLICARSE A SI MISMO",
        "<html><body>NO SON VIRUS NI TIENEN CAPACIDAD DE REPRODUCIRSE POR SI SOLOS. SON MENSAJES DE <br>CONTENIDO FALSO QUE INCITAN AL USUARIO A HACER COPIAS Y ENVIARLA A SUS CONTACTOS<html><body>", 
        "<html><body>NO SON VIRUS COMO TAL, PERO SON MOLESTOS, UN EJEMPLO: UNA PAGINA PORNOGRAFICA QUE SE MUEVE DE<br> UN LADO A OTRO<html><body>",
        "SE OCULTAN EN LA MEMORIA RAM DE FORMA PERMANENTE O RESIDENTE",
        "DESTRUYEN LA INFORMACION CONTENIDA EN LOS FICHEROS QUE INFECTAN",
        "ACTUAN INFECTANDO EN PRIMER LUGAR EL SECTOR DE ARRANQUE DE LOS DISPOSITIVOS DE ALMACENAMIENTO",
        "ALTERAN LAS DIRECCIONES QUE INDICAN DONDE SE ALMACENAN LOS FICHEROS",
        "EN CADA INFECCIÓN QUE REALIZAN SE CIFRAN DE UNA FORMA DISTINTA",
        "PUEDEN REALIZAR MULTIPLES INFECCIONES, COMBINANDO DIFERENTES TECNICAS PARA ELLO",
        "INFECTAN PROGRAMAS O FICHEROS EJECUTABLES",
        "ATACAN LA TABLA DE ASIGNACION DE FICHEROS,IMPEDIRAN EL ACCESO A CIERTAS PARTES DEL DISCO",
        "SECUESTRAN NAVEGADORES DE INTERNET PRINCIPALMENTE EXPLORER",
        "SECUESTRAN COMPUTADORAS DE FORMA QUE ES CONTROLADA POR TERCEROS",
        "SE ENCARGA DE REGISTRAR CADA TECLA QUE SEA PULSADA, EN ALGUNOS CASOS TAMBIEN REGISTRAN LOS CLICKS"
    };
     
      String [] daño={
        "<html><body>EL EQUIPO FUNCIONA MUY LENTO Y ES FÁCIL QUE SE CONGELE. MODIFICA ARCHIVOS DEL <br>SISTEMA PARA PROTEGERSE E IMPEDIR QUE EL USUARIO SE DE CUENTA<html><body>",
        "<html><body>BORRAN ARCHIVOS IMPORTANTES DEL SISTEMA DE FORMA AUTOMATICA, INICIAN DESCARGAS<br> AUTOMATICAS DESDE INTERNET<html><body>",
        "<html><body>BORRAR INFORMACION DEL DISCO DURO, MOSTRAR UN MENSAJE, REPRODUCIR UNA CANCION,<br> ENVIAR UN CORREO ELECTRONICO, APAGAR EL MONITOR<html><body>",
        "<html><body>CONSUMIR LOS RECURSOS DE UN COMPUTADOR, CAPAS DE HACER QUE APLICACIONES ENTRE OTRAS<br> TAREAS SE HAGAN EXCESIVAMENTE LENTAS HASTA EL PUNTO, QUE LAS TAREAS MAS ORDINARIAS NO PUEDAN EJECUTARSE<html><body>",
        "<html><body>PERDIDA DE TIEMPO PARA EL USUARIO, SATURACION DE REDES LOCALES Y DE MENSAJES<html><body>", 
        "<html><body>EFECTOS SOBRE EL CURSOR. POR EJEMPLO, TAMBALEARLO O CAMBIAR SU ICONO CADA POCOS<br> SEGUNDOS. OTROS JUEGAN DIRECTAMENTE CON LA IMAGEN DEL MONITOR, HACIENDOLA GIRAR O DANDO UN EFECTO DE TEMBLOR<html><body>",
        "<html><body>INTERCEPTAR TODAS LAS OPERACIONES,INFECTANDO TODOS AQUELLOS <br>FICHEROS Y/O PROGRAMAS QUE SEAN EJECUTADOS<html><body>",
        "BORRAN LA INFORMACION DEL USUARIO CONTENIDO EN LOS FICHEROS AFECTADOS",
        "EL VIRUS DE BOOT INFECTA A SU VEZ EL DISCO DURO",
        "INFECTAN TODA LA INFORMACIÓN CONTENIDA EN UN DISCO",
        "CAUSA GRAVES PERDIDAS DE DATOS Y REDUCE LAS DEFENSAS DEL SISTEMA INFORMATICO",
        "INFECTAN: ARCHIVOS, PROGRAMAS, MACROS, DISCOS, ETC",
        "OCASIONAN QUE EL EQUIPO ESTE LENTO Y DESAPAREZCAN ALGUNOS ARCHIVOS",
        "IMPIDEN EL ACCESO A CIERTAS PARTES DEL DISCO",
        "RECOPILAN INFORMACION PRIVADA",
        "GENERAN SATURACION ORGANIZADA DE SITIOS WEB ",
        "ESPIONAJE INFORMATICO"
    };
    
    public  String obtenerPregunta1(int pos){
    return preguntas1[pos];
    }
    public  String obtenerRutaFoto(int pos){
    return imagenes[pos];
    }
    
    public  String obtenerRutaFoto2(int pos){
    return imagenes2[pos];
    }
    public  String obtenerejemplos(int pos){
    return ejemplos[pos];
    }
    public  String obtenerFuncion(int pos){
    return funcion[pos];
    }
    public  String obtenerDaño(int pos){
    return daño[pos];
    }
  
    public String[][] obtenerPreguntas2Nivel(int respuestas1[], int tamaño){
    String preguntas[][] = new String[tamaño][2];//[fila] [columna]
    int cont=0;
    for(int i=0; i<preguntas2.length; i++){
    if(respuestas1[i]==1){
    preguntas[cont][0]=preguntas2[i];
    preguntas[cont][1]=String.valueOf(i); //que numero de virus es
    cont++;
    }
    }
    return preguntas;
    }
    public  String[][] obtenerPregunta2(int pos, int respuestas1[], int tamaño){
    String [][] preguntas=obtenerPreguntas2Nivel(respuestas1, tamaño);
    return preguntas;
    }
     public String obtenerVirus(int data){
     
      String nombre = null;

      switch(data) {
      case 0:
      nombre="RECYCLER";
      break;
      case 1:
      nombre="TROYANO";
      break;
      case 2:
      nombre="BOMBAS LOGICAS O DE TIEMPO";
      break;
      case 3:
      nombre="GUSANO";
      break;
      case 4:
      nombre="HOAX";
      break;
      case 5:
      nombre="JOKE"; 
      break;
      case 6:
      nombre="RESIDENTES"; 
      break;
      case 7:
      nombre="SOBREESCRITURA"; 
      break;
      case 8:
      nombre="BOOT"; 
      break;
      case 9:
      nombre="DE ENLACE"; 
      break;
      case 10:
      nombre="POLIMORFICOS"; 
      break;
      case 11:
      nombre="MULTIPARTITOS"; 
      break;
      case 12:
      nombre="DE FICHERO"; 
      break;
      case 13:
      nombre="DE FAT"; 
      break;
      case 14:
      nombre="HIJACKERS"; 
      break;
      case 15:
      nombre="ZOMBIE"; 
      break;
      case 16:
      nombre="KEYLOGGER"; 
      }
      
      return nombre;
    }
     
     public int obtenerIDVirus(String data){
     
      int id = 0;

      switch(data) {
      case "RECYCLER":
      id=0;
      break;
      case "TROYANO":
      id=1;
      break;
      case "BOMBAS LOGICAS O DE TIEMPO":
      id=2;
      break;
      case "GUSANO":
      id=3;
      break;
      case "HOAX":
      id=4;
      break;
      case "JOKE":
      id=5; 
       break;
      case "RESIDENTES":
      id=6; 
      break;
      case "SOBREESCRITURA":
      id=7;
      break;
      case "BOOT":
      id=8; 
      break;
      case "DE ENLACE":
      id=9; 
      break;
      case "POLIMORFICOS":
      id=10; 
      break;
      case "MULTIPARTITOS":
      id=11; 
      break;
      case "DE FICHERO":
      id=12; 
      break;
      case "DE FAT":
      id=13; 
      break;
      case "HIJACKERS":
      id=14; 
      break;
      case "ZOMBIE":
      id=15; 
      break;
      case "KEYLOGGER":
      id=16; 
      }
      
      return id;
    }
}
