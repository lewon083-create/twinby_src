package nl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient byte[][] f29575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int[] f29576g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(byte[][] segments, int[] directory) {
        super(j.f29541e.f29542b);
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f29575f = segments;
        this.f29576g = directory;
    }

    @Override // nl.j
    public final int a() {
        return this.f29576g[this.f29575f.length - 1];
    }

    @Override // nl.j
    public final String b() {
        return new j(j()).b();
    }

    @Override // nl.j
    public final byte[] c() {
        return j();
    }

    @Override // nl.j
    public final byte d(int i) {
        byte[][] bArr = this.f29575f;
        int length = bArr.length - 1;
        int[] iArr = this.f29576g;
        hl.d.h(iArr[length], i, 1L);
        int iB = ol.b.b(this, i);
        return bArr[iB][(i - (iB == 0 ? 0 : iArr[iB - 1])) + iArr[bArr.length + iB]];
    }

    @Override // nl.j
    public final boolean e(int i, int i10, int i11, byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0 || i > a() - i11 || i10 < 0 || i10 > other.length - i11) {
            return false;
        }
        int i12 = i11 + i;
        int iB = ol.b.b(this, i);
        while (i < i12) {
            int[] iArr = this.f29576g;
            int i13 = iB == 0 ? 0 : iArr[iB - 1];
            int i14 = iArr[iB] - i13;
            byte[][] bArr = this.f29575f;
            int i15 = iArr[bArr.length + iB];
            int iMin = Math.min(i12, i14 + i13) - i;
            if (!hl.d.e((i - i13) + i15, i10, iMin, bArr[iB], other)) {
                return false;
            }
            i10 += iMin;
            i += iMin;
            iB++;
        }
        return true;
    }

    @Override // nl.j
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.a() == a() && f(jVar, a());
    }

    @Override // nl.j
    public final boolean f(j other, int i) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (a() - i >= 0) {
            int iB = ol.b.b(this, 0);
            int i10 = 0;
            int i11 = 0;
            while (i10 < i) {
                int[] iArr = this.f29576g;
                int i12 = iB == 0 ? 0 : iArr[iB - 1];
                int i13 = iArr[iB] - i12;
                byte[][] bArr = this.f29575f;
                int i14 = iArr[bArr.length + iB];
                int iMin = Math.min(i, i13 + i12) - i10;
                if (other.e(i11, (i10 - i12) + i14, iMin, bArr[iB])) {
                    i11 += iMin;
                    i10 += iMin;
                    iB++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // nl.j
    public final j g() {
        return new j(j()).g();
    }

    @Override // nl.j
    public final int hashCode() {
        int i = this.f29543c;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f29575f;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f29576g;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            byte[] bArr2 = bArr[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr2[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        this.f29543c = i11;
        return i11;
    }

    @Override // nl.j
    public final void i(g buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int iB = ol.b.b(this, 0);
        int i10 = 0;
        while (i10 < i) {
            int[] iArr = this.f29576g;
            int i11 = iB == 0 ? 0 : iArr[iB - 1];
            int i12 = iArr[iB] - i11;
            byte[][] bArr = this.f29575f;
            int i13 = iArr[bArr.length + iB];
            int iMin = Math.min(i, i12 + i11) - i10;
            int i14 = (i10 - i11) + i13;
            s sVar = new s(bArr[iB], i14, i14 + iMin, true);
            s sVar2 = buffer.f29539b;
            if (sVar2 == null) {
                sVar.f29571g = sVar;
                sVar.f29570f = sVar;
                buffer.f29539b = sVar;
            } else {
                s sVar3 = sVar2.f29571g;
                Intrinsics.b(sVar3);
                sVar3.b(sVar);
            }
            i10 += iMin;
            iB++;
        }
        buffer.f29540c += (long) i;
    }

    public final byte[] j() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.f29575f;
        int length = bArr2.length;
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        while (i < length) {
            int[] iArr = this.f29576g;
            int i12 = iArr[length + i];
            int i13 = iArr[i];
            int i14 = i13 - i10;
            kotlin.collections.o.d(i11, i12, i12 + i14, bArr2[i], bArr);
            i11 += i14;
            i++;
            i10 = i13;
        }
        return bArr;
    }

    @Override // nl.j
    public final String toString() {
        return new j(j()).toString();
    }
}
