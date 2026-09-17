public class StatisticsCalculator {

    double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = 1.0 * sum / numbers.length;

        return average;

    }

    int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > min) {
                min = numbers[i];
            }
        }

        return min;
    }

    int countAboveAverage(int[] numbers) {
        double average = calculateAverage(numbers);
        int countAboveAverage = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                countAboveAverage++;
            }
        }

        return countAboveAverage;
    }

    void printAllStats(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }

        System.out.println();

        System.out.println("Average: " + calculateAverage(numbers));
        System.out.println("Largest number: " + findMax(numbers));
        System.out.println("Smallest number: " + findMin(numbers));
        System.out.println("Count above average: " + countAboveAverage(numbers));
    }

    void main() {
        int[] numbers = {45, 67, 23, 89, 34, 56, 78};
        printAllStats(numbers);

    }

}
