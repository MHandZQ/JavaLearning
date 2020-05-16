package com.itranswarp;
/*
1.
可以看到在world、xiaoming、xiaohong包里都有Person类
这是可以的，因为在不同的包下
如果在同一个包下就会报错，不允许出现同名的类

2.
如果有两个class名称相同，例如com.itranswarp.xiaoming.Person和com.itranswarp.xiaohong.Person，
那么只能import其中一个，另一个必须写完整类名。

3.
编写class的时候，编译器会自动帮我们做两个import动作：

默认自动import当前package的其他class；

默认自动import java.lang.*。
 */