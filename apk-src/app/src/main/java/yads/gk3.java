package yads;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gk3 extends kk3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9 f38811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ek3 f38812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y62 f38813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dk3 f38814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k62 f38815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ck3 f38816h;

    public gk3(nu2 nu2Var, h72 h72Var, di3 di3Var, d4 d4Var, v9 v9Var, z51 z51Var, g62 g62Var, j32 j32Var, hz1 hz1Var, oi2 oi2Var, py2 py2Var, ek3 ek3Var) {
        super(h72Var);
        this.f38811c = v9Var;
        this.f38812d = ek3Var;
        this.f38813e = new y62(h72Var.getContext(), this, di3Var, d4Var, nu2Var, v9Var, z51Var, g62Var, j32Var, oi2Var, py2Var);
        this.f38814f = new dk3(((lu3) nu2Var).f());
        this.f38815g = hz1Var.a();
        z51Var.a(ek3Var);
    }

    @Override // yads.kk3
    public final void a(View view) {
        h72 h72Var = (h72) view;
        y62 y62Var = this.f38813e;
        v62 v62Var = y62Var.f44939e;
        if (v62Var != null) {
            ce2 ce2Var = v62Var.f43912l;
            if (ce2Var != null) {
                ce2Var.f37353b.stop();
                p52 p52Var = h72Var.f39052c;
                j72 j72Var = ce2Var.f37354c;
                il1 il1Var = p52Var.f41822b;
                j72Var.getClass();
                if (il1Var != null) {
                    CheckBox muteControl = il1Var.getMuteControl();
                    if (muteControl != null) {
                        muteControl.setOnClickListener(null);
                        muteControl.setVisibility(8);
                    }
                    ProgressBar videoProgress = il1Var.getVideoProgress();
                    if (videoProgress != null) {
                        videoProgress.setProgress(0);
                        videoProgress.setVisibility(8);
                    }
                    TextView countDownProgress = il1Var.getCountDownProgress();
                    if (countDownProgress != null) {
                        countDownProgress.setText("");
                        countDownProgress.setVisibility(8);
                    }
                }
            }
            v62Var.f43907f.b(h72Var);
        }
        i32 i32Var = y62Var.f44940f;
        if (i32Var != null) {
            y62Var.f44935a.f39715a.remove(i32Var);
            y62Var.f44940f = null;
        }
        h72Var.setOnAttachStateChangeListener(null);
        h72Var.setVisibility(8);
        h72Var.setOnClickListener(null);
        h72Var.setOnTouchListener(null);
        h72Var.setSelected(false);
    }

    @Override // yads.kk3
    public final void b(View view, Object obj) {
        h72 h72Var = (h72) view;
        vd3 vd3Var = (vd3) obj;
        me3 me3Var = (me3) CollectionsKt.D(vd3Var.f44002a);
        ck3 ck3VarA = this.f38814f.a(h72Var.getContext(), me3Var, pf3.f41923e);
        this.f38816h = ck3VarA;
        this.f38812d.f38160a = ck3VarA;
        k62 k62Var = this.f38815g;
        Context context = h72Var.getContext();
        v9 v9Var = this.f38811c;
        k62Var.getClass();
        String str = me3Var.f40905g;
        boolean zA = qr0.a(context, pr0.f41996c);
        s62[] s62VarArr = s62.f42822b;
        if ("first_video_preloading_strategy".equals(v9Var.f43950v) && zA) {
            iv0 iv0Var = k62Var.f40086c;
            synchronized (iv0Var.f39651d) {
                try {
                    c62 c62Var = iv0Var.f39649b;
                    nj0 nj0Var = (nj0) c62Var.f37300b.getValue();
                    if (nj0Var != null) {
                        nj0Var.f41262c++;
                        nj0Var.f41260a.obtainMessage(7, str).sendToTarget();
                    }
                    c62Var.f37301c.remove(str);
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            k62Var.f40085b.a(str);
        }
        this.f38813e.a(h72Var, vd3Var, ck3VarA);
    }

    @Override // yads.kk3
    public final void a(oi oiVar, nk3 nk3Var, Object obj) {
        h72 h72Var;
        vd3 vd3Var = (vd3) obj;
        h72 h72Var2 = (h72) b();
        if (h72Var2 != null) {
            nk3Var.a(h72Var2, oiVar);
            if (vd3Var == null || this.f38816h == null) {
                return;
            }
            me3 me3Var = (me3) CollectionsKt.D(vd3Var.f44002a);
            nk3Var.a(oiVar, new eh3(h72Var2, me3Var.f40899a));
            y62 y62Var = this.f38813e;
            y62Var.f44937c.getClass();
            int i = ((q62) me3Var.f40902d).f42197c;
            h72Var2.setAspectRatio(i != 0 ? r5.f42196b / i : 1.7777778f);
            v62 v62Var = y62Var.f44939e;
            if (v62Var == null || (h72Var = (h72) v62Var.f43902a.b()) == null) {
                return;
            }
            h72Var.setClickable(false);
        }
    }

    @Override // yads.kk3
    public final /* bridge */ /* synthetic */ boolean a(View view, Object obj) {
        return true;
    }
}
