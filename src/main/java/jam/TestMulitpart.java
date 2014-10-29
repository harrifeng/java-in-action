package jam;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.File;

public class TestMulitpart {
    private final static String JSON_TYPE = "application/json";
    private final static String OAUTH = "OAuth 9u0xS1p3vctiIiUTPhVYECbHoOYbgosbBHhS1pHN";

    public static void main(String[] args) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost uploadFile = new HttpPost("http://localhost:3000/OData/OData.svc/Groups(8)/ContentItems");
        uploadFile.addHeader("Accept", JSON_TYPE);
        uploadFile.addHeader("Authorization", OAUTH);

        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.addBinaryBody("file",
                new File("/Users/i309511/Downloads/test.jpeg"),
                ContentType.create("image/jpeg"),
                "star23.jpeg");
        HttpEntity multipart = builder.build();
        uploadFile.setEntity(multipart);
        Header[] hd = uploadFile.getAllHeaders();
        for (int i = 0; i < hd.length; i++) {
            System.out.println(hd[i].toString());
        }

        try {
            HttpResponse response = httpClient.execute(uploadFile);
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
