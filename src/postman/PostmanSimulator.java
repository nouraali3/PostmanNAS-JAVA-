package postman;

import sun.misc.BASE64Encoder;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class PostmanSimulator 
{
    URL url;
    String responseCode;
    String responseLength;
    long responseDate;
    String[] responseArray  ;
    public void GETRequest(String userUrl) throws JSONException 
    {
        try 
        {
            url= new URL(userUrl);
            HttpURLConnection con=(HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            String encodedAuthorizedUser = getAuthantication("admin", "password");
            con.setRequestProperty ("Authorization", "Basic " + encodedAuthorizedUser );
            
            //get status and body
            setGETResponse(con);
        }
        
        catch (MalformedURLException e1) 
            { e1.printStackTrace();} 
        catch (ProtocolException e2) 
            {e2.printStackTrace();} 
        catch (IOException e3) 
            {e3.printStackTrace();}
    }
    
    private void setGETResponse(HttpURLConnection con) throws JSONException, IOException
    {
        responseCode=Integer.toString(con.getResponseCode());
        responseCode+=" ";
        responseCode+=con.getResponseMessage();
        BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
        String output;    String responseBody=new String();
        while ((output=br.readLine())!= null)
            responseBody+=output; 

        JSONObject jsonResponse =new JSONObject(responseBody);
        JSONObject fields       =jsonResponse.getJSONObject("fields");
        JSONObject attributes   =jsonResponse.getJSONObject("attributes");
        int schema_version      =jsonResponse.getInt("schema_version");
        Boolean remote          =jsonResponse.getBoolean("remote");
        String id               =jsonResponse.getString("id");
        JSONArray datasets      =jsonResponse.getJSONArray("datasets");


//        System.out.println(fields);
//        System.out.println(attributes);
//        System.out.println(schema_version);
//        System.out.println(remote);
//        System.out.println(id);
//        System.out.println(datasets);
        responseArray=new String[]{"{ \n","\"fields\": ",fields.toString(),"\n \"attributes\": ",attributes.toString(),"\n \"schema_version\": ",Integer.toString(schema_version),"\n \"remote\": ",Boolean.toString(remote),"\n \"id\": ",id,"\n \"datasets\": ",datasets.toString(),"\n }"};
    }
    
    public void POSTRequest(String userUrl,String controlBit)
    {
        try
        {
            url = new URL(userUrl) ;
            HttpURLConnection con=(HttpURLConnection)url.openConnection();
            con.setRequestMethod("POST");
            String encodedAuthorizedUser = getAuthantication("admin", "password");
            con.setRequestProperty ("Authorization", "Basic " + encodedAuthorizedUser );
            
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            
            responseCode=Integer.toString(con.getResponseCode());
            responseCode+=" ";
            responseCode+=con.getResponseMessage();
            responseLength=Integer.toString(con.getContentLength());
            
            wr.writeBytes("{ \"command_name\" : \"control.bits.write\", \"command_parameters\" : {\"control_bits\" :"+ controlBit +" }}");
            wr.flush();
            wr.close();
            
            
            }
            catch (MalformedURLException e1) 
                { e1.printStackTrace();} 
            catch (ProtocolException e2) 
                {e2.printStackTrace();} 
            catch (IOException e3) 
                {e3.printStackTrace();}
    }
    
    public String getAuthantication(String username, String password) 
    { 
        String auth = new sun.misc.BASE64Encoder().encode((username + ":" + password).getBytes());
        return auth; 
    }
        
    
    public String getResponseCode()
    {return responseCode;}    
    
    public String[] getResponseArray()
    {return responseArray;}
}





class test
{
    public static void main(String[] args) throws JSONException 
    {
        
        PostmanSimulator ps=new PostmanSimulator();
        ps.GETRequest("http://lab1.wirelessglue.com:8889/res/fulcrum/device/dcc77f91-288f-427d-9d5d-49ff1693e3c8?userName=admin&pwd=password");
        System.out.println(ps.getResponseCode());
        System.out.println(ps.getResponseArray());
  
    }
}