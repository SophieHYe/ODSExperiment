/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 27 18:46:13 GMT 2019
 */

package org.apache.accumulo.minicluster;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileNotFoundException;
import org.apache.accumulo.minicluster.MiniAccumuloCluster;
import org.apache.accumulo.minicluster.MiniAccumuloConfig;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MiniAccumuloCluster_ESTest extends MiniAccumuloCluster_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MiniAccumuloCluster miniAccumuloCluster0 = null;
      try {
        miniAccumuloCluster0 = new MiniAccumuloCluster((MiniAccumuloConfig) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.accumulo.minicluster.MiniAccumuloCluster", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      mockFile0.setReadOnly();
      MiniAccumuloConfig miniAccumuloConfig0 = new MiniAccumuloConfig(mockFile0, "");
      MiniAccumuloCluster miniAccumuloCluster0 = null;
      try {
        miniAccumuloCluster0 = new MiniAccumuloCluster(miniAccumuloConfig0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MiniAccumuloCluster miniAccumuloCluster0 = null;
      try {
        miniAccumuloCluster0 = new MiniAccumuloCluster((File) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.accumulo.minicluster.MiniAccumuloCluster", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      MiniAccumuloConfig miniAccumuloConfig0 = new MiniAccumuloConfig(mockFile0, "");
      MiniAccumuloCluster miniAccumuloCluster0 = null;
      try {
        miniAccumuloCluster0 = new MiniAccumuloCluster(miniAccumuloConfig0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.accumulo.core.Constants
         //
         verifyException("org.apache.accumulo.minicluster.MiniAccumuloCluster", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockFile mockFile0 = new MockFile("P@UL3bR:=f08},_TZ G", "P@UL3bR:=f08},_TZ G");
      MiniAccumuloConfig miniAccumuloConfig0 = new MiniAccumuloConfig(mockFile0, "P@UL3bR:=f08},_TZ G");
      MiniAccumuloCluster miniAccumuloCluster0 = null;
      try {
        miniAccumuloCluster0 = new MiniAccumuloCluster(miniAccumuloConfig0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.accumulo.core.Constants
         //
         verifyException("org.apache.accumulo.minicluster.MiniAccumuloCluster", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      File file0 = MockFile.createTempFile(".password", ".password");
      MiniAccumuloConfig miniAccumuloConfig0 = new MiniAccumuloConfig(file0, ".password");
      MiniAccumuloCluster miniAccumuloCluster0 = null;
      try {
        miniAccumuloCluster0 = new MiniAccumuloCluster(miniAccumuloConfig0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must pass in directory, /tmp/.password0.password is a file
         //
         verifyException("org.apache.accumulo.minicluster.MiniAccumuloCluster", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      MiniAccumuloConfig miniAccumuloConfig0 = new MiniAccumuloConfig(mockFile0, "");
      MiniAccumuloCluster miniAccumuloCluster0 = null;
      try {
        miniAccumuloCluster0 = new MiniAccumuloCluster(miniAccumuloConfig0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Directory / is not empty
         //
         verifyException("org.apache.accumulo.minicluster.MiniAccumuloCluster", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      MiniAccumuloCluster miniAccumuloCluster0 = null;
      try {
        miniAccumuloCluster0 = new MiniAccumuloCluster(mockFile0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Directory / is not empty
         //
         verifyException("org.apache.accumulo.minicluster.MiniAccumuloCluster", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      MiniAccumuloCluster miniAccumuloCluster0 = null;
      try {
        miniAccumuloCluster0 = new MiniAccumuloCluster(mockFile0, "");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.accumulo.core.Constants
         //
         verifyException("org.apache.accumulo.minicluster.MiniAccumuloCluster", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      File file0 = MockFile.createTempFile("java", "java");
      MockFile mockFile0 = new MockFile(file0, "].");
      MiniAccumuloCluster miniAccumuloCluster0 = null;
      try {
        miniAccumuloCluster0 = new MiniAccumuloCluster(mockFile0, "java");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }
}
