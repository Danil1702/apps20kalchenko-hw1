package ua.edu.ucu.tempseries;

import static org.junit.Assert.*;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;
import org.junit.Ignore;

import java.util.InputMismatchException;

public class TemperatureSeriesAnalysisTest {

    @Test
    public void testAverageWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.average();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testAverageWithSeveralElementsArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0, 0.0, 1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 0.0;

        // call tested method
        double actualResult = seriesAnalysis.average();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testMinWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.min();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testMinWithSeveralElementsArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0, 0.0, 1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.min();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testMaxWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        // call tested method
        double actualResult = seriesAnalysis.max();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testMaxWithSeveralElementsArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0, 0.0, 1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 1.0;

        // call tested method
        double actualResult = seriesAnalysis.max();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }


    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testAverageWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.average();
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testMinWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.min();
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testMaxWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.max();
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testDeviationWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.deviation();
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testFindTempClosestToValueWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.findTempClosestToValue(0.0);
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testFindTempClosestToZeroWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.findTempClosestToZero();
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testSummaryStatisticsWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

        // expect exception here
        seriesAnalysis.summaryStatistics();
    }

    @Test
    public void testDeviationWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 0.0;

        // call tested method
        double actualResult = seriesAnalysis.deviation();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testFindTempClosestToZeroWithSeveralElementsArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-10.0, 0.1, 5.5, 2.1};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 0.1;

        // call tested method
        double actualResult = seriesAnalysis.findTempClosestToZero();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testFindTempClosestToZeroWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-10.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -10.0;

        // call tested method
        double actualResult = seriesAnalysis.findTempClosestToZero();

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testFindTempClosestToValueWithSeveralElementsArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-10.0, 0.1, 5.5, 2.1};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = 5.5;

        // call tested method
        double actualResult = seriesAnalysis.findTempClosestToValue(5);

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testFindTempClosestToValueWithOneElementArray() {
        // setup input data and expected result
        double[] temperatureSeries = {-10.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -10.0;

        // call tested method
        double actualResult = seriesAnalysis.findTempClosestToValue(5);

        // compare expected result with actual result
        assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testSummaryStatistics() {
        // setup input data and expected result
        double[] temperatureSeries = {-10.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -10.0;
        // call tested method
        TempSummaryStatistics actualResult = seriesAnalysis.summaryStatistics();

        // compare expected result with actual result
        assertTrue(actualResult instanceof TempSummaryStatistics);
        assertEquals(-10.0, seriesAnalysis.max(), 0.00001);
        assertEquals(-10.0, seriesAnalysis.min(), 0.00001);
        assertEquals(-10.0, seriesAnalysis.average(), 0.00001);
    }

    @Test
    public void testAddTemps() {
        // setup input data and expected result
        double[] temperatureSeries = {-10.0, 0.1, 5.5, 2.1};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis();
        seriesAnalysis.addTemps(temperatureSeries);
        double[] expResult = {-10.0, 0.1, 2.1, 5.5};

        // compare expected result with actual result
        assertArrayEquals(expResult, seriesAnalysis.getTemps(), 0.00001);
    }

    @Ignore
    @Test(expected = InputMismatchException.class)
    public void testAddTempsInvalidInput() {
        // setup input data and expected result
        double[] temperatureSeries = {-330.0, 0.1, 5.5, 2.1};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis();
        seriesAnalysis.addTemps(temperatureSeries);
    }

    @Test
    public void testAddTempsToTemps() {
        // setup input data and expected result
        double[] temperatureSeries = {-10.0, 0.1, 5.5, 2.1};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] newSeries = {-5.0, 0.0, 7.0};
        seriesAnalysis.addTemps(newSeries);
        double[] expResult = {-10.0, -5.0, 0.0, 0.1, 2.1, 5.5, 7.0, 0.0};

        // compare expected result with actual result
        assertArrayEquals(expResult, seriesAnalysis.getTemps(), 0.00001);
    }

    @Test
    public void testFindTempsGreaterThen() {
        // setup input data and expected result
        double[] temperatureSeries = {-10.0, 0.1, 5.5, 2.1};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis();
        seriesAnalysis.addTemps(temperatureSeries);
        double[] expResult = {5.5};

        // compare expected result with actual result
        double[] actual = seriesAnalysis.findTempsGreaterThen(5);
        assertArrayEquals(expResult, actual, 0.00001);
    }

    @Test
    public void testFindTempsGreaterThen2() {
        // setup input data and expected result
        double[] temperatureSeries = {-10.0, 0.1, 5.5, 2.1};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis();
        seriesAnalysis.addTemps(temperatureSeries);
        double[] expResult = {-10.0, 0.1, 2.1, 5.5};

        // compare expected result with actual result
        double[] actual = seriesAnalysis.findTempsGreaterThen(-100);
        assertArrayEquals(expResult, actual, 0.00001);
    }

    @Test
    public void testFindTempsLessThen() {
        // setup input data and expected result
        double[] temperatureSeries = {-10.0, 0.1, 5.5, 2.1};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis();
        seriesAnalysis.addTemps(temperatureSeries);
        double[] expResult = {-10.0, 0.1, 2.1};

        // compare expected result with actual result
        double[] actual = seriesAnalysis.findTempsLessThen(5);
        assertArrayEquals(expResult, actual, 0.00001);
    }

    @Test
    public void testFindTempsLessThen2() {
        // setup input data and expected result
        double[] temperatureSeries = {-10.0, 0.1, 5.5, 2.1};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis();
        seriesAnalysis.addTemps(temperatureSeries);
        double[] expResult = {};

        // compare expected result with actual result
        double[] actual = seriesAnalysis.findTempsLessThen(-100);
        assertArrayEquals(expResult, actual, 0.00001);
    }


}
