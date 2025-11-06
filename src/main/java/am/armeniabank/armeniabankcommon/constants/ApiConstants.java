package am.armeniabank.armeniabankcommon.constants;

public class ApiConstants {

    // Audit Service Url
    public static final String AUDIT_SERVICE_URL = "/api/audit";
    public static final String AUDIT_USER_SERVICE_URL = AUDIT_SERVICE_URL + "/user";
    public static final String AUDIT_WALLET_SERVICE_URL = AUDIT_SERVICE_URL + "/wallet";
    public static final String AUDIT_TRANSACTION_SERVICE_URL = AUDIT_SERVICE_URL + "/transaction";

    // Auth Service Url
    public static final String AUTH_SERVICE_URL = "/api/users";
    public static final String AUTH_SERVICE_REGISTER_URL = AUTH_SERVICE_URL + "/register";
    public static final String AUTH_SERVICE_LOGIN_URL = AUTH_SERVICE_URL + "/login";
    public static final String AUTH_SERVICE_LOGOUT_URL = AUTH_SERVICE_URL + "/logout";
    public static final String AUTH_SERVICE_REFRESH_URL = AUTH_SERVICE_URL + "/refresh";
    public static final String AUTH_SERVICE_SEARCH_URL = AUTH_SERVICE_URL + "/search";
    public static final String AUTH_SERVICE_USER_BY_ID_URL = AUTH_SERVICE_URL + "/{id}";
    public static final String AUTH_SERVICE_USER_UPDATE_URL = AUTH_SERVICE_URL + "/update/{id}";
    public static final String AUTH_SERVICE_USER_DELETE_URL = AUTH_SERVICE_URL + "/delete/{id}";

    // Auth Profile Service Url
    public static final String AUTH_SERVICE_USER_PROFILE_URL = AUTH_SERVICE_URL + "/profile";
    public static final String AUTH_SERVICE_USER_PROFILE_USER_ID_URL = AUTH_SERVICE_USER_PROFILE_URL + "/{userId}";
    public static final String AUTH_SERVICE_USER_PROFILE_UPDATE_USER_ID_URL = AUTH_SERVICE_USER_PROFILE_URL + "/update/{userId}";

    // Auth Verification Service Url
    public static final String AUTH_SERVICE_VERIFICATION_URL = AUTH_SERVICE_URL + "/verification";
    public static final String AUTH_SERVICE_VERIFICATION_START_USER_ID_URL = AUTH_SERVICE_VERIFICATION_URL + "/start/{userId}";
    public static final String AUTH_SERVICE_VERIFICATION_UPDATE_DOC_USER_ID_URL = AUTH_SERVICE_VERIFICATION_URL + "/update/document/{userId}";
    public static final String AUTH_SERVICE_VERIFICATION_APPROVE_USER_ID_URL = AUTH_SERVICE_VERIFICATION_URL + "/approve/{userId}";
    public static final String AUTH_SERVICE_VERIFICATION_REJECT_USER_ID_URL = AUTH_SERVICE_VERIFICATION_URL + "/reject/{userId}";
    public static final String AUTH_SERVICE_VERIFICATION_EXPIRE_USER_ID_URL = AUTH_SERVICE_VERIFICATION_URL + "/expire/{userId}";
    public static final String AUTH_SERVICE_VERIFICATION_USER_ID_URL = AUTH_SERVICE_VERIFICATION_URL + "/{userId}";

    // Auth Verify EmailService Url
    public static final String AUTH_SERVICE_VERIFY_EMAIL_URL = "/api/verify/email";
    public static final String AUTH_SERVICE_VERIFY_EMAIL_UPDATE_URL = AUTH_SERVICE_VERIFY_EMAIL_URL + "/update";

    // Notification Service Url
    public static final String NOTIFICATION_SERVICE_URL = "/api/notifications";
    public static final String NOTIFICATION_SERVICE_MESSAGE_URL = NOTIFICATION_SERVICE_URL + "/message";

    // Transaction Service Url
    public static final String TRANSACTION_SERVICE_URL = "/api/transactions";
    public static final String TRANSACTION_SERVICE_TRANSACTION_ID_URL = TRANSACTION_SERVICE_URL + "/{transactionId}";
    public static final String TRANSACTION_SERVICE_TRANSACTION_ID_COMPLETE_URL = TRANSACTION_SERVICE_TRANSACTION_ID_URL + "/complete";
    public static final String TRANSACTION_SERVICE_TRANSACTION_ID_CANCEL_URL = TRANSACTION_SERVICE_TRANSACTION_ID_URL + "/cancel";
    public static final String TRANSACTION_SERVICE_TRANSACTION_ID_FAIL_URL = TRANSACTION_SERVICE_TRANSACTION_ID_URL + "/fail";
    public static final String TRANSACTION_SERVICE_WALLET_WALLET_ID_URL = TRANSACTION_SERVICE_URL + "/wallet/{walletId}";
    public static final String TRANSACTION_SERVICE_FREEZES_ACTIVE_URL = TRANSACTION_SERVICE_URL + "/freezes/active";

    // Wallet Service Url
    public static final String WALLET_SERVICE_URL = "/api/wallets";
    public static final String WALLET_SERVICE_WALLET_ID_URL = WALLET_SERVICE_URL + "/{walletId}";
    public static final String WALLET_SERVICE_USER_ID_WALLETS_URL = WALLET_SERVICE_URL + "/{userId}/wallets";
    public static final String WALLET_SERVICE_WALLET_ID_BLOCK_URL = WALLET_SERVICE_WALLET_ID_URL + "/block";
    public static final String WALLET_SERVICE_WALLET_ID_UNBLOCK_URL = WALLET_SERVICE_WALLET_ID_URL + "/unblock";
    public static final String WALLET_SERVICE_WALLET_ID_CLOSE_URL = WALLET_SERVICE_WALLET_ID_URL + "/close";

    // Wallet Operation Service Url
    public static final String WALLET_SERVICE_OPERATION_WALLET_ID_CREDIT_URL = WALLET_SERVICE_URL + "/operation/{walletId}/credit";
    public static final String WALLET_SERVICE_OPERATION_WALLET_ID_DEBIT_URL = WALLET_SERVICE_URL + "/operation/{walletId}/debit";
    public static final String WALLET_SERVICE_OPERATION_WALLET_ID_FREEZE_URL = WALLET_SERVICE_URL + "/operation/{walletId}/freeze";
    public static final String WALLET_SERVICE_OPERATION_WALLET_ID_UNFREEZE_URL = WALLET_SERVICE_URL + "/operation/{walletId}/unfreeze";
    public static final String WALLET_SERVICE_OPERATION_WALLET_ID_OPERATIONS_URL = WALLET_SERVICE_URL + "/operation/{walletId}/operations";

    private ApiConstants() {
    }
}
