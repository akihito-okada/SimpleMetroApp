# Simple Metro Application

This project demonstrates a minimal Android app using Metro, a compile-time dependency injection framework for Kotlin.

The app shows how to:

- Define a dependency graph with @DependencyGraph
- Provide dependencies using @Provides
- Create the graph at application startup
- Inject dependencies into a ViewModel
- Use the graph from Compose
- Support Compose Preview with a simple fallback graph

Metro generates all DI wiring at compile time via a Kotlin compiler plugin, keeping the runtime lightweight and free of reflection or annotation processors.

Check the source for the full implementation.

