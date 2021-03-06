/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Dec 10 01:33:05 GMT 2019
 */

package org.traccar.protocol;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Gt06ProtocolDecoder_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.traccar.protocol.Gt06ProtocolDecoder"; 
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
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/home/wasp/Desktop/research/Evosuite/tests/Bears-126/9"); 
    java.lang.System.setProperty("user.home", "/home/wasp"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "wasp"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Gt06ProtocolDecoder_ESTest_scaffolding.class.getClassLoader() ,
      "org.traccar.model.Driver",
      "org.jboss.netty.channel.AdaptiveReceiveBufferSizePredictorFactory",
      "org.traccar.model.DeviceTotalDistance",
      "org.traccar.ExtendedObjectDecoder",
      "org.jboss.netty.channel.DefaultChildChannelStateEvent",
      "org.jboss.netty.logging.JdkLoggerFactory",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$TreeNode",
      "org.jboss.netty.handler.codec.http.HttpMethod",
      "org.traccar.protocol.Gl200ProtocolEncoder",
      "org.jboss.netty.channel.CompleteChannelFuture",
      "com.ning.http.client.providers.netty.channel.CleanupChannelGroup",
      "org.traccar.StringProtocolEncoder",
      "com.ning.http.client.AsyncHttpClientConfig$Builder$1",
      "com.ning.http.client.ntlm.NTLMEngineException",
      "org.traccar.database.UsersManager",
      "org.traccar.Config",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$Segment",
      "org.jboss.netty.channel.ChannelException",
      "org.jboss.netty.channel.socket.Worker",
      "org.jboss.netty.channel.SucceededChannelFuture",
      "org.jboss.netty.channel.socket.nio.Boss",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$SendBuffer",
      "org.traccar.database.AttributesManager",
      "com.fasterxml.jackson.annotation.JsonIgnoreProperties",
      "org.traccar.DeviceSession",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProviderConfig$DefaultNettyWebSocketFactory",
      "org.traccar.database.CalendarManager",
      "org.traccar.model.Attribute",
      "org.joda.time.base.AbstractInstant",
      "org.jboss.netty.handler.codec.http.HttpChunk",
      "org.traccar.helper.Parser$DateTimeFormat",
      "org.jboss.netty.channel.socket.DatagramChannelFactory",
      "org.jboss.netty.channel.socket.nio.AbstractNioWorkerPool",
      "org.jboss.netty.util.Timeout",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$IntByIntToInt",
      "org.traccar.database.ExtendedObjectManager",
      "org.jboss.netty.logging.JdkLogger",
      "org.traccar.BaseDataHandler",
      "org.traccar.Protocol",
      "org.jboss.netty.util.HashedWheelTimer$HashedWheelBucket",
      "com.ning.http.client.providers.jdk.JDKAsyncHttpProvider$1",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$ConcurrentHashMapSpliterator",
      "com.ning.http.client.UpgradeHandler",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink",
      "org.jboss.netty.util.ThreadNameDeterminer",
      "org.traccar.database.ActiveDevice",
      "org.jboss.netty.handler.codec.embedder.AbstractCodecEmbedder",
      "com.ning.http.client.ws.WebSocket",
      "com.ning.http.client.providers.netty.handler.Protocol",
      "com.fasterxml.jackson.core.Versioned",
      "org.jboss.netty.buffer.AbstractChannelBuffer",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$PreallocationRef",
      "org.apache.velocity.app.VelocityEngine",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$ObjectByObjectToLong",
      "org.traccar.protocol.DishaProtocol",
      "org.jboss.netty.channel.ChannelFutureListener$2",
      "com.ning.http.client.providers.netty.channel.pool.DefaultChannelPool$IdleChannel",
      "com.ning.http.client.ProxyServerSelector",
      "org.jboss.netty.channel.AbstractChannel$ChannelCloseFuture",
      "org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext",
      "com.ning.http.client.AsyncHttpProvider",
      "org.traccar.protocol.Gt06Protocol",
      "org.jboss.netty.channel.ChannelFutureListener$1",
      "com.zaxxer.hikari.util.UtilityElf$DefaultThreadFactory",
      "org.traccar.database.DriversManager",
      "org.traccar.database.IdentityManager",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$CounterCell",
      "com.ning.http.client.providers.netty.response.NettyResponseBodyPart",
      "org.traccar.model.Message",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$BaseIterator",
      "org.traccar.protocol.EnforaProtocolEncoder",
      "com.ning.http.client.HttpResponseHeaders",
      "org.jboss.netty.channel.ChannelHandlerContext",
      "com.ning.http.client.providers.netty.request.body.NettyBody",
      "com.ning.http.client.AsyncHttpClient",
      "com.ning.http.client.MaxRedirectException",
      "org.traccar.database.ConnectionManager",
      "com.ning.http.client.Response",
      "org.traccar.geolocation.GeolocationProvider",
      "com.ning.http.client.providers.netty.channel.pool.DefaultChannelPool",
      "org.traccar.protocol.H02ProtocolEncoder",
      "org.joda.time.DateTime",
      "com.ning.http.client.HttpResponseStatus",
      "org.jboss.netty.channel.ChannelSink",
      "org.traccar.protocol.Jt600ProtocolEncoder",
      "com.ning.http.client.AsyncHttpProviderConfig",
      "org.jboss.netty.channel.socket.nio.AbstractNioWorker",
      "org.jboss.netty.buffer.EmptyChannelBuffer",
      "org.traccar.protocol.WondexProtocolEncoder",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$EntrySetView",
      "com.ning.http.client.providers.jdk.JDKDelegateFuture",
      "org.jboss.netty.channel.MessageEvent",
      "org.traccar.events.MotionEventHandler",
      "com.ning.http.client.uri.Uri",
      "org.traccar.BaseProtocolDecoder",
      "org.jboss.netty.channel.ChildChannelStateEvent",
      "org.jboss.netty.channel.socket.nio.AbstractNioSelector",
      "org.traccar.BaseProtocol",
      "com.ning.http.client.providers.netty.channel.ChannelManager$7",
      "com.ning.http.client.providers.netty.channel.ChannelManager$8",
      "org.traccar.protocol.Gt06ProtocolDecoder",
      "org.jboss.netty.channel.ChannelPipeline",
      "org.traccar.database.BaseObjectManager",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProviderConfig$NettyWebSocketFactory",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$FileSendBuffer",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProviderConfig",
      "org.jboss.netty.buffer.DynamicChannelBuffer",
      "org.jboss.netty.channel.socket.DefaultSocketChannelConfig",
      "org.traccar.model.Device",
      "org.jboss.netty.channel.ChannelHandlerLifeCycleException",
      "org.jboss.netty.channel.group.DefaultChannelGroup$1",
      "org.traccar.geocoder.Geocoder",
      "com.ning.http.client.providers.netty.channel.pool.DefaultChannelPool$IdleChannelDetector",
      "org.jboss.netty.channel.socket.nio.NioClientBoss",
      "org.jboss.netty.channel.ChannelConfig",
      "com.ning.http.client.listenable.AbstractListenableFuture",
      "org.jboss.netty.logging.AbstractInternalLogger",
      "com.ning.http.client.Realm",
      "org.jboss.netty.channel.group.DefaultChannelGroupFuture",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProvider",
      "com.ning.http.client.FluentCaseInsensitiveStringsMap",
      "org.jboss.netty.handler.ssl.SslHandler",
      "org.jboss.netty.channel.ChannelEvent",
      "org.jboss.netty.bootstrap.ServerBootstrap",
      "org.jboss.netty.channel.socket.nio.SocketReceiveBufferAllocator",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$ObjectToInt",
      "org.jboss.netty.buffer.ChannelBuffers",
      "org.jboss.netty.channel.socket.ServerSocketChannelFactory",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$ValuesView",
      "org.traccar.model.Group",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$1",
      "com.fasterxml.jackson.core.TreeCodec",
      "org.traccar.protocol.Gt06Protocol$1",
      "org.jboss.netty.channel.Channel",
      "org.jboss.netty.util.HashedWheelTimer",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannel$WriteRequestQueue",
      "com.ning.http.client.filter.FilterException",
      "org.jboss.netty.channel.UpstreamChannelStateEvent",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannel",
      "com.ning.http.client.providers.netty.ws.NettyWebSocket",
      "org.jboss.netty.util.ThreadNameDeterminer$2",
      "org.jboss.netty.util.ThreadNameDeterminer$1",
      "org.traccar.helper.PatternBuilder",
      "org.jboss.netty.channel.group.ChannelGroupFuture",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$CollectionView",
      "org.traccar.database.DeviceManager",
      "org.jboss.netty.channel.socket.ServerSocketChannel",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$TreeBin",
      "org.jboss.netty.handler.codec.http.HttpRequest",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$Traverser",
      "org.jboss.netty.buffer.BigEndianHeapChannelBuffer",
      "org.traccar.model.ExtendedModel",
      "org.jboss.netty.util.HashedWheelTimer$1",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$ObjectToDouble",
      "com.ning.http.util.MiscUtils",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "org.jboss.netty.channel.local.LocalAddress",
      "org.jboss.netty.channel.socket.SocketChannelConfig",
      "org.jboss.netty.channel.ExceptionEvent",
      "com.ning.http.client.RequestBuilderBase",
      "org.jboss.netty.channel.socket.nio.NioServerSocketPipelineSink",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$Action",
      "com.ning.http.client.providers.netty.channel.pool.ChannelPoolPartitionSelector",
      "com.ning.http.client.providers.netty.request.NettyRequest",
      "org.jboss.netty.util.HashedWheelTimer$HashedWheelTimeout",
      "org.jboss.netty.handler.codec.http.HttpContentDecompressor",
      "org.traccar.protocol.SuntechProtocolEncoder",
      "org.jboss.netty.channel.local.DefaultLocalChannel$1",
      "org.jboss.netty.util.internal.ThreadLocalBoolean",
      "org.traccar.BaseProtocolEncoder",
      "org.traccar.database.MediaManager",
      "org.jboss.netty.handler.codec.oneone.OneToOneDecoder",
      "org.jboss.netty.handler.codec.http.HttpClientCodec",
      "org.jboss.netty.logging.InternalLogger",
      "org.jboss.netty.channel.local.DefaultLocalClientChannelFactory",
      "org.jboss.netty.util.internal.DeadLockProofWorker$1",
      "org.traccar.helper.Checksum",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder",
      "org.jboss.netty.channel.DefaultChannelPipeline$DiscardingChannelSink",
      "org.jboss.netty.channel.ReceiveBufferSizePredictorFactory",
      "org.jboss.netty.handler.codec.http.HttpContentDecoder",
      "org.traccar.geocoder.AddressFormat",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$ObjectByObjectToInt",
      "org.jboss.netty.channel.AbstractServerChannel",
      "org.traccar.model.Position",
      "com.ning.http.client.AsyncHandler$STATE",
      "com.ning.http.client.providers.netty.handler.WebSocketProtocol",
      "org.jboss.netty.buffer.DirectChannelBufferFactory",
      "org.jboss.netty.channel.FileRegion",
      "org.traccar.web.WebServer",
      "org.jboss.netty.channel.local.DefaultLocalChannel",
      "org.jboss.netty.util.HashedWheelTimer$Worker",
      "org.jboss.netty.channel.DefaultChannelConfig",
      "org.jboss.netty.channel.ChannelStateEvent",
      "org.jboss.netty.channel.socket.nio.SelectorUtil",
      "com.ning.http.client.providers.netty.channel.ChannelManager",
      "org.jboss.netty.channel.DefaultChannelFuture",
      "com.ning.http.client.providers.netty.handler.Processor",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannel$WriteTask",
      "org.jboss.netty.channel.local.LocalChannel",
      "org.traccar.events.OverspeedEventHandler",
      "org.traccar.model.Network",
      "com.ning.http.client.ProxyServer",
      "org.jboss.netty.channel.ChannelFutureListener",
      "com.ning.http.client.providers.netty.future.NettyResponseFuture",
      "org.traccar.reports.model.TripsConfig",
      "com.ning.http.client.filter.FilterContext",
      "org.traccar.model.BaseModel",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$Fun",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$BiAction",
      "org.jboss.netty.channel.socket.nio.BossPool",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$ObjectByObjectToDouble",
      "org.jboss.netty.channel.group.ChannelGroup",
      "org.jboss.netty.buffer.ByteBufferBackedChannelBuffer",
      "org.traccar.database.PermissionsManager",
      "org.jboss.netty.util.ThreadRenamingRunnable",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$DoubleByDoubleToDouble",
      "org.traccar.database.AliasesManager",
      "org.jboss.netty.handler.codec.http.HttpVersion",
      "org.traccar.database.GroupsManager",
      "org.jboss.netty.channel.group.DefaultChannelGroup",
      "org.apache.velocity.runtime.RuntimeConstants",
      "com.fasterxml.jackson.core.ObjectCodec",
      "org.traccar.protocol.XexunProtocolEncoder",
      "org.jboss.netty.channel.DefaultWriteCompletionEvent",
      "org.traccar.Context",
      "org.traccar.database.DataManager",
      "org.traccar.model.User",
      "org.jboss.netty.channel.ChannelUpstreamHandler",
      "org.jboss.netty.channel.ChannelHandler",
      "org.jboss.netty.logging.InternalLogLevel",
      "org.jboss.netty.handler.codec.http.HttpHeaders",
      "com.ning.http.client.ConnectionPoolPartitioning",
      "org.jboss.netty.channel.socket.nio.NioWorker",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannelSink",
      "com.ning.http.client.AsyncHttpClientConfigDefaults",
      "org.jboss.netty.channel.SimpleChannelDownstreamHandler",
      "com.ning.http.client.providers.netty.handler.ConnectionStrategy",
      "com.ning.http.client.ProxyServerSelector$1",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$Preallocation",
      "org.jboss.netty.channel.local.LocalClientChannelSink",
      "com.ning.http.client.providers.netty.request.NettyRequestSender",
      "org.jboss.netty.channel.WriteCompletionEvent",
      "com.ning.http.client.providers.jdk.JDKAsyncHttpProviderConfig",
      "org.jboss.netty.buffer.HeapChannelBuffer",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel",
      "com.ning.http.client.Request",
      "org.jboss.netty.channel.local.DefaultLocalServerChannel",
      "org.jboss.netty.channel.ChannelFutureProgressListener",
      "org.jboss.netty.channel.local.LocalServerChannelFactory",
      "org.traccar.protocol.GranitProtocolSmsEncoder",
      "org.jboss.netty.channel.group.DefaultChannelGroupFuture$1",
      "org.jboss.netty.channel.socket.nio.WorkerPool",
      "org.jboss.netty.channel.socket.nio.NioChannelConfig",
      "org.jboss.netty.buffer.DuplicatedChannelBuffer",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "org.jboss.netty.channel.ConnectTimeoutException",
      "org.jboss.netty.handler.codec.embedder.DecoderEmbedder",
      "org.jboss.netty.channel.Channels",
      "com.ning.http.client.AsyncHttpClientConfig",
      "com.ning.http.client.HttpResponseBodyPart",
      "org.jboss.netty.util.internal.DetectionUtil$1",
      "com.ning.http.client.providers.netty.response.NettyResponseHeaders",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$ValueIterator",
      "com.ning.http.client.filter.ResponseFilter",
      "org.traccar.smpp.SmppClient",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$ForwardingNode",
      "com.ning.http.client.filter.IOExceptionFilter",
      "com.ning.http.client.providers.jdk.JDKFuture",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannel",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$ReservationNode",
      "org.traccar.BaseEventHandler",
      "org.jboss.netty.util.Timer",
      "org.jboss.netty.channel.socket.SocketChannel",
      "org.joda.time.base.BaseDateTime",
      "org.jboss.netty.util.ExternalResourceReleasable",
      "com.ning.http.client.providers.netty.channel.pool.ChannelPool",
      "org.jboss.netty.channel.socket.nio.NioServerBoss",
      "org.jboss.netty.buffer.HeapChannelBufferFactory",
      "org.traccar.database.ManagableObjects",
      "org.jboss.netty.buffer.WrappedChannelBuffer",
      "org.jboss.netty.channel.ChannelFuture",
      "org.jboss.netty.channel.Channels$1",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool",
      "com.ning.http.client.providers.jdk.JDKAsyncHttpProvider",
      "org.traccar.geocoder.Geocoder$ReverseGeocoderCallback",
      "com.ning.http.client.ListenableFuture",
      "org.traccar.protocol.Pt502ProtocolEncoder",
      "org.jboss.netty.channel.ReceiveBufferSizePredictor",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$PooledSendBuffer",
      "org.traccar.StringProtocolEncoder$ValueFormatter",
      "org.traccar.protocol.Tk103ProtocolEncoder",
      "org.jboss.netty.channel.ServerChannelFactory",
      "org.jboss.netty.channel.socket.nio.DefaultNioSocketChannelConfig",
      "org.jboss.netty.handler.codec.oneone.OneToOneEncoder",
      "org.jboss.netty.channel.ChannelDownstreamHandler",
      "org.traccar.database.SimpleObjectManager",
      "org.jboss.netty.handler.codec.frame.FrameDecoder",
      "org.jboss.netty.channel.group.ChannelGroupFutureListener",
      "org.jboss.netty.channel.local.LocalClientChannelFactory",
      "com.ning.http.client.SSLEngineFactory$DefaultSSLEngineFactory",
      "org.jboss.netty.channel.ChannelFactory",
      "org.jboss.netty.channel.DefaultServerChannelConfig",
      "org.jboss.netty.channel.socket.nio.NioClientBoss$1",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$UnpooledSendBuffer",
      "org.jboss.netty.channel.socket.nio.NioServerBossPool",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "com.ning.http.client.providers.netty.channel.pool.DefaultChannelPool$1",
      "org.traccar.helper.Parser",
      "com.ning.http.client.providers.netty.request.NettyRequestFactory",
      "org.traccar.geolocation.GeolocationProvider$LocationProviderCallback",
      "org.jboss.netty.channel.LifeCycleAwareChannelHandler",
      "org.jboss.netty.util.internal.DeadLockProofWorker",
      "com.ning.http.client.AsyncHttpClient$BoundRequestBuilder",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$LongByLongToLong",
      "org.jboss.netty.channel.socket.nio.NioSocketChannelConfig",
      "org.traccar.TrackerServer",
      "org.joda.time.base.AbstractDateTime",
      "org.jboss.netty.channel.socket.nio.NioClientBossPool",
      "org.traccar.helper.Parser$CoordinateFormat",
      "org.jboss.netty.buffer.ReadOnlyChannelBuffer",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$BiFun",
      "org.jboss.netty.channel.socket.nio.NioSelector",
      "org.jboss.netty.buffer.LittleEndianHeapChannelBuffer",
      "org.jboss.netty.util.internal.SharedResourceMisuseDetector",
      "com.ning.http.client.ws.WebSocketUpgradeHandler",
      "org.jboss.netty.channel.local.LocalServerChannel",
      "com.zaxxer.hikari.util.UtilityElf",
      "org.jboss.netty.channel.ServerChannel",
      "org.traccar.protocol.Gps103ProtocolEncoder",
      "com.ning.http.client.providers.netty.handler.DefaultConnectionStrategy",
      "org.jboss.netty.handler.codec.http.HttpMessage",
      "org.jboss.netty.channel.local.DefaultLocalServerChannelFactory",
      "com.fasterxml.jackson.annotation.JacksonAnnotationValue",
      "org.jboss.netty.channel.AbstractChannel",
      "org.jboss.netty.handler.codec.http.HttpResponseStatus",
      "org.joda.time.ReadableDateTime",
      "org.jboss.netty.channel.socket.nio.NioWorkerPool",
      "org.jboss.netty.channel.AbstractChannelSink",
      "com.ning.http.util.DateUtils",
      "org.jboss.netty.bootstrap.ClientBootstrap",
      "org.jboss.netty.buffer.ChannelBufferFactory",
      "org.jboss.netty.buffer.ChannelBuffer",
      "org.traccar.ServerManager",
      "org.traccar.protocol.WatchProtocolEncoder",
      "org.jboss.netty.channel.socket.ClientSocketChannelFactory",
      "com.fasterxml.jackson.annotation.JsonInclude$Value",
      "org.jboss.netty.channel.socket.nio.AbstractNioBossPool",
      "org.jboss.netty.channel.ChannelState",
      "org.jboss.netty.util.internal.DetectionUtil",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$CounterHashCode",
      "com.ning.http.client.SSLEngineFactory",
      "org.jboss.netty.util.internal.SystemPropertyUtil",
      "org.traccar.database.GeofenceManager",
      "org.traccar.protocol.WialonProtocolEncoder",
      "com.ning.http.client.AsyncHttpClientConfig$Builder",
      "org.joda.time.ReadableInstant",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8",
      "org.jboss.netty.channel.DefaultChannelPipeline",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$ObjectToLong",
      "org.jboss.netty.channel.local.LocalServerChannelSink$1",
      "org.jboss.netty.channel.ChannelPipelineFactory",
      "com.ning.http.client.providers.netty.handler.HttpProtocol",
      "com.ning.http.client.SignatureCalculator",
      "org.jboss.netty.buffer.AbstractChannelBufferFactory",
      "org.jboss.netty.channel.socket.nio.NioServerSocketChannel",
      "com.ning.http.client.AsyncHandler",
      "org.traccar.notification.EventForwarder",
      "com.ning.http.client.providers.netty.response.NettyResponseStatus",
      "com.ning.http.client.providers.netty.Callback",
      "org.jboss.netty.channel.UpstreamChannelStateEvent$1",
      "org.traccar.protocol.MiniFinderProtocolEncoder",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProviderConfig$AdditionalPipelineInitializer",
      "org.jboss.netty.bootstrap.Bootstrap",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$Node",
      "org.jboss.netty.channel.socket.nio.NioSelectorPool",
      "org.jboss.netty.channel.local.LocalServerChannelSink",
      "org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory",
      "org.jboss.netty.util.TimerTask",
      "org.traccar.database.StatisticsManager",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$KeySetView",
      "com.fasterxml.jackson.databind.ObjectMapper",
      "org.traccar.database.NotificationManager",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$EmptySendBuffer",
      "org.traccar.model.Command",
      "org.jboss.netty.channel.ChannelPipelineException",
      "org.traccar.GlobalChannelFactory",
      "org.jboss.netty.handler.codec.embedder.CodecEmbedder",
      "com.ning.http.client.filter.RequestFilter",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$GatheringSendBuffer",
      "org.jboss.netty.channel.DownstreamChannelStateEvent",
      "com.fasterxml.jackson.annotation.JsonInclude",
      "org.jboss.netty.handler.codec.http.HttpResponse",
      "org.traccar.model.DeviceState"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Gt06ProtocolDecoder_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.traccar.ExtendedObjectDecoder",
      "org.traccar.BaseProtocolDecoder",
      "org.traccar.helper.PatternBuilder",
      "org.traccar.protocol.Gt06ProtocolDecoder",
      "com.ning.http.client.AsyncHttpClient",
      "com.ning.http.client.AsyncHttpClientConfig$Builder",
      "com.ning.http.client.AsyncHttpClientConfigDefaults",
      "com.ning.http.util.MiscUtils",
      "com.ning.http.client.AsyncHttpClientConfig$Builder$1",
      "com.ning.http.client.ProxyServerSelector$1",
      "com.ning.http.client.ProxyServerSelector",
      "com.ning.http.client.AsyncHttpClientConfig",
      "org.jboss.netty.logging.JdkLoggerFactory",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "org.jboss.netty.logging.AbstractInternalLogger",
      "org.jboss.netty.logging.JdkLogger",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProvider",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProviderConfig",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProviderConfig$DefaultNettyWebSocketFactory",
      "com.ning.http.client.providers.netty.handler.DefaultConnectionStrategy",
      "org.jboss.netty.util.internal.SharedResourceMisuseDetector",
      "org.jboss.netty.util.HashedWheelTimer",
      "org.jboss.netty.util.HashedWheelTimer$Worker",
      "org.jboss.netty.util.HashedWheelTimer$HashedWheelBucket",
      "org.jboss.netty.util.ThreadNameDeterminer$1",
      "org.jboss.netty.util.ThreadNameDeterminer$2",
      "org.jboss.netty.util.ThreadNameDeterminer",
      "org.jboss.netty.util.ThreadRenamingRunnable",
      "org.jboss.netty.util.internal.SystemPropertyUtil",
      "org.jboss.netty.util.internal.DetectionUtil$1",
      "org.jboss.netty.util.internal.DetectionUtil",
      "com.ning.http.client.providers.netty.channel.ChannelManager",
      "com.ning.http.client.SSLEngineFactory$DefaultSSLEngineFactory",
      "com.ning.http.client.providers.netty.channel.pool.DefaultChannelPool$1",
      "com.ning.http.client.providers.netty.channel.pool.DefaultChannelPool",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$1",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8",
      "com.ning.http.client.providers.netty.channel.pool.DefaultChannelPool$IdleChannelDetector",
      "org.jboss.netty.util.HashedWheelTimer$HashedWheelTimeout",
      "org.jboss.netty.channel.group.DefaultChannelGroup",
      "com.ning.http.client.providers.netty.channel.CleanupChannelGroup",
      "org.jboss.netty.channel.group.DefaultChannelGroup$1",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory",
      "org.jboss.netty.channel.socket.nio.AbstractNioWorkerPool",
      "org.jboss.netty.channel.socket.nio.NioWorkerPool",
      "org.jboss.netty.channel.socket.nio.AbstractNioSelector",
      "org.jboss.netty.channel.socket.nio.AbstractNioWorker",
      "org.jboss.netty.channel.socket.nio.NioWorker",
      "org.jboss.netty.channel.socket.nio.SelectorUtil",
      "org.jboss.netty.util.internal.DeadLockProofWorker",
      "org.jboss.netty.util.internal.DeadLockProofWorker$1",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$EmptySendBuffer",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$Preallocation",
      "org.jboss.netty.channel.socket.nio.SocketReceiveBufferAllocator",
      "org.jboss.netty.channel.socket.nio.AbstractNioBossPool",
      "org.jboss.netty.channel.socket.nio.NioClientBossPool",
      "org.jboss.netty.channel.socket.nio.NioClientBoss",
      "org.jboss.netty.channel.socket.nio.NioClientBoss$1",
      "org.jboss.netty.channel.AbstractChannelSink",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannelSink",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink",
      "org.jboss.netty.bootstrap.Bootstrap",
      "org.jboss.netty.bootstrap.ClientBootstrap",
      "org.jboss.netty.channel.Channels",
      "org.jboss.netty.channel.DefaultChannelPipeline$DiscardingChannelSink",
      "org.jboss.netty.channel.DefaultChannelPipeline",
      "org.jboss.netty.channel.Channels$1",
      "org.jboss.netty.channel.DefaultChannelFuture",
      "com.ning.http.client.providers.netty.request.NettyRequestSender",
      "com.ning.http.client.providers.netty.request.NettyRequestFactory",
      "org.jboss.netty.handler.codec.http.HttpResponseStatus",
      "com.ning.http.client.providers.netty.handler.Protocol",
      "com.ning.http.client.providers.netty.handler.HttpProtocol",
      "com.ning.http.client.MaxRedirectException",
      "com.ning.http.client.providers.jdk.JDKAsyncHttpProvider",
      "org.traccar.Context",
      "org.jboss.netty.buffer.AbstractChannelBuffer",
      "org.jboss.netty.buffer.HeapChannelBuffer",
      "org.jboss.netty.buffer.BigEndianHeapChannelBuffer",
      "org.jboss.netty.buffer.EmptyChannelBuffer",
      "org.jboss.netty.buffer.ChannelBuffers",
      "org.traccar.helper.Checksum",
      "org.traccar.helper.Parser$CoordinateFormat",
      "org.traccar.helper.Parser$DateTimeFormat",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "org.traccar.BaseProtocol",
      "org.traccar.protocol.Gt06Protocol",
      "org.traccar.TrackerServer",
      "org.traccar.protocol.Gt06Protocol$1",
      "org.jboss.netty.bootstrap.ServerBootstrap",
      "org.traccar.GlobalChannelFactory",
      "org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory",
      "org.jboss.netty.channel.socket.nio.NioServerBossPool",
      "org.jboss.netty.channel.socket.nio.NioServerBoss",
      "org.jboss.netty.channel.socket.nio.NioServerSocketPipelineSink",
      "org.jboss.netty.handler.codec.oneone.OneToOneEncoder",
      "org.traccar.BaseProtocolEncoder",
      "org.traccar.StringProtocolEncoder",
      "org.traccar.protocol.WondexProtocolEncoder",
      "org.traccar.protocol.EnforaProtocolEncoder",
      "org.traccar.protocol.Pt502ProtocolEncoder",
      "org.traccar.model.BaseModel",
      "org.traccar.model.ExtendedModel",
      "org.traccar.model.Message",
      "org.traccar.model.Command",
      "org.traccar.protocol.DishaProtocol",
      "org.jboss.netty.channel.local.DefaultLocalClientChannelFactory",
      "org.jboss.netty.channel.local.LocalClientChannelSink",
      "org.jboss.netty.channel.AbstractChannel",
      "org.jboss.netty.channel.local.DefaultLocalChannel",
      "org.jboss.netty.channel.CompleteChannelFuture",
      "org.jboss.netty.channel.SucceededChannelFuture",
      "org.jboss.netty.channel.AbstractChannel$ChannelCloseFuture",
      "org.jboss.netty.util.internal.ThreadLocalBoolean",
      "org.jboss.netty.channel.DefaultChannelConfig",
      "org.jboss.netty.buffer.AbstractChannelBufferFactory",
      "org.jboss.netty.buffer.HeapChannelBufferFactory",
      "org.jboss.netty.channel.local.DefaultLocalChannel$1",
      "org.jboss.netty.channel.UpstreamChannelStateEvent",
      "org.jboss.netty.channel.UpstreamChannelStateEvent$1",
      "org.traccar.protocol.Gl200ProtocolEncoder",
      "org.jboss.netty.channel.DefaultChildChannelStateEvent",
      "org.traccar.protocol.WatchProtocolEncoder",
      "org.jboss.netty.buffer.DirectChannelBufferFactory",
      "org.jboss.netty.buffer.DynamicChannelBuffer",
      "org.jboss.netty.buffer.ByteBufferBackedChannelBuffer",
      "org.jboss.netty.buffer.ReadOnlyChannelBuffer",
      "org.traccar.model.Device",
      "org.traccar.protocol.SuntechProtocolEncoder",
      "org.jboss.netty.channel.local.DefaultLocalServerChannelFactory",
      "org.jboss.netty.channel.local.LocalServerChannelSink",
      "org.jboss.netty.channel.AbstractServerChannel",
      "org.jboss.netty.channel.local.DefaultLocalServerChannel",
      "org.traccar.database.ActiveDevice",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannel",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannel$WriteTask",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannel$WriteRequestQueue",
      "org.jboss.netty.channel.socket.DefaultSocketChannelConfig",
      "org.jboss.netty.channel.AdaptiveReceiveBufferSizePredictorFactory",
      "org.jboss.netty.channel.socket.nio.DefaultNioSocketChannelConfig",
      "org.jboss.netty.channel.DefaultServerChannelConfig",
      "org.traccar.protocol.H02ProtocolEncoder",
      "org.traccar.protocol.Gps103ProtocolEncoder",
      "org.jboss.netty.channel.group.DefaultChannelGroupFuture",
      "org.jboss.netty.channel.group.DefaultChannelGroupFuture$1",
      "org.jboss.netty.channel.SimpleChannelDownstreamHandler",
      "org.jboss.netty.buffer.DuplicatedChannelBuffer",
      "org.jboss.netty.buffer.LittleEndianHeapChannelBuffer",
      "com.zaxxer.hikari.util.UtilityElf$DefaultThreadFactory",
      "org.jboss.netty.channel.DownstreamChannelStateEvent",
      "org.jboss.netty.channel.local.LocalServerChannelSink$1",
      "org.traccar.protocol.Jt600ProtocolEncoder",
      "org.jboss.netty.channel.DefaultWriteCompletionEvent",
      "org.traccar.protocol.Tk103ProtocolEncoder",
      "org.traccar.protocol.XexunProtocolEncoder",
      "org.traccar.protocol.GranitProtocolSmsEncoder",
      "org.traccar.protocol.WialonProtocolEncoder",
      "org.traccar.protocol.MiniFinderProtocolEncoder"
    );
  }
}
