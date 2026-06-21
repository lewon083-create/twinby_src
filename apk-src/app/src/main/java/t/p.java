package t;

import android.content.Context;
import android.util.Log;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y.a f33204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0.f f33205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0.n0 f33206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u.p f33207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i1 f33208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f33209g;
    public final a0.e0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a0.u1 f33211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a0.w f33212k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f33210h = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f33213l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f33214m = new ArrayList();

    public p(Context context, g0.f fVar, a0.w wVar, long j10, a0.e0 e0Var, h3.e eVar) throws a0.t1 {
        this.f33203a = context;
        this.f33205c = fVar;
        u.p pVarA = u.p.a(context, fVar.f19560b);
        this.f33207e = pVarA;
        this.f33208f = i1.b(context);
        y.a aVar = new y.a(pVarA);
        this.f33204b = aVar;
        g0.n0 n0Var = new g0.n0(aVar);
        this.f33206d = n0Var;
        synchronized (aVar.f36291a) {
            aVar.f36293c.add(n0Var);
        }
        this.f33209g = j10;
        this.i = e0Var;
        this.f33212k = wVar;
        try {
            List listAsList = Arrays.asList(pVarA.c());
            this.f33211j = new a0.u1(listAsList, pVarA, fVar.f19559a);
            e(listAsList);
        } catch (u.a e3) {
            throw new a0.t1(new a0.x(e3));
        }
    }

    public final LinkedHashSet a() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f33213l) {
            linkedHashSet = new LinkedHashSet(this.f33214m);
        }
        return linkedHashSet;
    }

    public final ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.equals(CommonUrlParts.Values.FALSE_INTEGER) || str.equals("1")) {
                arrayList2.add(str);
            } else if (i0.o.z(str, this.f33207e)) {
                arrayList2.add(str);
            } else {
                com.google.android.gms.internal.auth.g.e("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList2;
    }

    public final c0 c(String str) throws a0.x {
        synchronized (this.f33213l) {
            if (!this.f33214m.contains(str)) {
                throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
            }
        }
        Context context = this.f33203a;
        u.p pVar = this.f33207e;
        d0 d0VarD = d(str);
        y.a aVar = this.f33204b;
        g0.n0 n0Var = this.f33206d;
        g0.f fVar = this.f33205c;
        return new c0(context, pVar, str, d0VarD, aVar, n0Var, fVar.f19559a, fVar.f19560b, this.f33208f, this.f33209g, this.i);
    }

    public final d0 d(String str) throws a0.x {
        HashMap map = this.f33210h;
        try {
            d0 d0Var = (d0) map.get(str);
            if (d0Var != null) {
                return d0Var;
            }
            d0 d0Var2 = new d0(str, this.f33207e);
            map.put(str, d0Var2);
            return d0Var2;
        } catch (u.a e3) {
            throw new a0.x(e3);
        }
    }

    public final void e(List list) throws a0.t1 {
        try {
            ArrayList arrayListB = b(j0.g.N(this, this.f33212k, new ArrayList(list)));
            synchronized (this.f33213l) {
                try {
                    if (this.f33214m.equals(arrayListB)) {
                        return;
                    }
                    com.google.android.gms.internal.auth.g.e("Camera2CameraFactory", "Updated available camera list: " + this.f33214m + " -> " + arrayListB);
                    this.f33214m = arrayListB;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (a0.t1 e3) {
            Log.e("Camera2CameraFactory", "Unable to get backward compatible camera ids", e3);
            throw e3;
        }
    }
}
