# AutoUpdate
  一个应用自动更新组件
# 添加权限
    <!-- 在SDCard中写入权限 -->
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
    <!-- 在SDCard中创建与删除文件权限 -->
    <uses-permission android:name="android.permission.MOUNT_UNMOUNT_FILESYSTEMS"/>
    <!--网络权限-->
    <uses-permission android:name="android.permission.INTERNET"/>
# 概览
  //App更新下载后台服务
  UpdateService.java
  
  //下载调度管理器，调用我们的UpdateDownloadRequest
  UpdateManager.java
  
  //负责处理文件的下载和线程间通信
  UpdateDownloadRequest.java
  
  //事件的监听回调
  UpdateDownloadListener.java
  
  //Activity
  MainActivity.java
  
