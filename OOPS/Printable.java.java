package OOPS;

interface Printable {
    void print();

    public interface Showable {
        void show();
    }
     class Demo implements Printable,Showable {
         @Override
         public void print() {
             System.out.println("Printing Circle");

         }

         @Override
         public void show() {
             System.out.println("Showing Circle");

         }
     }
     public static void main(String[] args) {
        Demo d = new Demo();
        d.print();
        d.show();
     }
}
