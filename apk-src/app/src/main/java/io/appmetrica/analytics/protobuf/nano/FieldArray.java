package io.appmetrica.analytics.protobuf.nano;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class FieldArray implements Cloneable {
    private static final FieldData DELETED = new FieldData();
    private FieldData[] mData;
    private int[] mFieldNumbers;
    private boolean mGarbage;
    private int mSize;

    public FieldArray() {
        this(10);
    }

    private boolean arrayEquals(int[] iArr, int[] iArr2, int i) {
        for (int i10 = 0; i10 < i; i10++) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    private int binarySearch(int i) {
        int i10 = this.mSize - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int i13 = this.mFieldNumbers[i12];
            if (i13 < i) {
                i11 = i12 + 1;
            } else {
                if (i13 <= i) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }

    private void gc() {
        int i = this.mSize;
        int[] iArr = this.mFieldNumbers;
        FieldData[] fieldDataArr = this.mData;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            FieldData fieldData = fieldDataArr[i11];
            if (fieldData != DELETED) {
                if (i11 != i10) {
                    iArr[i10] = iArr[i11];
                    fieldDataArr[i10] = fieldData;
                    fieldDataArr[i11] = null;
                }
                i10++;
            }
        }
        this.mGarbage = false;
        this.mSize = i10;
    }

    private int idealByteArraySize(int i) {
        for (int i10 = 4; i10 < 32; i10++) {
            int i11 = (1 << i10) - 12;
            if (i <= i11) {
                return i11;
            }
        }
        return i;
    }

    private int idealIntArraySize(int i) {
        return idealByteArraySize(i * 4) / 4;
    }

    public FieldData dataAt(int i) {
        if (this.mGarbage) {
            gc();
        }
        return this.mData[i];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldArray)) {
            return false;
        }
        FieldArray fieldArray = (FieldArray) obj;
        return size() == fieldArray.size() && arrayEquals(this.mFieldNumbers, fieldArray.mFieldNumbers, this.mSize) && arrayEquals(this.mData, fieldArray.mData, this.mSize);
    }

    public FieldData get(int i) {
        FieldData fieldData;
        int iBinarySearch = binarySearch(i);
        if (iBinarySearch < 0 || (fieldData = this.mData[iBinarySearch]) == DELETED) {
            return null;
        }
        return fieldData;
    }

    public int hashCode() {
        if (this.mGarbage) {
            gc();
        }
        int iHashCode = 17;
        for (int i = 0; i < this.mSize; i++) {
            iHashCode = (((iHashCode * 31) + this.mFieldNumbers[i]) * 31) + this.mData[i].hashCode();
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void put(int i, FieldData fieldData) {
        int iBinarySearch = binarySearch(i);
        if (iBinarySearch >= 0) {
            this.mData[iBinarySearch] = fieldData;
            return;
        }
        int i10 = ~iBinarySearch;
        int i11 = this.mSize;
        if (i10 < i11) {
            FieldData[] fieldDataArr = this.mData;
            if (fieldDataArr[i10] == DELETED) {
                this.mFieldNumbers[i10] = i;
                fieldDataArr[i10] = fieldData;
                return;
            }
        }
        if (this.mGarbage && i11 >= this.mFieldNumbers.length) {
            gc();
            i10 = ~binarySearch(i);
        }
        int i12 = this.mSize;
        if (i12 >= this.mFieldNumbers.length) {
            int iIdealIntArraySize = idealIntArraySize(i12 + 1);
            int[] iArr = new int[iIdealIntArraySize];
            FieldData[] fieldDataArr2 = new FieldData[iIdealIntArraySize];
            int[] iArr2 = this.mFieldNumbers;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            FieldData[] fieldDataArr3 = this.mData;
            System.arraycopy(fieldDataArr3, 0, fieldDataArr2, 0, fieldDataArr3.length);
            this.mFieldNumbers = iArr;
            this.mData = fieldDataArr2;
        }
        int i13 = this.mSize - i10;
        if (i13 != 0) {
            int[] iArr3 = this.mFieldNumbers;
            int i14 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i14, i13);
            FieldData[] fieldDataArr4 = this.mData;
            System.arraycopy(fieldDataArr4, i10, fieldDataArr4, i14, this.mSize - i10);
        }
        this.mFieldNumbers[i10] = i;
        this.mData[i10] = fieldData;
        this.mSize++;
    }

    public void remove(int i) {
        int iBinarySearch = binarySearch(i);
        if (iBinarySearch >= 0) {
            FieldData[] fieldDataArr = this.mData;
            FieldData fieldData = fieldDataArr[iBinarySearch];
            FieldData fieldData2 = DELETED;
            if (fieldData != fieldData2) {
                fieldDataArr[iBinarySearch] = fieldData2;
                this.mGarbage = true;
            }
        }
    }

    public int size() {
        if (this.mGarbage) {
            gc();
        }
        return this.mSize;
    }

    public FieldArray(int i) {
        this.mGarbage = false;
        int iIdealIntArraySize = idealIntArraySize(i);
        this.mFieldNumbers = new int[iIdealIntArraySize];
        this.mData = new FieldData[iIdealIntArraySize];
        this.mSize = 0;
    }

    private boolean arrayEquals(FieldData[] fieldDataArr, FieldData[] fieldDataArr2, int i) {
        for (int i10 = 0; i10 < i; i10++) {
            if (!fieldDataArr[i10].equals(fieldDataArr2[i10])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final FieldArray m599clone() {
        int size = size();
        FieldArray fieldArray = new FieldArray(size);
        System.arraycopy(this.mFieldNumbers, 0, fieldArray.mFieldNumbers, 0, size);
        for (int i = 0; i < size; i++) {
            FieldData fieldData = this.mData[i];
            if (fieldData != null) {
                fieldArray.mData[i] = fieldData.m600clone();
            }
        }
        fieldArray.mSize = size;
        return fieldArray;
    }
}
