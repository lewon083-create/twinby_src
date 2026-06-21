package yads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ek0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ep2 f38151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f38152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wj0 f38153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f38154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f38155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f38156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f38157g;

    public /* synthetic */ ek0(ep2 ep2Var, Context context) {
        this(ep2Var, context, new wj0());
    }

    public final void a(String str, bk0 bk0Var, Drawable drawable, lm3 lm3Var) {
        this.f38155e.put(str, new ck0(bk0Var, drawable, lm3Var));
        if (this.f38157g == null) {
            t.a0 a0Var = new t.a0(22, this);
            this.f38156f.postDelayed(a0Var, 100L);
            this.f38157g = a0Var;
        }
    }

    public ek0(ep2 ep2Var, Context context, wj0 wj0Var) {
        this.f38151a = ep2Var;
        this.f38152b = context;
        this.f38153c = wj0Var;
        this.f38154d = new HashMap();
        this.f38155e = new HashMap();
        this.f38156f = new Handler(Looper.getMainLooper());
    }

    public static final void a(ek0 ek0Var) {
        Iterator it = ek0Var.f38155e.entrySet().iterator();
        while (it.hasNext()) {
            ck0 ck0Var = (ck0) ((Map.Entry) it.next()).getValue();
            for (w31 w31Var : ck0Var.f37412a.f37074b) {
                if (ck0Var.f37414c == null) {
                    Drawable drawable = ck0Var.f37413b;
                    if (drawable != null) {
                        w31Var.f44269a.a(drawable);
                    } else {
                        w31Var.getClass();
                    }
                } else {
                    w31Var.getClass();
                }
            }
        }
        ek0Var.f38155e.clear();
        ek0Var.f38157g = null;
    }

    public final void a(String str, w31 w31Var) {
        vj0 vj0VarA = this.f38153c.a(str);
        if (vj0VarA != null) {
            Drawable drawable = vj0VarA.f44064a;
            if (drawable != null) {
                w31Var.f44269a.a(drawable);
                return;
            }
            return;
        }
        bk0 bk0Var = (bk0) this.f38154d.get(str);
        if (bk0Var != null) {
            bk0Var.f37073a.add(w31Var);
            return;
        }
        Context context = this.f38152b;
        gk0 gk0Var = new gk0(str, new fk0(context.getApplicationContext()), new dk0(this, str), new oi.i(29, this, str));
        this.f38154d.put(str, new bk0(w31Var));
        this.f38151a.a(gk0Var);
    }

    public static final void a(ek0 ek0Var, String str, lm3 lm3Var) {
        bk0 bk0Var = (bk0) ek0Var.f38154d.remove(str);
        if (bk0Var == null) {
            return;
        }
        ek0Var.a(str, bk0Var, null, lm3Var);
    }
}
