package i2;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputContentInfo f20818b;

    public g(Object obj) {
        this.f20818b = (InputContentInfo) obj;
    }

    @Override // i2.h
    public final Uri f() {
        return this.f20818b.getContentUri();
    }

    @Override // i2.h
    public final ClipDescription getDescription() {
        return this.f20818b.getDescription();
    }

    @Override // i2.h
    public final void h() {
        this.f20818b.requestPermission();
    }

    @Override // i2.h
    public final Uri i() {
        return this.f20818b.getLinkUri();
    }

    @Override // i2.h
    public final Object w() {
        return this.f20818b;
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f20818b = new InputContentInfo(uri, clipDescription, uri2);
    }
}
