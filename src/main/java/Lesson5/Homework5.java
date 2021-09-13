package Lesson5;

public class Homework5 {

    public static void main(String[] args) {

        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Алиайдар Хамид Куанышбаевич", "Электрик",
                "khamid_98@mail.ru", "+77784876523", 250000, 23);
        workers[1] = new Worker("Бакалова Екатерина Константиновна", "Логист",
                "katya@mail.ru", "+77013503490", 400000, 54);
        workers[2] = new Worker("Воронов Константин Валентинович", "Физик",
                "voron@mail.ru", "+77756742345", 100000, 42);
        workers[3] = new Worker("Турдахов Даур Замирович", "Мастер-оптик",
                "gaypka@mail.ru", "+77777777777", 2250000, 30);
        workers[4] = new Worker("Ахметов Таир Анварович", "Хирург",
                "tairka@mail.ru", "+77776665544", 330000, 61);


        for (Worker worker : workers) {
            if (worker.getAge() > 40) {
                worker.printWorker();
            }
        }
    }
}