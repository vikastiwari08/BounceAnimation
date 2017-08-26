# BounceAnimation
BounceAnimation is an android Button bounce animaton library built on top of Interpolator, using the app you will be able to apply a coool! Animation on your Button or another view 

# Screenshots
<div align="center">

<img width="50%" src="https://3.bp.blogspot.com/-8nWl20jpt7g/WXwzDBikFaI/AAAAAAAAOl8/g85rJfEeomcBCtnZr76tkDhbP_RtYD8NwCLcBGAs/s1600/ezgif.com-crop.gif" alt="Bounce Animation" title="Bounce Animation"></img>
</div>

# Using this library
- If you are using android studio, add the dependency to your main app build.gradle this way: 
```
compile project(':BounceAnimaton')
```

- In your activity or fragment when you want to apply want to apply Bounce Animation on Button or any view :</br>
Just create a object of UltimateAnimator class call the methods of class, below is the sample code snippet:</br>
Note: You have to pass your view object and duration as parametrers with in methods.
```java
       final ImageButton button = (ImageButton) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UltimateAnimator ultimateAnimator = new UltimateAnimator(MainActivity.this);
                // for both Squeeze and bounce animation
                ultimateAnimator.startSqueezeBounceAnimation(button,500);
                  // for bounce animation only
                ultimateAnimator.startBounceAnimation(button,500);
            }
        });
```
- for more details [Click Here](https://ultimatedevil17.blogspot.in/2017/07/how-to-apply-bounceanimation-on-button.html)
