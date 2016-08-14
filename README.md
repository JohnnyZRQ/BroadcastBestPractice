# BroadcastBestPractice

《第一行代码》里面的一个小demo，实现强制下线功能

主要用于练习广播的使用

注：在onReceive方法中使用WindowManager.LayoutParams.TYPE_SYSTEM_ALERT会导致程序崩溃，无法弹出系统对话框，改用WindowManager.LayoutParams.TYPE_TOAST
