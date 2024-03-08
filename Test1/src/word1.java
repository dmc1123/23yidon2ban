public class word1 {
    private String name;
    private String writer;
    private String size;
    private int page;

    public word1(String name, String writer, String size, int page) {
        this.name = name;
        this.writer = writer;
        this.size = size;
        this.page = page;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String road() {
        return "看" + getName();
    }
}