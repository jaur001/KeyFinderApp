package View.Persistence;

import Model.Account;

public interface AccountListWriter extends Writer<Account> {
    void editHour(Account account);
}
