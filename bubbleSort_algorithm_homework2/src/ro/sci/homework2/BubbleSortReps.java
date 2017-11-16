package ro.sci.homework2;

public class BubbleSortReps {

    public SalesRepresentative[] sortSalesRepresentatives(SalesRepresentative[] unsortedReps) {

        SalesRepresentative reps[] = new SalesRepresentative[3];
        int swap = 0;
        do {
            for (int i = 0; i < reps.length - 1; i++) {
                int revenue = reps[i].getRevenue();
                int revp = reps[i + 1].getRevenue();
                if (revenue > revp) {
                    SalesRepresentative temp = reps[i];
                    reps[i] = reps[i + 1];
                    reps[i + 1] = temp;
                    swap++;
                    System.out.println(temp);
                }
            }
        } while (swap > 0);
        return reps;
    }
}




