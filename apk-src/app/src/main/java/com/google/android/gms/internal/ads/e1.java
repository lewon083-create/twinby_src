package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.internal.ads.yi0;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f4784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4785e;

    public /* synthetic */ e1(Object obj, int i, int i10, long j10) {
        this.f4782b = i10;
        this.f4785e = obj;
        this.f4783c = i;
        this.f4784d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4782b) {
            case 0:
                g1 g1Var = (g1) this.f4785e;
                int i = this.f4783c;
                long j10 = this.f4784d;
                g1Var.getClass();
                String str = cq0.f4293a;
                bv1 bv1Var = g1Var.f5591b.f6261b.f8792t;
                xu1 xu1VarW = bv1Var.w((hy1) bv1Var.f3917d.f6145f);
                bv1Var.r(xu1VarW, 1018, new l7.n(xu1VarW, i, j10));
                return;
            default:
                final yi0 yi0Var = (yi0) this.f4785e;
                int i10 = this.f4783c;
                final long j11 = this.f4784d;
                synchronized (yi0Var) {
                    final int i11 = i10 - 1;
                    final Task taskC = ((he.g) yi0Var.f12625e).c(3 - i11);
                    final Task taskB = ((he.c) yi0Var.f12626f).b();
                    com.google.android.gms.internal.measurement.b4.L(taskC, taskB).f((ScheduledExecutorService) yi0Var.f12628h, new sb.a() { // from class: he.a
                        @Override // sb.a
                        public final Object g(Task task) throws JSONException {
                            Boolean boolValueOf;
                            yi0 yi0Var2 = yi0Var;
                            Task task2 = taskC;
                            Task task3 = taskB;
                            long j12 = j11;
                            int i12 = i11;
                            if (!task2.isSuccessful()) {
                                return b4.q(new ge.f("Failed to auto-fetch config update.", task2.getException()));
                            }
                            if (!task3.isSuccessful()) {
                                return b4.q(new ge.f("Failed to get activated config for auto-fetch", task3.getException()));
                            }
                            f fVar = (f) task2.getResult();
                            d dVarA = (d) task3.getResult();
                            d dVar = fVar.f20505b;
                            if (dVar != null) {
                                boolValueOf = Boolean.valueOf(dVar.f20500f >= j12);
                            } else {
                                boolValueOf = Boolean.valueOf(fVar.f20504a == 1);
                            }
                            if (!boolValueOf.booleanValue()) {
                                Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                                yi0Var2.a(i12, j12);
                                return b4.s(null);
                            }
                            if (fVar.f20505b == null) {
                                Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                                return b4.s(null);
                            }
                            if (dVarA == null) {
                                dVarA = d.c().a();
                            }
                            d dVar2 = fVar.f20505b;
                            JSONObject jSONObject = dVarA.f20499e;
                            JSONObject jSONObject2 = dVar2.f20495a;
                            JSONObject jSONObject3 = dVar2.f20496b;
                            JSONObject jSONObject4 = dVar2.f20499e;
                            JSONObject jSONObject5 = d.a(new JSONObject(jSONObject2.toString())).f20496b;
                            HashMap mapB = dVarA.b();
                            HashMap mapB2 = dVar2.b();
                            HashSet hashSet = new HashSet();
                            JSONObject jSONObject6 = dVarA.f20496b;
                            Iterator<String> itKeys = jSONObject6.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                if (!jSONObject3.has(next)) {
                                    hashSet.add(next);
                                } else if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                                    hashSet.add(next);
                                } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                                    hashSet.add(next);
                                } else if (jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) {
                                    hashSet.add(next);
                                } else if (mapB.containsKey(next) != mapB2.containsKey(next)) {
                                    hashSet.add(next);
                                } else if (mapB.containsKey(next) && mapB2.containsKey(next) && !((Map) mapB.get(next)).equals(mapB2.get(next))) {
                                    hashSet.add(next);
                                } else {
                                    jSONObject5.remove(next);
                                }
                            }
                            Iterator<String> itKeys2 = jSONObject5.keys();
                            while (itKeys2.hasNext()) {
                                hashSet.add(itKeys2.next());
                            }
                            if (hashSet.isEmpty()) {
                                Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                                return b4.s(null);
                            }
                            ge.a aVar = new ge.a(hashSet);
                            synchronized (yi0Var2) {
                                Iterator it = ((LinkedHashSet) yi0Var2.f12623c).iterator();
                                while (it.hasNext()) {
                                    ((ge.b) it.next()).a(aVar);
                                }
                            }
                            return b4.s(null);
                        }
                    });
                }
                return;
        }
    }
}
