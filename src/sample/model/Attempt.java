package sample.model;

/**
 * Created by kimmiekim on 2016-12-20.
 */
public class Attempt {
    private String mMessage;
    private AttemptKind mKind;
    private int mRemainingSeconds;

    public Attempt(String message, AttemptKind kind) {
        mMessage = message;
        mKind = kind;
        mRemainingSeconds = kind.getTotalSeconds();
    }

    public String getMessage() {
        return mMessage;
    }

    public AttemptKind getKind() {
        return mKind;
    }

    public int getRemainingSeconds() {
        return mRemainingSeconds;
    }

    public void setMessage(String message) {
        mMessage = message;
    }
}
