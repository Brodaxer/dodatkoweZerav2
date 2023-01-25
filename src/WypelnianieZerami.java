import java.util.Random;

class WypelnianieZerami {

    Random rand = new Random();
    int x = rand.nextInt(10001);
    public int wypelnianie () {
        if (x==0){
            return x=0;
        }  else if (x >1000){
            return x;
        } else if (x>100) {
            return x*10;
        }else {
            return x*100;
        }

    }

    public static void main(String[] args) {
        WypelnianieZerami test1 = new WypelnianieZerami();



        System.out.println("Wylosowana liczba to : "+test1.wypelnianie());
        if (test1.wypelnianie()<5000){
            System.out.println(test1.wypelnianie()+" jest mniejsze od 5000");
        } else if (test1.wypelnianie()==5000) {
            System.out.println(test1.wypelnianie()+" jest rowna 5000");

        }else {
            System.out.println(test1.wypelnianie()+ " jest wieksza od 5000");
        }
        if ((test1.wypelnianie()%2)==0){
            System.out.println("Liczba "+test1.wypelnianie() + " jest parzysta");

        }else {
            System.out.println("Liczba " +test1.wypelnianie()  + " jest nieparzysta");
        }
    }
}
