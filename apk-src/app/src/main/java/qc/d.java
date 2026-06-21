package qc;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.twinby.R;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.impl.lp;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f32002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f32003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f32004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f32005h;
    public EditText i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gh.a f32006j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f32007k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f32008l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f32009m;

    public d(m mVar) {
        super(mVar);
        this.f32006j = new gh.a(1, this);
        this.f32007k = new a(this, 0);
        this.f32002e = ya.e.x(mVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f32003f = ya.e.x(mVar.getContext(), R.attr.motionDurationShort3, VKApiCodes.CODE_INVALID_TIMESTAMP);
        this.f32004g = ya.e.y(mVar.getContext(), R.attr.motionEasingLinearInterpolator, wb.a.f35218a);
        this.f32005h = ya.e.y(mVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, wb.a.f35221d);
    }

    @Override // qc.n
    public final void a() {
        if (this.f32053b.f32045q != null) {
            return;
        }
        s(t());
    }

    @Override // qc.n
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // qc.n
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // qc.n
    public final View.OnFocusChangeListener e() {
        return this.f32007k;
    }

    @Override // qc.n
    public final View.OnClickListener f() {
        return this.f32006j;
    }

    @Override // qc.n
    public final View.OnFocusChangeListener g() {
        return this.f32007k;
    }

    @Override // qc.n
    public final void l(EditText editText) {
        this.i = editText;
        this.f32052a.setEndIconVisible(t());
    }

    @Override // qc.n
    public final void o(boolean z5) {
        if (this.f32053b.f32045q == null) {
            return;
        }
        s(z5);
    }

    @Override // qc.n
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f32005h);
        valueAnimatorOfFloat.setDuration(this.f32003f);
        valueAnimatorOfFloat.addUpdateListener(new b(this, 1));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f32004g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i = this.f32002e;
        valueAnimatorOfFloat2.setDuration(i);
        valueAnimatorOfFloat2.addUpdateListener(new b(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f32008l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f32008l.addListener(new c(this, 0));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i);
        valueAnimatorOfFloat3.addUpdateListener(new b(this, 0));
        this.f32009m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new c(this, 1));
    }

    @Override // qc.n
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new lp(22, this));
        }
    }

    public final void s(boolean z5) {
        boolean z10 = this.f32053b.c() == z5;
        if (z5 && !this.f32008l.isRunning()) {
            this.f32009m.cancel();
            this.f32008l.start();
            if (z10) {
                this.f32008l.end();
                return;
            }
            return;
        }
        if (z5) {
            return;
        }
        this.f32008l.cancel();
        this.f32009m.start();
        if (z10) {
            this.f32009m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.f32055d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}
