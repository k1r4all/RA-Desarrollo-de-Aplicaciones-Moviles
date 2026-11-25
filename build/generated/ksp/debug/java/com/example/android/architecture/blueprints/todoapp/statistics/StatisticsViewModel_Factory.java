package com.example.android.architecture.blueprints.todoapp.statistics;

import com.example.android.architecture.blueprints.todoapp.data.TaskRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class StatisticsViewModel_Factory implements Factory<StatisticsViewModel> {
  private final Provider<TaskRepository> taskRepositoryProvider;

  public StatisticsViewModel_Factory(Provider<TaskRepository> taskRepositoryProvider) {
    this.taskRepositoryProvider = taskRepositoryProvider;
  }

  @Override
  public StatisticsViewModel get() {
    return newInstance(taskRepositoryProvider.get());
  }

  public static StatisticsViewModel_Factory create(
      Provider<TaskRepository> taskRepositoryProvider) {
    return new StatisticsViewModel_Factory(taskRepositoryProvider);
  }

  public static StatisticsViewModel newInstance(TaskRepository taskRepository) {
    return new StatisticsViewModel(taskRepository);
  }
}
