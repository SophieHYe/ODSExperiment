/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 27 23:18:34 GMT 2019
 */

package org.apache.commons.math3.geometry.euclidean.twod.hull;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.euclidean.twod.hull.MonotoneChain;
import org.apache.commons.math3.geometry.spherical.oned.S1Point;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MonotoneChain_ESTest extends MonotoneChain_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<Vector2D> linkedList0 = new LinkedList<Vector2D>();
      S1Point s1Point0 = new S1Point(0.0);
      Vector2D vector2D0 = s1Point0.getVector();
      linkedList0.add(vector2D0);
      Vector2D vector2D1 = new Vector2D(42.66426865094828, 42.66426865094828);
      Vector2D vector2D2 = new Vector2D((-772.10551), (-772.10551));
      linkedList0.add(vector2D2);
      linkedList0.add(vector2D1);
      MonotoneChain monotoneChain0 = new MonotoneChain(true, 42.66426865094828);
      Collection<Vector2D> collection0 = monotoneChain0.findHullVertices(linkedList0);
      assertTrue(collection0.contains(vector2D2));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MonotoneChain monotoneChain0 = new MonotoneChain(true, 0.0);
      LinkedList<Vector2D> linkedList0 = new LinkedList<Vector2D>();
      Vector2D vector2D0 = new Vector2D(0.0, 0.0);
      linkedList0.add(vector2D0);
      linkedList0.add(vector2D0);
      linkedList0.add(vector2D0);
      Collection<Vector2D> collection0 = monotoneChain0.findHullVertices(linkedList0);
      assertTrue(collection0.contains(vector2D0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MonotoneChain monotoneChain0 = new MonotoneChain();
      LinkedList<Vector2D> linkedList0 = new LinkedList<Vector2D>();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      linkedList0.add(vector2D0);
      linkedList0.add(vector2D0);
      linkedList0.add(vector2D0);
      Collection<Vector2D> collection0 = monotoneChain0.findHullVertices(linkedList0);
      Collection<Vector2D> collection1 = monotoneChain0.findHullVertices(collection0);
      Collection<Vector2D> collection2 = monotoneChain0.findHullVertices(collection1);
      assertFalse(collection2.equals((Object)collection1));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MonotoneChain monotoneChain0 = new MonotoneChain();
      // Undeclared exception!
      try { 
        monotoneChain0.findHullVertices((Collection<Vector2D>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<Vector2D> linkedList0 = new LinkedList<Vector2D>();
      S1Point s1Point0 = new S1Point((-772.1055));
      Vector2D vector2D0 = s1Point0.getVector();
      linkedList0.add(vector2D0);
      Vector2D vector2D1 = new Vector2D((-772.1055), vector2D0, (-772.1055), vector2D0, (-772.1055), vector2D0);
      linkedList0.add(vector2D1);
      linkedList0.add(vector2D0);
      MonotoneChain monotoneChain0 = new MonotoneChain(true, (-772.1055));
      Collection<Vector2D> collection0 = monotoneChain0.findHullVertices(linkedList0);
      assertTrue(collection0.contains(vector2D1));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MonotoneChain monotoneChain0 = new MonotoneChain();
      LinkedList<Vector2D> linkedList0 = new LinkedList<Vector2D>();
      Vector2D vector2D0 = new Vector2D(2.85040095144011776E17, 1.0);
      linkedList0.add(vector2D0);
      S1Point s1Point0 = new S1Point(0.0);
      Vector2D vector2D1 = s1Point0.getVector();
      linkedList0.add(vector2D1);
      Vector2D vector2D2 = new Vector2D(0.0, vector2D1, 0.0, vector2D1, 0.0, vector2D1, 0.0, vector2D1);
      linkedList0.add(vector2D2);
      Collection<Vector2D> collection0 = monotoneChain0.findHullVertices(linkedList0);
      assertTrue(collection0.contains(vector2D2));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Vector2D> linkedList0 = new LinkedList<Vector2D>();
      S1Point s1Point0 = new S1Point(0.0);
      Vector2D vector2D0 = s1Point0.getVector();
      Vector2D vector2D1 = Vector2D.ZERO;
      linkedList0.add(vector2D0);
      Vector2D vector2D2 = Vector2D.NEGATIVE_INFINITY;
      linkedList0.add(vector2D2);
      linkedList0.add(vector2D1);
      MonotoneChain monotoneChain0 = new MonotoneChain(true);
      Collection<Vector2D> collection0 = monotoneChain0.findHullVertices(linkedList0);
      Collection<Vector2D> collection1 = monotoneChain0.findHullVertices(collection0);
      assertFalse(collection1.equals((Object)collection0));
      assertTrue(collection1.contains(vector2D1));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MonotoneChain monotoneChain0 = new MonotoneChain();
      LinkedList<Vector2D> linkedList0 = new LinkedList<Vector2D>();
      Vector2D vector2D0 = new Vector2D(2.85040095144011776E17, 1.0);
      linkedList0.add(vector2D0);
      S1Point s1Point0 = new S1Point(0.0);
      Vector2D vector2D1 = s1Point0.getVector();
      linkedList0.add(vector2D1);
      linkedList0.add(vector2D1);
      Collection<Vector2D> collection0 = monotoneChain0.findHullVertices(linkedList0);
      assertTrue(collection0.contains(vector2D1));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<Vector2D> linkedList0 = new LinkedList<Vector2D>();
      Vector2D vector2D0 = Vector2D.NaN;
      linkedList0.add(vector2D0);
      Vector2D vector2D1 = new Vector2D(448.8638793998205, 448.8638793998205);
      linkedList0.add(vector2D1);
      linkedList0.add(vector2D1);
      linkedList0.add(vector2D1);
      MonotoneChain monotoneChain0 = new MonotoneChain();
      Collection<Vector2D> collection0 = monotoneChain0.findHullVertices(linkedList0);
      assertTrue(collection0.contains(vector2D0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MonotoneChain monotoneChain0 = new MonotoneChain();
      LinkedList<Vector2D> linkedList0 = new LinkedList<Vector2D>();
      Vector2D vector2D0 = new Vector2D(2.85040095144011776E17, 1.0);
      Vector2D vector2D1 = new Vector2D(1.0, vector2D0, 1.0, vector2D0);
      linkedList0.add(vector2D1);
      S1Point s1Point0 = new S1Point(0.0);
      Vector2D vector2D2 = s1Point0.getVector();
      linkedList0.add(vector2D2);
      linkedList0.add(vector2D0);
      Collection<Vector2D> collection0 = monotoneChain0.findHullVertices(linkedList0);
      assertTrue(collection0.contains(vector2D0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MonotoneChain monotoneChain0 = new MonotoneChain();
      LinkedList<Vector2D> linkedList0 = new LinkedList<Vector2D>();
      Vector2D vector2D0 = new Vector2D(2.85040095144011776E17, 1.0);
      linkedList0.add(vector2D0);
      linkedList0.add(vector2D0);
      Collection<Vector2D> collection0 = monotoneChain0.findHullVertices(linkedList0);
      assertTrue(collection0.contains(vector2D0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Vector2D> linkedList0 = new LinkedList<Vector2D>();
      MonotoneChain monotoneChain0 = new MonotoneChain();
      // Undeclared exception!
      try { 
        monotoneChain0.findHullVertices(linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -2
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
