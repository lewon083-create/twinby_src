package o7;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.google.android.gms.internal.ads.om1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l7.n;
import u7.j;
import v7.k;
import v7.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements q7.b, m7.b, p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f29794k = n.i("DelayMetCommandHandler");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f29795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f29797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f29798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q7.c f29799f;
    public PowerManager.WakeLock i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f29802j = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29801h = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f29800g = new Object();

    public e(Context context, int i, String str, g gVar) {
        this.f29795b = context;
        this.f29796c = i;
        this.f29798e = gVar;
        this.f29797d = str;
        this.f29799f = new q7.c(context, gVar.f29807c, this);
    }

    public final void a() {
        synchronized (this.f29800g) {
            try {
                this.f29799f.c();
                this.f29798e.f29808d.b(this.f29797d);
                PowerManager.WakeLock wakeLock = this.i;
                if (wakeLock != null && wakeLock.isHeld()) {
                    n.g().e(f29794k, "Releasing wakelock " + this.i + " for WorkSpec " + this.f29797d, new Throwable[0]);
                    this.i.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f29797d;
        sb2.append(str);
        sb2.append(" (");
        sb2.append(this.f29796c);
        sb2.append(")");
        this.i = k.a(this.f29795b, sb2.toString());
        n nVarG = n.g();
        PowerManager.WakeLock wakeLock = this.i;
        String str2 = f29794k;
        nVarG.e(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.i.acquire();
        j jVarH = this.f29798e.f29810f.f28732d.n().h(str);
        if (jVarH == null) {
            d();
            return;
        }
        boolean zB = jVarH.b();
        this.f29802j = zB;
        if (zB) {
            this.f29799f.b(Collections.singletonList(jVarH));
        } else {
            n.g().e(str2, om1.k("No constraints for ", str), new Throwable[0]);
            f(Collections.singletonList(str));
        }
    }

    @Override // m7.b
    public final void c(String str, boolean z5) {
        n.g().e(f29794k, "onExecuted " + str + ", " + z5, new Throwable[0]);
        a();
        int i = this.f29796c;
        g gVar = this.f29798e;
        Context context = this.f29795b;
        if (z5) {
            gVar.e(new ac.a(gVar, b.b(context, this.f29797d), i, 3));
        }
        if (this.f29802j) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            gVar.e(new ac.a(gVar, intent, i, 3));
        }
    }

    public final void d() {
        synchronized (this.f29800g) {
            try {
                if (this.f29801h < 2) {
                    this.f29801h = 2;
                    n nVarG = n.g();
                    String str = f29794k;
                    nVarG.e(str, "Stopping work for WorkSpec " + this.f29797d, new Throwable[0]);
                    Context context = this.f29795b;
                    String str2 = this.f29797d;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    g gVar = this.f29798e;
                    gVar.e(new ac.a(gVar, intent, this.f29796c, 3));
                    if (this.f29798e.f29809e.d(this.f29797d)) {
                        n.g().e(str, "WorkSpec " + this.f29797d + " needs to be rescheduled", new Throwable[0]);
                        Intent intentB = b.b(this.f29795b, this.f29797d);
                        g gVar2 = this.f29798e;
                        gVar2.e(new ac.a(gVar2, intentB, this.f29796c, 3));
                    } else {
                        n.g().e(str, "Processor does not have WorkSpec " + this.f29797d + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    n.g().e(f29794k, "Already stopped work for " + this.f29797d, new Throwable[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // q7.b
    public final void e(ArrayList arrayList) {
        d();
    }

    @Override // q7.b
    public final void f(List list) {
        if (list.contains(this.f29797d)) {
            synchronized (this.f29800g) {
                try {
                    if (this.f29801h == 0) {
                        this.f29801h = 1;
                        n.g().e(f29794k, "onAllConstraintsMet for " + this.f29797d, new Throwable[0]);
                        if (this.f29798e.f29809e.g(this.f29797d, null)) {
                            this.f29798e.f29808d.a(this.f29797d, this);
                        } else {
                            a();
                        }
                    } else {
                        n.g().e(f29794k, "Already started work for " + this.f29797d, new Throwable[0]);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
