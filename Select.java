package algorithm;

/**
 * @author dell
 */
public class Select {
    public static void main(String[] args) {
        int temp;
        int [] a =new int[]{9,5,1,3,7,6,4,8,2,0};
        //前n-1个
        for (int i = 0; i <a.length-1; i++) {
            //i+1到n
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

        }
        for (int value : a) {
            System.out.println(value);
        }
    }
}
