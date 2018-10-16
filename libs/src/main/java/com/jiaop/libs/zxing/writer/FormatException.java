package com.jiaop.libs.zxing.writer;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/10/16
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public final class FormatException extends ReaderException{

    private static final FormatException INSTANCE = new FormatException();
    static {
        INSTANCE.setStackTrace(NO_TRACE); // since it's meaningless
    }

    private FormatException() {
    }

    private FormatException(Throwable cause) {
        super(cause);
    }

    public static FormatException getFormatInstance() {
        return isStackTrace ? new FormatException() : INSTANCE;
    }

    public static FormatException getFormatInstance(Throwable cause) {
        return isStackTrace ? new FormatException(cause) : INSTANCE;
    }

}
