/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 10 04:14:12 GMT 2019
 */

package org.traccar.protocol;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.DefaultChannelPipeline;
import org.jboss.netty.channel.local.DefaultLocalClientChannelFactory;
import org.jboss.netty.channel.local.LocalChannel;
import org.junit.runner.RunWith;
import org.traccar.protocol.GoSafeProtocol;
import org.traccar.protocol.GoSafeProtocolDecoder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GoSafeProtocolDecoder_ESTest extends GoSafeProtocolDecoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GoSafeProtocol goSafeProtocol0 = new GoSafeProtocol();
      GoSafeProtocolDecoder goSafeProtocolDecoder0 = new GoSafeProtocolDecoder(goSafeProtocol0);
      DefaultLocalClientChannelFactory defaultLocalClientChannelFactory0 = new DefaultLocalClientChannelFactory();
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      LocalChannel localChannel0 = defaultLocalClientChannelFactory0.newChannel(defaultChannelPipeline0);
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(1896);
      try { 
        goSafeProtocolDecoder0.decode(localChannel0, mockInetSocketAddress0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GoSafeProtocol goSafeProtocol0 = new GoSafeProtocol();
      GoSafeProtocolDecoder goSafeProtocolDecoder0 = new GoSafeProtocolDecoder(goSafeProtocol0);
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("Q7BTFT5Tg16F`_[~&LN", 919);
      Object object0 = goSafeProtocolDecoder0.decode((Channel) null, inetSocketAddress0, "Q7BTFT5Tg16F`_[~&LN");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GoSafeProtocol goSafeProtocol0 = new GoSafeProtocol();
      GoSafeProtocolDecoder goSafeProtocolDecoder0 = new GoSafeProtocolDecoder(goSafeProtocol0);
      DefaultLocalClientChannelFactory defaultLocalClientChannelFactory0 = new DefaultLocalClientChannelFactory();
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      LocalChannel localChannel0 = defaultLocalClientChannelFactory0.newChannel(defaultChannelPipeline0);
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(inetAddress0, 349);
      try { 
        goSafeProtocolDecoder0.decode(localChannel0, mockInetSocketAddress0, defaultChannelPipeline0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jboss.netty.channel.DefaultChannelPipeline cannot be cast to java.lang.String
         //
         verifyException("org.traccar.protocol.GoSafeProtocolDecoder", e);
      }
  }
}
