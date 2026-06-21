package zk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f46520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f46522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f46523d;

    public z(p pVar, byte[] bArr, int i, int i10) {
        this.f46520a = pVar;
        this.f46521b = i;
        this.f46522c = bArr;
        this.f46523d = i10;
    }

    @Override // zk.b0
    public final long contentLength() {
        return this.f46521b;
    }

    @Override // zk.b0
    public final p contentType() {
        return this.f46520a;
    }

    @Override // zk.b0
    public final void writeTo(nl.h sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.write(this.f46522c, this.f46523d, this.f46521b);
    }
}
