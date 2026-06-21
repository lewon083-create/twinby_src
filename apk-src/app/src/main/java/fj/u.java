package fj;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f19425b;

    public u(String str, m mVar) {
        this.f19424a = str;
        this.f19425b = mVar;
    }

    @JavascriptInterface
    public void postMessage(@NonNull String str) {
        this.f19425b.f19374a.q(new e1.y(15, this, str));
    }
}
