package x7;

import a0.i0;
import g0.b1;
import g0.c1;
import java.util.ArrayList;
import java.util.HashMap;
import v7.i;
import v8.d;
import y8.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a, b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f35977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f35978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f35979d;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3) {
        this.f35977b = obj;
        this.f35978c = obj2;
        this.f35979d = obj3;
    }

    public j a() {
        String strConcat = ((String) this.f35977b) == null ? " backendName" : "";
        if (((d) this.f35979d) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new j((String) this.f35977b, (byte[]) this.f35978c, (d) this.f35979d);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public void b(Runnable runnable) {
        ((i) this.f35977b).execute(runnable);
    }

    public c1 c(int i) {
        b1 b1Var = (b1) this.f35977b;
        HashMap map = (HashMap) this.f35979d;
        if (map.containsKey(Integer.valueOf(i))) {
            return (c1) map.get(Integer.valueOf(i));
        }
        g0.i iVarE = null;
        if (b1Var.k(i)) {
            c1 c1VarU = b1Var.u(i);
            i0 i0Var = (i0) this.f35978c;
            if (c1VarU != null) {
                ArrayList arrayList = new ArrayList();
                for (g0.j jVar : c1VarU.d()) {
                    if (f1.b.a(jVar, i0Var)) {
                        arrayList.add(jVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    iVarE = g0.i.e(c1VarU.a(), c1VarU.b(), c1VarU.c(), arrayList);
                }
            }
            map.put(Integer.valueOf(i), iVarE);
        }
        return iVarE;
    }

    public void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f35977b = str;
    }

    @Override // g0.b1
    public boolean k(int i) {
        return ((b1) this.f35977b).k(i) && c(i) != null;
    }

    @Override // g0.b1
    public c1 u(int i) {
        return c(i);
    }

    public b(b1 b1Var, i0 i0Var) {
        this.f35979d = new HashMap();
        this.f35977b = b1Var;
        this.f35978c = i0Var;
    }
}
