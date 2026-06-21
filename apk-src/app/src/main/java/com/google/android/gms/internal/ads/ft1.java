package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ft1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f5438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5440f;

    public /* synthetic */ ft1(Context context, boolean z5, ot1 ot1Var, fv1 fv1Var) {
        this.f5436b = 0;
        this.f5437c = context;
        this.f5438d = z5;
        this.f5439e = ot1Var;
        this.f5440f = fv1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Executor executorUnconfigurableExecutorService;
        int iA;
        switch (this.f5436b) {
            case 0:
                Context context = (Context) this.f5437c;
                MediaMetricsManager mediaMetricsManagerI = t3.h.i(context.getSystemService("media_metrics"));
                ev1 ev1Var = mediaMetricsManagerI == null ? null : new ev1(context, mediaMetricsManagerI.createPlaybackSession());
                if (ev1Var == null) {
                    rs.r("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (this.f5438d) {
                    ((ot1) this.f5439e).G1(ev1Var);
                }
                fv1 fv1Var = (fv1) this.f5440f;
                LogSessionId sessionId = ev1Var.f5083e.getSessionId();
                synchronized (fv1Var) {
                    pp0 pp0Var = fv1Var.f5456b;
                    if (pp0Var == null) {
                        throw null;
                    }
                    LogSessionId logSessionId = (LogSessionId) pp0Var.f9149c;
                    LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                    ix.k0(logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE));
                    pp0Var.f9149c = sessionId;
                }
                return;
            case 1:
                Intent intent = (Intent) this.f5439e;
                Context context2 = (Context) this.f5437c;
                boolean z5 = this.f5438d;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f5440f;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 == null) {
                        int iIntValue = 500;
                        if (intent.getExtras() != null) {
                            la.a aVar = new la.a(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.f14760b;
                                    executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                                    if (executorUnconfigurableExecutorService == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new d8.x("pscm-ack-executor", 2));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.f14760b = new SoftReference(executorUnconfigurableExecutorService);
                                    }
                                } finally {
                                }
                                break;
                            }
                            executorUnconfigurableExecutorService.execute(new aa.y(context2, aVar, countDownLatch, 12));
                            try {
                                iIntValue = ((Integer) com.google.android.gms.internal.measurement.b4.b(new com.google.firebase.messaging.i(context2).b(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e3) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e3);
                            }
                            try {
                                if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e7) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e7.toString()));
                            }
                        }
                        iA = iIntValue;
                        break;
                    } else {
                        iA = FirebaseInstanceIdReceiver.a(intent2);
                    }
                    if (z5 && pendingResult != null) {
                        pendingResult.setResultCode(iA);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th2;
                }
            case 2:
                ob.d3 d3Var = (ob.d3) this.f5440f;
                ob.g0 g0Var = d3Var.f30067e;
                if (g0Var != null) {
                    d3Var.U(g0Var, this.f5438d ? null : (ob.b4) this.f5439e, (ob.g4) this.f5437c);
                    d3Var.P();
                    return;
                } else {
                    ob.s0 s0Var = ((ob.l1) d3Var.f15951b).f30265g;
                    ob.l1.k(s0Var);
                    s0Var.f30411g.f("Discarding data. Failed to set user property");
                    return;
                }
            case 3:
                ob.d3 d3Var2 = (ob.d3) this.f5440f;
                ob.g0 g0Var2 = d3Var2.f30067e;
                if (g0Var2 != null) {
                    d3Var2.U(g0Var2, this.f5438d ? null : (ob.v) this.f5439e, (ob.g4) this.f5437c);
                    d3Var2.P();
                    return;
                } else {
                    ob.s0 s0Var2 = ((ob.l1) d3Var2.f15951b).f30265g;
                    ob.l1.k(s0Var2);
                    s0Var2.f30411g.f("Discarding data. Failed to send event to service");
                    return;
                }
            default:
                ob.d3 d3Var3 = (ob.d3) this.f5440f;
                ob.g0 g0Var3 = d3Var3.f30067e;
                if (g0Var3 != null) {
                    d3Var3.U(g0Var3, this.f5438d ? null : (ob.e) this.f5439e, (ob.g4) this.f5437c);
                    d3Var3.P();
                    return;
                } else {
                    ob.s0 s0Var3 = ((ob.l1) d3Var3.f15951b).f30265g;
                    ob.l1.k(s0Var3);
                    s0Var3.f30411g.f("Discarding data. Failed to send conditional user property to service");
                    return;
                }
        }
    }

    public /* synthetic */ ft1(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z5, BroadcastReceiver.PendingResult pendingResult) {
        this.f5436b = 1;
        this.f5439e = intent;
        this.f5437c = context;
        this.f5438d = z5;
        this.f5440f = pendingResult;
    }

    public /* synthetic */ ft1(ob.d3 d3Var, ob.g4 g4Var, boolean z5, qa.a aVar, int i) {
        this.f5436b = i;
        this.f5437c = g4Var;
        this.f5438d = z5;
        this.f5439e = aVar;
        this.f5440f = d3Var;
    }

    public ft1(ob.d3 d3Var, ob.g4 g4Var, boolean z5, ob.e eVar) {
        this.f5436b = 4;
        this.f5437c = g4Var;
        this.f5438d = z5;
        this.f5439e = eVar;
        Objects.requireNonNull(d3Var);
        this.f5440f = d3Var;
    }
}
