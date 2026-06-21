package k6;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class w0 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.recyclerview.widget.p f27220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f27221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27223d;

    public w0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27221b = new Rect();
        this.f27222c = true;
        this.f27223d = false;
    }

    public w0(int i, int i10) {
        super(i, i10);
        this.f27221b = new Rect();
        this.f27222c = true;
        this.f27223d = false;
    }

    public w0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f27221b = new Rect();
        this.f27222c = true;
        this.f27223d = false;
    }

    public w0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f27221b = new Rect();
        this.f27222c = true;
        this.f27223d = false;
    }

    public w0(w0 w0Var) {
        super((ViewGroup.LayoutParams) w0Var);
        this.f27221b = new Rect();
        this.f27222c = true;
        this.f27223d = false;
    }
}
