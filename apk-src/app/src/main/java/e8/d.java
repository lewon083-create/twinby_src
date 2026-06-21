package e8;

import android.location.Location;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.tasks.Task;
import g8.f;
import g8.h;
import g8.p;
import hi.g;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import m.h3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements p, f8.a, sb.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16292f;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f16288b = obj;
        this.f16289c = obj2;
        this.f16290d = obj3;
        this.f16291e = obj4;
        this.f16292f = obj5;
    }

    @Override // g8.p
    public void a(Location location) {
        h3 h3Var = (h3) this.f16288b;
        boolean[] zArr = (boolean[]) this.f16289c;
        h hVar = (h) this.f16290d;
        String str = (String) this.f16291e;
        g gVar = (g) this.f16292f;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        ((CopyOnWriteArrayList) ((f) h3Var.f28252d).f20030c).remove(hVar);
        hVar.e();
        ((HashMap) h3Var.f28254f).remove(str);
        gVar.success(h5.F(location));
    }

    @Override // sb.a
    public Object g(Task task) {
        he.g gVar = (he.g) this.f16288b;
        Task task2 = (Task) this.f16289c;
        Task task3 = (Task) this.f16290d;
        Date date = (Date) this.f16291e;
        HashMap map = (HashMap) this.f16292f;
        if (!task2.isSuccessful()) {
            return b4.q(new ge.f("Firebase Installations failed to get installation ID for fetch.", task2.getException()));
        }
        if (!task3.isSuccessful()) {
            return b4.q(new ge.f("Firebase Installations failed to get installation auth token for fetch.", task3.getException()));
        }
        try {
            he.f fVarA = gVar.a((String) task2.getResult(), ((zd.a) task3.getResult()).f46244a, date, map);
            return fVarA.f20504a != 0 ? b4.s(fVarA) : gVar.f20512e.d(fVarA.f20505b).j(gVar.f20510c, new he.e(0, fVarA));
        } catch (ge.g e3) {
            return b4.q(e3);
        }
    }

    @Override // f8.a
    public void onError(int i) {
        h3 h3Var = (h3) this.f16288b;
        boolean[] zArr = (boolean[]) this.f16289c;
        h hVar = (h) this.f16290d;
        String str = (String) this.f16291e;
        g gVar = (g) this.f16292f;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        ((CopyOnWriteArrayList) ((f) h3Var.f28252d).f20030c).remove(hVar);
        hVar.e();
        ((HashMap) h3Var.f28254f).remove(str);
        gVar.b(om1.b(i), om1.a(i), null);
    }
}
