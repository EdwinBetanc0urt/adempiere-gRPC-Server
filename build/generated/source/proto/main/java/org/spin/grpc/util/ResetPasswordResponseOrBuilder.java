// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: enrollment.proto

package org.spin.grpc.util;

public interface ResetPasswordResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:enrollment.ResetPasswordResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string token = 1;</code>
   */
  java.lang.String getToken();
  /**
   * <code>string token = 1;</code>
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <code>.enrollment.ResetPasswordResponse.ResponseType responseType = 2;</code>
   */
  int getResponseTypeValue();
  /**
   * <code>.enrollment.ResetPasswordResponse.ResponseType responseType = 2;</code>
   */
  org.spin.grpc.util.ResetPasswordResponse.ResponseType getResponseType();
}