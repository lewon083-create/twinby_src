package yads;

import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f37299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij.g f37300b = ij.h.b(new b62(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f37301c = new ConcurrentHashMap();

    public c62(Context context) {
        this.f37299a = context.getApplicationContext();
    }

    public final void a(String str, ch3 ch3Var, String str2) {
        nj0 nj0Var = (nj0) this.f37300b.getValue();
        if (nj0Var == null) {
            ch3Var.b();
            a();
            return;
        }
        Uri uri = Uri.parse(str);
        o51 o51Var = r51.f42498c;
        qj0 qj0Var = new qj0(str2, uri, null, um2.f43723f, null, null, null);
        this.f37301c.put(str2, ch3Var);
        nj0Var.f41261b.add(new un3(str2, ch3Var));
        nj0Var.f41262c++;
        nj0Var.f41260a.obtainMessage(6, 0, 0, qj0Var).sendToTarget();
        if (nj0Var.f41263d) {
            nj0Var.f41263d = false;
            nj0Var.f41262c++;
            nj0Var.f41260a.obtainMessage(1, 0, 0).sendToTarget();
            boolean zA = nj0Var.a();
            Iterator it = nj0Var.f41261b.iterator();
            while (it.hasNext()) {
                ((lj0) it.next()).getClass();
            }
            if (zA) {
                Iterator it2 = nj0Var.f41261b.iterator();
                while (it2.hasNext()) {
                    ((lj0) it2.next()).getClass();
                }
            }
        }
    }

    public final void a() {
        Iterator it = this.f37301c.entrySet().iterator();
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getKey();
            nj0 nj0Var = (nj0) this.f37300b.getValue();
            if (nj0Var != null) {
                nj0Var.f41262c++;
                nj0Var.f41260a.obtainMessage(7, str).sendToTarget();
            }
        }
        this.f37301c.clear();
    }
}
