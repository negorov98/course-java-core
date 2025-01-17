package com.rakovets.course.java.core.practice.decision_making_statements;

/**
 * Разработать программу для сервиса доставки.
 * <p>
 * Определить номер этажа дома для текущего клиента.
 */
class Task13 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int numberFloors = 5;
        int numberApartmentsPerFloor = 4;
        int apartmentNumber = 34;

        int floorNumber = getFloorNumber(numberFloors, numberApartmentsPerFloor, apartmentNumber);
        System.out.printf("Result: %s", floorNumber);
    }

    /**
     * Определяет номер этажа дома для текущего клиента.
     *
     * @param numberFloors             количество этажей
     * @param numberApartmentsPerFloor количество квартир на этаже
     * @param apartmentNumber          номер квартиры
     * @return номер этажа
     */
    static int getFloorNumber(int numberFloors, int numberApartmentsPerFloor, int apartmentNumber) {
        int totalApartments = numberFloors * numberApartmentsPerFloor;
        int sumOfFloorNumber;
        int numberOfEntrance;
        double numberOfFloor;

        if (apartmentNumber % totalApartments != 0) {
            numberOfEntrance = apartmentNumber / totalApartments + 1;
        } else {
            numberOfEntrance = apartmentNumber / totalApartments;
        }
        sumOfFloorNumber = (apartmentNumber - totalApartments * (numberOfEntrance - 1));

        if (sumOfFloorNumber % numberApartmentsPerFloor != 0) {
            numberOfFloor = sumOfFloorNumber / numberApartmentsPerFloor + 1;
        } else {
            numberOfFloor = sumOfFloorNumber / numberApartmentsPerFloor;
        }
        return (int) numberOfFloor;
    }
}
