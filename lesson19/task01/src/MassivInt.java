import java.util.Arrays;

public class MassivInt {

    public int[] CreateArr(int start,int finish,int num){
        int[] masInt = new int[num];
        int i = 0;
        while (i < num) {
            masInt[i] = (int) (start + (finish - start + 1) * Math.random());
            i++;

        }
        return masInt;
    }

    public int Srednee(int[] Arr){
        int srednee=0;
        int len=Arr.length;
        int Sum=0;
        for(int i=0;i<len;i++){
            Sum=Sum+Arr[i];
        }
        srednee=Sum/len;
      return srednee;
    }

    public int[] MakeChet(int []Arr){
        int num=Arr.length;



        int[] tempArr = new int[num];

        int j=0;
        int count=0;
        for(int i=0;i<num;i++) {
            if (Arr[i] % 2 == 0) {
                tempArr[j] = Arr[i];
                count++;
            } else {
                tempArr[j] = 0;
            }

            j++;
        }
            int[] chetArr = new int[count];
            int m=0;
            for(int k=0;k<num;k++) {

             if(tempArr[k]!=0){
                chetArr[m]=tempArr[k];
              m++;
            }
            }


        //System.out.println(Arrays.toString(chetArr));

        return chetArr;
    }

}
