package bj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import com.google.android.gms.internal.ads.fp;
import com.google.android.gms.internal.ads.gh;
import com.google.android.gms.internal.ads.hv1;
import com.google.android.gms.internal.ads.ke;
import com.google.android.gms.internal.ads.lo0;
import com.google.android.gms.internal.ads.mu0;
import com.google.android.gms.internal.ads.s50;
import com.google.android.gms.internal.ads.th0;
import com.google.android.gms.internal.ads.tr0;
import com.google.android.gms.internal.ads.uf;
import com.google.android.gms.internal.ads.yi0;
import com.google.android.gms.internal.ads.zj0;
import com.google.android.gms.internal.measurement.t8;
import io.appmetrica.analytics.impl.cp;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import m3.o;
import ob.d0;
import ob.h4;
import ob.i1;
import ob.l1;
import ob.s0;
import t9.g0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2171b;

    public /* synthetic */ g(int i, Object obj) {
        this.f2170a = i;
        this.f2171b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f2170a) {
            case 0:
                if ("close action".equals(intent.getAction())) {
                    ((WebViewActivity) this.f2171b).finish();
                    return;
                }
                return;
            case 1:
                ((uf) this.f2171b).c();
                return;
            case 2:
                ((gh) this.f2171b).d(3);
                return;
            case 3:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    ((lo0) this.f2171b).e(new ke(1));
                    return;
                }
                return;
            case 4:
                ((Executor) ((zj0) this.f2171b).f13010d).execute(new th0(3, this, context));
                return;
            case 5:
                mu0 mu0Var = (mu0) this.f2171b;
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    mu0Var.a(true, mu0Var.f8026c);
                    mu0Var.f8025b = true;
                    return;
                } else {
                    if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                        mu0Var.a(false, mu0Var.f8026c);
                        mu0Var.f8025b = false;
                        return;
                    }
                    return;
                }
            case 6:
                if (isInitialStickyBroadcast()) {
                    return;
                }
                yi0 yi0Var = (yi0) this.f2171b;
                yi0Var.h(hv1.b(context, intent, (s50) yi0Var.f12630k, (AudioDeviceInfo) yi0Var.f12629j));
                return;
            case 7:
                ((o) this.f2171b).f28580a.execute(new cp(28, this, context));
                return;
            case 8:
                l1 l1Var = (l1) this.f2171b;
                if (intent == null) {
                    s0 s0Var = l1Var.f30265g;
                    l1.k(s0Var);
                    s0Var.f30413j.f("App receiver called with null intent");
                    return;
                }
                String action = intent.getAction();
                if (action == null) {
                    s0 s0Var2 = l1Var.f30265g;
                    l1.k(s0Var2);
                    s0Var2.f30413j.f("App receiver called with null action");
                    return;
                }
                int iHashCode = action.hashCode();
                if (iHashCode != -1928239649) {
                    if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                        s0 s0Var3 = l1Var.f30265g;
                        l1.k(s0Var3);
                        s0Var3.f30418o.f("[sgtm] App Receiver notified batches are available");
                        i1 i1Var = l1Var.f30266h;
                        l1.k(i1Var);
                        i1Var.L(new h4(0, this));
                        return;
                    }
                } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                    t8.a();
                    if (l1Var.f30263e.M(null, d0.Q0)) {
                        s0 s0Var4 = l1Var.f30265g;
                        l1.k(s0Var4);
                        s0Var4.f30418o.f("App receiver notified triggers are available");
                        i1 i1Var2 = l1Var.f30266h;
                        l1.k(i1Var2);
                        i1Var2.L(new h4(1, l1Var));
                        return;
                    }
                    return;
                }
                s0 s0Var5 = l1Var.f30265g;
                l1.k(s0Var5);
                s0Var5.f30413j.f("App receiver called with unknown action");
                return;
            case 9:
                if (intent != null) {
                    ((s7.c) this.f2171b).g(intent);
                    return;
                }
                return;
            case 10:
                tr0 tr0Var = (tr0) this.f2171b;
                synchronized (tr0Var) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : ((WeakHashMap) tr0Var.f10704e).entrySet()) {
                            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                                arrayList.add((BroadcastReceiver) entry.getKey());
                            }
                        }
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 11:
                g0 g0Var = (g0) this.f2171b;
                if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
                    g0Var.f33601e = true;
                    return;
                } else {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        g0Var.f33601e = false;
                        return;
                    }
                    return;
                }
            default:
                if (isInitialStickyBroadcast()) {
                    return;
                }
                yi0 yi0Var2 = (yi0) this.f2171b;
                yi0Var2.e(u3.b.b(context, intent, (j3.d) yi0Var2.f12630k, (AudioDeviceInfo) yi0Var2.f12629j));
                return;
        }
    }

    public g() {
        this.f2170a = 5;
        this.f2171b = mu0.f8023d;
    }

    public /* synthetic */ g(fp fpVar, lo0 lo0Var) {
        this.f2170a = 3;
        this.f2171b = lo0Var;
    }

    public g(l1 l1Var) {
        this.f2170a = 8;
        this.f2171b = l1Var;
    }
}
