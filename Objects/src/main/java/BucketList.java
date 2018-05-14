import java.util.List;

public class BucketList {

    private List<String> bucket;
    private Member owner;

    private long id;

    public BucketList(List<String> bucket, Member owner, long id) {
        this.bucket = bucket;
        this.owner = owner;
        this.id = id;
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

    public long getId() {
        return id;
    }
}
