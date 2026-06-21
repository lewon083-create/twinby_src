package pa;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends e implements na.c {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Set f31379z;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(Context context, Looper looper, int i, q9.o oVar, na.g gVar, na.h hVar, int i10) {
        p0 p0VarA = p0.a(context);
        ma.f fVar = ma.f.f28773d;
        c0.i(gVar);
        c0.i(hVar);
        super(context, looper, p0VarA, fVar, i, new m(gVar), new m(hVar), (String) oVar.f31949d);
        Set set = (Set) oVar.f31947b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f31379z = set;
    }

    @Override // pa.e
    public final Account g() {
        return null;
    }

    @Override // pa.e
    public final Executor j() {
        return null;
    }

    @Override // pa.e
    public final Set m() {
        return this.f31379z;
    }
}
