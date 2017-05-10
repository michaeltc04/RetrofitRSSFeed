package exampleapp.com.example.mike.retrofitrssfeed.response_objects;

import java.util.List;

public class RSSResponseObject {

    String status;
    RSSResponseFeed feed;
    List<RSSResponseItem> items;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RSSResponseFeed getFeed() {
        return feed;
    }

    public void setFeed(RSSResponseFeed feed) {
        this.feed = feed;
    }

    public List<RSSResponseItem> getItems() {
        return items;
    }

    public void setItems(List<RSSResponseItem> items) {
        this.items = items;
    }
}
