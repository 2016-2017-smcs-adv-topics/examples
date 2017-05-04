//
//  CardSmithApi.swift
//  CardSmith
//
//  Created by Seth Battis on 5/2/17.
//  Copyright © 2017 Seth Battis. All rights reserved.
//

import Foundation
import Alamofire

class CardSmithApi : NSObject {

    var apiUrl: String
    var apiVersion: String
    var applicationId: String
    var seed: String

    init(_ dict: Dictionary<String, String>) {
        self.apiUrl = dict["apiUrl"]!
        self.apiVersion = dict["apiVersion"]!
        self.applicationId = dict["applicationId"]!
        self.seed = dict["seed"]!
    }
    
    func loginAuthenticate(username: String, password: String, completion: @escaping (_: [String: Any]) -> Void) {
        let timestamp = Int(NSDate().timeIntervalSince1970 * 1000)
        
        let params: [String: Any] = [
            "apiVersion": self.apiVersion,
            "applicationId": self.applicationId,
            "username": username,
            "password": password,
            "hash": "\(self.seed)\(self.apiVersion)\(self.applicationId)\(timestamp)".sha1(),
            "timestamp": timestamp
        ]
        
        Alamofire.request(self.apiUrl + "globalLoginValidate", method: .post, parameters: params).responseJSON { response in
            guard let json = response.result.value as? [String: Any] else {
                print("Did not receive a JSON response")
                print("Error: \(response.result.error)")
                return
            }
            completion(json)
        }
    }

}
