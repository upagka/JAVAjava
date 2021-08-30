package Lesson1;

// Имена классов  стиль PascalCase: SomeLongClassForExample
public class Classwork {

    //Имена методов и переменных camelCase: someLongNamesMethod

    // String - строковая переменная, в ней хранится текст
    public static void main(String...args) {
//    arithmeticOperations();

        printBranching(-10);
        printBranching(99);
        printBranching(100500);
        printBranching(0);


        System.out.println(add(20, 30));
        int addResult = add(500, 400);
        System.out.println(addResult);


        int a = 10;
        a++;  //Инкремент
        ++a;
        System.out.println(a++);
        a--;    //Декремент
        --a;
        System.out.println(a);

        a += 10; //a = a + 10
        a -= 10; //a = a - 10
        a /= 10; //a = a / 10
        a *= 10; //a = a * 10
        a %= 10; //a = a % 10

        System.out.println("a = " + a);


    //    variables();
    }
        static void printBranching(int position) {
            if (position < 0 ) {
                System.out.println("Oooups");
            } else  if (position == 0) {
                System.out.println("Zero");
            } else if (position > 100) {
                System.out.println("KJ K:JKJ");
            } else {
                System.out.println("ERROR");
            }
        }
         static int add(int first, int second) {
  //              int result = first + second;
   //            return result;
              return  first + second;
            }



        private static void variables() {
            //Переменные в java 2 видов: примитивные(8 видов) и ссылочные

// ПРИМИТИВНЫЕ ПЕРЕМЕННЫЕ:

            byte byteVariable; // 1 byte - 8 bit. -128..127
            byteVariable = 10;
            short shortVariable = 256; // 2 byte - 16 bit. -32768..32767

            int integerVariable = 2_100_000_000; //4 byte - 32 bit. -2.1m..2.1m

            long longVariable = 2_200_000_000L; //8 byte - 64 bit. -2.1m..2.1m
            //Для обозначения long переменной в конце присвоенного значения необходимо ставить L, чтобы компилятор не воспринимал переменную за int переменную и не применял ее диапазон срабатывания

            char charVariable = 'q'; // 16 bit 0..65535 (16 битные числа = 1 текстовый символ. Не больше одного)
            char charVariable1 = 68;
            System.out.println(charVariable1);

            boolean booleanVariable = true; // Логические переменные. TRUE/FALSE
            boolean booleanVariable1 = (10 + 5) > 12;
            System.out.println (booleanVariable1);

            double doubleVariable = 0.256; // 64 bit Переменная с плавающей точкой. Двойной точности, потому что 64 бит, более точные

            float floatVariable = 2.434f; // 32 bit Переменная с плавающей точкой. Одинарной точности. Необходимо ставить f, чтобы компилятор не принимал переменную за double


            // ССЫЛОЧНЫЕ ПЕРЕМЕННЫЕ (На эти переменные хранятся не сами данные, а ссылки на них)

            String stringVariable = "Hello";

            int result = byteVariable + shortVariable;
            System.out.println(result);

            String string1 = " world";
            String string2 = "!!!";
            String string3 = stringVariable + string1 + string2;


            System.out.println(string3);
        }

        static void arithmeticOperations() {
        System.out.println(10 + 15);
        System.out.println(10 - 15);
        System.out.println(10 * 15);
        System.out.println(30 / 15);
        //Остаток от деления %
        System.out.println(33 % 15);
        System.out.println(10 == 10);
        System.out.println(10 > 11);
        System.out.println(10 < 11);
        System.out.println(10 >= 11);
        System.out.println(10 <= 11);

        //&& =  логическое "и". Условие, при котором TRUE только, если все эти аргументы верны.
        System.out.println(10 <= 11 && 3 > 2 && 2 < 4);
        // || = Логическое "ИЛИ". TRUE, если хоть один аргумент верен
        System.out.println(10 >= 11 || 3 > 2 ||2 > 4);
        System.out.println((10 >= 11 || 3 > 2) ||2 > 4);
        System.out.println((10 >= 11 && 3 > 2) ||2 > 4);
    }






}
