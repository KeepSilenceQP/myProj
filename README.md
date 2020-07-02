# myProj
Android Jetpack Demo &amp; Exercise.

Welcome to modern Android development world!

## module

- app

  - practice ViewModel and ViewBinding with Java.
  
  - ViewModel makes data free from lifecycle.
  
  - ViewBinding with Java just like synthetic in Kotlin.
  
  - need enable viewBinding option in gradle. And other dependency also avaliable in gradle file.

- databindingdemo

  - Databinding basic usage with Java
  
      enable option in gradle, then transform layout file to with data segment.
      
      make use of DataBindingUtil to set content view and retrieve binding object.
      
      access View widget and data through binding object.
      
      directly update binding variable will trigger corresponding View refresh (Databinding inner support one-way data binding mechanism).

  - use ViewModel and DataBinding with Kotlin
  
      compare DataBinding with synthetic in Kotlin.
      
      necessary setting avaliable in gradle file, including java version config for Kotlin.
      
      one-way data binding with ObservableField.
  
  - two-way data binding
  
      very simple to use!
      
      ``` java
      android:text="@={user.name}"
      ```
  
  - method binding
  
      with lambda expression, binding method so simple and flexible.
  
  - BindingAdapter
  
      expand original property of widget.
      
      basic usage.
