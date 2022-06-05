import java.io.BufferedReader;
import java.io.FileReader;

public class txt{

    public String leerTxt(String direccion){ // direccion del achivo

    String texto = "";

            try{
                
                try (BufferedReader buffer = new BufferedReader(new FileReader(direccion))) {
                        String save = ""; // variable para guardar el texto
                        String readBuffer;

                        while( (readBuffer = buffer.readLine()) != null) {
                            // hacer el ciclo mientras readBuffer lee el txt y hay datos
                
                        save = save + readBuffer; // guardamos el texto del archivo en save/variable temporal
                                
                        }
                        texto = save;
                }				
        }
        catch (Exception e){ 
                        System.err.println("No hay archivo alguno");

                }
        return texto;

        }

}