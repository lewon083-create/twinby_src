package com.yandex.varioqub.protobuf.nano;

import a0.u;
import com.yandex.varioqub.config.model.ConfigValue;
import com.yandex.varioqub.protobuf.nano.MapFactories;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class InternalNano {
    public static final int TYPE_BOOL = 8;
    public static final int TYPE_BYTES = 12;
    public static final int TYPE_DOUBLE = 1;
    public static final int TYPE_ENUM = 14;
    public static final int TYPE_FIXED32 = 7;
    public static final int TYPE_FIXED64 = 6;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_GROUP = 10;
    public static final int TYPE_INT32 = 5;
    public static final int TYPE_INT64 = 3;
    public static final int TYPE_MESSAGE = 11;
    public static final int TYPE_SFIXED32 = 15;
    public static final int TYPE_SFIXED64 = 16;
    public static final int TYPE_SINT32 = 17;
    public static final int TYPE_SINT64 = 18;
    public static final int TYPE_STRING = 9;
    public static final int TYPE_UINT32 = 13;
    public static final int TYPE_UINT64 = 4;
    static final Charset UTF_8 = Charset.forName("UTF-8");
    static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    public static final Object LAZY_INIT_LOCK = new Object();

    private InternalNano() {
    }

    public static byte[] bytesDefaultValue(String str) {
        return str.getBytes(ISO_8859_1);
    }

    public static void cloneUnknownFieldData(ExtendableMessageNano extendableMessageNano, ExtendableMessageNano extendableMessageNano2) {
        FieldArray fieldArray = extendableMessageNano.unknownFieldData;
        if (fieldArray != null) {
            extendableMessageNano2.unknownFieldData = fieldArray.m596clone();
        }
    }

    public static <K, V> int computeMapFieldSize(Map<K, V> map, int i, int i10, int i11) {
        int iComputeTagSize = CodedOutputByteBufferNano.computeTagSize(i);
        int iComputeRawVarint32Size = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            int iComputeFieldSize = CodedOutputByteBufferNano.computeFieldSize(2, i11, value) + CodedOutputByteBufferNano.computeFieldSize(1, i10, key);
            iComputeRawVarint32Size += CodedOutputByteBufferNano.computeRawVarint32Size(iComputeFieldSize) + iComputeTagSize + iComputeFieldSize;
        }
        return iComputeRawVarint32Size;
    }

    public static byte[] copyFromUtf8(String str) {
        return str.getBytes(UTF_8);
    }

    public static boolean equals(int[] iArr, int[] iArr2) {
        return (iArr == null || iArr.length == 0) ? iArr2 == null || iArr2.length == 0 : Arrays.equals(iArr, iArr2);
    }

    private static boolean equalsMapValue(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw new IllegalStateException("keys and values in maps cannot be null");
        }
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    public static int hashCode(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(iArr);
    }

    private static int hashCodeForMap(Object obj) {
        return obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> mergeMapEntry(CodedInputByteBufferNano codedInputByteBufferNano, Map<K, V> map, MapFactories.MapFactory mapFactory, int i, int i10, V v5, int i11, int i12) throws InvalidProtocolBufferNanoException {
        Map<K, V> mapForMap = mapFactory.forMap(map);
        int iPushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
        Object objPrimitiveDefaultValue = null;
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == i11) {
                objPrimitiveDefaultValue = codedInputByteBufferNano.readPrimitiveField(i);
            } else if (tag == i12) {
                if (i10 == 11) {
                    codedInputByteBufferNano.readMessage((MessageNano) v5);
                } else {
                    v5 = (V) codedInputByteBufferNano.readPrimitiveField(i10);
                }
            } else if (!codedInputByteBufferNano.skipField(tag)) {
                break;
            }
        }
        codedInputByteBufferNano.checkLastTagWas(0);
        codedInputByteBufferNano.popLimit(iPushLimit);
        if (objPrimitiveDefaultValue == null) {
            objPrimitiveDefaultValue = primitiveDefaultValue(i);
        }
        if (v5 == 0) {
            v5 = primitiveDefaultValue(i10);
        }
        mapForMap.put(objPrimitiveDefaultValue, v5);
        return mapForMap;
    }

    private static Object primitiveDefaultValue(int i) {
        switch (i) {
            case 1:
                return Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE);
            case 2:
                return Float.valueOf(0.0f);
            case 3:
            case 4:
            case 6:
            case 16:
            case 18:
                return 0L;
            case 5:
            case 7:
            case 13:
            case 14:
            case 15:
            case 17:
                return 0;
            case 8:
                return Boolean.FALSE;
            case 9:
                return "";
            case 10:
            case 11:
            default:
                throw new IllegalArgumentException(u.k(i, "Type: ", " is not a primitive type."));
            case 12:
                return WireFormatNano.EMPTY_BYTES;
        }
    }

    public static <K, V> void serializeMapField(CodedOutputByteBufferNano codedOutputByteBufferNano, Map<K, V> map, int i, int i10, int i11) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            int iComputeFieldSize = CodedOutputByteBufferNano.computeFieldSize(2, i11, value) + CodedOutputByteBufferNano.computeFieldSize(1, i10, key);
            codedOutputByteBufferNano.writeTag(i, 2);
            codedOutputByteBufferNano.writeRawVarint32(iComputeFieldSize);
            codedOutputByteBufferNano.writeField(1, i10, key);
            codedOutputByteBufferNano.writeField(2, i11, value);
        }
    }

    public static String stringDefaultValue(String str) {
        return new String(str.getBytes(ISO_8859_1), UTF_8);
    }

    public static int hashCode(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(jArr);
    }

    public static int hashCode(float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(fArr);
    }

    public static boolean equals(long[] jArr, long[] jArr2) {
        if (jArr == null || jArr.length == 0) {
            return jArr2 == null || jArr2.length == 0;
        }
        return Arrays.equals(jArr, jArr2);
    }

    public static int hashCode(double[] dArr) {
        if (dArr == null || dArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(dArr);
    }

    public static int hashCode(boolean[] zArr) {
        if (zArr == null || zArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(zArr);
    }

    public static int hashCode(byte[][] bArr) {
        int length;
        int iHashCode;
        if (bArr == null) {
            length = 0;
            iHashCode = 0;
        } else {
            length = bArr.length;
            iHashCode = 0;
        }
        for (int i = 0; i < length; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 != null) {
                iHashCode = Arrays.hashCode(bArr2) + (iHashCode * 31);
            }
        }
        return iHashCode;
    }

    public static boolean equals(float[] fArr, float[] fArr2) {
        if (fArr == null || fArr.length == 0) {
            return fArr2 == null || fArr2.length == 0;
        }
        return Arrays.equals(fArr, fArr2);
    }

    public static int hashCode(Object[] objArr) {
        int length;
        int iHashCode;
        if (objArr == null) {
            length = 0;
            iHashCode = 0;
        } else {
            length = objArr.length;
            iHashCode = 0;
        }
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj != null) {
                iHashCode = obj.hashCode() + (iHashCode * 31);
            }
        }
        return iHashCode;
    }

    public static boolean equals(double[] dArr, double[] dArr2) {
        if (dArr == null || dArr.length == 0) {
            return dArr2 == null || dArr2.length == 0;
        }
        return Arrays.equals(dArr, dArr2);
    }

    public static <K, V> int hashCode(Map<K, V> map) {
        int iHashCodeForMap = 0;
        if (map == null) {
            return 0;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            iHashCodeForMap += hashCodeForMap(entry.getValue()) ^ hashCodeForMap(entry.getKey());
        }
        return iHashCodeForMap;
    }

    public static boolean equals(boolean[] zArr, boolean[] zArr2) {
        if (zArr == null || zArr.length == 0) {
            return zArr2 == null || zArr2.length == 0;
        }
        return Arrays.equals(zArr, zArr2);
    }

    public static boolean equals(byte[][] bArr, byte[][] bArr2) {
        int length;
        int i;
        int length2 = bArr == null ? 0 : bArr.length;
        if (bArr2 == null) {
            length = 0;
            i = 0;
        } else {
            length = bArr2.length;
            i = 0;
        }
        int i10 = i;
        while (true) {
            if (i >= length2 || bArr[i] != null) {
                while (i10 < length && bArr2[i10] == null) {
                    i10++;
                }
                boolean z5 = i >= length2;
                boolean z10 = i10 >= length;
                if (z5 && z10) {
                    return true;
                }
                if (z5 != z10 || !Arrays.equals(bArr[i], bArr2[i10])) {
                    return false;
                }
                i++;
                i10++;
            } else {
                i++;
            }
        }
    }

    public static boolean equals(Object[] objArr, Object[] objArr2) {
        int length;
        int i;
        int length2 = objArr == null ? 0 : objArr.length;
        if (objArr2 == null) {
            length = 0;
            i = 0;
        } else {
            length = objArr2.length;
            i = 0;
        }
        int i10 = i;
        while (true) {
            if (i >= length2 || objArr[i] != null) {
                while (i10 < length && objArr2[i10] == null) {
                    i10++;
                }
                boolean z5 = i >= length2;
                boolean z10 = i10 >= length;
                if (z5 && z10) {
                    return true;
                }
                if (z5 != z10 || !objArr[i].equals(objArr2[i10])) {
                    return false;
                }
                i++;
                i10++;
            } else {
                i++;
            }
        }
    }

    public static <K, V> boolean equals(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map == null) {
            return map2.size() == 0;
        }
        if (map2 == null) {
            return map.size() == 0;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !equalsMapValue(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }
}
