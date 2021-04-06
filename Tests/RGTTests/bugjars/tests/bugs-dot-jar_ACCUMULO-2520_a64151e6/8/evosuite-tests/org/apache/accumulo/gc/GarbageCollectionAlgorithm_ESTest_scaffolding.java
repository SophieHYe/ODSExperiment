/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Dec 27 18:04:18 GMT 2019
 */

package org.apache.accumulo.gc;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class GarbageCollectionAlgorithm_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.accumulo.gc.GarbageCollectionAlgorithm"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "ANSI_X3.4-1968"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/home/wasp/Desktop/research/evosuite-bugjar/tests/bugs-dot-jar_ACCUMULO-2520_a64151e6/8"); 
    java.lang.System.setProperty("user.home", "/home/wasp"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "wasp"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(GarbageCollectionAlgorithm_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.accumulo.core.metadata.schema.MetadataSchema$TabletsSection$LastLocationColumnFamily",
      "org.apache.accumulo.core.data.ByteSequence",
      "org.apache.accumulo.gc.GarbageCollectionAlgorithm",
      "org.apache.accumulo.core.data.Value$Comparator",
      "org.apache.accumulo.core.metadata.schema.MetadataSchema$TabletsSection$ServerColumnFamily",
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.hadoop.io.Text",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.hadoop.io.Writable",
      "org.apache.accumulo.core.data.ArrayByteSequence",
      "org.apache.accumulo.core.data.Mutation",
      "org.apache.log4j.or.RendererMap",
      "org.apache.accumulo.core.client.TableNotFoundException",
      "org.apache.hadoop.io.BytesWritable$Comparator",
      "org.apache.log4j.Logger",
      "org.apache.accumulo.core.client.NamespaceNotFoundException",
      "org.apache.hadoop.io.Text$Comparator",
      "org.apache.log4j.Level",
      "org.apache.accumulo.core.metadata.schema.MetadataSchema$TabletsSection$ClonedColumnFamily",
      "org.apache.accumulo.core.metadata.schema.MetadataSchema$TabletsSection$ChoppedColumnFamily",
      "org.apache.accumulo.core.data.Value",
      "org.apache.accumulo.core.metadata.schema.MetadataSchema$Section",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "org.apache.accumulo.core.security.ColumnVisibility$Node",
      "org.apache.accumulo.core.metadata.schema.MetadataSchema$TabletsSection",
      "org.apache.accumulo.core.data.Column",
      "org.apache.accumulo.core.security.ColumnVisibility$NodeType",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.accumulo.core.metadata.schema.MetadataSchema$TabletsSection$CurrentLocationColumnFamily",
      "org.apache.log4j.spi.Filter",
      "org.apache.accumulo.core.client.ScannerBase",
      "org.apache.accumulo.core.metadata.schema.MetadataSchema",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.spi.Configurator",
      "org.apache.log4j.Layout",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.accumulo.core.util.ByteBufferUtil",
      "org.apache.log4j.spi.LocationInfo",
      "org.apache.log4j.PropertyWatchdog",
      "org.apache.accumulo.core.metadata.schema.MetadataSchema$TabletsSection$BulkFileColumnFamily",
      "org.apache.log4j.spi.ThrowableRendererSupport",
      "org.apache.hadoop.io.WritableComparable",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.hadoop.io.BinaryComparable",
      "org.apache.log4j.helpers.Loader",
      "org.apache.hadoop.io.WritableComparator",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.spi.ThrowableRenderer",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.helpers.FileWatchdog",
      "org.apache.log4j.Appender",
      "org.apache.accumulo.core.client.AccumuloSecurityException",
      "org.apache.accumulo.core.data.Key",
      "org.apache.accumulo.core.metadata.schema.MetadataSchema$TabletsSection$LogColumnFamily",
      "org.apache.hadoop.io.BytesWritable",
      "org.apache.accumulo.core.security.ColumnVisibility$NodeComparator",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.OptionHandler",
      "org.apache.log4j.spi.HierarchyEventListener",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.accumulo.core.util.ColumnFQ",
      "org.apache.hadoop.io.Text$2",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.log4j.spi.ErrorHandler",
      "org.apache.log4j.spi.LoggingEvent",
      "org.apache.accumulo.core.metadata.schema.MetadataSchema$TabletsSection$FutureLocationColumnFamily",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.accumulo.core.client.AccumuloException",
      "org.apache.accumulo.core.metadata.schema.MetadataSchema$TabletsSection$ScanFileColumnFamily",
      "org.apache.accumulo.core.data.Range",
      "org.apache.log4j.spi.ThrowableInformation",
      "org.apache.accumulo.core.client.IteratorSetting",
      "org.apache.hadoop.io.RawComparator",
      "org.apache.log4j.Priority",
      "org.apache.accumulo.core.security.ColumnVisibility",
      "org.apache.hadoop.io.Text$1",
      "org.apache.accumulo.gc.GarbageCollectionEnvironment",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.accumulo.core.data.PartialKey",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.accumulo.core.metadata.schema.MetadataSchema$TabletsSection$DataFileColumnFamily"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.accumulo.gc.GarbageCollectionEnvironment", false, GarbageCollectionAlgorithm_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(GarbageCollectionAlgorithm_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "org.apache.accumulo.gc.GarbageCollectionAlgorithm",
      "org.apache.hadoop.io.BinaryComparable",
      "org.apache.hadoop.io.Text$1",
      "org.apache.hadoop.io.Text$2",
      "org.apache.hadoop.io.WritableComparator",
      "org.apache.hadoop.io.Text$Comparator",
      "org.apache.hadoop.io.Text",
      "org.apache.accumulo.core.metadata.schema.MetadataSchema$TabletsSection$DataFileColumnFamily",
      "org.apache.accumulo.core.metadata.schema.MetadataSchema$TabletsSection$ScanFileColumnFamily",
      "org.apache.accumulo.core.util.ColumnFQ",
      "org.apache.accumulo.core.metadata.schema.MetadataSchema$TabletsSection$ServerColumnFamily",
      "org.apache.accumulo.core.data.Value$Comparator",
      "org.apache.hadoop.io.BytesWritable$Comparator",
      "org.apache.accumulo.core.data.Value",
      "org.apache.accumulo.core.util.ByteBufferUtil"
    );
  }
}