package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.m1;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.y0;
import fd.g;
import id.a;
import id.b;
import id.c;
import id.e;
import io.sentry.TransactionOptions;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ob.l2;
import pa.c0;
import zd.d;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile FirebaseAnalytics f14752c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f14753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f14754b;

    public FirebaseAnalytics(m1 m1Var) {
        c0.i(m1Var);
        this.f14753a = m1Var;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (f14752c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f14752c == null) {
                        f14752c = new FirebaseAnalytics(m1.e(context, null));
                    }
                } finally {
                }
            }
        }
        return f14752c;
    }

    public static l2 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        m1 m1VarE = m1.e(context, bundle);
        if (m1VarE == null) {
            return null;
        }
        return new e(m1VarE);
    }

    public final void a(HashMap map) {
        Bundle bundle = new Bundle();
        a aVar = (a) map.get(b.f21293b);
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = (a) map.get(b.f21294c);
        if (aVar2 != null) {
            int iOrdinal2 = aVar2.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        a aVar3 = (a) map.get(b.f21295d);
        if (aVar3 != null) {
            int iOrdinal3 = aVar3.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        a aVar4 = (a) map.get(b.f21296e);
        if (aVar4 != null) {
            int iOrdinal4 = aVar4.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        m1 m1Var = this.f14753a;
        m1Var.getClass();
        m1Var.c(new x0(m1Var, bundle, 1));
    }

    public final ExecutorService b() {
        c cVar;
        synchronized (FirebaseAnalytics.class) {
            try {
                if (this.f14754b == null) {
                    this.f14754b = new c(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                cVar = this.f14754b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public String getFirebaseInstanceId() {
        try {
            Object obj = zd.c.f46249m;
            return (String) b4.c(((zd.c) g.e().c(d.class)).c(), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e3) {
            throw new IllegalStateException(e3);
        } catch (ExecutionException e7) {
            throw new IllegalStateException(e7.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        v0 v0VarA = v0.a(activity);
        m1 m1Var = this.f14753a;
        m1Var.getClass();
        m1Var.c(new y0(m1Var, v0VarA, str, str2));
    }
}
