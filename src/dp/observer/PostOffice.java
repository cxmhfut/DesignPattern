package dp.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class PostOffice {
    private List<Reader> readers = new ArrayList<>();

    /**
     * 关联读者
     *
     * @param reader
     */
    void attachReader(Reader reader) {
        readers.add(reader);
    }

    /**
     * 解除读者关联
     *
     * @param reader
     */
    void detachReader(Reader reader) {
        readers.remove(reader);
    }

    /**
     * 发布刊物
     */
    void publish() {
        for (Reader reader : readers) {
            reader.update(this);
        }
    }
}
