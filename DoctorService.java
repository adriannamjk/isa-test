import java.util.ArrayList;
import java.util.List;

class DoctorService {
    private final List<Doctor> doctors = new ArrayList<>();

    DoctorService() {
        this.doctors.add(new Doctor("Adam", "Lecz"));
        this.doctors.add(new Doctor("Marcin", "Leczniczny"));
        this.doctors.add(new Doctor("Marcin2", "Leczniczny3"));
        this.doctors.add(new Doctor("Marcin3", "Leczniczny4"));
    }

    List<Doctor> getAll() {
        return this.doctors;
    }
}
