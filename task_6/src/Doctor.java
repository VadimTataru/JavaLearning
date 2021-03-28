public class Doctor {
    private String specification;
    private String fio;

    public Doctor(String specification, String fio, int cost) {
        this.specification = specification;
        this.fio = fio;
    }

    public String toString() {
        return specification + " - " + fio;
    }
}
