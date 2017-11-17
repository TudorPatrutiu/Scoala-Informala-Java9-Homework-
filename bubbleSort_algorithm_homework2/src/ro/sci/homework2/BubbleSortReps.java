package ro.sci.homework2;

public class BubbleSortReps {

    public SalesRepresentative[] sortSalesRepresentatives(SalesRepresentative[] unsortedReps) {

        SalesRepresentative reps = new SalesRepresentative(unsortedReps);

        //Writing the BubbleSort algorithm
        for (int i = 0; i < unsortedReps.length; i++) {
            for (int j = 1; j < unsortedReps.length - 1; j++) {
                if (unsortedReps[j].getRevenue() < unsortedReps[j + 1].getRevenue()) {
                    SalesRepresentative uns = unsortedReps[j];
                    unsortedReps[j] = unsortedReps[j + 1];
                    unsortedReps[j + 1] = uns;
                }
            }
        }
        return unsortedReps;
    }
}




