package upgSocialProfile;

public class SocialMediaProfile {
    private final String username;
    private final String fullName;
    private final SocialMediaProfile[] followers;
    private int numFollowers;
    private final SocialMediaProfile[] following;
    private int numFollowing;
    private final Post[] posts;
    private int numPosts;

    public SocialMediaProfile(String username, String fullName) {
        this.username = username;
        this.fullName = fullName;
        this.followers = new SocialMediaProfile[100];
        this.following = new SocialMediaProfile[100];
        this.posts = new Post[100];


    }

    public void createPost(String text) {
        if (numPosts < posts.length) {
            Post numPost = new Post(text);
            posts[numPosts] = numPost;
            numPosts++;
        } else {
            System.out.println("Max of number of post reached");
        }

    }

    public void followProfile(SocialMediaProfile profile) {
        if (numFollowing < following.length && !isFollowing(profile)) {
            following[numFollowing] = profile;
            numFollowing++;
            profile.addFolower(this);
        }
    }

    private void addFolower(SocialMediaProfile follower) {
        if (numFollowers < followers.length && !isFollower(follower)) {
            following[numFollowing] = follower;
            numFollowers++;
        }
    }

    public boolean isFollower(SocialMediaProfile follower) {
        return (getFollowerIndex(follower) != -1);
    }

    public boolean isFollowing(SocialMediaProfile profile) {
        return (getFollowingindex(profile) != -1);
    }

    public int getFollowingindex(SocialMediaProfile profile) {
        for (int i = 0; i < numFollowing; i++) {
            if (following[i] == profile) {
                return i;
            }
        }
        return -1;
    }

    public int getFollowerIndex(SocialMediaProfile profile) {
        for (int i = 0; i < numFollowers; i++) {
            if (followers[i] == profile) {
                return i;
            }
        }
        return -1;
    }

    public void displayProfileInfo() {
        System.out.println("Profile info for " + username);
        System.out.println("User name: " + username);
        System.out.println("Full name: " + fullName);
        System.out.println("Followers: " + numFollowers);
        System.out.println("Following: " + numFollowing);
        System.out.println("Recent posts:");
        for (int i = 0; i < numPosts; i++) {
            Post post = posts[i];
            System.out.println(i + 1 + ":" + "[" + post.getTimestamp() + "] " + post.getText());
        }
    }
}
