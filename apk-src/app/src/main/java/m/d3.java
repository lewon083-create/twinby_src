package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f28190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f28192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f28193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f28194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f28195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f28197h;
    public CharSequence i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f28198j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f28199k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f28200l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f28201m;

    public final void a(int i) {
        View view;
        Toolbar toolbar = this.f28190a;
        int i10 = this.f28191b ^ i;
        this.f28191b = i;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                if ((this.f28191b & 4) != 0) {
                    Drawable drawable = this.f28195f;
                    if (drawable == null) {
                        drawable = this.f28201m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i10 & 3) != 0) {
                c();
            }
            if ((i10 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.f28197h);
                    toolbar.setSubtitle(this.i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) == 0 || (view = this.f28192c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f28190a;
        if ((this.f28191b & 4) != 0) {
            if (TextUtils.isEmpty(this.f28198j)) {
                toolbar.setNavigationContentDescription(this.f28200l);
            } else {
                toolbar.setNavigationContentDescription(this.f28198j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.f28191b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f28194e) == null) {
            drawable = this.f28193d;
        }
        this.f28190a.setLogo(drawable);
    }
}
