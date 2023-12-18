package testeOpenFeingDiegoWenndson.DiegoWenndson.controller;

import feign.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import testeOpenFeingDiegoWenndson.DiegoWenndson.client.MinhaAApiFeignClient;
import testeOpenFeingDiegoWenndson.DiegoWenndson.entity.DataResponse;
import testeOpenFeingDiegoWenndson.DiegoWenndson.entity.MinhaApiResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
public class MinhaApiController {

    @Autowired
    private MinhaAApiFeignClient apiClient;

    @GetMapping("/chamar-api")
    public ResponseEntity<DataResponse> chamarApiExterna() {
        int limit = 1;

        var response = apiClient.obterDadosAPi(limit);
        System.out.println(response);
        return ResponseEntity.ok(response);
    }
}
