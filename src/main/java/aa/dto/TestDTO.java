package aa.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@NoArgsConstructor
@Setter
@Getter
public class TestDTO implements Serializable {

    private int id;

    private String title;

    private String randomId;
}