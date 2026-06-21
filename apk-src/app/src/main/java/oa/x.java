package oa;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.ads.i0;
import com.google.android.gms.internal.ads.kw0;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends qb.c implements na.g, na.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final bb.f f29897j = pb.b.f31455a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f29898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f29899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bb.f f29900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f29901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q9.o f29902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public qb.a f29903h;
    public i0 i;

    public x(Context context, kw0 kw0Var, q9.o oVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 3);
        this.f29898c = context;
        this.f29899d = kw0Var;
        this.f29902g = oVar;
        this.f29901f = (Set) oVar.f31946a;
        this.f29900e = f29897j;
    }

    @Override // na.h
    public final void c0(ma.b bVar) {
        this.i.f(bVar);
    }

    @Override // na.g
    public final void l0(int i) {
        i0 i0Var = this.i;
        p pVar = (p) ((e) i0Var.f6317g).f29845k.get((a) i0Var.f6314d);
        if (pVar != null) {
            if (pVar.f29877j) {
                pVar.j(new ma.b(17, null, null));
            } else {
                pVar.l0(i);
            }
        }
    }

    @Override // na.g
    public final void n0() {
        qb.a aVar = this.f29903h;
        aVar.getClass();
        boolean z5 = false;
        try {
            aVar.B.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccountB = "<<default account>>".equals(account.name) ? ka.b.a(aVar.f31329c).b() : null;
            Integer num = aVar.D;
            pa.c0.i(num);
            pa.v vVar = new pa.v(2, account, num.intValue(), googleSignInAccountB);
            qb.d dVar = (qb.d) aVar.n();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(dVar.f2257d);
            int i = db.a.f15734a;
            parcelObtain.writeInt(1);
            int iI0 = j0.g.i0(parcelObtain, 20293);
            j0.g.h0(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            j0.g.a0(parcelObtain, 2, vVar, 0);
            j0.g.m0(parcelObtain, iI0);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                dVar.f2256c.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e3) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f29899d.post(new k0.i(18, this, new qb.f(1, new ma.b(8, null, null), null), z5));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e3);
            }
        }
    }
}
