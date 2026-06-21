package com.yandex.varioqub.protobuf.nano;

import com.google.android.gms.internal.ads.om1;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import l7.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class CodedOutputByteBufferNano {
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    public static final int LITTLE_ENDIAN_64_SIZE = 8;
    private static final int MAX_UTF8_EXPANSION = 3;
    private final ByteBuffer buffer;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException(int i, int i10) {
            super(om1.j("CodedOutputStream was writing to a flat byte array and ran out of space (pos ", i, " limit ", i10, ")."));
        }
    }

    private CodedOutputByteBufferNano(byte[] bArr, int i, int i10) {
        this(ByteBuffer.wrap(bArr, i, i10));
    }

    public static int computeBoolSize(int i, boolean z5) {
        return computeBoolSizeNoTag(z5) + computeTagSize(i);
    }

    public static int computeBoolSizeNoTag(boolean z5) {
        return 1;
    }

    public static int computeBytesSize(int i, byte[] bArr) {
        return computeBytesSizeNoTag(bArr) + computeTagSize(i);
    }

    public static int computeBytesSizeNoTag(byte[] bArr) {
        return computeRawVarint32Size(bArr.length) + bArr.length;
    }

    public static int computeDoubleSize(int i, double d10) {
        return computeDoubleSizeNoTag(d10) + computeTagSize(i);
    }

    public static int computeDoubleSizeNoTag(double d10) {
        return 8;
    }

    public static int computeEnumSize(int i, int i10) {
        return computeEnumSizeNoTag(i10) + computeTagSize(i);
    }

    public static int computeEnumSizeNoTag(int i) {
        return computeRawVarint32Size(i);
    }

    public static int computeFieldSize(int i, int i10, Object obj) {
        switch (i10) {
            case 1:
                return computeDoubleSize(i, ((Double) obj).doubleValue());
            case 2:
                return computeFloatSize(i, ((Float) obj).floatValue());
            case 3:
                return computeInt64Size(i, ((Long) obj).longValue());
            case 4:
                return computeUInt64Size(i, ((Long) obj).longValue());
            case 5:
                return computeInt32Size(i, ((Integer) obj).intValue());
            case 6:
                return computeFixed64Size(i, ((Long) obj).longValue());
            case 7:
                return computeFixed32Size(i, ((Integer) obj).intValue());
            case 8:
                return computeBoolSize(i, ((Boolean) obj).booleanValue());
            case 9:
                return computeStringSize(i, (String) obj);
            case 10:
                return computeGroupSize(i, (MessageNano) obj);
            case 11:
                return computeMessageSize(i, (MessageNano) obj);
            case 12:
                return computeBytesSize(i, (byte[]) obj);
            case 13:
                return computeUInt32Size(i, ((Integer) obj).intValue());
            case 14:
                return computeEnumSize(i, ((Integer) obj).intValue());
            case 15:
                return computeSFixed32Size(i, ((Integer) obj).intValue());
            case 16:
                return computeSFixed64Size(i, ((Long) obj).longValue());
            case 17:
                return computeSInt32Size(i, ((Integer) obj).intValue());
            case 18:
                return computeSInt64Size(i, ((Long) obj).longValue());
            default:
                throw new IllegalArgumentException(o.i(i10, "Unknown type: "));
        }
    }

    public static int computeFixed32Size(int i, int i10) {
        return computeFixed32SizeNoTag(i10) + computeTagSize(i);
    }

    public static int computeFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeFixed64Size(int i, long j10) {
        return computeFixed64SizeNoTag(j10) + computeTagSize(i);
    }

    public static int computeFixed64SizeNoTag(long j10) {
        return 8;
    }

    public static int computeFloatSize(int i, float f10) {
        return computeFloatSizeNoTag(f10) + computeTagSize(i);
    }

    public static int computeFloatSizeNoTag(float f10) {
        return 4;
    }

    public static int computeGroupSize(int i, MessageNano messageNano) {
        return computeGroupSizeNoTag(messageNano) + (computeTagSize(i) * 2);
    }

    public static int computeGroupSizeNoTag(MessageNano messageNano) {
        return messageNano.getSerializedSize();
    }

    public static int computeInt32Size(int i, int i10) {
        return computeInt32SizeNoTag(i10) + computeTagSize(i);
    }

    public static int computeInt32SizeNoTag(int i) {
        if (i >= 0) {
            return computeRawVarint32Size(i);
        }
        return 10;
    }

    public static int computeInt64Size(int i, long j10) {
        return computeInt64SizeNoTag(j10) + computeTagSize(i);
    }

    public static int computeInt64SizeNoTag(long j10) {
        return computeRawVarint64Size(j10);
    }

    public static int computeMessageSize(int i, MessageNano messageNano) {
        return computeMessageSizeNoTag(messageNano) + computeTagSize(i);
    }

    public static int computeMessageSizeNoTag(MessageNano messageNano) {
        int serializedSize = messageNano.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeRawVarint32Size(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int computeSFixed32Size(int i, int i10) {
        return computeSFixed32SizeNoTag(i10) + computeTagSize(i);
    }

    public static int computeSFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeSFixed64Size(int i, long j10) {
        return computeSFixed64SizeNoTag(j10) + computeTagSize(i);
    }

    public static int computeSFixed64SizeNoTag(long j10) {
        return 8;
    }

    public static int computeSInt32Size(int i, int i10) {
        return computeSInt32SizeNoTag(i10) + computeTagSize(i);
    }

    public static int computeSInt32SizeNoTag(int i) {
        return computeRawVarint32Size(encodeZigZag32(i));
    }

    public static int computeSInt64Size(int i, long j10) {
        return computeSInt64SizeNoTag(j10) + computeTagSize(i);
    }

    public static int computeSInt64SizeNoTag(long j10) {
        return computeRawVarint64Size(encodeZigZag64(j10));
    }

    public static int computeStringSize(int i, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(i);
    }

    public static int computeStringSizeNoTag(String str) {
        int iEncodedLength = encodedLength(str);
        return computeRawVarint32Size(iEncodedLength) + iEncodedLength;
    }

    public static int computeTagSize(int i) {
        return computeRawVarint32Size(WireFormatNano.makeTag(i, 0));
    }

    public static int computeUInt32Size(int i, int i10) {
        return computeUInt32SizeNoTag(i10) + computeTagSize(i);
    }

    public static int computeUInt32SizeNoTag(int i) {
        return computeRawVarint32Size(i);
    }

    public static int computeUInt64Size(int i, long j10) {
        return computeUInt64SizeNoTag(j10) + computeTagSize(i);
    }

    public static int computeUInt64SizeNoTag(long j10) {
        return computeRawVarint64Size(j10);
    }

    private static void encode(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (!byteBuffer.hasArray()) {
            encodeDirect(charSequence, byteBuffer);
            return;
        }
        try {
            byteBuffer.position(encode(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e3) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e3);
            throw bufferOverflowException;
        }
    }

    private static void encodeDirect(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 128) {
                byteBuffer.put((byte) cCharAt);
            } else if (cCharAt < 2048) {
                byteBuffer.put((byte) ((cCharAt >>> 6) | VKApiCodes.CODE_CALL_REQUIRES_AUTH));
                byteBuffer.put((byte) ((cCharAt & '?') | 128));
            } else {
                if (cCharAt >= 55296 && 57343 >= cCharAt) {
                    int i10 = i + 1;
                    if (i10 != charSequence.length()) {
                        char cCharAt2 = charSequence.charAt(i10);
                        if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                            int codePoint = Character.toCodePoint(cCharAt, cCharAt2);
                            byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                            byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                            byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                            byteBuffer.put((byte) ((codePoint & 63) | 128));
                            i = i10;
                        } else {
                            i = i10;
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("Unpaired surrogate at index ");
                    sb2.append(i - 1);
                    throw new IllegalArgumentException(sb2.toString());
                }
                byteBuffer.put((byte) ((cCharAt >>> '\f') | 480));
                byteBuffer.put((byte) (((cCharAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((cCharAt & '?') | 128));
            }
            i++;
        }
    }

    public static int encodeZigZag32(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long encodeZigZag64(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    private static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int iEncodedLengthGeneral = length;
        while (true) {
            if (i < length) {
                char cCharAt = charSequence.charAt(i);
                if (cCharAt >= 2048) {
                    iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i);
                    break;
                }
                iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iEncodedLengthGeneral) + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i10 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 2048) {
                i10 += (127 - cCharAt) >>> 31;
            } else {
                i10 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) < 65536) {
                        throw new IllegalArgumentException(o.i(i, "Unpaired surrogate at index "));
                    }
                    i++;
                }
            }
            i++;
        }
        return i10;
    }

    public static CodedOutputByteBufferNano newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public int position() {
        return this.buffer.position();
    }

    public void reset() {
        this.buffer.clear();
    }

    public int spaceLeft() {
        return this.buffer.remaining();
    }

    public void writeBool(int i, boolean z5) throws OutOfSpaceException {
        writeTag(i, 0);
        writeBoolNoTag(z5);
    }

    public void writeBoolNoTag(boolean z5) throws OutOfSpaceException {
        writeRawByte(z5 ? 1 : 0);
    }

    public void writeBytes(int i, byte[] bArr) throws OutOfSpaceException {
        writeTag(i, 2);
        writeBytesNoTag(bArr);
    }

    public void writeBytesNoTag(byte[] bArr) throws OutOfSpaceException {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public void writeDouble(int i, double d10) throws OutOfSpaceException {
        writeTag(i, 1);
        writeDoubleNoTag(d10);
    }

    public void writeDoubleNoTag(double d10) throws OutOfSpaceException {
        writeRawLittleEndian64(Double.doubleToLongBits(d10));
    }

    public void writeEnum(int i, int i10) throws OutOfSpaceException {
        writeTag(i, 0);
        writeEnumNoTag(i10);
    }

    public void writeEnumNoTag(int i) throws OutOfSpaceException {
        writeRawVarint32(i);
    }

    public void writeField(int i, int i10, Object obj) throws IOException {
        switch (i10) {
            case 1:
                writeDouble(i, ((Double) obj).doubleValue());
                return;
            case 2:
                writeFloat(i, ((Float) obj).floatValue());
                return;
            case 3:
                writeInt64(i, ((Long) obj).longValue());
                return;
            case 4:
                writeUInt64(i, ((Long) obj).longValue());
                return;
            case 5:
                writeInt32(i, ((Integer) obj).intValue());
                return;
            case 6:
                writeFixed64(i, ((Long) obj).longValue());
                return;
            case 7:
                writeFixed32(i, ((Integer) obj).intValue());
                return;
            case 8:
                writeBool(i, ((Boolean) obj).booleanValue());
                return;
            case 9:
                writeString(i, (String) obj);
                return;
            case 10:
                writeGroup(i, (MessageNano) obj);
                return;
            case 11:
                writeMessage(i, (MessageNano) obj);
                return;
            case 12:
                writeBytes(i, (byte[]) obj);
                return;
            case 13:
                writeUInt32(i, ((Integer) obj).intValue());
                return;
            case 14:
                writeEnum(i, ((Integer) obj).intValue());
                return;
            case 15:
                writeSFixed32(i, ((Integer) obj).intValue());
                return;
            case 16:
                writeSFixed64(i, ((Long) obj).longValue());
                return;
            case 17:
                writeSInt32(i, ((Integer) obj).intValue());
                return;
            case 18:
                writeSInt64(i, ((Long) obj).longValue());
                return;
            default:
                throw new IOException(o.i(i10, "Unknown type: "));
        }
    }

    public void writeFixed32(int i, int i10) throws OutOfSpaceException {
        writeTag(i, 5);
        writeFixed32NoTag(i10);
    }

    public void writeFixed32NoTag(int i) throws OutOfSpaceException {
        writeRawLittleEndian32(i);
    }

    public void writeFixed64(int i, long j10) throws OutOfSpaceException {
        writeTag(i, 1);
        writeFixed64NoTag(j10);
    }

    public void writeFixed64NoTag(long j10) throws OutOfSpaceException {
        writeRawLittleEndian64(j10);
    }

    public void writeFloat(int i, float f10) throws OutOfSpaceException {
        writeTag(i, 5);
        writeFloatNoTag(f10);
    }

    public void writeFloatNoTag(float f10) throws OutOfSpaceException {
        writeRawLittleEndian32(Float.floatToIntBits(f10));
    }

    public void writeGroup(int i, MessageNano messageNano) throws OutOfSpaceException {
        writeTag(i, 3);
        writeGroupNoTag(messageNano);
        writeTag(i, 4);
    }

    public void writeGroupNoTag(MessageNano messageNano) {
        messageNano.writeTo(this);
    }

    public void writeInt32(int i, int i10) throws OutOfSpaceException {
        writeTag(i, 0);
        writeInt32NoTag(i10);
    }

    public void writeInt32NoTag(int i) throws OutOfSpaceException {
        if (i >= 0) {
            writeRawVarint32(i);
        } else {
            writeRawVarint64(i);
        }
    }

    public void writeInt64(int i, long j10) throws OutOfSpaceException {
        writeTag(i, 0);
        writeInt64NoTag(j10);
    }

    public void writeInt64NoTag(long j10) throws OutOfSpaceException {
        writeRawVarint64(j10);
    }

    public void writeMessage(int i, MessageNano messageNano) throws OutOfSpaceException {
        writeTag(i, 2);
        writeMessageNoTag(messageNano);
    }

    public void writeMessageNoTag(MessageNano messageNano) throws OutOfSpaceException {
        writeRawVarint32(messageNano.getCachedSize());
        messageNano.writeTo(this);
    }

    public void writeRawByte(byte b2) throws OutOfSpaceException {
        if (!this.buffer.hasRemaining()) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.put(b2);
    }

    public void writeRawBytes(byte[] bArr) throws OutOfSpaceException {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public void writeRawLittleEndian32(int i) throws OutOfSpaceException {
        if (this.buffer.remaining() < 4) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.putInt(i);
    }

    public void writeRawLittleEndian64(long j10) throws OutOfSpaceException {
        if (this.buffer.remaining() < 8) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.putLong(j10);
    }

    public void writeRawVarint32(int i) throws OutOfSpaceException {
        while ((i & (-128)) != 0) {
            writeRawByte((i & 127) | 128);
            i >>>= 7;
        }
        writeRawByte(i);
    }

    public void writeRawVarint64(long j10) throws OutOfSpaceException {
        while (((-128) & j10) != 0) {
            writeRawByte((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        writeRawByte((int) j10);
    }

    public void writeSFixed32(int i, int i10) throws OutOfSpaceException {
        writeTag(i, 5);
        writeSFixed32NoTag(i10);
    }

    public void writeSFixed32NoTag(int i) throws OutOfSpaceException {
        writeRawLittleEndian32(i);
    }

    public void writeSFixed64(int i, long j10) throws OutOfSpaceException {
        writeTag(i, 1);
        writeSFixed64NoTag(j10);
    }

    public void writeSFixed64NoTag(long j10) throws OutOfSpaceException {
        writeRawLittleEndian64(j10);
    }

    public void writeSInt32(int i, int i10) throws OutOfSpaceException {
        writeTag(i, 0);
        writeSInt32NoTag(i10);
    }

    public void writeSInt32NoTag(int i) throws OutOfSpaceException {
        writeRawVarint32(encodeZigZag32(i));
    }

    public void writeSInt64(int i, long j10) throws OutOfSpaceException {
        writeTag(i, 0);
        writeSInt64NoTag(j10);
    }

    public void writeSInt64NoTag(long j10) throws OutOfSpaceException {
        writeRawVarint64(encodeZigZag64(j10));
    }

    public void writeString(int i, String str) throws OutOfSpaceException {
        writeTag(i, 2);
        writeStringNoTag(str);
    }

    public void writeStringNoTag(String str) throws OutOfSpaceException {
        try {
            int iComputeRawVarint32Size = computeRawVarint32Size(str.length());
            if (iComputeRawVarint32Size != computeRawVarint32Size(str.length() * 3)) {
                writeRawVarint32(encodedLength(str));
                encode(str, this.buffer);
                return;
            }
            int iPosition = this.buffer.position();
            if (this.buffer.remaining() < iComputeRawVarint32Size) {
                throw new OutOfSpaceException(iPosition + iComputeRawVarint32Size, this.buffer.limit());
            }
            this.buffer.position(iPosition + iComputeRawVarint32Size);
            encode(str, this.buffer);
            int iPosition2 = this.buffer.position();
            this.buffer.position(iPosition);
            writeRawVarint32((iPosition2 - iPosition) - iComputeRawVarint32Size);
            this.buffer.position(iPosition2);
        } catch (BufferOverflowException e3) {
            OutOfSpaceException outOfSpaceException = new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
            outOfSpaceException.initCause(e3);
            throw outOfSpaceException;
        }
    }

    public void writeTag(int i, int i10) throws OutOfSpaceException {
        writeRawVarint32(WireFormatNano.makeTag(i, i10));
    }

    public void writeUInt32(int i, int i10) throws OutOfSpaceException {
        writeTag(i, 0);
        writeUInt32NoTag(i10);
    }

    public void writeUInt32NoTag(int i) throws OutOfSpaceException {
        writeRawVarint32(i);
    }

    public void writeUInt64(int i, long j10) throws OutOfSpaceException {
        writeTag(i, 0);
        writeUInt64NoTag(j10);
    }

    public void writeUInt64NoTag(long j10) throws OutOfSpaceException {
        writeRawVarint64(j10);
    }

    private CodedOutputByteBufferNano(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static CodedOutputByteBufferNano newInstance(byte[] bArr, int i, int i10) {
        return new CodedOutputByteBufferNano(bArr, i, i10);
    }

    public void writeRawBytes(byte[] bArr, int i, int i10) throws OutOfSpaceException {
        if (this.buffer.remaining() < i10) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.put(bArr, i, i10);
    }

    public void writeRawByte(int i) throws OutOfSpaceException {
        writeRawByte((byte) i);
    }

    private static int encode(CharSequence charSequence, byte[] bArr, int i, int i10) {
        int i11;
        char cCharAt;
        int length = charSequence.length();
        int i12 = i10 + i;
        int i13 = 0;
        while (i13 < length && (i11 = i13 + i) < i12 && (cCharAt = charSequence.charAt(i13)) < 128) {
            bArr[i11] = (byte) cCharAt;
            i13++;
        }
        if (i13 == length) {
            return i + length;
        }
        int i14 = i + i13;
        while (i13 < length) {
            char cCharAt2 = charSequence.charAt(i13);
            if (cCharAt2 < 128 && i14 < i12) {
                bArr[i14] = (byte) cCharAt2;
                i14++;
            } else if (cCharAt2 < 2048 && i14 <= i12 - 2) {
                int i15 = i14 + 1;
                bArr[i14] = (byte) ((cCharAt2 >>> 6) | VKApiCodes.CODE_CALL_REQUIRES_AUTH);
                i14 += 2;
                bArr[i15] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i14 > i12 - 3) {
                    if (i14 <= i12 - 4) {
                        int i16 = i13 + 1;
                        if (i16 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i16);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i14] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i14 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i17 = i14 + 3;
                                bArr[i14 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i14 += 4;
                                bArr[i17] = (byte) ((codePoint & 63) | 128);
                                i13 = i16;
                            } else {
                                i13 = i16;
                            }
                        }
                        StringBuilder sb2 = new StringBuilder("Unpaired surrogate at index ");
                        sb2.append(i13 - 1);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i14);
                }
                bArr[i14] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i18 = i14 + 2;
                bArr[i14 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i14 += 3;
                bArr[i18] = (byte) ((cCharAt2 & '?') | 128);
            }
            i13++;
        }
        return i14;
    }
}
