package app.domain.account;

/**
 * アカウント
 */
public class Account {

    public final String id;
    public final String email;

    private Account(final String id, final String email) {
        this.id = id;
        this.email = email;
    }

    public static Account create(final String id, final String email) {
        return new Account(id, email);
    }

    public static Account reconstruct(final String id, final String email) {
        return new Account(id, email);
    }

}
