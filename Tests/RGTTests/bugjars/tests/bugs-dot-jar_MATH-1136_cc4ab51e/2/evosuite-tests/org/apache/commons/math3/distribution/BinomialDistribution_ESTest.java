/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 27 23:34:21 GMT 2019
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.BinomialDistribution;
import org.apache.commons.math3.random.ISAACRandom;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BinomialDistribution_ESTest extends BinomialDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(2198, 0.0);
      double double0 = binomialDistribution0.cumulativeProbability(348);
      assertEquals(2198, binomialDistribution0.getNumberOfTrials());
      assertEquals(1.0, double0, 0.01);
      assertEquals(0.0, binomialDistribution0.getProbabilityOfSuccess(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(2198, 0.0);
      double double0 = binomialDistribution0.logProbability(2198);
      assertEquals(2198, binomialDistribution0.getNumberOfTrials());
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
      assertEquals(0.0, binomialDistribution0.getProbabilityOfSuccess(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      double double0 = binomialDistribution0.probability(1257);
      assertEquals(0, binomialDistribution0.getNumberOfTrials());
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, binomialDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(274, 3.3564604642699844E-8);
      double double0 = binomialDistribution0.getProbabilityOfSuccess();
      assertEquals(3.3564604642699844E-8, double0, 0.01);
      assertEquals(274, binomialDistribution0.getSupportUpperBound());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Well512a well512a0 = new Well512a(64);
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(well512a0, 64, 0.618737F);
      double double0 = binomialDistribution0.getNumericalVariance();
      assertEquals(15.097697857501771, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      double double0 = binomialDistribution0.getNumericalMean();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(274, 3.3564604642699844E-8);
      int int0 = binomialDistribution0.getNumberOfTrials();
      assertEquals(274, int0);
      assertEquals(3.3564604642699844E-8, binomialDistribution0.getProbabilityOfSuccess(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(274, 3.3564604642699844E-8);
      int int0 = binomialDistribution0.getSupportUpperBound();
      assertEquals(274, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.getSupportLowerBound();
      assertEquals(0.0, binomialDistribution0.getProbabilityOfSuccess(), 0.01);
      assertEquals(0, binomialDistribution0.getNumberOfTrials());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      int int0 = binomialDistribution0.getSupportLowerBound();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      double double0 = binomialDistribution0.logProbability(0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
      assertEquals(1, binomialDistribution0.getNumberOfTrials());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      double double0 = binomialDistribution0.logProbability((-1));
      assertEquals(0.0, binomialDistribution0.getProbabilityOfSuccess(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
      assertEquals(0, binomialDistribution0.getNumberOfTrials());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ISAACRandom iSAACRandom0 = new ISAACRandom((-3102L));
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(iSAACRandom0, 0, 0);
      int int0 = binomialDistribution0.solveInverseCumulativeProbability(0.0, 0, 1082);
      assertEquals(0.0, binomialDistribution0.getProbabilityOfSuccess(), 0.01);
      assertEquals(0, binomialDistribution0.getNumberOfTrials());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a((int[]) null);
      BinomialDistribution binomialDistribution0 = null;
      try {
        binomialDistribution0 = new BinomialDistribution(well1024a0, 1472, 1472);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1,472 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.BinomialDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = null;
      try {
        binomialDistribution0 = new BinomialDistribution((RandomGenerator) null, (-1), 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of trials (-1)
         //
         verifyException("org.apache.commons.math3.distribution.BinomialDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      double double0 = binomialDistribution0.getNumericalVariance();
      assertEquals(0, binomialDistribution0.getNumberOfTrials());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      double double0 = binomialDistribution0.getNumericalMean();
      assertEquals(0, binomialDistribution0.getNumberOfTrials());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.getSupportUpperBound();
      assertEquals(0, binomialDistribution0.getNumberOfTrials());
      assertEquals(0, int0);
      assertEquals(0.0, binomialDistribution0.getProbabilityOfSuccess(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      double double0 = binomialDistribution0.cumulativeProbability(0);
      assertEquals(0, binomialDistribution0.getNumberOfTrials());
      assertEquals(0.0, binomialDistribution0.getProbabilityOfSuccess(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      double double0 = binomialDistribution0.cumulativeProbability((-995));
      assertEquals(0.0, binomialDistribution0.getProbabilityOfSuccess(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, binomialDistribution0.getNumberOfTrials());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      double double0 = binomialDistribution0.cumulativeProbability(0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1, binomialDistribution0.getSupportUpperBound());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      double double0 = binomialDistribution0.logProbability(525);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
      assertEquals(1.0, binomialDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      double double0 = binomialDistribution0.logProbability((-1955));
      assertEquals(1, binomialDistribution0.getSupportUpperBound());
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      double double0 = binomialDistribution0.logProbability(0);
      assertEquals(0.0, binomialDistribution0.getProbabilityOfSuccess(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      double double0 = binomialDistribution0.probability(1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = null;
      try {
        binomialDistribution0 = new BinomialDistribution(51, 51);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 51 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.BinomialDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int[] intArray0 = new int[0];
      Well19937c well19937c0 = new Well19937c(intArray0);
      BinomialDistribution binomialDistribution0 = null;
      try {
        binomialDistribution0 = new BinomialDistribution(well19937c0, 3052, (-2573.7786485640627));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,573.779 out of [0, 1] range
         //
         verifyException("org.apache.commons.math3.distribution.BinomialDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = null;
      try {
        binomialDistribution0 = new BinomialDistribution((-2898), (-2898));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of trials (-2,898)
         //
         verifyException("org.apache.commons.math3.distribution.BinomialDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      double double0 = binomialDistribution0.getProbabilityOfSuccess();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, binomialDistribution0.getNumberOfTrials());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.getNumberOfTrials();
      assertEquals(0, int0);
      assertEquals(0.0, binomialDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      boolean boolean0 = binomialDistribution0.isSupportConnected();
      assertTrue(boolean0);
      assertEquals(0.0, binomialDistribution0.getNumericalVariance(), 0.01);
      assertEquals(0, binomialDistribution0.getNumberOfTrials());
  }
}
