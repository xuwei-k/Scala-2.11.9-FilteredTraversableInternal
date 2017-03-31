- https://github.com/scala/scala/commit/eb5c51383a63c5c3420e53ef021607ff5fd20296
- https://github.com/scala-js/scala-js/issues/2847#issuecomment-290758175


### sbt 0.13.11

https://travis-ci.org/xuwei-k/Scala-2.11.9-FilteredTraversableInternal/jobs/217396178#L374

```
[error] (run-main-0) java.lang.ClassCastException: scala.collection.immutable.$colon$colon cannot be cast to scala.collection.immutable.FilteredTraversableInternal
java.lang.ClassCastException: scala.collection.immutable.$colon$colon cannot be cast to scala.collection.immutable.FilteredTraversableInternal
	at com.example.A$.foo(A.scala:4)
	at com.example.Main$.main(Main.scala:5)
	at com.example.Main.main(Main.scala)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
```

### sbt 0.13.13

https://travis-ci.org/xuwei-k/Scala-2.11.9-FilteredTraversableInternal/jobs/217396179#L373

```
[error] (run-main-0) java.lang.NoClassDefFoundError: scala/collection/immutable/FilteredTraversableInternal
java.lang.NoClassDefFoundError: scala/collection/immutable/FilteredTraversableInternal
	at com.example.A$.foo(A.scala:4)
	at com.example.Main$.main(Main.scala:5)
	at com.example.Main.main(Main.scala)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
Caused by: java.lang.ClassNotFoundException: scala.collection.immutable.FilteredTraversableInternal
	at java.net.URLClassLoader$1.run(URLClassLoader.java:366)
	at java.net.URLClassLoader$1.run(URLClassLoader.java:355)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.net.URLClassLoader.findClass(URLClassLoader.java:354)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:425)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:358)
	at com.example.A$.foo(A.scala:4)
	at com.example.Main$.main(Main.scala:5)
	at com.example.Main.main(Main.scala)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
```
