public class main {
    public static void main(String[] args) {
        
        
        txt a = new txt(); //invocamos la class txt y le damos el valor de a
        String var = a.leerTxt("C:\\Users\\7meji\\OneDrive\\Documentos\\SEMESTRE 2\\Lenguajes\\Proyecto 2\\txt\\anio_test.txt");
        String var1 = a.leerTxt("C:\\Users\\7meji\\OneDrive\\Documentos\\SEMESTRE 2\\Lenguajes\\Proyecto 2\\txt\\2001.txt");
        String var2 = a.leerTxt("C:\\Users\\7meji\\OneDrive\\Documentos\\SEMESTRE 2\\Lenguajes\\Proyecto 2\\txt\\porque_tomar_agua.txt");
            
        int num = 3;
        switch(num) {
            case 1:
            System.out.println(var);
            break;
            case 2:
            System.out.println(var1);
            break;
            case 3:
            System.out.println(var2);
            break;
            default:
            System.out.println("No se encontro ningun archivos, porfavor vuelve a intentarlo");
        }

        System.out.println("Fin del programa :)");
    }
}
