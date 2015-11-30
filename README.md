
### Triangle view  ###
A Triangle View with 4 directions and an editable color 

### How do I get set up? ###

You Can simply import the Triangle View module.

or Copy The TriangleView.java and Attrs.xml to your project 

### How to use ? ###
Via XML 

```
#!XML

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    xmlns:app="http://schemas.android.com/apk/res-auto">


    <com.abodeltae.triangleview.TriangleView
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:layout_margin="10dp"
        app:mDirection="North"
        app:mColor="@color/colorAccent"
        
        />

</LinearLayout>
```
Proprties With XML : 

```
#!xml

app:mDirection="North|South|East|West"
app:mColor="@color/myColor"
```

Properties with Code

```
#!JAVA

TriangleView triangleView =(TriangleView)findViewById(R.id.triangleView);
        triangleView.setDirection(TriangleView.Direction.EAST);
        triangleView.setColor(Color.BLACK);
```




### Credits  ###
This was inspired from Ahmed Ghoneim's answer on [This Link](http://stackoverflow.com/a/18191340/4649740) 