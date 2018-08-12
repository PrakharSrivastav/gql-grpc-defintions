package no.sysco.middleware.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.13.1)",
    comments = "Source: album.proto")
public final class AlbumServiceGrpc {

  private AlbumServiceGrpc() {}

  public static final String SERVICE_NAME = "no.sysco.middleware.grpc.AlbumService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      no.sysco.middleware.grpc.AlbumBaseDefinition.Album> getGetAllMethod;

  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      no.sysco.middleware.grpc.AlbumBaseDefinition.Album> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, no.sysco.middleware.grpc.AlbumBaseDefinition.Album> getGetAllMethod;
    if ((getGetAllMethod = AlbumServiceGrpc.getGetAllMethod) == null) {
      synchronized (AlbumServiceGrpc.class) {
        if ((getGetAllMethod = AlbumServiceGrpc.getGetAllMethod) == null) {
          AlbumServiceGrpc.getGetAllMethod = getGetAllMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, no.sysco.middleware.grpc.AlbumBaseDefinition.Album>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "no.sysco.middleware.grpc.AlbumService", "GetAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  no.sysco.middleware.grpc.AlbumBaseDefinition.Album.getDefaultInstance()))
                  .setSchemaDescriptor(new AlbumServiceMethodDescriptorSupplier("GetAll"))
                  .build();
          }
        }
     }
     return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<no.sysco.middleware.grpc.AlbumBaseDefinition.SimpleAlbumRequest,
      no.sysco.middleware.grpc.AlbumBaseDefinition.Album> getGetAlbumByArtistMethod;

  public static io.grpc.MethodDescriptor<no.sysco.middleware.grpc.AlbumBaseDefinition.SimpleAlbumRequest,
      no.sysco.middleware.grpc.AlbumBaseDefinition.Album> getGetAlbumByArtistMethod() {
    io.grpc.MethodDescriptor<no.sysco.middleware.grpc.AlbumBaseDefinition.SimpleAlbumRequest, no.sysco.middleware.grpc.AlbumBaseDefinition.Album> getGetAlbumByArtistMethod;
    if ((getGetAlbumByArtistMethod = AlbumServiceGrpc.getGetAlbumByArtistMethod) == null) {
      synchronized (AlbumServiceGrpc.class) {
        if ((getGetAlbumByArtistMethod = AlbumServiceGrpc.getGetAlbumByArtistMethod) == null) {
          AlbumServiceGrpc.getGetAlbumByArtistMethod = getGetAlbumByArtistMethod = 
              io.grpc.MethodDescriptor.<no.sysco.middleware.grpc.AlbumBaseDefinition.SimpleAlbumRequest, no.sysco.middleware.grpc.AlbumBaseDefinition.Album>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "no.sysco.middleware.grpc.AlbumService", "GetAlbumByArtist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  no.sysco.middleware.grpc.AlbumBaseDefinition.SimpleAlbumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  no.sysco.middleware.grpc.AlbumBaseDefinition.Album.getDefaultInstance()))
                  .setSchemaDescriptor(new AlbumServiceMethodDescriptorSupplier("GetAlbumByArtist"))
                  .build();
          }
        }
     }
     return getGetAlbumByArtistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<no.sysco.middleware.grpc.AlbumBaseDefinition.SimpleAlbumRequest,
      no.sysco.middleware.grpc.AlbumBaseDefinition.Album> getGetAlbumByTrackMethod;

  public static io.grpc.MethodDescriptor<no.sysco.middleware.grpc.AlbumBaseDefinition.SimpleAlbumRequest,
      no.sysco.middleware.grpc.AlbumBaseDefinition.Album> getGetAlbumByTrackMethod() {
    io.grpc.MethodDescriptor<no.sysco.middleware.grpc.AlbumBaseDefinition.SimpleAlbumRequest, no.sysco.middleware.grpc.AlbumBaseDefinition.Album> getGetAlbumByTrackMethod;
    if ((getGetAlbumByTrackMethod = AlbumServiceGrpc.getGetAlbumByTrackMethod) == null) {
      synchronized (AlbumServiceGrpc.class) {
        if ((getGetAlbumByTrackMethod = AlbumServiceGrpc.getGetAlbumByTrackMethod) == null) {
          AlbumServiceGrpc.getGetAlbumByTrackMethod = getGetAlbumByTrackMethod = 
              io.grpc.MethodDescriptor.<no.sysco.middleware.grpc.AlbumBaseDefinition.SimpleAlbumRequest, no.sysco.middleware.grpc.AlbumBaseDefinition.Album>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "no.sysco.middleware.grpc.AlbumService", "GetAlbumByTrack"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  no.sysco.middleware.grpc.AlbumBaseDefinition.SimpleAlbumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  no.sysco.middleware.grpc.AlbumBaseDefinition.Album.getDefaultInstance()))
                  .setSchemaDescriptor(new AlbumServiceMethodDescriptorSupplier("GetAlbumByTrack"))
                  .build();
          }
        }
     }
     return getGetAlbumByTrackMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AlbumServiceStub newStub(io.grpc.Channel channel) {
    return new AlbumServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AlbumServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AlbumServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AlbumServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AlbumServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AlbumServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.AlbumBaseDefinition.Album> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     */
    public void getAlbumByArtist(no.sysco.middleware.grpc.AlbumBaseDefinition.SimpleAlbumRequest request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.AlbumBaseDefinition.Album> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAlbumByArtistMethod(), responseObserver);
    }

    /**
     */
    public void getAlbumByTrack(no.sysco.middleware.grpc.AlbumBaseDefinition.SimpleAlbumRequest request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.AlbumBaseDefinition.Album> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAlbumByTrackMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                no.sysco.middleware.grpc.AlbumBaseDefinition.Album>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getGetAlbumByArtistMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                no.sysco.middleware.grpc.AlbumBaseDefinition.SimpleAlbumRequest,
                no.sysco.middleware.grpc.AlbumBaseDefinition.Album>(
                  this, METHODID_GET_ALBUM_BY_ARTIST)))
          .addMethod(
            getGetAlbumByTrackMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                no.sysco.middleware.grpc.AlbumBaseDefinition.SimpleAlbumRequest,
                no.sysco.middleware.grpc.AlbumBaseDefinition.Album>(
                  this, METHODID_GET_ALBUM_BY_TRACK)))
          .build();
    }
  }

  /**
   */
  public static final class AlbumServiceStub extends io.grpc.stub.AbstractStub<AlbumServiceStub> {
    private AlbumServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlbumServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlbumServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlbumServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.AlbumBaseDefinition.Album> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAlbumByArtist(no.sysco.middleware.grpc.AlbumBaseDefinition.SimpleAlbumRequest request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.AlbumBaseDefinition.Album> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAlbumByArtistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAlbumByTrack(no.sysco.middleware.grpc.AlbumBaseDefinition.SimpleAlbumRequest request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.AlbumBaseDefinition.Album> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAlbumByTrackMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AlbumServiceBlockingStub extends io.grpc.stub.AbstractStub<AlbumServiceBlockingStub> {
    private AlbumServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlbumServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlbumServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlbumServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<no.sysco.middleware.grpc.AlbumBaseDefinition.Album> getAll(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<no.sysco.middleware.grpc.AlbumBaseDefinition.Album> getAlbumByArtist(
        no.sysco.middleware.grpc.AlbumBaseDefinition.SimpleAlbumRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAlbumByArtistMethod(), getCallOptions(), request);
    }

    /**
     */
    public no.sysco.middleware.grpc.AlbumBaseDefinition.Album getAlbumByTrack(no.sysco.middleware.grpc.AlbumBaseDefinition.SimpleAlbumRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAlbumByTrackMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AlbumServiceFutureStub extends io.grpc.stub.AbstractStub<AlbumServiceFutureStub> {
    private AlbumServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlbumServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlbumServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlbumServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<no.sysco.middleware.grpc.AlbumBaseDefinition.Album> getAlbumByTrack(
        no.sysco.middleware.grpc.AlbumBaseDefinition.SimpleAlbumRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAlbumByTrackMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL = 0;
  private static final int METHODID_GET_ALBUM_BY_ARTIST = 1;
  private static final int METHODID_GET_ALBUM_BY_TRACK = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AlbumServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AlbumServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.AlbumBaseDefinition.Album>) responseObserver);
          break;
        case METHODID_GET_ALBUM_BY_ARTIST:
          serviceImpl.getAlbumByArtist((no.sysco.middleware.grpc.AlbumBaseDefinition.SimpleAlbumRequest) request,
              (io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.AlbumBaseDefinition.Album>) responseObserver);
          break;
        case METHODID_GET_ALBUM_BY_TRACK:
          serviceImpl.getAlbumByTrack((no.sysco.middleware.grpc.AlbumBaseDefinition.SimpleAlbumRequest) request,
              (io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.AlbumBaseDefinition.Album>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AlbumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AlbumServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return no.sysco.middleware.grpc.AlbumBaseDefinition.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AlbumService");
    }
  }

  private static final class AlbumServiceFileDescriptorSupplier
      extends AlbumServiceBaseDescriptorSupplier {
    AlbumServiceFileDescriptorSupplier() {}
  }

  private static final class AlbumServiceMethodDescriptorSupplier
      extends AlbumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AlbumServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AlbumServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AlbumServiceFileDescriptorSupplier())
              .addMethod(getGetAllMethod())
              .addMethod(getGetAlbumByArtistMethod())
              .addMethod(getGetAlbumByTrackMethod())
              .build();
        }
      }
    }
    return result;
  }
}
