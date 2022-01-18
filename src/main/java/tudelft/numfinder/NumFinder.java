package tudelft.numfinder;

public class NumFinder {

    // a smart way to initilize the values such that any first number of array shall
    // update the smallest and largest.
    private int smallest;;
    private int largest;
    ;


    public void find(int[] nums) {
        smallest = Integer.MAX_VALUE;
        largest = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n < smallest) {
                smallest = n;
            }
            if (n > largest) {
                largest = n;
            }
        }
    }

    /* getters and setters */
    public int getSmallest() {
        return smallest;
    }

    public void setSmallest(int smallest) {
        this.smallest = smallest;
    }

    public int getLargest() {
        return largest;
    }

    public void setLargest(int largest) {
        this.largest = largest;
    }

}
