/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamanocarpeta;
import java.io.File;

/**
 *
 * @author Xavi
 */
public class TamanoCarpeta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String carpeta = "/Users/Xavi/Desktop";
        System.out.println("El tamano de la carpeta es: " + new Carpeta().getTamano(new File(carpeta)) + " bytes");
    }
    
}

class Carpeta{
    public long getTamano(File carpeta){
        long tamanoTotal = 0;
        File[] archivos = carpeta.listFiles();
        for(File f: archivos){
            if(f.isDirectory()){
                tamanoTotal = tamanoTotal + getTamano(f);
            }
            else{
                tamanoTotal = tamanoTotal + f.length();
            }
        }
        return tamanoTotal;
    }
    
      // forma 2:
//    public long getTamano(File carpeta){
//        long tamanoTotal = 0;
//        File[] archivos = carpeta.listFiles();
//        for(int f = 0; f<archivos.length;f++){
//            if(archivos[f].isDirectory()){
//                tamanoTotal = tamanoTotal + getTamano(archivos[f]);
//            }
//            else{
//                tamanoTotal = tamanoTotal + archivos[f].length();
//            }
//        }
//        return tamanoTotal;
//    }
}
