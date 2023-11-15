package upgSocialProfile;

import java.time.LocalDateTime;

public class Post {
    private LocalDateTime timestamp;
    private String text;

    public Post(String text){
        this.text = text;
        this.timestamp = LocalDateTime.now();
    }

    public LocalDateTime getTimestamp(){
        return timestamp;
    }

    public String getText(){
        return text;
    }
}
