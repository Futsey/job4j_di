package simpledi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class StartUI {

    private Store store;

    @Autowired
    private ConsoleInput consoleInput;

    @Autowired
    public void setStore(Store store) {
        this.store = store;
    }

    /* Using @Autowired
    public StartUI(Store store, ConsoleInput consoleInput) {
        this.store = store;
        this.consoleInput = consoleInput;
    }
     */

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }

    public void addQuestion(String question) {
        consoleInput.askStr(question);
    }
}
