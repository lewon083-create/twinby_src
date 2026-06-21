package com.yandex.varioqub.protobuf.nano;

import l7.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class CodedInputByteBufferNano {
    private static final int DEFAULT_RECURSION_LIMIT = 64;
    private static final int DEFAULT_SIZE_LIMIT = 67108864;
    private final byte[] buffer;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int bufferStart;
    private int lastTag;
    private int recursionDepth;
    private int currentLimit = Integer.MAX_VALUE;
    private int recursionLimit = 64;
    private int sizeLimit = DEFAULT_SIZE_LIMIT;

    private CodedInputByteBufferNano(byte[] bArr, int i, int i10) {
        this.buffer = bArr;
        this.bufferStart = i;
        this.bufferSize = i10 + i;
        this.bufferPos = i;
    }

    public static int decodeZigZag32(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static CodedInputByteBufferNano newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    private void recomputeBufferSizeAfterLimit() {
        int i = this.bufferSize + this.bufferSizeAfterLimit;
        this.bufferSize = i;
        int i10 = this.currentLimit;
        if (i <= i10) {
            this.bufferSizeAfterLimit = 0;
            return;
        }
        int i11 = i - i10;
        this.bufferSizeAfterLimit = i11;
        this.bufferSize = i - i11;
    }

    public void checkLastTagWas(int i) throws InvalidProtocolBufferNanoException {
        if (this.lastTag != i) {
            throw InvalidProtocolBufferNanoException.invalidEndTag();
        }
    }

    public int getBytesUntilLimit() {
        int i = this.currentLimit;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.bufferPos;
    }

    public byte[] getData(int i, int i10) {
        if (i10 == 0) {
            return WireFormatNano.EMPTY_BYTES;
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.buffer, this.bufferStart + i, bArr, 0, i10);
        return bArr;
    }

    public int getPosition() {
        return this.bufferPos - this.bufferStart;
    }

    public boolean isAtEnd() {
        return this.bufferPos == this.bufferSize;
    }

    public void popLimit(int i) {
        this.currentLimit = i;
        recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int i) throws InvalidProtocolBufferNanoException {
        if (i < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i10 = i + this.bufferPos;
        int i11 = this.currentLimit;
        if (i10 > i11) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.currentLimit = i10;
        recomputeBufferSizeAfterLimit();
        return i11;
    }

    public boolean readBool() {
        return readRawVarint32() != 0;
    }

    public byte[] readBytes() throws InvalidProtocolBufferNanoException {
        int rawVarint32 = readRawVarint32();
        int i = this.bufferSize;
        int i10 = this.bufferPos;
        if (rawVarint32 > i - i10 || rawVarint32 <= 0) {
            return rawVarint32 == 0 ? WireFormatNano.EMPTY_BYTES : readRawBytes(rawVarint32);
        }
        byte[] bArr = new byte[rawVarint32];
        System.arraycopy(this.buffer, i10, bArr, 0, rawVarint32);
        this.bufferPos += rawVarint32;
        return bArr;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public int readEnum() {
        return readRawVarint32();
    }

    public int readFixed32() {
        return readRawLittleEndian32();
    }

    public long readFixed64() {
        return readRawLittleEndian64();
    }

    public float readFloat() {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public void readGroup(MessageNano messageNano, int i) throws InvalidProtocolBufferNanoException {
        int i10 = this.recursionDepth;
        if (i10 >= this.recursionLimit) {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        }
        this.recursionDepth = i10 + 1;
        messageNano.mergeFrom(this);
        checkLastTagWas(WireFormatNano.makeTag(i, 4));
        this.recursionDepth--;
    }

    public int readInt32() {
        return readRawVarint32();
    }

    public long readInt64() {
        return readRawVarint64();
    }

    public void readMessage(MessageNano messageNano) throws InvalidProtocolBufferNanoException {
        int rawVarint32 = readRawVarint32();
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        }
        int iPushLimit = pushLimit(rawVarint32);
        this.recursionDepth++;
        messageNano.mergeFrom(this);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(iPushLimit);
    }

    public Object readPrimitiveField(int i) {
        switch (i) {
            case 1:
                return Double.valueOf(readDouble());
            case 2:
                return Float.valueOf(readFloat());
            case 3:
                return Long.valueOf(readInt64());
            case 4:
                return Long.valueOf(readUInt64());
            case 5:
                return Integer.valueOf(readInt32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Integer.valueOf(readFixed32());
            case 8:
                return Boolean.valueOf(readBool());
            case 9:
                return readString();
            case 10:
            case 11:
            default:
                throw new IllegalArgumentException(o.i(i, "Unknown type "));
            case 12:
                return readBytes();
            case 13:
                return Integer.valueOf(readUInt32());
            case 14:
                return Integer.valueOf(readEnum());
            case 15:
                return Integer.valueOf(readSFixed32());
            case 16:
                return Long.valueOf(readSFixed64());
            case 17:
                return Integer.valueOf(readSInt32());
            case 18:
                return Long.valueOf(readSInt64());
        }
    }

    public byte readRawByte() throws InvalidProtocolBufferNanoException {
        int i = this.bufferPos;
        if (i == this.bufferSize) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i + 1;
        return bArr[i];
    }

    public byte[] readRawBytes(int i) throws InvalidProtocolBufferNanoException {
        if (i < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i10 = this.bufferPos;
        int i11 = i10 + i;
        int i12 = this.currentLimit;
        if (i11 > i12) {
            skipRawBytes(i12 - i10);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i > this.bufferSize - i10) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.buffer, i10, bArr, 0, i);
        this.bufferPos += i;
        return bArr;
    }

    public int readRawLittleEndian32() throws InvalidProtocolBufferNanoException {
        return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
    }

    public long readRawLittleEndian64() throws InvalidProtocolBufferNanoException {
        byte rawByte = readRawByte();
        return ((((long) readRawByte()) & 255) << 8) | (((long) rawByte) & 255) | ((((long) readRawByte()) & 255) << 16) | ((((long) readRawByte()) & 255) << 24) | ((((long) readRawByte()) & 255) << 32) | ((((long) readRawByte()) & 255) << 40) | ((((long) readRawByte()) & 255) << 48) | ((((long) readRawByte()) & 255) << 56);
    }

    public int readRawVarint32() throws InvalidProtocolBufferNanoException {
        int i;
        byte rawByte = readRawByte();
        if (rawByte >= 0) {
            return rawByte;
        }
        int i10 = rawByte & 127;
        byte rawByte2 = readRawByte();
        if (rawByte2 >= 0) {
            i = rawByte2 << 7;
        } else {
            i10 |= (rawByte2 & 127) << 7;
            byte rawByte3 = readRawByte();
            if (rawByte3 >= 0) {
                i = rawByte3 << 14;
            } else {
                i10 |= (rawByte3 & 127) << 14;
                byte rawByte4 = readRawByte();
                if (rawByte4 < 0) {
                    int i11 = i10 | ((rawByte4 & 127) << 21);
                    byte rawByte5 = readRawByte();
                    int i12 = i11 | (rawByte5 << 28);
                    if (rawByte5 < 0) {
                        for (int i13 = 0; i13 < 5; i13++) {
                            if (readRawByte() < 0) {
                            }
                        }
                        throw InvalidProtocolBufferNanoException.malformedVarint();
                    }
                    return i12;
                }
                i = rawByte4 << 21;
            }
        }
        return i10 | i;
    }

    public long readRawVarint64() throws InvalidProtocolBufferNanoException {
        long j10 = 0;
        for (int i = 0; i < 64; i += 7) {
            byte rawByte = readRawByte();
            j10 |= ((long) (rawByte & 127)) << i;
            if ((rawByte & 128) == 0) {
                return j10;
            }
        }
        throw InvalidProtocolBufferNanoException.malformedVarint();
    }

    public int readSFixed32() {
        return readRawLittleEndian32();
    }

    public long readSFixed64() {
        return readRawLittleEndian64();
    }

    public int readSInt32() {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() {
        return decodeZigZag64(readRawVarint64());
    }

    public String readString() throws InvalidProtocolBufferNanoException {
        int rawVarint32 = readRawVarint32();
        int i = this.bufferSize;
        int i10 = this.bufferPos;
        if (rawVarint32 > i - i10 || rawVarint32 <= 0) {
            return new String(readRawBytes(rawVarint32), InternalNano.UTF_8);
        }
        String str = new String(this.buffer, i10, rawVarint32, InternalNano.UTF_8);
        this.bufferPos += rawVarint32;
        return str;
    }

    public int readTag() throws InvalidProtocolBufferNanoException {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.lastTag = rawVarint32;
        if (rawVarint32 != 0) {
            return rawVarint32;
        }
        throw InvalidProtocolBufferNanoException.invalidTag();
    }

    public int readUInt32() {
        return readRawVarint32();
    }

    public long readUInt64() {
        return readRawVarint64();
    }

    public void rewindToPosition(int i) {
        int i10 = this.bufferPos;
        int i11 = this.bufferStart;
        if (i > i10 - i11) {
            StringBuilder sbM = o.m(i, "Position ", " is beyond current ");
            sbM.append(this.bufferPos - this.bufferStart);
            throw new IllegalArgumentException(sbM.toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(o.i(i, "Bad position "));
        }
        this.bufferPos = i11 + i;
    }

    public int setRecursionLimit(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(o.i(i, "Recursion limit cannot be negative: "));
        }
        int i10 = this.recursionLimit;
        this.recursionLimit = i;
        return i10;
    }

    public int setSizeLimit(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(o.i(i, "Size limit cannot be negative: "));
        }
        int i10 = this.sizeLimit;
        this.sizeLimit = i;
        return i10;
    }

    public boolean skipField(int i) throws InvalidProtocolBufferNanoException {
        int tagWireType = WireFormatNano.getTagWireType(i);
        if (tagWireType == 0) {
            readInt32();
            return true;
        }
        if (tagWireType == 1) {
            readRawLittleEndian64();
            return true;
        }
        if (tagWireType == 2) {
            skipRawBytes(readRawVarint32());
            return true;
        }
        if (tagWireType == 3) {
            skipMessage();
            checkLastTagWas(WireFormatNano.makeTag(WireFormatNano.getTagFieldNumber(i), 4));
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferNanoException.invalidWireType();
        }
        readRawLittleEndian32();
        return true;
    }

    public void skipMessage() throws InvalidProtocolBufferNanoException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
        } while (skipField(tag));
    }

    public void skipRawBytes(int i) throws InvalidProtocolBufferNanoException {
        if (i < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i10 = this.bufferPos;
        int i11 = i10 + i;
        int i12 = this.currentLimit;
        if (i11 > i12) {
            skipRawBytes(i12 - i10);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i > this.bufferSize - i10) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.bufferPos = i11;
    }

    public static CodedInputByteBufferNano newInstance(byte[] bArr, int i, int i10) {
        return new CodedInputByteBufferNano(bArr, i, i10);
    }

    public void resetSizeCounter() {
    }
}
