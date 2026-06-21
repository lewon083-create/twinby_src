package bj;

import android.util.Log;
import m.h3;
import z2.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements ei.b, fi.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bb.e f2169b;

    @Override // fi.a
    public final void onAttachedToActivity(fi.b bVar) {
        bb.e eVar = this.f2169b;
        if (eVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            eVar.f2021e = (w) ((h3) bVar).f28250b;
        }
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a aVar) {
        bb.e eVar = new bb.e(aVar.f16381a, 5);
        this.f2169b = eVar;
        bb.e.F(aVar.f16383c, eVar);
    }

    @Override // fi.a
    public final void onDetachedFromActivity() {
        bb.e eVar = this.f2169b;
        if (eVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            eVar.f2021e = null;
        }
    }

    @Override // fi.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a aVar) {
        if (this.f2169b == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
        } else {
            bb.e.F(aVar.f16383c, null);
            this.f2169b = null;
        }
    }

    @Override // fi.a
    public final void onReattachedToActivityForConfigChanges(fi.b bVar) {
        onAttachedToActivity(bVar);
    }
}
