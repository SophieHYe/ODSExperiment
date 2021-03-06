/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 10 02:06:50 GMT 2019
 */

package org.traccar.protocol;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zaxxer.hikari.util.UtilityElf;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelSink;
import org.jboss.netty.channel.ChannelState;
import org.jboss.netty.channel.DefaultChannelPipeline;
import org.jboss.netty.channel.UpstreamChannelStateEvent;
import org.jboss.netty.channel.local.DefaultLocalClientChannelFactory;
import org.jboss.netty.channel.local.DefaultLocalServerChannelFactory;
import org.jboss.netty.channel.local.LocalChannel;
import org.jboss.netty.channel.socket.nio.NioSocketChannel;
import org.jboss.netty.channel.socket.nio.NioWorker;
import org.jboss.netty.util.ThreadNameDeterminer;
import org.junit.runner.RunWith;
import org.traccar.database.ActiveDevice;
import org.traccar.model.Command;
import org.traccar.protocol.Gl200Protocol;
import org.traccar.protocol.Gl200ProtocolDecoder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Gl200ProtocolDecoder_ESTest extends Gl200ProtocolDecoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Gl200Protocol gl200Protocol0 = new Gl200Protocol();
      Gl200ProtocolDecoder gl200ProtocolDecoder0 = new Gl200ProtocolDecoder(gl200Protocol0);
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      defaultChannelPipeline0.getChannel();
      int int0 = 0;
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("N|iu'!UfH", 0);
      try { 
        gl200ProtocolDecoder0.decode((Channel) null, inetSocketAddress0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.traccar.protocol.Gl200ProtocolDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Gl200Protocol gl200Protocol0 = new Gl200Protocol();
      Gl200ProtocolDecoder gl200ProtocolDecoder0 = new Gl200ProtocolDecoder(gl200Protocol0);
      DefaultLocalClientChannelFactory defaultLocalClientChannelFactory0 = new DefaultLocalClientChannelFactory();
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      LocalChannel localChannel0 = defaultLocalClientChannelFactory0.newChannel(defaultChannelPipeline0);
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("", 0);
      UtilityElf.DefaultThreadFactory utilityElf_DefaultThreadFactory0 = new UtilityElf.DefaultThreadFactory("", true);
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0, utilityElf_DefaultThreadFactory0);
      MockThread mockThread0 = new MockThread((Runnable) null, "");
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      ScheduledFuture<?> scheduledFuture0 = scheduledThreadPoolExecutor0.schedule((Runnable) mockThread0, 1L, timeUnit0);
      try { 
        gl200ProtocolDecoder0.decode(localChannel0, mockInetSocketAddress0, scheduledFuture0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask cannot be cast to java.lang.String
         //
         verifyException("org.traccar.protocol.Gl200ProtocolDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Gl200Protocol gl200Protocol0 = new Gl200Protocol();
      Gl200ProtocolDecoder gl200ProtocolDecoder0 = new Gl200ProtocolDecoder(gl200Protocol0);
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      defaultChannelPipeline0.getChannel();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)68;
      try { 
        MockInetAddress.getByAddress(":", byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [0, 68]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Gl200Protocol gl200Protocol0 = new Gl200Protocol();
      Gl200ProtocolDecoder gl200ProtocolDecoder0 = new Gl200ProtocolDecoder(gl200Protocol0);
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      defaultChannelPipeline0.getChannel();
      defaultChannelPipeline0.getContext("");
      ChannelState channelState0 = ChannelState.BOUND;
      UpstreamChannelStateEvent upstreamChannelStateEvent0 = null;
      try {
        upstreamChannelStateEvent0 = new UpstreamChannelStateEvent((Channel) null, channelState0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // channel
         //
         verifyException("org.jboss.netty.channel.UpstreamChannelStateEvent", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Gl200Protocol gl200Protocol0 = new Gl200Protocol();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "^|";
      stringArray0[1] = "2:TrQv.";
      stringArray0[2] = "m/=`S%";
      gl200Protocol0.setSupportedCommands(stringArray0);
      stringArray0[3] = "a0Ibz_8vK2(zq1C<b*";
      gl200Protocol0.setSupportedCommands(stringArray0);
      Gl200ProtocolDecoder gl200ProtocolDecoder0 = new Gl200ProtocolDecoder(gl200Protocol0);
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      defaultChannelPipeline0.getChannel();
      DefaultLocalClientChannelFactory defaultLocalClientChannelFactory0 = new DefaultLocalClientChannelFactory();
      ChannelSink channelSink0 = defaultChannelPipeline0.getSink();
      SocketChannel socketChannel0 = SocketChannel.open();
      ThreadPoolExecutor.DiscardPolicy threadPoolExecutor_DiscardPolicy0 = new ThreadPoolExecutor.DiscardPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(2304, threadPoolExecutor_DiscardPolicy0);
      ThreadNameDeterminer threadNameDeterminer0 = mock(ThreadNameDeterminer.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(threadNameDeterminer0).determineThreadName(anyString() , anyString());
      NioWorker nioWorker0 = new NioWorker(scheduledThreadPoolExecutor0, threadNameDeterminer0);
      NioSocketChannel nioSocketChannel0 = new NioSocketChannel((Channel) null, defaultLocalClientChannelFactory0, defaultChannelPipeline0, channelSink0, socketChannel0, nioWorker0);
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(inetAddress0, 2304);
      gl200ProtocolDecoder0.decode(nioSocketChannel0, mockInetSocketAddress0, "a0Ibz_8vK2(zq1C<b*");
      //  // Unstable assertion: assertEquals(1, (int)nioSocketChannel0.getId());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Gl200Protocol gl200Protocol0 = new Gl200Protocol();
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      defaultChannelPipeline0.getChannel();
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(2239);
      ActiveDevice activeDevice0 = new ActiveDevice(0L, gl200Protocol0, (Channel) null, mockInetSocketAddress0);
      Command command0 = new Command();
      mockInetSocketAddress0.getHostName();
      // Undeclared exception!
      try { 
        activeDevice0.sendCommand(command0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.traccar.BaseProtocol", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Gl200Protocol gl200Protocol0 = new Gl200Protocol();
      Gl200ProtocolDecoder gl200ProtocolDecoder0 = new Gl200ProtocolDecoder(gl200Protocol0);
      DefaultLocalServerChannelFactory defaultLocalServerChannelFactory0 = new DefaultLocalServerChannelFactory();
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      defaultLocalServerChannelFactory0.newChannel(defaultChannelPipeline0);
      // Undeclared exception!
      try { 
        MockInetSocketAddress.createUnresolved("", (-25));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-25
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }
}
