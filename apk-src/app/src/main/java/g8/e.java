package g8;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.os.Looper;
import android.os.WorkSource;
import com.google.android.gms.internal.play_billing.w;
import com.google.android.gms.location.LocationRequest;
import fh.of;
import fj.b0;
import java.security.SecureRandom;
import java.util.ArrayList;
import pa.c0;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f20021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gb.a f20022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f20023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f20025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f8.a f20026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p f20027h;

    public e(Context context, k kVar) {
        int iNextInt;
        this.f20020a = context;
        int i = kb.d.f27332a;
        this.f20022c = new gb.a(context, null, gb.a.f20065m, na.b.V1, na.e.f29187c);
        this.f20025f = kVar;
        this.f20023d = new o(context, kVar);
        synchronized (this) {
            iNextInt = new SecureRandom().nextInt(65536);
        }
        this.f20024e = iNextInt;
        this.f20021b = new d(this, kVar, context);
    }

    public static LocationRequest g(k kVar) {
        float f10;
        long j10;
        long jMin;
        long j11;
        long j12;
        int i = 102;
        if (Build.VERSION.SDK_INT < 33) {
            LocationRequest locationRequestC = LocationRequest.c();
            if (kVar == null) {
                return locationRequestC;
            }
            long j13 = kVar.f20044c;
            int iM = z.m(kVar.f20042a);
            int i10 = iM != 0 ? iM != 1 ? iM != 2 ? 100 : 102 : 104 : 105;
            kb.l.a(i10);
            locationRequestC.f14400b = i10;
            locationRequestC.f(j13);
            long j14 = j13 / 2;
            c0.c(j14 >= 0, "illegal fastest interval: %d", Long.valueOf(j14));
            locationRequestC.f14402d = j14;
            float f11 = kVar.f20043b;
            if (f11 >= 0.0f) {
                locationRequestC.f14406h = f11;
                return locationRequestC;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(f11).length() + 22);
            sb2.append("invalid displacement: ");
            sb2.append(f11);
            throw new IllegalArgumentException(sb2.toString());
        }
        c0.a("intervalMillis must be greater than or equal to 0", 0 >= 0);
        if (kVar != null) {
            j10 = kVar.f20044c;
            int iM2 = z.m(kVar.f20042a);
            int i11 = iM2 != 0 ? iM2 != 1 ? iM2 != 2 ? 100 : 102 : 104 : 105;
            kb.l.a(i11);
            c0.a("intervalMillis must be greater than or equal to 0", j10 >= 0);
            c0.a("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", j10 == -1 || j10 >= 0);
            float f12 = kVar.f20043b;
            c0.a("minUpdateDistanceMeters must be greater than or equal to 0", f12 >= 0.0f);
            f10 = f12;
            jMin = j10;
            j11 = -1;
            i = i11;
        } else {
            f10 = 0.0f;
            j10 = 0;
            jMin = -1;
            j11 = -1;
        }
        if (jMin == j11) {
            j12 = j10;
        } else {
            if (i != 105) {
                jMin = Math.min(jMin, j10);
            }
            j12 = jMin;
        }
        return new LocationRequest(i, j10, j12, Math.max(0L, j10), Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, f10, true, j11 == j11 ? j10 : j11, 0, 0, false, new WorkSource(null), null);
    }

    @Override // g8.h
    public final void a(e8.e eVar, e8.e eVar2) {
        gb.a aVar = this.f20022c;
        aVar.getClass();
        ac.h hVarA = w.a();
        hVarA.f753d = of.f18034b;
        hVarA.f752c = 2414;
        sb.m mVarE = aVar.e(0, hVarA.a());
        b0 b0Var = new b0(26, eVar);
        mVarE.getClass();
        mVarE.d(sb.h.f32859a, b0Var);
        mVarE.k(new b0(27, eVar2));
    }

    @Override // g8.h
    public final void c(Activity activity, p pVar, f8.a aVar) {
        this.f20027h = pVar;
        this.f20026g = aVar;
        LocationRequest locationRequestG = g(this.f20025f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(locationRequestG);
        kb.e eVar = new kb.e(arrayList, false, false);
        int i = kb.d.f27332a;
        gb.a aVar2 = new gb.a(this.f20020a, null, gb.a.f20065m, na.b.V1, na.e.f29187c);
        ac.h hVarA = w.a();
        hVarA.f753d = new fe.c(14, eVar);
        hVarA.f752c = 2426;
        sb.m mVarE = aVar2.e(0, hVarA.a());
        b0 b0Var = new b0(25, this);
        mVarE.getClass();
        mVarE.d(sb.h.f32859a, b0Var);
        mVarE.k(new com.google.firebase.messaging.o(this, activity, aVar, 6));
    }

    @Override // g8.h
    public final boolean d(int i, int i10) {
        if (i == this.f20024e) {
            if (i10 == -1) {
                k kVar = this.f20025f;
                if (kVar != null && this.f20027h != null && this.f20026g != null) {
                    h(kVar);
                    return true;
                }
            } else {
                f8.a aVar = this.f20026g;
                if (aVar != null) {
                    aVar.onError(3);
                }
            }
        }
        return false;
    }

    @Override // g8.h
    public final void e() {
        o oVar = this.f20023d;
        LocationManager locationManager = oVar.f20051b;
        if (oVar.f20052c != null && locationManager != null) {
            locationManager.removeNmeaListener(oVar.f20053d);
            locationManager.unregisterGnssStatusCallback(oVar.f20054e);
            oVar.f20058j = false;
        }
        this.f20022c.f(this.f20021b);
    }

    @Override // g8.h
    public final void f(b bVar) {
        int i = kb.d.f27332a;
        gb.a aVar = new gb.a(this.f20020a, null, gb.a.f20065m, na.b.V1, na.e.f29187c);
        kb.e eVar = new kb.e(new ArrayList(), false, false);
        ac.h hVarA = w.a();
        hVarA.f753d = new fe.c(14, eVar);
        hVarA.f752c = 2426;
        aVar.e(0, hVarA.a()).addOnCompleteListener(new b0(24, bVar));
    }

    public final void h(k kVar) {
        LocationRequest locationRequestG = g(kVar);
        this.f20023d.b();
        this.f20022c.g(locationRequestG, this.f20021b, Looper.getMainLooper());
    }
}
