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
    comments = "Source: artist.proto")
public final class ArtistServiceGrpc {

  private ArtistServiceGrpc() {}

  public static final String SERVICE_NAME = "no.sysco.middleware.grpc.ArtistService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest,
      no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> getGetMethod;

  public static io.grpc.MethodDescriptor<no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest,
      no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> getGetMethod() {
    io.grpc.MethodDescriptor<no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest, no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> getGetMethod;
    if ((getGetMethod = ArtistServiceGrpc.getGetMethod) == null) {
      synchronized (ArtistServiceGrpc.class) {
        if ((getGetMethod = ArtistServiceGrpc.getGetMethod) == null) {
          ArtistServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest, no.sysco.middleware.grpc.ArtistBaseDefinition.Artist>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "no.sysco.middleware.grpc.ArtistService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  no.sysco.middleware.grpc.ArtistBaseDefinition.Artist.getDefaultInstance()))
                  .setSchemaDescriptor(new ArtistServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> getGetAllMethod;

  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> getGetAllMethod;
    if ((getGetAllMethod = ArtistServiceGrpc.getGetAllMethod) == null) {
      synchronized (ArtistServiceGrpc.class) {
        if ((getGetAllMethod = ArtistServiceGrpc.getGetAllMethod) == null) {
          ArtistServiceGrpc.getGetAllMethod = getGetAllMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, no.sysco.middleware.grpc.ArtistBaseDefinition.Artist>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "no.sysco.middleware.grpc.ArtistService", "GetAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  no.sysco.middleware.grpc.ArtistBaseDefinition.Artist.getDefaultInstance()))
                  .setSchemaDescriptor(new ArtistServiceMethodDescriptorSupplier("GetAll"))
                  .build();
          }
        }
     }
     return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest,
      no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> getGetArtistByAlbumMethod;

  public static io.grpc.MethodDescriptor<no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest,
      no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> getGetArtistByAlbumMethod() {
    io.grpc.MethodDescriptor<no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest, no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> getGetArtistByAlbumMethod;
    if ((getGetArtistByAlbumMethod = ArtistServiceGrpc.getGetArtistByAlbumMethod) == null) {
      synchronized (ArtistServiceGrpc.class) {
        if ((getGetArtistByAlbumMethod = ArtistServiceGrpc.getGetArtistByAlbumMethod) == null) {
          ArtistServiceGrpc.getGetArtistByAlbumMethod = getGetArtistByAlbumMethod = 
              io.grpc.MethodDescriptor.<no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest, no.sysco.middleware.grpc.ArtistBaseDefinition.Artist>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "no.sysco.middleware.grpc.ArtistService", "GetArtistByAlbum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  no.sysco.middleware.grpc.ArtistBaseDefinition.Artist.getDefaultInstance()))
                  .setSchemaDescriptor(new ArtistServiceMethodDescriptorSupplier("GetArtistByAlbum"))
                  .build();
          }
        }
     }
     return getGetArtistByAlbumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest,
      no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> getGetArtistByTrackMethod;

  public static io.grpc.MethodDescriptor<no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest,
      no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> getGetArtistByTrackMethod() {
    io.grpc.MethodDescriptor<no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest, no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> getGetArtistByTrackMethod;
    if ((getGetArtistByTrackMethod = ArtistServiceGrpc.getGetArtistByTrackMethod) == null) {
      synchronized (ArtistServiceGrpc.class) {
        if ((getGetArtistByTrackMethod = ArtistServiceGrpc.getGetArtistByTrackMethod) == null) {
          ArtistServiceGrpc.getGetArtistByTrackMethod = getGetArtistByTrackMethod = 
              io.grpc.MethodDescriptor.<no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest, no.sysco.middleware.grpc.ArtistBaseDefinition.Artist>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "no.sysco.middleware.grpc.ArtistService", "GetArtistByTrack"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  no.sysco.middleware.grpc.ArtistBaseDefinition.Artist.getDefaultInstance()))
                  .setSchemaDescriptor(new ArtistServiceMethodDescriptorSupplier("GetArtistByTrack"))
                  .build();
          }
        }
     }
     return getGetArtistByTrackMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ArtistServiceStub newStub(io.grpc.Channel channel) {
    return new ArtistServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ArtistServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ArtistServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ArtistServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ArtistServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ArtistServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void getAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     */
    public void getArtistByAlbum(no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> responseObserver) {
      asyncUnimplementedUnaryCall(getGetArtistByAlbumMethod(), responseObserver);
    }

    /**
     */
    public void getArtistByTrack(no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> responseObserver) {
      asyncUnimplementedUnaryCall(getGetArtistByTrackMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest,
                no.sysco.middleware.grpc.ArtistBaseDefinition.Artist>(
                  this, METHODID_GET)))
          .addMethod(
            getGetAllMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                no.sysco.middleware.grpc.ArtistBaseDefinition.Artist>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getGetArtistByAlbumMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest,
                no.sysco.middleware.grpc.ArtistBaseDefinition.Artist>(
                  this, METHODID_GET_ARTIST_BY_ALBUM)))
          .addMethod(
            getGetArtistByTrackMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest,
                no.sysco.middleware.grpc.ArtistBaseDefinition.Artist>(
                  this, METHODID_GET_ARTIST_BY_TRACK)))
          .build();
    }
  }

  /**
   */
  public static final class ArtistServiceStub extends io.grpc.stub.AbstractStub<ArtistServiceStub> {
    private ArtistServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArtistServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArtistServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArtistServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getArtistByAlbum(no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetArtistByAlbumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getArtistByTrack(no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest request,
        io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetArtistByTrackMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ArtistServiceBlockingStub extends io.grpc.stub.AbstractStub<ArtistServiceBlockingStub> {
    private ArtistServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArtistServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArtistServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArtistServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public no.sysco.middleware.grpc.ArtistBaseDefinition.Artist get(no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> getAll(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> getArtistByAlbum(
        no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetArtistByAlbumMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> getArtistByTrack(
        no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetArtistByTrackMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ArtistServiceFutureStub extends io.grpc.stub.AbstractStub<ArtistServiceFutureStub> {
    private ArtistServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArtistServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArtistServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArtistServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<no.sysco.middleware.grpc.ArtistBaseDefinition.Artist> get(
        no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_GET_ALL = 1;
  private static final int METHODID_GET_ARTIST_BY_ALBUM = 2;
  private static final int METHODID_GET_ARTIST_BY_TRACK = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ArtistServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ArtistServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest) request,
              (io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.ArtistBaseDefinition.Artist>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.ArtistBaseDefinition.Artist>) responseObserver);
          break;
        case METHODID_GET_ARTIST_BY_ALBUM:
          serviceImpl.getArtistByAlbum((no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest) request,
              (io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.ArtistBaseDefinition.Artist>) responseObserver);
          break;
        case METHODID_GET_ARTIST_BY_TRACK:
          serviceImpl.getArtistByTrack((no.sysco.middleware.grpc.ArtistBaseDefinition.SimpleArtistRequest) request,
              (io.grpc.stub.StreamObserver<no.sysco.middleware.grpc.ArtistBaseDefinition.Artist>) responseObserver);
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

  private static abstract class ArtistServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ArtistServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return no.sysco.middleware.grpc.ArtistBaseDefinition.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ArtistService");
    }
  }

  private static final class ArtistServiceFileDescriptorSupplier
      extends ArtistServiceBaseDescriptorSupplier {
    ArtistServiceFileDescriptorSupplier() {}
  }

  private static final class ArtistServiceMethodDescriptorSupplier
      extends ArtistServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ArtistServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ArtistServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ArtistServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getGetAllMethod())
              .addMethod(getGetArtistByAlbumMethod())
              .addMethod(getGetArtistByTrackMethod())
              .build();
        }
      }
    }
    return result;
  }
}
