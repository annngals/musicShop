package com.company;

import java.util.ArrayList;
import java.util.Collections;

abstract class musicShop implements Comparable<musicShop> {
    abstract double getSum();
    @Override
    public int compareTo(musicShop s)
    {
        return Double.compare(this.getSum(), s.getSum());
    }
    public boolean equals(Object obj)
    {
        return this.equals(obj);
    }
}
class Guitar extends musicShop
{
    Guitar(int p, int q)
    {
        this.p = p;
        this.q = q;
    }
    int p;
    int q;
    @Override
    double getSum() {
        return p*q;
    }
    public String toString(){
        return "Guitar price: "+p+" Guitar quantity: "+q;
    }
}
class Drums extends musicShop
{
    Drums(int p, int q)
    {
        this.p = p;
        this.q = q;
    }
    int q;
    int p;
    @Override
    double getSum() {
        return p*q;
    }
    public String toString(){
        return "Drum price: "+p+" Drum quantity: "+q;
    }
}

class Piano extends musicShop
{
    Piano(int p, int q)
    {
        this.p = p;
        this.q = q;
    }
    int q;
    int p;
    @Override
    double getSum() {
        return p*q;
    }
    public String toString(){
        return "Piano price: "+p+" Piano quantity: "+q;
    }
}

public class Main {
    public static void main(String[] args) {

        Drums d = new Drums(10000, 4);
        Guitar g = new Guitar(6000, 5);
        Piano p = new Piano(20000, 1);
        musicShop s;
        musicShop obj;

        if (d.getSum() > g.getSum())
            System.out.println("Drums cost more than guitar");
        else if (d.getSum() < g.getSum())
            System.out.println("Guitars cost more than drums");
        else
            System.out.println("Drums and guitars have equal price");

        ArrayList<musicShop> instruments =  new ArrayList<>();
        instruments.add(new Guitar(5000, 2));
        instruments.add(new Drums(8000, 1));
        instruments.add(new Guitar(9000, 1));
        instruments.add(new Piano(16000, 1));
        instruments.add(new Guitar(10000, 2));
        System.out.println(instruments);
        Collections.sort(instruments);
        System.out.println(instruments);
    }
}