package ro.sci.homework2;

public class Main {

    public static void main(String[] args) {


        SalesRepresentative rep1 = new SalesRepresentative("Tudor", "Patrutiu", 10, 5, 10 * 5);
        SalesRepresentative rep2 = new SalesRepresentative("Vlad", "Rus", 32, 5, 32 * 5);
        SalesRepresentative rep3 = new SalesRepresentative("Bob", "Gargamel", 17, 6, 17 * 6);
        SalesRepresentative[] unsortedReps = {rep1, rep2, rep3};
        
        BubbleSortReps s = new BubbleSortReps();
        SalesRepresentative[] sortedReps = s.sortSalesRepresentatives(unsortedReps);
        System.out.println("The sorted representatives in descending order are  " + sortedReps);

    }
}

