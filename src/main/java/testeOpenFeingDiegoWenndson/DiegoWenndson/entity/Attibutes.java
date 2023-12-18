package testeOpenFeingDiegoWenndson.DiegoWenndson.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Attibutes {
    @JsonProperty("body")
    private String body;
}
