package ob;

import android.app.Activity;
import android.os.Bundle;
import android.os.DeadObjectException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f30341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f30342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f30343f;

    public /* synthetic */ p1(d8.e eVar, yi.f0 f0Var, Activity activity, d8.y yVar) {
        this.f30339b = 4;
        this.f30340c = eVar;
        this.f30341d = f0Var;
        this.f30342e = activity;
        this.f30343f = yVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        com.google.android.gms.internal.play_billing.d dVar;
        switch (this.f30339b) {
            case 0:
                r1 r1Var = (r1) this.f30343f;
                r1Var.f30382b.B();
                n nVar = r1Var.f30382b.f30607d;
                z3.T(nVar);
                return nVar.y0((String) this.f30340c, (String) this.f30341d, (String) this.f30342e);
            case 1:
                r1 r1Var2 = (r1) this.f30343f;
                r1Var2.f30382b.B();
                n nVar2 = r1Var2.f30382b.f30607d;
                z3.T(nVar2);
                return nVar2.y0((String) this.f30340c, (String) this.f30341d, (String) this.f30342e);
            case 2:
                r1 r1Var3 = (r1) this.f30343f;
                r1Var3.f30382b.B();
                n nVar3 = r1Var3.f30382b.f30607d;
                z3.T(nVar3);
                return nVar3.C0((String) this.f30340c, (String) this.f30341d, (String) this.f30342e);
            case 3:
                r1 r1Var4 = (r1) this.f30343f;
                r1Var4.f30382b.B();
                n nVar4 = r1Var4.f30382b.f30607d;
                z3.T(nVar4);
                return nVar4.C0((String) this.f30340c, (String) this.f30341d, (String) this.f30342e);
            default:
                d8.e eVar = (d8.e) this.f30340c;
                yi.f0 f0Var = (yi.f0) this.f30341d;
                Activity activity = (Activity) this.f30342e;
                d8.y yVar = (d8.y) this.f30343f;
                try {
                    synchronized (eVar.f15594a) {
                        dVar = eVar.f15601h;
                        break;
                    }
                    if (dVar == null) {
                        eVar.G(f0Var, d8.n0.f15669k, 119, null);
                    } else {
                        String packageName = eVar.f15599f.getPackageName();
                        String str = eVar.f15596c;
                        long jLongValue = eVar.E.longValue();
                        int i = com.google.android.gms.internal.play_billing.o1.f14257a;
                        Bundle bundle = new Bundle();
                        com.google.android.gms.internal.play_billing.o1.b(bundle, str, jLongValue);
                        ((com.google.android.gms.internal.play_billing.b) dVar).r4(packageName, bundle, new d8.b0(new WeakReference(activity), yVar));
                    }
                } catch (DeadObjectException e3) {
                    eVar.G(f0Var, d8.n0.f15669k, 74, e3);
                } catch (Exception e7) {
                    eVar.G(f0Var, d8.n0.i, 74, e7);
                }
                return null;
        }
    }

    public /* synthetic */ p1(r1 r1Var, String str, String str2, String str3, int i) {
        this.f30339b = i;
        this.f30340c = str;
        this.f30341d = str2;
        this.f30342e = str3;
        this.f30343f = r1Var;
    }
}
