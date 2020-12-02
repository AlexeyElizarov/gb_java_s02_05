public class ArrayThread extends Thread {

    private float[] arr;

    public ArrayThread(float[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {

        System.out.printf("%s starts...\n", getName());
        long runTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
             arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.printf("%s ends...\n", getName());
        System.out.printf("Processing with %s: %d\n", getName(), System.currentTimeMillis() - runTime);
    }
}
