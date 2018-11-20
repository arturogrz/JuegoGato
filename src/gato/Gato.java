package gato;
import javax.swing.JOptionPane;
public class Gato {
    public static boolean juegoFin;
    public static int ganadosX = 0;
    public static int ganadosO = 0;
    public static int ganadosE = 0;
    public static boolean empatados = false;
    public static void main(String[] args) {
    new Juego().setVisible(true);
    }
    //comprobamos si hay un ganador
    public static void comprobar(String b1,String b2,String b3,String b4,String b5,String b6,String b7,String b8,String b9){
        Juego juego = new Juego();
        //Horizontal
        if (b1!="" && b2!="" && b3!=""){
            if (b1==b2 && b2==b3){
            juego.mensaje(b1);
            empatados = false;
            return;
            }
        }
        if (b4!="" && b5!="" && b6!=""){
            if (b4==b5 && b5==b6){
            juego.mensaje(b4);
            empatados = false;
            return;
            }
        }
        if (b7!="" && b8!="" && b9!=""){
            if (b7==b8 && b8==b9){
            juego.mensaje(b7);
            empatados = false;
            return;
            }
        }
        //Vertical
        if (b1!="" && b4!="" && b7!=""){
            if (b1==b4 && b4==b7){
            juego.mensaje(b1);
            empatados = false;
            return;
            }
        }
        if (b2!="" && b5!="" && b8!=""){
            if (b2==b5 && b5==b8){
            juego.mensaje(b2);
            empatados = false;
            return;
            }
        }
        if (b3!="" && b6!="" && b9!=""){
            if (b3==b6 && b6==b9){
            juego.mensaje(b3);
            empatados = false;
            return;
            }
        }
        //Cruzado
        if (b1!="" && b5!="" && b9!=""){
            if (b1==b5 && b5==b9){
            juego.mensaje(b1);
            empatados = false;
            return;
            }
        }
        if (b3!="" && b5!="" && b7!=""){
            if (b3==b5 && b5==b7){
            juego.mensaje(b3);
            empatados = false;
            return;
            }
        }
        if(b1 != ""  && b2 != "" && b3 != "" && b4 != "" && b5 != "" && b6 != "" && b7 != "" && b8 != "" && b9 != ""){
            juego.mensaje("E");
        }
    }    
}
