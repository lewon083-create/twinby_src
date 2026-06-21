package q;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f31528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f31529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f31530e;

    public /* synthetic */ c(f fVar, String str, Bundle bundle, int i) {
        this.f31527b = i;
        this.f31530e = fVar;
        this.f31528c = str;
        this.f31529d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31527b) {
            case 0:
                this.f31530e.f31542c.a(this.f31529d, this.f31528c);
                break;
            default:
                this.f31530e.f31542c.f(this.f31529d, this.f31528c);
                break;
        }
    }
}
