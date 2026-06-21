package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.vy;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.tasks.Task;
import io.sentry.protocol.App;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static v7.f f14762l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f14764n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fd.g f14765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f14766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q9.o f14767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f14768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ci.b f14769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f14770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f14771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sb.m f14772h;
    public final ac.i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f14761k = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static yd.a f14763m = new k(0);

    public FirebaseMessaging(fd.g gVar, yd.a aVar, yd.a aVar2, zd.d dVar, yd.a aVar3, vd.d dVar2) {
        gVar.a();
        Context context = gVar.f16758a;
        final ac.i iVar = new ac.i(context, 2);
        gVar.a();
        la.b bVar = new la.b(gVar.f16758a);
        final q9.o oVar = new q9.o();
        oVar.f31946a = gVar;
        oVar.f31947b = iVar;
        oVar.f31948c = bVar;
        oVar.f31949d = aVar;
        oVar.f31950e = aVar2;
        oVar.f31951f = dVar;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new d8.x("Firebase-Messaging-Task", 2));
        final int i = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new d8.x("Firebase-Messaging-Init", 2));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new d8.x("Firebase-Messaging-File-Io", 2));
        final int i10 = 0;
        this.f14773j = false;
        f14763m = aVar3;
        this.f14765a = gVar;
        this.f14769e = new ci.b(this, dVar2);
        gVar.a();
        final Context context2 = gVar.f16758a;
        this.f14766b = context2;
        j jVar = new j();
        this.i = iVar;
        this.f14767c = oVar;
        this.f14768d = new i(executorServiceNewSingleThreadExecutor);
        this.f14770f = scheduledThreadPoolExecutor;
        this.f14771g = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(jVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.l

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f14853c;

            {
                this.f14853c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f14853c;
                        if (firebaseMessaging.f14769e.j()) {
                            firebaseMessaging.k();
                        }
                        break;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f14853c;
                        Context context3 = firebaseMessaging2.f14766b;
                        j4.p(context3);
                        h5.z(context3, firebaseMessaging2.f14767c, firebaseMessaging2.j());
                        if (firebaseMessaging2.j()) {
                            firebaseMessaging2.g();
                        }
                        break;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new d8.x("Firebase-Messaging-Topics-Io", 2));
        int i11 = e0.f14809j;
        sb.m mVarD = b4.d(new Callable() { // from class: com.google.firebase.messaging.d0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                c0 c0Var;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                ac.i iVar2 = iVar;
                q9.o oVar2 = oVar;
                synchronized (c0.class) {
                    try {
                        WeakReference weakReference = c0.f14799c;
                        c0Var = weakReference != null ? (c0) weakReference.get() : null;
                        if (c0Var == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            c0 c0Var2 = new c0(sharedPreferences, scheduledThreadPoolExecutor3);
                            synchronized (c0Var2) {
                                c0Var2.f14800a = a1.m.j(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            c0.f14799c = new WeakReference(c0Var2);
                            c0Var = c0Var2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new e0(firebaseMessaging, iVar2, c0Var, oVar2, context3, scheduledThreadPoolExecutor3);
            }
        }, scheduledThreadPoolExecutor2);
        this.f14772h = mVarD;
        mVarD.d(scheduledThreadPoolExecutor, new m(this, i10));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.l

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f14853c;

            {
                this.f14853c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f14853c;
                        if (firebaseMessaging.f14769e.j()) {
                            firebaseMessaging.k();
                        }
                        break;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f14853c;
                        Context context3 = firebaseMessaging2.f14766b;
                        j4.p(context3);
                        h5.z(context3, firebaseMessaging2.f14767c, firebaseMessaging2.j());
                        if (firebaseMessaging2.j()) {
                            firebaseMessaging2.g();
                        }
                        break;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f14764n == null) {
                    f14764n = new ScheduledThreadPoolExecutor(1, new d8.x("TAG", 2));
                }
                f14764n.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized FirebaseMessaging c() {
        return getInstance(fd.g.e());
    }

    public static synchronized v7.f d(Context context) {
        try {
            if (f14762l == null) {
                f14762l = new v7.f(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f14762l;
    }

    public static synchronized FirebaseMessaging getInstance(fd.g gVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) gVar.c(FirebaseMessaging.class);
        pa.c0.j(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() {
        Task taskF;
        z zVarF = f();
        if (!m(zVarF)) {
            return zVarF.f14904a;
        }
        String strB = ac.i.b(this.f14765a);
        i iVar = this.f14768d;
        synchronized (iVar) {
            taskF = (Task) ((h1.e) iVar.f14839b).get(strB);
            if (taskF == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strB);
                }
                q9.o oVar = this.f14767c;
                taskF = oVar.j(oVar.p(ac.i.b((fd.g) oVar.f31946a), "*", new Bundle())).j(this.f14771g, new o(this, strB, zVarF, 0)).f((Executor) iVar.f14838a, new a0.y(6, iVar, strB));
                ((h1.e) iVar.f14839b).put(strB, taskF);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strB);
            }
        }
        try {
            return (String) b4.b(taskF);
        } catch (InterruptedException | ExecutionException e3) {
            throw new IOException(e3);
        }
    }

    public final String e() {
        fd.g gVar = this.f14765a;
        gVar.a();
        return "[DEFAULT]".equals(gVar.f16759b) ? "" : gVar.g();
    }

    public final z f() {
        z zVarB;
        v7.f fVarD = d(this.f14766b);
        String strE = e();
        String strB = ac.i.b(this.f14765a);
        synchronized (fVarD) {
            zVarB = z.b(((SharedPreferences) fVarD.f34767c).getString(v7.f.m(strE, strB), null));
        }
        return zVarB;
    }

    public final void g() {
        Task taskQ;
        int i;
        la.b bVar = (la.b) this.f14767c.f31948c;
        if (bVar.f28065c.l() >= 241100000) {
            la.m mVarL = la.m.l(bVar.f28064b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (mVarL) {
                i = mVarL.f28098c;
                mVarL.f28098c = i + 1;
            }
            taskQ = mVarL.n(new la.l(i, 5, bundle, 1)).e(la.h.f28078d, la.d.f28072d);
        } else {
            taskQ = b4.q(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        taskQ.d(this.f14770f, new m(this, 1));
    }

    public final void h(x xVar) {
        Bundle bundle = xVar.f14895b;
        if (TextUtils.isEmpty(bundle.getString("google.to"))) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        Context context = this.f14766b;
        intent.putExtra(App.TYPE, PendingIntent.getBroadcast(context, 0, intent2, 67108864));
        intent.setPackage("com.google.android.gms");
        intent.putExtras(bundle);
        context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public final void i(boolean z5) {
        ci.b bVar = this.f14769e;
        synchronized (bVar) {
            try {
                bVar.i();
                q qVar = (q) bVar.f2282c;
                if (qVar != null) {
                    ((md.k) ((vd.d) bVar.f2281b)).c(qVar);
                    bVar.f2282c = null;
                }
                fd.g gVar = ((FirebaseMessaging) bVar.f2284e).f14765a;
                gVar.a();
                SharedPreferences.Editor editorEdit = gVar.f16758a.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                editorEdit.putBoolean("auto_init", z5);
                editorEdit.apply();
                if (z5) {
                    ((FirebaseMessaging) bVar.f2284e).k();
                }
                bVar.f2283d = Boolean.valueOf(z5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean j() {
        Context context = this.f14766b;
        j4.p(context);
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "GMS core is set for proxying");
                }
                if (this.f14765a.c(jd.b.class) != null) {
                    return true;
                }
                if (d4.e() && f14763m != null) {
                    return true;
                }
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    public final void k() {
        if (m(f())) {
            synchronized (this) {
                if (!this.f14773j) {
                    l(0L);
                }
            }
        }
    }

    public final synchronized void l(long j10) {
        b(new vy(this, Math.min(Math.max(30L, 2 * j10), f14761k)), j10);
        this.f14773j = true;
    }

    public final boolean m(z zVar) {
        if (zVar != null) {
            return System.currentTimeMillis() > zVar.f14906c + z.f14903d || !this.i.a().equals(zVar.f14905b);
        }
        return true;
    }
}
