安卓作业七
===========
知识点总结<br>
-----------

一、广播接收器————>注册广播<br>
1.动态注册：在代码中注册<br>
2.静态注册：AndroidMainfest.xml中注册<br>
二、创建广播接收器<br>
新建一个类继承自Broadcast-Receiver并重写父类的onReceive()<br>
动态：<br>
1.意图过滤器调用addAction添加广播注册器监听想监听的广播<br>
2.广播接收器<br>
3.registerReceiver进行注册（广播接收器、意图过滤器）<br>
动态广播接收器要取消注册：<br>
在onDestory（）中调用unregisterReceiver（广播接收器对象名）<br>
静态：<br>
1.修改BootCompleteReceiver中的代码<br>
2.<receiver>、<intentfiter><br>




