//
//  UserViewController.swift
//  CardSmith
//
//  Created by Seth Battis on 5/2/17.
//  Copyright © 2017 Seth Battis. All rights reserved.
//

import UIKit

/*
 
 The view controler for the user view
 
 */
class UserViewController : UIViewController {
    @IBOutlet weak var name: UILabel!
    @IBOutlet weak var activeCardNumber: UILabel!

    let user: User = (UIApplication.shared.delegate as! AppDelegate).user!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        self.name.text = "\(user.firstName) \(user.lastName)"
        self.activeCardNumber.text = "\(user.activeCardNumber)"
    }
}
