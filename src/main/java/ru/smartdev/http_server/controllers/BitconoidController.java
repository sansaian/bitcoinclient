package ru.smartdev.http_server.controllers;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.smartdev.nodebitcoin.RPCClient;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by maksimsalavin on 15.07.17.
 */
@RestController
public class BitconoidController {
    RPCClient rpcClient = new RPCClient();

    @RequestMapping("/getInfo")
    public JSONObject getInfo(HttpServletResponse response) {
        return rpcClient.getInfo();
    }

    @RequestMapping("/createAccount")
    public String createAccount(@RequestParam(value = "account") String account,HttpServletResponse response) {
        return rpcClient.getNewAddress(account);
    }

    @RequestMapping("/getBalance")
    public Double getBalance(@RequestParam(value = "account") String account,HttpServletResponse response) {
        return rpcClient.getBalance(account);
    }
}
