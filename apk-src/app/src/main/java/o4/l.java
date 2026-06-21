package o4;

import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements zc.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29665b;

    @Override // zc.p
    public final Object get() {
        switch (this.f29665b) {
            case 0:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e3) {
                    throw new IllegalStateException(e3);
                }
            case 1:
                return new s3.f();
            case 2:
                byte[] bArr = new byte[12];
                t3.f.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                throw new IllegalStateException();
        }
    }
}
