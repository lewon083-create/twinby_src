package io.flutter.plugin.platform;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f25752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f25753c;

    public s(Context context, a aVar, View view) {
        super(context);
        this.f25752b = aVar;
        this.f25753c = view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.h hVar = this.f25752b.f25676a;
        if (hVar == null) {
            return false;
        }
        return hVar.a(this.f25753c, view, accessibilityEvent);
    }
}
