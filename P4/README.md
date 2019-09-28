安卓作业四
=====
*在活动Hello1，Hello2中设置计数器，以区分四种活动启动模式的不同<br>
![image](https://github.com/LS-56/2017112109_android/blob/master/P4/images/1.PNG)<br>
*在AndroidManifest.xml中设置活动的启动模式<br>
![image](https://github.com/LS-56/2017112109_android/blob/master/P4/images/2.PNG)<br>
*standard模式<br>
使用standard模式的活动，不管活动是否存在于活动栈中或者栈顶，每次启动都会创建该活动的一个新的实例<br>
![image](https://github.com/LS-56/2017112109_android/blob/master/P4/images/3.PNG)<br>
*singleTop模式<br>
Hello1设置为singleTop模式<br>
当Hello1活动在栈顶时，再次启动Hello1，则认为可以直接使用它，不会再创建新的活动实例<br>
当Hello1活动不在栈顶时，再次启动Hello1，会再创建新的活动实例<br>
![image](https://github.com/LS-56/2017112109_android/blob/master/P4/images/4.PNG)<br>
*singleTask模式<br>
Hello1设置为singleTask模式<br>
每次启动Hello1时系统首先会在返回栈中检查是否存在该活动的实例，如果存在则直接使用该实例，并把这个活动之上的所以活动统统出栈，如果不存在则创建一个新的活动实例<br>
![image](https://github.com/LS-56/2017112109_android/blob/master/P4/images/5.PNG)<br>
*singleInstance模式<br>
Hello1设置为singleInstrance模式<br>
在整个安卓系统中就只有唯一的实例，开始运行时创建了第一个Hello1实例,Hello1此后每次启动都使用它不会再创建新的实例<br>
![image](https://github.com/LS-56/2017112109_android/blob/master/P4/images/6.PNG)<br>


