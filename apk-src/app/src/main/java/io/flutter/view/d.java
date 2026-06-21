package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import xh.s;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f25786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f25787b;

    public d(h hVar, AccessibilityManager accessibilityManager) {
        this.f25787b = hVar;
        this.f25786a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z5) {
        h hVar = this.f25787b;
        if (hVar.f25865u) {
            return;
        }
        boolean z10 = false;
        if (!z5) {
            hVar.j(false);
            g gVar = hVar.f25860p;
            if (gVar != null) {
                hVar.h(gVar.f25819b, 256);
                hVar.f25860p = null;
            }
        }
        m4.d dVar = hVar.f25863s;
        if (dVar != null) {
            boolean zIsEnabled = this.f25786a.isEnabled();
            s sVar = (s) dVar.f28630b;
            if (sVar.f36176k.f25542b.f25607a.getIsSoftwareRenderingEnabled()) {
                sVar.setWillNotDraw(false);
                return;
            }
            if (!zIsEnabled && !z5) {
                z10 = true;
            }
            sVar.setWillNotDraw(z10);
        }
    }
}
