//
//  SignInViewController.swift
//  CardSmith
//
//  Created by Seth Battis on 5/2/17.
//  Copyright © 2017 Seth Battis. All rights reserved.
//

import UIKit

class SignInViewController: UIViewController {
    @IBOutlet weak var username: UITextField!
    @IBOutlet weak var password: UITextField!
    @IBOutlet weak var activityIndicator: UIActivityIndicatorView!

    let app = UIApplication.shared.delegate as! AppDelegate
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        self.username.text = self.app.credentials!["sampleUsername"]
        self.password.text = self.app.credentials!["samplePassword"]
    }
    
    @IBAction func signIn(_ sender: Any) {
        self.activityIndicator.startAnimating()
        
        self.app.api!.loginAuthenticate(username: self.username.text!, password: self.password.text!, completion: {(json: [String: Any]) -> Void in
            self.app.user = User(data: json)
            self.activityIndicator.stopAnimating()
            if (self.app.userReady) {
                DispatchQueue.main.async {
                    self.performSegue(withIdentifier: "ShowUserView", sender: sender)
                }
            } else {
                let alert = UIAlertController(title: "Error", message: "Unknown user/password.", preferredStyle: UIAlertControllerStyle.alert)
                alert.addAction(UIAlertAction(title: "Try Again", style: UIAlertActionStyle.default, handler: nil))
                self.present(alert, animated: true, completion: nil)
            }
        })
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    
}

