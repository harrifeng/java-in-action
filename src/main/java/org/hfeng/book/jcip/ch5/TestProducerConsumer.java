package org.hfeng.book.jcip.ch5;

import java.io.File;

public class TestProducerConsumer {
    private static final int NUM = 3;
    public static void main(String[] args) {
        File[] files = new File[NUM];
        for (int i = 0; i < NUM; i++) {
            files[i] = new File("/Users/i309511/tmp/hfeng/"+ i);
        }
        ProducerConsumer producerConsumer = new ProducerConsumer();
        producerConsumer.startIndexing(files);
    }
}
