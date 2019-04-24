// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/resource.proto

package com.google.api;

public interface ResourceReferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.ResourceReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unified resource type name of the type that this field references.
   * Marks this as a field referring to a resource in another message.
   * Example:
   *   message Subscription {
   *     string topic = 2 [(google.api.resource_reference) = {
   *       type = "pubsub.googleapis.com/Topic"
   *     }];
   *   }
   * </pre>
   *
   * <code>string type = 1;</code>
   */
  java.lang.String getType();
  /**
   * <pre>
   * The unified resource type name of the type that this field references.
   * Marks this as a field referring to a resource in another message.
   * Example:
   *   message Subscription {
   *     string topic = 2 [(google.api.resource_reference) = {
   *       type = "pubsub.googleapis.com/Topic"
   *     }];
   *   }
   * </pre>
   *
   * <code>string type = 1;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * The fully-qualified message name of a child of the type that this field
   * references.
   * This is useful for `parent` fields where a resource has more than one
   * possible type of parent.
   * Example:
   *   message ListLogEntriesRequest {
   *     string parent = 1 [(google.api.resource_reference) = {
   *       child_type: "logging.googleapis.com/LogEntry"
   *     };
   *   }
   * If the referenced message is in the same proto package, the service name
   * may be omitted:
   *   message ListLogEntriesRequest {
   *     string parent = 1
   *       [(google.api.resource_reference).child_type = "LogEntry"];
   *   }
   * </pre>
   *
   * <code>string child_type = 2;</code>
   */
  java.lang.String getChildType();
  /**
   * <pre>
   * The fully-qualified message name of a child of the type that this field
   * references.
   * This is useful for `parent` fields where a resource has more than one
   * possible type of parent.
   * Example:
   *   message ListLogEntriesRequest {
   *     string parent = 1 [(google.api.resource_reference) = {
   *       child_type: "logging.googleapis.com/LogEntry"
   *     };
   *   }
   * If the referenced message is in the same proto package, the service name
   * may be omitted:
   *   message ListLogEntriesRequest {
   *     string parent = 1
   *       [(google.api.resource_reference).child_type = "LogEntry"];
   *   }
   * </pre>
   *
   * <code>string child_type = 2;</code>
   */
  com.google.protobuf.ByteString
      getChildTypeBytes();
}
