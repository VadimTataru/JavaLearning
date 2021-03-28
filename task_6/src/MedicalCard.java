import java.util.ArrayList;

public class MedicalCard{
    private ArrayList<Doctor> doctors;

    public MedicalCard() {
        doctors = new ArrayList<Doctor>();
    }

    public int addDoctors(Doctor doctor) {
        doctors.add(doctor);
        return doctors.indexOf(doctor);
    }

    public void printMedicalCard() {
        for(Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }
}
