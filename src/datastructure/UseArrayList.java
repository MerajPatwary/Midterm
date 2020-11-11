package datastructure;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */
        ArrayList cars = new ArrayList();
        cars.add("BMW");
        cars.add("Jeep");
        cars.add("Honda");
        cars.add("Audi");


        for (Object carName : cars) {
            System.out.println(carName);
        }

        Iterator iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


//        cars.remove("BMW");
//        cars.clear();
//        System.out.println(cars);


    }

}



