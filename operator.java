public class operator {
    public static void main(String[] args) {


        int num = 10;
        int num2 = 20;
        System.out.println(num + num2);
        System.out.println(num * num2);
        System.out.println(num2 % num);
        System.out.println(num2 / num);
        /* relatinal
         int a = 10;
         int b = 20;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a == a);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a != b);*/
        // logical
        int a = 10;
        int b = 20;
        int c = 30;
        boolean cond1 = (a<b);
        boolean cond2 = (b<c);
        boolean cond3 = (a<c);
        boolean ans = cond1 && cond2 && cond3;
        System.out.println(ans);
       boolean ans2 =  cond1 || cond2 || cond3;
        System.out.println(ans2);
        boolean ans3 = !cond1;
        System.out.println(ans3);
    }
    }


