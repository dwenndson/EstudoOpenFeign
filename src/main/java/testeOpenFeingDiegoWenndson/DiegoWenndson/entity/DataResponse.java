package testeOpenFeingDiegoWenndson.DiegoWenndson.entity;

import java.util.List;

public class DataResponse {
    private List<MinhaApiResponse> data;

    public DataResponse() {
    }

    public DataResponse(List<MinhaApiResponse> data) {
        this.data = data;
    }

    public void setData(List<MinhaApiResponse> data) {
        this.data = data;
    }

    public List<MinhaApiResponse> getData() {
        return data;
    }
}
