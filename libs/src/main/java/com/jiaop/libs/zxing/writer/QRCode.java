package com.jiaop.libs.zxing.writer;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/10/16
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
public final class QRCode {

    public static final int NUM_MASK_PATTERNS = 8;

    private Mode mode;
    private ErrorCorrectionLevel ecLevel;
    private Version version;
    private int maskPattern;
    private ByteMatrix matrix;

    public QRCode() {
        maskPattern = -1;
    }

    public Mode getMode() {
        return mode;
    }

    public ErrorCorrectionLevel getECLevel() {
        return ecLevel;
    }

    public Version getVersion() {
        return version;
    }

    public int getMaskPattern() {
        return maskPattern;
    }

    public ByteMatrix getMatrix() {
        return matrix;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(200);
        result.append("<<\n");
        result.append(" mode: ");
        result.append(mode);
        result.append("\n ecLevel: ");
        result.append(ecLevel);
        result.append("\n version: ");
        result.append(version);
        result.append("\n maskPattern: ");
        result.append(maskPattern);
        if (matrix == null) {
            result.append("\n matrix: null\n");
        } else {
            result.append("\n matrix:\n");
            result.append(matrix);
        }
        result.append(">>\n");
        return result.toString();
    }

    public void setMode(Mode value) {
        mode = value;
    }

    public void setECLevel(ErrorCorrectionLevel value) {
        ecLevel = value;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public void setMaskPattern(int value) {
        maskPattern = value;
    }

    public void setMatrix(ByteMatrix value) {
        matrix = value;
    }

    // Check if "mask_pattern" is valid.
    public static boolean isValidMaskPattern(int maskPattern) {
        return maskPattern >= 0 && maskPattern < NUM_MASK_PATTERNS;
    }


}
