import java.util.ArrayList;

public class Computer {

    public void computeRondas(ArrayList teams, String equipoDescansa) {

        int bandera = 0;
        ArrayList rondas = new ArrayList();

        while (bandera < teams.size()) {
            for (int i = 0; i < teams.size(); i++) {
                if (i != bandera && i > bandera) {
                    ArrayList partida = new ArrayList();
                    partida.add(teams.get(bandera).toString());
                    partida.add(teams.get(i));
                    rondas.add(partida);
                }
            }
            bandera++;
        }

        for (int i = 0; i < rondas.size(); i++) {
            System.out.print(rondas.get(i));
        }
        if (equipoDescansa != null)
            System.out.println(" Descansa Equipo " + equipoDescansa);

    }

    public void computeRondasImpar(ArrayList teams) {
        int indexEquipoDescansa = 0;
        while (indexEquipoDescansa < teams.size()) {
            ArrayList equiposJugando = deleteElementByIndex(teams, indexEquipoDescansa);
            computeRondas(equiposJugando, teams.get(indexEquipoDescansa).toString());
            indexEquipoDescansa++;
        }
    }

    public ArrayList deleteElementByIndex(ArrayList equipos, int index) {
        ArrayList salida = new ArrayList();
        for (int i = 0; i < equipos.size(); i++) {
            if (index != i) {
                salida.add(equipos.get(i));
            }
        }
        return salida;
    }
}
