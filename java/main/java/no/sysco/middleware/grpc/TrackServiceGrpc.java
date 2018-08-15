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
    comments = "Source: track.proto")
public final class TrackServiceGrpc {

  private TrackServiceGrpc() {}

  public static final String SERVICE_NAME = "no.sysco.middleware.grpc.TrackService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest,
      no.sysco.middleware.grpc.TrackBaseDefinition.Track> getGetMethod;

  public static io.grpc.MethodDescriptor<no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest,
      no.sysco.middleware.grpc.TrackBaseDefinition.Track> getGetMethod() {
    io.grpc.MethodDescriptor<no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest, no.sysco.middleware.grpc.TrackBaseDefinition.Track> getGetMethod;
    if ((getGetMethod = TrackServiceGrpc.getGetMethod) == null) {
      synchronized (TrackServiceGrpc.class) {
        if ((getGetMethod = TrackServiceGrpc.getGetMethod) == null) {
          TrackServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest, no.sysco.middleware.grpc.TrackBaseDefinition.Track>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "no.sysco.middleware.grpc.TrackService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  no.sysco.middleware.grpc.TrackBaseDefinition.Track.getDefaultInstance()))
                  .setSchemaDescriptor(new TrackServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      no.sysco.middleware.grpc.TrackBaseDefinition.Track> getGetAllMethod;

  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      no.sysco.middleware.grpc.TrackBaseDefinition.Track> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, no.sysco.middleware.grpc.TrackBaseDefinition.Track> getGetAllMethod;
    if ((getGetAllMethod = TrackServiceGrpc.getGetAllMethod) == null) {
      synchronized (TrackServiceGrpc.class) {
        if ((getGetAllMethod = TrackServiceGrpc.getGetAllMethod) == null) {
          TrackServiceGrpc.getGetAllMethod = getGetAllMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, no.sysco.middleware.grpc.TrackBaseDefinition.Track>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "no.sysco.middleware.grpc.TrackService", "GetAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  no.sysco.middleware.grpc.TrackBaseDefinition.Track.getDefaultInstance()))
                  .setSchemaDescriptor(new TrackServiceMethodDescriptorSupplier("GetAll"))
                  .build();
          }
        }
     }
     return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest,
      no.sysco.middleware.grpc.TrackBaseDefinition.Track> getGetTrackByAlbumMethod;

  public static io.grpc.MethodDescriptor<no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest,
      no.sysco.middleware.grpc.TrackBaseDefinition.Track> getGetTrackByAlbumMethod() {
    io.grpc.MethodDescriptor<no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest, no.sysco.middleware.grpc.TrackBaseDefinition.Track> getGetTrackByAlbumMethod;
    if ((getGetTrackByAlbumMethod = TrackServiceGrpc.getGetTrackByAlbumMethod) == null) {
      synchronized (TrackServiceGrpc.class) {
        if ((getGetTrackByAlbumMethod = TrackServiceGrpc.getGetTrackByAlbumMethod) == null) {
          TrackServiceGrpc.getGetTrackByAlbumMethod = getGetTrackByAlbumMethod = 
              io.grpc.MethodDescriptor.<no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest, no.sysco.middleware.grpc.TrackBaseDefinition.Track>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "no.sysco.middleware.grpc.TrackService", "GetTrackByAlbum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  no.sysco.middleware.grpc.TrackBaseDefinition.Track.getDefaultInstance()))
                  .setSchemaDescriptor(new TrackServiceMethodDescriptorSupplier("GetTrackByAlbum"))
                  .build();
          }
        }
     }
     return getGetTrackByAlbumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest,
      no.sysco.middleware.grpc.TrackBaseDefinition.Track> getGetTrackByArtistMethod;

  public static io.grpc.MethodDescriptor<no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest,
      no.sysco.middleware.grpc.TrackBaseDefinition.Track> getGetTrackByArtistMethod() {
    io.grpc.MethodDescriptor<no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest, no.sysco.middleware.grpc.TrackBaseDefinition.Track> getGetTrackByArtistMethod;
    if ((getGetTrackByArtistMethod = TrackServiceGrpc.getGetTrackByArtistMethod) == null) {
      synchronized (TrackServiceGrpc.class) {
        if ((getGetTrackByArtistMethod = TrackServiceGrpc.getGetTrackByArtistMethod) == null) {
          TrackServiceGrpc.getGetTrackByArtistMethod = getGetTrackByArtistMethod = 
              io.grpc.MethodDescriptor.<no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest, no.sysco.middleware.grpc.TrackBaseDefinition.Track>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "no.sysco.middleware.grpc.TrackService", "GetTrackByArtist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  no.sysco.middleware.grpc.TrackBaseDefinition.Track.getDefaultInstance()))
                  .setSchemaDescriptor(new TrackServiceMethodDescriptorSupplier("GetTrackByArtist"))
                  .build();
          }
        }
     }
     return getGetTrackByArtistMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrackServiceStub newStub(io.grpc.Channel channel) {
    return new TrackServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrackServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TrackServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrackServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TrackServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TrackServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.TrackBaseDefinition.Track> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void getAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.TrackBaseDefinition.Track> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     */
    public void getTrackByAlbum(no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.TrackBaseDefinition.Track> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTrackByAlbumMethod(), responseObserver);
    }

    /**
     */
    public void getTrackByArtist(no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.TrackBaseDefinition.Track> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTrackByArtistMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest,
                no.sysco.middleware.grpc.TrackBaseDefinition.Track>(
                  this, METHODID_GET)))
          .addMethod(
            getGetAllMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                no.sysco.middleware.grpc.TrackBaseDefinition.Track>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getGetTrackByAlbumMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest,
                no.sysco.middleware.grpc.TrackBaseDefinition.Track>(
                  this, METHODID_GET_TRACK_BY_ALBUM)))
          .addMethod(
            getGetTrackByArtistMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest,
                no.sysco.middleware.grpc.TrackBaseDefinition.Track>(
                  this, METHODID_GET_TRACK_BY_ARTIST)))
          .build();
    }
  }

  /**
   */
  public static final class TrackServiceStub extends io.grpc.stub.AbstractStub<TrackServiceStub> {
    private TrackServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrackServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrackServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrackServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.TrackBaseDefinition.Track> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.TrackBaseDefinition.Track> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTrackByAlbum(no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.TrackBaseDefinition.Track> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetTrackByAlbumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTrackByArtist(no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.TrackBaseDefinition.Track> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetTrackByArtistMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TrackServiceBlockingStub extends io.grpc.stub.AbstractStub<TrackServiceBlockingStub> {
    private TrackServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrackServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrackServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrackServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public no.sysco.middleware.grpc.TrackBaseDefinition.Track get(no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<no.sysco.middleware.grpc.TrackBaseDefinition.Track> getAll(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<no.sysco.middleware.grpc.TrackBaseDefinition.Track> getTrackByAlbum(
        no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetTrackByAlbumMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<no.sysco.middleware.grpc.TrackBaseDefinition.Track> getTrackByArtist(
        no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetTrackByArtistMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TrackServiceFutureStub extends io.grpc.stub.AbstractStub<TrackServiceFutureStub> {
    private TrackServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrackServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrackServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrackServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<no.sysco.middleware.grpc.TrackBaseDefinition.Track> get(
        no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_GET_ALL = 1;
  private static final int METHODID_GET_TRACK_BY_ALBUM = 2;
  private static final int METHODID_GET_TRACK_BY_ARTIST = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrackServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrackServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest) request,
              (io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.TrackBaseDefinition.Track>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.TrackBaseDefinition.Track>) responseObserver);
          break;
        case METHODID_GET_TRACK_BY_ALBUM:
          serviceImpl.getTrackByAlbum((no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest) request,
              (io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.TrackBaseDefinition.Track>) responseObserver);
          break;
        case METHODID_GET_TRACK_BY_ARTIST:
          serviceImpl.getTrackByArtist((no.sysco.middleware.grpc.TrackBaseDefinition.SimpleTrackRequest) request,
              (io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.TrackBaseDefinition.Track>) responseObserver);
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

  private static abstract class TrackServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrackServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return no.sysco.middleware.grpc.TrackBaseDefinition.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrackService");
    }
  }

  private static final class TrackServiceFileDescriptorSupplier
      extends TrackServiceBaseDescriptorSupplier {
    TrackServiceFileDescriptorSupplier() {}
  }

  private static final class TrackServiceMethodDescriptorSupplier
      extends TrackServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrackServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TrackServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrackServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getGetAllMethod())
              .addMethod(getGetTrackByAlbumMethod())
              .addMethod(getGetTrackByArtistMethod())
              .build();
        }
      }
    }
    return result;
  }
}
