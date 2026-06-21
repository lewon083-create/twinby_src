package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yc2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final wc2 f44998h = new wc2();
    public static volatile yc2 i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gw2 f45000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vc2 f45001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uc2 f45002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakHashMap f45003e = new WeakHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f45004f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public tc2 f45005g = tc2.f43271d;

    public yc2(Context context, Executor executor, gw2 gw2Var, vc2 vc2Var, uc2 uc2Var) {
        this.f44999a = context;
        this.f45000b = gw2Var;
        this.f45001c = vc2Var;
        this.f45002d = uc2Var;
        executor.execute(new zl.a1(5, this));
    }

    public static final void a(yc2 yc2Var) {
        tc2 tc2VarA = yc2Var.f45001c.a();
        yc2Var.f45005g = tc2VarA;
        Objects.toString(tc2VarA);
        try {
            yc2Var.f45002d.getClass();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (Build.VERSION.SDK_INT >= 33) {
                yc2Var.f44999a.registerReceiver(yc2Var, intentFilter, 2);
            } else {
                yc2Var.f44999a.registerReceiver(yc2Var, intentFilter);
            }
        } catch (Exception unused) {
        }
    }

    public final void b(xc2 xc2Var) {
        synchronized (this.f45004f) {
            this.f45003e.remove(xc2Var);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        tc2 tc2Var;
        HashSet hashSet;
        synchronized (this.f45004f) {
            try {
                tc2 tc2Var2 = this.f45005g;
                String action = intent.getAction();
                tc2 tc2Var3 = Intrinsics.a(action, "android.intent.action.SCREEN_OFF") ? tc2.f43270c : Intrinsics.a(action, "android.intent.action.USER_PRESENT") ? tc2.f43271d : (this.f45005g == tc2.f43271d || !Intrinsics.a(action, "android.intent.action.SCREEN_ON")) ? this.f45005g : tc2.f43269b;
                this.f45005g = tc2Var3;
                if (tc2Var2 != tc2Var3) {
                    Objects.toString(tc2Var3);
                }
                tc2Var = this.f45005g;
                hashSet = new HashSet(this.f45003e.keySet());
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((xc2) it.next()).a(tc2Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #0 {all -> 0x001d, blocks: (B:6:0x000e, B:8:0x0012, B:10:0x0018, B:15:0x001f), top: B:23:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r4 = this;
            yads.gw2 r0 = r4.f45000b
            android.content.Context r1 = r4.f44999a
            yads.pt2 r0 = r0.a(r1)
            java.lang.Object r1 = r4.f45004f
            monitor-enter(r1)
            r2 = 1
            if (r0 == 0) goto L1f
            boolean r0 = r0.f42032h     // Catch: java.lang.Throwable -> L1d
            if (r0 != r2) goto L1f
            yads.tc2 r0 = r4.f45005g     // Catch: java.lang.Throwable -> L1d
            yads.tc2 r3 = yads.tc2.f43269b     // Catch: java.lang.Throwable -> L1d
            if (r0 == r3) goto L27
            yads.tc2 r3 = yads.tc2.f43271d     // Catch: java.lang.Throwable -> L1d
            if (r0 != r3) goto L26
            goto L27
        L1d:
            r0 = move-exception
            goto L29
        L1f:
            yads.tc2 r0 = r4.f45005g     // Catch: java.lang.Throwable -> L1d
            yads.tc2 r3 = yads.tc2.f43271d     // Catch: java.lang.Throwable -> L1d
            if (r0 != r3) goto L26
            goto L27
        L26:
            r2 = 0
        L27:
            monitor-exit(r1)
            return r2
        L29:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.yc2.a():boolean");
    }

    public final void a(xc2 xc2Var) {
        synchronized (this.f45004f) {
            this.f45003e.put(xc2Var, null);
            Unit unit = Unit.f27471a;
        }
    }
}
