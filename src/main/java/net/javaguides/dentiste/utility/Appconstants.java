package net.javaguides.dentiste.utility;

public class Appconstants {

    // Enums
    public enum Gender {
        MALE, FEMALE, OTHER
    }

    public enum InsuranceType {
        CNSS, CNOPS, PRIVATE, NONE
    }
    // Other Constants
    public static final String DEFAULT_ADMIN_ROLE = "ADMIN";
    public static final String DEFAULT_CLIENT_ROLE = "CLIENT";
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String BASE_API_URL = "/api/v1";

    // Error Messages
    public static final String ERROR_USER_NOT_FOUND = "User not found.";
    public static final String ERROR_INVALID_CREDENTIALS = "Invalid credentials.";
    public static final String ERROR_ACCESS_DENIED = "Access denied.";

    // Success Messages
    public static final String SUCCESS_USER_CREATED = "User successfully created.";
    public static final String SUCCESS_RECORD_UPDATED = "Record successfully updated.";

    // Limits or Thresholds
    public static final int MAX_LOGIN_ATTEMPTS = 5;

    // Prevent instantiation
    private Appconstants() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

