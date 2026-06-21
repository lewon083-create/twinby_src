package yads;

import android.content.Context;
import android.location.Location;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yy0 implements eh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jh1 f45191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f45192b;

    public /* synthetic */ yy0(Context context, String str) {
        this(new jh1(context, str));
    }

    @Override // yads.eh1
    public final Location a() {
        Location location;
        synchronized (this.f45192b) {
            try {
                jh1 jh1Var = this.f45191a;
                ih1 ih1VarA = jh1Var.f39869c;
                if (ih1VarA == null) {
                    ih1VarA = jh1Var.a();
                }
                if (ih1VarA != null) {
                    Object objA = qm2.a(ih1VarA.f39543a, "isComplete", new Object[0]);
                    Boolean bool = objA instanceof Boolean ? (Boolean) objA : null;
                    if (bool != null && bool.booleanValue()) {
                        Object objA2 = qm2.a(ih1VarA.f39543a, "getResult", new Object[0]);
                        location = objA2 instanceof Location ? (Location) objA2 : null;
                        jh1 jh1Var2 = this.f45191a;
                        jh1Var2.f39869c = jh1Var2.a();
                        jh1Var2.f39869c = jh1Var2.a();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return location;
    }

    public yy0(jh1 jh1Var) {
        this.f45191a = jh1Var;
        this.f45192b = new Object();
    }
}
