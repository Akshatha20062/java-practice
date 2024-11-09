public class StudentGrades {

    public static void main(String[] args) {

        int[][] scores = {
                {85, 90, 78, 92},
                {88, 76, 95, 89},
                {91, 85, 82, 87}
        };


        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + (i + 1) + " Scores:");
            System.out.println("Maths: " + scores[i][0]);
            System.out.println("Science: " + scores[i][1]);
            System.out.println("English: " + scores[i][2]);
            System.out.println("History: " + scores[i][3]);
            System.out.println();
        }


        scores[2][3] = 90;
        System.out.println("Updated History score for Student 3: " + scores[2][3]);

        
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            double average = sum / (double) scores[i].length;
            System.out.println("Student " + (i + 1) + " Average Score: " + String.format("%.2f", average));
        }
    }
}
