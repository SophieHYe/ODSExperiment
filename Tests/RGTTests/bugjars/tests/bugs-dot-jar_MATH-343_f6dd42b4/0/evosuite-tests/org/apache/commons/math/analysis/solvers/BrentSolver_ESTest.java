/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 28 09:37:30 GMT 2019
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BrentSolver_ESTest extends BrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.setAbsoluteAccuracy((-1139.24434));
      double[] doubleArray0 = new double[10];
      doubleArray0[7] = Double.NaN;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-589.746478592476), 0.0, (-1.0));
      assertEquals(1, brentSolver0.getIterationCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = 1.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      brentSolver0.functionValueAccuracy = 0.0;
      double double0 = brentSolver0.solve((-2151.1828), 1.0);
      assertEquals(1, brentSolver0.getIterationCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 1441.519952775367;
      doubleArray0[1] = (-2472.82158381124);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-2472.82158381124), 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [-2,472.822, 0], Values: [6,116,288.105, 1,441.52]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 12.111845171330312;
      doubleArray0[1] = 0.5;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunctionLagrangeForm0);
      brentSolver0.functionValueAccuracy = 0.5;
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.5, 545.6605243256014);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-1771.6476);
      brentSolver0.defaultFunctionValueAccuracy = (-763.0780316359612);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, 2.0, 873.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [2, 873], Values: [-1,771.648, -1,771.648]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = 1.0E-15;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-2447.009), 1.0E-15, (-327.534413));
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-30, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-303.0912981);
      doubleArray0[3] = (-303.0912981);
      PolynomialFunction[] polynomialFunctionArray0 = new PolynomialFunction[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      polynomialFunctionArray0[0] = polynomialFunction0;
      UnivariateRealFunction univariateRealFunction0 = polynomialFunctionArray0[0].derivative();
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-1567.2), 2432.222963928004, 9.092738943000001E-26);
      assertEquals(27, brentSolver0.getIterationCount());
      assertEquals((-0.9999999907830907), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      double[] doubleArray0 = new double[1];
      brentSolver0.setFunctionValueAccuracy((-391.9066));
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-3245.1269632588155), 1363.4483001, 0.0);
      assertEquals(31, brentSolver0.getIterationCount());
      assertEquals(908.96553332327, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (-78.71354436155);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      brentSolver0.setFunctionValueAccuracy(385.32);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, 1.0E-15, 2842.0, 261.08877764);
      assertEquals((-7.871354436155002E-14), double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-3245.1269632588155), 1363.4483001, 20.288988127218254);
      assertEquals(20.288988127218254, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 12.111845171330312;
      doubleArray0[1] = 0.5;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunctionLagrangeForm0);
      brentSolver0.setFunctionValueAccuracy(12.111845171330312);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.5, 2197.0, 12.111845171330312);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(12.111845171330312, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 3268.2698561094;
      doubleArray0[1] = (-1937.62603);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve((-1.0), 2.0, 0.0);
      assertEquals(1, brentSolver0.getIterationCount());
      assertEquals(1.6867392394131906, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-86.1612448);
      doubleArray0[1] = (-2122.202);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve((-2122.202), 0.5, 0.053746996805981884);
      assertEquals(1, brentSolver0.getIterationCount());
      assertEquals((-0.04059992630296268), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-86.1612448);
      doubleArray0[1] = (-2122.202);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve((-1.0), 0.0);
      assertEquals(1, brentSolver0.getIterationCount());
      assertEquals((-0.04059992630296268), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      double[] doubleArray0 = new double[8];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      try { 
        brentSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.0, 2735.058, 332.6027766664036);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Abscissa 0 is duplicated at both indices 1 and 1
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      PolynomialFunction[] polynomialFunctionArray0 = new PolynomialFunction[8];
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) polynomialFunctionArray0[3], (-3245.1269632588155), 1362.9239525395321, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      double[] doubleArray0 = new double[8];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      try { 
        brentSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, (-4564.698206303), 2018.060581720709);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Abscissa 0 is duplicated at both indices 1 and 1
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 1.0E-15;
      PolynomialFunction[] polynomialFunctionArray0 = new PolynomialFunction[1];
      PolynomialSplineFunction polynomialSplineFunction0 = new PolynomialSplineFunction(doubleArray0, polynomialFunctionArray0);
      try { 
        brentSolver0.solve((UnivariateRealFunction) polynomialSplineFunction0, (-78.71354436155), 0.0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Argument -78.714 outside domain [0 ; 0]
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 3268.2698561094;
      doubleArray0[1] = (-1937.62603);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      brentSolver0.setMaximalIterationCount((-1));
      try { 
        brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, 0.5, 3268.2698561094);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-1) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) null, 1.0, 1788.0391562620496);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve((-1370.0), (-2536.68458987768), 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid interval, initial value parameters:  lower=-1,370, initial=0, upper=-2,536.685
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve((-4723.79645109897), 0.0, (-3193.56));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve(3000.84974829966, 3000.84974829966);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,000.85, 3,000.85]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunctionLagrangeForm0);
      try { 
        brentSolver0.solve(0.0, 1.0E-6);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Abscissa 0 is duplicated at both indices 1 and 1
         //
         verifyException("org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 3268.2698561094;
      doubleArray0[1] = (-1937.62603);
      doubleArray0[3] = (-1937.62603);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      brentSolver0.setMaximalIterationCount((-1));
      try { 
        brentSolver0.solve(1.0E-15, 1.0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-1) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 2949.29046249085;
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = Double.NaN;
      doubleArray0[3] = 0.5;
      doubleArray0[4] = 945.142016822485;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunctionLagrangeForm0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.5, 945.142016822485);
      assertEquals(945.142016822485, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      double[] doubleArray0 = new double[22];
      doubleArray0[2] = (-2710.46304906864);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      double double0 = brentSolver0.solve(univariateRealFunction0, (-2710.46304906864), 1851.5531694180352);
      assertEquals(1, brentSolver0.getIterationCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-372.0), 0.0);
      assertEquals((-372.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[21];
      doubleArray0[4] = 2841.4019253649185;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      brentSolver0.setAbsoluteAccuracy(Double.NaN);
      try { 
        brentSolver0.solve(univariateRealFunction0, (-78.71354436155), 2841.4019253649185, 260.1951607518632);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 3268.2698561094;
      doubleArray0[1] = (-1937.62603);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      brentSolver0.setMaximalIterationCount((-217));
      try { 
        brentSolver0.solve((-1.0), 2.0, 0.0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-217) exceeded
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 3268.2698561094;
      doubleArray0[1] = (-1937.62603);
      doubleArray0[7] = (-2307.68795);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve(1.0E-15, 1.0);
      assertEquals(7, brentSolver0.getIterationCount());
      assertEquals(0.9361701566492496, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = (-303.0912981);
      PolynomialFunction[] polynomialFunctionArray0 = new PolynomialFunction[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      polynomialFunctionArray0[0] = polynomialFunction0;
      UnivariateRealFunction univariateRealFunction0 = polynomialFunctionArray0[0].derivative();
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      double double0 = brentSolver0.solve(univariateRealFunction0, (-1064.012973691508), 1.0E-14);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(1.0E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = (-303.0912981);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, 1.0E-14, 1233.7560948946675);
      assertEquals(1.0E-14, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      double[] doubleArray0 = new double[6];
      doubleArray0[5] = 1119.73987578979;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunction0, (-2447.009), 1119.73987578979, (-327.534413));
      assertEquals(29, brentSolver0.getIterationCount());
      assertEquals(2.2596679219543048E-4, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 12.111845171330312;
      doubleArray0[1] = 0.5;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunctionLagrangeForm0);
      brentSolver0.functionValueAccuracy = 0.5;
      double double0 = brentSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.5, 2197.0, 12.111845171330312);
      assertEquals(0, brentSolver0.getIterationCount());
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 12.111845171330312;
      doubleArray0[1] = 0.5;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunctionLagrangeForm0);
      // Undeclared exception!
      try { 
        brentSolver0.solve((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.5, 2197.0, 12.111845171330312);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs.  Endpoints: [0.5, 2,197], Values: [0.5, 2,197]
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      double double0 = brentSolver0.solve((-1.0), 2.0, 0.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, brentSolver0.getIterationCount());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      try { 
        brentSolver0.solve(0.0, 2.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BrentSolver brentSolver0 = null;
      try {
        brentSolver0 = new BrentSolver((UnivariateRealFunction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function to solve cannot be null
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }
}
