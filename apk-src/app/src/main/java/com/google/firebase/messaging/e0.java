package com.google.firebase.messaging;

import a0.d1;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public static final long i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f14809j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ac.i f14811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q9.o f14812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f14813d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f14815f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c0 f14817h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1.e f14814e = new h1.e(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14816g = false;

    public e0(FirebaseMessaging firebaseMessaging, ac.i iVar, c0 c0Var, q9.o oVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f14813d = firebaseMessaging;
        this.f14811b = iVar;
        this.f14817h = c0Var;
        this.f14812c = oVar;
        this.f14810a = context;
        this.f14815f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) throws IOException {
        try {
            b4.c(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e3) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e3);
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e7);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) throws IOException {
        String strA = this.f14813d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        q9.o oVar = this.f14812c;
        a(oVar.j(oVar.p(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.f14813d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        q9.o oVar = this.f14812c;
        a(oVar.j(oVar.p(strA, "/topics/" + str, bundle)));
    }

    public final sb.m d(b0 b0Var) {
        ArrayDeque arrayDeque;
        c0 c0Var = this.f14817h;
        synchronized (c0Var) {
            a1.m mVar = c0Var.f14800a;
            String str = b0Var.f14797c;
            mVar.getClass();
            if (!TextUtils.isEmpty(str) && !str.contains((String) mVar.f364d)) {
                synchronized (((ArrayDeque) mVar.f365e)) {
                    if (((ArrayDeque) mVar.f365e).add(str)) {
                        ((ScheduledThreadPoolExecutor) mVar.f366f).execute(new d1(11, mVar));
                    }
                }
            }
        }
        sb.g gVar = new sb.g();
        synchronized (this.f14814e) {
            try {
                String str2 = b0Var.f14797c;
                if (this.f14814e.containsKey(str2)) {
                    arrayDeque = (ArrayDeque) this.f14814e.get(str2);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f14814e.put(str2, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(gVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar.f32858a;
    }

    public final synchronized void e(boolean z5) {
        this.f14816g = z5;
    }

    public final void f() {
        boolean z5;
        if (this.f14817h.a() != null) {
            synchronized (this) {
                z5 = this.f14816g;
            }
            if (z5) {
                return;
            }
            h(0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008b A[Catch: IOException -> 0x0062, TryCatch #2 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:88:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.e0.g():boolean");
    }

    public final void h(long j10) {
        this.f14815f.schedule(new g0(this, this.f14810a, this.f14811b, Math.min(Math.max(30L, 2 * j10), i)), j10, TimeUnit.SECONDS);
        e(true);
    }
}
