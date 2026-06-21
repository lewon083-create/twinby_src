package ka;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends cb.c implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f27317d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i, i iVar) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 0);
        this.f27316c = i;
        this.f27317d = iVar;
    }

    @Override // cb.c
    public final boolean E0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) cb.d.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) cb.d.a(parcel, Status.CREATOR);
                cb.d.b(parcel);
                n2(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) cb.d.a(parcel, Status.CREATOR);
                cb.d.b(parcel);
                G2(status2);
                break;
            case 103:
                Status status3 = (Status) cb.d.a(parcel, Status.CREATOR);
                cb.d.b(parcel);
                l2(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // ka.l
    public void G2(Status status) {
        switch (this.f27316c) {
            case 1:
                ((h) this.f27317d).G(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // ka.l
    public void l2(Status status) {
        switch (this.f27316c) {
            case 2:
                ((h) this.f27317d).G(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // ka.l
    public void n2(GoogleSignInAccount googleSignInAccount, Status status) {
        switch (this.f27316c) {
            case 0:
                g gVar = (g) this.f27317d;
                if (googleSignInAccount != null) {
                    k kVarT = k.T(gVar.f27318n);
                    GoogleSignInOptions googleSignInOptions = gVar.f27319o;
                    synchronized (kVarT) {
                        ((b) kVarT.f27324c).c(googleSignInAccount, googleSignInOptions);
                        kVarT.f27325d = googleSignInAccount;
                        kVarT.f27326e = googleSignInOptions;
                    }
                }
                gVar.G(new ja.c(googleSignInAccount, status));
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
