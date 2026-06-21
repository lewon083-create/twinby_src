package qc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import m.k0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f32057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f32058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f32059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f32060e;

    public o(q qVar, int i, TextView textView, int i10, TextView textView2) {
        this.f32060e = qVar;
        this.f32056a = i;
        this.f32057b = textView;
        this.f32058c = i10;
        this.f32059d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        k0 k0Var;
        int i = this.f32056a;
        q qVar = this.f32060e;
        qVar.f32074n = i;
        qVar.f32072l = null;
        TextView textView = this.f32057b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f32058c == 1 && (k0Var = qVar.f32078r) != null) {
                k0Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f32059d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f32059d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
