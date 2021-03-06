/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 27 21:58:08 GMT 2019
 */

package org.apache.commons.math3.ml.clustering;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.List;
import org.apache.commons.math3.ml.clustering.CentroidCluster;
import org.apache.commons.math3.ml.clustering.Clusterable;
import org.apache.commons.math3.ml.clustering.DoublePoint;
import org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer;
import org.apache.commons.math3.ml.distance.CanberraDistance;
import org.apache.commons.math3.ml.distance.ChebyshevDistance;
import org.apache.commons.math3.ml.distance.DistanceMeasure;
import org.apache.commons.math3.ml.distance.EarthMoversDistance;
import org.apache.commons.math3.ml.distance.ManhattanDistance;
import org.apache.commons.math3.random.ISAACRandom;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FuzzyKMeansClusterer_ESTest extends FuzzyKMeansClusterer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(1, Double.POSITIVE_INFINITY);
      double[] doubleArray0 = new double[2];
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      CentroidCluster<DoublePoint> centroidCluster0 = new CentroidCluster<DoublePoint>(doublePoint0);
      List<DoublePoint> list0 = centroidCluster0.getPoints();
      centroidCluster0.addPoint(doublePoint0);
      Random.setNextRandom((-2023));
      fuzzyKMeansClusterer0.cluster(list0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      
      double double0 = fuzzyKMeansClusterer0.getObjectiveFunctionValue();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(1, 3.557678449715009E128);
      assertEquals(1, fuzzyKMeansClusterer0.getK());
      
      double[] doubleArray0 = new double[2];
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      CentroidCluster<DoublePoint> centroidCluster0 = new CentroidCluster<DoublePoint>(doublePoint0);
      centroidCluster0.addPoint(doublePoint0);
      List<DoublePoint> list0 = centroidCluster0.getPoints();
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      intArray0[1] = 1;
      centroidCluster0.addPoint(doublePoint0);
      DoublePoint doublePoint1 = new DoublePoint(intArray0);
      centroidCluster0.addPoint(doublePoint0);
      centroidCluster0.addPoint(doublePoint1);
      Random.setNextRandom(1);
      fuzzyKMeansClusterer0.cluster(list0);
      double double0 = fuzzyKMeansClusterer0.getObjectiveFunctionValue();
      assertEquals(1.5, double0, 0.01);
      assertEquals((-1), fuzzyKMeansClusterer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EarthMoversDistance earthMoversDistance0 = new EarthMoversDistance();
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(532, 2164.8487599738282, 532, earthMoversDistance0, 968.4, (RandomGenerator) null);
      fuzzyKMeansClusterer0.getRandomGenerator();
      assertEquals(2164.8487599738282, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals(532, fuzzyKMeansClusterer0.getMaxIterations());
      assertEquals(968.4, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
      assertEquals(532, fuzzyKMeansClusterer0.getK());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ChebyshevDistance chebyshevDistance0 = new ChebyshevDistance();
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(295, 295, 0, chebyshevDistance0);
      int int0 = fuzzyKMeansClusterer0.getMaxIterations();
      assertEquals(295, fuzzyKMeansClusterer0.getK());
      assertEquals(295.0, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals(0, int0);
      assertEquals(0.001, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(115, 115);
      int int0 = fuzzyKMeansClusterer0.getMaxIterations();
      assertEquals((-1), int0);
      assertEquals(115, fuzzyKMeansClusterer0.getK());
      assertEquals(0.001, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
      assertEquals(115.0, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(787, 787);
      int int0 = fuzzyKMeansClusterer0.getK();
      assertEquals(787.0, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals((-1), fuzzyKMeansClusterer0.getMaxIterations());
      assertEquals(787, int0);
      assertEquals(0.001, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>((-434), Double.POSITIVE_INFINITY);
      int int0 = fuzzyKMeansClusterer0.getK();
      assertEquals((-1), fuzzyKMeansClusterer0.getMaxIterations());
      assertEquals(Double.POSITIVE_INFINITY, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals(0.001, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
      assertEquals((-434), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ChebyshevDistance chebyshevDistance0 = new ChebyshevDistance();
      ISAACRandom iSAACRandom0 = new ISAACRandom(0);
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(0, 2183.6939, 0, chebyshevDistance0, 0, iSAACRandom0);
      double double0 = fuzzyKMeansClusterer0.getEpsilon();
      assertEquals(0, fuzzyKMeansClusterer0.getMaxIterations());
      assertEquals(0.0, double0, 0.01);
      assertEquals(2183.6939, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ChebyshevDistance chebyshevDistance0 = new ChebyshevDistance();
      double[] doubleArray0 = new double[3];
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(0, 2698.5930551, 2301, chebyshevDistance0);
      assertEquals(0, fuzzyKMeansClusterer0.getK());
      
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      CentroidCluster<DoublePoint> centroidCluster0 = new CentroidCluster<DoublePoint>(doublePoint0);
      List<DoublePoint> list0 = centroidCluster0.getPoints();
      fuzzyKMeansClusterer0.cluster(list0);
      fuzzyKMeansClusterer0.getClusters();
      assertEquals(0.001, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
      assertEquals(2301, fuzzyKMeansClusterer0.getMaxIterations());
      assertEquals(2698.5930551, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(1, 3.557678449715009E128);
      assertEquals(1, fuzzyKMeansClusterer0.getK());
      
      double[] doubleArray0 = new double[2];
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      CentroidCluster<DoublePoint> centroidCluster0 = new CentroidCluster<DoublePoint>(doublePoint0);
      centroidCluster0.addPoint(doublePoint0);
      List<DoublePoint> list0 = centroidCluster0.getPoints();
      Random.setNextRandom((-2023));
      fuzzyKMeansClusterer0.cluster(list0);
      List<CentroidCluster<DoublePoint>> list1 = fuzzyKMeansClusterer0.getClusters();
      assertEquals((-1), fuzzyKMeansClusterer0.getMaxIterations());
      assertEquals(3.557678449715009E128, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals(1, list1.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ChebyshevDistance chebyshevDistance0 = new ChebyshevDistance();
      double[] doubleArray0 = new double[3];
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(0, 2698.5930551, 2301, chebyshevDistance0);
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      CentroidCluster<DoublePoint> centroidCluster0 = new CentroidCluster<DoublePoint>(doublePoint0);
      List<DoublePoint> list0 = centroidCluster0.getPoints();
      fuzzyKMeansClusterer0.cluster(list0);
      // Undeclared exception!
      try { 
        fuzzyKMeansClusterer0.getMembershipMatrix();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(0, 3.557678449715009E128);
      double[] doubleArray0 = new double[6];
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      CentroidCluster<DoublePoint> centroidCluster0 = new CentroidCluster<DoublePoint>(doublePoint0);
      List<DoublePoint> list0 = centroidCluster0.getPoints();
      centroidCluster0.addPoint(doublePoint0);
      // Undeclared exception!
      try { 
        fuzzyKMeansClusterer0.cluster(list0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EarthMoversDistance earthMoversDistance0 = new EarthMoversDistance();
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(1866, 1866, 1866, earthMoversDistance0);
      try { 
        fuzzyKMeansClusterer0.cluster((Collection<DoublePoint>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(1, 3.557678449715009E128);
      double[] doubleArray0 = new double[2];
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      CentroidCluster<DoublePoint> centroidCluster0 = new CentroidCluster<DoublePoint>(doublePoint0);
      List<DoublePoint> list0 = centroidCluster0.getPoints();
      centroidCluster0.addPoint((DoublePoint) null);
      Random.setNextRandom((-2023));
      // Undeclared exception!
      try { 
        fuzzyKMeansClusterer0.cluster(list0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>((-1775), 68.217081173);
      CentroidCluster<DoublePoint> centroidCluster0 = new CentroidCluster<DoublePoint>((Clusterable) null);
      List<DoublePoint> list0 = centroidCluster0.getPoints();
      // Undeclared exception!
      try { 
        fuzzyKMeansClusterer0.cluster(list0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = null;
      try {
        fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(1580, 6.865714679174435E-165);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (1)
         //
         verifyException("org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(556, 2157.8041, 556, (DistanceMeasure) null, (-1.4609399464484545), well19937c0);
      double double0 = fuzzyKMeansClusterer0.getEpsilon();
      assertEquals(556, fuzzyKMeansClusterer0.getK());
      assertEquals((-1.4609399464484545), double0, 0.01);
      assertEquals(556, fuzzyKMeansClusterer0.getMaxIterations());
      assertEquals(2157.8041, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ChebyshevDistance chebyshevDistance0 = new ChebyshevDistance();
      int[] intArray0 = new int[1];
      ISAACRandom iSAACRandom0 = new ISAACRandom(intArray0);
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = null;
      try {
        fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>((-1), (-1), (-1), chebyshevDistance0, (-1), iSAACRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1 is smaller than, or equal to, the minimum (1)
         //
         verifyException("org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(6, 6);
      double[] doubleArray0 = new double[2];
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      CentroidCluster<DoublePoint> centroidCluster0 = new CentroidCluster<DoublePoint>(doublePoint0);
      int[] intArray0 = new int[2];
      intArray0[0] = (-2768);
      DoublePoint doublePoint1 = new DoublePoint(intArray0);
      centroidCluster0.addPoint(doublePoint1);
      centroidCluster0.addPoint(doublePoint0);
      centroidCluster0.addPoint(doublePoint0);
      centroidCluster0.addPoint(doublePoint0);
      centroidCluster0.addPoint(doublePoint0);
      List<DoublePoint> list0 = centroidCluster0.getPoints();
      centroidCluster0.addPoint(doublePoint0);
      fuzzyKMeansClusterer0.cluster(list0);
      assertEquals((-1), fuzzyKMeansClusterer0.getMaxIterations());
      assertEquals(6.0, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      CentroidCluster<DoublePoint> centroidCluster0 = new CentroidCluster<DoublePoint>(doublePoint0);
      centroidCluster0.addPoint(doublePoint0);
      centroidCluster0.addPoint(doublePoint0);
      centroidCluster0.addPoint(doublePoint0);
      centroidCluster0.addPoint(doublePoint0);
      List<DoublePoint> list0 = centroidCluster0.getPoints();
      centroidCluster0.addPoint(doublePoint0);
      centroidCluster0.addPoint(doublePoint0);
      ManhattanDistance manhattanDistance0 = new ManhattanDistance();
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(6, 3.557678449715009E128, 6, manhattanDistance0);
      // Undeclared exception!
      try { 
        fuzzyKMeansClusterer0.cluster(list0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ChebyshevDistance chebyshevDistance0 = new ChebyshevDistance();
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(259, 259, 259, chebyshevDistance0);
      int[] intArray0 = new int[9];
      DoublePoint doublePoint0 = new DoublePoint(intArray0);
      CentroidCluster<DoublePoint> centroidCluster0 = new CentroidCluster<DoublePoint>(doublePoint0);
      List<DoublePoint> list0 = centroidCluster0.getPoints();
      try { 
        fuzzyKMeansClusterer0.cluster(list0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (259)
         //
         verifyException("org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(6, 6);
      double[] doubleArray0 = new double[2];
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      CentroidCluster<DoublePoint> centroidCluster0 = new CentroidCluster<DoublePoint>(doublePoint0);
      centroidCluster0.addPoint(doublePoint0);
      centroidCluster0.addPoint(doublePoint0);
      centroidCluster0.addPoint(doublePoint0);
      List<DoublePoint> list0 = centroidCluster0.getPoints();
      centroidCluster0.addPoint(doublePoint0);
      centroidCluster0.addPoint(doublePoint0);
      centroidCluster0.addPoint(doublePoint0);
      List<CentroidCluster<DoublePoint>> list1 = fuzzyKMeansClusterer0.cluster(list0);
      assertEquals(6, list1.size());
      
      double double0 = fuzzyKMeansClusterer0.getObjectiveFunctionValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(567, 567);
      // Undeclared exception!
      try { 
        fuzzyKMeansClusterer0.getObjectiveFunctionValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state
         //
         verifyException("org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CanberraDistance canberraDistance0 = new CanberraDistance();
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(1778, 1795.358103613, 1778, canberraDistance0);
      // Undeclared exception!
      try { 
        fuzzyKMeansClusterer0.getMembershipMatrix();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state
         //
         verifyException("org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(6, 6);
      double[] doubleArray0 = new double[2];
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      CentroidCluster<DoublePoint> centroidCluster0 = new CentroidCluster<DoublePoint>(doublePoint0);
      centroidCluster0.addPoint(doublePoint0);
      centroidCluster0.addPoint(doublePoint0);
      centroidCluster0.addPoint(doublePoint0);
      List<DoublePoint> list0 = centroidCluster0.getPoints();
      centroidCluster0.addPoint(doublePoint0);
      centroidCluster0.addPoint(doublePoint0);
      centroidCluster0.addPoint(doublePoint0);
      List<CentroidCluster<DoublePoint>> list1 = fuzzyKMeansClusterer0.cluster(list0);
      assertEquals(6, list1.size());
      
      fuzzyKMeansClusterer0.getMembershipMatrix();
      assertEquals(6.0, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals(0.001, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
      assertEquals((-1), fuzzyKMeansClusterer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = null;
      try {
        fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>((-3455), (-3455), (-1), (DistanceMeasure) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -3,455 is smaller than, or equal to, the minimum (1)
         //
         verifyException("org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(0, 3.557678449715009E128);
      fuzzyKMeansClusterer0.getClusters();
      assertEquals(3.557678449715009E128, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals(0, fuzzyKMeansClusterer0.getK());
      assertEquals(0.001, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
      assertEquals((-1), fuzzyKMeansClusterer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CanberraDistance canberraDistance0 = new CanberraDistance();
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(1778, 1795.358103613, 1778, canberraDistance0);
      double double0 = fuzzyKMeansClusterer0.getEpsilon();
      assertEquals(1795.358103613, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals(1778, fuzzyKMeansClusterer0.getMaxIterations());
      assertEquals(0.001, double0, 0.01);
      assertEquals(1778, fuzzyKMeansClusterer0.getK());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EarthMoversDistance earthMoversDistance0 = new EarthMoversDistance();
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(1866, 1866, 1866, earthMoversDistance0);
      fuzzyKMeansClusterer0.getDataPoints();
      assertEquals(1866, fuzzyKMeansClusterer0.getK());
      assertEquals(1866, fuzzyKMeansClusterer0.getMaxIterations());
      assertEquals(1866.0, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals(0.001, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(0, 3.557678449715009E128);
      int int0 = fuzzyKMeansClusterer0.getK();
      assertEquals((-1), fuzzyKMeansClusterer0.getMaxIterations());
      assertEquals(3.557678449715009E128, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals(0, int0);
      assertEquals(0.001, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CanberraDistance canberraDistance0 = new CanberraDistance();
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(1778, 1795.358103613, 1778, canberraDistance0);
      int int0 = fuzzyKMeansClusterer0.getMaxIterations();
      assertEquals(1795.358103613, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals(1778, fuzzyKMeansClusterer0.getK());
      assertEquals(1778, int0);
      assertEquals(0.001, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(0, 3.557678449715009E128);
      double double0 = fuzzyKMeansClusterer0.getFuzziness();
      assertEquals(0, fuzzyKMeansClusterer0.getK());
      assertEquals(0.001, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
      assertEquals((-1), fuzzyKMeansClusterer0.getMaxIterations());
      assertEquals(3.557678449715009E128, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CanberraDistance canberraDistance0 = new CanberraDistance();
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(1778, 1795.358103613, 1778, canberraDistance0);
      fuzzyKMeansClusterer0.getRandomGenerator();
      assertEquals(1778, fuzzyKMeansClusterer0.getMaxIterations());
      assertEquals(0.001, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
      assertEquals(1795.358103613, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals(1778, fuzzyKMeansClusterer0.getK());
  }
}
