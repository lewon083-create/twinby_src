package e4;

import java.io.DataInputStream;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements m4.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataInputStream f16212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a4.g f16213c = new a4.g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f16214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f16215e;

    public x(z zVar, InputStream inputStream) {
        this.f16215e = zVar;
        this.f16212b = new DataInputStream(inputStream);
    }

    @Override // m4.k
    public final void d() {
        this.f16214d = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    @Override // m4.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void load() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.x.load():void");
    }
}
