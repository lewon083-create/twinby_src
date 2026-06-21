package h2;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeProvider f20363a;

    public i() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f20363a = new h(this);
        } else {
            this.f20363a = new g(this);
        }
    }

    public f a(int i) {
        return null;
    }

    public f b(int i) {
        return null;
    }

    public boolean c(int i, int i10, Bundle bundle) {
        return false;
    }

    public i(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f20363a = accessibilityNodeProvider;
    }
}
