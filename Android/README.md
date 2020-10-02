# Sample Android application

This sample application demonstrates how the [Hifdh Revision Tracker](https://play.google.com/store/apps/details?id=com.tazkiyatech.hifdhtracker) and [Hifdh Revision Tester](https://play.google.com/store/apps/details?id=com.tazkiyatech.hifdhtester) Android applications can be opened directly from a third-party Android application.

The important piece of logic is the `launchApplication(applicationId:applicationName:)` method in the [MainActivity.kt](src/main/java/com/tazkiyatech/sampleapp/MainActivity.kt) class.
When run, it will proceed to try each of the following operations in order until one succeeds:

1. Open the application if it exists on the device.
2. Open the application's landing page in the Google Play app if the Google Play app exists on the device.
3. Open the application's landing page in the Google Play website.

The video below demonstrates the behaviour when the [Hifdh Revision Tracker](https://play.google.com/store/apps/details?id=com.tazkiyatech.hifdhtracker) and [Hifdh Revision Tester](https://play.google.com/store/apps/details?id=com.tazkiyatech.hifdhtester) applications exist on the device.

![Sample App](https://media.giphy.com/media/Ev2bhYrepUmRFkb308/giphy.gif)
