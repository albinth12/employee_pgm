import java.util.*;

import java.util.ArrayList;
import java.util.List;

class Main {

    class Employee
    {
        private Integer age=0;
        private String name=null;
        private int salary=0;

        public Employee(String name, Integer salary, Integer age) {
                this.name = name;
                this.salary = salary;
                this.age = age;
        }

    }
    public static void main(String[] args) {

                    String name[] = {"Shubham",
                                                         "Atul",
                                                          "Ayush",
                                                          "Rupesh",
                                                          "Amal",
                                                          "Oliver",
                                                         "George",
                                                         "Harry",
                                                         "Noah",
                                                         "Jack",
                                                         "Charlie",
                                                         "Leo",
                                                         "Jacob",
                                                         "Freddie",
                                                         "Alfie",
                                                         "Archie",
                                                         "Theo",
                                                         "Oscar",
                                                         "Arthur",
                                                         "Thomas",
                                                         "Logan",
                                                         "Henry",
                                                         "Joshua",
                                                         "James",
                                                         "William",
                                                         "Max",
                                                         "Isaac",
                                                         "Lucas",
                                                         "Ethan",
                                                         "Teddy",
                                                         "Finley",
                                                         "Mason",
                                                         "Harrison",
                                                         "Hunter",
                                                         "Alex",
                                                         "Daniel",
                                                         "Joseph",
                                                         "Tommy",
                                                         "Arlo",
                                                         "Reggie",
                                                         "Edward",
                                                         "Jaxon",
                                                         "Adam",
                                                         "Sebastian",
                                                         "Rory",
                                                         "Riley",
                                                         "Dylan",
                                                         "Elijah",
                                                         "Carter",
                                                         "Albie",
                                                         "Louie",
                                                         "Toby",
                                                         "Benjamin",
                                                         "Reuben",
                                                         "Jude",
                                                         "Samuel",
                                                         "Harley",
                                                         "Luca",
                                                         "Frankie",
                                                         "Ronnie",
                                                         "Jenson",
                                                         "Hugo",
                                                         "Jake",
                                                         "David",
                                                         "Theodore",
                                                         "Roman",
                                                         "Bobby",
                                                         "Alex",
                                                         "Caleb",
                                                         "Ezra",
                                                         "Ollie",
                                                         "Finn",
                                                         "Jackson",
                                                         "Zachary",
                                                         "Jayden",
                                                         "Harvey",
                                                         "Albert",
                                                         "Lewis",
                                                         "Blake",
                                                         "Stanley",
                                                         "Elliot",
                                                         "Grayson",
                                                         "Liam",
                                                         "Louis",
                                                         "Matthew",
                                                         "Elliott",
                                                         "Tyler",
                                                         "Luke",
                                                         "Michael",
                                                         "Gabriel",
                                                         "Ryan",
                                                         "Dexter",
                                                         "Kai",
                                                         "Jesse",
                                                         "Leon",
                                                         "Nathan",
                                                         "Ellis",
                                                         "Connor",
                                                         "Jamie",
                                                         "Rowan",
                                                         "Sonny"
                                                         };
                                        int salary[] = {1000, 2100, 3100, 4000,3563,3563,1608,1155,2519,2692,
                                                        2500,3500,4000,1500,2600,3200,1100,1200,1800,2900,
                                                        3100,2600,3800,1600,3900,1750,2560,3600,4000,3600,
                                                        2500,1800,1600,2400,3800,3700,1900,1600,1800,2000,
                                                        3150,2550,3650,3000,1950,2000,2500,3600,3850,4000,
                                                        3600,1800,2700,1700,3700,2600,2800,1900,1600,1100,
                                                        2500,3000,3600,3100,2900,3550,3700,2400,2100,3600,
                                                        4000,3600,3100,3200,3900,2600,2900,2700,2850,1300,
                                                        2600,2800,2700,3600,3450,3800,3150,2500,1650,1900,
                                                        3000,3600,2500,2400,2150,2600,2700,4000,3650,2600};
                                        int age[] = {25,31,40,36,26,28,40,36,25,55,
                                                     31,36,45,55,59,48,47,32,25,28,
                                                     36,38,42,55,52,59,21,26,28,38,
                                                     41,25,36,39,37,48,59,52,53,46,
                                                     25,24,26,36,35,34,33,45,48,49,
                                                     29,55,58,45,47,49,36,35,34,46,
                                                     58,57,25,26,45,39,37,29,38,43,
                                                     68,69,64,36,35,31,48,47,42,55,
                                                     58,60,23,27,45,46,56,51,52,48,
                                                     48,47,49,52,56,36,35,38,29,27};

                    // Create an object of the class
                    Main custom = new Main();

                    // and call the function to add the values to the arraylist
                    custom.addValues(name,salary,age);

      }
      public void addValues(String name[], int salary[],
                               int age[])
         {
             // local custom arraylist of data type
             // Data having (int, String, int, long) type
             // from the class
             ArrayList<Employee> list=new ArrayList<>();

             for (int i = 0; i < 100; i++)
             {
                 // create an object and send values to the
                 // constructor to be saved in the Data class
                 list.add(new Employee(name[i], salary[i],
                                                   age[i]));
             }

             // after adding values printing the values to test
             // the custom arraylist
             printValues(list);
         }

         public void printValues(ArrayList<Employee> list)
         {
             // list- the custom arraylist is sent from
             // previous function
            float meanage=0;
            int count=0,no=0;
            System.out.println("\n \n Employee Details Where Salary Grater than 3000 \n");
            System.out.println("Name \t\t\t\t Salary \t\t\t Age \n");
             for (int i = 0; i < 100; i++)
             {
                 // the data received from arraylist is of Data type
                 // which is custom (int, String, int, long)
                 // based on class Data

                 Employee data = list.get(i);

                 // data variable of type Data has four primitive datatypes
                 // roll -int
                 // name- String
                 // marks- int
                 // phone- long
                 if(data.salary > 3000)
                 {
                    count+=data.age;
                    System.out.println(data.name+"\t\t\t\t"+data.salary+"\t\t\t\t"+data.age);
                    no++;
                }
             }
             meanage=count/no;
             System.out.println("\n\n Mean Age = \t"+meanage);
         }
}

