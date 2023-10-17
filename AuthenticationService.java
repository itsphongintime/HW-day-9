package CodingMentorWeb;

public class AuthenticationService {
	private WebDatabase database;

    public AuthenticationService(WebDatabase database) {
        this.database = database;
    }

    public Account logInAccount(String inputID, String inputPassword) {
        for (int i = 0; i < database.getAccounts().size(); i++) {
            Account account = database.getAccounts().get(i);
            if (inputID.equals(account.getID())) {
                if (inputPassword.equals(account.getPassword())) {
                    return account;
                } else {
                    account.setFailedAttempts();
                }
            }
        }
        return null;
    }

    public void registerAccount(Account inputAccount) {
    	database.getAccounts().add(inputAccount);
    }
}
