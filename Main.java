import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {
            Agenda agenda = new Agenda();
            agenda.aggiugiAppuntamento(new Appuntamento(LocalDate.of(2022,12,25),"Halloween","Buon Halloween!"));
            agenda.aggiugiAppuntamento(new Appuntamento(LocalDate.of(2022,5,1),"abc","cba"));
            agenda.SalvaAgenda();
    }
}
