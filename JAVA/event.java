public class event {
    public static void main(String[] args) {

        String[] attendees = {"karthik", "deepak", "akash", "yash", "junade"};

        String longest = attendees[0];
        for(String val: attendees)
            if(val.length() > longest.length())
                longest = val;

        String shortest = attendees[0];
        for(String val: attendees)
            if(val.length() < shortest.length())
                shortest = val;

        System.out.print("Names in Reverse Order:");
        for( int i = attendees.length -1;i >= 0; i--)
            System.out.print(attendees[i] + " ");

        System.out.println();
        System.out.println("Longest Name:" + longest);
        System.out.println("Shortest Name:" + shortest);


    }
}