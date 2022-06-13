# Brute-Force-Navigation-App
A navigation app to show the closest points to the user 

The Task:

You are a junior software engineer working at a global company that is known around 
the world for its navigation software Navi Maps. They are now trying to implement a new 
feature called "closest places".

With this feature, users can request a number of unique 
travel locations based on the closest distance to where the user stands. For this approach 
the app must mark user location as (0, 0), and based on given input distances, it should 
select x number of closest locations. For example, if the travel locations are limited like 
(3, 3), (5, -5), and (-1, 1) and if the user wants to see the closest x = 2 locations the system 
should give (-1, 1) and (3, 3) as output (since those are the closest locations to the user 
which stands in (0, 0)).


We also know that the point locations contain only integers (which will be in a form of 
an array with n*2 elements), and in one point there can only be one unique travel 
location. Also, when we are listing the outputs, we don't need to consider which of the x 
points are the closest or farthest locations. For example, outputs of both ((-1, 1), (3, 3)) 
and ((3, 3), (-1, 1)) are correct.
