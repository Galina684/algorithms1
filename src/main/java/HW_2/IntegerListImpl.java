package HW_2;

import java.util.Arrays;

import static HW_2.SortingMethodsCheck.swapElements;

public class IntegerListImpl implements IntegerList {

    private  Integer[] items;
    private int size;

    public IntegerListImpl() {

        items = new Integer[10];
    }

    public IntegerListImpl(int initSize) {
        items = new Integer[initSize];
    }


    @Override
    public Integer add(Integer item) {
        validateSize();
        validateItem(item);
        items[size++] = item;
        return item;
    }

    @Override
    public Integer add(int index, Integer item) {
        validateSize();
        validateItem(item);
        validateIndex(index);
        if (index == size) {
            items[size++] = item;
            return item;
        }
        System.arraycopy(items, index, items, index + 1, size - index);
        items[index] = item;
        size++;
        return item;
    }

    @Override
    public Integer set(int index, Integer item) {
        validateIndex(index);
        validateItem(item);
        items[index] = item;
        return item;
    }

    @Override
    public Integer removeValue(Integer item) {
        validateItem(item);
        int index = indexOf(item);
        return this.removeIndex(index);
    }

    public Integer removeIndex(int index) {

        validateIndex(index);
        Integer item = items[index];
        if (index != size) {
            System.arraycopy(items, index + 1, items, index, size - index);
        }

        size--;
        return item;

    }

    @Override
    public boolean contains(Integer item) {
        Integer[] itemsCopy = toArray();
        sort(itemsCopy);
        return binarySearch(itemsCopy, item);
    }

    @Override
    public int indexOf(Integer item) {
        for (int i = 0; i < size; i++) {
            Integer s = items[i];
            if (s.equals(item)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public int lastIndexOf(Integer item) {
        for (int i = size - 1; i > 0; i--) {

        }
        return -1;
    }

    @Override
    public Integer get(int index) {
        validateIndex(index);
        return items[index];
    }

    @Override
    public boolean equals(IntegerList otherList) {
        return Arrays.equals(this.toArray(), otherList.toArray());
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        for (int to = size, i = size = 0; i < to; i++)
            items[i] = null;
    }

    @Override
    public Integer[] toArray() {
        return Arrays.copyOf(items, size);
    }

    private void validateItem(Integer item) {
        if (item == null) {
            throw new NullItemException();
        }
    }

    private void validateSize() {
        if (size == items.length) {
            grow();
        }
    }

    private void validateIndex(int index) {
        if (index < 0 || index > size) {
            throw new InvalidIndexException();
        }
    }


    private void sort(Integer[] arr) {
     quickSort(arr,0,arr.length-1);

    }

    private boolean binarySearch(Integer[] arr, int item) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (item == arr[mid]) {
                return true;
            }

            if (item < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }
    private void grow(){
        items = Arrays.copyOf(items, size + size/2);
    }
    public static void quickSort(Integer[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private static int partition(Integer[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                swapElements(arr, i, j);
            }
        }

        swapElements(arr, i + 1, end);
        return i + 1;
    }
    private static void swapElements(Integer[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    @Override
    public String toString() {
        return "IntegerListImpl{" +
                "items=" + Arrays.toString(items) +
                ", size=" + size +
                '}';
    }
}
