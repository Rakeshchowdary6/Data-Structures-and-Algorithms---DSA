
public class threadex extends Thread{
    
    public void run(){

      //  try{
        // Thread.currentThread().setName("sdsd");;
        System.out.println("thread is running :" + " " +Thread.currentThread().getId() + " " + Thread.currentThread().getName());
       // }
       // catch(Exception e){
       //         System.out.println("caught");
        }
        
    

    public static void main(String[] args) {

        threadex obj = new threadex();
        threadex obj2 = new threadex();


        obj.start();
        obj2.start();

        }
    }



class thread2 implements Runnable{
    @Override
    public void run(){

        System.out.println("Thread is created" + " " + Thread.currentThread().getId());
    }
    public static void main(String[] args) {
        thread2 obj = new thread2();
        Thread th = new Thread(obj);

        th.start();
    }
}




class thread3 {
    public static void main(String[] args)  {
        try{
        for(int i=0;i<=5;i++){
            Thread.sleep(1000);
            System.out.println(i);
        }
    }
        catch(Exception e){
            System.out.println("CAUGHT");
        }
        }
    }


class Thread4 extends Thread {
    public void run() {
        try{
        for(int i=0;i<=5;i++){
            Thread.sleep(1000);
            System.out.println(i);
        }
    }
    catch(Exception e){
        System.out.println("CAUGHT");
    }
    }
    public static void main(String[] args) {
        Thread4 t = new Thread4();
        t.start();
    }
}

