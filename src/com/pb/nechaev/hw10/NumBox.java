package com.pb.nechaev.hw10;


import java.util.ArrayList;
import java.util.List;


public class NumBox < T extends Number >{

    protected List<T> numbox;
    protected int size;

    public NumBox (int size)
    {
        numbox = new ArrayList<>(size);
        this.size = size;
    }

    public void add (T num) throws SizeExeption
    {
        if (numbox.size() < size)
        {
            numbox.add(num);
        } else
        {
            throw new SizeExeption("Вы не можете добавить больше елементов.");
        }

    }

    public T get(int index) {
        return numbox.get(index);
    }

    public void addAll(List<T> list) {
        numbox.addAll(list);
    }

    public int length()
    {
        return numbox.size();
    }

    public double average() {
        double sum = 0;
        for (Number num : numbox)
        {
            sum+= num.doubleValue();
        }
        return sum / numbox.size();
    }

    public double sum() {
        double sum = 0;
        for (Number num : numbox)
        {
            sum+= num.doubleValue();
        }
        return sum;
    }

    public T max ()
    {
        T max = numbox.get(0);

        for (T num : numbox)
        {
            if (num.doubleValue() > max.doubleValue())
            {

               max = num;
            }
        }
        return max;
    }

}
