package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f40916b;

    public mh1() {
        this(0);
    }

    public final void a(long j10) {
        int i = this.f40915a;
        long[] jArr = this.f40916b;
        if (i == jArr.length) {
            this.f40916b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f40916b;
        int i10 = this.f40915a;
        this.f40915a = i10 + 1;
        jArr2[i10] = j10;
    }

    public mh1(int i) {
        this.f40916b = new long[32];
    }

    public final long a(int i) {
        if (i >= 0 && i < this.f40915a) {
            return this.f40916b[i];
        }
        StringBuilder sbM = l7.o.m(i, "Invalid index ", ", size is ");
        sbM.append(this.f40915a);
        throw new IndexOutOfBoundsException(sbM.toString());
    }

    public final long[] a() {
        return Arrays.copyOf(this.f40916b, this.f40915a);
    }
}
