import java.util.Collections;
import java.util.List;

public class SearchEngine {

    List<PageEntry> search(String word) {
        String wordToLowReg = word.toLowerCase();
        List<PageEntry> pageEntries = BooleanSearchEngine.wordIndexingStorage.getOrDefault(wordToLowReg, Collections.emptyList());

        Collections.sort(pageEntries);
        return pageEntries;
    }
}