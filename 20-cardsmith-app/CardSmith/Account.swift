//
//  Account.swift
//  CardSmith
//
//  Created by Seth Battis on 5/2/17.
//  Copyright © 2017 Seth Battis. All rights reserved.
//

import Money

class Account : NSObject {
    var plan: String = ""
    var type: String = ""
    var balance: Money = 0
    
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
    
    override public var description: String {
        return "Account: [plan: \(plan), type: \(type), balance: \(balance)]"
    }
}
