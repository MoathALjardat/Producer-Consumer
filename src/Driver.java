import java.util.ArrayList;

public class Driver {

    static int afterCount = 0;
    static int beforeCount = 0;


    public static void main(String[] args) {


        int numberOfRecords = Producer.getCount();

        ArrayList<MoathThread> ar = new ArrayList<>();

        for (int i = 0 ; i < numberOfRecords ; i++)
        {
            ar.add(new MoathThread(i+1));
        }

        for (int i = 0 ; i < numberOfRecords ; i++)
        {
            ar.get(i).thread.start();
        }

    }

}
