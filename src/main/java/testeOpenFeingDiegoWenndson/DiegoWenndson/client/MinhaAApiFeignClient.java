package testeOpenFeingDiegoWenndson.DiegoWenndson.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import testeOpenFeingDiegoWenndson.DiegoWenndson.entity.DataResponse;

@FeignClient(name = "minha-api", url = "https://dogapi.dog/api/v2")
public interface MinhaAApiFeignClient {

    @GetMapping(value = "/facts", consumes = MediaType.APPLICATION_JSON_VALUE)
    DataResponse obterDadosAPi(@RequestParam("limit") Integer limit);
}
