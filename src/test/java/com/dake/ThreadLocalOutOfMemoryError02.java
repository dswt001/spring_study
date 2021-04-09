package com.dake;

public class ThreadLocalOutOfMemoryError02 {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            // 循环创建多个Test
            Test test = new Test(i);
            test.printId();
            // *************注意此处，非常关键：为了帮助回收，将t置为null

            // 此处调用了ThreadLocal对象的remove方法
            test.threadLocal.remove();

            test = null;
        }
    }

    static class Test {
        int id;
        // 每个TestClass对象对应一个很大的数组
        int[] arr;
        // 每个Test对象对应一个ThreadLocal对象
        ThreadLocal<int[]> threadLocal;

        public Test(int id) {
            this.id = id;
            arr = new int[100000000];
            threadLocal = new ThreadLocal<>();
            // threadLocal存放的就是这个很大的数组
            threadLocal.set(arr);
        }

        public void printId(){
            System.out.println(id);
        }
    }
}
