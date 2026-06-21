package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import m.s0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TypedValue f1135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f1136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f1137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f1138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f1139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TypedValue f1140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f1141h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1141h = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1139f == null) {
            this.f1139f = new TypedValue();
        }
        return this.f1139f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1140g == null) {
            this.f1140g = new TypedValue();
        }
        return this.f1140g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1137d == null) {
            this.f1137d = new TypedValue();
        }
        return this.f1137d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1138e == null) {
            this.f1138e = new TypedValue();
        }
        return this.f1138e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1135b == null) {
            this.f1135b = new TypedValue();
        }
        return this.f1135b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1136c == null) {
            this.f1136c = new TypedValue();
        }
        return this.f1136c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(s0 s0Var) {
    }
}
