package qc;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.twinby.R;
import g2.n0;
import io.appmetrica.analytics.impl.lp;
import java.lang.reflect.Field;
import ni.x0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f32016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f32017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f32018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f32019h;
    public final gh.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f32020j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x0 f32021k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f32022l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f32023m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f32024n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f32025o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AccessibilityManager f32026p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f32027q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f32028r;

    public j(m mVar) {
        super(mVar);
        this.i = new gh.a(2, this);
        this.f32020j = new a(this, 1);
        this.f32021k = new x0(26, this);
        this.f32025o = Long.MAX_VALUE;
        this.f32017f = ya.e.x(mVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f32016e = ya.e.x(mVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f32018g = ya.e.y(mVar.getContext(), R.attr.motionEasingLinearInterpolator, wb.a.f35218a);
    }

    @Override // qc.n
    public final void a() {
        if (this.f32026p.isTouchExplorationEnabled() && this.f32019h.getInputType() != 0 && !this.f32055d.hasFocus()) {
            this.f32019h.dismissDropDown();
        }
        this.f32019h.post(new lp(23, this));
    }

    @Override // qc.n
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // qc.n
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // qc.n
    public final View.OnFocusChangeListener e() {
        return this.f32020j;
    }

    @Override // qc.n
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // qc.n
    public final x0 h() {
        return this.f32021k;
    }

    @Override // qc.n
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // qc.n
    public final boolean k() {
        return this.f32024n;
    }

    @Override // qc.n
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f32019h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: qc.h
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    j jVar = this.f32014b;
                    long j10 = jCurrentTimeMillis - jVar.f32025o;
                    if (j10 < 0 || j10 > 300) {
                        jVar.f32023m = false;
                    }
                    jVar.t();
                    jVar.f32023m = true;
                    jVar.f32025o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f32019h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: qc.i
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                j jVar = this.f32015a;
                jVar.f32023m = true;
                jVar.f32025o = System.currentTimeMillis();
                jVar.s(false);
            }
        });
        this.f32019h.setThreshold(0);
        TextInputLayout textInputLayout = this.f32052a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f32026p.isTouchExplorationEnabled()) {
            Field field = n0.f19900a;
            this.f32055d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // qc.n
    public final void m(h2.f fVar) {
        if (this.f32019h.getInputType() == 0) {
            fVar.i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? fVar.f20360a.isShowingHintText() : fVar.e(4)) {
            fVar.j(null);
        }
    }

    @Override // qc.n
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.f32026p.isEnabled() && this.f32019h.getInputType() == 0) {
            boolean z5 = accessibilityEvent.getEventType() == 32768 && this.f32024n && !this.f32019h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z5) {
                t();
                this.f32023m = true;
                this.f32025o = System.currentTimeMillis();
            }
        }
    }

    @Override // qc.n
    public final void q() {
        int i = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f32018g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f32017f);
        valueAnimatorOfFloat.addUpdateListener(new b(this, i));
        this.f32028r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f32016e);
        valueAnimatorOfFloat2.addUpdateListener(new b(this, i));
        this.f32027q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new m.b(1, this));
        this.f32026p = (AccessibilityManager) this.f32054c.getSystemService("accessibility");
    }

    @Override // qc.n
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.f32019h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f32019h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z5) {
        if (this.f32024n != z5) {
            this.f32024n = z5;
            this.f32028r.cancel();
            this.f32027q.start();
        }
    }

    public final void t() {
        if (this.f32019h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f32025o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f32023m = false;
        }
        if (this.f32023m) {
            this.f32023m = false;
            return;
        }
        s(!this.f32024n);
        if (!this.f32024n) {
            this.f32019h.dismissDropDown();
        } else {
            this.f32019h.requestFocus();
            this.f32019h.showDropDown();
        }
    }
}
