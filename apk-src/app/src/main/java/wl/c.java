package wl;

import com.google.android.gms.internal.ads.kv0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum c extends a0 {
    public c() {
        super("InTableText", 9);
    }

    @Override // wl.a0
    public final boolean c(kv0 kv0Var, b bVar) {
        if (t.z.m(kv0Var.f7316c) == 4) {
            f0 f0Var = (f0) kv0Var;
            if (f0Var.f35444d.equals(a0.f35354x)) {
                bVar.e(this);
                return false;
            }
            bVar.f35376q.add(f0Var.f35444d);
            return true;
        }
        if (bVar.f35376q.size() > 0) {
            for (String str : bVar.f35376q) {
                if (tl.a.c(str)) {
                    f0 f0Var2 = new f0();
                    f0Var2.f35444d = str;
                    bVar.o(f0Var2);
                } else {
                    bVar.e(this);
                    boolean zA = tl.a.a(bVar.d().o(), "table", "tbody", "tfoot", "thead", "tr");
                    a0 a0Var = a0.f35339h;
                    if (zA) {
                        bVar.f35379t = true;
                        f0 f0Var3 = new f0();
                        f0Var3.f35444d = str;
                        bVar.y(f0Var3, a0Var);
                        bVar.f35379t = false;
                    } else {
                        f0 f0Var4 = new f0();
                        f0Var4.f35444d = str;
                        bVar.y(f0Var4, a0Var);
                    }
                }
            }
            bVar.f35376q = new ArrayList();
        }
        bVar.f35370k = bVar.f35371l;
        return bVar.x(kv0Var);
    }
}
