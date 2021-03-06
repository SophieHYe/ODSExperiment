/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 09 23:18:18 GMT 2019
 */

package org.traccar.protocol;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.SocketAddress;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      GoSafeProtocolDecoder goSafeProtocolDecoder0 = new GoSafeProtocolDecoder((GoSafeProtocol) null);
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(5);
      try { 
        goSafeProtocolDecoder0.decode((Channel) null, mockInetSocketAddress0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GoSafeProtocol goSafeProtocol0 = new GoSafeProtocol();
      GoSafeProtocolDecoder goSafeProtocolDecoder0 = new GoSafeProtocolDecoder(goSafeProtocol0);
      DefaultLocalClientChannelFactory defaultLocalClientChannelFactory0 = new DefaultLocalClientChannelFactory();
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      LocalChannel localChannel0 = defaultLocalClientChannelFactory0.newChannel(defaultChannelPipeline0);
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("packetType", 0);
      goSafeProtocolDecoder0.decode(localChannel0, mockInetSocketAddress0, "(");
      assertEquals(0, (int)localChannel0.getId());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GoSafeProtocol goSafeProtocol0 = new GoSafeProtocol();
      GoSafeProtocolDecoder goSafeProtocolDecoder0 = new GoSafeProtocolDecoder(goSafeProtocol0);
      Object object0 = new Object();
      try { 
        goSafeProtocolDecoder0.decode((Channel) null, (SocketAddress) null, object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
         verifyException("org.traccar.protocol.GoSafeProtocolDecoder", e);
      }
  }
}
