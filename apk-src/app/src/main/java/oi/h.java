package oi;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.m1;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.x0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f30684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f30685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sb.g f30686e;

    public /* synthetic */ h(Map map, j jVar, sb.g gVar, int i) {
        this.f30683b = i;
        this.f30684c = map;
        this.f30685d = jVar;
        this.f30686e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30683b) {
            case 0:
                j jVar = this.f30685d;
                Map map = this.f30684c;
                sb.g gVar = this.f30686e;
                try {
                    FirebaseAnalytics firebaseAnalytics = jVar.f30690b;
                    if (firebaseAnalytics == null) {
                        Intrinsics.g("analytics");
                        throw null;
                    }
                    Bundle bundleA = j.a(map);
                    if (bundleA != null) {
                        bundleA = new Bundle(bundleA);
                    }
                    m1 m1Var = firebaseAnalytics.f14753a;
                    m1Var.getClass();
                    m1Var.c(new x0(m1Var, bundleA, 2));
                    gVar.b(null);
                    return;
                } catch (Exception e3) {
                    gVar.a(e3);
                    return;
                }
            case 1:
                Map map2 = this.f30684c;
                j jVar2 = this.f30685d;
                sb.g gVar2 = this.f30686e;
                try {
                    Boolean bool = (Boolean) map2.get("adStorageConsentGranted");
                    Boolean bool2 = (Boolean) map2.get("analyticsStorageConsentGranted");
                    Boolean bool3 = (Boolean) map2.get("adPersonalizationSignalsConsentGranted");
                    Boolean bool4 = (Boolean) map2.get("adUserDataConsentGranted");
                    HashMap map3 = new HashMap();
                    id.a aVar = id.a.f21291c;
                    id.a aVar2 = id.a.f21290b;
                    if (bool != null) {
                        map3.put(id.b.f21293b, bool.booleanValue() ? aVar2 : aVar);
                    }
                    if (bool2 != null) {
                        map3.put(id.b.f21294c, bool2.booleanValue() ? aVar2 : aVar);
                    }
                    if (bool3 != null) {
                        map3.put(id.b.f21296e, bool3.booleanValue() ? aVar2 : aVar);
                    }
                    if (bool4 != null) {
                        id.b bVar = id.b.f21295d;
                        if (bool4.booleanValue()) {
                            aVar = aVar2;
                        }
                        map3.put(bVar, aVar);
                    }
                    FirebaseAnalytics firebaseAnalytics2 = jVar2.f30690b;
                    if (firebaseAnalytics2 == null) {
                        Intrinsics.g("analytics");
                        throw null;
                    }
                    firebaseAnalytics2.a(map3);
                    gVar2.b(null);
                    return;
                } catch (Exception e7) {
                    gVar2.a(e7);
                    return;
                }
            default:
                Map map4 = this.f30684c;
                j jVar3 = this.f30685d;
                sb.g gVar3 = this.f30686e;
                try {
                    Object obj = map4.get("eventName");
                    Objects.requireNonNull(obj);
                    String str = (String) obj;
                    Map map5 = (Map) map4.get("parameters");
                    jVar3.getClass();
                    Bundle bundleA2 = j.a(map5);
                    FirebaseAnalytics firebaseAnalytics3 = jVar3.f30690b;
                    if (firebaseAnalytics3 == null) {
                        Intrinsics.g("analytics");
                        throw null;
                    }
                    m1 m1Var2 = firebaseAnalytics3.f14753a;
                    m1Var2.getClass();
                    m1Var2.c(new w0(m1Var2, (String) null, str, bundleA2, false));
                    gVar3.b(null);
                    return;
                } catch (Exception e10) {
                    gVar3.a(e10);
                    return;
                }
        }
    }

    public /* synthetic */ h(j jVar, Map map, sb.g gVar) {
        this.f30683b = 0;
        this.f30685d = jVar;
        this.f30684c = map;
        this.f30686e = gVar;
    }
}
