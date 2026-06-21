package bf;

import android.content.Context;
import android.util.Log;
import ii.o;
import ii.q;
import ii.x;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class m implements ei.b, o {
    public static String i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static h f2145m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f2146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f2147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f2137d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f2138e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f2139f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f2140g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f2141h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f2142j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f2143k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f2144l = 0;

    public static void a(m mVar, e eVar) {
        try {
            if (eVar.f2099d >= 1) {
                Log.d("Sqflite", eVar.i() + "closing database ");
            }
            eVar.b();
        } catch (Exception e3) {
            Log.e("Sqflite", "error " + e3 + " while closing database " + f2144l);
        }
        synchronized (f2139f) {
            try {
                if (f2138e.isEmpty() && f2145m != null) {
                    if (eVar.f2099d >= 1) {
                        Log.d("Sqflite", eVar.i() + "stopping thread");
                    }
                    f2145m.c();
                    f2145m = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static e b(ii.n nVar, hi.g gVar) {
        Integer num = (Integer) nVar.a("id");
        int iIntValue = num.intValue();
        e eVar = (e) f2138e.get(num);
        if (eVar != null) {
            return eVar;
        }
        gVar.b("sqlite_error", "database_closed " + iIntValue, null);
        return null;
    }

    public static HashMap c(int i10, boolean z5, boolean z10) {
        HashMap map = new HashMap();
        map.put("id", Integer.valueOf(i10));
        if (z5) {
            map.put("recovered", Boolean.TRUE);
        }
        if (z10) {
            map.put("recoveredInTransaction", Boolean.TRUE);
        }
        return map;
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a aVar) {
        Context context = aVar.f16381a;
        ii.f fVar = aVar.f16383c;
        this.f2146b = context;
        q qVar = new q(fVar, "com.tekartik.sqflite", x.f21321b, fVar.a());
        this.f2147c = qVar;
        qVar.b(this);
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a aVar) {
        this.f2146b = null;
        this.f2147c.b(null);
        this.f2147c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:215:0x0450  */
    @Override // ii.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMethodCall(final ii.n r17, ii.p r18) {
        /*
            Method dump skipped, instruction units count: 1508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.m.onMethodCall(ii.n, ii.p):void");
    }
}
