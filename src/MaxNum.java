public class MaxNum<T extends Comparable<T>> {
    private Integer[] values;

    public MaxNum(Integer[] num) {
    }

    public void MaxNum(T[] values) {
        this.values = (Integer[]) values;
    }

    public T findMaximum() {
        Integer max = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(max) > 0) {
                max = values[i];
            }
        }


        return (T) max;
    }
}
