package gl;

import java.io.EOFException;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nl.g f20183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c[] f20187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20190h;

    public e(nl.g out) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.f20183a = out;
        this.f20184b = Integer.MAX_VALUE;
        this.f20186d = 4096;
        this.f20187e = new c[8];
        this.f20188f = 7;
    }

    public final void a(int i) {
        int i10;
        if (i > 0) {
            int length = this.f20187e.length - 1;
            int i11 = 0;
            while (true) {
                i10 = this.f20188f;
                if (length < i10 || i <= 0) {
                    break;
                }
                c cVar = this.f20187e[length];
                Intrinsics.b(cVar);
                i -= cVar.f20172c;
                int i12 = this.f20190h;
                c cVar2 = this.f20187e[length];
                Intrinsics.b(cVar2);
                this.f20190h = i12 - cVar2.f20172c;
                this.f20189g--;
                i11++;
                length--;
            }
            c[] cVarArr = this.f20187e;
            int i13 = i10 + 1;
            System.arraycopy(cVarArr, i13, cVarArr, i13 + i11, this.f20189g);
            c[] cVarArr2 = this.f20187e;
            int i14 = this.f20188f + 1;
            Arrays.fill(cVarArr2, i14, i14 + i11, (Object) null);
            this.f20188f += i11;
        }
    }

    public final void b(c cVar) {
        int i = cVar.f20172c;
        int i10 = this.f20186d;
        if (i > i10) {
            c[] cVarArr = this.f20187e;
            kotlin.collections.o.i(cVarArr, 0, cVarArr.length);
            this.f20188f = this.f20187e.length - 1;
            this.f20189g = 0;
            this.f20190h = 0;
            return;
        }
        a((this.f20190h + i) - i10);
        int i11 = this.f20189g + 1;
        c[] cVarArr2 = this.f20187e;
        if (i11 > cVarArr2.length) {
            c[] cVarArr3 = new c[cVarArr2.length * 2];
            System.arraycopy(cVarArr2, 0, cVarArr3, cVarArr2.length, cVarArr2.length);
            this.f20188f = this.f20187e.length - 1;
            this.f20187e = cVarArr3;
        }
        int i12 = this.f20188f;
        this.f20188f = i12 - 1;
        this.f20187e[i12] = cVar;
        this.f20189g++;
        this.f20190h += i;
    }

    public final void c(nl.j source) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "data");
        int[] iArr = a0.f20154a;
        Intrinsics.checkNotNullParameter(source, "bytes");
        int iA = source.a();
        long j10 = 0;
        long j11 = 0;
        for (int i = 0; i < iA; i++) {
            byte bD = source.d(i);
            byte[] bArr = al.b.f1041a;
            j11 += (long) a0.f20155b[bD & 255];
        }
        int i10 = (int) ((j11 + ((long) 7)) >> 3);
        int iA2 = source.a();
        nl.g gVar = this.f20183a;
        if (i10 >= iA2) {
            e(source.a(), 127, 0);
            gVar.K(source);
            return;
        }
        nl.g sink = new nl.g();
        int[] iArr2 = a0.f20154a;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int iA3 = source.a();
        int i11 = 0;
        for (int i12 = 0; i12 < iA3; i12++) {
            byte bD2 = source.d(i12);
            byte[] bArr2 = al.b.f1041a;
            int i13 = bD2 & 255;
            int i14 = a0.f20154a[i13];
            byte b2 = a0.f20155b[i13];
            j10 = (j10 << b2) | ((long) i14);
            i11 += b2;
            while (i11 >= 8) {
                i11 -= 8;
                sink.L((int) (j10 >> i11));
            }
        }
        if (i11 > 0) {
            sink.L((int) ((j10 << (8 - i11)) | (255 >>> i11)));
        }
        nl.j jVarC = sink.c(sink.f29540c);
        e(jVarC.a(), 127, 128);
        gVar.K(jVarC);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.e.d(java.util.ArrayList):void");
    }

    public final void e(int i, int i10, int i11) {
        nl.g gVar = this.f20183a;
        if (i < i10) {
            gVar.L(i | i11);
            return;
        }
        gVar.L(i11 | i10);
        int i12 = i - i10;
        while (i12 >= 128) {
            gVar.L(128 | (i12 & 127));
            i12 >>>= 7;
        }
        gVar.L(i12);
    }
}
