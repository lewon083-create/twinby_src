package aa;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import ob.g4;
import ob.k2;
import ob.r1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f556f;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f552b = i;
        this.f553c = obj;
        this.f554d = obj2;
        this.f555e = obj3;
        this.f556f = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x04b3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1994
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.b.run():void");
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z5) {
        this.f552b = i;
        this.f556f = obj;
        this.f553c = obj2;
        this.f554d = obj3;
        this.f555e = obj4;
    }

    public /* synthetic */ b(r1 r1Var, Bundle bundle, String str, g4 g4Var) {
        this.f552b = 12;
        this.f553c = r1Var;
        this.f555e = bundle;
        this.f554d = str;
        this.f556f = g4Var;
    }

    public b(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.l0 l0Var, ob.v vVar, String str) {
        this.f552b = 11;
        this.f553c = l0Var;
        this.f555e = vVar;
        this.f554d = str;
        this.f556f = appMeasurementDynamiteService;
    }

    public b(m4.d dVar, String str, String str2, Bundle bundle) {
        this.f552b = 18;
        this.f554d = str;
        this.f553c = str2;
        this.f555e = bundle;
        this.f556f = dVar;
    }

    public b(k2 k2Var, AtomicReference atomicReference, String str, String str2) {
        this.f552b = 13;
        this.f553c = atomicReference;
        this.f554d = str;
        this.f555e = str2;
        Objects.requireNonNull(k2Var);
        this.f556f = k2Var;
    }
}
