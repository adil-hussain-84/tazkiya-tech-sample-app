//
//  ViewController.swift
//  SampleApp
//
//  Created by Adil Hussain on 11/09/2020.
//  Copyright © 2020 Adil Hussain. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    
    @IBAction func onOpenHifdhRevisionTrackerAppButtonTapped(_ sender: Any) {
        launchApplication(urlScheme: "HifdhRevisionTracker", appStoreId: "1524002702")
    }
    
    private func launchApplication(urlScheme: String, appStoreId: String) {
        
        if let appURL = URL(string: "\(urlScheme):"), UIApplication.shared.canOpenURL(appURL) {
            UIApplication.shared.open(appURL)
        } else if let appStoreURL = URL(string: "https://apps.apple.com/app/id\(appStoreId)"), UIApplication.shared.canOpenURL(appStoreURL) {
            UIApplication.shared.open(appStoreURL)
        }
    }
}
