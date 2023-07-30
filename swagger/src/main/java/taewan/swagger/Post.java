package taewan.swagger;

import lombok.Data;

@Data
public class Post {

    private Long id;
    private String title;

    public Post(Long id, String title) {
        this.id = id;
        this.title = title;
    }
}
