package day5.abstractLesson;

import java.util.Arrays;

public class Teacher implements SchoolWorker {

    private SchoolWorkerDAO schoolWorkerDAO = new SchoolWorkerDAO(); // powołaliśmy taki obietk
    private int id;
    private String name;

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void addWorker(SchoolWorker schoolWorker) {
        SchoolWorker[] tablica = schoolWorkerDAO.getSchoolWorkers();
        addNewWorker(schoolWorker, tablica);
        System.out.println(Arrays.toString(schoolWorkerDAO.getSchoolWorkers()));
    }

    private SchoolWorker[] addNewWorker(SchoolWorker schoolWorker, SchoolWorker[] schoolWorkers) {
        SchoolWorker[] tablica2 = Arrays.copyOf(schoolWorkers, schoolWorkers.length + 1);
        tablica2[tablica2.length - 1] = schoolWorker;
       return tablica2;
    }

    @Override
    public SchoolWorker[] getAllWorkers() {
        return schoolWorkerDAO.getSchoolWorkers();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
