package ij;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class t implements Iterator, xj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21355b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f21357d;

    public t(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f21357d = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f21355b) {
            case 0:
                if (this.f21356c < ((byte[]) this.f21357d).length) {
                }
                break;
            case 1:
                if (this.f21356c < ((int[]) this.f21357d).length) {
                }
                break;
            case 2:
                if (this.f21356c < ((long[]) this.f21357d).length) {
                }
                break;
            case 3:
                if (this.f21356c < ((short[]) this.f21357d).length) {
                }
                break;
            case 4:
                if (this.f21356c < ((kotlin.collections.f) this.f21357d).size()) {
                }
                break;
            case 5:
                if (this.f21356c < ((Object[]) this.f21357d).length) {
                }
                break;
            default:
                if (this.f21356c > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f21355b) {
            case 0:
                int i = this.f21356c;
                byte[] bArr = (byte[]) this.f21357d;
                if (i >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f21356c));
                }
                this.f21356c = i + 1;
                return new s(bArr[i]);
            case 1:
                int i10 = this.f21356c;
                int[] iArr = (int[]) this.f21357d;
                if (i10 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f21356c));
                }
                this.f21356c = i10 + 1;
                return new w(iArr[i10]);
            case 2:
                int i11 = this.f21356c;
                long[] jArr = (long[]) this.f21357d;
                if (i11 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f21356c));
                }
                this.f21356c = i11 + 1;
                return new z(jArr[i11]);
            case 3:
                int i12 = this.f21356c;
                short[] sArr = (short[]) this.f21357d;
                if (i12 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f21356c));
                }
                this.f21356c = i12 + 1;
                return new d0(sArr[i12]);
            case 4:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                kotlin.collections.f fVar = (kotlin.collections.f) this.f21357d;
                int i13 = this.f21356c;
                this.f21356c = i13 + 1;
                return fVar.get(i13);
            case 5:
                try {
                    Object[] objArr = (Object[]) this.f21357d;
                    int i14 = this.f21356c;
                    this.f21356c = i14 + 1;
                    return objArr[i14];
                } catch (ArrayIndexOutOfBoundsException e3) {
                    this.f21356c--;
                    throw new NoSuchElementException(e3.getMessage());
                }
            default:
                uk.u uVar = (uk.u) this.f21357d;
                int i15 = uVar.f34570c;
                int i16 = this.f21356c;
                this.f21356c = i16 - 1;
                return uVar.f34572e[i15 - i16];
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f21355b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public t(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f21357d = array;
    }

    public t(int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f21357d = array;
    }

    public t(long[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f21357d = array;
    }

    public t(short[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f21357d = array;
    }

    public t(kotlin.collections.f fVar) {
        this.f21357d = fVar;
    }

    public t(uk.u uVar) {
        this.f21357d = uVar;
        this.f21356c = uVar.f34570c;
    }
}
