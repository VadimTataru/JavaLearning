import java.util.ArrayList;

public class Patient extends MedicalCard {

    private String fio;
    MedicalCard medicalCard;

    public Patient(String fio) {
        this.fio = fio;
        medicalCard = new MedicalCard();
    }

    public void printPatient() {
        System.out.println("<<<---------Пациент--------->>>");
        System.out.println(fio);
        System.out.println("<<<---------Мед. карта--------->>>");
        medicalCard.printMedicalCard();
    }

}
