package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;
import xh.s;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements AccessibilityManager.AccessibilityStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f25785a;

    public c(h hVar) {
        this.f25785a = hVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z5) {
        h hVar = this.f25785a;
        ka.k kVar = hVar.f25847b;
        if (hVar.f25865u) {
            return;
        }
        if (z5) {
            ((FlutterJNI) kVar.f27325d).setSemanticsEnabled(true);
        } else {
            hVar.j(false);
            ((FlutterJNI) kVar.f27325d).setSemanticsEnabled(false);
        }
        m4.d dVar = hVar.f25863s;
        if (dVar != null) {
            boolean zIsTouchExplorationEnabled = hVar.f25848c.isTouchExplorationEnabled();
            s sVar = (s) dVar.f28630b;
            if (sVar.f36176k.f25542b.f25607a.getIsSoftwareRenderingEnabled()) {
                sVar.setWillNotDraw(false);
            } else {
                sVar.setWillNotDraw((z5 || zIsTouchExplorationEnabled) ? false : true);
            }
        }
    }
}
