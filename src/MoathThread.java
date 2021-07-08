public class MoathThread {

    Thread thread ;

    int theNumber  ;

    public MoathThread(int theNumber) {
        this.theNumber = theNumber;
        thread= new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    System.out.println("Thread #"+theNumber+" its the average for student #"+theNumber+" and the average is "+Producer.getAverage(theNumber));
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });       // Create producer thread
    }


}
