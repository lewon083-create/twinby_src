package yads;

import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pu2 implements o30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SSLSocketFactory f42070b;

    public pu2(String str, SSLSocketFactory sSLSocketFactory) {
        this.f42069a = str;
        this.f42070b = sSLSocketFactory;
    }

    @Override // yads.o30
    public final p30 createDataSource() {
        return new mu2(this.f42069a, 8000, 8000, false, new u11(), this.f42070b);
    }
}
