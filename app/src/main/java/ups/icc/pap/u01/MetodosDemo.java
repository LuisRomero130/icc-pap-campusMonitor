package ups.icc.pap.u01;

import java.util.function.Function;

public class MetodosDemo {

    public static void main(String[] args){
        Caja<String> Original= new Caja<String>("Algoritmo");
        //Mapear el valor String de la caja a un Integer
        Integer longitud= Original.mapear(t -> t.length());
        String etiqueta= Original.mapear(t -> "Materia: " + t);


        System.out.println("Original" + Original.obtener());
        System.out.println("Longitud"+ longitud);
        System.out.println(etiqueta);


        Function<String,Integer> fun= texto -> texto.length(); 
        Integer longitud1= Original.mapear(fun);
        System.out.println("Longitud1: "+ longitud1);




    }
    
}