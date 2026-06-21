package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f25750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f25751c;

    public r(Context context) {
        super(context);
        this.f25750b = new Rect();
        this.f25751c = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f25750b.set(i, i10, i11, i12);
            Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f25750b, layoutParams.x, layoutParams.y, this.f25751c);
            Rect rect = this.f25751c;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            getChildAt(i11).measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR));
        }
        super.onMeasure(i, i10);
    }
}
