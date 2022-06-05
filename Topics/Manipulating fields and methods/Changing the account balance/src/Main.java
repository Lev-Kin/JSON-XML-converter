import java.lang.reflect.Field;

final class AccountUtils {

    private AccountUtils() { }

    public static void increaseBalance(Account account, long amount)
            throws NoSuchFieldException, IllegalAccessException {
        // write your code here
        Field balance = account.getClass().getDeclaredField("balance");
        balance.setAccessible(true);
        balance.setLong(account, balance.getLong(account) + amount);
    }
}
