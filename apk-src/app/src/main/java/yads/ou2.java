package yads;

import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ou2 implements p3.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SSLSocketFactory f41736b;

    public ou2(String str, SSLSocketFactory sSLSocketFactory) {
        this.f41735a = str;
        this.f41736b = sSLSocketFactory;
    }

    @Override // p3.g
    public final p3.h createDataSource() {
        return new lu2(this.f41735a, 8000, 8000, false, new p3.x(), this.f41736b);
    }
}
