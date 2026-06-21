package di;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import java.util.Iterator;
import z2.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FlutterMutatorsStack f15796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xh.a f15800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f15801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f15802h;

    public b(w wVar, float f10, xh.a aVar) {
        super(wVar, null);
        this.f15797c = f10;
        this.f15800f = aVar;
        this.f15801g = new Paint();
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f15796b.getFinalMatrix());
        float f10 = this.f15797c;
        matrix.preScale(1.0f / f10, 1.0f / f10);
        matrix.postTranslate(-this.f15798d, -this.f15799e);
        return matrix;
    }

    public final void a() {
        a aVar;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (aVar = this.f15802h) == null) {
            return;
        }
        this.f15802h = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(aVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        Iterator<Path> it = this.f15796b.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.f15798d, -this.f15799e);
            canvas.clipPath(path);
        }
        int finalOpacity = (int) (this.f15796b.getFinalOpacity() * 255.0f);
        Paint paint = this.f15801g;
        if (paint.getAlpha() != finalOpacity) {
            paint.setAlpha((int) (this.f15796b.getFinalOpacity() * 255.0f));
            setLayerType(2, paint);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        xh.a aVar = this.f15800f;
        if (aVar == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate(getLeft(), getTop());
        aVar.d(motionEvent, matrix);
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

    public void setOnDescendantFocusChangeListener(@NonNull View.OnFocusChangeListener onFocusChangeListener) {
        a();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f15802h == null) {
            a aVar = new a(onFocusChangeListener, this);
            this.f15802h = aVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(aVar);
        }
    }
}
