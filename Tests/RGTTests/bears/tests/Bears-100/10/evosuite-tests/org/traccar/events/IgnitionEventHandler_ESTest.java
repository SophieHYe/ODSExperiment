/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 09 22:31:15 GMT 2019
 */

package org.traccar.events;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.nio.channels.SocketChannel;
import java.util.Date;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jboss.netty.channel.ChannelHandler;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelState;
import org.jboss.netty.channel.DefaultChannelPipeline;
import org.jboss.netty.channel.DownstreamChannelStateEvent;
import org.jboss.netty.channel.SucceededChannelFuture;
import org.jboss.netty.channel.UpstreamChannelStateEvent;
import org.jboss.netty.channel.local.DefaultLocalClientChannelFactory;
import org.jboss.netty.channel.local.DefaultLocalServerChannelFactory;
import org.jboss.netty.channel.local.LocalChannel;
import org.junit.runner.RunWith;
import org.traccar.Context;
import org.traccar.database.IdentityManager;
import org.traccar.events.IgnitionEventHandler;
import org.traccar.model.Device;
import org.traccar.model.Event;
import org.traccar.model.Position;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IgnitionEventHandler_ESTest extends IgnitionEventHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IgnitionEventHandler ignitionEventHandler0 = new IgnitionEventHandler();
      Position position0 = new Position();
      String[] stringArray0 = new String[7];
      position0.setValid(true);
      stringArray0[0] = "fault";
      stringArray0[1] = "power";
      stringArray0[2] = "parking";
      stringArray0[3] = "parking";
      position0.setDeviceId(453L);
      stringArray0[4] = "movement";
      stringArray0[5] = "hours";
      // Undeclared exception!
      try { 
        ignitionEventHandler0.analyzePosition(position0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.traccar.events.IgnitionEventHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IgnitionEventHandler ignitionEventHandler0 = new IgnitionEventHandler();
      Position position0 = new Position();
      Event event0 = new Event();
      event0.setGeofenceId((-9223372036854775808L));
      event0.getServerTime();
      position0.setFixTime((Date) null);
      IdentityManager identityManager0 = mock(IdentityManager.class, new ViolatedAssumptionAnswer());
      doReturn((Device) null, (Device) null, (Device) null, (Device) null).when(identityManager0).getDeviceById(anyLong());
      Context.init(identityManager0);
      position0.setLongitude(0.0);
      position0.setSpeed(1282.77702);
      ignitionEventHandler0.analyzePosition(position0);
      ignitionEventHandler0.analyzePosition(position0);
      ignitionEventHandler0.analyzePosition(position0);
      ignitionEventHandler0.analyzePosition(position0);
      Position position1 = new Position();
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      defaultChannelPipeline0.getContext((ChannelHandler) ignitionEventHandler0);
      DefaultLocalServerChannelFactory defaultLocalServerChannelFactory0 = new DefaultLocalServerChannelFactory();
      defaultLocalServerChannelFactory0.newChannel(defaultChannelPipeline0);
      defaultChannelPipeline0.getSink();
      SocketChannel socketChannel0 = null;
      int int0 = 1;
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      LinkedBlockingQueue<Runnable> linkedBlockingQueue0 = new LinkedBlockingQueue<Runnable>();
      ThreadPoolExecutor.AbortPolicy threadPoolExecutor_AbortPolicy0 = new ThreadPoolExecutor.AbortPolicy();
      ThreadPoolExecutor threadPoolExecutor0 = null;
      try {
        threadPoolExecutor0 = new ThreadPoolExecutor(1, 1, (-9223372036854775808L), timeUnit0, linkedBlockingQueue0, (ThreadFactory) null, threadPoolExecutor_AbortPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IgnitionEventHandler ignitionEventHandler0 = new IgnitionEventHandler();
      Position position0 = new Position();
      // Undeclared exception!
      try { 
        ignitionEventHandler0.analyzePosition(position0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.traccar.events.IgnitionEventHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IgnitionEventHandler ignitionEventHandler0 = new IgnitionEventHandler();
      assertNotNull(ignitionEventHandler0);
      
      String[] stringArray0 = new String[3];
      stringArray0[0] = "+iN')yv";
      stringArray0[1] = "";
      stringArray0[2] = "~j{";
      try { 
        Context.init(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IgnitionEventHandler ignitionEventHandler0 = new IgnitionEventHandler();
      assertNotNull(ignitionEventHandler0);
      
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      assertFalse(defaultChannelPipeline0.isAttached());
      assertNotNull(defaultChannelPipeline0);
      
      ChannelHandlerContext channelHandlerContext0 = defaultChannelPipeline0.getContext((ChannelHandler) ignitionEventHandler0);
      assertFalse(defaultChannelPipeline0.isAttached());
      assertNull(channelHandlerContext0);
      
      DefaultLocalClientChannelFactory defaultLocalClientChannelFactory0 = new DefaultLocalClientChannelFactory();
      assertNotNull(defaultLocalClientChannelFactory0);
      
      LocalChannel localChannel0 = defaultLocalClientChannelFactory0.newChannel(defaultChannelPipeline0);
      assertTrue(defaultChannelPipeline0.isAttached());
      assertTrue(localChannel0.isOpen());
      assertEquals(1, (int)localChannel0.getId());
      assertTrue(localChannel0.isReadable());
      assertNotNull(localChannel0);
      
      SucceededChannelFuture succeededChannelFuture0 = new SucceededChannelFuture(localChannel0);
      assertTrue(defaultChannelPipeline0.isAttached());
      assertTrue(localChannel0.isOpen());
      assertEquals(1, (int)localChannel0.getId());
      assertTrue(localChannel0.isReadable());
      assertFalse(succeededChannelFuture0.cancel());
      assertFalse(succeededChannelFuture0.setSuccess());
      assertFalse(succeededChannelFuture0.isCancelled());
      assertTrue(succeededChannelFuture0.isDone());
      assertTrue(succeededChannelFuture0.isSuccess());
      assertNotNull(succeededChannelFuture0);
      
      ChannelState channelState0 = ChannelState.CONNECTED;
      DownstreamChannelStateEvent downstreamChannelStateEvent0 = new DownstreamChannelStateEvent(localChannel0, succeededChannelFuture0, channelState0, (Object) null);
      assertTrue(defaultChannelPipeline0.isAttached());
      assertTrue(localChannel0.isOpen());
      assertEquals(1, (int)localChannel0.getId());
      assertTrue(localChannel0.isReadable());
      assertFalse(succeededChannelFuture0.cancel());
      assertFalse(succeededChannelFuture0.setSuccess());
      assertFalse(succeededChannelFuture0.isCancelled());
      assertTrue(succeededChannelFuture0.isDone());
      assertTrue(succeededChannelFuture0.isSuccess());
      assertEquals(ChannelState.CONNECTED, downstreamChannelStateEvent0.getState());
      assertNotNull(downstreamChannelStateEvent0);
      
      try { 
        ignitionEventHandler0.handleUpstream((ChannelHandlerContext) null, downstreamChannelStateEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jboss.netty.handler.codec.oneone.OneToOneDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IgnitionEventHandler ignitionEventHandler0 = new IgnitionEventHandler();
      assertNotNull(ignitionEventHandler0);
      
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      assertFalse(defaultChannelPipeline0.isAttached());
      assertNotNull(defaultChannelPipeline0);
      
      ChannelHandlerContext channelHandlerContext0 = defaultChannelPipeline0.getContext((ChannelHandler) ignitionEventHandler0);
      assertFalse(defaultChannelPipeline0.isAttached());
      assertNull(channelHandlerContext0);
      
      DefaultLocalClientChannelFactory defaultLocalClientChannelFactory0 = new DefaultLocalClientChannelFactory();
      assertNotNull(defaultLocalClientChannelFactory0);
      
      LocalChannel localChannel0 = defaultLocalClientChannelFactory0.newChannel(defaultChannelPipeline0);
      assertTrue(defaultChannelPipeline0.isAttached());
      assertEquals(0, (int)localChannel0.getId());
      assertTrue(localChannel0.isReadable());
      assertTrue(localChannel0.isOpen());
      assertNotNull(localChannel0);
      
      ChannelState channelState0 = ChannelState.BOUND;
      Object object0 = new Object();
      assertNotNull(object0);
      
      UpstreamChannelStateEvent upstreamChannelStateEvent0 = new UpstreamChannelStateEvent(localChannel0, channelState0, object0);
      assertTrue(defaultChannelPipeline0.isAttached());
      assertEquals(0, (int)localChannel0.getId());
      assertTrue(localChannel0.isReadable());
      assertTrue(localChannel0.isOpen());
      assertEquals(ChannelState.BOUND, upstreamChannelStateEvent0.getState());
      assertNotNull(upstreamChannelStateEvent0);
      
      String string0 = upstreamChannelStateEvent0.toString();
      assertTrue(defaultChannelPipeline0.isAttached());
      assertEquals(0, (int)localChannel0.getId());
      assertTrue(localChannel0.isReadable());
      assertTrue(localChannel0.isOpen());
      assertEquals(ChannelState.BOUND, upstreamChannelStateEvent0.getState());
      assertNotNull(string0);
      
      try { 
        ignitionEventHandler0.handleUpstream((ChannelHandlerContext) null, upstreamChannelStateEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jboss.netty.handler.codec.oneone.OneToOneDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      IgnitionEventHandler ignitionEventHandler0 = new IgnitionEventHandler();
      Position position0 = new Position();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "overspeed";
      stringArray0[1] = "temperature";
      stringArray0[2] = "throttle";
      try { 
        Context.init(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }
}
