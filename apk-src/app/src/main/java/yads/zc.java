package yads;

import android.app.Dialog;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zc implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f45345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Dialog f45346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final me1 f45347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f45348d;

    public zc(ViewGroup viewGroup, Dialog dialog, me1 me1Var) {
        this.f45345a = viewGroup;
        this.f45346b = dialog;
        this.f45347c = me1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f45348d = rawY;
            return true;
        }
        if (action != 1) {
            if (action != 2) {
                return false;
            }
            float f10 = this.f45348d;
            if (rawY > f10) {
                this.f45345a.setTranslationY(rawY - f10);
            } else {
                this.f45345a.setTranslationY(0.0f);
            }
        } else if (rawY > this.f45348d) {
            this.f45347c.getClass();
            me1.a(view);
            ng0.a(this.f45346b);
        }
        return true;
    }
}
