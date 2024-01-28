public class Task04 {
    public static void main(String[] args)
    {
        int Day01,Day02,Day03,Day04,Day05,Day06,Day07;
        int srednTemperatur,sumTemperatur;
        Day01=1;
        Day02=3;
        Day03=11;
        Day04=7;
        Day05=7;
        Day06=8;
        Day07=10;
        sumTemperatur=Day01+Day02+Day03+Day04+Day05+Day06+Day07;

        Average sredn=new Average();

        srednTemperatur= sredn.Sredn(sumTemperatur,7);

        System.out.println("Cредняя температура за неделю: "+srednTemperatur);


    }

}
