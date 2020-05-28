package Algorithm;

/**
 * 睡眠排序
 */
public class sleep {
    static int[] Array = new int[]{1,5,7,3,6,4,9,8};
    static SortThread[] sortThreads =new SortThread[Array.length];
    public static void main(String[] args) {
        for (int i=0;i<Array.length;i++){
            sortThreads[i]=new SortThread(Array[i]);
        }
        for (int i = 0; i <Array.length ; i++) {
            new Thread(sortThreads[i]).start();
        }
    }


}
class SortThread implements Runnable{
    int a;

    public SortThread(int a) {
        this.a = a;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(a);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a);
    }
}