package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class h implements Iterable, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f1405d = new h(c0.f1369b);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f1406e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1407b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f1408c;

    static {
        f1406e = c.a() ? new f(1) : new f(0);
    }

    public h(byte[] bArr) {
        bArr.getClass();
        this.f1408c = bArr;
    }

    public static int c(int i, int i10, int i11) {
        int i12 = i10 - i;
        if ((i | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(a0.u.k(i, "Beginning index: ", " < 0"));
        }
        if (i10 < i) {
            throw new IndexOutOfBoundsException(a0.u.j(i, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a0.u.j(i10, i11, "End index: ", " >= "));
    }

    public static h e(byte[] bArr, int i, int i10) {
        byte[] bArrCopyOfRange;
        c(i, i + i10, bArr.length);
        switch (f1406e.f1384a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i10 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i10];
                System.arraycopy(bArr, i, bArrCopyOfRange, 0, i10);
                break;
        }
        return new h(bArrCopyOfRange);
    }

    public byte a(int i) {
        return this.f1408c[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h) || size() != ((h) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof h)) {
            return obj.equals(this);
        }
        h hVar = (h) obj;
        int i = this.f1407b;
        int i10 = hVar.f1407b;
        if (i != 0 && i10 != 0 && i != i10) {
            return false;
        }
        int size = size();
        if (size > hVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > hVar.size()) {
            StringBuilder sbM = l7.o.m(size, "Ran off end of other: 0, ", ", ");
            sbM.append(hVar.size());
            throw new IllegalArgumentException(sbM.toString());
        }
        byte[] bArr = hVar.f1408c;
        int iG = g() + size;
        int iG2 = g();
        int iG3 = hVar.g();
        while (iG2 < iG) {
            if (this.f1408c[iG2] != bArr[iG3]) {
                return false;
            }
            iG2++;
            iG3++;
        }
        return true;
    }

    public void f(int i, byte[] bArr) {
        System.arraycopy(this.f1408c, 0, bArr, 0, i);
    }

    public int g() {
        return 0;
    }

    public final int hashCode() {
        int i = this.f1407b;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iG = g();
        int i10 = size;
        for (int i11 = iG; i11 < iG + size; i11++) {
            i10 = (i10 * 31) + this.f1408c[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f1407b = i10;
        return i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e(this);
    }

    public byte n(int i) {
        return this.f1408c[i];
    }

    public int size() {
        return this.f1408c.length;
    }

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = wa.a.p(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int iC = c(0, 47, size());
            sb2.append(wa.a.p(iC == 0 ? f1405d : new g(this.f1408c, g(), iC)));
            sb2.append("...");
            string = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return a0.u.o(sb3, string, "\">");
    }
}
