package io.flutter.plugin.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public xh.a f25697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f25698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public di.a f25699h;

    public i(z2.w wVar) {
        super(wVar);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        h hVar = this.f25698g;
        if (hVar == null) {
            super.draw(canvas);
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Surface surface = hVar.getSurface();
        if (!surface.isValid()) {
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
        if (canvasLockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(canvasLockHardwareCanvas);
        } finally {
            this.f25698g.scheduleFrame();
            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.f25699h;
    }

    public int getRenderTargetHeight() {
        h hVar = this.f25698g;
        if (hVar != null) {
            return hVar.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        h hVar = this.f25698g;
        if (hVar != null) {
            return hVar.getWidth();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f25697f == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i = this.f25695d;
            this.f25693b = i;
            int i10 = this.f25696e;
            this.f25694c = i10;
            matrix.postTranslate(i, i10);
        } else if (action != 2) {
            matrix.postTranslate(this.f25695d, this.f25696e);
        } else {
            matrix.postTranslate(this.f25693b, this.f25694c);
            this.f25693b = this.f25695d;
            this.f25694c = this.f25696e;
        }
        this.f25697f.d(motionEvent, matrix);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setLayoutParams(@NonNull FrameLayout.LayoutParams layoutParams) {
        setLayoutParams((ViewGroup.LayoutParams) layoutParams);
        this.f25695d = layoutParams.leftMargin;
        this.f25696e = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(@NonNull View.OnFocusChangeListener onFocusChangeListener) {
        di.a aVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (aVar = this.f25699h) != null) {
            this.f25699h = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(aVar);
        }
        ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.f25699h == null) {
            di.a aVar2 = new di.a(this, onFocusChangeListener);
            this.f25699h = aVar2;
            viewTreeObserver2.addOnGlobalFocusChangeListener(aVar2);
        }
    }

    public void setTouchProcessor(xh.a aVar) {
        this.f25697f = aVar;
    }
}
