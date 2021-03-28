public class Task {
    public static void main(String[] args) {
        Patient patient = new Patient("Татару В.С.");

        patient.medicalCard.addDoctors(new Doctor("Офтальмолог", "Иванов Ф.М.", 500));
        patient.medicalCard.addDoctors(new Doctor("ЛОР", "Шрек С.Р.", 100));
        patient.medicalCard.addDoctors(new Doctor("Зубной", "Фёдоров А.Ф.", 50));

        patient.printPatient();

        System.out.println();

        Patient patient_2 = new Patient("Зеленин А.О.");

        patient_2.medicalCard.addDoctors(new Doctor("Проктолог", "Пупкин В. И.", 500));
        patient_2.medicalCard.addDoctors(new Doctor("Мамолог", "Мамин М. М.", 100));
        patient_2.medicalCard.addDoctors(new Doctor("Психотерапевт", "Шизойд А. А.", 50));

        patient_2.printPatient();
    }
}
