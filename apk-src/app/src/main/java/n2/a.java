package n2;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import h2.i;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f29009b;

    public a(b bVar) {
        this.f29009b = bVar;
    }

    @Override // h2.i
    public final h2.f a(int i) {
        return new h2.f(AccessibilityNodeInfo.obtain(this.f29009b.obtainAccessibilityNodeInfo(i).f20360a));
    }

    @Override // h2.i
    public final h2.f b(int i) {
        b bVar = this.f29009b;
        int i10 = i == 2 ? bVar.mAccessibilityFocusedVirtualViewId : bVar.mKeyboardFocusedVirtualViewId;
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i10);
    }

    @Override // h2.i
    public final boolean c(int i, int i10, Bundle bundle) {
        return this.f29009b.performAction(i, i10, bundle);
    }
}
