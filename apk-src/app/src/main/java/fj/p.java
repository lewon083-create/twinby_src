package fj;

import android.webkit.DownloadListener;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements DownloadListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f19400b;

    public p(q qVar) {
        this.f19400b = qVar;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        this.f19400b.f19403a.q(new o(this, str, str2, str3, str4, j10));
    }
}
