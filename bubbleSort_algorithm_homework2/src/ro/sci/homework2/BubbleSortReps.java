package ro.sci.homework2;

public class BubbleSortReps {

    public int reps[]; BubbleSortReps() {
        SalesRepresentative rep1 = new SalesRepresentative("Tudor", "Patrutiu", 15,5,15*5);
        SalesRepresentative rep2 = new SalesRepresentative("Vlad", "Rus", 10 , 2 , 10*2);
        SalesRepresentative rep3 = new SalesRepresentative("John", "Major", 42, 2, 42*2);

        SalesRepresentative reps [] = {rep1, rep2, rep3};
        int swap = 0;
        int [] reps1 = new int [3];
        do {
            for (int i = 0; i < reps.length - 1; i++) {
                int rev = reps[i].getRevenue();
                int revp = reps[i + 1].getRevenue();
                if (rev > revp) {
                    SalesRepresentative temp = reps[i];
                    reps[i] = reps[i + 1];
                    reps[i + 1] = temp;
                    swap++;
                    System.out.println(temp);

                }
            }
        } while (swap > 0);
    }

    public int[] reps() {
        return new int[3];
    }
}




