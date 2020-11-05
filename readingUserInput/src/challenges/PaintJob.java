package challenges;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;
        return (int) (Math.ceil(area / areaPerBucket) - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        return (int) (Math.ceil(area / areaPerBucket));
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return (int) (Math.ceil(area / areaPerBucket));
    }

    public static void main(String[] args) {
        int test1 = getBucketCount(2.75, 3.25, 2.5, 1);
        System.out.println(test1);

        // part 2
        System.out.println();
        int test2 = getBucketCount(3.4, 2.1, 1.5);
        System.out.println("Overloaded answer = " + test2);

        int test3 = getBucketCount(7.25, 4.3, 2.35);
        System.out.println("Overloaded answer 2 = " + test3);

        // part 3
        System.out.println();
        int test4 = getBucketCount(3.4, 1.5);
        System.out.println("Overloaded answer = " + test4);

        int test5 = getBucketCount(6.26, 2.2);
        System.out.println("Overloaded answer = " + test5);

        int test6 = getBucketCount(3.26, 0.75);
        System.out.println("Overloaded answer = " + test6);
    }
}
