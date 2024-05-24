import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConverter {
    private String apikey;
    private String base_code;
    private String target_code;
    private double amout;
    private String conversion_rate;


    public ApiConverter(Converter converter){
        this.amout=converter.getValue();
        this.base_code=converter.getBase_code();
        this.target_code=converter.getTarget_code();
    }


    public String playApí(){
        this.apikey="f517096fdb1ffe74eff25eb0";
        String consulta=this.apikey+"/pair/"+this.base_code+"/"+this.target_code+"/"+this.amout;

        URI api=URI.create("https://v6.exchangerate-api.com/v6/"+consulta);

        try {
            HttpClient client= HttpClient.newHttpClient();
            HttpRequest request= HttpRequest.newBuilder()
                    .uri(api)
                    .build();
            HttpResponse<String> response=client.send(request,HttpResponse.BodyHandlers.ofString());
            String json=response.body();

            Gson gson=new Gson();
            Converter converter=gson.fromJson(json,Converter.class);
            return converter.toString();
        } catch (Exception e) {
            throw new RuntimeException("Algo deu errado!");
        }
    }


}
