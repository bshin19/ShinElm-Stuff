import java.util.List;

public class BucketList {

    private List<String> bucket;
    private Member owner;

    public BucketList(List<String> bucket, Member owner) {
        this.bucket = bucket;
        this.owner = owner;
    }

    public List<String> getBucket() {
        return bucket;
    }

    public BucketList add(String listItem) {
        bucket.add(listItem);
        return this;
    }

    public Member getOwner() {
        return owner;
    }
}
