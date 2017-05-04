//
//  Account.swift
//  CardSmith
//
//  Created by Seth Battis on 5/2/17.
//  Copyright © 2017 Seth Battis. All rights reserved.
//

/*
 
 An object representing a CardSmith Account, of which a CardSmith User may have several
 
 */
import Money

class Account : NSObject {
    var plan: String = ""
    var type: String = ""
    var balance: Money = 0
   
    /* Construct the Account object from the JSON data in the API response */
    init(data: [String: Any]) {
        super.init()
        for (key, value) in data {
            switch key {
            case "plan":
                self.plan = String(describing: value)
                break
            case "type":
                self.type = String(describing: value)
                break
            case "balance":
                self.balance = Money(value as! Double)
                break
            default:
                print("Unknown Account field `\(key)` = '\(value)'")
            }
        }
    }
    
    /* Generate a nice string description of the object on request */
    override public var description: String {
        return "Account: [plan: \(plan), type: \(type), balance: \(balance)]"
    }
}
