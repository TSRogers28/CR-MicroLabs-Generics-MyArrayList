import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<T> {

    T[] array;
    int size;

    public MyArrayList() {
        this.array = (T[]) new Object[0];
    }

    public MyArrayList(int i) {
        if (i > 0) {
            this.array = (T[]) new Object[i];
            size = i;
        } else if (i == 0) {
            new MyArrayList();
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    i);
        }
    }

    public int size() {
        return size;
    }

    public boolean add(T t) {
       this.array = Arrays.copyOf(array, size + 1);
       array[size-1] = t;
       size++;
       return true;
    }

    //    rangeCheckForAdd(index);
//
//    ensureCapacityInternal(size + 1);  // Increments modCount!!
//        System.arraycopy(elementData, index, elementData, index + 1,
//    size - index);
//    elementData[index] = element;
//    size++;

    public boolean add(T t, int index) {
        array = Arrays.copyOf(this.array, size + 1);
        System.arraycopy(array, index, array, index + 1,
                size - index);
        array[index] = t;
        size++;
        return true;
    }

    public T get(int index){
        return array[index];
    }

    public T remove(int index){
        T oldValue = array[index];
        System.arraycopy(array, index+1, array, index,
                size - index - 1);
        array[--size] = null;
        return oldValue;
    }


    public T set(int i, T t) {
        T oldValue = array[i];
        array[i] = t;
        return oldValue;
    }

    public void clear() {
        for(T t : array)
            t = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T t) {
        int count = 0;
        for (T x : array)
            count += (t.equals(x))? 1 : 0;

        return count > 0;
    }
}
