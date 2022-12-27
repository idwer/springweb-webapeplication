package com.example.springwebwebapeplication;

public class ApeIndex {
    private int height;
    private int wingspan;

    public ApeIndex(int wingspan, int height) {
        this.wingspan = wingspan;
        this.height = height;
    }

    public float getApeIndex() {
        return (float) this.wingspan / (float) this.height;
    }
}
