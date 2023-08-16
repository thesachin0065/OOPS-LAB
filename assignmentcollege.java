//  .........Single level Inheritance.............


// class A {
//     public void methodA (){
//         System.out.println("Base class menthod");
//     }
// }
// class B extends A{
//     public void methodB(){
//         System.out.println("Child class method");
//     }
//     public static void main(String args[]){
//         B obj= new B();
//         obj.methodA();
//         obj.methodB();
//     }
// }





public class assignmentcollege {
    public static void main(String[] args) {
        SumThread thread1 = new SumThread(1, 10);
        SumThread thread2 = new SumThread(11, 20);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        AddThread thread3 = new AddThread(thread1.getSum(), thread2.getSum());
        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final result: " + thread3.getResult());
    }
}
class SumThread extends Thread {
    private int start;
    private int end;
    private int sum;
    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public int getSum() {
        return sum;
    }
    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("Sum from " + start + " to " + end + " is " + sum);
    }
}
class AddThread extends Thread {
    private int result;
    public AddThread(int x, int y) {
        result = x + y;
    }
    public int getResult() {
        return result;
    }
    @Override
    public void run() {
        System.out.println("Adding the results...");
    }
}