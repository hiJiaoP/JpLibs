package com.jiaop.libs.zxing.writer;

/**
 * <pre>
 *     author : jiaop
 *     time   : 2018/10/16
 *     desc   :
 *     version: 1.0.0
 * </pre>
 */
final class BlockPair {

    private final byte[] dataBytes;
    private final byte[] errorCorrectionBytes;

    BlockPair(byte[] data, byte[] errorCorrection) {
        dataBytes = data;
        errorCorrectionBytes = errorCorrection;
    }

    public byte[] getDataBytes() {
        return dataBytes;
    }

    public byte[] getErrorCorrectionBytes() {
        return errorCorrectionBytes;
    }

}
