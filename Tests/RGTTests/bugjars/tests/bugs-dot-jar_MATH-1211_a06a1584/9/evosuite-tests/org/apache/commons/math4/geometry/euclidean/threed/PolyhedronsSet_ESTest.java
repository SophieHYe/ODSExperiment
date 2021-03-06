/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 28 10:22:52 GMT 2019
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
import org.apache.commons.math4.geometry.euclidean.threed.RotationOrder;
import org.apache.commons.math4.geometry.euclidean.threed.SubPlane;
import org.apache.commons.math4.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math4.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math4.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math4.geometry.partitioning.BSPTree;
import org.apache.commons.math4.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PolyhedronsSet_ESTest extends PolyhedronsSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-1.2443779171181453), 263.59461647982, (-1.2443779171181453), 0.0, 0.0, 263.59461647982, 0.0);
      Vector3D vector3D0 = Vector3D.MINUS_K;
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
  public void test01()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(0.0, 0.0, (-3620.9), 0.0, 0.0, (-3620.9), (-3620.9));
      assertTrue(polyhedronsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(0.0, 4.0, 4.0, 4.0, 4.0, 4.0, 0.0);
      assertEquals(0.0, polyhedronsSet0.getTolerance(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-827.0), (-827.0), 0.0, (-493.12646332402), 0.0, 1786.9, 0.0);
      assertTrue(polyhedronsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(linkedList0, 4.0);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Vector3D vector3D0 = rotationOrder0.getA2();
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.translate(vector3D0);
      assertFalse(polyhedronsSet1.equals((Object)polyhedronsSet0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-2085.599164643044), (-2258.1302756942173), (-2085.599164643044), 0.0, (-771.8057), 0.0, 0.0);
      Vector3D vector3D0 = Vector3D.MINUS_K;
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.translate(vector3D0);
      assertTrue(polyhedronsSet1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Rotation rotation0 = Rotation.IDENTITY;
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(1355.0, (-1079.3), 1355.0, (-1035.419698417417), 1355.0, 1355.0, (-1079.3));
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.rotate(vector3D0, rotation0);
      assertFalse(polyhedronsSet1.equals((Object)polyhedronsSet0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(0.0);
      Vector3D vector3D0 = Vector3D.ZERO;
      Rotation rotation0 = new Rotation((-1.0E-10), 1132.471258, 0.0, (-1.0E-10), true);
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.rotate(vector3D0, rotation0);
      assertEquals(0.0, polyhedronsSet1.getTolerance(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(linkedList0, 4.0);
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.rotate(vector3D0, rotation0);
      assertFalse(polyhedronsSet1.equals((Object)polyhedronsSet0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(0.0, 0.0, 0.0, 0.0, (-1987.0), (-2904.27), (-1987.0));
      BSPTree<Euclidean3D> bSPTree0 = polyhedronsSet0.getTree(false);
      BSPTree<Euclidean3D> bSPTree1 = bSPTree0.getPlus();
      polyhedronsSet0.buildNew(bSPTree1);
      assertFalse(polyhedronsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(linkedList0, 0.0);
      BSPTree<Euclidean3D> bSPTree0 = polyhedronsSet0.getTree(true);
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.buildNew(bSPTree0);
      assertFalse(polyhedronsSet1.equals((Object)polyhedronsSet0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((BSPTree<Euclidean3D>) null, 2226.050921977866);
      Vector3D vector3D0 = Vector3D.ZERO;
      // Undeclared exception!
      try { 
        polyhedronsSet0.translate(vector3D0);
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
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-1035.419698417417), (-1079.3), (-1035.419698417417), (-1035.419698417417), (-1035.419698417417), (-1035.419698417417), (-1079.3));
      Rotation rotation0 = new Rotation(1.0E-10, (-1035.419698417417), (-1079.3), (-1035.419698417417), false);
      // Undeclared exception!
      try { 
        polyhedronsSet0.rotate(vector3D0, rotation0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // non-invertible affine transform collapses some lines into single points
         //
         verifyException("org.apache.commons.math4.geometry.euclidean.twod.Line$LineTransform", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-552.6739), 0.0, 0.0, (-2227.9238), (-0.19), 0.0, (-552.6739));
      BSPTree<Euclidean3D> bSPTree0 = polyhedronsSet0.getTree(false);
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0, vector3D0, (-2227.9238));
      bSPTree0.insertCut(plane0);
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      // Undeclared exception!
      try { 
        polyhedronsSet0.rotate(vector3D0, rotation0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Boolean cannot be cast to org.apache.commons.math4.geometry.partitioning.BoundaryAttribute
         //
         verifyException("org.apache.commons.math4.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-2630.41538352018), (-2630.41538352018), 1.0, 1.0, 0.9689123630523682, 892.2315226318068, (-1.2443779171181453));
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.translate(vector3D0);
      Line line0 = new Line(vector3D0, vector3D0, 0.9689123630523682);
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
  public void test15()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Plane plane0 = new Plane(vector3D0, (-2087.8751778647675));
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0, 1805.36628);
      SubPlane subPlane0 = new SubPlane(plane0, polygonsSet0);
      BSPTree<Euclidean3D> bSPTree1 = new BSPTree<Euclidean3D>(polygonsSet0);
      Euclidean3D euclidean3D0 = Euclidean3D.getInstance();
      BSPTree<Euclidean3D> bSPTree2 = new BSPTree<Euclidean3D>(subPlane0, bSPTree1, bSPTree1, euclidean3D0);
      BSPTree<Euclidean3D> bSPTree3 = bSPTree2.copySelf();
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(bSPTree3, 1805.36628);
      // Undeclared exception!
      try { 
        polyhedronsSet0.firstIntersection(vector3D0, (Line) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math4.geometry.euclidean.threed.Euclidean3D cannot be cast to org.apache.commons.math4.geometry.partitioning.BoundaryAttribute
         //
         verifyException("org.apache.commons.math4.geometry.euclidean.threed.PolyhedronsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-2630.41538352018), (-2630.41538352018), 1.0, 1.0, 0.9689123630523682, 892.2315226318068, (-1.2443779171181453));
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Rotation rotation0 = new Rotation((-1.2443779171181453), (-2630.41538352018), (-1533.3646860000001), (-2630.41538352018), false);
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.rotate(vector3D0, rotation0);
      // Undeclared exception!
      try { 
        polyhedronsSet1.computeGeometricalProperties();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: internal error, please fill a bug report at https://issues.apache.org/jira/browse/MATH
         //
         verifyException("org.apache.commons.math4.geometry.partitioning.Characterization", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-1.2443779171181453), 263.59461647982, (-1.2443779171181453), 0.0, 0.0, 263.59461647982, 0.0);
      // Undeclared exception!
      try { 
        polyhedronsSet0.computeGeometricalProperties();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.geometry.euclidean.twod.Line", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-2630.4154), (-2630.4154), (-13.57274272703942), (-13.57274272703942), (-13.57274272703942), (-13.57274272703942), (-13.57274272703942));
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0, vector3D0, (-2630.4154));
      Object object0 = new Object();
      BSPTree<Euclidean3D> bSPTree0 = new BSPTree<Euclidean3D>(object0);
      SubPlane subPlane0 = plane0.wholeHyperplane();
      BSPTree<Euclidean3D> bSPTree1 = bSPTree0.split(subPlane0);
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.buildNew(bSPTree1);
      // Undeclared exception!
      try { 
        polyhedronsSet1.computeGeometricalProperties();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = null;
      try {
        polyhedronsSet0 = new PolyhedronsSet((Collection<SubHyperplane<Euclidean3D>>) null, (-1299.279871991));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-1.2443779171181453), 263.59461647982, (-1.2443779171181453), 0.06683724065257285, 0.06683724065257285, 263.59461647982, 0.06683724065257285);
      double double0 = polyhedronsSet0.getSize();
      assertEquals(91512.89480080294, double0, 0.01);
      
      Vector3D vector3D0 = Vector3D.MINUS_K;
      polyhedronsSet0.translate(vector3D0);
      assertFalse(polyhedronsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Vector3D vector3D1 = vector3D0.scalarMultiply((-1079.3));
      Plane plane0 = new Plane(vector3D0, (-1035.419698417417));
      SubPlane subPlane0 = plane0.wholeHyperplane();
      linkedList0.add((SubHyperplane<Euclidean3D>) subPlane0);
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(linkedList0, (-46.376));
      Line line0 = new Line(vector3D1, vector3D0, (-1079.3));
      SubHyperplane<Euclidean3D> subHyperplane0 = polyhedronsSet0.firstIntersection(vector3D1, line0);
      assertFalse(linkedList0.contains(subHyperplane0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(0.0);
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.buildNew((BSPTree<Euclidean3D>) null);
      Vector3D vector3D0 = new Vector3D((-898.22391889453), (-898.22391889453), (-339.929349813));
      Rotation rotation0 = new Rotation(vector3D0, 0.0);
      // Undeclared exception!
      try { 
        polyhedronsSet1.rotate(vector3D0, rotation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math4.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = vector3D0.scalarMultiply((-1079.3));
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-1079.3), (-1035.419698417417), (-1035.419698417417), (-1035.419698417417), (-1079.3), (-1035.419698417417), (-46.376));
      Line line0 = new Line(vector3D1, vector3D0, (-1079.3));
      SubHyperplane<Euclidean3D> subHyperplane0 = polyhedronsSet0.firstIntersection(vector3D1, line0);
      assertNull(subHyperplane0);
      assertFalse(polyhedronsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Vector3D vector3D1 = Vector3D.PLUS_K;
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-1079.3), (-1079.3), (-1079.3), (-1079.3), (-1079.3), (-1079.3), (-1079.3));
      Line line0 = new Line(vector3D1, vector3D0, (-1079.3));
      SubHyperplane<Euclidean3D> subHyperplane0 = polyhedronsSet0.firstIntersection(vector3D0, line0);
      assertNotNull(subHyperplane0);
      assertFalse(polyhedronsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Vector3D vector3D1 = new Vector3D((-1079.3), vector3D0, (-1079.3), vector3D0, (-1079.3), vector3D0);
      Plane plane0 = new Plane(vector3D0, (-1079.3));
      SubPlane subPlane0 = plane0.wholeHyperplane();
      linkedList0.add((SubHyperplane<Euclidean3D>) subPlane0);
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(linkedList0, 1355.0);
      Line line0 = new Line(vector3D1, vector3D0, (-1079.3));
      SubHyperplane<Euclidean3D> subHyperplane0 = polyhedronsSet0.firstIntersection(vector3D0, line0);
      assertFalse(subHyperplane0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = vector3D0.scalarMultiply((-1079.3));
      Plane plane0 = new Plane(vector3D0, (-1035.419698417417));
      SubPlane subPlane0 = plane0.wholeHyperplane();
      linkedList0.add((SubHyperplane<Euclidean3D>) subPlane0);
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(linkedList0, (-46.376));
      Line line0 = new Line(vector3D1, vector3D0, (-1079.3));
      SubHyperplane<Euclidean3D> subHyperplane0 = polyhedronsSet0.firstIntersection(vector3D0, line0);
      assertNull(subHyperplane0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-8.118816578660201), 0.9999999999999508, (-8.118816578660201), 0.0, 0.0, 0.9999999999999508, 0.0);
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
  public void test28()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(1.0, 1057.6, 0.0, 1057.6, 1057.6, 1.0, 1.0);
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Plane plane0 = new Plane(vector3D0, vector3D0, 1231.823);
      PolygonsSet polygonsSet0 = new PolygonsSet(1057.6, 1057.6, 2468.9261435884705, 0.087, 2391.28332155998);
      SubPlane subPlane0 = new SubPlane(plane0, polygonsSet0);
      BSPTree<Euclidean3D> bSPTree0 = new BSPTree<Euclidean3D>("4IS;m(7G:$M}b");
      BSPTree<Euclidean3D> bSPTree1 = new BSPTree<Euclidean3D>(subPlane0, bSPTree0, bSPTree0, subPlane0);
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.buildNew(bSPTree1);
      // Undeclared exception!
      try { 
        polyhedronsSet1.translate(vector3D0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math4.geometry.euclidean.threed.SubPlane cannot be cast to org.apache.commons.math4.geometry.partitioning.BoundaryAttribute
         //
         verifyException("org.apache.commons.math4.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Plane plane0 = new Plane(vector3D0, (-1079.3));
      SubPlane subPlane0 = plane0.wholeHyperplane();
      linkedList0.add((SubHyperplane<Euclidean3D>) subPlane0);
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(linkedList0, 1355.0);
      polyhedronsSet0.computeGeometricalProperties();
      assertFalse(polyhedronsSet0.isFull());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(linkedList0, 1355.0);
      polyhedronsSet0.computeGeometricalProperties();
      assertEquals(1355.0, polyhedronsSet0.getTolerance(), 0.01);
  }
}
