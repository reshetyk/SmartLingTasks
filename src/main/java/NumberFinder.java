/**
 * @author Alexey
 *
 * Написать функцию, которая принимает два параметра -- массив целых чисел и целое число.
 * Функия должна найти число в массиве и вернуть его индекс, или -1 если нет такого числа в массиве.
 * Доп. условие -- массив отсортирован по убыванию.
 * Функция поиска должна иметь сложность меньше O(n)-- другими словами решение с последовательным перебором всех элементов массива не подходит.
 * Приоритеты:
 * корректность решения
 * чистота и читабельность кода
 * красота решения
 *
 */
public class NumberFinder {
    private static final int NOT_FOUND = -1;
    private final int[] data;

    public NumberFinder(int[] data) {
        this.data = data;
    }

    public int findIndex(int searchNum) {
        //TODO: check that the array is ordered
        if (data == null || data.length == 0) return NOT_FOUND;

        return findIndexInRange(0, data.length, searchNum);
    }

    private int findIndexInRange(int minRange, int maxRange, int searchNum) {
        assert(minRange < maxRange);

        if (maxRange - minRange <= 2 ) {
            for (int i = minRange; i <= maxRange; i++) {
                if(data[i] == searchNum) {
                    return i;
                }
            }
            return NOT_FOUND;
        }
        int middle = (minRange + maxRange) / 2;

        if (searchNum >= data[middle]) {
            minRange = 0;
            maxRange = middle;
        } else {
            minRange = middle;
        }
        return findIndexInRange(minRange, maxRange, searchNum);
    }
}
