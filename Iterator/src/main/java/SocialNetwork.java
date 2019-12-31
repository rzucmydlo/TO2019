
public interface SocialNetwork {
    Iterator createFriendsIterator(String profileEmail);
    Iterator createCoworkersIterator(String profileEmail);

}
