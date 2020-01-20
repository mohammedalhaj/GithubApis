## Github Api Documentation

The project goal is to test the github position api using different parameters.

Created using the following:

> ```
>     1- Java
>     2- Maven Project
>     3- Junit library
>     4- Cucumber BDD


In order to test the APIS we covered the following testing types:
> ```
>     1- Smoke testing
>     2- Functional testing

We added 18 scenarios and 54 test cases using the 'Examples:' to cover more data, including all the testing types that we follows as the following:

###### Smoke testing. 


> ``` We added 7 smoke test scenarios as below:
>     1-Verify searching all positions.
>     2-Verify the position returned using the markdown parameter.
>     3-Verify the position returned using the full time parameter.
>     4-Verify the position returned using the lat and long parameters.
>     5-Verify the position returned using the location parameter.
>     6-Verify the position returned using the description parameter.
>     7-Verify the position returned using the description parameter.
> ```


###### Functional testing. 


> ``` We added 11 functional testing scenarios as below:
>     1-Verify the position returned using the lat And long And full_time parameters.
>     2-Verify the position returned using the lat And Invalid long And full_time parameters.
>     3-Verify the position not returned using INVALID lat And long And full_time parameters.
>     4-Verify the position returned using the valid description data.
>     5-Verify the position returned using valid location data.
>     6-Verify the position is not return using INVALID location data.
>     7-Verify the position returned using valid location cityname.
>     8-Verify the position is returned using  location zipcode.
>     9-Verify the position returned using valid page number.
>     10-Verify the position not returned using INVALID page number.
>     11-Verify the position returned using valid parameters.
> ```
