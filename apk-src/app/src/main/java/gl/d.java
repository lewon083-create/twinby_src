package gl;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nl.r f20177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c[] f20178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20181g;

    public d(t source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f20175a = 4096;
        this.f20176b = new ArrayList();
        this.f20177c = i0.o.g(source);
        this.f20178d = new c[8];
        this.f20179e = 7;
    }

    public final int a(int i) {
        int i10;
        int i11 = 0;
        if (i > 0) {
            int length = this.f20178d.length;
            while (true) {
                length--;
                i10 = this.f20179e;
                if (length < i10 || i <= 0) {
                    break;
                }
                c cVar = this.f20178d[length];
                Intrinsics.b(cVar);
                int i12 = cVar.f20172c;
                i -= i12;
                this.f20181g -= i12;
                this.f20180f--;
                i11++;
            }
            c[] cVarArr = this.f20178d;
            System.arraycopy(cVarArr, i10 + 1, cVarArr, i10 + 1 + i11, this.f20180f);
            this.f20179e += i11;
        }
        return i11;
    }

    public final nl.j b(int i) throws IOException {
        if (i >= 0) {
            c[] cVarArr = f.f20191a;
            if (i <= cVarArr.length - 1) {
                return cVarArr[i].f20170a;
            }
        }
        int length = this.f20179e + 1 + (i - f.f20191a.length);
        if (length >= 0) {
            c[] cVarArr2 = this.f20178d;
            if (length < cVarArr2.length) {
                c cVar = cVarArr2[length];
                Intrinsics.b(cVar);
                return cVar.f20170a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(c cVar) {
        this.f20176b.add(cVar);
        int i = cVar.f20172c;
        int i10 = this.f20175a;
        if (i > i10) {
            c[] cVarArr = this.f20178d;
            kotlin.collections.o.i(cVarArr, 0, cVarArr.length);
            this.f20179e = this.f20178d.length - 1;
            this.f20180f = 0;
            this.f20181g = 0;
            return;
        }
        a((this.f20181g + i) - i10);
        int i11 = this.f20180f + 1;
        c[] cVarArr2 = this.f20178d;
        if (i11 > cVarArr2.length) {
            c[] cVarArr3 = new c[cVarArr2.length * 2];
            System.arraycopy(cVarArr2, 0, cVarArr3, cVarArr2.length, cVarArr2.length);
            this.f20179e = this.f20178d.length - 1;
            this.f20178d = cVarArr3;
        }
        int i12 = this.f20179e;
        this.f20179e = i12 - 1;
        this.f20178d[i12] = cVar;
        this.f20180f++;
        this.f20181g += i;
    }

    public final nl.j d() {
        nl.r source = this.f20177c;
        byte b2 = source.readByte();
        byte[] bArr = al.b.f1041a;
        int i = b2 & 255;
        int i10 = 0;
        boolean z5 = (b2 & 128) == 128;
        long jE = e(i, 127);
        if (!z5) {
            return source.c(jE);
        }
        nl.g sink = new nl.g();
        int[] iArr = a0.f20154a;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        b8.a aVar = a0.f20156c;
        b8.a aVar2 = aVar;
        int i11 = 0;
        for (long j10 = 0; j10 < jE; j10++) {
            byte b10 = source.readByte();
            byte[] bArr2 = al.b.f1041a;
            i10 = (i10 << 8) | (b10 & 255);
            i11 += 8;
            while (i11 >= 8) {
                int i12 = (i10 >>> (i11 - 8)) & KotlinVersion.MAX_COMPONENT_VALUE;
                b8.a[] aVarArr = (b8.a[]) aVar2.f1989d;
                Intrinsics.b(aVarArr);
                aVar2 = aVarArr[i12];
                Intrinsics.b(aVar2);
                if (((b8.a[]) aVar2.f1989d) == null) {
                    sink.L(aVar2.f1987b);
                    i11 -= aVar2.f1988c;
                    aVar2 = aVar;
                } else {
                    i11 -= 8;
                }
            }
        }
        while (i11 > 0) {
            int i13 = (i10 << (8 - i11)) & KotlinVersion.MAX_COMPONENT_VALUE;
            b8.a[] aVarArr2 = (b8.a[]) aVar2.f1989d;
            Intrinsics.b(aVarArr2);
            b8.a aVar3 = aVarArr2[i13];
            Intrinsics.b(aVar3);
            int i14 = aVar3.f1988c;
            if (((b8.a[]) aVar3.f1989d) != null || i14 > i11) {
                break;
            }
            sink.L(aVar3.f1987b);
            i11 -= i14;
            aVar2 = aVar;
        }
        return sink.c(sink.f29540c);
    }

    public final int e(int i, int i10) {
        int i11 = i & i10;
        if (i11 < i10) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            byte b2 = this.f20177c.readByte();
            byte[] bArr = al.b.f1041a;
            int i13 = b2 & 255;
            if ((b2 & 128) == 0) {
                return i10 + (i13 << i12);
            }
            i10 += (b2 & 127) << i12;
            i12 += 7;
        }
    }
}
