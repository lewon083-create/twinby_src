package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.twinby.R;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends x implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f28223b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f28223b = jVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        a.a.p(this, getContentDescription());
        setOnTouchListener(new l.a(this, this));
    }

    @Override // m.k
    public final boolean a() {
        return false;
    }

    @Override // m.k
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f28223b.k();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i10, int i11, int i12) {
        boolean frame = super.setFrame(i, i10, i11, i12);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
