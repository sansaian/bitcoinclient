package ru.smartdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.smartdev.nodebitcoin.RPCClient;

/**
 * Created by maksimsalavin on 15.07.17.
 */
@SpringBootApplication
public class Application {


    public static void main(String[] args) {
     SpringApplication.run(Application.class, args);
   // RPCClient rpcClient = new RPCClient();
//        System.out.println(rpcClient.getNewAddress("testnode"));
//        System.out.println(rpcClient.getBalance("testnode"));
//
    }

}
