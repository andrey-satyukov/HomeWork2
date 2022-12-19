public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1(){
        System.out.println("Задачb 1-3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper -7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2(){
        System.out.println("Задачи 4-5");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task3(){
        System.out.println("Задача 6");
        var boxerFirst = 78.2;
        var boxerSecond = 82.7;
        var totalWeight = boxerSecond + boxerFirst;
        System.out.println("Общий вес " + totalWeight + " кг");
        var differencWeight = boxerSecond - boxerFirst;
        System.out.println("Один тяжелее другого на " + differencWeight + " кг");
        System.out.println("Задача 7");
        differencWeight = boxerSecond - boxerFirst;
        System.out.println("Один тяжелее другого на " + differencWeight + " кг");
        differencWeight = boxerSecond % boxerFirst;
        System.out.println("Один тяжелее другого на " + differencWeight + " кг");
        System.out.println("Задача 8");
        var totalTime = 640;
        var personTime = 8;
        var personInCompany = totalTime / personTime;
        System.out.println("Всего в компании - " + personInCompany+ " человек");
        personInCompany = personInCompany + 94;
        System.out.println("Если в компании работает " + personInCompany + " человек, то всего " + personInCompany * 8 + " часов работы может быть поделено между сотрудниками");
    }
}
