package com.example.android.architecture.blueprints.todoapp.di;

import android.content.Context;
import com.example.android.architecture.blueprints.todoapp.data.source.local.ToDoDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class DatabaseModule_ProvideDataBaseFactory implements Factory<ToDoDatabase> {
  private final Provider<Context> contextProvider;

  public DatabaseModule_ProvideDataBaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ToDoDatabase get() {
    return provideDataBase(contextProvider.get());
  }

  public static DatabaseModule_ProvideDataBaseFactory create(Provider<Context> contextProvider) {
    return new DatabaseModule_ProvideDataBaseFactory(contextProvider);
  }

  public static ToDoDatabase provideDataBase(Context context) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideDataBase(context));
  }
}
