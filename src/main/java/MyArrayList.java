import java.util.Arrays;
import java.util.Comparator;

/**
 * Динамический массив объектов
 * @param <T>
 */
public class MyArrayList<T> implements List<T> {
    private  Object[] array = (T[]) new Object[10];
    private int size = 0;
   private QuickSort  <T> quickSort = new QuickSort<>();

    /**
     * Получение обьекта по index
     * @param index целочисленое число
     * @return возвращает объект из коллекции
     */
    @Override
    public T get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        return (T) array[index];
    }

    /**
     * Добавление объекта в конец списка
     * осуществляется проверка размера коллекции и длинны массива
     * @param object может быть любым обьектом
     * @return возвращает boolean выражение о успехе.
     */
    @Override
    public boolean add(T object) {
        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size] = object;
        size++;
        return true;
    }

    /**
     * удаление обьекта по обьекту если он есть в коллекции
     * @param object
     * @return
     */
    @Override
    public boolean remove(T object) {
        for (int i = 0; i < size; i++) {
            if (object.equals(array[i])) {
                remove(i);
            }
        }
        return false;
    }

    /**
     * удаление обьекта по индексу
     * @param index
     * @return
     */
    @Override
    public boolean remove(int index) {
        if (size - 1 - index >= 0) {
            System.arraycopy(array, index + 1, array, index, size - 1 - index);
        }
        size--;
        return true;
    }

    /**
     * возвращает размер коллекции
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * полная очистка коллекции
     */
    @Override
    public void clear() {
        array = new Object[10];
        size = 0;
    }

    /**
     * добавление обьекта в любое место по индексу
     * @param object
     * @param index index <= size
     * @return true or false
     */
    @Override
    public boolean add(T object, int index) {
        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = object;
        size++;
        return true;
    }

    /**
     * поиск обьекта в колекции
     * @param object
     * @return true or false
     */
    @Override
    public boolean contains(T object) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(object)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public  void sort (Comparator<T>comparator){
       quickSort.sort((T[])this.array, comparator);
    }
}
