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
        
        if let appURL = URL(string: "HifdhRevisionTracker:"), UIApplication.shared.canOpenURL(appURL) {
            UIApplication.shared.open(appURL)
        } else if let appStoreURL = URL(string: "https://apps.apple.com/app/id1524002702"), UIApplication.shared.canOpenURL(appStoreURL) {
            UIApplication.shared.open(appStoreURL)
        }
    }
}
