package com.example.android.architecture.blueprints.todoapp.data.source.network;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class TaskNetworkDataSource_Factory implements Factory<TaskNetworkDataSource> {
  @Override
  public TaskNetworkDataSource get() {
    return newInstance();
  }

  public static TaskNetworkDataSource_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static TaskNetworkDataSource newInstance() {
    return new TaskNetworkDataSource();
  }

  private static final class InstanceHolder {
    private static final TaskNetworkDataSource_Factory INSTANCE = new TaskNetworkDataSource_Factory();
  }
}
