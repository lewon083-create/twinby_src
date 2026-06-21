package com.yandex.varioqub.protobuf.nano;

import com.yandex.varioqub.protobuf.nano.ExtendableMessageNano;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class Extension<M extends ExtendableMessageNano<M>, T> {
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
    protected final Class<T> clazz;
    protected final boolean repeated;
    public final int tag;
    protected final int type;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class PrimitiveExtension<M extends ExtendableMessageNano<M>, T> extends Extension<M, T> {
        private final int nonPackedTag;
        private final int packedTag;

        public PrimitiveExtension(int i, Class<T> cls, int i10, boolean z5, int i11, int i12) {
            super(i, cls, i10, z5);
            this.nonPackedTag = i11;
            this.packedTag = i12;
        }

        private int computePackedDataSize(Object obj) {
            int length = Array.getLength(obj);
            int i = 0;
            switch (this.type) {
                case 1:
                case 6:
                case 16:
                    return length * 8;
                case 2:
                case 7:
                case 15:
                    return length * 4;
                case 3:
                    int iComputeInt64SizeNoTag = 0;
                    while (i < length) {
                        iComputeInt64SizeNoTag += CodedOutputByteBufferNano.computeInt64SizeNoTag(Array.getLong(obj, i));
                        i++;
                    }
                    return iComputeInt64SizeNoTag;
                case 4:
                    int iComputeUInt64SizeNoTag = 0;
                    while (i < length) {
                        iComputeUInt64SizeNoTag += CodedOutputByteBufferNano.computeUInt64SizeNoTag(Array.getLong(obj, i));
                        i++;
                    }
                    return iComputeUInt64SizeNoTag;
                case 5:
                    int iComputeInt32SizeNoTag = 0;
                    while (i < length) {
                        iComputeInt32SizeNoTag += CodedOutputByteBufferNano.computeInt32SizeNoTag(Array.getInt(obj, i));
                        i++;
                    }
                    return iComputeInt32SizeNoTag;
                case 8:
                    return length;
                case 9:
                case 10:
                case 11:
                case 12:
                default:
                    throw new IllegalArgumentException("Unexpected non-packable type " + this.type);
                case 13:
                    int iComputeUInt32SizeNoTag = 0;
                    while (i < length) {
                        iComputeUInt32SizeNoTag += CodedOutputByteBufferNano.computeUInt32SizeNoTag(Array.getInt(obj, i));
                        i++;
                    }
                    return iComputeUInt32SizeNoTag;
                case 14:
                    int iComputeEnumSizeNoTag = 0;
                    while (i < length) {
                        iComputeEnumSizeNoTag += CodedOutputByteBufferNano.computeEnumSizeNoTag(Array.getInt(obj, i));
                        i++;
                    }
                    return iComputeEnumSizeNoTag;
                case 17:
                    int iComputeSInt32SizeNoTag = 0;
                    while (i < length) {
                        iComputeSInt32SizeNoTag += CodedOutputByteBufferNano.computeSInt32SizeNoTag(Array.getInt(obj, i));
                        i++;
                    }
                    return iComputeSInt32SizeNoTag;
                case 18:
                    int iComputeSInt64SizeNoTag = 0;
                    while (i < length) {
                        iComputeSInt64SizeNoTag += CodedOutputByteBufferNano.computeSInt64SizeNoTag(Array.getLong(obj, i));
                        i++;
                    }
                    return iComputeSInt64SizeNoTag;
            }
        }

        @Override // com.yandex.varioqub.protobuf.nano.Extension
        public int computeRepeatedSerializedSize(Object obj) {
            int i = this.tag;
            if (i == this.nonPackedTag) {
                return super.computeRepeatedSerializedSize(obj);
            }
            if (i == this.packedTag) {
                int iComputePackedDataSize = computePackedDataSize(obj);
                return CodedOutputByteBufferNano.computeRawVarint32Size(this.tag) + CodedOutputByteBufferNano.computeRawVarint32Size(iComputePackedDataSize) + iComputePackedDataSize;
            }
            throw new IllegalArgumentException("Unexpected repeated extension tag " + this.tag + ", unequal to both non-packed variant " + this.nonPackedTag + " and packed variant " + this.packedTag);
        }

        @Override // com.yandex.varioqub.protobuf.nano.Extension
        public final int computeSingularSerializedSize(Object obj) {
            int tagFieldNumber = WireFormatNano.getTagFieldNumber(this.tag);
            switch (this.type) {
                case 1:
                    return CodedOutputByteBufferNano.computeDoubleSize(tagFieldNumber, ((Double) obj).doubleValue());
                case 2:
                    return CodedOutputByteBufferNano.computeFloatSize(tagFieldNumber, ((Float) obj).floatValue());
                case 3:
                    return CodedOutputByteBufferNano.computeInt64Size(tagFieldNumber, ((Long) obj).longValue());
                case 4:
                    return CodedOutputByteBufferNano.computeUInt64Size(tagFieldNumber, ((Long) obj).longValue());
                case 5:
                    return CodedOutputByteBufferNano.computeInt32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 6:
                    return CodedOutputByteBufferNano.computeFixed64Size(tagFieldNumber, ((Long) obj).longValue());
                case 7:
                    return CodedOutputByteBufferNano.computeFixed32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 8:
                    return CodedOutputByteBufferNano.computeBoolSize(tagFieldNumber, ((Boolean) obj).booleanValue());
                case 9:
                    return CodedOutputByteBufferNano.computeStringSize(tagFieldNumber, (String) obj);
                case 10:
                case 11:
                default:
                    throw new IllegalArgumentException("Unknown type " + this.type);
                case 12:
                    return CodedOutputByteBufferNano.computeBytesSize(tagFieldNumber, (byte[]) obj);
                case 13:
                    return CodedOutputByteBufferNano.computeUInt32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 14:
                    return CodedOutputByteBufferNano.computeEnumSize(tagFieldNumber, ((Integer) obj).intValue());
                case 15:
                    return CodedOutputByteBufferNano.computeSFixed32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 16:
                    return CodedOutputByteBufferNano.computeSFixed64Size(tagFieldNumber, ((Long) obj).longValue());
                case 17:
                    return CodedOutputByteBufferNano.computeSInt32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 18:
                    return CodedOutputByteBufferNano.computeSInt64Size(tagFieldNumber, ((Long) obj).longValue());
            }
        }

        @Override // com.yandex.varioqub.protobuf.nano.Extension
        public Object readData(CodedInputByteBufferNano codedInputByteBufferNano) {
            try {
                return codedInputByteBufferNano.readPrimitiveField(this.type);
            } catch (IOException e3) {
                throw new IllegalArgumentException("Error reading extension field", e3);
            }
        }

        @Override // com.yandex.varioqub.protobuf.nano.Extension
        public void readDataInto(UnknownFieldData unknownFieldData, List<Object> list) {
            if (unknownFieldData.tag == this.nonPackedTag) {
                list.add(readData(CodedInputByteBufferNano.newInstance(unknownFieldData.bytes)));
                return;
            }
            CodedInputByteBufferNano codedInputByteBufferNanoNewInstance = CodedInputByteBufferNano.newInstance(unknownFieldData.bytes);
            try {
                codedInputByteBufferNanoNewInstance.pushLimit(codedInputByteBufferNanoNewInstance.readRawVarint32());
                while (!codedInputByteBufferNanoNewInstance.isAtEnd()) {
                    list.add(readData(codedInputByteBufferNanoNewInstance));
                }
            } catch (IOException e3) {
                throw new IllegalArgumentException("Error reading extension field", e3);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.yandex.varioqub.protobuf.nano.Extension
        public void writeRepeatedData(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
            int i = this.tag;
            if (i == this.nonPackedTag) {
                super.writeRepeatedData(obj, codedOutputByteBufferNano);
                return;
            }
            if (i != this.packedTag) {
                throw new IllegalArgumentException("Unexpected repeated extension tag " + this.tag + ", unequal to both non-packed variant " + this.nonPackedTag + " and packed variant " + this.packedTag);
            }
            int length = Array.getLength(obj);
            int iComputePackedDataSize = computePackedDataSize(obj);
            try {
                codedOutputByteBufferNano.writeRawVarint32(this.tag);
                codedOutputByteBufferNano.writeRawVarint32(iComputePackedDataSize);
                int i10 = 0;
                switch (this.type) {
                    case 1:
                        while (i10 < length) {
                            codedOutputByteBufferNano.writeDoubleNoTag(Array.getDouble(obj, i10));
                            i10++;
                        }
                        return;
                    case 2:
                        while (i10 < length) {
                            codedOutputByteBufferNano.writeFloatNoTag(Array.getFloat(obj, i10));
                            i10++;
                        }
                        return;
                    case 3:
                        while (i10 < length) {
                            codedOutputByteBufferNano.writeInt64NoTag(Array.getLong(obj, i10));
                            i10++;
                        }
                        return;
                    case 4:
                        while (i10 < length) {
                            codedOutputByteBufferNano.writeUInt64NoTag(Array.getLong(obj, i10));
                            i10++;
                        }
                        return;
                    case 5:
                        while (i10 < length) {
                            codedOutputByteBufferNano.writeInt32NoTag(Array.getInt(obj, i10));
                            i10++;
                        }
                        return;
                    case 6:
                        while (i10 < length) {
                            codedOutputByteBufferNano.writeFixed64NoTag(Array.getLong(obj, i10));
                            i10++;
                        }
                        return;
                    case 7:
                        while (i10 < length) {
                            codedOutputByteBufferNano.writeFixed32NoTag(Array.getInt(obj, i10));
                            i10++;
                        }
                        return;
                    case 8:
                        while (i10 < length) {
                            codedOutputByteBufferNano.writeBoolNoTag(Array.getBoolean(obj, i10));
                            i10++;
                        }
                        return;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    default:
                        throw new IllegalArgumentException("Unpackable type " + this.type);
                    case 13:
                        while (i10 < length) {
                            codedOutputByteBufferNano.writeUInt32NoTag(Array.getInt(obj, i10));
                            i10++;
                        }
                        return;
                    case 14:
                        while (i10 < length) {
                            codedOutputByteBufferNano.writeEnumNoTag(Array.getInt(obj, i10));
                            i10++;
                        }
                        return;
                    case 15:
                        while (i10 < length) {
                            codedOutputByteBufferNano.writeSFixed32NoTag(Array.getInt(obj, i10));
                            i10++;
                        }
                        return;
                    case 16:
                        while (i10 < length) {
                            codedOutputByteBufferNano.writeSFixed64NoTag(Array.getLong(obj, i10));
                            i10++;
                        }
                        return;
                    case 17:
                        while (i10 < length) {
                            codedOutputByteBufferNano.writeSInt32NoTag(Array.getInt(obj, i10));
                            i10++;
                        }
                        return;
                    case 18:
                        while (i10 < length) {
                            codedOutputByteBufferNano.writeSInt64NoTag(Array.getLong(obj, i10));
                            i10++;
                        }
                        return;
                }
            } catch (IOException e3) {
                throw new IllegalStateException(e3);
            }
        }

        @Override // com.yandex.varioqub.protobuf.nano.Extension
        public final void writeSingularData(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
            try {
                codedOutputByteBufferNano.writeRawVarint32(this.tag);
                switch (this.type) {
                    case 1:
                        codedOutputByteBufferNano.writeDoubleNoTag(((Double) obj).doubleValue());
                        return;
                    case 2:
                        codedOutputByteBufferNano.writeFloatNoTag(((Float) obj).floatValue());
                        return;
                    case 3:
                        codedOutputByteBufferNano.writeInt64NoTag(((Long) obj).longValue());
                        return;
                    case 4:
                        codedOutputByteBufferNano.writeUInt64NoTag(((Long) obj).longValue());
                        return;
                    case 5:
                        codedOutputByteBufferNano.writeInt32NoTag(((Integer) obj).intValue());
                        return;
                    case 6:
                        codedOutputByteBufferNano.writeFixed64NoTag(((Long) obj).longValue());
                        return;
                    case 7:
                        codedOutputByteBufferNano.writeFixed32NoTag(((Integer) obj).intValue());
                        return;
                    case 8:
                        codedOutputByteBufferNano.writeBoolNoTag(((Boolean) obj).booleanValue());
                        return;
                    case 9:
                        codedOutputByteBufferNano.writeStringNoTag((String) obj);
                        return;
                    case 10:
                    case 11:
                    default:
                        throw new IllegalArgumentException("Unknown type " + this.type);
                    case 12:
                        codedOutputByteBufferNano.writeBytesNoTag((byte[]) obj);
                        return;
                    case 13:
                        codedOutputByteBufferNano.writeUInt32NoTag(((Integer) obj).intValue());
                        return;
                    case 14:
                        codedOutputByteBufferNano.writeEnumNoTag(((Integer) obj).intValue());
                        return;
                    case 15:
                        codedOutputByteBufferNano.writeSFixed32NoTag(((Integer) obj).intValue());
                        return;
                    case 16:
                        codedOutputByteBufferNano.writeSFixed64NoTag(((Long) obj).longValue());
                        return;
                    case 17:
                        codedOutputByteBufferNano.writeSInt32NoTag(((Integer) obj).intValue());
                        return;
                    case 18:
                        codedOutputByteBufferNano.writeSInt64NoTag(((Long) obj).longValue());
                        return;
                }
            } catch (IOException e3) {
                throw new IllegalStateException(e3);
            }
        }
    }

    @Deprecated
    public static <M extends ExtendableMessageNano<M>, T extends MessageNano> Extension<M, T> createMessageTyped(int i, Class<T> cls, int i10) {
        return new Extension<>(i, cls, i10, false);
    }

    public static <M extends ExtendableMessageNano<M>, T> Extension<M, T> createPrimitiveTyped(int i, Class<T> cls, long j10) {
        return new PrimitiveExtension(i, cls, (int) j10, false, 0, 0);
    }

    public static <M extends ExtendableMessageNano<M>, T extends MessageNano> Extension<M, T[]> createRepeatedMessageTyped(int i, Class<T[]> cls, long j10) {
        return new Extension<>(i, cls, (int) j10, true);
    }

    public static <M extends ExtendableMessageNano<M>, T> Extension<M, T> createRepeatedPrimitiveTyped(int i, Class<T> cls, long j10, long j11, long j12) {
        return new PrimitiveExtension(i, cls, (int) j10, true, (int) j11, (int) j12);
    }

    private T getRepeatedValueFrom(List<UnknownFieldData> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            UnknownFieldData unknownFieldData = list.get(i);
            if (unknownFieldData.bytes.length != 0) {
                readDataInto(unknownFieldData, arrayList);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        Class<T> cls = this.clazz;
        T tCast = cls.cast(Array.newInstance(cls.getComponentType(), size));
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(tCast, i10, arrayList.get(i10));
        }
        return tCast;
    }

    private T getSingularValueFrom(List<UnknownFieldData> list) {
        if (list.isEmpty()) {
            return null;
        }
        return this.clazz.cast(readData(CodedInputByteBufferNano.newInstance(list.get(list.size() - 1).bytes)));
    }

    public int computeRepeatedSerializedSize(Object obj) {
        int length = Array.getLength(obj);
        int iComputeSingularSerializedSize = 0;
        for (int i = 0; i < length; i++) {
            if (Array.get(obj, i) != null) {
                iComputeSingularSerializedSize = computeSingularSerializedSize(Array.get(obj, i)) + iComputeSingularSerializedSize;
            }
        }
        return iComputeSingularSerializedSize;
    }

    public int computeSerializedSize(Object obj) {
        return this.repeated ? computeRepeatedSerializedSize(obj) : computeSingularSerializedSize(obj);
    }

    public int computeSingularSerializedSize(Object obj) {
        int tagFieldNumber = WireFormatNano.getTagFieldNumber(this.tag);
        int i = this.type;
        if (i == 10) {
            return CodedOutputByteBufferNano.computeGroupSize(tagFieldNumber, (MessageNano) obj);
        }
        if (i == 11) {
            return CodedOutputByteBufferNano.computeMessageSize(tagFieldNumber, (MessageNano) obj);
        }
        throw new IllegalArgumentException("Unknown type " + this.type);
    }

    public final T getValueFrom(List<UnknownFieldData> list) {
        if (list == null) {
            return null;
        }
        return this.repeated ? getRepeatedValueFrom(list) : getSingularValueFrom(list);
    }

    public Object readData(CodedInputByteBufferNano codedInputByteBufferNano) {
        Class componentType = this.repeated ? this.clazz.getComponentType() : this.clazz;
        try {
            int i = this.type;
            if (i == 10) {
                MessageNano messageNano = (MessageNano) componentType.newInstance();
                codedInputByteBufferNano.readGroup(messageNano, WireFormatNano.getTagFieldNumber(this.tag));
                return messageNano;
            }
            if (i == 11) {
                MessageNano messageNano2 = (MessageNano) componentType.newInstance();
                codedInputByteBufferNano.readMessage(messageNano2);
                return messageNano2;
            }
            throw new IllegalArgumentException("Unknown type " + this.type);
        } catch (IOException e3) {
            throw new IllegalArgumentException("Error reading extension field", e3);
        } catch (IllegalAccessException e7) {
            throw new IllegalArgumentException("Error creating instance of class " + componentType, e7);
        } catch (InstantiationException e10) {
            throw new IllegalArgumentException("Error creating instance of class " + componentType, e10);
        }
    }

    public void readDataInto(UnknownFieldData unknownFieldData, List<Object> list) {
        list.add(readData(CodedInputByteBufferNano.newInstance(unknownFieldData.bytes)));
    }

    public void writeRepeatedData(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                writeSingularData(obj2, codedOutputByteBufferNano);
            }
        }
    }

    public void writeSingularData(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
        try {
            codedOutputByteBufferNano.writeRawVarint32(this.tag);
            int i = this.type;
            if (i == 10) {
                int tagFieldNumber = WireFormatNano.getTagFieldNumber(this.tag);
                codedOutputByteBufferNano.writeGroupNoTag((MessageNano) obj);
                codedOutputByteBufferNano.writeTag(tagFieldNumber, 4);
            } else if (i == 11) {
                codedOutputByteBufferNano.writeMessageNoTag((MessageNano) obj);
            } else {
                throw new IllegalArgumentException("Unknown type " + this.type);
            }
        } catch (IOException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public void writeTo(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.repeated) {
            writeRepeatedData(obj, codedOutputByteBufferNano);
        } else {
            writeSingularData(obj, codedOutputByteBufferNano);
        }
    }

    private Extension(int i, Class<T> cls, int i10, boolean z5) {
        this.type = i;
        this.clazz = cls;
        this.tag = i10;
        this.repeated = z5;
    }

    public static <M extends ExtendableMessageNano<M>, T extends MessageNano> Extension<M, T> createMessageTyped(int i, Class<T> cls, long j10) {
        return new Extension<>(i, cls, (int) j10, false);
    }
}
