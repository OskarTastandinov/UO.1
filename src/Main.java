public class Main {
    public static void main(String[] args) {
        task1(); // ДЗ-1
        task2(); // ДЗ-1
        task3();// ДЗ-1
        task4();// ДЗ-2
        task5();// ДЗ-2
        task6();// ДЗ-2
        task7();// ДЗ-3
        task8();// ДЗ-3
        task9();// ДЗ-3

    }


    private static void task1() {
    System.out.println("Задание 1.1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
            if (age < 18) {
                System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
            }
        }

    }
    private static void task2(){
    System.out.println("Задание 1.2");
        int child = 7;
        if (child >= 7 && child < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (child >= 18 && child <= 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (child < 7 && child > 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
    }
    private static void task3(){
        System.out.println("Задание 1.3");
        int seatCarriage = 103;
        int fullCar = 102;
        int seating = 60;
        if (seatCarriage <= seating) {
            System.out.println("Имеется сидячее место");
        }
        if (seatCarriage >= seating && seatCarriage <= fullCar) {
            System.out.println("Имеется стоячее место");
        }
        if(seatCarriage > fullCar) {
            System.out.println("Мест в вагоне нет");
        }

    }
    private static void task4() {
    System.out.println("Задание 2.1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }
    }

    private static void task5() {
    System.out.println("Задание 2.2");
        int child = 25;
        if (child >= 7 && child < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (child >= 18 && child <= 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if (child < 7) {
            System.out.println();
        } else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
    }

    private static void task6() {
    System.out.println("Задание 2.3");
        int seatCarriage = 23;
        int fullCar = 102;
        int seating = 60;
        if (seatCarriage <= seating) {
            System.out.println("Имеется сидячее место");
        } else if (seatCarriage >= seating && seatCarriage <= fullCar) {
            System.out.println("Имеется стоячее место");
        } else {
            System.out.println("Мест в вагоне нет");
        }
    }
    private static void task7(){
    System.out.println("Задание 3.1");
        int age = 19;
        if(age >= 2 && age <= 6){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
    }
    private static void task8(){
    System.out.println("Задание 3.2");
        int ageChild = 15;
        if(ageChild < 5){
            System.out.println("Ребенок не может кататться на аттракционе");
        } else if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");

        } else {
            System.out.println("Ребенок может кататься без сопровождения взрослого.");
        }


    }
    private static void task9(){
    System.out.println("Задание 3.3");
        int one = 1;
        int two = 2;
        int free = 3;
        if(one < two && two > free){
            System.out.println("Максимальное число содержит переменная " + two);
        }else if(one > two && free < one) {
            System.out.println("Максимальное число содержит переменная " + one);
        }else {
            System.out.println("Максимальное число содержит переменная " + free);
        }

    }

}

