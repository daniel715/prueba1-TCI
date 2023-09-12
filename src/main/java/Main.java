import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Computer computer = new Computer();
        ArrayList teams = new ArrayList();


        Boolean hasNext = true;
        while (hasNext) {
            System.out.println("Ingrese nombre equipo ");
            String nombreEquipo = br.readLine();
            teams.add(nombreEquipo);
            System.out.println("¿Desea Agregar mas equipos? 1 Si / 0 No");
            String continuar = br.readLine();
            if (continuar.equals("0")) {
                hasNext = false;
            }
        }


        if (teams.size() % 2 == 0){
            computer.computeRondas(teams, null);
        }else{
            computer.computeRondasImpar(teams);
        }
    }
}
