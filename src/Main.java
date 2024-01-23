//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Задание N1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("");
        System.out.println("Задание N2");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("");
        System.out.println("Задание N3");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("");
        System.out.println("Задание N4");

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("");
        System.out.println("Задание N5");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("");
        System.out.println("Задание N6");

        var firstBoxersWeight = 78.2;
        var secondBoxersWeight = 82.7;
        var totalWeight = firstBoxersWeight + secondBoxersWeight;
        System.out.println(totalWeight);

        var weightDifference = firstBoxersWeight - secondBoxersWeight;
        System.out.println(weightDifference);

        System.out.println("");
        System.out.println("Задание N7");

        var alt1WeightDifference = secondBoxersWeight - firstBoxersWeight;
        var alt2WeightDifference = secondBoxersWeight % firstBoxersWeight;

        System.out.println(alt1WeightDifference);
        System.out.println(alt2WeightDifference);

        System.out.println("");
        System.out.println("Задание N8");

        var workHoursTotal = 640;
        var workHoursPerEmployee = 8;
        var employeesAmount = workHoursTotal / workHoursPerEmployee;
        System.out.println("Всего работников в компании — " + employeesAmount + " человек." );

        var altEmployeesAmount = employeesAmount + 94;
        var altWorkHoursTotal = altEmployeesAmount * workHoursPerEmployee;
        System.out.println("Если в компании работает " + altEmployeesAmount + " человек, то всего " + altWorkHoursTotal + " часов работы может быть поделено между сотрудниками." );
    }
}