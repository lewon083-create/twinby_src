package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1 implements B1, InterfaceC0471s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f22177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A1 f22178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0045b4 f22179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K1 f22180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Rg f22181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0154fa f22182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0198h2 f22183h;
    public final D1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0084ch f22184j;

    public C1(@NonNull Context context, @NonNull A1 a12) {
        this(context, a12, new C0123e5(context));
    }

    public final void a() {
        this.f22180e.c(new jp(2, this));
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void b(Intent intent) {
        this.f22180e.d(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String encodedAuthority = data == null ? null : data.getEncodedAuthority();
            if (!"io.appmetrica.analytics.IAppMetricaService".equals(action) || encodedAuthority == null || data == null || !Objects.equals(data.getPath(), "/client")) {
                return;
            }
            int i = Integer.parseInt(data.getQueryParameter("pid"));
            this.f22179d.a(encodedAuthority, Integer.valueOf(i), data.getQueryParameter("psid"));
            this.f22183h.a(i);
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void c(Intent intent) {
        K1 k12 = this.f22180e;
        if (intent == null) {
            k12.getClass();
            return;
        }
        k12.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            k12.f22545a.a(action, Integer.valueOf(K1.a(intent)));
        }
        for (Map.Entry entry : k12.f22546b.entrySet()) {
            J1 j12 = (J1) entry.getKey();
            if (((I1) entry.getValue()).a(intent)) {
                j12.a(intent);
            }
        }
    }

    public final void d(Intent intent) {
        C0382oa.I.v().a(AbstractC0207hb.e(intent.getStringExtra("screen_size")));
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        C0382oa.I.v().a(configuration);
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void onCreate() {
        if (this.f22176a) {
            C0382oa.I.v().a(this.f22177b.getResources().getConfiguration());
        } else {
            this.f22182g.b(this.f22177b);
            C0382oa c0382oa = C0382oa.I;
            synchronized (c0382oa) {
                c0382oa.B.initAsync();
                c0382oa.f24509u.a(c0382oa.f24490a);
                c0382oa.f24509u.a(new C0245io(c0382oa.B));
                NetworkServiceLocator.init(new C0175g5(new C0390oi(c0382oa.h()), new C0427q5(c0382oa.f24490a)));
                c0382oa.l().a(c0382oa.f24505q);
                c0382oa.E();
            }
            Vj.f23155a.e();
            C0192gm c0192gm = C0382oa.I.f24509u;
            c0192gm.b();
            C0140em c0140emB = c0192gm.b();
            C0591wk c0591wkP = C0382oa.I.p();
            c0591wkP.a(new C0061bk(new C0028ad(this.f22180e)), c0140emB);
            c0192gm.a(c0591wkP);
            ((C0667zl) C0382oa.I.z()).getClass();
            a();
            C0382oa.I.m().init();
            C0382oa.I.c().init();
            D1 d12 = this.i;
            Context context = this.f22177b;
            C0045b4 c0045b4 = this.f22179d;
            d12.getClass();
            this.f22181f = new Rg(context, c0045b4);
            Context context2 = this.f22177b;
            AbstractC0547v1.f24864a.b(context2);
            AppMetrica.getReporter(context2, "20799a27-fa80-4b36-b2db-0f8141f24180");
            Context context3 = this.f22177b;
            Rg rg = this.f22181f;
            Od odR = C0382oa.k().r();
            IHandlerExecutor iHandlerExecutorD = C0382oa.k().w().d();
            C0202h6 c0202h6 = new C0202h6(context3, rg, EnumC0078cb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new X(), new BlockingExecutor(), "previous");
            C0202h6 c0202h62 = new C0202h6(context3, rg, EnumC0078cb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new C0358nb(), iHandlerExecutorD, "actual");
            File crashesDirectory = FileUtils.getCrashesDirectory(context3);
            if (crashesDirectory != null) {
                FileObserverC0150f6 fileObserverC0150f6 = new FileObserverC0150f6(crashesDirectory, c0202h62, new C0051ba());
                iHandlerExecutorD.execute(new Tf(crashesDirectory, c0202h6));
                if (!crashesDirectory.exists()) {
                    crashesDirectory.mkdir();
                } else if (!crashesDirectory.isDirectory() && crashesDirectory.delete()) {
                    crashesDirectory.mkdir();
                }
                fileObserverC0150f6.startWatching();
                C0382oa.I.E.storeReference(fileObserverC0150f6);
            }
            odR.getClass();
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context3);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                odR.f22795a.init(context3, new NativeCrashServiceConfig(absolutePath));
                List<NativeCrash> allCrashes = odR.f22795a.getAllCrashes();
                if (!allCrashes.isEmpty()) {
                    Jd jdB = odR.f22796b.b(context3, rg);
                    Iterator<T> it = allCrashes.iterator();
                    while (it.hasNext()) {
                        jdB.newCrash((NativeCrash) it.next());
                    }
                }
                odR.f22795a.setDefaultCrashHandler(odR.f22796b.a(context3, rg));
            }
            new J5(kotlin.collections.r.c(new Xg())).run();
            this.f22176a = true;
        }
        C0382oa.I.l().a();
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void onDestroy() {
        Gb gbL = C0382oa.I.l();
        synchronized (gbL) {
            Iterator it = gbL.f22377c.iterator();
            while (it.hasNext()) {
                ((InterfaceC0292kk) it.next()).onDestroy();
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void pauseUserSession(@NonNull Bundle bundle) {
        Af af2;
        bundle.setClassLoader(Af.class.getClassLoader());
        String str = Af.f22071c;
        try {
            af2 = (Af) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            af2 = null;
        }
        Integer asInteger = af2 != null ? af2.f22072a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f22183h.b(asInteger.intValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void reportData(int i, Bundle bundle) {
        this.f22184j.getClass();
        List list = (List) C0382oa.I.f24510v.f23704a.get(Integer.valueOf(i));
        if (list == null) {
            list = kotlin.collections.b0.f27475b;
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC0087ck) it.next()).reportData(i, bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void resumeUserSession(@NonNull Bundle bundle) {
        Af af2;
        bundle.setClassLoader(Af.class.getClassLoader());
        String str = Af.f22071c;
        try {
            af2 = (Af) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            af2 = null;
        }
        Integer asInteger = af2 != null ? af2.f22072a.getAsInteger("PROCESS_CFG_PROCESS_ID") : null;
        if (asInteger != null) {
            this.f22183h.c(asInteger.intValue());
        }
    }

    public C1(Context context, A1 a12, C0123e5 c0123e5) {
        this(context, a12, new C0045b4(context, c0123e5), new K1(), C0154fa.f23871d, C0382oa.k().e(), new D1());
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void a(Intent intent) {
        K1 k12 = this.f22180e;
        if (intent == null) {
            k12.getClass();
            return;
        }
        k12.getClass();
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            k12.f22545a.a(action, Integer.valueOf(K1.a(intent)));
        }
        for (Map.Entry entry : k12.f22546b.entrySet()) {
            J1 j12 = (J1) entry.getKey();
            if (((I1) entry.getValue()).a(intent)) {
                j12.a(intent);
            }
        }
    }

    public C1(Context context, A1 a12, C0045b4 c0045b4, K1 k12, C0154fa c0154fa, C0198h2 c0198h2, D1 d12) {
        this.f22176a = false;
        this.f22177b = context;
        this.f22178c = a12;
        this.f22179d = c0045b4;
        this.f22180e = k12;
        this.f22182g = c0154fa;
        this.f22183h = c0198h2;
        this.i = d12;
        this.f22184j = new C0084ch();
    }

    public final void a(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        Q5.b(bundle);
        Rg rg = this.f22181f;
        if (rg != null) {
            rg.a(Q5.b(bundle), bundle);
        }
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void a(Intent intent, int i) {
        ((C0521u0) this.f22178c).f24822a.stopSelf(i);
    }

    @Override // io.appmetrica.analytics.impl.B1
    public final void a(Intent intent, int i, int i10) {
        ((C0521u0) this.f22178c).f24822a.stopSelf(i10);
    }
}
