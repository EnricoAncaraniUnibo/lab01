class Student {

    private String name;
    private String surname;
    private int id;
    private int matriculationYear;


    void build(String nome, String cognome, int id, int anno) {
        this.name=nome;
        this.surname=cognome;
        this.id=id;
        this.matriculationYear=anno;
    }

    void printStudentInfo() {
        System.out.println(this.name+this.surname+this.id+this.matriculationYear);
    }
}
