public class Main {
    public static void main(String[] args) {
        var dog= 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var dog1= 8.0 +4;
        var cat1 = 3.6 +4;
        var paper1 = 763789 +4;

        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(paper1);

        var dog2= 8.0 -3;
        var cat2 = 3.6 -3;
        var paper2 = 763789 -3;

        System.out.println(dog2);
        System.out.println(cat2);
        System.out.println(paper2);

        var friend= 19;
        System.out.println(friend);
         friend +=2;
        System.out.println(friend);
        friend /=7;
        System.out.println(friend);

        var frog=3.5;
        System.out.println(frog);
        frog*=10;
        System.out.println(frog);
        frog/=3.5;
        System.out.println(frog);
        frog+=4;
        System.out.println(frog);

        var boxcer1Weight = 78.2;
        var boxcer2Weight = 82.7;
        var totalWeight = boxcer2Weight+boxcer1Weight;
        System.out.println("общий вес бойцов: " +totalWeight);

        var weightDeference = boxcer2Weight-boxcer1Weight;
        System.out.println("разница в весе "+weightDeference);

        var remeinder= boxcer2Weight % boxcer1Weight;
        System.out.println(" остaток от деления :" + remeinder);

        var workTime = 640;
        var timePerDay = 8;
        var employeeCount= workTime/timePerDay;

        System.out.println("Всего работников в компании: " + employeeCount+ " человек");
         employeeCount+=14;
         var newTimePerDay = workTime*1. / employeeCount;
        System.out.println(" Если в компании работает: "+ employeeCount +" то можно разделить " + newTimePerDay + " между сотрудниками");




    }
}