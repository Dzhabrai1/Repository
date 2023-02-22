public class StringExamples {
    public static void main(String[] args){
        String name1 = "Bob";
        String name2 ="Bob";

        //System.out.println(name1.equals(name2)); // сравнение по значению
        //System.out.println(name1 == name2);      // сравнение по ссылкам

        //System.out.println();

        String name3 = new String("Lady Gaga");
        String name4 = new String("Lady Gaga");

        //System.out.println(name3.equals(name4)); // сравнение по значению
       // System.out.println(name3 == name4);      // сравнение по ссылкам


        System.out.println(name1 + " " + name1.length());
        System.out.println(name3 + " " + name3.length());

        System.out.println(name1 + " " + name1.charAt(0));

        // здесь создали переменную из другой переменной.
        char example = name1.charAt(0);

        // стринг обладает  набором методов и вызвали метод to.CharArray(),
        // который в свою очередь конвертирует стринговую переменную
        // в массив символов
                            // справа мы сначала вызвали метод
                            //
        char[] elements = name1.toCharArray();
        System.out.println();


        //обрезаем буквы в имени. Цифры в скобках можно ставить
        //в зависимости от колличества букв в слове
        System.out.println(name3.substring(2));
        System.out.println(name3.substring(3,6));



        // для форматирования стринговых обьектов
        System.out.println(name3);
        System.out.println(name3.toLowerCase());
        System.out.println(name3.toLowerCase());



    }

}
