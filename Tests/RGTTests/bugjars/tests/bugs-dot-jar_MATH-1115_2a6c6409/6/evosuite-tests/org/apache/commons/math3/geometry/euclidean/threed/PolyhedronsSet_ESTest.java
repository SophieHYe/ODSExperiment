/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 27 19:35:17 GMT 2019
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet;
import org.apache.commons.math3.geometry.euclidean.threed.Rotation;
import org.apache.commons.math3.geometry.euclidean.threed.RotationOrder;
import org.apache.commons.math3.geometry.euclidean.threed.SubPlane;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PolyhedronsSet_ESTest extends PolyhedronsSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(1.0E-10, 1810.882951588, 1084.3382, 1810.882951588, 152.854, 1084.3382);
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = new Vector3D((-4.813899778443457E-9), 1810.882951588, (-0.9587380996811092));
      Line line0 = new Line(vector3D1, vector3D0, 38.4099999951861);
      SubHyperplane<Euclidean3D> subHyperplane0 = polyhedronsSet0.firstIntersection(vector3D0, line0);
      assertNull(subHyperplane0);
      assertFalse(polyhedronsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-1868.62), 9.007199254740992E15, (-1868.62), 9.007199254740992E15, 9.007199254740992E15, 9.007199254740992E15);
      assertEquals(1.0E-10, polyhedronsSet0.getTolerance(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(0.0, 0.001, 0.001, 0.001, 3375.093764, 3375.093764, 0.0);
      assertEquals(0.0, polyhedronsSet0.getTolerance(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-4892.34582), 3.0, (-4892.34582), 3.0, 3.0, (-4892.34582));
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.translate((Vector3D) null);
      assertFalse(polyhedronsSet1.equals((Object)polyhedronsSet0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(0.0);
      Vector3D vector3D0 = new Vector3D(0.0, 0.0);
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.translate(vector3D0);
      assertTrue(polyhedronsSet1.isFull());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-2452.0));
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.translate((Vector3D) null);
      assertTrue(polyhedronsSet1.isFull());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(0.0, (-2495.834672056), 1.5707963267948966, (-1301.0), 0.0, (-1356.826772056443));
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Rotation rotation0 = new Rotation(vector3D0, vector3D0);
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.rotate(vector3D0, rotation0);
      assertFalse(polyhedronsSet1.equals((Object)polyhedronsSet0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(0.0);
      Vector3D vector3D0 = new Vector3D(0.0, 0.0);
      Rotation rotation0 = Rotation.IDENTITY;
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.rotate(vector3D0, rotation0);
      assertEquals(0.0, polyhedronsSet1.getTolerance(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(0.0, 0.0, 0.0, 0.0, Double.POSITIVE_INFINITY, 1521.506807649, 0.0);
      BSPTree<Euclidean3D> bSPTree0 = polyhedronsSet0.getTree(false);
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.buildNew(bSPTree0);
      assertFalse(polyhedronsSet1.equals((Object)polyhedronsSet0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((BSPTree<Euclidean3D>) null, (-1234.132908996));
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.buildNew((BSPTree<Euclidean3D>) null);
      assertNotSame(polyhedronsSet0, polyhedronsSet1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Euclidean3D euclidean3D0 = Euclidean3D.getInstance();
      BSPTree<Euclidean3D> bSPTree0 = new BSPTree<Euclidean3D>(euclidean3D0);
      PolygonsSet polygonsSet0 = new PolygonsSet(606.8223205, 3166.60564356, 606.8223205, 606.8223205, 606.8223205);
      SubPlane subPlane0 = new SubPlane((Hyperplane<Euclidean3D>) null, polygonsSet0);
      BSPTree<Euclidean3D> bSPTree1 = bSPTree0.split(subPlane0);
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(bSPTree1);
      Vector3D vector3D0 = Vector3D.MINUS_I;
      // Undeclared exception!
      try { 
        polyhedronsSet0.translate(vector3D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet$TranslationTransform", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Plane plane0 = new Plane(vector3D0, vector3D0, 1084.3382);
      SubPlane subPlane0 = plane0.wholeHyperplane();
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(linkedList0, 902.048273);
      BSPTree<Euclidean3D> bSPTree0 = polyhedronsSet0.getTree(true);
      BSPTree<Euclidean3D> bSPTree1 = new BSPTree<Euclidean3D>(subPlane0, bSPTree0, bSPTree0, vector3D0);
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.buildNew(bSPTree1);
      // Undeclared exception!
      try { 
        polyhedronsSet1.translate(vector3D0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.geometry.euclidean.threed.Vector3D cannot be cast to org.apache.commons.math3.geometry.partitioning.BoundaryAttribute
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0, (-1929.0549050501));
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(plane0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0, 0.5000000000042687);
      SubPlane subPlane0 = new SubPlane(plane0, polygonsSet0);
      BSPTree<Euclidean3D> bSPTree1 = new BSPTree<Euclidean3D>();
      BSPTree<Euclidean3D> bSPTree2 = new BSPTree<Euclidean3D>(subPlane0, bSPTree1, bSPTree1, subPlane0);
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(bSPTree2, 4.0);
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      // Undeclared exception!
      try { 
        polyhedronsSet0.rotate(vector3D0, rotation0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.geometry.euclidean.threed.SubPlane cannot be cast to org.apache.commons.math3.geometry.partitioning.BoundaryAttribute
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-1842.560038207967), (-372.95563882105), Double.NEGATIVE_INFINITY, (-1561.9823619294061), (-1842.560038207967), 3003.22212879, (-2570.9));
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Vector3D vector3D0 = rotationOrder0.getA1();
      Vector3D vector3D1 = new Vector3D(1.0E-10, vector3D0, 725.588630439998, vector3D0, 420.0762839, vector3D0);
      Rotation rotation0 = new Rotation(vector3D1, (-995.4925040758834));
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.rotate(vector3D1, rotation0);
      Line line0 = new Line(vector3D0, vector3D1, Double.POSITIVE_INFINITY);
      // Undeclared exception!
      try { 
        polyhedronsSet1.firstIntersection(vector3D1, line0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: internal error, please fill a bug report at https://issues.apache.org/jira/browse/MATH
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.AbstractRegion$BoundaryBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(0.0, 1805.7115376205472, 1084.3382, 1805.7115376205472, 152.854, 1084.3382);
      Vector3D vector3D0 = Vector3D.MINUS_I;
      // Undeclared exception!
      try { 
        polyhedronsSet0.firstIntersection(vector3D0, (Line) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Plane", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-4.813899778443457E-9), 1810.882951588, 152.854);
      Vector3D vector3D1 = new Vector3D(10.149777126960853, 4204.43027666972, 152.854);
      Plane plane0 = new Plane(vector3D1, 420.3268);
      Line line0 = new Line(vector3D0, vector3D1, 4204.43027666972);
      Vector2D[] vector2DArray0 = new Vector2D[7];
      Vector2D vector2D0 = plane0.toSubSpace((Vector<Euclidean3D>) vector3D0);
      vector2DArray0[0] = vector2D0;
      vector2DArray0[1] = vector2DArray0[0];
      vector2DArray0[2] = vector2DArray0[0];
      vector2DArray0[3] = vector2DArray0[0];
      vector2DArray0[4] = vector2DArray0[0];
      vector2DArray0[5] = vector2DArray0[4];
      vector2DArray0[6] = vector2DArray0[1];
      PolygonsSet polygonsSet0 = new PolygonsSet(0.0, vector2DArray0);
      SubPlane subPlane0 = new SubPlane(plane0, polygonsSet0);
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-1813.321220950099));
      BSPTree<Euclidean3D> bSPTree0 = polyhedronsSet0.getTree(true);
      Euclidean3D euclidean3D0 = Euclidean3D.getInstance();
      BSPTree<Euclidean3D> bSPTree1 = new BSPTree<Euclidean3D>(subPlane0, bSPTree0, bSPTree0, euclidean3D0);
      PolyhedronsSet polyhedronsSet1 = new PolyhedronsSet(bSPTree1);
      // Undeclared exception!
      try { 
        polyhedronsSet1.firstIntersection(vector3D0, line0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D cannot be cast to org.apache.commons.math3.geometry.partitioning.BoundaryAttribute
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-1842.560038207967), (-372.95563882105), Double.NEGATIVE_INFINITY, (-1561.9823619294061), (-1842.560038207967), 3003.22212879, (-2570.9));
      // Undeclared exception!
      try { 
        polyhedronsSet0.computeGeometricalProperties();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: internal error, please fill a bug report at https://issues.apache.org/jira/browse/MATH
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-4.813899778443457E-9), 1810.882951588, 152.854);
      Plane plane0 = new Plane(vector3D0, 1.0E-10);
      PolygonsSet polygonsSet0 = new PolygonsSet((-374.4731));
      SubPlane subPlane0 = new SubPlane(plane0, polygonsSet0);
      BSPTree<Euclidean3D> bSPTree0 = new BSPTree<Euclidean3D>(subPlane0);
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      BSPTree<Euclidean3D> bSPTree1 = new BSPTree<Euclidean3D>(subPlane0, bSPTree0, bSPTree0, euclidean2D0);
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(bSPTree1, 1079.9232);
      // Undeclared exception!
      try { 
        polyhedronsSet0.computeGeometricalProperties();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D cannot be cast to org.apache.commons.math3.geometry.partitioning.BoundaryAttribute
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet$FacetsContributionVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      linkedList0.add((SubHyperplane<Euclidean3D>) null);
      PolyhedronsSet polyhedronsSet0 = null;
      try {
        polyhedronsSet0 = new PolyhedronsSet(linkedList0, 620.119);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.AbstractRegion$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = null;
      try {
        polyhedronsSet0 = new PolyhedronsSet((Collection<SubHyperplane<Euclidean3D>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = null;
      try {
        polyhedronsSet0 = new PolyhedronsSet((-1385.163749), 0.0, (-2882.862337855), 0.0, (-1385.163749), (-1889.5017), (-529.150650264));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = null;
      try {
        polyhedronsSet0 = new PolyhedronsSet(Double.NaN, Double.NaN, Double.NaN, Double.NaN, 1.5707963267948966, Double.NaN);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(1.0E-10, 1810.882951588, 1084.3382, 1810.882951588, 152.854, 1084.3382);
      Vector3D vector3D0 = Vector3D.PLUS_J;
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.translate(vector3D0);
      assertFalse(polyhedronsSet1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((BSPTree<Euclidean3D>) null, (-1234.132908996));
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Rotation rotation0 = Rotation.IDENTITY;
      // Undeclared exception!
      try { 
        polyhedronsSet0.rotate(vector3D0, rotation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.partitioning.AbstractRegion", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Plane plane0 = new Plane(vector3D0, vector3D0, 1084.0271148060147);
      SubPlane subPlane0 = plane0.wholeHyperplane();
      linkedList0.offerFirst(subPlane0);
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(linkedList0, 652.055467370988);
      Vector3D vector3D1 = vector3D0.scalarMultiply(1084.0271148060147);
      Line line0 = new Line(vector3D0, vector3D1, 1084.0271148060147);
      SubHyperplane<Euclidean3D> subHyperplane0 = polyhedronsSet0.firstIntersection(vector3D1, line0);
      assertFalse(subHyperplane0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(10.149777126960853, 1810.8829516, 1084.3382, 1810.8829516, 152.854, 1084.3382);
      Vector3D vector3D0 = new Vector3D(1810.8829516, 1810.8829516, 152.854);
      Vector3D vector3D1 = new Vector3D(10.149777126960853, 4204.43027666972, 152.854);
      Line line0 = new Line(vector3D0, vector3D1, 4204.43027666972);
      SubHyperplane<Euclidean3D> subHyperplane0 = polyhedronsSet0.firstIntersection(vector3D0, line0);
      assertNull(subHyperplane0);
      assertFalse(polyhedronsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(1.0E-10, 1.0E-10, 1.0E-10, 1.0E-10, 1.0E-10, 1.0E-10);
      BSPTree<Euclidean3D> bSPTree0 = polyhedronsSet0.getTree(true);
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = new Vector3D((-1810.8829516), vector3D0, 1.0E-10, vector3D0);
      Plane plane0 = new Plane(vector3D1, vector3D1, (-1810.8829516));
      SubPlane subPlane0 = plane0.wholeHyperplane();
      BSPTree<Euclidean3D> bSPTree1 = bSPTree0.split(subPlane0);
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.buildNew(bSPTree1);
      Line line0 = new Line(vector3D1, vector3D0, 1.0E-10);
      SubHyperplane<Euclidean3D> subHyperplane0 = polyhedronsSet1.firstIntersection(vector3D1, line0);
      assertNull(subHyperplane0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-37.40640812212008), 1810.882951588, 1084.3382, 1810.882951588, (-37.40640812212008), 1084.3382);
      Vector3D vector3D0 = new Vector3D(1084.3382, 1810.882951588, (-0.9587380996811092));
      SubHyperplane<Euclidean3D> subHyperplane0 = polyhedronsSet0.firstIntersection(vector3D0, (Line) null);
      assertNotNull(subHyperplane0);
      assertFalse(polyhedronsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-37.40640812212008), 1810.882951588, 1084.3382, 1810.882951588, (-37.40640812212008), 1084.3382);
      // Undeclared exception!
      polyhedronsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-2267.6709895755), 0.0, 538.10277, 538.10277, 0.0, 3.141592653489793, 1296.2);
      assertTrue(polyhedronsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(1.0E-10, 1.0E-10, 1.0E-10, 1.0E-10, 1.0E-10, 1.0E-10);
      BSPTree<Euclidean3D> bSPTree0 = polyhedronsSet0.getTree(true);
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Plane plane0 = new Plane(vector3D0, vector3D0, (-1810.8829516));
      SubPlane subPlane0 = plane0.wholeHyperplane();
      BSPTree<Euclidean3D> bSPTree1 = bSPTree0.split(subPlane0);
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.buildNew(bSPTree1);
      polyhedronsSet1.computeGeometricalProperties();
      assertFalse(polyhedronsSet0.equals((Object)polyhedronsSet1));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet();
      assertEquals(1.0E-10, polyhedronsSet0.getTolerance(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((BSPTree<Euclidean3D>) null);
      // Undeclared exception!
      try { 
        polyhedronsSet0.computeGeometricalProperties();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(linkedList0);
      assertFalse(polyhedronsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Plane plane0 = new Plane(vector3D0, vector3D0, 1084.0271148060147);
      SubPlane subPlane0 = plane0.wholeHyperplane();
      linkedList0.offerFirst(subPlane0);
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(linkedList0, 652.055467370988);
      polyhedronsSet0.computeGeometricalProperties();
      assertEquals(652.055467370988, polyhedronsSet0.getTolerance(), 0.01);
  }
}
