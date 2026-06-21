package ka;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import oa.r;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f27318n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ GoogleSignInOptions f27319o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r rVar, Context context, GoogleSignInOptions googleSignInOptions) {
        super(rVar);
        this.f27318n = context;
        this.f27319o = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ na.l D(Status status) {
        return new ja.c(null, status);
    }

    @Override // ka.i
    public final void J(na.c cVar) {
        m mVar = (m) ((e) cVar).n();
        f fVar = new f(0, this);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(mVar.f2257d);
        int i = cb.d.f2260a;
        parcelObtain.writeStrongBinder(fVar);
        GoogleSignInOptions googleSignInOptions = this.f27319o;
        if (googleSignInOptions == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            googleSignInOptions.writeToParcel(parcelObtain, 0);
        }
        mVar.c0(parcelObtain, 101);
    }
}
