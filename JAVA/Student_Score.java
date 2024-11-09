public class Student_Score {
    public static void main(String[] args) {


        int[] score = {66, 81, 91, 92, 99};
        System.out.print("Scores :");
        for (int scores : score)
            System.out.print(scores + " ");


        int sum = 0;
        for (int scores : score)
            sum = sum + scores;
        double avg = sum /(double) score.length;

        int highest = score[0];
        for(int scores : score )
            if(scores > highest)
                highest = scores;


        int lowest = score[0];
        for(int scores : score )
            if(scores < lowest)
                lowest = scores;

        System.out.println();
        System.out.println("Average Score :" + avg);
        System.out.println("Highest Score :" + highest);
        System.out.println("Lowest Score :" + lowest);

    }

}