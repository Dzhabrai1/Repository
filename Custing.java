public class Custing {

 public static void main(String[] args){
//расширение
     //byte a = 4;
     //double b = a;
     //System.out.println(a);
     //System.out.println(b);
// сужение

     //double c = 5.0;
     //int d = (int) c;
     //System.out.println(c);
     //System.out.println(d);

     //пример сужения для числа с плавающей точкой
     //double q = 3.14;
     //System.out.println(q);

     //int w = (int) q;
     //System.out.println(w);


// пример сужения для чисел разного диапозона
     //int e = 125000;
     //System.out.println(e);

     // здесь при конвертации мы теряем данные
     //byte r = (byte) e;
     //System.out.println(r);


     // byte меняется [-128;127]
     //в скобках ставим (byte)
     //byte t = 126;
     //System.out.print((byte)(t + 1 +1 ));


     // чтобы узнать мак/мин значение INT

     //int y = Integer.MAX_VALUE;
     //System.out.println(y + 1);

     //System.out.println(Integer.MIN_VALUE);

     //double, double -> double
     //System.out.println(Math.pow(8,2));




    // char u = 916;
     //System.out.println(u);

     // только в одинарных скобках, иначе не распознает.
     //char i = 'm';
     //System.out.println(i);

    // char o = '\u0394';
     //System.out.println(o);

    // char [] p = Character.toChars(0xFAE0);
     //System.out.println(p.length);
     //System.out.println(p);


     //System.out.print((int) u );




     char a ='1';

     // Для каждого типа приметивов есть обертка
     // int -> Integer
     // byte -> Byte
     // char -> Character
     System.out.println((int) a);
     int aa = Character.getNumericValue(a);
     System.out.println(aa);
     System.out.println();




     int aaa = Integer.parseInt(String.valueOf(a));
     System.out.println(aaa);





 }
}

