import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       Problem 1
//        a
       /*
       double res1=kosu(6,6,2);
        double res2=kosu(13,13,2);
        double res3=kosu(21,21,2);
        double total=res1+res2+res3;
        System.out.println(total);
        */
// b
        /*
        double res1=kosu2(5,7);
        double res2=kosu2(12,8);
        double res3=kosu2(31,2);
        double total=res1+res2+res3;
        System.out.println(total);*/
//c
       /* double res1=kosu3(15,8);
        double res2=kosu3(6,12);
        double res3=kosu3(7,21);
        double total= res1+res3+res2;
        System.out.println(total);*/
//        d
       /* double res1=kosu3(13,7);
        double res2=kosu3(15,12);
        double res3=kosu3(32,21);
        double total= res1+res3+res2;
        System.out.println(total);*/
//        Problem2
      /*  Scanner scanner=new Scanner(System.in);
        System.out.println("Vvedite pervoe naturalnoe chislo");
        int first_number=scanner.nextInt();
        int natural_number1_lenth=lenth(first_number);
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Vvedite vtoroe naturalnoe chislo");
        int second_number=scanner1.nextInt();
        int natural_number2_lenth=lenth(second_number);
        if(natural_number1_lenth>natural_number2_lenth){
            System.out.println("У этого числа количество цифр больше всего: "+first_number);
        } else if (natural_number1_lenth<natural_number2_lenth) {
            System.out.println("У этого числа количество цифр больше всего: "+second_number);
        }else{
            System.out.println("Kolichestvo thifr ravno");
        }*/
//        Problem 3
        /*Scanner scanner2=new Scanner(System.in);
        System.out.println("Введите первое число");
        int first_number=scanner2.nextInt();
        Scanner scanner3=new Scanner(System.in);
        System.out.println("Введите второе число");
        int second_number=scanner3.nextInt();
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Введите третье число");
        int third_number = scanner4.nextInt();
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Ввелите четвертое число");
        int fourth_number= scanner5.nextInt();
        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Введите пятое число");
        int fiveth_number= scanner6.nextInt();
        Scanner scanner7 = new Scanner(System.in);
        System.out.println("Введите шестое число");
        int sixth_number=scanner7.nextInt();
        int max_number=max_number(first_number,second_number,third_number,fourth_number,fiveth_number,sixth_number);
        System.out.println("Из шести чисел самое большое: "+max_number);*/
//        Problem 4
       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Введите 6 значное число");
        int number=scanner.nextInt();
        int first_three_number=first_three_number(number);
        int last_three_number=last_three_number(number);
        int sum_first_three_number=sum_first_three_number(first_three_number);
        int sum_last_three_number=sum_last_three_number(last_three_number);
        if(sum_first_three_number==sum_last_three_number){
            System.out.println(number+" число бақытты сан");
        }else {
            System.out.println(number+" число бақытты сан емес");
        }*/
//        Problem 5
       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Введите длину");
        int lenth=scanner.nextInt();
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Введите ширину");
        int width=scanner1.nextInt();
        String perimetr=perimetr(lenth,width);
        System.out.println(perimetr);*/
//        Problem 6

     /*   double [] first_triangle=new double [3];
        for(int i=0;i<3;i++){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Введите "+(i+1)+" длину угла  первого триугольника");
            first_triangle[i]=scanner.nextInt();
        }
        if(first_triangle[0]+first_triangle[1]>first_triangle[2]&&first_triangle[0]+first_triangle[2]>first_triangle[1]&&first_triangle[1]+first_triangle[2]>first_triangle[0]) {
            double perimetr_first_triangle = perimetr_triangle(first_triangle[0], first_triangle[1], first_triangle[2]);
            double area_first_triangle = area_triangle(first_triangle[0], first_triangle[1], first_triangle[2]);
            double[] second_triangle = new double[3];
            for (int i = 0; i < 3; i++) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите " + (i + 1) + " длину угла второго триугольника");
                second_triangle[i] = scanner.nextInt();
            }
            if (second_triangle[0]+second_triangle[1]>second_triangle[2]&&second_triangle[0]+second_triangle[2]>second_triangle[1]&&second_triangle[1]+second_triangle[2]>second_triangle[0]) {
                double perimetr_second_triangle = perimetr_triangle(second_triangle[0], second_triangle[1], second_triangle[2]);
                double area_second_triangle = area_triangle(second_triangle[0], second_triangle[1], second_triangle[2]);
                System.out.println("сумма периметров двух периметров треугольника" + (perimetr_first_triangle + perimetr_second_triangle));
                System.out.println("Сумма площади двух треугольников" + (area_first_triangle + area_second_triangle));
            }else {
                System.out.println("Сумма длин каждых двух сторон должна быть больше длины третьей стороны в первом треугольнике");
            }
        }else{
            System.out.println("Сумма длин каждых двух сторон должна быть больше длины третьей стороны в первом треугольнике");
        }*/
//        Problem 7
        Scanner scanner=new Scanner(System.in);
        String a=scanner.nextLine();
        System.out.println(hite_palindrom(a));




    }
    public static double kosu(double a,double b,double c){
        double res=(Math.sqrt(a)+b)/c;
        return res;
    }
    public static double kosu2(double c,double d){
        double res=(c+Math.sqrt(c))/(Math.sqrt(d)+d);
        return res;
    }
    public static double kosu3(double a,double s){
        double res= (a+Math.sqrt(s))/(s+Math.sqrt(a));
        return res;
    }
    public static int lenth(int a){
        int res=String.valueOf(a).length();
        return res;
    }
    public static  int max_number(int a,int b,int c, int d, int e,int f){
        int res =Math.max(Math.max(Math.max(a,b),c),Math.max(Math.max(d,e),f));
        return res;
    }
    public static int sum_first_three_number(int a){
        int sum=(a/100)+(a%100/10)+(a%10);
        return sum;
    }public static int sum_last_three_number(int b){
        int sum=(b/100)+(b%100/10)+(b%10);
        return sum;
    }public static int first_three_number(int a){
        int first_three_number=a/1000;
        return first_three_number;
    }public static int last_three_number(int a){
        int last_three_number=a%1000;
        return last_three_number;
    }public static String perimetr(int a, int b){
        String perimetr=a+"*"+b+"="+a*b;
        return perimetr;
    }public static double perimetr_triangle (double a,double b,double c){
        double res=a+b+c;
        return res;
    }public static double area_triangle(double a, double b, double c){
        double p=(a+b+c)/2;
        double area_triangle=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area_triangle;
    }public static String hite_palindrom(String a) {
        int lenth = a.length();
        char word[] = new char[lenth];
        char reverse_word[] = new char[lenth];

        for (int i = lenth - 1; i >= 0; ) {
            for (int j = 0; j < lenth; j++) {
                reverse_word[j] = a.charAt(i);
                word[j] = a.charAt(j);
                i--;

            }


        }

            if(Arrays.equals(reverse_word, word)){
                System.out.println("It's Palindrom " + a);

            }else {
                System.out.println("It isn't palindrom " + a);
            }


    return "The End";



    }

}