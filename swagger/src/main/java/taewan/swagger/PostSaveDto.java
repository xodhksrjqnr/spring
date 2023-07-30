package taewan.swagger;

import lombok.Data;

@Data
public class PostSaveDto {

    private Long id;
    private String title;

    public PostSaveDto(String title) {
        this.title = title;
    }
}
