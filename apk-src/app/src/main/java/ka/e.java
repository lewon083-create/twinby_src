package ka;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import oa.p;
import q9.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends pa.i {
    public final GoogleSignInOptions A;

    public e(Context context, Looper looper, o oVar, GoogleSignInOptions googleSignInOptions, p pVar, p pVar2) {
        super(context, looper, 91, oVar, pVar, pVar2, 0);
        Set<Scope> set = (Set) oVar.f31947b;
        ja.b bVar = googleSignInOptions != null ? new ja.b(googleSignInOptions) : new ja.b();
        byte[] bArr = new byte[16];
        cb.b.f2258a.nextBytes(bArr);
        bVar.i = Base64.encodeToString(bArr, 11);
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = bVar.f26583a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.A = bVar.a();
    }

    @Override // pa.e, na.c
    public final int b() {
        return 12451000;
    }

    @Override // pa.e
    public final IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new m(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 0);
    }

    @Override // pa.e
    public final String o() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // pa.e
    public final String p() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
