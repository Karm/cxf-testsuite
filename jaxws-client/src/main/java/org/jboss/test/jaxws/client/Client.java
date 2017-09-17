/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jboss.test.jaxws.client;

/**
 *
 * @author mmadzin
 */
public class Client {
    
    public static String request(String name){
        String result = null;
        
        try { // Call Web Service Operation
            org.jboss.test.jaxws.server.GreetingService service = new org.jboss.test.jaxws.server.GreetingService();
            org.jboss.test.jaxws.server.Greeting port = service.getGreetingPort();
            
            result = port.greeting(name);
            
        } catch (Exception ex) {
            //TODO better logging
            System.err.println("Exception: " + ex);
        }

        return result;
    }
}
