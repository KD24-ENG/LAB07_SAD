package creational;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

import java.util.Arrays;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    JSONObject BookObject;
    JSONArray BookArray;

    public JSONBookMetadataFormatter() {
        this.reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        BookObject = new JSONObject();
        BookArray = new JSONArray();
        BookObject.put(Book.class.getSimpleName()+"s", BookArray);
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
        JSONObject newBook = new JSONObject();
        JSONArray newAuthors = new JSONArray();
        newAuthors.addAll(Arrays.asList(b.getAuthors()));

        newBook.put(Book.Metadata.ISBN.value,b.getISBN());
        newBook.put(Book.Metadata.AUTHORS.value, newAuthors);
        newBook.put(Book.Metadata.TITLE.value,b.getTitle());
        newBook.put(Book.Metadata.PUBLISHER.value,b.getPublisher());

        BookArray.add(newBook);
        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        return BookObject.toString();
    }
}