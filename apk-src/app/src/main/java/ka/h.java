package ka;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27320n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(na.i iVar, int i) {
        super(iVar);
        this.f27320n = i;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ na.l D(Status status) {
        int i = this.f27320n;
        return status;
    }

    @Override // ka.i
    public final void J(na.c cVar) {
        switch (this.f27320n) {
            case 0:
                e eVar = (e) cVar;
                m mVar = (m) eVar.n();
                f fVar = new f(1, this);
                GoogleSignInOptions googleSignInOptions = eVar.A;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(mVar.f2257d);
                int i = cb.d.f2260a;
                parcelObtain.writeStrongBinder(fVar);
                if (googleSignInOptions == null) {
                    parcelObtain.writeInt(0);
                } else {
                    parcelObtain.writeInt(1);
                    googleSignInOptions.writeToParcel(parcelObtain, 0);
                }
                mVar.c0(parcelObtain, 102);
                break;
            default:
                e eVar2 = (e) cVar;
                m mVar2 = (m) eVar2.n();
                f fVar2 = new f(2, this);
                GoogleSignInOptions googleSignInOptions2 = eVar2.A;
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(mVar2.f2257d);
                int i10 = cb.d.f2260a;
                parcelObtain2.writeStrongBinder(fVar2);
                if (googleSignInOptions2 == null) {
                    parcelObtain2.writeInt(0);
                } else {
                    parcelObtain2.writeInt(1);
                    googleSignInOptions2.writeToParcel(parcelObtain2, 0);
                }
                mVar2.c0(parcelObtain2, 103);
                break;
        }
    }
}
