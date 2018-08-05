package com.dl4j.study;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class Test {
    public static void main(String[] args) {
        INDArray x = Nd4j.create(new double[]{6, 5, 4, 3, 2, 1}, new int[]{3, 2});
        INDArray y = Nd4j.create(new double[]{6, 5, 4, 3, 2, 1}, new int[]{3, 2});
        x.add(y);
        System.out.println(x);
    }
}
