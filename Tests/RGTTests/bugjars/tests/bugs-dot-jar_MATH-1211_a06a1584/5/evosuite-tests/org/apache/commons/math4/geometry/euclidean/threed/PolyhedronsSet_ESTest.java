/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 28 10:14:30 GMT 2019
 */

package org.apache.commons.math4.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.math4.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math4.geometry.euclidean.threed.Line;
import org.apache.commons.math4.geometry.euclidean.threed.Plane;
import org.apache.commons.math4.geometry.euclidean.threed.PolyhedronsSet;
import org.apache.commons.math4.geometry.euclidean.threed.Rotation;
import org.apache.commons.math4.geometry.euclidean.threed.SubPlane;
import org.apache.commons.math4.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math4.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math4.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math4.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math4.geometry.partitioning.BSPTree;
import org.apache.commons.math4.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PolyhedronsSet_ESTest extends PolyhedronsSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-2490.75806170448), 1852.21737611449, (-2490.75806170448), 1852.21737611449, (-2490.75806170448), 0.0, 1852.21737611449);
      Vector3D vector3D0 = Vector3D.PLUS_K;
      SubHyperplane<Euclidean3D> subHyperplane0 = polyhedronsSet0.firstIntersection(vector3D0, (Line) null);
      assertNotNull(subHyperplane0);
      assertFalse(polyhedronsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-1571.0), (-965.8226111178396), (-1847.745577232635), 0.0, (-3538.251), 1.0, 1.0);
      polyhedronsSet0.computeGeometricalProperties();
      assertFalse(polyhedronsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-1336.32985), (-965.8226111178396), (-965.8226111178396), 0.0, 0.0, (-1.0), (-1.0));
      assertTrue(polyhedronsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(3293.4552498, 3293.4552498, (-72.4562348445), 3293.4552498, (-2223.84897697), 3293.4552498, 0.0);
      assertTrue(polyhedronsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-72.872842292));
      Vector3D vector3D0 = Vector3D.PLUS_I;
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.translate(vector3D0);
      assertTrue(polyhedronsSet1.isFull());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(0.0, (-1519.9066293), (-1519.9066293), (-4406.98780934288), (-1519.9066293), (-1519.9066293), 1.0);
      Vector3D vector3D0 = Vector3D.ZERO;
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.translate(vector3D0);
      assertNotSame(polyhedronsSet0, polyhedronsSet1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.ZERO;
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(0.0, 1562.4449136397, 0.0, 0.0, 0.0, 1562.4449136397, 0.0);
      Rotation rotation0 = new Rotation(0.0, 0.0, 0.0, 0.0, false);
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.rotate(vector3D0, rotation0);
      assertTrue(polyhedronsSet1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(linkedList0, Double.POSITIVE_INFINITY);
      Vector3D vector3D0 = Vector3D.ZERO;
      Rotation rotation0 = Rotation.IDENTITY;
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.rotate(vector3D0, rotation0);
      assertEquals(Double.POSITIVE_INFINITY, polyhedronsSet1.getTolerance(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(2.0, 4.503599627370496E15, 4.503599627370496E15, 1169.1078, 1169.1078, 4.503599627370496E15, (-1649.5982));
      BSPTree<Euclidean3D> bSPTree0 = polyhedronsSet0.getTree(false);
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.buildNew(bSPTree0);
      assertTrue(polyhedronsSet1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0, vector3D0, 0.0);
      PolyhedronsSet polyhedronsSet0 = plane0.wholeSpace();
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.buildNew((BSPTree<Euclidean3D>) null);
      // Undeclared exception!
      try { 
        polyhedronsSet1.translate(vector3D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-2978.0));
      Vector3D vector3D0 = Vector3D.NaN;
      BSPTree<Euclidean3D> bSPTree0 = polyhedronsSet0.getTree(true);
      Plane plane0 = new Plane(vector3D0, vector3D0, 0.0);
      BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree1, 4.0);
      SubPlane subPlane0 = new SubPlane(plane0, polygonsSet0);
      BSPTree<Euclidean3D> bSPTree2 = new BSPTree<Euclidean3D>(subPlane0, bSPTree0, bSPTree0, polyhedronsSet0);
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.buildNew(bSPTree2);
      // Undeclared exception!
      try { 
        polyhedronsSet1.translate(vector3D0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math4.geometry.euclidean.threed.PolyhedronsSet cannot be cast to org.apache.commons.math4.geometry.partitioning.BoundaryAttribute
         //
         verifyException("org.apache.commons.math4.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((BSPTree<Euclidean3D>) null, 0.0);
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Rotation rotation0 = new Rotation(2496.8664512669, 0.0, 0.0, 0.0, false);
      // Undeclared exception!
      try { 
        polyhedronsSet0.rotate(vector3D0, rotation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      BSPTree<Euclidean3D> bSPTree0 = new BSPTree<Euclidean3D>(vector3D0);
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(bSPTree0, 610.473);
      Plane plane0 = new Plane(vector3D0, vector3D0, 610.473);
      bSPTree0.insertCut(plane0);
      Rotation rotation0 = Rotation.IDENTITY;
      // Undeclared exception!
      try { 
        polyhedronsSet0.rotate(vector3D0, rotation0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math4.geometry.euclidean.threed.Vector3D cannot be cast to org.apache.commons.math4.geometry.partitioning.BoundaryAttribute
         //
         verifyException("org.apache.commons.math4.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(647.08891, 1852.21737611449, 647.08891, 1852.21737611449, 647.08891, 0.0, Double.NaN);
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.translate(vector3D0);
      Plane plane0 = new Plane(vector3D0, 6.283185307179586);
      Line line0 = plane0.intersection(plane0);
      // Undeclared exception!
      try { 
        polyhedronsSet1.firstIntersection(vector3D0, line0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: internal error, please fill a bug report at https://issues.apache.org/jira/browse/MATH
         //
         verifyException("org.apache.commons.math4.geometry.partitioning.Characterization", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(linkedList0, 1.0);
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.buildNew((BSPTree<Euclidean3D>) null);
      // Undeclared exception!
      try { 
        polyhedronsSet1.computeGeometricalProperties();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(780.482, 780.482, 780.482, 780.482, 780.482, 780.482, 780.482);
      BSPTree<Euclidean3D> bSPTree0 = polyhedronsSet0.getTree(true);
      Vector3D vector3D0 = new Vector3D((-2491.75806170448), 85.188234);
      Plane plane0 = new Plane(vector3D0, vector3D0, 780.482);
      bSPTree0.insertCut(plane0);
      // Undeclared exception!
      try { 
        polyhedronsSet0.computeGeometricalProperties();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = null;
      try {
        polyhedronsSet0 = new PolyhedronsSet((Collection<SubHyperplane<Euclidean3D>>) null, (-2551.81344));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = new Vector3D(2400.0905887626, vector3D0, Double.POSITIVE_INFINITY, vector3D0, 2400.0905887626, vector3D0, 2400.0905887626, vector3D0);
      Plane plane0 = new Plane(vector3D1, vector3D1, vector3D0, 2400.0905887626);
      Vector2D vector2D0 = Vector2D.NaN;
      org.apache.commons.math4.geometry.euclidean.twod.Line line0 = new org.apache.commons.math4.geometry.euclidean.twod.Line(vector2D0, vector2D0, 0.0);
      PolygonsSet polygonsSet0 = line0.wholeSpace();
      Object object0 = new Object();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(object0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      SubPlane subPlane0 = new SubPlane(plane0, polygonsSet1);
      linkedList0.add((SubHyperplane<Euclidean3D>) subPlane0);
      PolyhedronsSet polyhedronsSet0 = null;
      try {
        polyhedronsSet0 = new PolyhedronsSet(linkedList0, 0.9999999999);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Boolean
         //
         verifyException("org.apache.commons.math4.geometry.euclidean.twod.PolygonsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-2083.525832), (-2083.525832), (-2083.525832), (-2083.525832), (-2083.525832), (-1.0), (-1.0));
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Rotation rotation0 = new Rotation((-1.0), 0.0, 3.0, 3197.4, true);
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.rotate(vector3D0, rotation0);
      assertFalse(polyhedronsSet1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-2978.0), (-2978.0), (-2978.0), (-2978.0), (-2978.0), (-2978.0), (-2978.0));
      Vector3D vector3D0 = Vector3D.ZERO;
      Rotation rotation0 = new Rotation((-2978.0), (-2978.0), (-2978.0), (-2978.0), false);
      Vector3D vector3D1 = rotation0.getAxis();
      Vector3D vector3D2 = Vector3D.MINUS_I;
      Vector3D vector3D3 = vector3D2.negate();
      Line line0 = new Line(vector3D3, vector3D1, (-2978.0));
      SubHyperplane<Euclidean3D> subHyperplane0 = polyhedronsSet0.firstIntersection(vector3D0, line0);
      assertNotNull(subHyperplane0);
      assertFalse(polyhedronsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-2978.0), (-2978.0), (-2978.0), (-2978.0), (-2978.0), (-2978.0), (-2978.0));
      Vector3D vector3D0 = Vector3D.ZERO;
      Vector3D vector3D1 = Vector3D.MINUS_I;
      Line line0 = new Line(vector3D1, vector3D0, (-2428.96589337));
      SubHyperplane<Euclidean3D> subHyperplane0 = polyhedronsSet0.firstIntersection(vector3D0, line0);
      assertNull(subHyperplane0);
      assertFalse(polyhedronsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-2489.9988777025424), 1852.21737611449, (-2489.9988777025424), 1852.21737611449, (-2489.9988777025424), 0.0, 1852.21737611449);
      Vector3D vector3D0 = Vector3D.PLUS_J;
      // Undeclared exception!
      try { 
        polyhedronsSet0.firstIntersection(vector3D0, (Line) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      BSPTree<Euclidean3D> bSPTree0 = new BSPTree<Euclidean3D>(vector3D0);
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(bSPTree0, 610.473);
      Plane plane0 = new Plane(vector3D0, vector3D0, 610.473);
      bSPTree0.insertCut(plane0);
      // Undeclared exception!
      try { 
        polyhedronsSet0.firstIntersection(vector3D0, (Line) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math4.geometry.euclidean.threed.Vector3D cannot be cast to org.apache.commons.math4.geometry.partitioning.BoundaryAttribute
         //
         verifyException("org.apache.commons.math4.geometry.euclidean.threed.PolyhedronsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(648.9541580758649, 648.9541580758649, 648.9541580758649, 648.9541580758649, 648.9541580758649, (-5494.1729575205845), (-5494.1729575205845));
      assertTrue(polyhedronsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-2978.0), (-2978.0), (-2978.0), (-2978.0), (-2978.0), (-2978.0), (-2978.0));
      Vector3D vector3D0 = Vector3D.ZERO;
      Rotation rotation0 = new Rotation((-2978.0), 18.642199628718217, (-2978.0), (-2978.0), false);
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.rotate(vector3D0, rotation0);
      assertFalse(polyhedronsSet1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-2978.0), (-2978.0), (-2978.0), (-2978.0), (-2978.0), (-2978.0), (-2978.0));
      Vector3D vector3D0 = Vector3D.ZERO;
      Rotation rotation0 = new Rotation((-2978.0), 18.642199628718217, (-2978.0), (-2978.0), false);
      Vector3D vector3D1 = rotation0.getAxis();
      Line line0 = new Line(vector3D1, vector3D0, (-2428.96589337));
      SubHyperplane<Euclidean3D> subHyperplane0 = polyhedronsSet0.firstIntersection(vector3D0, line0);
      assertNotNull(subHyperplane0);
      assertFalse(polyhedronsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-2491.75806170448), (-1873.116), (-1873.116), (-1851.21737611449), (-1873.116), 4.503599627370496E15, 0.0);
      Vector3D vector3D0 = Vector3D.PLUS_J;
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.translate(vector3D0);
      // Undeclared exception!
      try { 
        polyhedronsSet0.contains(polyhedronsSet1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0, 861.692);
      PolygonsSet polygonsSet0 = new PolygonsSet(0.12998198026316182);
      SubPlane subPlane0 = new SubPlane(plane0, polygonsSet0);
      linkedList0.add((SubHyperplane<Euclidean3D>) subPlane0);
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(linkedList0, 0.12998198026316182);
      polyhedronsSet0.computeGeometricalProperties();
      assertFalse(polyhedronsSet0.isFull());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(linkedList0, 0.12998198026316182);
      polyhedronsSet0.computeGeometricalProperties();
      assertFalse(polyhedronsSet0.isEmpty());
  }
}