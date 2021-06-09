package networkflow_analysis.beans;

/**
 * @author zqs
 * @create 2021-06-09 13:49
 */
public class PageViewCount {

    private String url;
    private Long WindowEnd;
    private Long count;

    public PageViewCount() {
    }

    public PageViewCount(String url, Long windowEnd, Long count) {
        this.url = url;
        WindowEnd = windowEnd;
        this.count = count;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getWindowEnd() {
        return WindowEnd;
    }

    public void setWindowEnd(Long windowEnd) {
        WindowEnd = windowEnd;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "PageViewCount{" +
                "url='" + url + '\'' +
                ", WindowEnd=" + WindowEnd +
                ", count=" + count +
                '}';
    }
}
