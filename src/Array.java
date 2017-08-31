public class Array {

    public static void main(String[] args){
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        //set intrest rate to 10 .... 15%
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++)
            interestRate[j] = (STARTRATE + j) / 100.0;

        double [][] blance = new double[NYEARS][NRATES];

        //set initial blance to 1000
        for (int j = 0; j < blance[0].length; j++ )
            blance[0][j] = 10000;

        for (int i = 1; i < blance.length; i++){
            for (int j = 0; j < blance[i].length; j++){
                //get last year's blance from previos row
                double oldBlance = blance[i-1][j];

                //complete interest
                double interest = oldBlance * interestRate[j];

                //complete this yesr's blance
                blance[i][j] = oldBlance + interest;

            }
        }


        //print one row interest rates
        for (int j = 0; j < interestRate.length; j++)
            System.out.printf("%9.0f%%", 100 * interestRate[j]);

        System.out.println();

        //print blance table
        for (double[] row: blance)
        {
            //print table row
            for(double b : row)
                System.out.printf("%10.2f%%" , b);
            System.out.println();
        }
    }
}
