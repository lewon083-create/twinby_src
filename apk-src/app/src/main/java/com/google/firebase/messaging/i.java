package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f14836c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static k0 f14837d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14839b;

    public i(ExecutorService executorService) {
        this.f14839b = new h1.e(0);
        this.f14838a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z5) {
        k0 k0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f14836c) {
            try {
                if (f14837d == null) {
                    f14837d = new k0(context);
                }
                k0Var = f14837d;
            } finally {
            }
        }
        if (!z5) {
            return k0Var.b(intent).e(new com.yandex.div.core.dagger.b(1), new bg.a(24));
        }
        if (y.g().o(context)) {
            synchronized (h0.f14834b) {
                try {
                    h0.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        h0.f14835c.a(h0.f14833a);
                    }
                    k0Var.b(intent).addOnCompleteListener(new a0.a0(5, intent));
                } finally {
                }
            }
        } else {
            k0Var.b(intent);
        }
        return b4.s(-1);
    }

    public Task b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.f14838a;
        com.yandex.div.core.dagger.b bVar = (com.yandex.div.core.dagger.b) this.f14839b;
        boolean z5 = ua.b.h() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z10 = (intent.getFlags() & 268435456) != 0;
        return (!z5 || z10) ? b4.d(new g(0, context, intent), bVar).f(bVar, new h(context, intent, z10)) : a(context, intent, z10);
    }

    public i(Context context) {
        this.f14838a = context;
        this.f14839b = new com.yandex.div.core.dagger.b(1);
    }
}
