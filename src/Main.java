public class Main {
    public static void main(String[] args) {

        //Задача 1
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 1:\n" + dog + "\n" + cat + "\n" + paper);

        //Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Задача 2:\n" + dog + "\n" + cat + "\n" + paper );
        //Задача 3
        dog = dog - 4;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Задача 3:\n" + dog + "\n" + cat + "\n" + paper );
        //Задача 4
        var friends = 19;
        System.out.println("Задача 4:\n" + friends);
        friends = friends + 2;
        System.out.println(friends);
        friends = friends / 17;
        System.out.println(friends);
        //Задача 5
        var frog = 3.5;
        System.out.println("Задача 5:\n" + frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 2;
        System.out.println(frog);
        //Задача 6
        var massOfTheFirstBoxer = 78.2;
        var massOfTheSecondBoxer = 82.7;
        var massOfTheBoxers = massOfTheFirstBoxer + massOfTheSecondBoxer;
        var massDifference = massOfTheSecondBoxer - massOfTheFirstBoxer;
        System.out.println("Задача 6: \n" + "Масса двух боксёров = " + massOfTheBoxers + " кг. \n" + "Разница масс двух боксёров = " +  massDifference + " кг.");
        //Задача 7
        var dividing = massOfTheSecondBoxer % massOfTheFirstBoxer;
        System.out.println("Задача 7: \n" + "Остаток от деления двух масс = " + dividing);
        //Задача 8.1
        var hours = 640;
        var hoursPerEmployee = 8;
        var employees = hours / hoursPerEmployee;
        System.out.println("Задача 8.1: \n" + "Всего работников в компании - " + employees + " человек.");
        // Задача 8.2
        employees = employees + 94;
        hoursPerEmployee = hours / employees;
        System.out.println("Задача 8.2: \n" + "Если в компании работает " + employees + " человек," + " то всего " + hoursPerEmployee + " часа работы может быть поделено между сотрудниками.");

    }
}