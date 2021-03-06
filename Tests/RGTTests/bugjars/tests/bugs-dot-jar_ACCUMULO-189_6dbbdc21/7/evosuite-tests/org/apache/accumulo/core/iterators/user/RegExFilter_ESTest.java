/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 25 20:44:25 GMT 2019
 */

package org.apache.accumulo.core.iterators.user;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.apache.accumulo.core.client.IteratorSetting;
import org.apache.accumulo.core.data.Key;
import org.apache.accumulo.core.data.Value;
import org.apache.accumulo.core.iterators.FirstEntryInRowIterator;
import org.apache.accumulo.core.iterators.IteratorEnvironment;
import org.apache.accumulo.core.iterators.IteratorUtil;
import org.apache.accumulo.core.iterators.OptionDescriber;
import org.apache.accumulo.core.iterators.SortedKeyValueIterator;
import org.apache.accumulo.core.iterators.user.RegExFilter;
import org.apache.hadoop.io.Text;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegExFilter_ESTest extends RegExFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RegExFilter regExFilter0 = new RegExFilter();
      TreeMap<String, String> treeMap0 = new TreeMap<String, String>();
      boolean boolean0 = regExFilter0.validateOptions(treeMap0);
      assertTrue(boolean0);
      
      org.apache.accumulo.core.iterators.WholeRowIterator wholeRowIterator0 = new org.apache.accumulo.core.iterators.WholeRowIterator();
      IteratorEnvironment iteratorEnvironment0 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      treeMap0.floorEntry("docFamily");
      SortedKeyValueIterator<Key, Value> sortedKeyValueIterator0 = wholeRowIterator0.deepCopy(iteratorEnvironment0);
      IteratorEnvironment iteratorEnvironment1 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(sortedKeyValueIterator0, treeMap0, iteratorEnvironment1);
      IteratorEnvironment iteratorEnvironment2 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      treeMap0.put("rowRegex", "colqRegex");
      IteratorEnvironment iteratorEnvironment3 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      wholeRowIterator0.init(regExFilter0, treeMap0, iteratorEnvironment3);
      regExFilter0.init(wholeRowIterator0, treeMap0, iteratorEnvironment2);
      IteratorEnvironment iteratorEnvironment4 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(sortedKeyValueIterator0, treeMap0, iteratorEnvironment4);
      IteratorEnvironment iteratorEnvironment5 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      wholeRowIterator0.deepCopy(iteratorEnvironment5);
      IteratorEnvironment iteratorEnvironment6 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(wholeRowIterator0, treeMap0, iteratorEnvironment6);
      IteratorEnvironment iteratorEnvironment7 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(sortedKeyValueIterator0, treeMap0, iteratorEnvironment7);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)17;
      Key key0 = new Key(byteArray0, byteArray0, byteArray0, byteArray0, 0L);
      boolean boolean1 = regExFilter0.accept(key0, (Value) null);
      assertFalse(boolean1);
      
      boolean boolean2 = regExFilter0.accept(key0, (Value) null);
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegExFilter regExFilter0 = new RegExFilter();
      TreeMap<String, String> treeMap0 = new TreeMap<String, String>();
      regExFilter0.validateOptions(treeMap0);
      org.apache.accumulo.core.iterators.WholeRowIterator wholeRowIterator0 = new org.apache.accumulo.core.iterators.WholeRowIterator();
      IteratorEnvironment iteratorEnvironment0 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      treeMap0.floorEntry("docFamily");
      SortedKeyValueIterator<Key, Value> sortedKeyValueIterator0 = wholeRowIterator0.deepCopy(iteratorEnvironment0);
      IteratorEnvironment iteratorEnvironment1 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(sortedKeyValueIterator0, treeMap0, iteratorEnvironment1);
      IteratorEnvironment iteratorEnvironment2 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      treeMap0.put("rowRegex", "colqRegex");
      IteratorEnvironment iteratorEnvironment3 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      wholeRowIterator0.init(regExFilter0, treeMap0, iteratorEnvironment3);
      regExFilter0.init(wholeRowIterator0, treeMap0, iteratorEnvironment2);
      IteratorEnvironment iteratorEnvironment4 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(sortedKeyValueIterator0, treeMap0, iteratorEnvironment4);
      treeMap0.put("encoding", "");
      IteratorEnvironment iteratorEnvironment5 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      wholeRowIterator0.deepCopy(iteratorEnvironment5);
      IteratorEnvironment iteratorEnvironment6 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(wholeRowIterator0, treeMap0, iteratorEnvironment6);
      IteratorEnvironment iteratorEnvironment7 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(sortedKeyValueIterator0, treeMap0, iteratorEnvironment7);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)17;
      Key key0 = new Key(byteArray0, byteArray0, byteArray0, byteArray0, 0L);
      // Undeclared exception!
      try { 
        regExFilter0.accept(key0, (Value) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.accumulo.core.iterators.user.RegExFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegExFilter regExFilter0 = new RegExFilter();
      TreeMap<String, String> treeMap0 = new TreeMap<String, String>();
      regExFilter0.validateOptions(treeMap0);
      org.apache.accumulo.core.iterators.WholeRowIterator wholeRowIterator0 = new org.apache.accumulo.core.iterators.WholeRowIterator();
      IteratorEnvironment iteratorEnvironment0 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      treeMap0.floorEntry("docFamily");
      SortedKeyValueIterator<Key, Value> sortedKeyValueIterator0 = wholeRowIterator0.deepCopy(iteratorEnvironment0);
      IteratorEnvironment iteratorEnvironment1 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(sortedKeyValueIterator0, treeMap0, iteratorEnvironment1);
      IteratorEnvironment iteratorEnvironment2 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      IteratorEnvironment iteratorEnvironment3 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      wholeRowIterator0.init(regExFilter0, treeMap0, iteratorEnvironment3);
      regExFilter0.init(wholeRowIterator0, treeMap0, iteratorEnvironment2);
      IteratorEnvironment iteratorEnvironment4 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(sortedKeyValueIterator0, treeMap0, iteratorEnvironment4);
      treeMap0.put("encoding", "T");
      IteratorEnvironment iteratorEnvironment5 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      wholeRowIterator0.deepCopy(iteratorEnvironment5);
      IteratorEnvironment iteratorEnvironment6 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(wholeRowIterator0, treeMap0, iteratorEnvironment6);
      IteratorEnvironment iteratorEnvironment7 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      IteratorEnvironment iteratorEnvironment8 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(wholeRowIterator0, treeMap0, iteratorEnvironment8);
      regExFilter0.init(sortedKeyValueIterator0, treeMap0, iteratorEnvironment7);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)17;
      SortedKeyValueIterator<Key, Value> sortedKeyValueIterator1 = regExFilter0.deepCopy((IteratorEnvironment) null);
      assertNotSame(regExFilter0, sortedKeyValueIterator1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegExFilter regExFilter0 = new RegExFilter();
      OptionDescriber.IteratorOptions optionDescriber_IteratorOptions0 = regExFilter0.describeOptions();
      assertEquals("The RegExFilter/Iterator allows you to filter for key/value pairs based on regular expressions", optionDescriber_IteratorOptions0.getDescription());
      assertEquals("regex", optionDescriber_IteratorOptions0.getName());
      
      Class<org.apache.accumulo.core.iterators.IntersectingIterator> class0 = org.apache.accumulo.core.iterators.IntersectingIterator.class;
      IteratorUtil.IteratorScope iteratorUtil_IteratorScope0 = IteratorUtil.IteratorScope.minc;
      IteratorUtil.IteratorScope iteratorUtil_IteratorScope1 = IteratorUtil.IteratorScope.minc;
      EnumSet<IteratorUtil.IteratorScope> enumSet0 = EnumSet.of(iteratorUtil_IteratorScope0, iteratorUtil_IteratorScope0, iteratorUtil_IteratorScope0, iteratorUtil_IteratorScope1);
      IteratorSetting iteratorSetting0 = new IteratorSetting(857, class0, enumSet0, optionDescriber_IteratorOptions0.namedOptions);
      enumSet0.add(iteratorUtil_IteratorScope1);
      iteratorSetting0.setPriority(857);
      enumSet0.add(iteratorUtil_IteratorScope1);
      iteratorSetting0.setProperties(optionDescriber_IteratorOptions0.namedOptions);
      RegExFilter.setRegexs(iteratorSetting0, "valueRegex", "regex", "", "rowRegex", false);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      IteratorEnvironment iteratorEnvironment0 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init((SortedKeyValueIterator<Key, Value>) null, optionDescriber_IteratorOptions0.namedOptions, iteratorEnvironment0);
      IteratorSetting iteratorSetting1 = new IteratorSetting(857, class0, enumSet0, optionDescriber_IteratorOptions0.namedOptions);
      RegExFilter.setRegexs(iteratorSetting1, "orFields", "JS6S<O1", "encoding", (String) null, false);
      assertEquals("regex", optionDescriber_IteratorOptions0.getName());
      assertEquals("The RegExFilter/Iterator allows you to filter for key/value pairs based on regular expressions", optionDescriber_IteratorOptions0.getDescription());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegExFilter regExFilter0 = new RegExFilter();
      TreeMap<String, String> treeMap0 = new TreeMap<String, String>();
      regExFilter0.validateOptions(treeMap0);
      org.apache.accumulo.core.iterators.WholeRowIterator wholeRowIterator0 = new org.apache.accumulo.core.iterators.WholeRowIterator();
      IteratorEnvironment iteratorEnvironment0 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      treeMap0.floorEntry("docFamily");
      SortedKeyValueIterator<Key, Value> sortedKeyValueIterator0 = wholeRowIterator0.deepCopy(iteratorEnvironment0);
      IteratorEnvironment iteratorEnvironment1 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(sortedKeyValueIterator0, treeMap0, iteratorEnvironment1);
      IteratorEnvironment iteratorEnvironment2 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      IteratorEnvironment iteratorEnvironment3 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      wholeRowIterator0.init(regExFilter0, treeMap0, iteratorEnvironment3);
      regExFilter0.init(wholeRowIterator0, treeMap0, iteratorEnvironment2);
      Class<org.apache.accumulo.core.iterators.IntersectingIterator> class0 = org.apache.accumulo.core.iterators.IntersectingIterator.class;
      IteratorEnvironment iteratorEnvironment4 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(sortedKeyValueIterator0, treeMap0, iteratorEnvironment4);
      IteratorSetting iteratorSetting0 = new IteratorSetting(2031, class0);
      treeMap0.put("encoding", "T");
      RegExFilter.setRegexs(iteratorSetting0, "orFields", "orFields", "rowRegex", "UTF-8", true);
      IteratorEnvironment iteratorEnvironment5 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      wholeRowIterator0.deepCopy(iteratorEnvironment5);
      RegExFilter.setEncoding(iteratorSetting0, "orFields");
      IteratorEnvironment iteratorEnvironment6 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(wholeRowIterator0, treeMap0, iteratorEnvironment6);
      IteratorEnvironment iteratorEnvironment7 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(sortedKeyValueIterator0, treeMap0, iteratorEnvironment7);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)17;
      Key key0 = new Key(byteArray0, byteArray0, byteArray0, byteArray0, 0L);
      RegExFilter.setEncoding(iteratorSetting0, "encoding");
      // Undeclared exception!
      try { 
        regExFilter0.accept(key0, (Value) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.accumulo.core.iterators.user.RegExFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IteratorEnvironment iteratorEnvironment0 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      int int0 = 132;
      String string0 = ")b8M";
      RegExFilter regExFilter0 = new RegExFilter();
      // Undeclared exception!
      try { 
        regExFilter0.init((SortedKeyValueIterator<Key, Value>) null, (Map<String, String>) null, iteratorEnvironment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.accumulo.core.iterators.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegExFilter regExFilter0 = new RegExFilter();
      TreeMap<String, String> treeMap0 = new TreeMap<String, String>();
      treeMap0.put("encoding", "UTF-8");
      regExFilter0.validateOptions(treeMap0);
      OptionDescriber.IteratorOptions optionDescriber_IteratorOptions0 = regExFilter0.describeOptions();
      assertEquals("The RegExFilter/Iterator allows you to filter for key/value pairs based on regular expressions", optionDescriber_IteratorOptions0.getDescription());
      assertEquals("regex", optionDescriber_IteratorOptions0.getName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegExFilter regExFilter0 = new RegExFilter();
      HashMap<String, String> hashMap0 = new HashMap<String, String>(382);
      IteratorEnvironment iteratorEnvironment0 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(regExFilter0, hashMap0, iteratorEnvironment0);
      IteratorEnvironment iteratorEnvironment1 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.deepCopy(iteratorEnvironment1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegExFilter regExFilter0 = new RegExFilter();
      // Undeclared exception!
      try { 
        regExFilter0.validateOptions((Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.accumulo.core.iterators.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegExFilter regExFilter0 = new RegExFilter();
      OptionDescriber.IteratorOptions optionDescriber_IteratorOptions0 = regExFilter0.describeOptions();
      IteratorEnvironment iteratorEnvironment0 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init((SortedKeyValueIterator<Key, Value>) null, optionDescriber_IteratorOptions0.namedOptions, iteratorEnvironment0);
      Text text0 = null;
      Key key0 = null;
      try {
        key0 = new Key((Text) null, (Text) null, (Text) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.accumulo.core.data.Key", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegExFilter regExFilter0 = new RegExFilter();
      OptionDescriber.IteratorOptions optionDescriber_IteratorOptions0 = regExFilter0.describeOptions();
      boolean boolean0 = regExFilter0.validateOptions(optionDescriber_IteratorOptions0.namedOptions);
      assertFalse(boolean0);
      
      Class<org.apache.accumulo.core.iterators.IntersectingIterator> class0 = org.apache.accumulo.core.iterators.IntersectingIterator.class;
      IteratorUtil.IteratorScope iteratorUtil_IteratorScope0 = IteratorUtil.IteratorScope.majc;
      IteratorUtil.IteratorScope iteratorUtil_IteratorScope1 = IteratorUtil.IteratorScope.scan;
      EnumSet<IteratorUtil.IteratorScope> enumSet0 = EnumSet.of(iteratorUtil_IteratorScope0, iteratorUtil_IteratorScope0, iteratorUtil_IteratorScope0, iteratorUtil_IteratorScope1);
      enumSet0.add(iteratorUtil_IteratorScope1);
      IteratorSetting iteratorSetting0 = new IteratorSetting(2064, class0, enumSet0, optionDescriber_IteratorOptions0.namedOptions);
      EnumSet<IteratorUtil.IteratorScope> enumSet1 = iteratorSetting0.getScopes();
      IteratorSetting iteratorSetting1 = new IteratorSetting(2064, "Client mechanism is malformed", "valueRegex", enumSet1, optionDescriber_IteratorOptions0.namedOptions);
      RegExFilter.setRegexs(iteratorSetting1, "", "colfRegex", "orFields", "colfRegex", false);
      assertEquals("regex", optionDescriber_IteratorOptions0.getName());
      assertEquals("The RegExFilter/Iterator allows you to filter for key/value pairs based on regular expressions", optionDescriber_IteratorOptions0.getDescription());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IteratorSetting iteratorSetting0 = null;
      // Undeclared exception!
      try { 
        RegExFilter.setEncoding((IteratorSetting) null, "{mh'");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.accumulo.core.iterators.user.RegExFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegExFilter regExFilter0 = new RegExFilter();
      TreeMap<String, String> treeMap0 = new TreeMap<String, String>();
      regExFilter0.validateOptions(treeMap0);
      org.apache.accumulo.core.iterators.WholeRowIterator wholeRowIterator0 = new org.apache.accumulo.core.iterators.WholeRowIterator();
      IteratorEnvironment iteratorEnvironment0 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      treeMap0.floorEntry("docFamily");
      SortedKeyValueIterator<Key, Value> sortedKeyValueIterator0 = wholeRowIterator0.deepCopy(iteratorEnvironment0);
      IteratorEnvironment iteratorEnvironment1 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(sortedKeyValueIterator0, treeMap0, iteratorEnvironment1);
      IteratorEnvironment iteratorEnvironment2 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      IteratorEnvironment iteratorEnvironment3 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      wholeRowIterator0.init(regExFilter0, treeMap0, iteratorEnvironment3);
      regExFilter0.init(wholeRowIterator0, treeMap0, iteratorEnvironment2);
      Class<org.apache.accumulo.core.iterators.IntersectingIterator> class0 = org.apache.accumulo.core.iterators.IntersectingIterator.class;
      IteratorSetting iteratorSetting0 = new IteratorSetting(2031, class0);
      treeMap0.put("encoding", "");
      RegExFilter.setRegexs(iteratorSetting0, "orFields", "orFields", "rowRegex", "UTF-8", true);
      RegExFilter.setEncoding(iteratorSetting0, "orFields");
      IteratorEnvironment iteratorEnvironment4 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(wholeRowIterator0, treeMap0, iteratorEnvironment4);
      IteratorEnvironment iteratorEnvironment5 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(sortedKeyValueIterator0, treeMap0, iteratorEnvironment5);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)17;
      Key key0 = new Key(byteArray0, byteArray0, byteArray0, byteArray0, 0L);
      // Undeclared exception!
      try { 
        regExFilter0.accept(key0, (Value) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.accumulo.core.iterators.user.RegExFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IteratorSetting iteratorSetting0 = null;
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        RegExFilter.setRegexs((IteratorSetting) null, "y<N6rJ;KF.k=el[4[X", "y<N6rJ;KF.k=el[4[X", "y<N6rJ;KF.k=el[4[X", "Rm6><m", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.accumulo.core.iterators.user.RegExFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegExFilter regExFilter0 = new RegExFilter();
      Class<org.apache.accumulo.core.iterators.IntersectingIterator> class0 = org.apache.accumulo.core.iterators.IntersectingIterator.class;
      IteratorSetting iteratorSetting0 = new IteratorSetting(2247, "valueRegex", class0);
      iteratorSetting0.setIteratorClass("+kiLg2i,*1d=");
      RegExFilter.setRegexs(iteratorSetting0, (String) null, "rowRegex", "", "", false);
      Class<org.apache.accumulo.core.iterators.IntersectingIterator> class1 = org.apache.accumulo.core.iterators.IntersectingIterator.class;
      IteratorSetting iteratorSetting1 = new IteratorSetting(2247, "+kiLg2i,*1d=", class1);
      // Undeclared exception!
      try { 
        RegExFilter.setEncoding(iteratorSetting1, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<org.apache.accumulo.core.iterators.IntersectingIterator> class0 = org.apache.accumulo.core.iterators.IntersectingIterator.class;
      IteratorSetting iteratorSetting0 = new IteratorSetting(71, "pjPg,5", class0);
      RegExFilter.setRegexs(iteratorSetting0, "ox*RgT.q]", "io.serializations", (String) null, "UTF-8 not supported!", false);
      assertTrue(iteratorSetting0.hasProperties());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<org.apache.accumulo.core.iterators.IntersectingIterator> class0 = org.apache.accumulo.core.iterators.IntersectingIterator.class;
      IteratorUtil.IteratorScope iteratorUtil_IteratorScope0 = IteratorUtil.IteratorScope.minc;
      IteratorUtil.IteratorScope iteratorUtil_IteratorScope1 = IteratorUtil.IteratorScope.minc;
      EnumSet<IteratorUtil.IteratorScope> enumSet0 = EnumSet.of(iteratorUtil_IteratorScope0, iteratorUtil_IteratorScope0, iteratorUtil_IteratorScope1);
      TreeMap<String, String> treeMap0 = new TreeMap<String, String>();
      IteratorSetting iteratorSetting0 = new IteratorSetting(3288, class0, enumSet0, treeMap0);
      RegExFilter.setRegexs(iteratorSetting0, "org.apache.accumulo.core.iterators.user.RegExFilter", (String) null, "org.apache.accumulo.core.iterators.user.RegExFilter", "org.apache.accumulo.core.iterators.user.RegExFilter", true);
      assertEquals(3288, iteratorSetting0.getPriority());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegExFilter regExFilter0 = new RegExFilter();
      IteratorEnvironment iteratorEnvironment0 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        regExFilter0.deepCopy(iteratorEnvironment0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // getting null source
         //
         verifyException("org.apache.accumulo.core.iterators.WrappingIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IteratorSetting iteratorSetting0 = new IteratorSetting(479, "", "S}pM)C@hvU=zZ//*_pU");
      RegExFilter.setEncoding(iteratorSetting0, "s@-S8M^P'Z5d%");
      assertTrue(iteratorSetting0.hasProperties());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RegExFilter regExFilter0 = new RegExFilter();
      IteratorEnvironment iteratorEnvironment0 = null;
      // Undeclared exception!
      try { 
        regExFilter0.deepCopy((IteratorEnvironment) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // getting null source
         //
         verifyException("org.apache.accumulo.core.iterators.WrappingIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RegExFilter regExFilter0 = new RegExFilter();
      IteratorSetting iteratorSetting0 = new IteratorSetting(2247, "valueRegex", "encoding");
      iteratorSetting0.setIteratorClass("+kiLg2i,*1d=");
      RegExFilter.setEncoding(iteratorSetting0, "");
      RegExFilter.setRegexs(iteratorSetting0, (String) null, "rowRegex", "", "", true);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      IteratorSetting iteratorSetting1 = null;
      try {
        iteratorSetting1 = new IteratorSetting(2247, "colqRegex", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // argument was null:Is null- arg1? true
         //
         verifyException("org.apache.accumulo.core.util.ArgumentChecker", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RegExFilter regExFilter0 = new RegExFilter();
      FirstEntryInRowIterator firstEntryInRowIterator0 = new FirstEntryInRowIterator();
      OptionDescriber.IteratorOptions optionDescriber_IteratorOptions0 = regExFilter0.describeOptions();
      boolean boolean0 = regExFilter0.validateOptions(optionDescriber_IteratorOptions0.namedOptions);
      assertFalse(boolean0);
      assertEquals("The RegExFilter/Iterator allows you to filter for key/value pairs based on regular expressions", optionDescriber_IteratorOptions0.getDescription());
      assertEquals("regex", optionDescriber_IteratorOptions0.getName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RegExFilter regExFilter0 = new RegExFilter();
      OptionDescriber.IteratorOptions optionDescriber_IteratorOptions0 = regExFilter0.describeOptions();
      Class<org.apache.accumulo.core.iterators.IntersectingIterator> class0 = org.apache.accumulo.core.iterators.IntersectingIterator.class;
      IteratorUtil.IteratorScope iteratorUtil_IteratorScope0 = IteratorUtil.IteratorScope.minc;
      IteratorUtil.IteratorScope iteratorUtil_IteratorScope1 = IteratorUtil.IteratorScope.minc;
      EnumSet<IteratorUtil.IteratorScope> enumSet0 = EnumSet.of(iteratorUtil_IteratorScope0, iteratorUtil_IteratorScope0, iteratorUtil_IteratorScope0, iteratorUtil_IteratorScope1);
      IteratorSetting iteratorSetting0 = new IteratorSetting(857, class0, enumSet0, optionDescriber_IteratorOptions0.namedOptions);
      enumSet0.add(iteratorUtil_IteratorScope1);
      iteratorSetting0.setPriority(857);
      enumSet0.add(iteratorUtil_IteratorScope1);
      iteratorSetting0.setProperties(optionDescriber_IteratorOptions0.namedOptions);
      RegExFilter.setRegexs(iteratorSetting0, "rowRegex", "M?'yHdO#L7*Al9z2", (String) null, "rowRegex", true);
      RegExFilter.setRegexs(iteratorSetting0, "valueRegex", "regex", "", "rowRegex", false);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      IteratorEnvironment iteratorEnvironment0 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init((SortedKeyValueIterator<Key, Value>) null, optionDescriber_IteratorOptions0.namedOptions, iteratorEnvironment0);
      IteratorSetting iteratorSetting1 = new IteratorSetting(857, class0, enumSet0, optionDescriber_IteratorOptions0.namedOptions);
      RegExFilter.setRegexs(iteratorSetting1, "orFields", "JS6S<O1", "encoding", (String) null, false);
      regExFilter0.describeOptions();
      RegExFilter.setEncoding(iteratorSetting1, "UTF-8");
      assertEquals("regex", optionDescriber_IteratorOptions0.getName());
      assertEquals("The RegExFilter/Iterator allows you to filter for key/value pairs based on regular expressions", optionDescriber_IteratorOptions0.getDescription());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<org.apache.accumulo.core.iterators.IntersectingIterator> class0 = org.apache.accumulo.core.iterators.IntersectingIterator.class;
      IteratorUtil.IteratorScope iteratorUtil_IteratorScope0 = IteratorUtil.IteratorScope.minc;
      IteratorUtil.IteratorScope iteratorUtil_IteratorScope1 = IteratorUtil.IteratorScope.minc;
      EnumSet<IteratorUtil.IteratorScope> enumSet0 = EnumSet.of(iteratorUtil_IteratorScope0, iteratorUtil_IteratorScope0, iteratorUtil_IteratorScope1);
      TreeMap<String, String> treeMap0 = new TreeMap<String, String>();
      IteratorSetting iteratorSetting0 = new IteratorSetting(3288, class0, enumSet0, treeMap0);
      RegExFilter.setRegexs(iteratorSetting0, "org.apache.accumulo.core.iterators.user.RegExFilter", (String) null, "org.apache.accumulo.core.iterators.user.RegExFilter", "org.apache.accumulo.core.iterators.user.RegExFilter", false);
      RegExFilter regExFilter0 = new RegExFilter();
      IteratorEnvironment iteratorEnvironment0 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      IteratorEnvironment iteratorEnvironment1 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        regExFilter0.deepCopy(iteratorEnvironment1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // getting null source
         //
         verifyException("org.apache.accumulo.core.iterators.WrappingIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RegExFilter regExFilter0 = new RegExFilter();
      Key key0 = new Key("colqRegex");
      // Undeclared exception!
      try { 
        regExFilter0.accept(key0, (Value) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.accumulo.core.iterators.user.RegExFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RegExFilter regExFilter0 = new RegExFilter();
      TreeMap<String, String> treeMap0 = new TreeMap<String, String>();
      regExFilter0.validateOptions(treeMap0);
      org.apache.accumulo.core.iterators.WholeRowIterator wholeRowIterator0 = new org.apache.accumulo.core.iterators.WholeRowIterator();
      IteratorEnvironment iteratorEnvironment0 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      treeMap0.floorEntry("docFamily");
      SortedKeyValueIterator<Key, Value> sortedKeyValueIterator0 = wholeRowIterator0.deepCopy(iteratorEnvironment0);
      IteratorEnvironment iteratorEnvironment1 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(sortedKeyValueIterator0, treeMap0, iteratorEnvironment1);
      IteratorEnvironment iteratorEnvironment2 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      treeMap0.put("rowRegex", "colqRegex");
      IteratorEnvironment iteratorEnvironment3 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      wholeRowIterator0.init(regExFilter0, treeMap0, iteratorEnvironment3);
      regExFilter0.init(wholeRowIterator0, treeMap0, iteratorEnvironment2);
      IteratorEnvironment iteratorEnvironment4 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(sortedKeyValueIterator0, treeMap0, iteratorEnvironment4);
      treeMap0.put("encoding", "encoding");
      IteratorEnvironment iteratorEnvironment5 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      wholeRowIterator0.deepCopy(iteratorEnvironment5);
      IteratorEnvironment iteratorEnvironment6 = mock(IteratorEnvironment.class, new ViolatedAssumptionAnswer());
      regExFilter0.init(sortedKeyValueIterator0, treeMap0, iteratorEnvironment6);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)17;
      Key key0 = new Key(byteArray0, byteArray0, byteArray0, byteArray0, 0L);
      // Undeclared exception!
      try { 
        regExFilter0.accept(key0, (Value) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.accumulo.core.iterators.user.RegExFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IteratorSetting iteratorSetting0 = null;
      String string0 = "Q";
      // Undeclared exception!
      try { 
        RegExFilter.setEncoding((IteratorSetting) null, "Q");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.accumulo.core.iterators.user.RegExFilter", e);
      }
  }
}
