package q;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f31532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f31533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f31534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f31535f;

    public d(f fVar, int i, Uri uri, boolean z5, Bundle bundle) {
        this.f31535f = fVar;
        this.f31531b = i;
        this.f31532c = uri;
        this.f31533d = z5;
        this.f31534e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31535f.f31542c.g(this.f31531b, this.f31532c, this.f31533d, this.f31534e);
    }
}
