package ua.edu.ucu.tempseries;


import java.util.InputMismatchException;

import static java.lang.Math.floor;
import static java.lang.Math.pow;

public class TemperatureSeriesAnalysis {
    private double[] temps;
    private int capacity;
    private int realSize;
    private double sum;
    private int minTemp = -273;

    public TemperatureSeriesAnalysis() {
        capacity = 1;
        temps = new double[capacity];
        realSize = 0;
        sum = 0.0;
    }

    public TemperatureSeriesAnalysis(double[] temperatureSeries) {
        capacity = temperatureSeries.length;
        temps = new double[capacity];
        realSize = 0;
        sum = 0.0;
        addTemps(temperatureSeries);
    }

    public double average() {
        check();
        return sum/realSize;
    }

    public double deviation() {
        double avg = average();
        double sumDev = 0;
        for(double temp: temps){
            sumDev += pow(temp - avg, 2);
        }
        return pow(sumDev/realSize, 0.5);
    }

    public double min() {
        check();
        return temps[0];
    }

    public double max() {
        check();
        return temps[realSize - 1];
    }

    public double findTempClosestToZero() {
        return findTempClosestToValue(0);
    }

    public double findTempClosestToValue(double tempValue) {
        check();
        int ind = findIndex(tempValue);
        if(ind == realSize){
            return temps[realSize - 1];
        }
        else if(ind == 0){
            return temps[0];
        }
        else if(temps[ind] - tempValue > tempValue - temps[ind - 1]){
            return temps[ind - 1];
        }
        else{
            return temps[ind];
        }
    }

    public double[] findTempsLessThen(double tempValue) {
        int ind = findIndex(tempValue);
        double[] less = new double[ind];
        for(int i = 0; i < ind; i++){
            less[i] = temps[i];
        }
        return less;
    }

    public double[] findTempsGreaterThen(double tempValue) {
        int ind = findIndex(tempValue);
        double[] greater = new double[realSize - ind];
        for(int i = ind; i < realSize; i++){
            greater[i - ind] = temps[i];
        }
        return greater;
    }

    public TempSummaryStatistics summaryStatistics() {
        check();
        TempSummaryStatistics summary = new TempSummaryStatistics(average(),
                                                 deviation(), min(), max());
        return summary;
    }

    public int addTemps(double... addedTemps) {
        for(double temp: addedTemps){                  //check validity
            if(temp < minTemp){
                throw new InputMismatchException();
            }
        }
        if(addedTemps.length + realSize > capacity){          //Resizes array if needed
            int newCapacity = capacity;
            while(newCapacity < addedTemps.length + realSize){
                newCapacity *= 2;
            }
            double[] resized = new double[newCapacity];
            for(int i = 0; i < realSize; i++){
                resized[i] = temps[i];
            }
            temps = resized;
            capacity = newCapacity;
        }
        for(double temp: addedTemps){               //Finds index for all elements and insert
            int ind = findIndex(temp);
            for(int i = realSize; i > ind; i--){
                temps[i] = temps[i - 1];
            }
            temps[ind] = temp;
            realSize++;
            sum += temp;
        }
        return realSize;
    }

    //Check if the array is empty
    private void check(){
        if(realSize == 0){
            throw new IllegalArgumentException();
        }
    }

    //Binary search for index to insert new element
    private int findIndex(double temp){
        int start = 0;
        int stop = realSize;
        while(start != stop){
            int mid = (int) floor(stop + start)/2;
            if(temps[mid] > temp){
                stop = mid;
            }
            else if (temps[mid] < temp){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return start;
    }

    public double[] getTemps(){
        return temps;
    }
}
