package com.example.android.architecture.blueprints.todoapp.addedittask;

import androidx.lifecycle.SavedStateHandle;
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
public final class AddEditTaskViewModel_Factory implements Factory<AddEditTaskViewModel> {
  private final Provider<TaskRepository> taskRepositoryProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public AddEditTaskViewModel_Factory(Provider<TaskRepository> taskRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.taskRepositoryProvider = taskRepositoryProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public AddEditTaskViewModel get() {
    return newInstance(taskRepositoryProvider.get(), savedStateHandleProvider.get());
  }

  public static AddEditTaskViewModel_Factory create(Provider<TaskRepository> taskRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new AddEditTaskViewModel_Factory(taskRepositoryProvider, savedStateHandleProvider);
  }

  public static AddEditTaskViewModel newInstance(TaskRepository taskRepository,
      SavedStateHandle savedStateHandle) {
    return new AddEditTaskViewModel(taskRepository, savedStateHandle);
  }
}
