安卓作业五
====
对hello3进行以下操作<br>
*点击hello3显示网页<br>
代码修改如下图<br>
![image](https://github.com/LS-56/2017112109_android/blob/master/P5/images/1.PNG)<br>
*结果如图所示<br>
![image](https://github.com/LS-56/2017112109_android/blob/master/P5/images/2.PNG)<br>
*点击hello3显示拨号界面<br>
代码修改如下图<br>
![image](https://github.com/LS-56/2017112109_android/blob/master/P5/images/3.PNG)<br>
*结果如图所示<br>
![image](https://github.com/LS-56/2017112109_android/blob/master/P5/images/4.PNG)<br>
*点击hello3显示进行拨号<br>
代码修改如下图<br>
![image](https://github.com/LS-56/2017112109_android/blob/master/P5/images/5.PNG)<br>
*结果如图所示<br>
![image](https://github.com/LS-56/2017112109_android/blob/master/P5/images/6.PNG)<br>
*点击hello3显示地理位置<br>
代码修改如下图<br>
![image](https://github.com/LS-56/2017112109_android/blob/master/P5/images/7.PNG)<br>
*结果如图所示<br>
![image](https://github.com/LS-56/2017112109_android/blob/master/P5/images/8.PNG)<br>


知识点归纳
-----------
一、Intent
1.intent表达需求<br>
2.Action data  extradata  category  classname 具体描述intent<br>
3.Android使用多种策略通过意图过滤器将意图与目标活动相匹配（Android uses multiple strategies to match intents to their target activities based on intent filters.）<br>
二、意图匹配组件的规则<br>
1.Action<br>
如果一个意图过滤器没有定义一个动作，那么该意图过滤器就是任何传入意图动作的匹配。<br>
如果在意图筛选器中指定了一个或多个action，则至少有一个action必须与传入意图的action匹配。<br>
（if an intent filter doesn’t define an action, that intent filter is a match for any incoming intent action. 
If one or more actions are specified in the intent filter, at least one of the actions must match the incoming intent’s action.）<br>
2.Data<br>
如果在意图过滤器中未指定数据特征，则它与携带任何数据或数据属性的传入意图不匹配。<br>
如果在意图筛选器中指定了一个或多个数据特征，则至少有一个数据或数据特征必须与传入意图的数据或数据特征匹配。<br>
3.Datatype<br>
要匹配数据类型，意图中的数据类型必须存在于意图筛选器中。<br>
4.Category<br>
传入意图中的每个类别都必须出现在筛选器类别列表中。如果一个过滤器没有任何类别，它将只与一个没有提到任何类别的意图匹配。<br>
caveat<br>
android将传递给startActivity（）的所有隐式意图视为至少包含一个类别：android.intent.category.default。android允许在应用程序的manifest文件中注册活动，使其可供其他应用程序调用，注册活动时记得匹配隐藏的default类别。<br>
