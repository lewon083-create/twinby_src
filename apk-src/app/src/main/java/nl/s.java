package nl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f29565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f29569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f29570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s f29571g;

    public s() {
        this.f29565a = new byte[8192];
        this.f29569e = true;
        this.f29568d = false;
    }

    public final s a() {
        s sVar = this.f29570f;
        if (sVar == this) {
            sVar = null;
        }
        s sVar2 = this.f29571g;
        Intrinsics.b(sVar2);
        sVar2.f29570f = this.f29570f;
        s sVar3 = this.f29570f;
        Intrinsics.b(sVar3);
        sVar3.f29571g = this.f29571g;
        this.f29570f = null;
        this.f29571g = null;
        return sVar;
    }

    public final void b(s segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f29571g = this;
        segment.f29570f = this.f29570f;
        s sVar = this.f29570f;
        Intrinsics.b(sVar);
        sVar.f29571g = segment;
        this.f29570f = segment;
    }

    public final s c() {
        this.f29568d = true;
        return new s(this.f29565a, this.f29566b, this.f29567c, true);
    }

    public final void d(s sink, int i) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        boolean z5 = sink.f29569e;
        byte[] bArr = sink.f29565a;
        if (!z5) {
            throw new IllegalStateException("only owner can write");
        }
        int i10 = sink.f29567c;
        int i11 = i10 + i;
        if (i11 > 8192) {
            if (sink.f29568d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f29566b;
            if (i11 - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            kotlin.collections.o.d(0, i12, i10, bArr, bArr);
            sink.f29567c -= sink.f29566b;
            sink.f29566b = 0;
        }
        int i13 = sink.f29567c;
        int i14 = this.f29566b;
        kotlin.collections.o.d(i13, i14, i14 + i, this.f29565a, bArr);
        sink.f29567c += i;
        this.f29566b += i;
    }

    public s(byte[] data, int i, int i10, boolean z5) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f29565a = data;
        this.f29566b = i;
        this.f29567c = i10;
        this.f29568d = z5;
        this.f29569e = false;
    }
}
