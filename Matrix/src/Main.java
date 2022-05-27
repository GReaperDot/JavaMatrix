import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    int sizeIntegerArray, index, tempIndex, tempInteger, flag, count, firstNum, secondNum, sizeColumn, sizeLine, indexColumn, indexLine, minNum, maxNum;
    int[] integerArray; int[] integerArrayCopy; int[][] matrixArray;
    static Scanner inputScanner = new Scanner(System.in);
    String textWriteArraySize = "Введите колличество элементов массива: ",
            textWriteMatrixSize = "Введите размер матрицы: ",
            textWriteArrayElement = "Введите элементы массива: ",
            textResultCalculation = "Результат вычисления: ",
            textElementHavePair = "Имеються парные элементы",
            textElementNoPair = "Нету парных элементов",
            textHeight = "Введите рост",
            textEnterVariable = "Введите переменную: ",
            textPlayerScore = "Введите очки спортсменов: ";

    public static void main(String[] args) {
        Main run = new Main();
        run.Task1();
    }

    public void Task1(){
        System.out.println(textWriteArraySize);
        sizeIntegerArray = inputScanner.nextInt();
        integerArray = new int[sizeIntegerArray];
        System.out.println(textWriteArrayElement);
        for (index = 0; index < sizeIntegerArray; index++) {
            integerArray[index] = inputScanner.nextInt();
            if (index == 0) System.out.println(textResultCalculation);
            if (index % 2 == 0) System.out.print(integerArray[index] + " ");
        }
    }

    public void Task2(){
        System.out.println(textWriteArraySize);
        sizeIntegerArray = inputScanner.nextInt();
        integerArray = new int[sizeIntegerArray];
        System.out.println(textWriteArrayElement);
        for (index = 0; index < sizeIntegerArray; index++) {
            integerArray[index] = inputScanner.nextInt();
            if (index == 0) System.out.println(textResultCalculation);
            if (integerArray[index] % 2 == 0) System.out.print(integerArray[index] + " ");
        }
    }

    public void Task3(){
        System.out.println(textWriteArraySize);
        sizeIntegerArray = inputScanner.nextInt();
        integerArray = new int[sizeIntegerArray];
        System.out.println(textWriteArrayElement);
        for (index = 0; index < sizeIntegerArray; index++) {
            integerArray[index] = inputScanner.nextInt();
            if (index == 0) System.out.println(textResultCalculation);
            if (integerArray[index] > 0) count++;
        }   System.out.println(count);
    }

    public void Task4(){
        System.out.println(textWriteArraySize);
        sizeIntegerArray = inputScanner.nextInt();
        integerArray = new int[sizeIntegerArray];
        System.out.println(textWriteArrayElement);
        for (index = 1; index < sizeIntegerArray; index++) {
            integerArray[index] = inputScanner.nextInt();
            if (index == 1) System.out.println(textResultCalculation);
            if (integerArray[index] > integerArray[index - 1]) count++;
        }   System.out.println(count);
    }

    public void Task5(){
        System.out.println(textWriteArraySize);
        sizeIntegerArray = inputScanner.nextInt();
        integerArray = new int[sizeIntegerArray];
        System.out.println(textWriteArrayElement);
        for (index = 0; index < sizeIntegerArray; index++)
            integerArray[index] = inputScanner.nextInt();
        for (index = 1; index < sizeIntegerArray - 1; index++) {
            if (index == 1) System.out.println(textResultCalculation);
            if ((integerArray[index] == integerArray[index - 1]) ||
                    (integerArray[index] == integerArray[index + 1])) flag = 1;
        }   if (flag == 1) {
            System.out.println(textElementHavePair);
        }   else System.out.println(textElementNoPair);
    }

    public void Task6(){
        System.out.println(textWriteArraySize);
        sizeIntegerArray = inputScanner.nextInt();
        integerArray = new int[sizeIntegerArray];
        System.out.println(textWriteArrayElement);
        for (index = 0; index < sizeIntegerArray; index++)
            integerArray[index] = inputScanner.nextInt();
        for (index = 1; index < sizeIntegerArray - 1; index++) {
            if (index == 1) System.out.println(textResultCalculation);
            if ((integerArray[index] > integerArray[index - 1]) &&
                    (integerArray[index] > integerArray[index + 1])) count++;
        }   System.out.println(count);
    }

    public void Task7(){
        System.out.println(textWriteArraySize);
        sizeIntegerArray = inputScanner.nextInt();
        integerArray = new int[sizeIntegerArray];
        System.out.println(textWriteArrayElement);
        for (index = 0; index < sizeIntegerArray; index++)
            integerArray[index] = inputScanner.nextInt();
        for (index = 0, tempIndex = sizeIntegerArray - 1; index < sizeIntegerArray / 2; index++, tempIndex--) {
            if (index == 0) System.out.println(textResultCalculation);
            firstNum = integerArray[index]; secondNum = integerArray[tempIndex];
            integerArray[index] = secondNum; integerArray[tempIndex] = firstNum;
        }   for (index = 0; index < sizeIntegerArray; index++)
            System.out.print(integerArray[index] + " ");
    }

    public void Task8(){
        System.out.println(textWriteArraySize);
        sizeIntegerArray = inputScanner.nextInt();
        integerArray = new int[sizeIntegerArray];
        System.out.println(textWriteArrayElement);
        for (index = 0; index < sizeIntegerArray; index++) {
            if (index % 2 == 0 && index + 1 < sizeIntegerArray) {
                integerArray[index + 1] = inputScanner.nextInt();
            }   else if (index % 2 != 0){
                integerArray[index - 1] = inputScanner.nextInt();
            }   else {
                integerArray[index] = inputScanner.nextInt();
            }   if (index == sizeIntegerArray)
                System.out.println(textResultCalculation);
        }   for (index = 0; index < sizeIntegerArray; index++)
            System.out.print(integerArray[index] + " ");
    }

    public void Task9() {
        System.out.println(textWriteArraySize);
        sizeIntegerArray = inputScanner.nextInt();
        integerArray = new int[sizeIntegerArray];
        integerArrayCopy = new int[sizeIntegerArray];
        System.out.println(textWriteArrayElement);
        for (index = 0; index < sizeIntegerArray; index++)
            integerArray[index] = inputScanner.nextInt();
        System.out.println(textResultCalculation);
        for (index = 0; index < sizeIntegerArray - 1; index++)
            integerArrayCopy[index + 1] = integerArray[index];
        integerArrayCopy[0] = integerArray[sizeIntegerArray - 1];
        for (index = 0; index < sizeIntegerArray; index++)
            System.out.print(integerArrayCopy[index] + " ");
    }

    public void Task10() {
        System.out.println(textWriteArraySize);
        sizeIntegerArray = inputScanner.nextInt();
        integerArray = new int[sizeIntegerArray];
        System.out.println(textWriteArrayElement);
        for (index = 0; index < sizeIntegerArray; index++)
            integerArray[index] = inputScanner.nextInt();
        System.out.println(textResultCalculation);
            Arrays.sort(integerArray);
            System.out.println(integerArray[sizeIntegerArray - 1]);
    }

    public void Task11() {
        System.out.println(textWriteArraySize);
        sizeIntegerArray = inputScanner.nextInt();
        integerArray = new int[sizeIntegerArray];
        System.out.println(textWriteArrayElement);
        for (index = 0; index < sizeIntegerArray; index++)
            integerArray[index] = inputScanner.nextInt();
        System.out.println(textResultCalculation);
            List<Integer> matrixList = Arrays.stream(integerArray).boxed().collect(Collectors.toList());
            Set<Integer> set = new HashSet<>(matrixList); matrixList.clear(); matrixList.addAll(set);
            System.out.println(matrixList.size());
    }

    public void Task12() {
        System.out.println(textWriteArraySize);
        sizeIntegerArray = inputScanner.nextInt();
        integerArray = new int[sizeIntegerArray + 1];
        System.out.println(textWriteArrayElement);
        for (index = 0; index < sizeIntegerArray; index++)
            integerArray[index] = inputScanner.nextInt();
        System.out.println(textHeight);
        tempInteger = integerArray[sizeIntegerArray] = inputScanner.nextInt();
            Arrays.sort(integerArray);
        System.out.println(textResultCalculation);
        for (index = 1, tempIndex = sizeIntegerArray; index < sizeIntegerArray + 1; index++, tempIndex--)
            if (integerArray[index] == tempInteger) System.out.println(tempIndex);
    }

    public static void swap(int[] matrixArray, int index, int j)
    {
        int temp = matrixArray[index];
        matrixArray[index] = matrixArray[j]; matrixArray[j] = temp;
    }

    public void Task13() {
        System.out.println(textEnterVariable);
        sizeIntegerArray = inputScanner.nextInt();
        integerArray = new int[sizeIntegerArray + 1];
        int a = inputScanner.nextInt(); int b = inputScanner.nextInt();
        int c = inputScanner.nextInt(); int d = inputScanner.nextInt();
        for (index = 1; index <= sizeIntegerArray; index++)
            integerArray[index] = index;
        for (; a < b; a++, b--)
            swap(integerArray, a, b);
        for (; c < d; c++, d--)
            swap(integerArray, c, d);
        System.out.println(textResultCalculation);
        for (index = 1; index <= sizeIntegerArray; index++)
            System.out.print(integerArray[index] + " ");
    }

    public void Task14() {
        System.out.println(textWriteArraySize);
        sizeIntegerArray = inputScanner.nextInt();
        integerArray = new int[sizeIntegerArray];
        int[] matrixArrayCopy = new int[sizeIntegerArray];
        System.out.println(textWriteArrayElement);
        for (index = 0; index < sizeIntegerArray; index++)
            integerArray[index] = inputScanner.nextInt();
        System.out.println(textEnterVariable);
        tempInteger = inputScanner.nextInt(); tempInteger -= 1;
        System.out.println(textResultCalculation);
        while (count <= tempInteger) {
            for (index = 0; index < sizeIntegerArray - 1; index++)
                matrixArrayCopy[index + 1] = integerArray[index];
            matrixArrayCopy[0] = integerArray[sizeIntegerArray - 1];
            for (index = 0; index < sizeIntegerArray; index++)
                integerArray[index] = matrixArrayCopy[index];
            count++;
        }   for (index = 0; index < sizeIntegerArray; index++)
            System.out.print(matrixArrayCopy[index] + " ");
    }

//    public void Task15() {
//        System.out.println(textWriteArraySize);
//        sizeIntegerArray = inputScanner.nextInt();
//        integerArray = new int[sizeIntegerArray];
//        System.out.println(textWriteArrayElement);
//        for (index = 0; index < sizeIntegerArray; index++)
//            integerArray[index] = inputScanner.nextInt();
//        System.out.println(textResultCalculation);
//        System.out.println(count);
//    }

    public void Task16() {
        System.out.println(textWriteArraySize);
        sizeIntegerArray = inputScanner.nextInt();
        matrixArray = new int[sizeIntegerArray][sizeIntegerArray];
        for (indexColumn = 0; indexColumn < sizeIntegerArray; indexColumn++)
            for (indexLine = 0; indexLine < sizeIntegerArray; indexLine++){
                if(indexColumn + indexLine == sizeIntegerArray - 1) matrixArray[indexColumn][indexLine] = 0;
                else if (indexColumn + indexLine < sizeIntegerArray - 1) matrixArray[indexColumn][indexLine] = 0;
                else matrixArray[indexColumn][indexLine] = 2;
            }   for (indexColumn = 0, indexLine = sizeIntegerArray - 1; indexColumn < sizeIntegerArray; indexColumn++, indexLine--) {
                matrixArray[indexColumn][indexLine] = 1;
        }   System.out.println(textResultCalculation);
        for (indexColumn = 0; indexColumn < sizeIntegerArray; indexColumn++) {
            System.out.print("\n");
            for (indexLine = 0; indexLine < sizeIntegerArray; indexLine++)
                System.out.print(matrixArray[indexColumn][indexLine] + " ");
        }
    }

    public void Task17() {
        System.out.println(textWriteArraySize);
        sizeIntegerArray = inputScanner.nextInt();
        integerArray = new int[sizeIntegerArray];
        System.out.println(textWriteArrayElement);
        for (index = 0; index < sizeIntegerArray; index++)
            integerArray[index] = inputScanner.nextInt();
        System.out.println(textResultCalculation);
        System.out.println(count);
    }

    public void Task18() {
        System.out.println(textWriteMatrixSize);
        sizeColumn = inputScanner.nextInt();
        sizeLine = inputScanner.nextInt();
        System.out.println(textPlayerScore);
        integerArray = new int[sizeColumn];
        matrixArray = new int[sizeColumn][sizeLine];
        maxNum = integerArray[0];
        for (indexColumn = 0; indexColumn < sizeColumn; indexColumn++) {
            for (indexLine = 0; indexLine < sizeLine; indexLine++) {
                matrixArray[indexColumn][indexLine] = inputScanner.nextInt();
            }   for (indexLine = 0; indexLine < sizeLine; indexLine++) {
                integerArray[indexColumn] += matrixArray[indexColumn][indexLine];
            }   for ( count = 0; count < sizeLine; count++) {
                if(maxNum <= integerArray[count]) {
                    maxNum = integerArray[count];
                    index = count;
                }
            }
        }
        System.out.println(textResultCalculation);
        System.out.print(maxNum + " " + index);
    }

    public void Task19() {
        System.out.println(textWriteMatrixSize);
        sizeColumn = inputScanner.nextInt();
        sizeLine = inputScanner.nextInt();
        integerArray = new int[sizeColumn];
        matrixArray = new int[sizeColumn][sizeLine];
        System.out.println(textPlayerScore);
        maxNum = integerArray[0];
        for (indexColumn = 0; indexColumn < sizeColumn; indexColumn++) {
            for (indexLine = 0; indexLine < sizeLine; indexLine++) {
                matrixArray[indexColumn][indexLine] = inputScanner.nextInt();
            }
            for (indexLine = 0; indexLine < sizeLine; indexLine++) {
                if (maxNum <= matrixArray[indexColumn][indexLine]) {
                    maxNum = matrixArray[indexColumn][indexLine];
                    index = indexLine;
                    minNum = indexColumn;
                }
            }
        }
        System.out.println(textResultCalculation);
        System.out.print(maxNum + "\n" + minNum + " " + index);
    }

    public void Task20() {
        System.out.println(textWriteMatrixSize);
        sizeColumn = inputScanner.nextInt();
        sizeLine = inputScanner.nextInt();
        integerArray = new int[sizeColumn];
        matrixArray = new int[sizeColumn][sizeLine];
        System.out.println(textPlayerScore);
        maxNum = integerArray[0];
        for (indexColumn = 0; indexColumn < sizeColumn; indexColumn++) {
            for (indexLine = 0; indexLine < sizeLine; indexLine++) {
                matrixArray[indexColumn][indexLine] = inputScanner.nextInt();
            }
            for (indexLine = 0; indexLine < sizeLine; indexLine++) {
                if (maxNum <= matrixArray[indexColumn][indexLine]) {
                    maxNum = matrixArray[indexColumn][indexLine];
                    minNum = indexColumn;
                }
            }
        }
        System.out.println(textResultCalculation);
        System.out.print(minNum);
    }

    public void Task23() {
        System.out.println(textWriteMatrixSize);
        sizeColumn = inputScanner.nextInt();
        sizeLine = inputScanner.nextInt();
        integerArray = new int[sizeColumn];
        matrixArray = new int[sizeColumn][sizeLine];
        maxNum = integerArray[0];   count = -1;
        System.out.println(textResultCalculation);
        while (indexColumn < sizeColumn && indexLine < sizeLine) {
            matrixArray[indexColumn][indexLine] = indexColumn * indexLine;
            System.out.print(matrixArray[indexColumn][indexLine] + " ");
            indexLine++;
            if (indexLine == sizeLine) {
                indexColumn++;
                indexLine = 0;
                System.out.print("\n");
            }
        }
    }
}