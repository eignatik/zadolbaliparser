package space.eignatik.zadolbaliparser.AppCore;

public class Item {
    private String id;
    private String title;
    private String text;
    private String meta;

    public Item(String id, String title, String text, String meta) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.meta = meta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (id != item.id) return false;
        return title != null ? title.equals(item.title) : item.title == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (meta != null ? meta.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", meta='" + meta + '\'' +
                '}';
    }
}
