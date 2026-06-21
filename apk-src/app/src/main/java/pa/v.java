package pa;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends qa.a {
    public static final Parcelable.Creator<v> CREATOR = new kb.i(27);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Account f31439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GoogleSignInAccount f31441e;

    public v(int i, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f31438b = i;
        this.f31439c = account;
        this.f31440d = i10;
        this.f31441e = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f31438b);
        j0.g.a0(parcel, 2, this.f31439c, i);
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(this.f31440d);
        j0.g.a0(parcel, 4, this.f31441e, i);
        j0.g.m0(parcel, iI0);
    }
}
