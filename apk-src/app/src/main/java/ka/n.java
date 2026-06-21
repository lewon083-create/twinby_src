package ka;

import a0.u;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import org.json.JSONException;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends cb.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevocationBoundService f27327c;

    public n(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 0);
        this.f27327c = revocationBoundService;
    }

    @Override // cb.c
    public final boolean E0(int i, Parcel parcel, Parcel parcel2) {
        String strE;
        RevocationBoundService revocationBoundService = this.f27327c;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            L1();
            k.T(revocationBoundService).U();
            return true;
        }
        L1();
        b bVarA = b.a(revocationBoundService);
        GoogleSignInAccount googleSignInAccountB = bVarA.b();
        GoogleSignInOptions googleSignInOptionsA = GoogleSignInOptions.f2599l;
        if (googleSignInAccountB != null) {
            String strE2 = bVarA.e("defaultGoogleSignInAccount");
            if (TextUtils.isEmpty(strE2) || (strE = bVarA.e(b.f("googleSignInOptions", strE2))) == null) {
                googleSignInOptionsA = null;
            } else {
                try {
                    googleSignInOptionsA = GoogleSignInOptions.a(strE);
                } catch (JSONException unused) {
                    googleSignInOptionsA = null;
                }
            }
        }
        GoogleSignInOptions googleSignInOptions = googleSignInOptionsA;
        c0.i(googleSignInOptions);
        ja.a aVar = new ja.a(revocationBoundService, null, ia.a.f21224a, googleSignInOptions, new na.e(new le.a(10), Looper.getMainLooper()));
        if (googleSignInAccountB != null) {
            aVar.g();
        } else {
            aVar.h();
        }
        return true;
    }

    public final void L1() {
        if (!ua.b.j(this.f27327c, Binder.getCallingUid())) {
            throw new SecurityException(u.k(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }
}
