package taewan.swagger;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("post")
public class MainController {

    @GetMapping("/{postId}")
    public Post getPost(@PathVariable Long postId) {
        return new Post(postId, "test post");
    }

    @GetMapping
    public List<Post> getPosts() {
        return List.of(new Post(1L, "test1"), new Post(2L, "test2"), new Post(3L, "test3"));
    }

    @PostMapping
    public void savePost(@ModelAttribute PostSaveDto postSaveDto) {

    }
}
