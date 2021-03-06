import java.util.ArrayList;
import java.util.List;

class PatientService {
    private final List<Patient> patients = new ArrayList<>();

    PatientService() {
        this.patients.add(new Patient("Adam", "Nowak", 12));
        this.patients.add(new Patient("Maria", "Nowakowska", 13));
        this.patients.add(new Patient("Daaa", "Nowakowska", 13));
        this.patients.add(new Patient("Aa", "Nowakowska", 13));
        this.patients.add(new Patient("Adusia", "Mondra", 13));
        this.patients.add(new Patient("Aaaa", "Nowakowska", 13));
        this.patients.add(new Patient("Adusia", "Mondra", 13));
        this.patients.add(new Patient("Adusia2", "Mondra2", 13));
    }

    List<Patient> getAll() {
        return this.patients;
    }
}
