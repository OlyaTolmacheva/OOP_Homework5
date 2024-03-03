package view;

import model.User;
import java.util.List;

public interface IUsersView<T extends User> {
    public void printOnConsole(T user);
    public void printOnConsoleArr(List<T> users);
}
