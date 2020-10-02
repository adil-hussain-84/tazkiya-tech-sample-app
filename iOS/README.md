# Sample iOS application

This sample application demonstrates how the [Hifdh Revision Tracker](https://apps.apple.com/app/id1524002702) iOS application can be opened directly from a third-party iOS application.

The first step is to add an `LSApplicationQueriesSchemes` key in your application target's `Info.plist` file and to give it a `HifdhRevisionTracker` value as follows:

```
<key>LSApplicationQueriesSchemes</key>
<array>
    <string>HifdhRevisionTracker</string>
</array>
```

The second step is to define the logic which will open the [Hifdh Revision Tracker](https://apps.apple.com/app/id1524002702) application if it exists on the device, or otherwise open its landing page in the App Store app.
See the `launchApplication(urlScheme:appStoreId:)` method in the [ViewController.swift](SampleApp/ViewController.swift) class for the code.

The video below demonstrates the behaviour when the [Hifdh Revision Tracker](https://apps.apple.com/app/id1524002702) application exists on the device.

![Sample App](https://media.giphy.com/media/eT2gZi0Er9aP5rngKS/giphy.gif)
