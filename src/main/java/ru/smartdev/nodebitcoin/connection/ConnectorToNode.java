package ru.smartdev.nodebitcoin.connection;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.simple.JSONObject;
import ru.smartdev.nodebitcoin.config.ConfigNode;

import java.io.UnsupportedEncodingException;
/**
 * Created by maksimsalavin on 15.07.17.
 */
public class ConnectorToNode {


    public static HttpPost getHttpConnection( JSONObject json,DefaultHttpClient httpclient) throws UnsupportedEncodingException {
        httpclient.getCredentialsProvider().setCredentials(new AuthScope(ConfigNode.inetaddress,ConfigNode.port),
                new UsernamePasswordCredentials(ConfigNode.user, ConfigNode.pass));
        StringEntity myEntity = new StringEntity(json.toJSONString());
        System.out.println(json.toString());
        HttpPost httppost = new HttpPost(ConfigNode.fullInetAddress);
        httppost.setEntity(myEntity);
        return httppost;
    }
}
