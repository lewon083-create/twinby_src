package k6;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27080d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(androidx.recyclerview.widget.i iVar, int i) {
        super(iVar);
        this.f27080d = i;
    }

    @Override // k6.h0
    public final int b(View view) {
        int decoratedRight;
        int i;
        switch (this.f27080d) {
            case 0:
                w0 w0Var = (w0) view.getLayoutParams();
                decoratedRight = this.f27086a.getDecoratedRight(view);
                i = ((ViewGroup.MarginLayoutParams) w0Var).rightMargin;
                break;
            default:
                w0 w0Var2 = (w0) view.getLayoutParams();
                decoratedRight = this.f27086a.getDecoratedBottom(view);
                i = ((ViewGroup.MarginLayoutParams) w0Var2).bottomMargin;
                break;
        }
        return decoratedRight + i;
    }

    @Override // k6.h0
    public final int c(View view) {
        int decoratedMeasuredWidth;
        int i;
        switch (this.f27080d) {
            case 0:
                w0 w0Var = (w0) view.getLayoutParams();
                decoratedMeasuredWidth = this.f27086a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) w0Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) w0Var).rightMargin;
                break;
            default:
                w0 w0Var2 = (w0) view.getLayoutParams();
                decoratedMeasuredWidth = this.f27086a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) w0Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) w0Var2).bottomMargin;
                break;
        }
        return decoratedMeasuredWidth + i;
    }

    @Override // k6.h0
    public final int d(View view) {
        int decoratedMeasuredHeight;
        int i;
        switch (this.f27080d) {
            case 0:
                w0 w0Var = (w0) view.getLayoutParams();
                decoratedMeasuredHeight = this.f27086a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) w0Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin;
                break;
            default:
                w0 w0Var2 = (w0) view.getLayoutParams();
                decoratedMeasuredHeight = this.f27086a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) w0Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) w0Var2).rightMargin;
                break;
        }
        return decoratedMeasuredHeight + i;
    }

    @Override // k6.h0
    public final int e(View view) {
        int decoratedLeft;
        int i;
        switch (this.f27080d) {
            case 0:
                w0 w0Var = (w0) view.getLayoutParams();
                decoratedLeft = this.f27086a.getDecoratedLeft(view);
                i = ((ViewGroup.MarginLayoutParams) w0Var).leftMargin;
                break;
            default:
                w0 w0Var2 = (w0) view.getLayoutParams();
                decoratedLeft = this.f27086a.getDecoratedTop(view);
                i = ((ViewGroup.MarginLayoutParams) w0Var2).topMargin;
                break;
        }
        return decoratedLeft - i;
    }

    @Override // k6.h0
    public final int f() {
        switch (this.f27080d) {
            case 0:
                return this.f27086a.getWidth();
            default:
                return this.f27086a.getHeight();
        }
    }

    @Override // k6.h0
    public final int g() {
        int width;
        int paddingRight;
        switch (this.f27080d) {
            case 0:
                androidx.recyclerview.widget.i iVar = this.f27086a;
                width = iVar.getWidth();
                paddingRight = iVar.getPaddingRight();
                break;
            default:
                androidx.recyclerview.widget.i iVar2 = this.f27086a;
                width = iVar2.getHeight();
                paddingRight = iVar2.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // k6.h0
    public final int h() {
        switch (this.f27080d) {
            case 0:
                return this.f27086a.getPaddingRight();
            default:
                return this.f27086a.getPaddingBottom();
        }
    }

    @Override // k6.h0
    public final int i() {
        switch (this.f27080d) {
            case 0:
                return this.f27086a.getWidthMode();
            default:
                return this.f27086a.getHeightMode();
        }
    }

    @Override // k6.h0
    public final int j() {
        switch (this.f27080d) {
            case 0:
                return this.f27086a.getHeightMode();
            default:
                return this.f27086a.getWidthMode();
        }
    }

    @Override // k6.h0
    public final int k() {
        switch (this.f27080d) {
            case 0:
                return this.f27086a.getPaddingLeft();
            default:
                return this.f27086a.getPaddingTop();
        }
    }

    @Override // k6.h0
    public final int l() {
        int width;
        int paddingRight;
        switch (this.f27080d) {
            case 0:
                androidx.recyclerview.widget.i iVar = this.f27086a;
                width = iVar.getWidth() - iVar.getPaddingLeft();
                paddingRight = iVar.getPaddingRight();
                break;
            default:
                androidx.recyclerview.widget.i iVar2 = this.f27086a;
                width = iVar2.getHeight() - iVar2.getPaddingTop();
                paddingRight = iVar2.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // k6.h0
    public final int m(View view) {
        switch (this.f27080d) {
            case 0:
                androidx.recyclerview.widget.i iVar = this.f27086a;
                Rect rect = this.f27088c;
                iVar.getTransformedBoundingBox(view, true, rect);
                return rect.right;
            default:
                androidx.recyclerview.widget.i iVar2 = this.f27086a;
                Rect rect2 = this.f27088c;
                iVar2.getTransformedBoundingBox(view, true, rect2);
                return rect2.bottom;
        }
    }

    @Override // k6.h0
    public final int n(View view) {
        switch (this.f27080d) {
            case 0:
                androidx.recyclerview.widget.i iVar = this.f27086a;
                Rect rect = this.f27088c;
                iVar.getTransformedBoundingBox(view, true, rect);
                return rect.left;
            default:
                androidx.recyclerview.widget.i iVar2 = this.f27086a;
                Rect rect2 = this.f27088c;
                iVar2.getTransformedBoundingBox(view, true, rect2);
                return rect2.top;
        }
    }

    @Override // k6.h0
    public final void o(int i) {
        switch (this.f27080d) {
            case 0:
                this.f27086a.offsetChildrenHorizontal(i);
                break;
            default:
                this.f27086a.offsetChildrenVertical(i);
                break;
        }
    }
}
