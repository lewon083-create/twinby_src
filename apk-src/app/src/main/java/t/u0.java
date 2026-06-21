package t;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements g0.l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f33297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f33298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f33299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u.p f33300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f33301e;

    public u0(Context context, Object obj, LinkedHashSet linkedHashSet) throws a0.x {
        t0 t0Var = new t0(0);
        this.f33297a = new Object();
        this.f33298b = new HashMap();
        this.f33299c = t0Var;
        this.f33301e = context;
        if (obj instanceof u.p) {
            this.f33300d = (u.p) obj;
        } else {
            this.f33300d = u.p.a(context, i0.o.x());
        }
        try {
            a(new ArrayList(linkedHashSet));
        } catch (g0.o0 e3) {
            if (!(e3.getCause() instanceof a0.x)) {
                throw new a0.x(e3);
            }
            throw ((a0.x) e3.getCause());
        }
    }

    @Override // g0.l1
    public final void a(List list) throws g0.o0 {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.f33297a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.f33298b.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, b(str));
            }
            synchronized (this.f33297a) {
                try {
                    HashMap map2 = new HashMap();
                    for (String str2 : (ArrayList) list) {
                        if (this.f33298b.containsKey(str2)) {
                            map2.put(str2, (d2) this.f33298b.get(str2));
                        } else {
                            map2.put(str2, (d2) map.get(str2));
                        }
                    }
                    this.f33298b.clear();
                    this.f33298b.putAll(map2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (a0.x | RuntimeException e3) {
            throw new g0.o0("Failed to create SupportedSurfaceCombination", e3);
        }
    }

    public final d2 b(String str) {
        return new d2(this.f33301e, str, this.f33300d, this.f33299c, Build.VERSION.SDK_INT >= 35 ? new s.f(this.f33301e, str, this.f33300d) : c0.b.f2178w1);
    }
}
