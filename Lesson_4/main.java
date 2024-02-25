package Lesson_4;

public class main {
    public static void main(String[] args) {
// задание 1
    Person person= new Person("Andrew Homenok","Engineer", "a.homenok@mail.ru", "+3751122334455", 4000, 27);
System.out.println(person);
        System.out.println();

// задание 2
   Person[] persArray=new Person[5];
        persArray[0]= new Person("Ivan Ivanov", "Department head", "i.ivanov@mail.ru", "+375293344455",4500,32 );
        persArray[1]=new Person("Petr Petrov", "Worker", "p.petrov@mail.ru", "+375445577889", 1500,35);
        persArray[2]=new Person("Sidor Sidorov", "Chief Specialist", "s.sidorov@mail.ru", "+375441010998", 2000,29);
        persArray[3]=new Person("Anna Berezkina", "Leading Specialist", "a.berezkina@gmail.com", "+375299988776", 1800, 34);
        persArray[4]=new Person("Tatiana Ryabinina", "Chief Accountant", "t.ryabinina@gmail.com", "+375445566778", 3000, 39);

                for (int i=0; i<5; i++)
                System.out.println(persArray[i]);
        System.out.println();

   // задание 3
    Park parkGomel= new Park();
    Park.Attraction attraction1= parkGomel.new Attraction("Ромашка", 5, 3.10);
    Park.Attraction attraction2= parkGomel.new Attraction("Колесо обозрения", 10, 5.10);
    Park.Attraction attraction3= parkGomel.new Attraction("Цепные качели", 7, 2.15);

    Park.printPark();
        System.out.println(attraction1);
        System.out.println(attraction2);
        System.out.println(attraction3);

    }
}
